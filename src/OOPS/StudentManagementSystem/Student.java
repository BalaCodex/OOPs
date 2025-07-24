package OOPS.StudentManagementSystem;

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    Student(int id,String name,int age,String course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public void setId(int n){
        id=n;
    }
    public int getId(){
        return id;
    }
    public void setName(String s){
        name=s;
    }
    public String getName(){
        return name;
    }
    public void setAge(int n){
        age=n;
    }
    public int getAge(){
        return age;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getCourse(){
        return course;
    }
    public void display(){
        System.out.println("Name: " + getName() +
                ", Id: " + getId() +
                ", Age: " + getAge() +
                ", Course: " + getCourse());
    }
}
