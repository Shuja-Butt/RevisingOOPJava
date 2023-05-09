
//Parent didnot implement the B() in Abstract class so Child must provide missing implementations
public class AbstractClassesChildLv2  extends AbstractClassesChildLv1{

    @Override
    public void B(){
        System.out.println("My parent did not provide implementation for the B() from Abstract class so I have to implement it to avoid being abstract");
    }

}
