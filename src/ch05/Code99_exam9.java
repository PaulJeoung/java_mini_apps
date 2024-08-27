package ch05;

import java.util.Scanner;

public class Code99_exam9 {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		boolean run = true;
		int menuValue, students;
		int score[] = null;
		
		System.out.println("----------------------------------------------");
		System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
		System.out.println("----------------------------------------------");
		
		while(run) {
			
			System.out.println("선택 > ");
			String inputValue = inputData.nextLine();

			menuValue = Integer.parseInt(inputValue);

			if (menuValue == 1) {
					System.out.println("학생수 > ");
					inputValue = inputData.nextLine();
					students = Integer.parseInt(inputValue);
					score = new int[students];
				
				}else if (menuValue == 2) {
					for(int i=0; i<score.length; i++) {
						System.out.println("점수["+i+"] > ");
						inputValue = inputData.nextLine();
						score[i] = Integer.parseInt(inputValue);
					}
				}else if (menuValue == 3) {
					for (int i=0; i<score.length; i++) {
						System.out.println("점수["+i+"] : "+score[i]);
					}
				}else if (menuValue == 4) {
					int max = 0;
					for (int i=0; i<score.length;i++) {
						if (score[i]>max) {
							max = score[i];
						}
					}
					int totalScore = 0;
					for (int point : score) {
						totalScore = totalScore+point;
					}
					double avg = (double) totalScore/score.length; 
					System.out.println("최고점수 > "+max);
					System.out.println("전체평균 > "+avg);
					
				}else {
					run = false;
					System.out.println("프로그램을 종료 합니다");
					break;
				}
			}
		}	
	}