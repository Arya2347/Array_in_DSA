import java.util.*;

public class Rotateby90degree {
    public static void transpose(int arr[][]){
        for(int i=0; i<=arr.length; i++){
            for(int j=i; j<=arr[0].length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void reverse(int arr[][]){
        for(int i=0; i<=arr.length; i++){
            int li=0;
            int ri=arr[i].length;
            while(li<=ri){
            int temp= arr[i][li];
            arr[i][li]= arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;
        }
    }
}
public static void display(int arr[][]){
    for(int i=0; i<=arr.length; i++){
        for(int j=0; j<=arr[0].length; j++){
            System.out.println(arr[i][j]+" ");
        }
    }System.out.println();
}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                arr[i][j] = scn.nextInt();
            }
            transpose(arr);
            reverse(arr);
            display(arr);
        }
    }

}
