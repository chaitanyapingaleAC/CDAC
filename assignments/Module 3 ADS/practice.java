class linkedlist{

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public static node head;
    public static node tail;

    public void addfirst(int data){
        node newnode=new node(data);
        if(head==null){
           head=tail=newnode;
           return;
        }
        newnode.next=head;
        head=newnode;
        return;
    }
    public void addlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        return;
    }
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addindex(int index,int data){
        node newnode=new node(data);
        if(index==0){
            addfirst(data);
            return;
        }
        int i=0;
        node temp=head;
        while(i<index){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return;
    }

    public void removefirst(){
        if(head==null){
           System.out.println("no element");
           return;
        }
        head=head.next;

    }
    public int size(){
        node temp=head;
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;       
         }
         return i;
    }
    public void removelast(){
        node prev=head;
        int i=0;
        int sz=size();
        while(i<sz-2){
          prev=prev.next;
          i++;
        }
       
        tail=prev;
         prev.next=null;
         return;

    }

public void  searchiter(int key){
    node temp=head;
    int i=0;
    // if(temp.data==key){
    //     System.out.println("found at index : "+i);
    //     return;
    // }
    while(temp.next!=null){
        if(temp.data==key){
            System.out.println("found at index : "+i);
            return;
        }
        temp=temp.next;
        i++;

    }

}
public int helper(node head,int key){
    node temp=head;
    if(temp.data==key){
        return 0;
    }
    int indeeex=helper(temp.next, key);
    if(indeeex==-1){
        return -1;
    }
    return indeeex+1;



    
}
public void recursivesearch(int key){

    System.out.println("index : "+helper(head,key));
}

public void reverse(){
    node prev=null;
    node curr=tail=head;
    node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

    }
    head=prev;

}

public void deleteatnodeend(int n){
    int sz=size();
    if(n==sz){
        removefirst();
    }
    node temp=head;
    int i=1;
    while(i<sz-n){
        temp=temp.next;
        i++;
    }
    temp.next=temp.next.next;
    return;


}
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.addfirst(50);
        ll.addfirst(60);
        ll.addfirst(70);
        ll.addlast(80);
        ll.addindex(4, 45);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();
        ll.searchiter(45);
        ll.recursivesearch(45);
        ll.reverse();
        ll.print();
        ll.deleteatnodeend(2);
        ll.print();


        
        
    }
}