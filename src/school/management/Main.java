package school.management;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        //add teachers
        Teacher teacher1 = new Teacher(411, "Efe", 2000);
        Teacher teacher2 = new Teacher(412, "Alice", 2000);
        teacher1.setSalary(3000);
        teacher2.setSalary(4000);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        Teacher teacher3= new Teacher(413,"Kendall",2000);
        school.addTeacher(teacher3);



        //add students
        Student student1 = new Student(1,"Joe",90,0);
        Student student2 = new Student(3,"John",80,50);
        school.addStudent(student1);
        school.addStudent(student2);

        // Access the teachers ArrayList
        ArrayList<Teacher> teachersList = school.getTeachers();
        // Access the students
        ArrayList<Student> studentsList = school.getStudents();

        // print teachersList ArrayList
        for (Teacher teacher : teachersList) {
            System.out.println("Teacher ID: " + teacher.getId());
            System.out.println("Teacher Name: " + teacher.getName());
            System.out.println("Teacher Salary: " + teacher.getSalary());
            System.out.println("----------------------");
        }
        for ( Student student : studentsList) {
            if(student.getGrade()>84){
                System.out.println("Student name: "+student.getName());
                student.setGrade(100);
                System.out.println("Student grade: "+ student.getGrade());
            } else {
                System.out.println("Student name: "+student.getName());
                System.out.println("Student grade: "+ student.getGrade());
            }
            System.out.println("----------------------");

        }

        student1.paidFees();
        student2.paidFees();

        teacher1.teachersFee();
        teacher2.teachersFee();
        teacher3.teachersFee();
        System.out.println(studentsList);
        System.out.println(teachersList);


        //Total Earned, Spent, Profit Money
        System.out.println(school);

    }
}

