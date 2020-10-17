interface Check {
    void disp(); 
    int x=20,y=40; 
}

class Anno { 
    Check test(){ 
        return new Check() { 
            public void disp(){ 
                System.out.println("Product is: "+(x+y)); 
            } 
        }; 
    } 
}

public class DemonstrateAnnonymousInnerClass {
    public static void main(String[] args) { 
        Anno obj=new Anno(); 
        obj.test().disp(); 
    }
}
