
/**
 * StudentArray
 */
public class StudentArray {
    private String fname,lname,fullname,npm,jurusan,angkatan;
    
    private enum Jurusan {
        SI,
        TI,
        MI,
        NA
    }

    public Jurusan selectJurusan(String npm) {
        String find = npm.substring(0, 3);

        switch (find) {
            case "110":
                return Jurusan.SI;
            case "510":
                return Jurusan.TI;
            case "111":
                return Jurusan.MI;
            // case "310":
            //     return "SK";
            // case "311":
            //     return "TK";
            default:
                return Jurusan.NA;
        }
    }

    public StudentArray(String fname, String lname, String npm) {
        this.fname = fname;
        this.lname = lname;
        this.fullname = fname.concat(" " + lname);
        this.npm = npm;
        this.jurusan = this.selectJurusan(npm);
        this.angkatan = npm.substring(3, 5);
    }

    public String getfullname() {
        return fullname;
    }

    public String getnpm() {
        return npm;
    }

    public String getjurusan() {
        return jurusan;
    }

    public String getangkatan() {
        return angkatan;
    }
}
