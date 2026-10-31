package Basic_Java;

public class Multidimensional_Arrays { // Многомерный массив

	public static void main(String[] args) {
	
		int[][] matrix = {{1,2,3}
		                 ,{4,5,6},
		                  {7,8,9}}; // двумернрый массив
		
		for (int i = 0; i < matrix.length; i++) { // внешний цикл, который идёт по строкам
			for (int j = 0; j < matrix[i].length; j++) { // внутренний цикл, который идёт по числам в этом массиве
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
