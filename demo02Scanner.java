package demo02;

import java.util.Scanner;

/*
题目：键盘输入2个int数字，并且求和
 */
public class demo02Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a =sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("两数之和为："+result);


    }
}
