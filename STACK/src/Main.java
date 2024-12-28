class TwoStacks{
    int[] arr=new int[10];
    int n=arr.length;
    int top1=-1;
    int top2=n;
    public void push1(int item){
        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }

        if(top1<top2){
            arr[++top1]=item;
        }

    }
    public void pop1(){
        if(top1!=-1){
            System.out.println("Poped: "+arr[top1]);
            top1--;
        }
    }
    public void push2(int item){
        if(top2-1>top1){
            arr[--top2]=item;
        }
    }
    public void pop2(){
        if(top2!=n){
            System.out.println("Poped: "+arr[top2]);
            top2--;
        }
    }
    public void display() {
        System.out.println("Elements in Stack1:");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nElements in Stack2:");
        for (int i = n -1; i>=top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Elements in FULL STACK:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


}

public class Main{

    public static void main(String args[]){

        TwoStacks obj=new TwoStacks();
        obj.push1(1);
        obj.push1(2);
        obj.push1(3);
        obj.push1(4);
        obj.push1(5);

        obj.push1(6);

        obj.push1(7);
        obj.push1(8);
        obj.display();
        //
        // obj.pop1();
        //
        obj.display();
        obj.push2(1);
        obj.push2(2);
        obj.push2(3);
        obj.push2(4);
        obj.push1(9);
        obj.display();
        obj.pop2();
        obj.display();


    }
}