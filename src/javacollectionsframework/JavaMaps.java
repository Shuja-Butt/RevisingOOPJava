package javacollectionsframework;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

//Maps are special.Map donot implement Collection interface but still considered a part of collections due to nature


public class JavaMaps {

    private Map<String,Integer> finalTest= new HashMap<>();
    private Map<String,Integer> makeupTest = new HashMap<>();



    public void addFinalTestResults(String name,int score){

        finalTest.put(name,score);

    }
    public void addmakeupTestResults(String name,int score){
        makeupTest.put(name,score);

    }

    public void shouldScoresUpdate(){

        // using Iterator for Map, but cannot use Iterator directly as it does not implement collection

        Set finalTestentrySet = finalTest.entrySet();
        Set makeupTestentrySet = makeupTest.entrySet();

        Iterator<Map.Entry> entrySetIteratorFinalTest = finalTestentrySet.iterator();
        Iterator<Map.Entry> makeUpTestInterator = makeupTestentrySet.iterator();

        while (entrySetIteratorFinalTest.hasNext()){

            Map.Entry<String, Integer> currentFinalTestEntry = entrySetIteratorFinalTest.next();
            Map.Entry<String, Integer> currentMakeupTestEntry = makeUpTestInterator.next();

            if (currentMakeupTestEntry.getValue()> currentFinalTestEntry.getValue()){
                currentFinalTestEntry.setValue(currentMakeupTestEntry.getValue());
            }


        }






    }

    public void printMaps(){

        //using iterator and enhanced forloop
        Set<Map.Entry<String, Integer>> finalTestentrySet = finalTest.entrySet();
        Set<Map.Entry<String, Integer>> makeupTestentrySet = makeupTest.entrySet();

        for (Map.Entry<String,Integer> ab: finalTestentrySet){
            System.out.println(ab);
        }


        for (Map.Entry<String,Integer> ab: makeupTestentrySet){
            System.out.println(ab);
        }


        //forEcah

        Set s = new HashSet<>();

        finalTest.forEach((K,V)->System.out.println(K+" "+V));
        //using method reference
        //:: is the method reference operator
        s.forEach(System.out::println);










    }













}
