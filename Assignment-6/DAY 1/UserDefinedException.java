class PayOutOfBoundsException extends Exception {
    double expected;
    PayOutOfBoundsException (double expected) {
        this.expected = expected;
    }

    public String toString() {
        return ("UserDefinedException.PayOutOfBoundException: Monthly Salary is less than 10,000/-, found " + this.expected);
    }
}

public class UserDefinedException {
    public static void printf(double sal) throws PayOutOfBoundsException {
        if (sal < 10000.00)
            throw new PayOutOfBoundsException(sal);
        System.out.println("Salary is " + sal);
    }
    public static void main(String[] args) {
        try {
            printf(12000.00);
            printf(999.01);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
