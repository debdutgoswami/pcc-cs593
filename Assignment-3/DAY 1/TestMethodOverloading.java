class MethodOverloading {
    String testingMethodOverriding(int a) {
        return "test";
    }
    // double testingMethodOverriding(int a) {
    //     // this is an error
    //     return 0.0;
    // }
    double testingMethodOverriding(double a) {
        // this is correct method overriding as the function signature is different
        return a;
    }
}

public class TestMethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        Double d = obj.testingMethodOverriding(0.0);
    }
}
