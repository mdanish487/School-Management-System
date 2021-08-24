package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",5000);
        Teacher pizzy = new Teacher(2,"pizzy",7000);
        Teacher bamboo = new Teacher(3,"Bamboo",9000);
        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(pizzy);
        teacherList.add(bamboo);

        Student manisha = new Student(1,"Manisha",6);
        Student alisha = new Student(2,"Alisha",12);
        Student misha = new Student(3,"Misha",10);

        List<Student> studentList= new ArrayList<>();
        studentList.add(manisha);
        studentList.add(alisha);
        studentList.add(misha);

        School ghs = new School(studentList,teacherList);
        System.out.println("GHS has earned $"+ghs.getTotalMoneyEarnt());
        manisha.payFees(7000);
        alisha.payFees(10000);
        misha.payFees(19000);
        misha.payFees(11000);

        lizzy.setSalary(5000);
        pizzy.setSalary(7000);

        System.out.println("GHS has net earned money $"+ghs.getTotalMoneyEarnt());
        System.out.println("GHS has spent on salaries:  $"+ghs.getTotalMoneySpent());
        System.out.println("GHS has received as fees $"+ghs.getTotalFeesReceived());


        System.out.println("Manisha has paid $"+misha.getFeesPaid());
        System.out.println("The pending fees of Manisha is: $"+manisha.getRemainigFees());
        System.out.println(misha);

    }
}
