/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Jurusan jurusan = new Jurusan();
        Templete templete = new Templete();

        templete.templete(student.inputStudent(), student.getnpm(), jurusan.cetakJurusan());
    }
}