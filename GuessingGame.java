public class GuessingGame {

    public static void main(String[] args) {
        Integer maxNumber;
        String item;
        int randomNumber;
        Boolean cont=true;
        Prompter prompter = new Prompter();
        item=prompter.getItem();
        while (cont==true){
            maxNumber = prompter.getNumber();
            Jar jar = new Jar(item, maxNumber);
            randomNumber = jar.fill();
            prompter.guess(randomNumber, maxNumber);
            cont = prompter.continuing();
        }
    }
}