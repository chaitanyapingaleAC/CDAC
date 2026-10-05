import java.util.ArrayList;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
        
            public static Node insert(Node root,int val){
                if(root==null){
                    root=new Node(val);
                    return root;
                    
                }
                    if(val>root.data){
                        root.right=insert(root.right, val);

                    }else{
                        root.left=insert(root.left, val);

                    }

                
                 return root;
            

           
       
  
        }

        
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);

        }

        public static boolean search(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(root.data>key){
               return search(root.left, key);
            }
            else{
                return search(root.right, key);
            }
           
        }

        //helper for delete
        public static Node inordersuccsesor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }

        public static Node deletenode(Node root,int val){
            
            if(root.data<val){
                root.right=deletenode(root.right, val);
            }
            else if(root.data>val){
                root.left=deletenode(root.left, val);
            }
            else{
                if(root.left==null && root.right==null){
                    return null;
                }
                 if( root.left==null){
                    return root.right;
                }
                if(root.right==null ){
                    return root.left;
                }
                Node inordersuc=inordersuccsesor(root.right);
                root.data=inordersuc.data;
                root.right=deletenode(root.right, inordersuc.data);
                
            }
            return root;

        }

        public static void printinrange(Node root,int key1,int key2){

            if(root==null){
                return;
            }

            if(root.data>=key1 && root.data<=key2){
                printinrange(root.left, key1, key2);
                System.out.print(root.data+" ");
                printinrange(root.right, key1, key2);
                return;
            }
            if(root.data>key1){
                printinrange(root.left, key1, key2);
            }else{
                printinrange(root.right, key1, key2);
            }
            

        }
        public static void printpath(ArrayList<Integer> path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"->");
            }
            System.out.println("null");
        }
        public static void root2leaf(Node root,ArrayList<Integer> path){
            if(root==null){
                return;
            }
            path.add(root.data);
            if(root.left==null && root.right==null){
                printpath(path);
            }
            root2leaf(root.left, path);
            root2leaf(root.right, path);
            path.remove(path.size()-1);

        }

        public static boolean validbst(Node root){

            
        }

    public static void main(String[] args) {
        int []values={5,1,3,4,2,7,8};
        Node root=null;
        for(int i=0;i<values.length;i++){
           
            root= insert(root,values[i]);
        }
        // System.out.println(root.data);
        inorder(root);
        System.out.println();
        System.out.println(search(root, 4));
        System.out.println("before deleting 3");
        inorder(root);
        deletenode(root, 3);
        System.err.println();
        inorder(root);
        System.out.println();
        printinrange(root, 1, 7);
        System.out.println();
        root2leaf(root,new ArrayList<>());



    }
    
}
