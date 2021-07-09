package example.myapp.example;

public class JavaRun {
    public static void runNow(String g, Runnable runnable) {
        System.out.println(g);
        runnable.run();
    }
}
