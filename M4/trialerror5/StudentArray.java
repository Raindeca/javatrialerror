/**
 * StudentArray
 */
public class StudentArray {
    private String fname,lname,fullname,npm,jurusan,angkatan;

    public studentArray(String fname, String lname, String npm) {
        Jurusan find = new Jurusan();
        this.fname = fname;
        this.lname = lname;
        this.fullname = fname.concat(" "+lname);
        this.npm = npm;
        this.jurusan = find.jurusan(npm);
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