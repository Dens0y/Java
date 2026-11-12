
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] seatingChart = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };

	        System.out.println("CLASSROOM SEATING CHART");
	        
	        for (int i = 0; i < seatingChart.length; i++) {
	            for (int j = 0; j < seatingChart[i].length; j++) {
	                System.out.print(seatingChart[i][j] + " ");
	            }
	            System.out.println();
	        }
		
		
	}

}
