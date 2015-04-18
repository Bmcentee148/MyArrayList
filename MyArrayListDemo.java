public class MyArrayListDemo {

	public static MyArrayList list;

	public static void main(String[] args) {

		list = new MyArrayList();
		for(int i = 0; i< 10; i++) {
			list.add(i);
		}
		display(); // 0 - 9 filled

		list.clear();

		display(); // now empty

		for(int i = 0; i< 10; i++) {
			list.add("temp" + i); //fill again
		}

		list.remove(0);

		display(); // 9 in front

		list.remove(2); 

		display();

		list.add(0,"firstAddition");
		display();

		list.add("secondAddition");
		display();

		list.add(5,"thirdAddition");
		display();

		list.remove("firstAddition");
		list.remove("secondAddition");
		list.remove("thirdAddition");

		display();
		list.remove(5);
		display();

		list.remove(0);
		list.remove(0);
		list.remove(0);
		display();

		for(int i = 0; i < 12; i ++)
			list.add("new" + i);

		display();

		list.add(3,"??!??!");
		display(); 

		list.remove("try"); //nothing
		display();

		String testStr = (String)list.get(7);
		System.out.println(testStr);
		display(); //still contains string at 7th index

		System.out.println(list.indexOf("??!??!"));

		list.add(0,"new0");
		display();
		System.out.println(list.lastIndexOf("new0"));

		String replacedStr = (String)list.set(6,"replacementString");
		display();
		System.out.println(replacedStr);
	}

	public static void display(){
		System.out.println("SIZE: " + list.size());
		System.out.println(list);
	}
}