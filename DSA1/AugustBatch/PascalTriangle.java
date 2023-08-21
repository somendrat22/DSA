import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
       ArrayList<ArrayList<Integer>> main = new ArrayList<>();
	   ArrayList<Integer> zerothRow = new ArrayList<>();
	   zerothRow.add(1);
	   main.add(zerothRow);
	   for(int row = 1; row < numRows; row++){

		   // row -> 3

		   ArrayList<Integer> currRow = new ArrayList<>();
		   currRow.add(1);
		   ArrayList<Integer> prevRow = main.get(row - 1);
		   // ArraYList<Integer> prevROw = main.get(main.size() - 1);
		   for(int i  = 0; i < prevRow.size()  - 1; i++){
			   int adjSum = prevRow.get(i) + prevRow.get(i + 1);
			   currRow.add(adjSum);
		   }

		   currRow.add(1);
		   
		   main.add(currRow);
	   }

	   return main;
    }
}
