package ch05;

public class Code06_3 {

	public static void main(String[] args) {
		int[] scores = {84,88,96};
		int[][] idiot = {{1,2,3,4,5,6,7,8,9},{}};
		System.out.println(idiot.length);
		System.out.println(idiot[0].length);
		System.out.println(idiot[1].length);
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("Total Score : " + sum);
		
		double avg = (double) sum/scores.length;
		String formattedValue = String.format("%.3f", avg); // 소수점 포매팅 만들기
		System.out.println("Score Average : " + formattedValue );
	}

}
