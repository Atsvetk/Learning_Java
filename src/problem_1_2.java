import java.util.Scanner;

public class problem_1_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������� �����: ");
		if (scan.hasNextInt()) {
			int n = scan.nextInt();
			System.out.println( (n%2==0) ? "׸����!" : "��������!");
		} else {
			System.out.println("����� ���� ������ ����� �����!");
		}
		scan.close();
	}
}
