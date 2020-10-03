class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return "id = " + this.id + "; name = " + this.name + ";";
    }
}

class Scientist extends Employee {
    int no_of_publication;
    String experience;
    Scientist (int id, String name, int no_of_publication, String experience) {
        super(id, name);
        this.no_of_publication = no_of_publication;
        this.experience = experience;
    }
    public String toString() {
        return super.toString() + " publications = " + this.no_of_publication + "; experience = " + this.experience + ";";
    }
}

public class DScientist extends Scientist {
    String award;
    DScientist(int id, String name, int no_of_publication, String experience, String award) {
        super(id, name, no_of_publication, experience);
        this.award = award;
    }
    public String toString() {
        return super.toString() + " awards = " + this.award + ";";
    }
    public static void main(String[] args) {
        DScientist ds = new DScientist(1, "Aalpha", 12, "Senior Scientist", "Employee of the month");
        System.out.println(ds);
    }
}