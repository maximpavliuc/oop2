import java.util.*;

class Gradebook extends TreeMap<Float, List<Student>> {
    public Gradebook(Comparator<Float> comparator) {
        super(comparator);
    }

    public void add(Student student) {
        float medieRotunjita = Math.round(student.medie);
        if (medieRotunjita >= 0 && medieRotunjita <= 10) {
            if (!containsKey(medieRotunjita)) {
                put(medieRotunjita, new ArrayList<>());
            }
            get(medieRotunjita).add(student);
        } else {
            System.err.println("Eroare: Media studentului " + student + " nu este în intervalul permis [0, 10]");
        }
    }
}
