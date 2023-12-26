import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(10);
		list.add(null);
		list.add(20);
		list.add(50);
		
		list.set(3,20000);
		
		//System.out.println(list.remove(0));
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for (Object ob : list) {
			System.out.println(ob);
		}
	}

}
