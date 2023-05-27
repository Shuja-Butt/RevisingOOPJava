package javacollectionsframework;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfacesAndStreamAPI {

    public static  void main(String [] args){


        List<String> myList = List.of("Pakistan", "Nepal", "Bhutan");



        //using method Ref

        myList.forEach(String::length);
        //using lambda
        //lambda function is the implementation of Consumer Interface
        myList.forEach(ele->ele.length());

        //using Consumer
        //So it means lambda functions enable java functions to act as first class citizens to some extent
        Consumer myConsumer = c->System.out.println(c);
        myList.forEach(myConsumer);

        //Another way
        Consumer acceptImplementation = c->System.out.println(c);
        acceptImplementation.accept("hello");

        //Functional Interfaces may also provide default or static methods

        Consumer<Integer> addLambdaExpressionm = n -> System.out.println(n+n);
       Function<Integer, Integer> addLambdaExpression = n -> n+n;
       Function<Integer, Integer> mulLambdaExpression = n -> n*n;

       addLambdaExpression.andThen(mulLambdaExpression).apply(5);




       //Can also make custom Functional Interfaces


       // Begin Stream API

       int [] myArray = {1, 13,2, 3, 10};

      Arrays.stream(myArray).max();
      // parallel uses multiple threads so guarantee to preserve sequence
      Arrays.stream(myArray).parallel().forEach(System.out::println);


      //Two types of stream operation
        //Intermmediate Stream Operations -> return the resulting stream
        //Terminal Stream Operations -> return the result and close the stream


        List<String> listOfVeges = List.of("carrots", "radish", "spanish","Lady finger");

        //terminal operations
       var numberOfveges =  listOfVeges.stream().count();
      var isLengthGreaterThanOne  =listOfVeges.stream().anyMatch(ele->ele.length()>1);
      var doesAExist = listOfVeges.stream().allMatch(ele->ele.equals("carrot"));
        System.out.println(numberOfveges + " " + isLengthGreaterThanOne  + " "+ doesAExist);

        //intermmediate operations
        listOfVeges.stream().filter(c->c.contains("r")).forEach(System.out::println);

        //manipulate the data using map- but original list would never be changed

        listOfVeges.stream().map(ele->ele.contains("r")?ele + 1: ele+0).forEach(System.out::println);


        //reduce()


        List<Integer> myNumberList = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(myNumberList.stream().reduce(0,(a, b)-> {
            System.out.println(a +" " +b);

        return    a+b;


        }));














        //EndStreamAPI








    }




}
