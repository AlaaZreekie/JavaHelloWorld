package FunctionalInterfaace;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        GreetCustomer(new Customer("Maria", "0998653381"));
        GreetCustomerConsumer.accept(new Customer("alaa", "0998653381"));
    }

    //Function<>   --.apply, .andThen
    //BiFunction take 2 variable
    //Consumer like void function --.accept
    //BiConsumer
    //Predicate --.test, .and  return bool
    //BiPredicate take 2 var
    //Supplier returns any kind of value you want


     static Consumer<Customer> GreetCustomerConsumer = customer ->
            System.out.println("Hello " + customer._name + ", thanks for registering phone number " + customer._phoneNumber);

    static void GreetCustomer(Customer customer) {
        System.out.println("Hello " + customer._name + ", thanks for registering phone number " + customer._phoneNumber);
    }
    static class Customer {
        private final String _name;
        private final String _phoneNumber;

        Customer(String name, String phoneNumber) {
            this._name = name;
            this._phoneNumber = phoneNumber;
        }
    }
}
