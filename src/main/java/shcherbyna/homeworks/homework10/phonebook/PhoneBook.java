package shcherbyna.homeworks.homework10.phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static shcherbyna.homeworks.homework10.phonebook.PhoneBook.*;

public class PhoneBook {

    private static List <String> people = new ArrayList<>();

    public static void add (Record person) {
        String name = person.name;
        long tel = person.tel;
        people.add("Name: " + name + ", Telephone: " + tel);
    }

    public static String find(String name) {
        for (String a: people) {
            if (a.contains(name)){
                return a;
            }
        }
        return null;
    }

    public static List findAll(String name) {
        List <String> list = new ArrayList<>();
        for (String a: people) {
            if (a.contains(name)) {
                list.add(a);
            }
        }
        if (list.isEmpty()){
            return null;
        }
        return list;
    }

}

class Record{
     String name;
     long tel;

    public Record(String name, long tel) {
        this.name = name;
        this.tel = tel;
    }
}

class Main{
    public static void main(String[] args) {

        Record person1 = new Record("Lisa", 380954556615L);
        Record person2 = new Record("Alex", 380995861122L);
        Record person3 = new Record("Rita", 380999999999L);
        Record person4 = new Record("Max", 380955555555L);
        Record person5 = new Record("Tom", 380955555555L);
        Record person6 = new Record("Max", 380955931555L);
        Record person7 = new Record("George", 38095675655L);
        Record person8 = new Record("Lina", 380958765555L);
        Record person9 = new Record("Lisa", 380955543255L);
        Record person10 = new Record("Alex", 380943285455L);
        Record person11 = new Record("Max", 380956785655L);

        add(person1);
        add(person2);
        add(person3);
        add(person4);
        add(person5);
        add(person6);
        add(person7);
        add(person8);
        add(person9);
        add(person10);
        add(person11);

        System.out.println(find("Max"));
        System.out.println(findAll("Lisa"));
    }
}
