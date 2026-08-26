public class CandyJarMain {
    public static void main(String[] args) {
        CandyJar j = new CandyJar();
        CandyJar j1 = new CandyJar(69420);
        j.printState();
        j1.printState();
        j.eat(3000);
        j1.refill(10);
        j.printState();
        j1.printState();
    }
}