package demo02;

public class demo02Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();

        System.out.println("====================");
        //匿名对象
        new Person().name="赵又廷";
        
    }
}
