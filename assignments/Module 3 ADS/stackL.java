public class stackL {
    static class node{
      int data;
      node next;
      node(int data){
        this.data=data;
        this.next=null;
      }

    }
    static class stack{
        node head=null;
        public boolean isempty(){
          return head==null;
        }

        public void push(int data){
            node newnode=new node(data);
            if(isempty()){
                head=newnode;
                return;
            }

            newnode.next=head;
            head=newnode;

        }
        public int pop(){
            if(isempty()){
                return -1;
            }
            node top=head;
            head=head.next;
            return top.data;
        }
        public int peek(){
            if(isempty()){
               return -1;
            }
            return head.data;
        }


    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(5);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
