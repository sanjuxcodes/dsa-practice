

class Node{

    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val=val;
    }

    

}

public class dfs {

    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+ " ");
    }
    static int diamtr=0;
    static int height(Node root){
        if(root==null) return 0;

        int left=height(root.left);
        int right=height(root.right);

        
        diamtr=Math.max(diamtr,left+right);

        return 1+Math.max(left,right);



    }
    static int diam(Node root){
        height(root);
        
        return diamtr;
    }
    public static void main(String[] args) {
        Node root= new Node(9);
        root.left= new Node(10);
        root.right =new Node(13);
        root.left.left= new Node(11);
        root.left.left.right=new Node(19);
        root.right.right=new Node(12);

        postorder(root);
        System.out.println("dia : "+diam(root));
        
    }
    
}
