//Question: Generate Numbers with Digits Only 5 and 6
//Problem Statement:
//Write a program to generate the first
//        𝑛
//n numbers in increasing order such that all the digits of these numbers consist only of the digits 5 and 6.
//
//For example, for
//𝑛
//=
//        5
//n=5, the output should be:
//
//Copy code
//5, 6, 55, 56, 65
//Input:
//hint



import java.util.Queue;
import java.util.ArrayDeque;
public class GenerateNumWithGivenNumbers{
    public static void  main(String args[]){
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(5);
        queue.add(6);
        int n=4;
        int l=queue.size();

        while(l<n){
            System.out.println(queue);
            int current=queue.peek();
            queue.add(current*10+5);
            queue.add(current*10+6);
            l=queue.size();
        }
        System.out.println(queue);
    }
}
