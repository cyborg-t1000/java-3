package hw7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class MyTest {

    public static void start(String className) throws ClassNotFoundException {
        Class<?> cls = Class.forName(className);
        try {
            start(cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start(Class cls) throws InvocationTargetException, IllegalAccessException {
        int countBefore = 0;
        int countAfter = 0;
        List<Method>[] list = new List[12];
        for (int i = 0; i < list.length; i++) {
            list[i] = new LinkedList<>();
        }

        //collect methods

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                if (countBefore > 0) throw new RuntimeException("Only one @BeforeSuite allowed");
                countBefore++;
                list[0].add(m);
            }
            if (m.isAnnotationPresent(AfterSuite.class)) {
                if (countAfter > 0) throw new RuntimeException("Only one @AfterSuite allowed");
                countAfter++;
                list[11].add(m);
            }
            if (m.isAnnotationPresent(Test.class)) {
                list[m.getAnnotation(Test.class).priority()].add(m);
            }
        }

        // run methods

        for (List<Method> methodList : list) {
            for (Method m : methodList) {
                m.invoke(null);
            }
        }
    }
}
