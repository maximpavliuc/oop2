import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();

        Student student1 = new Student("John", 8.5f);
        Student student2 = new Student("Jane", 7.9f);
        studentHashSet.add(student1);
        studentHashSet.add(student2);

        for (Student student : studentHashSet) {
            System.out.println("Pentru studentul " + student + ":");
            System.out.println("Rezultatul apelarii element.equals(element): " + student.equals(student));
            System.out.println("Rezultatul apelarii ((Object)element).equals(element): " + ((Object) student).equals(student));
        }
    }
}

