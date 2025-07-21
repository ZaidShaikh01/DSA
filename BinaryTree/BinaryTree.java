class BinaryTree{
    Node root;
    BinaryTree(){
        this.root = null;
    }
    public void insert(int key){
        root = insertRec(root,key);
    }
    private Node insertRec(Node root,int key){
        if(root == null) root = new Node(key);
        else if(key < root.key) root.left = insertRec(root.left,key);
        else root.right = insertRec(root.right,key);
        return root;
    }
    public boolean search(int key){
        return searchRec(root,key);
    }
    private boolean searchRec(Node root,int key){
        if(root == null) return false;
        if(key == root.key) return true;
        if(key < root.key) return searchRec(root.left,key);
        else return searchRec(root.right,key);
    }
    public void inorder(){
        inOrderRec(root);
    }
    private void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.key+" ");
            inOrderRec(root.right);
        }
    }
    public void preorder(){
        preOrderRec(root);
    }
    private void preOrderRec(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    public void postOrder(){
        postOrderRec(root);
    }
    private void postOrderRec(Node root){
        if(root!=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key+" ");
        }
    }
    public int minValue(){
        return minValueRec(root);
    }
    private int minValueRec(Node root){
        if(root == null) throw new IllegalStateException("Tree is empty");
        if(root.right == null) return root.key;
        return minValueRec(root.right);
    }
    public int maxValue(){
        return maxValueRec(root);
    }
    private int maxValueRec(Node root){
        if(root == null) throw new IllegalStateException("Tree is empty");
        if(root.left == null) return root.key;
        return maxValueRec(root.left);
    }
    public int sumOfOdd() {
        return sumOfOddRec(root);
    }

    private int sumOfOddRec(Node root) {
        if (root == null) return 0;

        int leftSum = sumOfOddRec(root.left);
        int rightSum = sumOfOddRec(root.right);

        return (root.key % 2 != 0 ? root.key : 0) + leftSum + rightSum;
    }
    public int maximumDepth(){
        return maximumDepthRec(root);
    }
    public int maximumDepthRec(Node root){
        if(root == null) return -1;
        int leftMax = maximumDepthRec(root.left);
        int rightMax = maximumDepthRec(root.right);
        return 1+Integer.max(leftMax,rightMax);
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();

        // Insert some nodes
        tree.insert(5);
        tree.insert(3);
        tree.insert(20);
        tree.insert(40);
        tree.insert(7);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Preorder Traversal: ");
        tree.preorder();
        System.out.println();
        System.out.println("Postorder Traversal: ");
        tree.postOrder();
        System.out.println();
        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println();
        System.out.println("Odd Sum: ");
        System.out.println(tree.sumOfOdd());
        System.out.println("The depth of tree is : "+ tree.maximumDepth());


        int searchKey = 40;
        if (tree.search(searchKey))
            System.out.println("\nKey " + searchKey + " found in the tree.");
        else
            System.out.println("\nKey " + searchKey + " not found in the tree.");


        System.out.println("Minimum value in the tree: " + tree.minValue());
        System.out.println("Maximum value in the tree: " + tree.maxValue());

    }
}