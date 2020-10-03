class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("Class B");
    }    
}

class C extends A {
    @Override
    void show() {
        System.out.println("Class C");
    }
}

public class ExampleOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.show();
        b.show();
        c.show();
    }
}
