/**
 * Templete
 */
public class Templete {
    void templete(String[] npm, String[] fullname, String jurusan) {
        Student angkatan = new Student();
        String angkatanke[] = angkatan.getsubAngkatan();
        
        System.out.println();
        System.out.println();
        System.out.format("%50s", "DATA PESERTA");
        System.out.println();
        System.out.format("%50s", "PELATIHAN PEMROGRAMAN JAVA");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.format("%15s%25s%10s%10s", "NPM", "Nama Lengkap", "Jurusan", "Angkatan");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        
            for (int j = 0; j < 4; j++) {
                System.out.format("%15s%25s%10s%10s", npm[j], fullname[j],jurusan,angkatanke[j]);
                System.out.println();
            }

    }
}