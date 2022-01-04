import java.util.*;

public class subsetOfarray {
    public static void subset(int arr[]) {
        int n = arr.length;
        int total = (int) Math.pow(2, n);
        for (int i = 0; i < arr.length; i++) {
            String str = " ";
            int temp=0;
            for (int j = n - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0) {
                    str = "_\t" + str;
                }else{
                    str=arr[j]+" \t"+str;
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        subset(arr);
    }
}
