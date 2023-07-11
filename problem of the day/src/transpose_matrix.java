
public class transpose_matrix {
	public static void transpose(int n,int a[][])
    {
        int[][]arr=new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=a[j][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=arr[i][j];
            }
        }
        for(int []i:a)
        	for(int j:i)
        		System.out.print(j);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
			int	mat[][] = {{1, 1, 1, 1},
				           {2, 2, 2, 2},
				           {3, 3, 3, 3},
				           {4, 4, 4, 4}};
			 transpose(N,mat);
	}

}
