public class circularqueueA {

    static class queue{
       static int []arr;
       static int size;
       static int front;
       static int rear;

       queue(int n){
        size=n;
        arr=new int[n];
         rear=-1;
         front=-1;
       }
       public static boolean isempty(){
        return rear==-1;

       }
       public static boolean isfull(){
        return (rear+1)%size==front;
       }
       public void add(int data){
       
        if(isfull()){
            System.out.println("q is full");
            return;
        }
        if(front==-1){
            //first elemrnt
            front=0;
        }
         rear=(rear+1)%size;
         arr[rear]=data;
        
       }

       public static  void remove(){
          if(isempty()){
            System.out.println("q is empty");
            return;
          }
          if( front==rear){
            rear=front=-1;
          }else
          front=(front+1)%size;
          
       }
       public static int peek(){
        if(isempty()){
            System.out.println("empty q");
            return -1;
        }
        return arr[front];
       }

    }
    public static void main(String[] args) {
        queue q=new  queue(3);
        q.add(4);
        q.add(9);
        q.add(8);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        
    }
    
}
