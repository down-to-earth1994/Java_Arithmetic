package com.hyf.tool.guava;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author : heyanfeng
 * create at:  2020-06-07  22:03
 * @description:
 */
@Component
public class IoTest {
    /**
    * description: 拷贝文件
    * create by heyanfeng at 2020-06-07 22:15
    */
    public void copyFile(String soure,String target) throws IOException {
        /**
         * 创建对应的Source 和 Sink
        */
        CharSource charSource = Files.asCharSource(new File(soure), Charsets.UTF_8);
        CharSink charSink = Files.asCharSink(new File(target), Charsets.UTF_8);
        /**
         * 拷贝
         */
         charSource.copyTo(charSink);
    }

}
