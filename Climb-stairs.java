import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n+1];
        arr[0] = 1;
        for(int i=1;i<arr.length;i++){
            if( i - 1 >= 0 ){
                arr[i] = arr[i] + arr[i-1];
            }
            if(i-2>=0){
                arr[i] = arr[i] + arr[i-2];
            }
            if(i-3>=0){
                arr[i] = arr[i] + arr[i-3];
            }
        }
        System.out.print(arr[n]);
    }

}
