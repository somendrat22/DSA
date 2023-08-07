import java.util.*;

public class Main {
    static void timeConversion(String str) {
        String [] time = new String[4];
		int i = 0;
		int j = 0;
		int idx = 0;
		while(j < str.length()){
			char ch = str.charAt(j);
			if(ch == ':'){
				String sub = str.substring(i, j);
				time[idx] = sub;
				idx++;
				j++;
				i = j;
			}else if(ch == 'A' || ch == 'P'){
				String sub = str.substring(i, j);
				time[idx] = sub;
				idx++;
				i = j;
				j++;
			}else{
				j++;
			}
		}
		time[idx] = str.substring(i, j);

		if(time[3].equals("PM") == true){
			String hour = time[0];
			if(hour.equals("12") == false){
				int hh = Integer.parseInt(hour);
				int nhh = hh + 12;
				time[0] = nhh + "";
			}
		}else{
			String hour = time[0];
			if(hour.equals("12") == true){
				time[0] = "00";
			}
		}
		System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
