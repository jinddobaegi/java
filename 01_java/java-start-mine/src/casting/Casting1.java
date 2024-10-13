package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intVal = 10;
        long longVal;
        double doubleVal;

        longVal = intVal;
        System.out.println(longVal);

        doubleVal = intVal;
        System.out.println(doubleVal);

        doubleVal = 20L;
        System.out.println(doubleVal);

        doubleVal = (double) 10;
        System.out.println(doubleVal);
    }
}
