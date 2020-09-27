package com.bjpowernode;

public class HellloMaven {
    public static void main(String[] args) {
        HellloMaven hellloMaven = new HellloMaven();
        int res = hellloMaven.add(10,20);
        System.out.println("10+20=" + res);



        //熟练git操作
        System.out.println("更新1");
        System.out.println("创建分支");
        System.out.println("重新创建分支");
        System.out.println("主干添加");
    }
    public int add(int a, int b) {
        return  a + b;
    }
}
