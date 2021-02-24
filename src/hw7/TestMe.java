package hw7;

public class TestMe {
    @BeforeSuite
    public static void test_start() {
        System.out.println("Run on start");
    }

    @Test
    public static void test1() {
        System.out.println("Test 1, priority default (5)");
    }

    @Test(priority = 9)
    public static void test2() {
        System.out.println("Test 2, priority 9");
    }

    @Test(priority = 1)
    public static void test3() {
        System.out.println("Test 3, priority 1");
    }

    @Test(priority = 3)
    public static void test4() {
        System.out.println("Test 4, priority 3");
    }

    @AfterSuite
    public static void test_end() {
        System.out.println("Finish");
    }

}
