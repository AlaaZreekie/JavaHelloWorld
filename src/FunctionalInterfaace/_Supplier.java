package FunctionalInterfaace;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(GetDBConnectionUrl());
        System.out.println("Supplier Functional Interface " + GetDBConnectionUrlSupplier.get());
    }

    static Supplier<String> GetDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
    static String GetDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
