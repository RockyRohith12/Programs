public class MultilevelInheritanceExample {
    public static void main(String[]args){
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
    
}

//Parent class 
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}

//Intermediate class(Child of Animal, Parent Puppy)
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}

// Child class(Grandchild of Animal)
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy can weep");
    }
}