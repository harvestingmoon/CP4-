import java.util.*;

public class eligbility {
    private void run() {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            String name = sc.next();
            String stu = sc.next();
            String dob = sc.next();
            int courses = sc.nextInt();
            int eli = 0;
            if (Integer.parseInt(stu.substring(0,4)) >= 2010) {
                eli = 1;
            }
            else if (Integer.parseInt(dob.substring(0,4)) >= 1991) {
                eli = 1;
            }
            else if (courses >= 41){ 
                eli = 0;
            }   
            else {
                eli = 2;
            }
            
            System.out.println(name + " ");
            if (eli == 1) {
                System.out.println("eligible");
            }
            else if (eli == 0) {
                System.out.println("ineligible");


            }
            else {
                System.out.println("coach petitions");
            }
        }
        
    }   
    public static void main(String[] args) {
        eligbility obj = new eligbility();
        obj.run();
    } 
}
