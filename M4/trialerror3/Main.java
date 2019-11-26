/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        InputStudent input = new InputStudent();
        Templete templete = new Templete();
        StudentArray fullname = new StudentArray();
        StudentArray npm = new StudentArray();
        StudentArray angkatan = new StudentArray();
        Jurusan jurusan = new Jurusan();

        input.inputStudent();
        templete.templete(npm.getNpm(), fullname.getFullname() , jurusan.findJurusan(), angkatan.getsubAngkatan());
    }
}