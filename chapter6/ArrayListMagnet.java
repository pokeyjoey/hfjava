import java.util.*;

class ArrayListMagnet {

	public static void printAL(ArrayList<String> al) {

		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");

	}

	public static void main(String [] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "zero");
		a.add(1, "one");
		a.add(2, "two");
		a.add(3, "three");
		printAL(a);
	
	}
}

