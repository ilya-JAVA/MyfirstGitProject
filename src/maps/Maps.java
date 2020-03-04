package maps;

import java.util.*;

import static java.util.Spliterators.iterator;

public class Maps {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("age1", 17);
//        map.put("age2", 18);
//        map.put("age3", 19);
//        map.put("age4", 10);
//        map.put("age5", 10);
//        map.put("age6", 10);
//
//        System.out.println(map.containsValue(17));
//        System.out.println(map.containsValue(18));
//        System.out.println(map.containsValue(19));
//        System.out.println(map.containsValue(10));
//
//        Set<String> key = map.keySet();
//        for (String str : key) {
//            System.out.println(str);
//        }
//        map.clear();
//        System.out.println("Новый сет ключей");
//
//        Set<String> keyTwo = map.keySet();
//        for (String str : key) {
//            System.out.println(str);
//        }
//        List<String> arrayList = new ArrayList<>();
//        List<String> arrayList2 = new Vector<>();


//        ArrayList<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("one");
//        stringArrayList.add("two");
//        stringArrayList.add("three");
//        stringArrayList.add("four");
//        stringArrayList.add("five");
//        stringArrayList.add("six");
//
//
//        ListIterator<String> iterator = stringArrayList.listIterator();
//        while (iterator.hasPrevious()) {
//            System.out.println(iterator.previous());
//        }
//
//        for (String str : stringArrayList){
//            System.out.println(str);
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);
        integerQueue.add(6);
        integerQueue.remove();
        System.out.println();
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.peek());
        System.out.println(integerQueue.peek());

//        for (int i : integerQueue) {
//            System.out.println(i);
//        }
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
//        System.out.println(integerQueue.poll());
//        integerQueue.remove();
//        System.out.println();
//        for (int i : integerQueue) {
//            System.out.println(i);
//        }
//        integerQueue.remove();
//        System.out.println();
//        for (int i : integerQueue) {
//            System.out.println(i);
        }
    }

