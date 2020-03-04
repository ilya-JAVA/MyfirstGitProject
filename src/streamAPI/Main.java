package streamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        int[] array = {-34, 32, 65, -78, -5, 29, 100};
//        for (int number : array){
//            if (number > 0) {
//                System.out.println(number);
//            }
//        }
//        System.out.println("Stream");
//        Stream<Integer> stream = Stream.of(-34, 32, 65, -78, -5, 29, 100);
//        stream
//                .filter(s -> s > 0)
//                .filter(s -> s % 2 == 0)
//                .forEach(System.out::println);

        int[] arr = new int[]{4, 56, 77, 544, 99};


//        stringArrayList.stream()
//                .filter(s -> s.length() >= 5)
//                .forEach(System.out::println);
//
//        stringArrayList.stream()
//                .filter(s -> s.length() <= 5)
//                .forEach(System.out::println);
//
//        IntStream intStream = IntStream.of(5, 6, 67, -76, 23, -149, 77);
//        LongStream longStream = LongStream.of(4545, 56756, 56565);

//        ArrayList<String> stringArrayList = new ArrayList<>();
//        Collections.addAll(stringArrayList, "Andrei", "Ilya", "Maxim", "Yakov", "Mikalai");
//        Stream<String> streamString = stringArrayList.stream();
//
//        streamString
//                .sorted((s1, s2) -> s1.length() - s2.length())
//                .forEach(System.out::println);
//
//        System.out.println();
//
//        Stream<Integer> stream = Stream.of(5, 6, 67, -76, 23, -149, 77);
//        stream
//                .sorted((n1, n2) -> Integer.compare(n1, n2))
//                .forEach(System.out::println);

//        System<String> userStream = Stream.of(new User("Petia13", 18),
//                new User("Petia21", 10),
//                new User("Petia3", 4),
//                new User("Petia94", 80),
//                new User("Petia35", 78)
//        );
//
//        userStream
//                .forEach(user -> System.out.println(user.getName()));
//
//        userStream
//                .sorted((u1, u2) -> u1.getName().compareTo(u2.getName()))
////                .sorted(Comparator.comparing(User::getName))
//                .forEach(System.out::println);
//    }
//}
//
//class User{
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
//        Optional<Integer> optional = integerStream.reduce((a, b) -> a - b);
//        System.out.println(optional.get());

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentrnce = wordsStream.reduce((x, y)-> x + " " + y);
        System.out.print(sentrnce.get());
        System.out.println(".");
    }
}