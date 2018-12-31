public class Rearrange{   
    public static void rearrange(int arr[], int n) 
    { 
       int max_idx = n - 1, min_idx = 0; 
       int max_elem = arr[n - 1] + 1; 
       for (int i = 0; i < n; i++) { 
          if (i % 2 == 0) { 
                arr[i] += (arr[max_idx] % max_elem) * max_elem; 
                max_idx--; 
            } 
            else { 
                arr[i] += (arr[min_idx] % max_elem) * max_elem; 
                min_idx++; 
            } 
        } 
        for (int i = 0; i < n; i++) 
            arr[i] = arr[i]/max_elem; 
        } 
        public static void main(String args[]) 
       { 
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; 
        int n = arr.length; 
        System.out.println("Original Array"); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
        rearrange(arr, n); 
        System.out.print("Modified Array"); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
} 
  
