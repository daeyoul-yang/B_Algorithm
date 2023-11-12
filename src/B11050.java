import java.util.Scanner;

public class B11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [][] D = new int[N+1][N+1];
        for (int i = 0; i <=N ; i++) {
            D[i][1] =i;
            D[i][0] =1;
            D[i][i]=1;
        }
        for (int i = 2; i <=N ; i++) {
            for (int j = 1; j <i ; j++) {
                D[i][j]=D[i-1][j]+ D[i-1][j-1];
            }

        }
        System.out.println(D[N][K]);
    }
}
