package Gun46;

public class S18 {
    public static void main(String[] args) {
        String[][] chs=new String[5][2]; // 5 satır, her satır 2 eleman
        chs[0]=new String[2]; // 0,1
        chs[1]=new String[5];
        int i=97;

        System.out.println("chs.length = " + chs.length); // 5
        System.out.println("chs[0].length = " + chs[0].length); //2
        System.out.println("chs[1].length = " + chs[1].length); //5
        System.out.println("chs[2].length = " + chs[2].length); //2
        System.out.println("chs[3].length = " + chs[3].length); //2
        System.out.println("chs[4].length = " + chs[4].length); //2

        for (int a = 0; a < chs.length; a++) { // 5 a:0,1,2,3,4

            for (int b = 0; b < chs.length; b++) { // 5 b: 0,1,2,3,4
                chs[a][b]=" "+i; // b ancak 0 ve 1 olabilir
                i++;
            }

        }

        for (String[] ca:chs){
            for (String c:ca){
                System.out.print(c+" ");
            }
            System.out.println();
        }



    }


}
