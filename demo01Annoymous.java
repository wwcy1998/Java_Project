package demo02;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class demo01Annoymous {
    public static void main(String[] args) {
        //普通方式
       // Scanner sc  = new Scanner(System.in)
       //         int num =sc.nextInt();

        //匿名对象的方式
       //     int num = new Scanner(System.in).nextInt();
      //  System.out.println("输入的是："+num);

    //使用一般写法传入参数
       // Scanner sc  = new Scanner(System.in );
     //   methodParam(sc);

        //使用匿名对象进行传参
      //  methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public  static void methodParam(Scanner sc){
            int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
