package com.linkedinlearning.generics;

import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.random.RandomGenerator;

public class TypeWitnessAndTypeInferenceClass {


    public static void main(String[] args){


        //compiler knows the type of the list returned but we as observers do not know
        var whatType = Collections.emptyList();
        //Now using type witness, the <> brackets below represent the type witness ie which type we want to use, but we generally do
        // no use type witness as compiler predict the target type using method invocation and return type and arguments usig type inference
        var withTypeWitness = Collections.<String>emptyList();


        //Type inference


        // In below example compiler has three choices one is Number return  type, second is an int 10, third is a double 12.4
        // As both integer and double have inheritance relationship with Number so it works and compiler infers and uses the
        // Number type
        Number result=  myInference(10,12.4);
        //similarly
        //var result=  myInference(10,12.4);

       //below will not work
       // Integer result=  myInference(10,12.4);


        Fruit myFruit = new Fruit();
        Apple myFruitSubClassRef = new Apple();

        // Here again compiler had two choices one Fruit return type, same goes for Fruit argument, and second myFruitSubClassRef
        // argument of type apple so compiler picks Fruit as its most compatible
        Fruit inferedFruitType = myInference(myFruit, myFruitSubClassRef);
        //similarly
        //var inferedFruitType=  myInference(10,12.4);

       // Below wil not work
       // Apple inferedFruitType = myInference(myFruit, myFruitSubClassRef);



        //Types of type inference

        //1)instantiation of Generic type

        //Compiler looks the type argument is of type Fruit, so it infers that the type on right hand side is also fruit
        GenericBoxClass<Fruit> inferenceUsingInstantiationOrDiamondOperator = new GenericBoxClass<>();


        //2)Using method arguments, ie arguments passed during invocation

        Fruit orange = new Fruit();

        // SO as we see  we donot know what type of box will ne returned so we use var variable and as we see below
        //the argument passed was of type Fruit compiler infers that return type will also be of type fruit
       var t = GenericBoxClass.of(orange);


       //3) Inference using target types


        // We see that returned is Boxable , why is that it is due to the bounds, compiler infered usimg the upper bound on method
       var usingTargetTypes = UtilityGenericMethods.emptyBox();
       //Below the compiler is using the target type  GenericBoxClass<Fruit> to infer the type
       GenericBoxClass<Fruit> targetTypeInference = UtilityGenericMethods.emptyBox();
       GenericBoxClass<Apple> targetTypeInferenceTypeSubclass = UtilityGenericMethods.emptyBox();

       //SO it means we can declare the ref varable of any type up the class hierarchy as we see in var above ie compiler inferred type  is Boxabale







    }


    //Type Inference example

    public static  <T>T myInference(T t1, T t2){

        if(Math.random()>0.5){

            return t1;

        }else{
            return t2;

        }

    }





}
