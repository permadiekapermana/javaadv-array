public class Array2d {
    public static void main(String[] args) {
        System.out.println("Contoh 1 :");
        int[][] matriks = {{0,1},{1,2},{2,3},{3,4},{4,5}};
        for(int i=0;i<matriks.length;i++) {
            for(int j=0;j<matriks[i].length;j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Contoh 2 :");
        int matriks2[][] = {{0,1},{1,2},{2,3},{3,4},{4,5}};
        for(int i=0;i<matriks2.length;i++) {
            for(int j=0;j<matriks2[i].length;j++) {
                System.out.print(matriks2[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Contoh 3 :");
        int matriks3[][] = new int[2][2];		
        for(int i=0;i<matriks3.length;i++) {
            for(int j=0;j<matriks3[i].length;j++) {
                if(i == 0) {
                    matriks3[i][j] = 1; 
                } else {
                    matriks3[i][j] = 2;
                }
                System.out.print(matriks3[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Contoh 4 :");
        int matriks4[][] = new int[][]{{0,1},{1,2}};		
        for(int i=0;i<matriks4.length;i++) {
            for(int j=0;j<matriks4[i].length;j++) {
                System.out.print(matriks4[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
