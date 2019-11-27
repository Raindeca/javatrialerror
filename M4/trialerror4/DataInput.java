import java.util.Scanner;

/**
 * DataInput
 */
public class DataInput {
    static Scanner dt = new Scanner(System.in);
    public StudentArray[] dataInput(int tData) {
        StudentArray[] studentData = new StudentArray(tData);
        final String fname,lname,npm;
        for (int i = 0; i < tData; i++) {
            System.out.println("Dataset-"+(i+1));
            System.out.print("Nama Depan\t: ");
            fname=dt.nextLine();
            System.out.print("Nama Belakang\t: ");
            lname=dt.nextLine();
            System.out.print("NPM\t\t: ");
            npm=dt.nextLine();

            StudentArray[i] = studentData = new StudentArray(fname,lname,npm);
        }
        return StudentArray;
    }
}