class Test {
    int x;

    Test(int x) {
        this.x = x;
    }

    void show(Test obj) {
        System.out.println(obj.x);
    }

    public static void main(String[] args) {
        Test t = new Test(12);
        t.show(t);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Test t = new Test(22);
        t.show(t);
    }
}
