/**
 * Created by prass on 3/26/2017.
 */
public class InsertionSort {


    public static int[] sort(int[] A){

        if(A!=null && A.length<=1){
            return A;
        }
        int size = A.length -1;

        for(int i =1; i<=size; i++){
            int key = A[i];
            int j = i-1;
            int hole =i;
            while(j>=0 && A[j]>key){
                A[hole] = A[j];
                hole = j--;
            }
            A[hole] =key;
        }

        return A;
    }


    public static void main(String[] args){

        int[] A = {7,2,4,1,5,3};
        InsertionSort.sort(A);

    }
}
