import java.util.*;

public class Main {
    static void timeConversion(String s) {
    String [] time = new String[4];
		int idx  = 0;
		// idx -> 0 hh
		// idx -> 1 mm 
		// idx -> 2 ss
		// idx -> 3 AM/PM
	 	int i = 0;
		int j = 0;
		while(j < s.length()){
			char ch = s.charAt(j);
			if(ch  == ':'){
				String sub = s.substring(i, j);
				time[idx] = sub;
				idx++;
				j++;
				i = j;
			}else if(ch  == 'A' || ch == 'P'){
				String sub = s.substring(i, j); // ss
				time[idx] = sub;
				idx++;
				String am_pm = s.substring(j);
				time[idx] = am_pm;
				break;
			}else{
				j++;
			}
		}

		if(time[3].equals("PM") == true){
			String hh = time[0];
			if(hh.equals("12") != true){
				int hh12 = Integer.parseInt(hh);
				int hh24 = hh12 + 12;
				time[0] = hh24 + "";
			}
		}else{
			// 12:00:00AM -> 00:00:00
			// 07:12:45 -> 07:12:45
			String hh = time[0];
			if(hh.equals("12") == true){
				time[0] = "00";
			}
		
		}

		String time24 = time[0] + ":" + time[1] + ":" + time[2];
		System.out.println(time24);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
