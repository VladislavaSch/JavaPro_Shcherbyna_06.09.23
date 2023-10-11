package shcherbyna.homeworks.homework10;

import java.util.*;

import static java.lang.reflect.Array.set;
import static shcherbyna.homeworks.homework10.Main.*;

public class Main {

    // Завдання 1
    public static int countOccurance (List a, String b) {
        int count = 0;
        for (Object s : a) {
            if (Objects.equals(s, b)) {
                count++;
            }
        }
        return count;
    }

    // Завдання 2

    public static List toList (int[] a){
        List <Integer> list = new ArrayList<>();
        for (int el : a) {
            list.add(el);
        }
        return list;
    }

    // Завдання 3

    public static List findUnique (List <Integer> a){
        Set <Integer> set = new LinkedHashSet<>(a);

        return new ArrayList<>(set);
    }

    // Завдання 4
    public static List<String> findOccurance (List<String> list) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : list) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            result.add("name: " + word + ", occurrence: " + count);
        }
        return result;
    }
}



class Main2 {
    public static void main(String[] args) {
        List<String> list  = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("First");
        list.add("First");
        list.add("First");
        list.add("First");
        list.add("First");
        list.add("Something");
        list.add("Something");


        System.out.println(countOccurance(list, "First"));

        List <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(3);
        list1.add(3);
        list1.add(4);
        list1.add(1);

        System.out.println(findUnique(list1));

        System.out.println(findOccurance(list));

    }
}
