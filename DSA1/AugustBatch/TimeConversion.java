import java.util.*;

public class Main {
    static void timeConversion(String s) {
       String [] time = new String[4]; 
		// 0 -> hh;
		// 1 -> mm;
		// 2 -> ss;
		// 3 -> AM/PM;
		int i  = 0;
		int j  = 0;
		int idx  = 0;
		
		while(j < s.length()){
			char ch = s.charAt(j);
			if(ch == ':'){
				String sub = s.substring(i, j);
				time[idx] = sub; // 0 -> idx 
				idx++;
				j++; //
				i = j;
			}else if(ch == 'A' ||  ch == 'P'){
				String sub = s.substring(i, j);
				time[idx] = sub;
				idx++;
				i = j;
				j++;
			}else{
				j++;
			}
		}
		// AM Or PM 
		String sub = s.substring(i, j);
		time[idx] = sub;

		String amOrPM = time[3];

		if(amOrPM.equals("PM")){
			String hh12 = time[0];
			if(!hh12.equals("12")){
				int hh24 = Integer.parseInt(hh12) + 12;
				time[0] = hh24 + "";
			}
		}else{
			String hh12 = time[0];
			if(hh12.equals("12")){
				time[0] = "00";
			}
		}

		String hh = time[0];
		String mm = time[1];
		String ss = time[2];

		System.out.println(hh + ":" + mm + ":" + ss);
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
