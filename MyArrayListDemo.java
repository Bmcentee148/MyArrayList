public class MyArrayListDemo {

	public static void main(String[] args) {

		MyArrayList testList = new MyArrayList();
		System.out.println(testList.size()); //0

		String testString = "test";
		for(int i = 0; i < 16; i++) {
			testList.add(testString);
		}
		System.out.println(testList.size()); //16
		System.out.println(testList);

		for(int i = 0; i < 30; i++)
			testList.add("new");

		System.out.println(testList.size()); //46

		System.out.println(testList);
	}
}