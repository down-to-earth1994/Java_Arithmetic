package lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author : heyanfeng
 * create at:  2020-03-07  22:35
 * @description:
 */
public class ReadWriteLockTest {
    public static void main(String[] args) throws InterruptedException {
        final MyReadWriteLock rwLock = new MyReadWriteLock();
        // 创建读锁 r1 和 r2
        Thread r1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rwLock.read();
            }
        }, "r1");
        Thread r2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rwLock.read();
            }
        }, "r2");
        r1.start();
        r2.start();
        // 等待同时读取线程执行完成
        r1.join();
        r2.join();
        // 开启写锁的操作
        new Thread(new Runnable() {
            @Override
            public void run() {
                rwLock.write();
            }
        }, "w1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                rwLock.write();
            }
        }, "w2").start();
    }
    static class MyReadWriteLock {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        public void read() {
            try {
                lock.readLock().lock();
                System.out.println("读操作，进入 | 线程：" + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("读操作，退出 | 线程：" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.readLock().unlock();
            }
        }
        public void write() {
            try {
                lock.writeLock().lock();
                System.out.println("写操作，进入 | 线程：" + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("写操作，退出 | 线程：" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.writeLock().unlock();
            }
        }
    }
}
