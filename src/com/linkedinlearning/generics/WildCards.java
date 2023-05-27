package com.linkedinlearning.generics;

import java.security.CodeSigner;

public class WildCards  extends  GenericBoxClass{


    public  static  void main(String [] args) {


        // situation where wildcard cannot be applied

        //1) Generic Type instantiation

        // GenericBoxClass<Fruit> genericTypeInstantiationNoWildCardAllowed = new GenericBoxClass<?>();


        //2) Generic Method Invocation

        //Using type witness
        //GenericBoxClass.<?>of(new Fruit());


        //3 In super class
        //public class WildCards  extends  GenericBoxClass<?>



        //Ways in which wild cards can be used


        //1) Unbounded Types





        //2) UpperBounded Wild cards







        //3) Lower bounded wildcards











    }



}
