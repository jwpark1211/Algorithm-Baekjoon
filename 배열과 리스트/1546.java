import java.util.Scanner;

public class Main {
    /*헷갈렸던 이유 :
    연산 순서를 반대로 작성했다. (maxScore*100을 score[i]/maxScore 보다 먼저 계산해 결과가 꼬임 */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int subjectNum =  sc.nextInt();
        double score[] = new double[subjectNum];

        for(int i=0;i<subjectNum;i++){
            score[i] = sc.nextDouble();
        }

        //성적 중 최댓값 구하기
        //+) max를 구하는 것과 sum을 구하는 반복문을 한 번에 하도록 하여 로직을 간단히 만들 수 있음.
        double maxScore = 0;
        for(int i=0;i<subjectNum;i++){
            if(maxScore<score[i])
                maxScore = score[i];
        }
        double sum = 0;
        for(int i=0;i<subjectNum;i++){
            sum += score[i]/maxScore * 100;
        }

        double Result = sum/subjectNum;

        System.out.println(Result);
    }
}
