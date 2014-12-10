
/**
 * WAVLTree
 *
 * An implementation of a WAVL Tree with
 * distinct integer keys and info
 *
 */

public class WAVLTree {
	private WAVLNode root;

	/**
	 * Constructor; creates a tree with empty Node
	 */
	public WAVLTree(int key ,  String info) {
		this.root = new WAVLNode(key , info);
	}

	/**
	 * public boolean empty()
	 *
	 * returns true if and only if the tree is empty
	 *
	 */
	public boolean empty() {
		return false; // to be replaced by student code
	}

	/**
	 *  public String search(WAVLTree T , int k) 
	 *  
	 *  recursive search
	 */

	public String search(WAVLNode node , int k)
	{
		if(node.key == k)
		{
			return node.info; 
		}
		else if(node.key < k) && (node.right != null)
		{
			return search(node.right, k);
		}
		else if(node.left != null)
		{
			return search(node.left , k);
		}

		return null;
	}

	/**
	 * public String search(int k)
	 *
	 * returns the info of an item with key k if it exists in the tree
	 * otherwise, returns null
	 */
	public String search(int k)	{

		if (this.root != null)
		{
			if(this.root.key == k)
			{
				return this.root.info;
			}
			else if((this.root.key < k) && (this.root.right != null)) 
			{
				return search(this.root.right , k); 
			}
			else if((this.root.key > k) && (this.root.left != null)) 
			{
				return search(this.root.left , k); 
			}
		}
		return null;  // to be replaced by student code
	}

	/**
	 * public int insert(int k, String i)
	 *
	 * inserts an item with key k and info i to the WAVL tree.
	 * the tree must remain valid (keep its invariants).
	 * returns the number of rebalancing operations, or 0 if no rebalancing operations were necessary.
	 * returns -1 if an item with key k already exists in the tree.
	 */
	public int insert(int k, String i) {
		return 42;	// to be replaced by student code
	}

	/**
	 * public int delete(int k)
	 *
	 * deletes an item with key k from the binary tree, if it is there;
	 * the tree must remain valid (keep its invariants).
	 * returns the number of rebalancing operations, or 0 if no rebalancing operations were needed.
	 * returns -1 if an item with key k was not found in the tree.
	 */
	public int delete(int k)
	{
		return 42;	// to be replaced by student code
	}

	/**
	 * public String min()
	 *
	 * Returns the ifo of the item with the smallest key in the tree,
	 * or null if the tree is empty
	 */
	public String min()
	{
		return "42"; // to be replaced by student code
	}

	/**
	 * public String max()
	 *
	 * Returns the info of the item with the largest key in the tree,
	 * or null if the tree is empty
	 */
	public String max() {
		return "42"; // to be replaced by student code
	}

	/**
	 * public int[] keysToArray()
	 *
	 * Returns a sorted array which contains all keys in the tree,
	 * or an empty array if the tree is empty.
	 */
	public int[] keysToArray()
	{
		int[] arr = new int[42]; // to be replaced by student code
		return arr;              // to be replaced by student code
	}

	/**
	 * public String[] infoToArray()
	 *
	 * Returns an array which contains all info in the tree,
	 * sorted by their respective keys,
	 * or an empty array if the tree is empty.
	 */
	public String[] infoToArray()  {
		String[] arr = new String[42]; // to be replaced by student code
		return arr;                    // to be replaced by student code
	}

	/**
	 * public int size()
	 *
	 * Returns the number of nodes in the tree.
	 *
	 * precondition: none
	 * postcondition: none
	 */
	public int size()  {
		return 42; // to be replaced by student code
	}

	/**
	 * public class WAVLNode
	 *
	 * If you wish to implement classes other than WAVLTree
	 * (for example WAVLNode), do it in this file, not in 
	 * another file.
	 * This is an example which can be deleted if no such classes are necessary.
	 */
	public class WAVLNode {

		/**
		 * Node data
		 */
		private String info;

		/**
		 * Key
		 */
		private int key;

		/**
		 * Left child
		 */
		private WAVLNode left;

		/**
		 * Right child
		 */
		private WAVLNode right;

		/**
		 * Height of node
		 */
		private int height;

		public WAVLNode(int key,String info){
			this.key = key;
			this.info = info;
			this.left = null;
			this.right = null;
			this.height = 0;

		}
	}
}




