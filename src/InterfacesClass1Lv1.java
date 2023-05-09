
// Class must provide implementation for abstract methods or declare itself abstract
public class InterfacesClass1Lv1 implements Interfaces1, Interfaces2{
    //If both interfaces contain a same signature abstract method then class that implements these interfaces needs to provide only one implementation to fulfil the contract
    public void move(){
        System.out.println("I am InterfaceClass1Lv1 and I move in a circle");
    }
}
