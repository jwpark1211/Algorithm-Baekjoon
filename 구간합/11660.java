import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); //옆면 길이
        int M = Integer.parseInt(st.nextToken()); //합 구하는 횟수

        int A[][] = new int[N+1][N+1];
        int D[][] = new int[N+1][N+1];
        int R[] = new int[M];

        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
                A[0][j] = 0;
                A[i][0] = 0;
                D[0][j] = 0;
                D[i][0] = 0;
            }
        }

        for(int i=1;i<=N;i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=1;j<=N;j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                D[i][j] = D[i-1][j]+ D[i][j-1]-D[i-1][j-1] + A[i][j];
            }
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            R[i] = D[x2][y2] - D[x2][y1-1] - D[x1-1][y2] + D[x1-1][y1-1];
        }

        for(int i=0;i<M;i++){
            System.out.println(R[i]);
        }
   }
}
