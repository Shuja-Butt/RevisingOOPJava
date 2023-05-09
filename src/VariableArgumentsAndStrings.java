public class VariableArgumentsAndStrings {

    // A method that can have only one varArgs parameter
    // int ...a syntax is equivalent to int [] a
    //... parameter is treated as an array
    public void varArgs(int ...a){

      for(int i =0;i<a.length;i++){
          System.out.println("Using .... syntax");
      }

    }

    // If multiple parameters varArgs can only be the last one in position
    public void varArgs(String name, int ...a){

        System.out.println(name);
        System.out.println("varArgs parameter along with normal positional parameter");
        System.out.println(a[0]);

    }

    //Strings

    //String are objects in Java and do not have wrapper classes

    public void usingStrings(){
     //Text Blocks using """ """
        //Text blocks can be handy as we do not use escape characters with it
     System.out.println("""
             A way to "escape" using escape characters
             """);


     // below expressions are equivalent
     String a = "MyString";

     char [] b = {'M', 'y', 'S', 't', 'r', 'i', 'n', 'g'};
     String equivalency = new String(b);

     // Comparing strings
        // == compares the references
        // .equals() compares the contents of the string


        String D = "Pak";
        String E = "Pak";
        String F = new String("PaK");

        System.out.println(D==E);// true because of String Interning mechanism
        System.out.println(D.equals(E));
        System.out.println(D==F);//with new we create a String object in a different memory location




    }




// String Interning and String Pool to be discovered more



}
