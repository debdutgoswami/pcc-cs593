public class StaticNonstatic {
    int id;
    static String name = "Static Non-static";

    StaticNonstatic(int id) {
        this.id = id;
    }

    public String toString() {
        return "id = " + this.id + " name = " + StaticNonstatic.name;
    }

    public static void main(String[] args) {
        StaticNonstatic obj1 = new StaticNonstatic(12);
        StaticNonstatic obj2 = new StaticNonstatic(13);
        System.out.println("OBJ1 = " + obj1);
        System.out.println("OBJ2 = " + obj2);
    }
}
