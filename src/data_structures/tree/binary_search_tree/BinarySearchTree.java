package data_structures.tree.binary_search_tree;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	// insert into BST
	public void insert(int value) {

		Node newNode = new Node(value);

		if (this.root == null) {
			this.root = newNode;
		} else {

			Node currentNode = root;
			while (true) {
				if (value < currentNode.value) {

					// Left
					if (currentNode.left == null) {
						currentNode.left = newNode;
						break;
					}
					currentNode = currentNode.left;

				} else {

					// Right
					if (currentNode.right == null) {
						currentNode.right = newNode;
						break;
					}
					currentNode = currentNode.right;

				}
			}
		}

	}

	// Lookup in BST
	public boolean lookup(int value) {

		Node currentNode = root;

		while (currentNode != null) {
			if (value < currentNode.value) {
				currentNode = currentNode.left;
			} else if (value > currentNode.value) {
				currentNode = currentNode.right;

			} else {
				return true;
			}
		}

		return false;
	}

	// Remove from BST (advanced)
	public boolean remove(int value) {

		// if nothing in the Tree return false
		if (this.root == null) {
			return false;
		}

		Node currentNode = this.root;

		// This node is to track the parent node of the node that we want to delete
		Node parentNode = null;

		// looping though all to find the node that we want to delete
		while (currentNode != null) {

			if (value < currentNode.value) {
				// go left
				parentNode = currentNode;
				currentNode = currentNode.left;
			} else if (value > currentNode.value) {
				// go right
				parentNode = currentNode;
				currentNode = currentNode.right;
			} else {
				// if we found the node to delete

				// Case 1: If cuurentNode have no right child
				if (currentNode.right == null) {

					// if parent node if null i.e we are trying to delete the root node
					if (parentNode == null) {
						this.root = currentNode.left;
					} else {

						// if current < parent then make current left child to parent left child
						if (currentNode.value < parentNode.value) {
							parentNode.left = currentNode.left;
						}
						// if current > parent the make current left child to parent right child
						else if (currentNode.value > parentNode.value) {
							parentNode.right = currentNode.left;
						}
					}
				}

				// Case 2: If currentNode have a right child which does not have left child
				else if (currentNode.right.left == null) {

					// if parent node if null i.e we are trying to delete the root node
					if (parentNode == null) {
						this.root = currentNode.right;
					}
					// if current < parent then make current right child to parent left child
					else if (currentNode.value < parentNode.value) {
						parentNode.left = currentNode.right;
					}

					// if current > parent then make current right child to parent right child
					else if (currentNode.value > parentNode.value) {
						parentNode.right = currentNode.right;
					}

				}

				// Case 3: If currentNode have a right child which have a left child

				else {

					if (parentNode == null) {

						// save reference of root left & right child
						Node leftNode = this.root.left;
						Node rightNode = this.root.right;

						// root.right.left node becomes new root
						this.root = currentNode.right.left;
						rightNode.left = rightNode.left.right;

						// set back the saved reference of left and right nodes of root.
						this.root.left = leftNode;
						this.root.right = rightNode;
					} else {

						if (currentNode.value < parentNode.value) {
							parentNode.left = currentNode.right.left;
						} else if (currentNode.value > parentNode.value) {
							parentNode.right = currentNode.right.left;
						}
					}
				}

				return true;

			}

		}

		return false;

	}

	public static void main(String[] args) {

		BinarySearchTree theBinarySearchTree = new BinarySearchTree();

		theBinarySearchTree.insert(20);
		theBinarySearchTree.insert(17);
		theBinarySearchTree.insert(18);
		theBinarySearchTree.insert(30);
		theBinarySearchTree.insert(8);

		System.out.println(theBinarySearchTree.lookup(17));
		System.out.println(theBinarySearchTree.lookup(20));
		System.out.println(theBinarySearchTree.lookup(90));

	}

}
