package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
///

//Function<>   --.apply, .andThen
//BiFunction take 2 variable
//Consumer like void function --.accept
//BiConsumer
//Predicate --.test, .and  return bool
//BiPredicate take 2 var
//Supplier returns any kind of value you want

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("alaa", Gender.MALE));
        people.add(new Person("Mary", Gender.MALE));
        people.add(new Person("Leen", Gender.FEMALE));
        people.add(new Person("Julie", Gender.FEMALE));

        people.stream()
                .map(person -> person._gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);//gender -> System.out.println(gender)
    }

    static class Person {
        private final String _name;
        private final Gender _gender;

        Person(String name, Gender gender) {
            this._name = name;
            this._gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name'" + _name + '\'' + ", gender = " + _gender + '}';
        }

    }

    public enum Gender {
        MALE,FEMALE
    }
}
