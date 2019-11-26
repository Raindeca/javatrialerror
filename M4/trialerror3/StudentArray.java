/**
 * StudentArray
 */
public class StudentArray {
    private String fullname[];
    private String npm[];
    private String subjurusan[];
    private String subAngkatan[];

    void setNpm(String[] npm) {
        this.npm = npm;
    }

    String[] getNpm() {
        return npm;
    }

    void setfullname(String[] fullname) {
        this.fullname = fullname;
    }

    String[] getFullname() {
        return fullname;
    }

    void setSubJurusan(String[] subjurusan) {
        this.subjurusan = subjurusan;
    }

        String[] getSubJurusan() {
        return subjurusan;
    }

    void setsubAngkatan(String[] subAngkatan) {
        this.subAngkatan = subAngkatan;
    }

    String[] getsubAngkatan() {
        return subAngkatan;
    }
}