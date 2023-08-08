import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
	
	public static long [] nsel(long [] hist){
		Stack<Integer> st = new Stack<>(); // Indexes of building
		long [] nse = new long[hist.length];
		for(int i = 0; i < hist.length; i++){
			while(st.size() > 0 && hist[i] <= hist[st.peek()]){
				st.pop();
			}
			if(st.size() == 0){
				nse[i] = -1;
			}else{
				nse[i] = st.peek();
			}
			st.push(i);
		}
		return nse;
	}
	public static long [] nser(long [] hist){
		Stack<Integer> st = new Stack<>(); // Indexes of building
		long [] nse = new long[hist.length];
		for(int i = hist.length - 1; i >= 0; i--){
			while(st.size() >  0 && hist[i] <= hist[st.peek()]){
				st.pop();
			}
			if(st.size() == 0){
				// ith 
				nse[i] = hist.length;
			}else{
				nse[i] = st.peek();
			}
			st.push(i);
		}

		return nse;
		
	}
	public static long maximumArea(long hist[], long n){

		long [] nseR = nser(hist);

		long [] nseL = nsel(hist);

		long maxArea = Long.MIN_VALUE;
		
	   for(int i = 0; i < hist.length; i++){
		   long h = hist[i];
		   long w = nseR[i] - nseL[i] - 1;
		   long area = h*w;
		   maxArea = Math.max(maxArea, area);
	   }

		return maxArea;
    }
}



