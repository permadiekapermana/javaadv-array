public class Array1d {
    public static void main(String[] args) {
        System.out.println("Contoh 1 :");
        String[] array = {"Permadi","Eka","Permana"};
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nContoh 2 :");
        String array2[] = {"Permadi","Eka","Permana"};
        for(int i=0;i<array2.length;i++) {
            System.out.println(array2[i] + " ");
        }

        System.out.println("\n\nContoh 3 :");
        String[] array3 = new String[]{"Hello","World"};
        for(int i=0;i<array3.length;i++) {
            if(i == 0) {
                array3[i] = "Hello";
            } else {
                array3[i] = "World";
            }
            System.out.print(array3[i] + " ");
        }
    

    }
}
