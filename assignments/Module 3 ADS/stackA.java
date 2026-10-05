import java.util.ArrayList;
public class stackA {

    static class stack{
        static ArrayList<Integer> all=new ArrayList<>();
        public boolean isempty(){
            return all.size()==0;
        }
        public void push(int data){
            all.add(data);
        }
        public int pop(){
            int top=all.size()-1;
            all.remove(top);
            return top;

        }
        public int peek(){
            return all.get(all.size()-1); 
        }
        
    }
    public static void main(String[] args) {
        stack obj=new stack();
        obj.push(55);
        obj.push(5);
        obj.push(58);
        obj.push(88);
        while(!obj.isempty()){
            System.out.println(obj.peek());
            obj.pop(); 

        }
        
    }
    
}
