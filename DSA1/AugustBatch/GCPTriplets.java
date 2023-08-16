import java.util.*;

public class Main {
    
    public static void findGeometricTriplets(int arr[], int n) {
        for(int i = 0; i < arr.length; i++){ // Val1 loop;
			int val1 = arr[i];
			for(int j = i + 1; j < arr.length; j++){ // Val2 loop
				int val2 = arr[j];
				for(int k = j + 1; k < arr.length; k++){ // Val3 loop
					int val3 = arr[k];
					double fact1 = (val2*1.0)/val1;
					double fact2 = (val3*1.0)/val2;
					if(fact1 == fact2){ // Its a GCP Triplet 
						System.out.println(val1 + " " + val2 + " " + val3);
					}
				}
			}
			
		}
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        findGeometricTriplets(arr, N);
        sc.close();
    }
}
