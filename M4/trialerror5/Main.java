/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        DataInput dataset = new DataInput();
        Templete templete = new Templete();
        StudentArray[] dataStudent = new StudentArray();
        dataset.dataInput();
        templete.templete(dataStudent);

    }
}