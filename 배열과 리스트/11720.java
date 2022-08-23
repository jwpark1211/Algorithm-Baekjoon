import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        if(!(count>=1 && count<=100))
            throw new IllegalStateException("잘못된 입력입니다.");

        String numberList = sc.next(); //nextLine으로 받으면 앞의 nextInt에 들어오는 값도 포함돼서 저장. next를 쓸 것
        String numbers[] = numberList.split(""); //numberList.toCharArray()를 사용하는 방법도 있다.
        int sum = 0;

        for(int i=0;i<count;i++){
            sum += Integer.parseInt(numbers[i]);
        }

        System.out.println(sum);
    }
}
