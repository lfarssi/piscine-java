import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        int[] nbrs =new int[args.length];
        for (int i =0; i<args.length ; i++){
            nbrs[i]= Integer.parseInt(args[i]);
        }
        // your code here
        Arrays.sort(nbrs);
        for (int i=0; i<nbrs.length; i++){
            System.out.print(nbrs[i]);
            if (i<nbrs.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}