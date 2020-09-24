public class First {
    int x;

    First(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("Printing");
    }

}

public class DifferentClass {
    public static void main(String[] args) {
        First obj = new First(12);
        System.out.println(obj.x);
        obj.show();
    }
}
