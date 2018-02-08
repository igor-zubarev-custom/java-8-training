package selfcheck.ex2;

public class Ex2 {
    public static Runnable uncheck (RunnableWithException source) {
        return () -> {
            try {
                source.run();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
