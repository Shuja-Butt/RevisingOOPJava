package com.linkedinlearning.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericBoxClass<N extends Boxable> {

    private List<N> myGenericList;




    public GenericBoxClass(){
        myGenericList = new ArrayList<>();
    }

    public void addItem(N item){

        myGenericList.add(item);
    }

    public List<N> getItems(){
        return myGenericList;
    }

    public N getLatestItem(){
      return  myGenericList.get(myGenericList.size()-1);
    }

    public double getTotalWeight(){
        double weight =0;
        for(N item: myGenericList){
           weight= item.getWeight()+ weight;

        }

        System.out.println(this.myGenericList.stream());
        System.out.println(this.myGenericList.stream().mapToDouble(Boxable::getWeight));
        System.out.println(this.myGenericList.stream().mapToDouble(Boxable::getWeight).sum());
        return  weight;
        //return this.myGenericList.stream().mapToDouble(Boxable::getWeight).sum();

    }



    @Override
    public String toString(){

        return  "List is" + myGenericList;
    }

}
