package hw7;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            MyTest.start(TestMe.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
