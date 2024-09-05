package midterm01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt, tmp, input = 0, sum = 0;
		boolean flag = true;
		
		System.out.println("정수의 덧셈을 계산 합니다\n덧셈할 개수는? : (사용자 입력)");
		cnt = scanner.nextInt();
		tmp = cnt;
		
		while (flag) {
			if (sum > 1001) {
				System.out.println("합계가 1000을 넘었습니다 \n마지막 수치는 무시합니다");
				System.out.println("합계는 " + (sum-input) + "입니다");
				flag = false;
				break;
			}
			if (tmp != 0) {
				System.out.println("정수 : (사용자 입력)");
				input = scanner.nextInt();
				sum = input + sum;
				tmp--;
			} else { // if (cnt == 0)
				System.out.println("덧셈할 갯수(" + cnt + ")를 모두 사용 하였습니다.");
				System.out.println("합계는 " + sum + "입니다");
				flag = false;
				break;
			}
		}
	}
}