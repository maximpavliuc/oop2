class Student  {
    private String nume;
    private float medie;

    // Constructor
    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public float getMedie() {
        return medie;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Float.compare(student.medie, medie) == 0 && nume.equals(student.nume);
    }

    public boolean equals(Student student) {
        return false;
    }

    @Override
    public int hashCode() {
        int result = nume.hashCode();
        result = 31 * result + Float.hashCode(medie);
        return result;
    }
}