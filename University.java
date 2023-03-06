public class University {

    public static void main(String[] args) {
        Student student1 = new Student("Вася", 26, 5 );
        Student student2 = new Student("Саша", 20, 3 );
        Student student3 = new Student("Артём", 21, 2 );
        Student student4 = new Student("Петя", 24, 4 );
        Student student5 = new Student("Антон", 22, 2 );
        Student student6 = new Student("Богдан", 29, 5 );
        Student student7 = new Student("Серёга", 27, 3 );
        Student student8 = new Student("Рома", 22, 3 );
        Student student9 = new Student("Руслан", 24, 2 );

        Teacher teacher1 = new Teacher("Станислав", 44);
        Teacher teacher2 = new Teacher("Вячеслав",51);
        Teacher teacher3 = new Teacher("Константин",45);


        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAverageGrade());
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getAverageGrade());
        System.out.println(student3.getName());
        System.out.println(student3.getAge());
        System.out.println(student3.getAverageGrade());
        System.out.println(student4.getName());
        System.out.println(student4.getAge());
        System.out.println(student4.getAverageGrade());
        System.out.println(student5.getName());
        System.out.println(student5.getAge());
        System.out.println(student5.getAverageGrade());
        System.out.println(student6.getName());
        System.out.println(student6.getAge());
        System.out.println(student6.getAverageGrade());
        System.out.println(teacher1.getNAme());
        System.out.println(teacher1.getAGe());
        System.out.println(teacher2.getNAme());
        System.out.println(teacher2.getAGe());
        System.out.println(teacher3.getNAme());
        System.out.println(teacher3.getAGe());


        teacher1.setStudents(new Student[]{student2,student8,student1});
        teacher2.setStudents(new Student[]{student4,student6,student9});
        teacher3.setStudents(new Student[]{student3,student5,student7});
       System.out.println(student2);
        System.out.println(student8);
        System.out.println(student1);
        System.out.println(student4);
        System.out.println(student6);
        System.out.println(student9);
        System.out.println(student3);
        System.out.println(student5);
        System.out.println(student7);

        }

            }




