
// Interface vs Abstract Classes
// Interface data members are by default public, static and final
// Interfaces do not have constructors while Abstract classes have
// Interface represent a capability while Abstract class represents a type from which other class inherit from
// Interfaces do not have constructors as they are purely abstract
// Remember interfaces are not a is-a-type-of relationship like in Abstract classes
// A class can implement multiple interfaces but a class cannot extend multiple classes
// Interfaces extend other interfaces
//However, if multiple interfaces being implemented contain a method with the same name but with a different return type, the class will receive an error when attempting to implement them, indicating that there is a clash.

//Data members are by default public, static and final
//Methods are implicitly public and abstract-no need of Abstract keyword



// Methods allowed in an interface
//Default
//Static
//Public

public interface Interfaces1 {

    // fields are by default Public, static and final so IDE shows its redundant
    public static final int MYVAR = 1;


    // methods are by implicitly abstract and public  so IDE shows its redundant
    public abstract  void move();

    // default method
    default void  newlyAdded(){
        System.out.println("Default method was introduced so that it does not break the already existing contracts, if there is no better default implementation then it may be better to keep the method as abstract ");
    }

    //static methods

    // private static methods also allowed XD
    private static void interfaceMethodPrivate(){

        System.out.println("Private Static Method in Interface");


    }

    static void interfaceMethodPublic(){

        System.out.println("Public Static Method in Interface");


    }


}
