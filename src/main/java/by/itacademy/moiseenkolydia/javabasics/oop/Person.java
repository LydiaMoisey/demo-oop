package by.itacademy.moiseenkolydia.javabasics.oop;

public class Person extends Student {
    private int salary;

    public void setSalary(int newSalary) {

        salary = newSalary;
    }

    public int getSalary() {

        return salary;
    }
    public int getIncome(){
        return salary + getGrant();
    }
}
