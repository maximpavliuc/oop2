import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> colectie = new HashSet<>();
        colectie.add(new Student("Ana", 8.5f));
        colectie.add(new Student("Ion", 7.2f));
        colectie.add(new Student("Ana", 8.5f));

        System.out.println("Studenții din colecție sunt: ");
        for (Student student : colectie) {
            System.out.println(student);
        }

        for (Student student : colectie) {
            System.out.println("Comparând " + student + " cu el însuși folosind equals:");
            System.out.println(student.equals(student));
            System.out.println("Comparând " + student + " cu el însuși folosind equals din Object:");
            System.out.println(((Object) student).equals(student));
        }
    }
}