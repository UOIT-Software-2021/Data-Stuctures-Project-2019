
public class SkiplistTester {

	public static void main(String[] args) {
		int[] set = {1,2,4,5};
		
		Skiplist skiplist = new Skiplist(set);

		System.out.println(skiplist.search(2, 0));
		System.out.println();
		
		System.out.println(skiplist.toString());
		
		skiplist.insert(3);
		System.out.println(skiplist.toString());
		
		skiplist.delete(4);
		System.out.println(skiplist.toString());
	}

}
