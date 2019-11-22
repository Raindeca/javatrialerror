import java.util.Scanner;

/**
 * Student
 */
public class Student {
    static Scanner dt = new Scanner(System.in);

    private String jurusan[] = {"SI","TI","MI","SK","TK"};
    private String fName[] = new String[jurusan.length];
    private String lName[] = new String[jurusan.length];
    private String npm[] = new String[jurusan.length];
    private String fullname[] = new String[jurusan.length];
    private String subnpm[] = new String[jurusan.length];
    private String subAngkatan[] = new String[jurusan.length];
    String[] inputStudent() {

            for (int j = 0; j < jurusan.length; j++) {
                System.out.println("Input data ke-"+(j+1));
                System.out.print("Nama Depan\t: ");
                fName[j] = dt.nextLine();
                System.out.print("Nama Belakang\t: ");
                lName[j] = dt.nextLine();
                System.out.print("NPM\t: ");
                npm[j] = dt.nextLine();
                subnpm[j] = npm[j].substring(0, 3);
                subAngkatan[j] = npm[j].substring(3, 5);
                setnpm(npm);
                setsubnpm(subnpm);
                fullname[j] = fName[j].concat(lName[j]);
            }
        
        return fullname;
    }

    void setnpm(String[] npm) {
        this.npm = npm;
    }

    String[] getnpm() {
        return npm;
    }

    void setsubnpm(String[] subnpm) {
        this.subnpm = subnpm;
    }

    String[] getsubnpm() {
        return subnpm;
    }

    void setsubAngkatan(String[] subAngkatan) {
        this.subAngkatan = subAngkatan;
    }

    String[] getsubAngkatan() {
        return subAngkatan;
    }

}