package com.linkedinlearning.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonGenericClass {

    List nonGenericList = new ArrayList();
    Map nonGenericMap = new HashMap();

    public void addAndProcess(){


        nonGenericList.add("Hello");
        nonGenericList.add(1,"Hepline" );
        nonGenericList.add(10);

        nonGenericMap.put("Abc",8);
        nonGenericMap.put(9,"Def");

        System.out.println(nonGenericList);
        System.out.println(nonGenericMap);
        isExplicitCastRequired(nonGenericList);








    }


    void isExplicitCastRequired(List nonGenericList){

        try {
            // Notice no compile time error but run time error cuz raw list type are objects and there is relation bet Object and String so it allows casting here
            String ge = (String)nonGenericList.get(2);

           //Notice compile-time error as Intrger  and String are incompatible and compiler has information about the types
           // Integer y =30;
           // String u = (String) y;



        }
        catch (Exception e){
            System.out.println(e);
        }


    }



    public  void aCase(){

        //with raw types we can add any type of data in collections as below cuz every class extends from Object in Java
        //so raw types accept data of type Object so its allowed
        List A = new ArrayList();

        //still a raw type ie. not using diamond operator
        List<String> B = new ArrayList();

        //using diamond operator it uses inference
        List<String> usingTypeInference = new ArrayList<>();


        // Autoboxing and unboxing in java
        List<Integer> myList = new ArrayList<>();
        myList.add(8);
        //Generics only work with reference types using wrapper classes then how below line is possible
        //possible cuz of autoboxing and unboxing feature in Java
        int myUnboxedInt = myList.get(0);









        A.add("Apple");
        A.add(8);

        //Now try storing "Apple" String in a String variable

        //gives an error as it says its receiving Object instead of String type
       // String appleString = A.get(0);

        //this solves the above issue
        String appleString = (String) A.get(0);


        //Now lets try to cast second element using casting operation as above

        //if you execute the below code it will error out in run-time rather than compile time
        //The reason is that Object is super() of all classes so compiler considers it a valid cast cuz A.get(0) type is object but at run time when
        // java sees the acutual type of object is Interger it errors out cuz there is no direct relationhip or inheritance between string and interger
        //and hence are not directly compatible
        //String stringToNumUsingCast =  (String) A.get(1);
    }


}
