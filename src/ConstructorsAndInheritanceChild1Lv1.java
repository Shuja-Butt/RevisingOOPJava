public class ConstructorsAndInheritanceChild1Lv1  extends  ConstructorsAndInheritance{


    ConstructorsAndInheritanceChild1Lv1(){

        // by default calls the default constructor
        // remove the default constructor and it errors out because we have provided the parameterized constructor
        //and if there is a constructor present compiler does not provide one so we need to define one in this case
        // if want to call any customer constructor use super() as compiler looks for default implicitly
        super(9);
        System.out.println("ConstructorsAndInheritanceChild1Lv1 constructor");

    }



}
