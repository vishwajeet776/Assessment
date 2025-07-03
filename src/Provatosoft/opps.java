package Provatosoft;
class student{

    private String name;
    int age=0;

//    student(String name) {
//        this.name = name;
//    }
    student s3=new student();
//    s3.name="liubiyb";

    public String getName() {
        return name;
    }
    public static void add(){
        student s2=new student();
        System.out.println(s2.name);
    }

//    public void setName(String name) {
//        this.name = name;
//    }


}
public class opps {

    public static void main(String[] args) {

        student s1=new student();
        student.add();
        System.out.println(s1.getName());
        System.out.println();
        s1.age=45;

    }
}
