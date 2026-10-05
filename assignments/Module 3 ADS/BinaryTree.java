import java.util.LinkedList;
import java.util.Queue;

public  class BinaryTree{
     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }

    }

     static class Binarytree{

        static int index=-1;
        public static Node BuildTree(int []nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newnode=new Node(nodes[index]);
            newnode.left=BuildTree(nodes);
            newnode.right=BuildTree(nodes);

            return newnode;
           
        }

    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    //level order traversal.....
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                 q.add(curr.left);
                }
                if(curr.right !=null){
                q.add(curr.right);
                }
            }
        }


    } 

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;

    }

    public static int node(Node root){
        if(root==null){
            return 0;
        }
        int lc=node( root.left);
        int rc=node(root.right);
        return lc+rc+1;
        
    }

    
    public static int sumnode(Node root){
         int sum=0;
        if(root==null){
            return 0;
        }
       int  ls=sumnode(root.left);
        int rs=sumnode(root.right);
        sum =root.data+ls+rs;
        return sum;

    }
    


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree=new Binarytree();
        Node root=tree.BuildTree(nodes);
        System.err.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.err.println();
        levelorder(root);
        System.out.println("height is: "+height(root));
        System.out.println("nodes count : "+node(root));
        System.out.println("sum is : "+sumnode(root));
}
}