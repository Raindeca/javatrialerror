import java.util.Scanner;

/**
 * DataInput
 */
public class DataInput {
    static Scanner dt = new Scanner(System.in);
    private String fname, lname, npm;

    public void dataInput() {
        StudentArray[] studentData = new StudentArray();
            for (int i = 0; i < 6; i++) {
                System.out.println("Dataset-"+(i+1));
                System.out.print("Nama Depan\t: ");
                fname=dt.nextLine();
                System.out.print("Nama Belakang\t: ");
                lname=dt.nextLine();
                System.out.print("NPM\t\t: ");
                npm=dt.nextLine();
                studentData[i].studentArray(fname, lname, npm);
            }
        }
}