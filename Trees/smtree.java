
 class Node{
    int root;
    Node left;
    Node right;
    public Node(int root){
        this.root=root;
    }
 }
public class smtree {
    static boolean  issame(Node a,Node b){
     if(a==null && b== null) {return true;}
     if(a==null || b== null) return false;

     return (a.root==b.root) && issame(a.left,b.left) && issame(a.right, b.right);




    }
    public static void main(String[] args) {
        Node root = new Node(9);
        root.left= new Node(6);
        root.right= new Node(3);

        Node roott = new Node(9);
        roott.left= new Node(6);
        roott.right= new Node(31);
        System.out.println(issame(root, roott));
        

        
    }
    
}
