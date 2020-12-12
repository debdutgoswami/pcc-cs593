
class ExceptionF extends Exception {
    public String toString() {
        return "MultipleExceptionExample.ExceptionF: Exception for f";
    }
}
class ExceptionG extends Exception {
    public String toString() {
        return "MultipleExceptionExample.ExceptionG: Exception for G";
    }
}

public class MultipeExceptionExample {
    void f() throws ExceptionF {
        throw new ExceptionF();
    }
    void g() throws ExceptionG {
        try {
            this.f();
        }catch (ExceptionF e){
            throw new ExceptionG();
        }
    }
    public static void main(String[] args) throws Exception {
        MultipeExceptionExample obj = new MultipeExceptionExample();
        obj.g();
    }
}