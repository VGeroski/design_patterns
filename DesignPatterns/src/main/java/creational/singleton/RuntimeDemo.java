package creational.singleton;

public class RuntimeDemo {

    public static void main(String[] args) {

        Runtime singleRuntime = Runtime.getRuntime();

        // Calling garbage collector
        singleRuntime.gc();

        System.out.println(singleRuntime);

        Runtime anotherRuntime = Runtime.getRuntime();

        System.out.println(anotherRuntime);

        if (singleRuntime == anotherRuntime) {
            System.out.println("They are the same");
        }
    }
}
