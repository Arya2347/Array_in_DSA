import java.util.*;
public class reverseofArray {
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        i++;
        j--;
    }
    public static void main(String[] args) {
        
    }
}
