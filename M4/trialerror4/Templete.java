/**
 * Templete
 */
public class Templete {

    void templete(StudentArray[] studentData) {
        System.out.println();
        System.out.println();
        System.out.format("%35s", "DATA PESERTA");
        System.out.println();
        System.out.format("%50s", "PELATIHAN PEMROGRAMAN JAVA");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.format("%15s%25s%10s%10s", "NPM", "Nama Lengkap", "Jurusan", "Angkatan");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < studentData.length; i++) {
            final String npm = studentData[i].studenArray.npm;
            final String fullname = studentData[i].studenArray.fullname;
            final String jurusan = studentData[i].studenArray.jurusan;
            final String angkatan = studentData[i].studenArray.angkatan;

            System.out.format("%15s%25s%10s%10s",npm,fullname,jurusan,angkatan);
            
        }
    }
}