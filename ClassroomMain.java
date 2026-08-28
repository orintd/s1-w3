public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c = new Classroom("Bruh");
        c.setDesks(30);
        Classroom c1 = new Classroom("Davidson", 32, 34);
        System.out.println("Teacher: " + c1.teacher());
        System.out.println("Number of desks: " + c1.desks());
        System.out.println("Number of students: " + c1.students());
    }
}
