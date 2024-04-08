import java.util.HashSet;
import java.util.Set;

class Student {
    private String nume;
    private float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.medie, medie) == 0 &&
                nume.equals(student.nume);
    }

    public boolean equals(Student student) {
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * nume.hashCode() + Float.hashCode(medie);
    }
}


