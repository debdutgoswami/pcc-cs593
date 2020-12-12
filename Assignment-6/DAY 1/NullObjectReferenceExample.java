class ExampleRef {
    void printf() {
        System.out.println("Hello World");
    }
}

public class NullObjectReferenceExample {
    public static void main(String[] args) {
        ExampleRef obj = new ExampleRef();
        obj = null;
        try {
            obj.printf();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
