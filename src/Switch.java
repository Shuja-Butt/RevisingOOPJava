import java.util.Map;

public class Switch {

    private  int mySwitchAnswer = 1;


    // if check on range of values use if else
    // if check on a singe value use switch
    public void switchStatements(){



        // fall through in normal switch. To observer fall through effect remove the break statements
        // from the case it matched it keeps on executing the case statements until it finds a break statement
        int i = 0;
        String quarter = "";

        switch ("JAN") {
            case "JAN":
            case "FEB":
            case "MAR":
                i = i + 1;
                quarter = "Q1";
                 break;
            case "APR":
            case "MAY":
            case "JUN":
                i = i + 2;
                quarter = "Q2";
                 break;
            case "JUL":
            case "AUG":
            case "SEP":
                i = i + 3;
                quarter = "Q3";
                 break;
            case "OCT":
            case "NOV":
            case "DEC":
                i = i + 4;
                quarter = "Q4";
                break;
            default:
                System.out.println("Unknown case");
        }

        System.out.println("QUARTER: "+ i + " "+ quarter);

   }


    public void switchExpression(){

        // no need for break statements
        //when multiple lines use the yield keyword to return a value from code block

        int answer =switch("B"){
            case "A" -> 4*7;
            case "B" -> 8*9;
            //Both cases map to same output
            case "C", "D" ->{
                int b = 7*10;
                yield b;
            }
            default -> 0;

        };

        // using yield instead of ->

        int num = 2;
        String result = switch (num) {
            case 1:
                yield "One";
            case 2:
                yield "Two";
            case 3:
                yield "Three";
            default:
                yield "Unknown";
        };






    }


// Yield keyword to be discovered more

}
