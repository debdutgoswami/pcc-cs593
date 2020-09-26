import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Subject {
    String title;
    double internal, theory;

    Subject(String title, double internal, double theory) {
        this.title = title;
        this.internal = internal;
        this.theory = theory;
    }

    public String toString() {
        return ("Subject <title = " + this.title + "; internal marks = " + this.internal + " theory = " + this.theory
                + ">\n");
    }
}

public class Student {
    Subject[] subs = new Subject[6];
    String name, stream, college;
    int rollNo;

    Student(String name, String stream, String college, int rollNo, Subject[] subs) {
        this.name = name;
        this.stream = stream;
        this.college = college;
        this.rollNo = rollNo;
        for (int i = 0; i < 6; i++)
            this.subs[i] = subs[i];
    }

    public String toString() {
        return "Student <name = " + this.name + " roll no = " + this.rollNo + " stream = " + this.stream + " college = "
                + this.college + ">";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Subject[] subs = new Subject[6];
        String name, stream, college;
        int rollNo;
        System.out.print("Name: ");
        name = buf.readLine();
        System.out.print("Stream: ");
        stream = buf.readLine();
        System.out.print("College: ");
        college = buf.readLine();
        System.out.print("Roll no: ");
        rollNo = Integer.parseInt(buf.readLine());
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1));
            System.out.print("Title: ");
            String title = buf.readLine();
            System.out.print("Internal Marks: ");
            double internal = Double.parseDouble(buf.readLine());
            System.out.print("Theory Marks: ");
            double theory = Double.parseDouble(buf.readLine());
            subs[i] = new Subject(title, internal, theory);
        }
        Student student = new Student(name, stream, college, rollNo, subs);
        System.out.println(student);
    }
}