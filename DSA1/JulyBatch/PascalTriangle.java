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

		// numRows  -> 5
       // Main ArrayList : Which is going to store all the rows datas
		ArrayList<ArrayList<Integer>> allRows = new ArrayList<>(); //allRows  -> []
		// 0th Row
		ArrayList<Integer> zerothRow = new ArrayList<>(); // zerothRow  -> []
		zerothRow.add(1); // zerothRow  -> [1]
		allRows.add(zerothRow); // allRows -> [[1]]

		for(int row  = 1; row < numRows; row++){
			// allRows -> [[1]]
			ArrayList<Integer> prev = allRows.get(allRows.size() - 1); // [1]
			// Construct Row;
			ArrayList<Integer> currRow = new ArrayList<>(); // []
			currRow.add(1); // adding one manually in the starting // [1]
			for(int i  = 0; i < prev.size() - 1; i++){ // 0 to < 0
			    //  i = 0, 1 + 2
				int alternateSum = prev.get(i) + prev.get(i + 1); // 3
				currRow.add(alternateSum); // [1, 3]
			}

			// currRow : [1, 3, 3]  row : 3
			currRow.add(1); // [1, 1]
			allRows.add(currRow);
		}


		return allRows;
    }
}
