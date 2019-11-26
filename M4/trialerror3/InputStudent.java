import java.util.Scanner;

/**
 * InputStudent
 */
public class InputStudent {
    static Scanner dt = new Scanner(System.in);
    
    private String jurusan[] = {"SI","TI","MI","SK","TK"};
    private String fname[] = new String[jurusan.length];
    private String lname[] = new String[jurusan.length];
    private String fn[] = new String[jurusan.length];
    private String npm[] = new String[jurusan.length];
    private String subangkatan[] = new String[jurusan.length];
    private String subjurusan[] = new String[jurusan.length];

    void inputStudent() {
        StudentArray npmarray = new StudentArray();
        StudentArray fullname = new StudentArray();
        StudentArray setjurusan = new StudentArray();
        StudentArray setAngkatan = new StudentArray();
        for (int i = 0; i < jurusan.length; i++) {
            System.out.println("Dataset-"+(i+1));
            System.out.print("Nama Depan\t: ");
            fname[i] = dt.nextLine();
            System.out.print("Name Belakang\t: ");
            lname[i] = dt.nextLine();
            fn[i] = fname[i].concat(lname[i]);
            fullname.setfullname(fn);

            System.out.print("NPM\t:");
            npm[i] = dt.nextLine();
            npmarray.setNpm(npm);
            subjurusan[i] = npm[i].substring(0, 3);
            setjurusan.setSubJurusan(subjurusan);
            subangkatan[i] = npm[i].substring(3, 5);
            setAngkatan.setsubAngkatan(subangkatan);
            
        }
    }
    
}