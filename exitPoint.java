import java.util.*;

public class exitPoint {
    public static void exitpoint(int arr[][]) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        int m = arr[0].length;
        int dir = arr[i][j];
        while (true) {
            dir += arr[i][j];
            dir = dir % 4;
            if (dir == 0) {
                j++;
            }
            if (dir == 1) {
                i++;
            }
            if (dir == 2) {
                j--;
            }
            if (dir == 3) {
                i--;
            }if(i<0|| j<0||i>=n||j>=m){
                break;
            }
        }if(i<0){
            i++;
        }if(j<0){
            j++;
        }if(j>m){
            j--;
        }if(i>n){
            i--;
        }
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }
}
