class SameClass {
    int x;

    SameClass(int x) {
        this.x = x;
    }

    public static SameClass getObj() {
        return new SameClass(23);
    }

    public static void main(String[] args) {
        SameClass same = getObj();
        System.out.println(same.x);
    }
}
