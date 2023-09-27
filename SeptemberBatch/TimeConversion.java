import java.util.*;

public class Main {
    static void timeConversion(String s) {
        String [] time = s.split(":"); // "12:00:03PM" -> [12, 00, 03PM]
		// 0 -> hh -> 12
		// 1 -> mm -> 00
		// 2 -> ssAM or 03AM 

		// Indetify either AM or either PM ? 

	    //2nd index time array ->  4 length string -> "45PM" -> (0 to 1) -> 0 to 1st Index -> ss and 2nd index to end of the string AM OR PM
		// 45AM
		// 0123
		// "07:23:45AM" -> ["07", "23", "45AM"] -> time[2] -> "45AM" -> 2nd index -> A 

		//"07:23:45PM" -> ["07", "23", "45PM"] -> time[2] -> "45PM" -> 2nd index -> P

		// time[2] -> str -> 2nd index -> A -> AM or P -> PM 

       // "07:23:45PM" -> [07,23,45PM] -> 45PM -> 'A' -> 

		// time[2] -> "45PM" -> 0 to 1 -> ss -> 1 to end of the string -> AM or PM 
		char AmOrPM = time[2].charAt(2); // 03PM -> P

		if(AmOrPM == 'A'){
			// "07:45:23AM" -> 07:45:23
			String hh = time[0]; // 12
			if(hh.equals("12")){
				hh = "00";
			}
			String mm = time[1]; // 00
			String ss = time[2].substring(0, 2);   //03
			System.out.println(hh+":"+mm+":"+ss); //00:00:03
		}else{
			// [07, 00, 03PM]
	
		    String hh = time[0]; // "12"
			int hh12 = Integer.parseInt(hh); // 12
			int hh24 = hh12 + 12; // 19
			if(hh12 == 12){ 
				hh24 = 12;
			}
			String mm = time[1]; // 00
			String ss = time[2].substring(0, 2);  // 03
			System.out.println(hh24 + ":" + mm  + ":" + ss); // 12:00:03			
		}
		

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}
