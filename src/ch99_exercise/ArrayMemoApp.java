package ch99_exercise;

import java.util.Scanner;

public class ArrayMemoApp {
	public static void main (String[] args) {
		
		String[] notepad = new String[100]; // 최대 100줄 저장 가능
        int lineCount = 0; // 현재 저장된 줄 수
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n메모장 메뉴:");
            System.out.println("1. 메모 추가");
            System.out.println("2. 메모 보기");
            System.out.println("3. 메모 수정");
            System.out.println("4. 메모 삭제");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 비우기
            
            switch (choice) {
                case 1: // 메모 추가
                    if (lineCount >= 100) {
                        System.out.println("메모장이 가득 찼습니다.");
                    } else {
                        System.out.print("추가할 메모 입력: ");
                        notepad[lineCount] = scanner.nextLine();
                        lineCount++;
                        System.out.println("메모가 추가되었습니다.");
                    }
                    break;
                case 2: // 메모 보기
                    System.out.println("\n저장된 메모:");
                    for (int i = 0; i < lineCount; i++) {
                        System.out.println((i + 1) + ": " + notepad[i]);
                    }
                    break;
                case 3: // 메모 수정
                    System.out.print("수정할 메모의 줄 번호 입력: ");
                    int editLine = scanner.nextInt();
                    scanner.nextLine(); // 입력 버퍼 비우기
                    if (editLine > 0 && editLine <= lineCount) {
                        System.out.print("새로운 메모 입력: ");
                        notepad[editLine - 1] = scanner.nextLine();
                        System.out.println("메모가 수정되었습니다.");
                    } else {
                        System.out.println("잘못된 줄 번호입니다.");
                    }
                    break;
                case 4: // 메모 삭제
                    System.out.print("삭제할 메모의 줄 번호 입력: ");
                    int deleteLine = scanner.nextInt();
                    scanner.nextLine(); // 입력 버퍼 비우기
                    if (deleteLine > 0 && deleteLine <= lineCount) {
                        // 삭제된 줄 이후의 모든 메모를 한 줄씩 앞으로 이동
                        for (int i = deleteLine - 1; i < lineCount - 1; i++) {
                            notepad[i] = notepad[i + 1];
                        }
                        notepad[lineCount - 1] = null; // 마지막 줄을 null로
                        lineCount--;
                        System.out.println("메모가 삭제되었습니다.");
                    } else {
                        System.out.println("잘못된 줄 번호입니다.");
                    }
                    break;
                case 5: // 종료
                    System.out.println("메모장을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        } while (choice != 5);

        scanner.close();
		
	}
}
