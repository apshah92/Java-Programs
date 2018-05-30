/*
 * Student's Name:Arpan Shah
 * Student Id: 31419228
 * Student Section:M.S.Eletrical & Computer Engineering
 */

public class Main {

    public static void main(String[] args) {

        int n = args.length == 1 ? Integer.parseInt(args[0]) : 1;

        for (int i = 1; i <= n; ++i) {
            int[] arr = Pascal.triangle(i);
            System.out.print((i < 10 ? " " : "") + i + ": ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

class Pascal {

    public static int[] triangle(int n) {
    		int[] pascal_row=new int[n];
    		int i;
    		for(i=0;i<n;i++){
    			pascal_row[i]=pascal_value(n-1,i);
    		}
    		return pascal_row;
        
    }
    
    public static int pascal_value(int i, int j) {
        if ((j == 0)||(j==i)) {
            return 1;
        } 
        else {
            return pascal_value(i - 1, j - 1) + pascal_value(i-1, j);
        }
  }
    
}