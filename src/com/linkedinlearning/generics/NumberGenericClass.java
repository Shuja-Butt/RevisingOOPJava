package com.linkedinlearning.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class NumberGenericClass<T extends  Number & Comparable<T>> {

    List<T> numericTypesList;

    public  NumberGenericClass(List<T> myList){
        // why creating a new List? cuz if someone passs an immutable list then we cannot chnage it ie we have to do sorting. So we created a copy of the list
        numericTypesList = new ArrayList<>(myList);
    }

    public List<T> getSortedListOfNumbers(){
     Collections.sort(this.numericTypesList);
     return numericTypesList;

    }

    public T getMaxValue(){

        return Collections.max(this.numericTypesList);
    }



}
