import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import static

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<Person> names = new ArrayList<>();
        names.add(new Person("alaa", Gender.MALE));
        names.add(new Person("Mary", Gender.MALE));
        names.add(new Person("Leen", Gender.FEMALE));
        names.add(new Person("Julie", Gender.FEMALE));

        //----------------Declarative approach---------------------
        System.out.println("----------Declarative approach----------");
        List<Person> Females =  names.stream()
                .filter(person -> Gender.FEMALE.equals(person._gender))
                .collect(Collectors.toList());
                //.forEach(System.out::println);
        Females.forEach(p -> System.out.println(p));
        //---------------------------------------------------------


        //----------------Imperative approach --------------------
        System.out.println("---------Imperative approach-----------");

        List<Person> females = new ArrayList<>();

        for (Person person : names) {
            if(Gender.FEMALE == person._gender) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println(person);
        }
        //-----------------------------------------
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

    /**
     *
     */
    public enum Gender {
        MALE,FEMALE
    }
}
