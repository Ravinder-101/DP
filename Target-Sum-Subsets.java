import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    // Target sum ;
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int tar = scn.nextInt();
   boolean  dp[][] = new boolean [n+1][tar+1];
    
    for( int i = 0 ; i< dp.length;i++ ){
        for( int j =0; j<dp[0].length;j++ ){
            if(j==0){
                dp[i][j] = true;
                
            }
           else if(i==0 && j > 0 ){
                dp[i][j] = false;
                
            }
           else if(dp[i-1][j] == true){
                dp[i][j]=true;
            }
           else{
                if(j >= arr[i-1]){
                    dp[i][j] = dp[i-1][j-arr[i-1]];
                }
                else {
                    dp[i][j] = false;
                }
            }
            
        }
    }
    System.out.print(dp[n][tar] );
    

    }
