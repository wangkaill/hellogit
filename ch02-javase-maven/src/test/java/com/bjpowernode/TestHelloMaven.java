package com.bjpowernode;

import main.java.com.bjpowernode.HellloMaven;
import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAdd() {
        System.out.println("11111����add����");
        HellloMaven hellloMaven = new HellloMaven();
        int res = hellloMaven.add(10,20);
        //�жϽ���Ƿ���ȷ
        Assert.assertEquals(30,res);
    }

    @Test
    public void testAdd2() {
        System.out.println("22222����add����");
        HellloMaven hellloMaven = new HellloMaven();
        int res = hellloMaven.add(10,20);
        //�жϽ���Ƿ���ȷ
        Assert.assertEquals(30,res);
    }
}
