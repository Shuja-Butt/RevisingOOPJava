package com.linkedinlearning.generics;

import java.util.List;

public class UtilityGenericMethods {

    public static <T extends Boxable> int getCountOfItems(GenericBoxClass<T> genericList){
        return  genericList.getItems().size();
    }
}
