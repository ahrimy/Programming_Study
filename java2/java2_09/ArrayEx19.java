package java2_09;

import java.util.Scanner;

public class ArrayEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int cnt = 2;

		boolean run = true;
		while (run) {

			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[1]�߰�");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt >= 5) {
					System.out.println("���̻� �߰� �� �� ����.");
					run=false;
				} else {
					System.out.print("�߰��� �� �Է� : ");
					int data = scan.nextInt();
					arr[cnt++] = data;
				}
			}

		}

	}

}