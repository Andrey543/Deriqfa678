public class Student {
    private String Name;
    private int Age;
    private int AverageGrade;

    public Student(String name, int age, int averagegrade) {
        this.Name = name;
        this.Age = age;
        this.AverageGrade = averagegrade;

    }


    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getAverageGrade() {
        return AverageGrade;
    }


    public Student(int averageGrade) {
        AverageGrade = averageGrade;
    }

    public <AverageGrade> Student() {
        AverageGrade = 5;
        if (AverageGrade <= 3) {
            System.out.print("Отчислен");
        } else if (AverageGrade > 2) {
            System.out.print("Зачислен");


        }

    }
}






