package Gun46;

public class S71 {
    public static void main(String[] args) {
        int[][] arr= new int[2][4];

        arr = new int[][]{
                {1,3,5,7},  //arr[0]
                {1,3}       //arr[1]
        }; // bu bölüm aşağıdaki 2 satır ile aynı işlemi yapar

        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};

       // arr.length nedir?  Satır sayısı
       // a[i].length  nedir ?  satırdaki eleman sayısı

        for(int[] a : arr){ // a=1,3,5,7  -> a=1,3

            for (int i = 0; i < arr.length ; i++) { // arr.length satır sayısı
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}
