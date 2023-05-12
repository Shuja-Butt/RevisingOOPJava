package javacollectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JavaListsAndQueue {

    private List  lL= new ArrayList();

    //LinkedList can behave as a queue using add() and remove() methods
    private Queue lQ = new LinkedList();

    public void add(String name){
        lL.add(name);
    }

    public  void remove(int index){
        lL.remove(index);

    }
    public  void upDate(int index){
        lL.set(index,"updated");

    }





}
