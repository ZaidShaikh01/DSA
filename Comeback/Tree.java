import javax.xml.crypto.Data;

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
    System.out.println(tree.search(2));



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
    Tree(){
        this.root = null;
    }


    public void insert(int key){
        root = insertRec(root,key);
    }

    private TreeNode insertRec(TreeNode root, int data){
        if(root == null) root = new TreeNode(data);
        else if(data < root.data) root.leftNode = insertRec(root.leftNode,data);
        else root.rightNode = insertRec(root.rightNode,data);
        return root;
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

    public boolean search(int key){
        return search(root,key);
    }
    
    private boolean search(TreeNode root,int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        else if(key < root.data) return search(root.leftNode,key);
        else return search(root.rightNode,key);

    }

}
