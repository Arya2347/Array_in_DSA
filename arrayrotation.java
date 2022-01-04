import java.util.*;
public class arrayrotation {
    public static void swap(int arr[],int i, int j){
        int temp=0;
        temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void reverse(int arr[], int i, int j){
        while(i<=j){
            swap(arr, i,j);
            i++;
            j--;
        }
    }
    public static void rotate(int arr[],int k){
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length, arr.length-1);
        reverse(arr, 0, arr.length-1);
    
    }
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        
    }
    
}
