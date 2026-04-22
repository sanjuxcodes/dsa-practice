
import java.util.*;







public class bt1 {
    static void preorder(Node root){

        if(root==null){

            return;

        }
        System.out.print(root.root+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void levelwise(Node root){

        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node nd= q.poll();

            System.out.print(nd.root+ " ");
            if(nd.left != null) q.offer(nd.left);
            if(nd.right!= null) q.offer(nd.right);

        }
        
    }
    public static void main(String[] args) {
        Node root = new Node(9);
        root.left= new Node(6);
        root.right= new Node(31);
        root.left.right= new Node(12);
        root.right.left= new Node(22);
        //root.left= new Node(32);

    

        levelwise(root);




    }
    
}






class Node{
    int root;
    Node left;
    Node right;

    public Node(int data){
        this.root=data;

    }


}