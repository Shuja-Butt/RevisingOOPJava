package com.linkedinlearning.generics;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UtilityGenericMethods {

    public static <T extends Boxable> int getCountOfItems(@NotNull GenericBoxClass<T> genericList){
        return  genericList.getItems().size();
    }




    // Type inference using Target types, here compiler has no info about Type of Box returned
    public  static  <T extends  Boxable> GenericBoxClass<T> emptyBox(){


        return  new GenericBoxClass<>();
    }




    //Using Unbounded WildCards- we dont want any ref to bounded types or type parameter T so we can usea ? here

    public static  int getCountOfItemsUsingUnboundedWildCards(GenericBoxClass<?> myGenericBox) {

        return myGenericBox.getItems().size();

    }


    //Using



}
