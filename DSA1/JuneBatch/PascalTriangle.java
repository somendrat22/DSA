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
        ArrayList<ArrayList<Integer>> pascalT = new ArrayList<>();
		ArrayList<Integer> row0 = new ArrayList<>();
		row0.add(1);
		pascalT.add(row0);
		for(int i = 1; i < numRows; i++){ // i = 3
			ArrayList<Integer> row = new ArrayList<>();
			row.add(1);
			ArrayList<Integer> prevRow = pascalT.get(i - 1);
			for(int j = 0; j < prevRow.size() - 1; j++){
				int val1 = prevRow.get(j);
				int val2 = prevRow.get(j + 1);
				int sum = val1 + val2;
				row.add(sum);
			}
			row.add(1);
			pascalT.add(row);
		}

		return pascalT;
		
    }
}
