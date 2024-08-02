import java.util.*;
class BubbleSort {
    public static void main(String[]args){
        Scanner oh = new Scanner(System.in);
        int size= oh.nextInt();
        int[] arr= new int[size];
        int pass, itr,temp;
        for(itr=0;itr<size;itr+=1)
            arr[itr]=oh.nextInt();
        for(pass=0;pass<=size-2;pass++){
            for(itr=0;itr<size-1-pass;itr++){
                if(arr[itr]> arr[itr+1]){
                    temp=arr[itr];
                    arr[itr]=arr[itr+1];
                    arr[itr+1]= temp;
                }
            }
        }
        for(itr=0;itr<size;itr++)
            System.out.print(arr[itr]+" ");
    }
}
