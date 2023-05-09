// default constructor is implicitly called
// child class must invoke a custom constructor if necessary using super()
// this() is used to invoke constructors in same class that often makes code dry
// constructors are called from parent to child
// super() and this() can only be the first statements
// constructors, static and private fields and behaviours are not inherited
// final methods are inherited but cannot be overridden

public class ConstructorsAndInheritance {

    private double b;

    // Constructor chaining can make code more flexible and promote DRy
    ConstructorsAndInheritance(){
        //calls parameterized constructor
        this(0);
        System.out.println("ConstructorsAndInheritance default constructor");
    }
    ConstructorsAndInheritance(double b){
        this.b = b;
        System.out.println("ConstructorsAndInheritance parameterized constructor");
    }


    void A(){

        System.out.println("Parent class method A ConstructorsAndInheritance");

    }



}
