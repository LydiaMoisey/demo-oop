package by.itacademy.moiseenkolydia.javabasics.oop;

public class Student extends User {
    private static int grant;

    public void setGrant(int newGrant) {

        grant = newGrant;
    }

    public int getGrant() {

        return grant;
    }
    public int getIncome(){
        if(grant > 0) return grant; else
        return 0;
    }
}
