public class TestAVL {
    public static void main(String[] args) {
        AVL<Integer> AVL = new AVL<>();
        AVL.add(2);
        AVL.add(3);
        AVL.add(4);
        //System.out.println(AVL.root.getHeight());
        AVLNode<Integer> currNode = AVL.root;
        while (currNode != null){
            System.out.println(currNode.getHeight());
            currNode = currNode.getRight();
        }
    }
}
