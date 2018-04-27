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
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		Collections.sort(myList);
		PrintList(myList);
		Collections.reverse(myList);
		PrintList(myList);
		int index = Collections.binarySearch(myList, "터미네이터") + 1;
		System.out.println("터미네이터 " + index +"번째 요소입니다.");
	}
}
