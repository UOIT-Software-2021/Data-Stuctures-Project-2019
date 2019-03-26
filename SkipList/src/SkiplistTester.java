
public class SkiplistTester {

	public static void main(String[] args) {
		int[] set = {1,2,4,5};
		
		System.out.println("Initial");
		Skiplist skiplist = new Skiplist(set);
		System.out.println(skiplist.toString());

		System.out.println("Search");
		System.out.println(skiplist.search(2));
		System.out.println();
		
		System.out.println("Delete");
		skiplist.delete(4);
		System.out.println(skiplist.toString());
		
		System.out.println("Insert");
		skiplist.insert(3);
		System.out.println(skiplist.toString());
	}

}
