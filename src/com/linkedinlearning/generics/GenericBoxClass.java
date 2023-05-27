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



    //Type inference using method arguments
    // Note static methods must redeclare the bounds and type paramets agian, that auto shit only happens for instance mrthods
    //ie type arguments become avaiable
    public  static  <N extends  Boxable> N of(N t){

        //Inference using Generic class instantiation in below line , ie the diamond opeator
        GenericBoxClass<N> inferenceUsingMethodArguments = new GenericBoxClass<>();
        inferenceUsingMethodArguments.addItem(t);
        return  t;

    }



    //Using Upper bounded wildCrds

    public double getAverageWeighOfFruit(GenericBoxClass<? extends  Fruit> myFruitBox){
        return myFruitBox.getItems().stream().mapToDouble(Boxable::getWeight).sum()/ myFruitBox.getItems().size();
    }


    //Using lower bounded wildcards

    public void addAppleToBox(GenericBoxClass<? super  Apple> myFruitBox){
         myFruitBox.addItem(new Apple());
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
