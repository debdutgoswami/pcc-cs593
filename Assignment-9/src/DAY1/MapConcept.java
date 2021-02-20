package DAY1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapConcept {
    
    public static void main(String args []){
        Map<Integer, String> attendance = returnMapConcept();
        
        for(Map.Entry<Integer,String> entryset : attendance.entrySet()){
            System.out.println("Roll No: "+entryset.getKey()+" and Name: "+entryset.getValue());
        }
    }
    
    public static Map<Integer, String> returnMapConcept(){
        Scanner sc = new Scanner(System.in);
        
        Map<Integer, String> attendanceManager = new HashMap<Integer, String>();
        
        for(int i=0;i<5;i++) {
            System.out.println("Enter the Roll Number: ");
            int rno = sc.nextInt();
            System.out.println("Enter the Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            attendanceManager.put(rno,name);
        }
        return attendanceManager;
    }
}
