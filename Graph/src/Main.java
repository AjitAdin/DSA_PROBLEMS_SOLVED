import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        int n=input.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        int q=input.nextInt();

        int[][] queries=new int[q][4];

        for(int i=0;i<q;i++){
            for(int j=0;j<4;j++){
                queries[i][j]=input.nextInt();
            }

        }
        System.out.println(Arrays.deepToString(queries));





        for(int i=0;i<q;i++){
            int index=0;
            for(int l=queries[i][0];l<=queries[i][1];l++){
                arr[l]=queries[i][2]+queries[i][3]*index;
                System.out.println(Arrays.toString(arr));

            }
        }


        int res=0;
        for(int i=0;i<n;i++){
            res+=arr[i];

        }


        System.out.println(res);





    }
}
