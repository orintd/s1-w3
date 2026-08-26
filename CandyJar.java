public class CandyJar{
    private int amt;
    public CandyJar(){
        amt = 10;
    }
    public CandyJar(int candy){
        amt = candy;
    }
    public void eat(int eat){
        amt -= eat;
    }
    public void refill(int refill){
        amt += refill;
    }
    public void printState(){
        System.out.println("There are " + amt + " pieces of candy in the jar.");
    }
    
}