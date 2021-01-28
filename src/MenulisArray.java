public class MenulisArray {
    public static void main(String[] args) {
        // array di deklarasikan dengan [], bisa pada tipe data bisa nama variabel
        // pada tipe data
        String[] mahasiswa;
        // pada nama var
        String mahasiswa1[];

        // menulis array 1 dimensi, isi array belum di deklarasikan, namun dideklarasikan dengan isi 5 index
        String[] mahasiswa3 = new String[5];
        // menulis array dengan deklarasi isi pada array
        String[] mahasiswa4 = new String[]{"permadi", "eka", "permana"};

        // isi array mahasiswa4
        System.out.println("Daftar Mahaiswa dalam Array 1D");
        System.out.println(mahasiswa4[0]);
        System.out.println(mahasiswa4[1]);
        System.out.println(mahasiswa4[2] + "\n");

        // array 2 dimensi
        int[][] matrix = new int[3][3];
        // array 2 dimensi dengan value
        int[][] matrix2 = new int[][]{
            {0,1},
            {1,2},
            {2,3},
            {3,4}
        };

        // isi array matrix 2
        System.out.println("Isi Array Matrix 2D");
        System.out.println(matrix2[0][0] + " " + matrix2[0][1]);
        System.out.println(matrix2[1][0] + " " + matrix2[1][1]);
        System.out.println(matrix2[2][0] + " " + matrix2[2][1]);
        System.out.println(matrix2[3][0] + " " + matrix2[3][1]);
    }
}