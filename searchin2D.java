import java.util.*;

public class searchin2D {
    public static void searchin2Darray(int arr[][], int r) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= arr.length && j >= 0) {
            if (r == arr[i][j]) {
                System.out.print(i);
                System.out.print(j);
                return;
            } else if (r < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int r = scn.nextInt();
    }
}
