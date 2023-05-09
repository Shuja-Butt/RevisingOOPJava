import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;

public class Scope {

    //Java references the one with lesser scope
    //global variable
    private double pi = 3.14;
    public void accessingLocalAndGlobal(){
        //prints global  variable
        System.out.println(pi);
        //local variable with same name
        double pi = 3.1444444444;
        //prints local variable
        System.out.println(pi);
        //Accessing global variable using this keyword where Java would reference the local variable otherwise
        System.out.println(this.pi);
    }
}
