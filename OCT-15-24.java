// Concept Used : Counting Inversions 
/*  The problem statement state that you need to shift all ones to 
 rightmost and zeros to leftmost,  Key condition is you can swap adjacent elemeny
  Find the minimum step to get desired output
 */ 

 class OCT_15{
     public static void main(String[] args) {
        minimumSteps("101010"); 
        // Answer should be 6 
    
    } 

     public static long minimumSteps(String s) {
        int right = s.length(); 
        long ans = 0 , count = 0;
        while(right-->0)
        {
          char ch = s.charAt(right); 
          if(ch == '0') count++; 
          else  ans+=count;
        } 
        return ans;
    }
 } 

 // How this approach ensure the it makes all ones right and zeros left 
 // 1. We are iterating from right to left
 // 2. We are counting the number of zeros we encounter while iterating from right to left
 // 3. We are adding the count of zeros to the answer because each zero we encounter will
 //    need to be shifted to the leftmost position and each one we encounter will need to be
 //    shifted to the rightmost position, so the number of steps required to shift a zero to
 //    the leftmost position is equal to the number of ones we have encountered so far.
 // 4. This approach ensures that we are considering all possible positions of the ones and zeros

  

 /* 
  * 
   Counting Inversions
Problem: Count how many pairs (i, j) in an array such that i < j and arr[i] > arr[j].
Description: Measures how disordered the array is compared to a sorted array. 


2. Minimum Adjacent Swaps to Sort
Problem: Find the minimum number of adjacent swaps to sort an array.
Description: Each inversion represents a swap needed to sort the array. 


3. Binary String Swaps
Problem: Given a binary string, calculate the minimum swaps to move all '1's to the right and '0's to the left.
Description: Similar to counting how many '1's are out of place relative to '0's. 


4. Merge Sort Inversion Counting 
Problem: Modify merge sort to count inversions during the merging step.
Description: Efficient inversion counting as part of merge sort (O(n log n)). 


5. K-Adjacent Swaps to Sort
Problem: Minimize the number of adjacent swaps to sort an array or string with constraints.
Description: Limit swaps to adjacent elements but still aim to sort. 


6. Minimum Swaps to Group Similar Elements
Problem: Find the minimum swaps required to group similar elements (e.g., group all 0’s and 1’s in a binary string).
Description: Rearranging elements with minimal swaps based on similarity. 


7. Sort with Fixed Swaps
Problem: Given an array and fixed allowed swaps, find the minimum moves to sort.
Description: Swap only between predefined pairs and minimize sorting cost. 


8. Lexicographically Smallest String with Swaps
Problem: Find the smallest possible string by performing a limited number of swaps between adjacent characters.
Description: Focus on achieving lexicographical order with minimal swaps. 


9. 15-Puzzle Problem
Problem: Determine if a 15-puzzle configuration is solvable by counting inversions.
Description: Use inversion counting to check puzzle solvability. 


10. Minimum Swaps to Make a Palindrome
Problem: Calculate the minimum swaps needed to rearrange a string into a palindrome.
Description: Rearrange characters with minimal swaps to form a palindrome.
  */