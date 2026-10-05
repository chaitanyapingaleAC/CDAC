public class singlylinkedlist {

    public static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=next;
        }

    }


    static node head;
    static node tail;
    static int size;

    public void addfirst(int data){
        node newnode=new node(data);
        if(head==null){
            
            head=tail=newnode;
            size++;
            return;
        }
            
            newnode.next=head;
            head=newnode;  
            size++;  
    }

    public void addlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
             size++;
            return;
           
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }






    public void print(){
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            addfirst(data);
        }
        int i=0;
        node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        node newnode=new node(data);
        size++;
    
        newnode.next=temp.next;
        temp.next=newnode;

    }

    public void removefirst(){
        head=head.next;
        size--;

    }
    public void removelast(){
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        size--;
        tail=prev;

    }

    public void searchitr(int key){

        node temp=head;
        int i=0;

        while(temp != null){
            if(temp.data==key){
                System.out.println("found at ndeex "+i);
            }
            temp=temp.next;
            i++;
        }
        
    }

    public int helper(node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index=helper(head.next, key);
        if(index==-1){
            return -1;
        }
        return index+1;

    }

    public int recursivesearch(int key){

      return  helper(head,key);
    }

    public void reverse(){
        node prev=null;
        node curr=tail=head;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev =curr;
            curr=next;

        }
        head=prev;



    }

    public void deleteatend(int n){
        int sz=0;
        node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
        }
        node prev=head;
        int i=1;
        while(i<sz-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;


    }


    public static void main(String[] args) {
        singlylinkedlist ll=new singlylinkedlist();
        ll.addfirst(2);
         ll.print();
        ll.addfirst(8);
         ll.print();
        ll.addlast(5);
         ll.print();
        ll.add(2, 55);
         ll.print();
        // ll.removefirst();
        //  ll.print();
        // ll.removelast();
        ll.print();
        ll.searchitr(55);  
        System.out.println("recursive search at index : "+ll.recursivesearch(55));
         System.out.println("size is : "+size);
         ll.print();
        ll.reverse();
        ll.print();
          ll.deleteatend(2);
        ll.print();


    }
}
