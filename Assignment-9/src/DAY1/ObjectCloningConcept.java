package DAY1;

public class ObjectCloningConcept {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone num = new TestClone();
        
        TestClone numEquals = num;
        TestClone numClone = (TestClone) num.clone();
        
        if(num.equals(numEquals)){
            System.out.println("Equals");
        }
        
        if(num.equals(numClone)){
            System.out.println("Equals Clone");
        }

        System.out.println(num);
        System.out.println(numEquals);
        System.out.println(numClone);
    }
    
    public static class TestClone implements Cloneable{
        public TestClone(){}

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
