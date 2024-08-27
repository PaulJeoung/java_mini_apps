/*
 * java 파일 처음 페이지에는 요로코롬 정보를 반!드!시! 입력 해야 함. 개발특
 * Author : Ellen Musk
 * Project Name : SpaceX
 * Create Date : Sep. 22. 2024
 */

package ch01;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Java"); // println은 줄바꿈을 해줌, print만 하면 줄바꿈이 안됨, 아니면 \n 입력
		System.out.println("Hi" + ", I`m backend Engineer");
		System.out.println("단축키는 ctrl + F11 누르셈");
		
		int i = 0;
		int j = 0;
			for (i=1; i<=5; i++) {
				System.out.print(i);
				for (j=2; j<=5; j++) {
					System.out.print(i * j);
				}
			}
		}
	}