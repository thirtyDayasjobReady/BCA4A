import java.util.Scanner;
public class M1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];
        System.out.print("Enter Element Of First Matrix:- ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter Element Of Second Matrix:- ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = s.nextInt();
            }
        }
        //-------Print Matrix A-----------------
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            {
                C[i][j]=A[i][j]+B[i][j];
                //System.out.print(A[i][j] +"+"+ B[i][j]+"="+C[i][j]+"\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}