class MatrixMultiplier implements Runnable {
	private int [][] A,B,C;
	private int row;

	public MatrixMultiplier(int[][] a, int[][] b, int[][] c, int row)
	{
		this.A = A;
		this.B = B;
		this.C = C;

		this.row = row;
	}

	@Override
	public void run() 
	{
		int n = B.length;
		int p = B[0].length;

		for(int j = 0; j < p; j++)
		{
			C[row][j] = 0;
			for(int k = 0; k < n; k++)
			{
				C[row][j] += A[row][k] * B[k][j];
			}
		}
	}

}

public class MatrixMultiplication {

	public static void main(String[] args) throws InterruptedException
	{

		//AQ vou fazer estatico por enquanto outra hora vou botar para o usuario botar pracalcular
		int[][] A  = {{1,2,3}, {4,5,6}};
		int[][] B = {{7,8}, {9,10}, {11,12}};
		int [][] C = new int[A.length][B[0]].length];

		Thread[] thread = new Thread[A.length];

		for(int i = 0; i < A.length; i++)
		{
			threads[i] = new Thread(new MatrixMultiplier(A,B,C, i));

			threads[i].start();
		}

		for(Thread thread : threads)
		{
			thread.join();
		}

		System.out.println("Matriz resultante: ");

		for(int[] row : c) 
		{
			for(int value : row) 
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}





