import java.util.Scanner;

/**
 * Created by anves on 11/10/2016.
 */
public class zero {
    public static int [][] makezero(int [][]a, int m, int n){
        boolean rowzeros = false;
        boolean colzeros = false;
        for(int i =0;i<n;i++){
            if(a[0][i]==0) {
                colzeros = true;
                break;
            }
        }
        for(int i =0;i<m;i++){
            if(a[i][0]==0) {
                rowzeros = true;
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
        a = nullifycol(nullifyrow(a,m,n),m,n);
        if(rowzeros){
            for(int i=0;i<m;i++){
                a[i][0]=0;
            }
        }
        if(colzeros){
            for(int i=0;i<n;i++){
                a[0][i]=0;
            }
        }


      return a;
    }
    public static int[][] nullifyrow(int[][] a, int m, int n){
        for(int i=1;i<m;i++){
            if(a[i][0]==0){
                for(int j=1;j<n;j++){
                    a[i][j]=0;
                }
            }
        }
        return a;
    }
    public static int[][] nullifycol(int[][] a, int m, int n){
        for(int i=1;i<n;i++){
            if(a[0][i]==0){
                for(int j=1;j<m;j++){
                    a[i][j]=0;
                }
            }
        }
        return a;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N =sc.nextInt();
        int [][] a = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                a[i][j]= sc.nextInt();

            }

        }
        int [][] b = makezero(a,M,N);
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

    }
}
