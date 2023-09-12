package uoft.csc207.week2;

public class Main {

    public static void main(String[] args) {
        String[] name = {"First", "Middle", "Last"}; //String[]: means string array
	    Person p = new Person(name, "moogah");
        Person s = new Student(name, "frooble", "123456789");
        System.out.println(p);
        System.out.println(s);
        Person t = new Trade(name, "techy", "techA", "NOC1001");
        System.out.println(t);
    }
}
