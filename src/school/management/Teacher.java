package school.management;

import static school.management.School.updateMoneySpentTotal;

public class Teacher extends Person{
    private int salary;


    //constructor
    public Teacher(int id, String name, int salary){
        super(id, name);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) { //update salary
        this.salary = salary;
    }
    public void teachersFee(){
        updateMoneySpentTotal(salary);

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
