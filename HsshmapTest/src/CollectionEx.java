import java.util.*;

public class CollectionEx {

	static void PrintList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.println(e+separator);
		}	
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		Collections.sort(myList);
		PrintList(myList);
		Collections.reverse(myList);
		PrintList(myList);
		int index = Collections.binarySearch(myList, "�͹̳�����") + 1;
		System.out.println("�͹̳����� " + index +"��° ����Դϴ�.");
	}
}
