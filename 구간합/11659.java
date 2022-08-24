import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long M = sc.nextLong();
        Long N = sc.nextLong();

        Long A[] = new Long[100000];
        Long S[] = new Long[100000];
        Long R[] = new Long[100000];

        for(int i=0;i<M;i++){
            A[i] = sc.nextLong();
            if(i==0)
                S[i] = A[i];
            else
                S[i] = S[i-1]+ A[i];
        }

        int i,j;
        for(int k=0;k<N;k++){
            i = sc.nextInt();
            j = sc.nextInt();

            if(i==1)
                R[k] = S[j-1];
            else
                R[k] = S[j-1] - S[i-2];
        }

        for(int k=0;k<N;k++){
            System.out.println(R[k]);
        }
    }
}
