public class SparseMatrixs {


    public static void main(String atgs[]){
        int matrix[][]={
                {1,2,0,4},
                {4,8,0,0},
                {0,0,0,0}
        };


        int count_0=0;
        int count_1=0;
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                       if(matrix[i][j]==0){
                           count_0++;
                       }
                       else{
                           count_1++;
                       }
            }
        }
        if(count_0>count_1){
            System.out.println("Sparse matrix");

        }
        else{
            System.out.println("Not a Sparse mtrix ");

        }
    }
}


//