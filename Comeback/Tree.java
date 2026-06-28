import java.net.SocketTimeoutException;

void main() {
    Tree tree = new Tree();
    tree.insert(5);
    tree.insert(2);
    tree.insert(3);
    tree.insert(1);
    tree.insert(9);
    tree.insert(7);
    tree.display();
    System.out.println();
    tree.search(3);



}

class TreeNode {

	// The three necessary thing in one node
	int data;
	TreeNode leftNode;
	TreeNode rightNode;

	// A simple constructor
	TreeNode(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}
}

public class Tree {

	// Declaring the root
	TreeNode root;

	// Insert on rightNode, Insert on leftNode, Insert simple
	// It requires recursion
    // Search function


	//Insert Left
	public void insert(int data) {
		// My logic is that it will come in this thing & then it will decide to either go right or left
		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
            System.out.println("This is the root.." + root.data);
			return;
		}

		if (root.data < data) {
			insertRight(root, data);
		}

		if (root.data > data) {
			insertLeft(root, data);
		}
	}

	// I think I need to pass the node as well
	public void insertRight(TreeNode root, int data) {
		TreeNode newNode = new TreeNode(data);
		if (root.rightNode == null) {
			root.rightNode = newNode;
			return;
		}
		if (root.data < data) {
			insertRight(root.rightNode, data);
		}

		if (root.data > data) {
			insertLeft(root.leftNode, data);
		}
	}

	public void insertLeft(TreeNode root, int data) {
		TreeNode newNode = new TreeNode(data);
		if (root.leftNode == null) {
			root.leftNode = newNode;
			return;
		}
		if (root.data < data) {
			insertRight(root.rightNode, data);
		}

		if (root.data > data) {
			insertLeft(root.leftNode, data);
		}
	}

    public void display() {
        display(root);
    }

    private void display(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        display(root.leftNode);
        display(root.rightNode);
    }

    public void search(int key){
        Boolean flag =false;
        // To see if elements are present or not
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        // To see if the root has the data
        if(root.data == key){
//            System.out.println("The key is present");
            return;
        }
        flag = search(root,key,flag);
        if(flag == true){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }


    }
    private boolean search(TreeNode root, int key, boolean flag){
        // 3 conditions, tree is empty, root data is less, or root data is more, or no element is present
        if(root == null){
            // The key is not present
            return flag;
        }
        // To see if the root has the data

        if(root.data == key){
//            System.out.println("The key is present");
            flag = true;
            return flag;
        }
        if(root.data > key){
        flag = search(root.leftNode, key,flag);
        }
        if(root.data < key){
        flag = search(root.rightNode,key,flag);
        }

        return flag;
    }

}
