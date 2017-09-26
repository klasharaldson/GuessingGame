import java.util.Random;


public class Jar{
    private String item;
    private Integer MAX_NUMBER;
    private Integer someNumber;

    public Jar(String name, Integer maxNumber){
        item=name;
        MAX_NUMBER=maxNumber;
    }
    public int fill(){
        Random random = new Random();
        someNumber = random.nextInt(MAX_NUMBER)+1;
        return someNumber;
    }

}