import java.util.Scanner;
/**
 * DataInput
 */
public class DataInput {
    static Scanner dt = new Scanner(System.in);
    private String fname, lname, npm;
		
    public StudentArray[] fetchData() {
        System.out.print("Dataset\t: ");
        int n = Integer.parseInt(dt.nextLine());
        StudentArray[] studentData = new StudentArray[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Dataset-"+(i+1));
            System.out.print("Nama Depan\t: ");
            fname = dt.nextLine();
            System.out.print("Nama Belakang\t: ");
            lname = dt.nextLine();
            System.out.print("NPM\t\t: ");
            npm = dt.nextLine();
            
            studentData[i] = new StudentArray(fname, lname, npm);
        }
      
      	return studentData;
    }
}
