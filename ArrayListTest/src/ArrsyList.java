import java.util.ArrayList;
import java.util.Scanner;

public class ArrsyList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<4; i++) {
			System.out.print("�̸� �Է� : ");
			String s = sc.next();
			a.add(s);
		}
		for(int i = 0; i<a.size(); i++) {
			String name = a.get(i);
			System.out.println(name);
		}
	}

}
