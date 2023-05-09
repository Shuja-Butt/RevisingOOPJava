// Abstract Classes contain at least one abstract method
//Are useful for setting standard and expectations
// Are good for having default implementations of behaviours and may contain constructors and data members
// If the child class doesn't implement all the abstract methods then it needs to be decalred Abstract itself as it did not fullfil the contract
// If there is a hierarchy of classes GrandParent->Parent->Child there can be a case that Parent implements some of the methods of grandparent but not all so it puts the
//responsibility on the child class to provide the missing implementations
// Declare methods abstract using the abstract keyword
public abstract class AbstractClasses {
     public int a;

    AbstractClasses(){
        this(0);
        System.out.println("Abstract Class constructor");
    }

    AbstractClasses(int a ){
        this.a = a;
    }

    public abstract void A();
    public abstract void B();
    public void inFo(){
        System.out.println("I am an Abstract class");
    }

}
