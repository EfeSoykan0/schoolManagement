package school.management;

import java.util.ArrayList;
import java.util.List;
public class School {

    //variables of the school class
    private final ArrayList<Teacher> teachers;
    private final ArrayList<Student> students;
    private static int moneySpendTotal;
    private static int moneyEarnedTotal;


    public School() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        moneySpendTotal = 0;
        moneyEarnedTotal = 0;
    }

    public School(List<Teacher> teachers, List<Student> students){
        this.students= (ArrayList<Student>) students;
        this.teachers= (ArrayList<Teacher>) teachers;

    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }


    public int calculateProfit() {
        return moneyEarnedTotal - moneySpendTotal;
    }

    // Override the toString method to display the profit
    @Override
    public String toString() {
        int profit = calculateProfit();
        return "Total Earned Money: " + moneyEarnedTotal + ",\nTotal Spent Money: " + moneySpendTotal + ",\nProfit: " + profit;
    }

    public static void updateMoneyEarnedTotal(int moneyEarned){
        moneyEarnedTotal+=moneyEarned;
    }

    public static void updateMoneySpentTotal(int moneySpend){
        moneySpendTotal += moneySpend;
    }
}
