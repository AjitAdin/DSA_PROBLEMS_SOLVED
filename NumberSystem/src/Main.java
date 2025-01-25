import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();

        int mat[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }


        int max=0;
        int row=0;
        int count;

        for(int i=0;i<r;i++){
            count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){

                    count++;


                }

            }
            if(max<count){
                max=count;
                row=i+1;
            }
        }
        System.out.println(row);
    }
}