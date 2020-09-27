package main.java.com.bjpowernode;

public class HellloMaven {
    public static void main(String[] args) {
        HellloMaven hellloMaven = new HellloMaven();
        int res = hellloMaven.add(10,20);
        System.out.println("10+20=" + res);



        //熟练git操作
        System.out.println("更新1");
        System.out.println("创建分支");
    }
    public int add(int a, int b) {
        return  a + b;
    }
}
