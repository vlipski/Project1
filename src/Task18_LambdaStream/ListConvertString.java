package Task18_LambdaStream;


import java.util.*;
import java.util.function.Function;

public class ListConvertString {

    public static void integerConvertString(List<Integer> lis) {
        Function<List<Integer>, String> listStringFunction = (List<Integer> list) -> {
            StringBuilder str = new StringBuilder();
            for (Integer i : list) {
                str.append(i);
            }
            return String.valueOf(str);
        };
        System.out.println(listStringFunction.apply(lis));
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 15, 5, 25, 8);
        StringBuilder str = new StringBuilder();

//        integerConvertString(list);

        /*OptionalDouble avg = list.stream()
                .filter(element -> element % 2 != 0)
                .filter(element -> element % 5 == 0)
                .mapToInt(element -> element)
                .average();
        System.out.println(avg);*/

       /* List<String> words = Arrays.asList("ooooooooo", "aaaaaa", "ooooooooo", "ttttt", "gggggggggggggggg", "kkkkkk");
        long count = words.stream()
                .filter(element -> element.length() > 8)
                .distinct()
                .count();
        System.out.println(count);*/

        /*List<Person> people = Arrays.asList(new Person("Michel", "Bibuirishvily", 55),
                new Person("Lewis", "Hamilton", 34),
                new Person("Carlos", "Roberto", 46));
        String name = people.stream()
                .filter(person -> (person.getFirstName().length() + person.getLastName().length()) < 15)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .findFirst().get();
        System.out.println(name);*/

       /* list.forEach(str::append);  // вывести строку, конкатенацию чисел 2 метода
        System.out.println(str);*/

       /* String number = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(number);*/

        Map<String,Integer> map = new HashMap<>();
        map.put("gggg",1);
        map.put("dddddddd",1);
        map.put("cccccccc",1);
        int summa = map.entrySet()
                .stream()
                .filter(element -> element.getKey().length() > 7)
                .mapToInt(Map.Entry :: getValue)
                .sum();
        System.out.println(summa);
    }
}
