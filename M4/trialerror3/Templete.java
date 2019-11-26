/**
 * Templete
 */
public class Templete {

    void templete(String[] npm,String[] fullname, String[] jurusan, String[] angkatan) {

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

        for (int i = 0; i < 6; i++) {
            System.out.format("%15s%25s%10s%10s", npm[i], fullname[i], jurusan[i],
                    angkatan[i]);
        }
    }
}