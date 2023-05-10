

public class UpcastingDowncastingAndPolymorphismChild1Lv1 extends  UpcastingDowncastingAndPolymorphism{

    public int pVar = 10;
    @Override
    public void general(){
        System.out.println("general method in UpcastingDowncastingAndPolymorphismChild1Lv1");
    }

    public void myfun(int a) {
        System.out.println("I am the overloaded variant in class hierarchy ");
    }



}
