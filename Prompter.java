import java.util.Scanner;

public class Prompter{
    private String itemName;
    private Scanner scanner = new Scanner( System.in );
    public String getItem(){
        System.out.print("What type of item? ");
        itemName = scanner.nextLine();
        return itemName;
    }
    public Integer getNumber(){
        System.out.println("What is the maximal amount of " + itemName + "s (max 10)? ");
        return scanner.nextInt();
    }
    public void guess(int someNumber, int MAX_NUMBER){
        Integer attempts=0;
        Integer guessNumber=0;
        while (guessNumber!=someNumber){
            System.out.println("How many " + itemName +"s are there in the jar? Pick a number between 1 and " + MAX_NUMBER );
            guessNumber=scanner.nextInt();
            attempts++;
            if (guessNumber>MAX_NUMBER){
                System.out.println("Your guess must be less than or equal to "+ MAX_NUMBER);
                attempts--;
            }
            if(guessNumber>someNumber){
                System.out.println("Your guess is too high ");
            }
            if(guessNumber<someNumber){
                System.out.println("Your guess is too low ");
            }

        }
        System.out.println("You got it in " + attempts + " attempt(s)");
    }
    public boolean continuing(){
        Boolean cont;
        int answer;
        System.out.print("Would you like to continue? (1=yes, 0=no) ");
        answer=scanner.nextInt();
        if (answer==1){
            cont=true;
        }
        else {
            cont=false;
        }
        return cont;
    }
}