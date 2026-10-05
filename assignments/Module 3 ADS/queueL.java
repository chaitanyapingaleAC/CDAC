public class queueL {
    static class node{
         int data;
         node next;

        node(int data){
            this.data=data;
            this.next=null;
        
        }

    }

    static class queue{
        static node head=null;
        static node tail=null;


        public static boolean isempty(){
               return head==null && tail==null;
        }

        public static void add(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;

        }
        public void remove(){
            if(isempty()){
                System.out.println("q is empty");
                return;
            }
            if(head==tail){
                head=tail=null;
            }else
            head=head.next;

        }
        public static int peek(){

            if(isempty()){
                System.out.println("q is empty");
                return -1;
            }

            return head.data; 
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
