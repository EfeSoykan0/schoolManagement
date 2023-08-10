package school.management;

import static school.management.School.updateMoneyEarnedTotal;

public class Student extends Person {
    //variables
    private int grade;
    private final int scholarship;
    private static final int FEES_AMOUNT = 10000;
    private static double totalEarnedMoney = 0; // Static variable to track the total earned money

    //constructor
    public Student(int id, String name, int grade, int scholarship) {
        super(id, name);
        this.grade = grade;
        this.scholarship = scholarship;

        // Calculate the fees based on the scholarship and update the totalEarnedMoney
        int fees = FEES_AMOUNT - (FEES_AMOUNT * scholarship / 100);
        totalEarnedMoney += fees;
    }

    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getGrade(){
        return grade;
    }
    public void paidFees() {
        // Calculate the fees based on the scholarship and update the totalEarnedMoney in School class
        int fees = FEES_AMOUNT - (FEES_AMOUNT * scholarship / 100);
        updateMoneyEarnedTotal(fees);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", scholarship=" + scholarship +
                '}';
    }
}
