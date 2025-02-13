import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        String B[] =new String[N];
        for(int i=0;i<N;i++){
            System.out.println(i);
            B[i]=sc.nextLine();
        }

        System.out.println(Arrays.toString(B));
        System.out.println(B.length);
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(B[i].equals(B[j])){
                    count++;
                }

            }
            // r,g,b,b,g,y,y

            if(count%2!=0){
                System.out.println(B[i]);
                break;
            }
        }

    }
}