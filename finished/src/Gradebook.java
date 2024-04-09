import java.util.*;

public class Gradebook extends TreeMap<Float, List<Student>> {
    private Comparator<Float> comparator;

    public Gradebook(Comparator<Float> comparator) {
        super(comparator);
        this.comparator = comparator;
    }

    public void add(Student student) {
        float roundedGrade = Math.round(student.getMedie());
        List<Student> studentsWithGrade = this.getOrDefault(roundedGrade, new ArrayList<>());

        if (studentsWithGrade.isEmpty()) {
            studentsWithGrade = new ArrayList<>();
            this.put(roundedGrade, studentsWithGrade);
        }

        studentsWithGrade.add(student);
    }

    public void sortAlphabetic() {
        for (List<Student> studentList : this.values()) {
            Collections.sort(studentList, Comparator.comparing(Student::getNume));
        }
    }


    public static void main(String[] args) {
        Gradebook gradebook = new Gradebook(Collections.reverseOrder());

        gradebook.add(new Student("John", 8.5f));
        gradebook.add(new Student("Jane", 7.9f));
        gradebook.add(new Student("Alice", 8.5f));
        gradebook.add(new Student("Bob", 6.8f));
        gradebook.add(new Student("Charlie", 9.3f));
        gradebook.add(new Student("David", 8.1f));

        gradebook.sortAlphabetic();

        for (Map.Entry<Float, List<Student>> entry : gradebook.entrySet()) {
            System.out.println("Medie: " + entry.getKey());
            for (Student student : entry.getValue()) {
                System.out.println("\t" + student);
            }
        }
    }
}

