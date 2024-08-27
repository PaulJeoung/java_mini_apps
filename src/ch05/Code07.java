package ch05;

public class Code07 {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for (int i=0; i<mathScores.length; i++) {
			for (int j=0; j<mathScores[i].length; j++) {
				System.out.println("수학점수["+i+"]["+j+"] : "+mathScores[i][j]);
			}
		}
		System.out.println("==============================");
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i=0; i<mathScores.length; i++) {
			totalStudent +=mathScores[i].length;
			for (int j=0; j<mathScores[i].length; j++) {
				totalMathSum +=mathScores[i][j];
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("전체 학생 평균 점수 : "+totalMathAvg);
		System.out.println("전체 학생 수 : "+totalStudent);
		System.out.println("==============================");
		
		int [][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		for (int i=0; i<englishScore.length; i++) {
			for (int j=0; j<englishScore[i].length; j++) {
				System.out.println("영어점수["+i+"]["+j+"] : "+englishScore[i][j]);
			}
		}
		
		System.out.println("==============================");
		englishScore[0][0] = 90;
		englishScore[0][1] = 93;
		englishScore[1][0] = 96;
		englishScore[1][1] = 70;
		englishScore[1][2] = 72;
		
		totalStudent = 0;
		int totalEnglishSum = 0;
		for (int i=0; i<englishScore.length; i++) {
			totalStudent +=englishScore[i].length;
			for (int j=0; j<englishScore[i].length; j++) {
				totalEnglishSum +=englishScore[i][j];
			}
		}
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
		System.out.println("전체 학생 평균 점수 : "+totalEnglishAvg);
		System.out.println("전체 학생 수 : "+totalStudent);
		System.out.println("==============================");
	}

}
