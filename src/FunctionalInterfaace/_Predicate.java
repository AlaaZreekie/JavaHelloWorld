package FunctionalInterfaace;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        boolean isPhoneNumber = IsPhoneNumberValid("099");
        System.out.println(isPhoneNumber);

        System.out.println(IsPhoneNumberPredicate.test("0998653381"));
        System.out.println(IsPhoneNumberPredicate.test("098653381"));

    }


    static Predicate<String> IsPhoneNumberPredicate = phoneNumber ->
            phoneNumber.startsWith("09") && phoneNumber.length() == 10;
    static boolean IsPhoneNumberValid(String phoneNumber) {
        return  phoneNumber.startsWith("09") && phoneNumber.length() == 10;
    }
}
