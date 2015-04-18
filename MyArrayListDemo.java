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
		System.out.println(testList.contains("test")); //true
		System.out.println(testList.contains("foo")); //false

		String copyString = (String)testList.get(0); //must cast to String since it returns Object type
		System.out.println(copyString); // prints "test"

		System.out.println(testList.indexOf("new")); // 16
		System.out.println(testList.indexOf("test")); // 0

		System.out.println(testList.lastIndexOf("test")); //15

		testList.add(16,"inserted!!!");
		System.out.println(testList.get(16)); //prints "inserted!!!"

		testList.add(16,"pushover");
		System.out.println(testList.get(16)); //prints "pushover"

		System.out.println(testList);

		testList.remove("test");
		System.out.println(testList);

		testList.remove(16);
		System.out.println(testList);

		testList.remove("inserted!!!"); 
		System.out.println(testList);
		System.out.println(testList.size());

		testList.set(0,"re-inserted!!!");
		System.out.println(testList);
		System.out.println(testList.size());

		

	}
}