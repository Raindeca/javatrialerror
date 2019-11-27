/**
 * Jurusan
 */
public class Jurusan {
    public String jurusan(String npm) {
        String find = npm.substring(0, 3);

        switch (find) {
            case "110":
                return "SI";
            case "510":
                return "TI";
            case "111":
                return "MI";
            case "310":
                return "SK";
            case "311":
                return "TK";
            default:
                return "N/a";
        }
    }
}
