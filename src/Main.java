import javacollectionsframework.JavaSets;

import java.util.Set;

public class Main {

    int g =a;
    static int a;

    public static void main(String[] args) {
        //Begin Scope
        Scope s = new Scope();
        s.accessingLocalAndGlobal();
        // End Scope

        //BeginSwitch
        Switch switchTypes = new Switch();
        switchTypes.switchStatements();
        Switch switchExpression = new Switch();
        switchExpression.switchExpression();
        //EndSwitch

        //BeginVariableArgumentsAndStrings

        VariableArgumentsAndStrings vS = new VariableArgumentsAndStrings();
        vS.usingStrings();
        vS.varArgs(new int[]{1, 2, 3});
        vS.varArgs("Shuja", new int[]{3, 4, 5});
        //EndVariableArgumentsAndStrings


        //BeginRecord

        Records records = new Records(5,"recordAreImmutable", 3);
        //Accessing Record using autogenerated getters
        System.out.println(records.intRecord());
        records.myExtensionMethod();
        //EndRecord


        //BeginAbstractClasses
        //Implicit Upcasting makes code more generic and flexible
        AbstractClasses aC = new AbstractClassesChildLv2();
        aC.A();
        aC.B();
        //EndAbstractClasses


        //BeginInterface
         System.out.println("Accessing Interface1 data member using name as its implicitly pubic, static and final" + Interfaces1.MYVAR);
         Interfaces1.interfaceMethodPublic();
         InterfacesClass1Lv1 icL1 = new InterfacesClass1Lv1();
         icL1.newlyAdded();
         icL1.move();
        //EndInterface


        //BeginConstructorsAndInheritance

        ConstructorsAndInheritance caI = new ConstructorsAndInheritanceChild1Lv1();
        caI.A();

        //Limiting inheritance using sealed, non-sealed and final

        //EndConstructorsAndInheritance



        //BeginUpcastingDowncastingAndPolymorphism

        //implicit upcasting
        UpcastingDowncastingAndPolymorphism udAp = new UpcastingDowncastingAndPolymorphismChild1Lv1();

        //with parent ref we can only access at access level as it doesnot know about the child

        udAp.general();

        //explicit downcast to access child behaviours and attributes
        System.out.println("explicit downcast to access child attribute "+ ((UpcastingDowncastingAndPolymorphismChild1Lv1) udAp).pVar);

        //ploymorphism ,objects having the ability to take on multiple forms
        //runtime-or-dynamic polymorphism also achieved through method overriding
        udAp = new UpcastingDowncastingAndPolymorphismChild2Lv1();
        udAp.general();


        //Overloaded not Overridden in class hierarchy

        udAp = new UpcastingDowncastingAndPolymorphismChild1Lv1();
        udAp.myfun();

        UpcastingDowncastingAndPolymorphismChild1Lv1  exDowncast= ((UpcastingDowncastingAndPolymorphismChild1Lv1)udAp);
        exDowncast.myfun(8);



        //BeginJavaCollection

        JavaSets  jS= new JavaSets();
        jS.addBankAccounts("IBAN68732Pk87");
        //duplicates wont be added but Hapset is unordered
        jS.addBankAccounts("IBAN68732Pk879");
        jS.addBankAccounts("IBAN68732Pk87");
        jS.printAccounts();
        jS.removeBankAccount("IBAN68732Pk87");
        jS.printAccounts();


        JavaSets jsImmutable = new JavaSets(Set.of("IABN567", "IBAN235", "IBAN897"));
        jsImmutable.printAccounts();
        jsImmutable.addBankAccounts("cant be added");





        //EndJavaCollections





















        //EndUpcastingDowncastingAndPolymorphism

















        System.out.println("Hello world!");
    }
}