package javacollectionsframework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Many implements of Set interface , usually unordered and unique

public class JavaSets {

    // a bit of composition
    private Set<String> bankAccounts = new HashSet<String>();


   public JavaSets(){}

    // creating immutableSet using Set.of() static method
    public JavaSets(Set<String> defaultAccounts){
        this.bankAccounts = defaultAccounts;
    }

    public void addBankAccounts(String accountString){

        bankAccounts.add(accountString);
    }

    public  void printAccounts(){
        System.out.println(bankAccounts);
    }

    public void removeBankAccount(String bankStringToDestroy){
       bankAccounts.remove(bankStringToDestroy);
    }
}
