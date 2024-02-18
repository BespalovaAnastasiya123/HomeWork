package HomeworkCompare;

class Abiturient0{
    private final String id;
    private final String Surname;
    private final String Name;
    private final int grade1;
    private final int grade2;
    private final int grade3;
    public int sumGrade;

    public Abiturient0(String id, String surname, String name, int grade1, int grade2, int grade3) {
        this.id = id;
        Surname = surname;
        Name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.sumGrade = grade1 + grade2 + grade3;
    }

        public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public int getGrade3() {
        return grade3;
    }
    public int getSumGrade() {
        return sumGrade;
    }
    @Override
    public String toString() {
        return "Abiturient0{" +
                "id='" + id + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", grade1=" + grade1 +
                ", grade2=" + grade2 +
                ", grade3=" + grade3 +
                '}';
    }
}
