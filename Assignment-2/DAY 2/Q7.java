class Test {
    int x;

    Test(int x) {
        this.x = x;
    }
}

public class Q7 {
    public static Test getObj() {
        return new Test(23);
    }

    public static void main(String[] args) {
        Test t1 = getObj();
        System.out.println(t1.x);
    }
}
