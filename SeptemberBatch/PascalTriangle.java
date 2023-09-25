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

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) {

		// n -> 3 
        ArrayList<ArrayList<Integer>> main = new ArrayList<>(); // [[1], [1, 1], [1, 2, 1]]
		ArrayList<Integer> zerothRow = new ArrayList<>(); // [1]
		zerothRow.add(1); 
		main.add(zerothRow); 
        // row -> 1 to 2 row = 3
		for(int row  = 1; row < n; row++){
			// row = 1
			ArrayList<Integer> prevRow = main.get(row - 1); // [1, 1]
			
			ArrayList<Integer> currRow = new ArrayList<>(); // [1, 2, 1]
			currRow.add(1);  
			// i = 0 to 0
			// i = 1
			for(int i = 0; i < prevRow.size() - 1; i++){
				int vali = prevRow.get(i); // 1
				int vali1 = prevRow.get(i + 1); // 1
				int sum =  vali + vali1; // 2
				currRow.add(sum); // 2
			}

			currRow.add(1);

			main.add(currRow);
			
		}


		return main;
    }
}
