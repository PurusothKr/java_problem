import java.util.*;
public class spiral_matrix_in_rectangle {
	 public static int findK(int matrix[][], int n, int m, int k)
	    {
	        ArrayList<Integer>li=new ArrayList<>();
	        int left = 0, top = 0, bottom = n-1, right =m-1;
			 int c=0;
			 while(top <= bottom && left <= right)
	         {
	           
	                for(int i=left; i<=right  ; i++)
	                    {
	                        
	                            li.add( matrix[top][i]);
	                    }
	                        top++;
	             
	                for(int i=top; i<=bottom    ; i++)
	                    {
	                        
	                             li.add(matrix[i][right]); 
	                    }
	                        right--;

	                if(top<=bottom){
	                    for(int i=right; i>=left   ; i--)
	                    {
	                     
	                             li.add(matrix[bottom][i]); 
	                    }
	                        bottom--;
	                }

	                if(right>=left){
	                    for(int i=bottom; i>=top ; i--)
	                    {
	               
	                             li.add(matrix[i][left]);
	                    }
	                        left++;
	                }
	                 
	        }
//	        for(int i:li)
//		        System.out.println(i);
			 
			 if(k>=li.size())
			    return -1;
			  else
			    return li.get(k-1);
	        
	    }
	
//	 	    int top=0,left=0,right=n-1,bottom=n-1;
//	 	    ArrayList<Integer>li=new ArrayList<>();
		    
		    
//	 	    while(top<=bottom &&  left<=right)
//	 	    {
//	 	        for(int i=left;i<=right;i++)
//	 	        {
//	 	            li.add(arr[top][i]);
//	 	        }
//	 	        top++;
		        
//	 	        for(int i=top;i<=bottom;i++)
//	 	        {
//	 	            li.add(arr[i][right]);
//	 	        }
//	 	        right--;
		        
//	 	        if(top<=bottom)
//	 	        {
//	 	            for(int i=right;i>=left;i--)
//	 	            {
//	 	                li.add(arr[bottom][i]);
//	 	            }
//	 	            bottom--;
//	 	        }
//	 	        if(left<=right)
//	 	        {
//	 	            for(int i=bottom;i>=top;i--)
//	 	                {
//	 	                    li.add(arr[i][left]);
//	 	                }
//	 	            left++;
//	 	        }
		        
//	 	    }
//	 	   // for(int i:li)
//	 	   //     System.out.println(i);
//	 	    return li.get(k-1);
//	     }
	// }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, m = 4, k = 10;
			int	A[][] = {{1 , 2 , 3  ,4},
				         {5 , 6  ,7  ,8},
				         {9  ,10, 11 ,12},
				         {13 ,14 ,15, 16}};
			System.out.print(findK(A,n,m,k));
	}

}
