package DAY1;

enum Directions {
    WEST("W"), EAST("E"), SOUTH("S"), NORTH("N");

    private String value;

    Directions(String nw) {
        this.value = nw;
    }

    @Override
    public String toString() {
        return "Directions{" +
                "value='" + this.value + '\'' +
                '}';
    }

    public String getValue() {
        return this.value;
    }
}

public class EnumConcept {
    public static void main(String[] args) {
        Directions d;
        d = Directions.EAST;
        System.out.println(d.getValue());
        System.out.println(d.ordinal());
        System.out.println(d.toString());
    }
}
