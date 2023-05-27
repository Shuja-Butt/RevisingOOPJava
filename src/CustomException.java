public class CustomException extends Exception{
    CustomException(){
        this("Just a shitty custom Exception");
    }

    CustomException(String msg){
        super(msg);

    }

}

