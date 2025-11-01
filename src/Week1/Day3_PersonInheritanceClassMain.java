package Week1;

import Week2.packagesDemo.Account;

public class Day3_PersonInheritanceClassMain {
    public static void main(String[] args) {
        Day3_PersonInheritanceClass p = new Day3_PersonInheritanceClass();
        p.name = "Vinay";
        p.age = 24;
        p.displayInfo1();

        StudentInheritance s = new StudentInheritance();
        s.name ="Vinay";
        s.course ="Java";
        s.age = 21;
        s.displayInfo2();

        TeacherInheritance t = new TeacherInheritance();
        t.name = "Vinay";
        t.subject = "Spring Boot";
        t.displayInfo3();

        // Try to access class on different package
        System.out.println();
        Account a1 = new Account(2001, 50000, "Current", "Ar32!@ne");
        System.out.println("Account number = " + a1.accountNo + " This Account class accessed from different package i.e import Week2.packagesDemo.Account ");
    }
}