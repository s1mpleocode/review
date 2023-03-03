package com.off.se001.se002;

/**
 * @author Dreamcoding
 * @Description
 * @create 2023-03-03 15:08
 */
public class Son extends Father{
    private int i = test();
    private static int j = method();
    static {
        System.out.println("(6)");
    }
    Son(){
        System.out.println("(7)");
    }

    {
        System.out.println("(8)");
    }

    public int test(){
        System.out.println("(9)");
        return 1;
    }

    public static int method() {
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println();
        Son son1 = new Son();
    }


}

class Father{
    private int i = test();
    private static int j = method();
    static {
        System.out.println("(1)");
    }

    Father(){
        System.out.println("(2)");
    }

    {
        System.out.println("(3)");
    }


    public int test(){
        System.out.println("(4)");
        return 1;
    }

    public static int method() {
        System.out.println("(5)");
        return 1;
    }
}
