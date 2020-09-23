import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {
    int id;
    String name;
    double height, width, amount;

    Tree(int id, String name, double height, double width, double amount) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.width = width;
        this.amount = amount;
    }

    void annualUpdate(double height, double width, double amount) {
        this.height = height;
        this.width = width;
        this.amount = amount;
    }

    public String toString() {
        return "id = " + this.id + " name = " + this.name + " height = " + this.height + " width = " + this.width
                + " amount = " + this.amount;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter: ");
        int id = Integer.parseInt(buf.readLine());
        String name = buf.readLine();
        double height = Double.parseDouble(buf.readLine());
        double width = Double.parseDouble(buf.readLine());
        double amount = Double.parseDouble(buf.readLine());

        Tree obj = new Tree(id, name, height, width, amount);
        System.out.println("Tree: " + obj);

    }
}
