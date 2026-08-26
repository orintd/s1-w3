public class Refillable {
    private int amt;
    public Refillable(){
        amt = 10;
    }
    public Refillable(int a){
        amt = a;
    }
    public void useUp(int u){
        amt -= u;
    }
    public void addTo(int a){
        amt += a;
    }
    public void printState(){
        System.out.println("There are " + amt + " things in the object.");
    }
}
