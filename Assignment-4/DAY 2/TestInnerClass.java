public class TestInnerClass {
    static class InnerClass {
        static void innerTest() {
            System.out.println("This is Inner Test from Inner Class!");
            outerTest();
        }
    }
    static void outerTest() {
        System.out.println("This is Outer Test from Outer Class!!");
    }
    public static void main(String[] args) {
        // innerTest(); // this will return an error
        InnerClass obj = new InnerClass();
        obj.innerTest();
    }
}
