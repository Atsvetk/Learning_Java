import java.util.Scanner;

public class problem_1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������� �����: ");
		if (scan.hasNextInt()) {
			int n = scan.nextInt();
			if (n%2==0) {
				System.out.println("׸����!");
			} else {
				System.out.println("��������!");
			}
		} else {
			System.out.println("����� ���� ������ ����� �����!");
		}
		scan.close();
	}
}
