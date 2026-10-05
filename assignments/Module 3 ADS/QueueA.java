public class QueueA {

    static class queue{
        static int arr[];
        static int rear;
        static int size;
        queue(int n){
           size=n;
            arr=new int[n];
            rear=-1;
        }

        public static boolean isempty(){
            return rear==-1;
        }
        public static void add(int n){
            if(rear==size-1){
                System.out.println("array is full");
            }
            rear =rear+1;
            arr[rear]=n;
        }
        public static void remove(){
            if(isempty()){
                System.out.println("queue is empty");
            }
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
        }
        public static int peek(){
            if(isempty()){
                System.out.println("queue is empty");
            }
            return arr[0];
        }

        public static void printq(){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(2);
        q.add(8);
        q.add(9);
        q.add(7);
        q.add(99);
        q.printq();
        System.out.println(q.isempty());
        q.remove();
        q.printq();
        System.out.println();
        q.peek();
        
    }
}
