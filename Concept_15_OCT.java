import java.util.*;
class Concept_15_OCT{
    public static void MergeSortFunction(int arr[] , int len)
    {
        int left = 0 , right = len-1 ; 
        int temp[] = new int[len]; 
       int ans = MergeSort(arr , temp , left , right); 
       System.out.println("Answer to aagya : "+ ans);
    } 
    
    public static int MergeSort(int arr[] , int temp[] , int left , int right)
    {  int countInv = 0;
        if(left < right)
        {    int mid = (left+right)/2;
           countInv += MergeSort(arr , temp , left , mid);
           countInv+=  MergeSort(arr, temp, mid+1 , right); 
           countInv+= Merge(arr , temp , left , mid, right);
        } 
        return countInv;
    } 
    
    public static int Merge(int arr[] ,int temp[] , int left , int mid , int right)
    {   int countInv = 0;
        int i = left ;
        int j = mid+1; 
        int k = left;
        
        while(i<= mid && j<= right)
        {
            if(arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++]; 
                countInv += (mid - i + 1);
                
            }
        }  
        
        while(i<=mid)
        {
            temp[k++] = arr[i++];
        } 
        while(j<= right)
        {
            temp[k++] = arr[j++];
        }   
          for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return countInv;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0; i<n; i++)
       {
           arr[i] = sc.nextInt(); 
       } 
       
       MergeSortFunction(arr , n);
   }
}

