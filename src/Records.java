
// Records data members are final and private by default, hence no setters are autogenerated
// Implicitaly final and cannot be subclasses
// Getters are autogenerated
// More methods can be added
// Set the state of the object once and use everywhere.
// Private data members
public record Records(int intRecord, String stringRecord, double doubleRecord ) {


    //additional Method
    void myExtensionMethod(){
        System.out.println("Extension method of a Record");
    }

}