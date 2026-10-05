import java.util.Stack;

public class queueusing2stack {

    public static class queue{
       static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isempty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            //3 steps
            //   1. pop from s1 and push into s2 upto s1 is empty
            //    2.s1 is empty insert data into s1
            //     3.pop from s2 and push into s1

            while(!isempty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static void remove(){
            if(isempty()){
                System.out.println("empty");
                return;
            }
            s1.pop();
        }
        public static int peek(){

            return s1.peek();
            
        } 

    } 
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isempty()){
           System.out.println( q.peek());
            q.remove();

        }
    }
}
