import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

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
    ArrayList<Subject> subs;
    String name, stream, college;
    int rollNo;

    Student(String name, String stream, String college, int rollNo, Object... args) {

        this.name = name;
        this.stream = stream;
        this.college = college;
        this.rollNo = rollNo;
        this.subs = new ArrayList<Subject>(args.length);
        for (Object arg : args)
            this.subs.add((Subject)(arg));
    }

    public String toString() {
        String str = "";
        for(Subject sub: this.subs) 
            str += String.valueOf(sub);
        return "Student <name = " + this.name + " roll no = " + this.rollNo + " stream = " + this.stream + " college = "
                + this.college + ">\n" + str;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
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
        Student student = new Student(name, stream, college, rollNo, new Subject("pcc-cs503", 80.0, 20.0),
                new Subject("pcc-cs593", 80.0, 20.0));
        System.out.println(student);
    }
}