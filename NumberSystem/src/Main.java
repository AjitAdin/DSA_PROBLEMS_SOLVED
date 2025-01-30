import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        int E[]={3,5,2,0};
        int L[]={0,2,4,4};
        int max=0;
        int cur=0;
        for(int i=0;i<t;i++){
            int temp=cur+E[i];
            cur=temp-L[i];
            if(cur>max){
                max=cur;

            }

        }
        System.out.println(max);


    }
}