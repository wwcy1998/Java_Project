package demo02;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
Scanner类的功能：可以实现键盘输入数据到程序当中
引用类型的一般使用步骤：
1.导包
import 包路径.类名称；
如果需要使用的目标类，和当前的类属于t同一个包下，则可以省略包语句不写。
只有java.lang包下的内容不需要导入，其他的包需要import语句。
2.创建
类名称 对象名 = new 类名称（）；
3.使用
对象名.成员方法名（）
获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：int num = sc.next();


 */
public class demo01 {
    public static void main(String[] args) {
        //2.创建
        //从键盘读入
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("输入的int数字："+num);


        String str = sc.next();
        System.out.println("输入的字符串是："+str);
    }

}
