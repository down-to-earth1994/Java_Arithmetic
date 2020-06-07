package com.hyf.tool;


import com.hyf.tool.guava.IoTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IoTestTest {
    @Autowired
    private IoTest ioTest;

    @Test
    public void copyFile() throws IOException {
        ioTest.copyFile("source.text","target.text");
    }
}
