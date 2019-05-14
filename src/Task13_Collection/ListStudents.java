package Task13_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListStudents {
    public static void main(String[] args) {

        ArrayList <Student> valuStudents = new ArrayList<>();
        ListIterator <Student> studentIterator = valuStudents.listIterator();

        studentIterator.add(new Student("петя"));
        studentIterator.add(new Student("федя"));
        studentIterator.add(new Student("саша"));
        studentIterator.add(new Student("паша"));
        studentIterator.add(new Student("коля"));
        studentIterator.add(new Student("миша"));
        studentIterator.add(new Student("витя"));
        studentIterator.add(new Student("дима"));
        studentIterator.add(new Student("митя"));
        studentIterator.add(new Student("вася"));

        ListIterator <Student> studentIterator1 = valuStudents.listIterator();
        while (studentIterator1.hasNext()){
            Student student = studentIterator1.next();
            student.setGrades((int) (1 + Math.random() * 10));
            System.out.print(student.getName() + ":" + student.getGrades() + "  ");
            studentIterator1.set(student);
        }
        System.out.println("\n" + valuStudents);

        while (studentIterator1.hasPrevious()){
            System.out.print(studentIterator1.previous().getName() + " ");
        }

        System.out.print("\nотчислить: ");
        ListIterator <Student> studentIterator2 = valuStudents.listIterator();
        while (studentIterator2.hasNext()) {
            Student student = studentIterator2.next();
            if (student.getGrades() < 5) {
                System.out.print(student.getName() + " ");
                studentIterator2.remove();
            }
        }
        System.out.println("\n" + valuStudents);

        ListIterator <Student> studentIterator3 = valuStudents.listIterator();
        int max = valuStudents.get(0).getGrades();
        String name = valuStudents.get(0).getName();
        while (studentIterator3.hasNext()){
            Student student = studentIterator3.next();
            if(student.getGrades() > max){
                max = student.getGrades();
                name = student.getName();
            }
        }
        System.out.println(name + " " + max);

    }
}
