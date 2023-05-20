package com.linkedinlearning.generics;



//subclass must pass the type parameter upto the class hierarchy. ie declare the same type variable in subclass as below
public class GenericClassHierarchies<T extends Boxable> extends GenericBoxClass<T> {

    @Override
    public double getTotalWeight(){

        return super.getTotalWeight()+0.2;

    }





}
