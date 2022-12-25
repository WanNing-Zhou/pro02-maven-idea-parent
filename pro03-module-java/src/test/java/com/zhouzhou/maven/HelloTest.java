package com.zhouzhou.maven;

import org.junit.Test;

/**
 * @author 周万宁
 * @className HelloTest
 * @create 2022/12/26-1:28
 * @description hello测试类
 */
public class HelloTest {
    @Test
    public  void testHello(){
        hello hello = new hello();
        hello.showMessage();
    }
}
