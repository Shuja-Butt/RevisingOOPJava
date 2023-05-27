import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

@FunctionalInterface
public class HandlingJavaExceptions {

    public  static  void main(String [] args)  {
        Scanner sc= null;
        try{

            File m = new File("C:\\Users\\vr913\\Desktop\\Java Learning Path\\src\\javacollectionsframework/Hello.txt");
           // createNewFile() method throws a checked exception that is why it need to in try catch block
            m.createNewFile();
             sc = new Scanner(m);

            int a =sc.nextInt();
            System.out.println(a);
            sc.close();
        }
        // multiple catch block used when code in catch block is same irrespective of the exception
        catch (IOException | InputMismatchException e) {
            e.printStackTrace();

        }
        //Exception can only be at the end of catch blocks
        catch (Exception e){
            System.out.println(e.getMessage());

        }
        // finally makes the code more cleaner. similar functionality may be achieved by writing the code after catch block. Consider a case
        // error occurs inside catch block then finally will still be executed, but code after catch wont
        finally {
            sc.close();

        }

        //try-with-resources
        //Autoscloses the streams
        //Works only for classes that implement Closeable or AutoCloseable interface
        //May be an alternative to closing resoures or streams in finally
        File m = new File("C:\\Users\\vr913\\Desktop\\Java Learning Path\\src\\javacollectionsframework/Hello.txt");
        try( Scanner fileReader = new Scanner(m)){
            // createNewFile() method throws a checked exception that is why it need to in try catch block
            m.createNewFile();
            int a =fileReader.nextInt();
            System.out.println(a);
        }
        catch (IOException | InputMismatchException e) {
            e.printStackTrace();

        }


       //throwing a custom checked Exception


        try {
            customCheckedAndUnCheckedEXception(10);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }


    }

    public static void customCheckedAndUnCheckedEXception(int hours) throws CustomException{
        if (hours > 0) {
            throw new CustomException("HI HI HI A custom Exception");// An ckecked Exception ad it extends Exception , for uncheck extend from RunTimeEXception
        }
    }








}
