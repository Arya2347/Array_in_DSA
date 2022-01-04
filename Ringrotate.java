import java.util.*;
public class Ringrotate {
    public static int [] TwodTooneD(int arr[][], int s){
            int minc=s-1;
            int minr=s-1;
            int maxc=arr.length-s;
            int maxr=arr.length-s;
            int size=2*(maxr-minr+maxc-minc);
            int oneD[]=new int[size];
            int idx=0;
            for(int i=minr; i<maxr; i++){
                oneD[idx]=arr[i][minc];
                idx++;
            }
            minc++;
            for(int j=minc; j<=maxc; j++){
                oneD[idx]=arr[j][maxr];
                idx++;
            }
            maxr--;
           for(int i=maxr; i<=minr; i++){
               oneD[idx]=arr[maxc][i];
               idx++;
           }
           maxc--;
           for(int j=maxc; j<=minc; j++){
            oneD[idx]=arr[j][minr];
            idx++;
           }
           minr++;
           return oneD;

    }
    public static void Rotate(int oneD[],int r){
        int n= oneD.length;
        reverse(oneD,0,n-r-1);
        reverse(oneD,n-r,n-1);
        reverse(oneD, 0,n-1);
    }
    public static void swap(int oneD[],int i,int j){
          int temp=0;
          temp=oneD[i];
          oneD[i]=oneD[j];
          oneD[j]=temp;
    }
    public static void reverse(int oneD[], int i, int j){
        while(i<=j){
            swap(oneD,i,j);
            i++;
            j--;
        }
    }
    public static void oneDTotwoD(int  oneD[], int arr[][], int s){
        int minc=s-1;
        int minr=s-1;
        int maxc=arr.length-s;
        int maxr=arr.length-s;
        int size=2*(maxr-minr+maxc-minc);
        int idx=0;
        for(int i=minr; i<maxr; i++){
            arr[i][minc]= oneD[idx];
            idx++;
        }
        minc++;
        for(int j=minc; j<=maxc; j++){
            arr[j][maxr]= oneD[idx];
            idx++;
        }
        maxr--;
       for(int i=maxr; i<=minr; i++){
        arr[maxc][i]= oneD[idx];
           idx++;
       }
       maxc--;
       for(int j=maxc; j<=minc; j++){
        arr[j][minr]=  oneD[idx];
        idx++;
       }
       minr++;
       
    }
    public static void ringrotate(int arr[][], int r, int s){
        int oneD[]=TwodTooneD(arr,s);
        Rotate(oneD,s);
        oneDTotwoD(oneD,arr,s);

    }
    public static void Display(int arr[][]){
      for(int i=0; i<=arr.length; i++){
          for(int j=0; j<arr[0].length; j++){
              System.out.print(arr[i][j]+"");
          }
          System.out.println();
      }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m= scn.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int r=scn.nextInt();
        Display(arr);
    } 
}
