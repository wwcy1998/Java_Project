package demo01;

public class demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("鹿晗");
        stu1.setAge(21);
        System.out.println("姓名："+stu1.getName() +"，年龄："+stu1.getAge());
        System.out.println("==================");
        Student stu2 = new Student("鹿晗", 21);
        System.out.println("姓名："+stu2.getName() +"，年龄："+stu2.getAge());
        stu2.setAge(22);
        System.out.println("姓名："+stu2.getName() +"，年龄："+stu2.getAge());

    }
}
