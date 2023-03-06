

public class Teacher {
    private String NAme;
    private int AGe;
    Student[] students = new Student[3];
    Teacher[] teachers = new Teacher[3];


    public void setStudent(Student[] students) {
        this.students = students;
    }


     Teacher(String name, int age) {
        this.NAme = name;
        this.AGe = age;

    }

    public String getNAme() {
        return NAme;
    }

    public int getAGe() {
        return AGe;
    }

    public void getStudent() {
        int i;
        for (i = 0; i < students.length; i++)
            students[i].getName();
        students[i].getAge();
        students[i].getAverageGrade();


    }

    public void getStudents(Student[] students) {
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}





