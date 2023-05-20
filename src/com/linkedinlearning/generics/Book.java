package com.linkedinlearning.generics;

public class Book implements Boxable {


    private String name;
    private String author;
    private double weight;




    public Book(String name, String author, double weight) {
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }




    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public double getWeight() {
        return weight;
    }





    @Override
    public String toString(){

        return "Book "+ name+ " by " + author +" weights " + weight;

    }



}
