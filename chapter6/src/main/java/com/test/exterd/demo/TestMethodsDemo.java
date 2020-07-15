package com.test.exterd.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
      int z=1;
      int s=2;
      if(z!=s){
          Reporter.log("两个数值不相等");
          throw new RuntimeException("运行时异常");
      }
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们写的日志");
        throw  new RuntimeException("这是我自己的运行时异常");
    }
}
