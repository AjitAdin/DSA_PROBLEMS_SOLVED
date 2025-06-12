//leetcode 155

//difference encoding" approach, also known as the encoded minimum technique.

class MinStack {



    Stack<Integer> stack= new Stack<>();
    Stack<Integer> minstack= new Stack<>();

    // constructor 
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {


        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
        }else if(val <= minstack.peek()){

            minstack.push(val);
        }

    }

    public void pop() {




        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }



        stack.pop();
    }

    public int top() {

        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */














//class MinStack {
//    private int[] s;
//    private int []min;
//    private int top;
//    private int size;
//
//
//    public MinStack() {
//        size=1000;
//        s=new int[size];
//        min = new int [size];
//        top=-1;
//    }
//
//    public void push(int val) {
//        if(top==size-1) return;
//        else{
//            top++;
//            if(top==0){
//                min[top]=val;
//            }else{
//                min[top]=Math.min(val,min[top-1]);
//            }
//            s[top]=val;
//        }
//    }
//
//    public void pop() {
//        if(top==-1) return ;
//        else{
//            top--;
//        }
//    }
//
//    public int top() {
//        if(top==-1 )return -1;
//        return s[top];
//    }
//
//    public int getMin() {
//        if(top==-1)return -1;
//        return min[top];
//    }
//}
//
/// **
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(val);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */