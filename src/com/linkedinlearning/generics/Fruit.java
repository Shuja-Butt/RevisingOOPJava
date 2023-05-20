package com.linkedinlearning.generics;

public class Fruit  implements  Boxable{

    private String country;
    private String name;
    private double weight;

    public Fruit(String country, String name, double weight) {
        this.country = country;
        this.name = name;
        this.weight = weight;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
   @Override
    public double getWeight() {
        return weight;
    }


    @Override
    public  String toString(){
        return " " + name + " " + country + " "+ weight;
    }


}
