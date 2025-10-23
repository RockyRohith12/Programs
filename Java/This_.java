class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name:" +name+ " Age:" +age);
    }
}

public class This_{
    public static void main(String[] args){
        Student obj = new Student("Rocky", 12);
        obj.display();
    }
}