public class CokeCooler {
    private int cokes;
    public CokeCooler(int c){
        cokes = c;
    }
    public CokeCooler(){
        cokes = 100;
    }
    public void drink(int d){
        cokes -= d;
    }
    public void add(int a){
        cokes += a;
    }
    public void cokeCount(){
        System.out.println("There are " + cokes + " cokes in the cooler.");
    }
}
