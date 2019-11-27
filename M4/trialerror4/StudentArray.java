/**
 * StudentArray
 */
public class StudentArray {
    private String fname,lname,fullname,npm,jurusan,angkatan;

    public studenArray(String fname,String lname,String npm) {
        jurusan find = new Jurusan();
        this.fname = fname;
        this.lname = lname;
        this.fullname = fname.concat(" "+lname);
        this.npm = npm;
        this.jurusan = find.jurusan(npm);
        this.angkatan = npm.substring(3, 5);
    }
}