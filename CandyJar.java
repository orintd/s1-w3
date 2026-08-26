public class CandyJar{
    public int amt;
    public CandyJar(){
        amt = 10;
    }
    public CandyJar(int candy){
        amt = candy;
    }
    public void eat(int amount){
        this.amt -= amount;
    }
    public void refill(int amount){
        this.amt += amount;
    }
    public void printState(){
        System.out.println("There are " + amt + " pieces of candy in the jar.");
    }
    
}