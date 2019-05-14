package Task13_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {


        public static void main (String[]args){

            ArrayList <Integer> valuStudents = new ArrayList<>();
            valuStudents.add(9);
            valuStudents.add(11);
            valuStudents.add(7);
            valuStudents.add(10);
            ListIterator <Integer> listIterator = valuStudents.listIterator();
            Integer a = new Integer(valuStudents.get(0));
            while (listIterator.hasNext()) {
                if (listIterator.next() > a) {
                    a = listIterator.previous();
                }
            }
            System.out.println(a);

            System.out.println(a);
            ArrayList<String> states = new ArrayList<String>();
            ListIterator<String> listIter = states.listIterator();
            states.add("Germany");
            states.add("France");
            states.add("Italy");
            states.add("Spain");

          //  ListIterator<String> listIter = states.listIterator();

            while (listIter.hasNext()) {

                System.out.println(listIter.next());
            }
            // сейчас текущий элемент - Испания
            // изменим значение этого элемента
            listIter.set("Португалия");
            // пройдемся по элементам в обратном порядке
            while (listIter.hasPrevious()) {

                System.out.println(listIter.previous());
            }

        }
    }



