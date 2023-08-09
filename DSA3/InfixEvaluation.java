import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Solution ob =new Solution();
    ob.evaluate(exp);
  }
}

class Solution{

	public int calculate(int val1, int val2, char opr){
		if(opr == '+'){
			return val1 + val2;
		}else if(opr == '-'){
			return val1 - val2;
		}else if(opr == '*'){
			return val1*val2;
		}else{
			return val1/val2;
		}
	}
	public int priority(char opr){
		if(opr == '+' || opr == '-'){
			return 1;
		}else{
			return 2;
		}
	}
    public void evaluate(String exp){

		// Evaluation 
        Stack<Integer> oprand = new Stack<>(); // digit
		Stack<Character> opr = new Stack<>(); //

		for(int i  = 0; i <exp.length(); i++){
			char ch = exp.charAt(i);
            
			if(ch == '('){
				opr.push(ch);
			}if(ch >= '0' && ch <= '9'){
				int num = ch - '0';
				oprand.push(num);
			}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
				while(opr.size() > 0 && opr.peek() != '(' && priority(opr.peek()) >= priority(ch)){
					char opreator = opr.pop();
					int val2 = oprand.pop();
					int val1 = oprand.pop();
					int res = calculate(val1, val2, opreator);
					oprand.push(res);
				}
				opr.push(ch);
			}else if(ch  == ')'){
				while(opr.size() > 0 && opr.peek() != '('){
					char opreator = opr.pop();
					int val2 = oprand.pop();
					int val1 = oprand.pop();
					int res = calculate(val1, val2, opreator);
					oprand.push(res);
				}

				if(opr.size() > 0 ){
					opr.pop();
				}
				
			}

		}


		if(opr.size() != 0){
			while(opr.size() != 0){
				char opreator = opr.pop();
				int val2 = oprand.pop();
				int val1 = oprand.pop();
				int res = calculate(val1, val2, opreator);
				oprand.push(res);
			}
		}

		System.out.println(oprand.pop());



		// Conversion
		opr = new Stack<>();
		Stack<String> prefix = new Stack<>();
		Stack<String> postfix = new Stack<>();

		for(int i = 0; i < exp.length(); i++){
			char ch = exp.charAt(i);
			if(ch >= '0' && ch <= '9'){
				prefix.push(ch + ""); // 'a' + "" -> "a"
				postfix.push(ch + "");
			}else if(ch == '('){
				opr.push('(');
			}else if(ch  == '+' || ch == '-' || ch == '*' || ch == '/'){
				while(opr.size() > 0 && opr.peek() != '(' && priority(opr.peek()) >= priority(ch)){
					char opreator = opr.pop();
					String val2 = prefix.pop();
					String val1 = prefix.pop();
					String prefixValue = opreator + val1 + val2; 
					prefix.push(prefixValue);

					String val2Post = postfix.pop();
					String val1Post = postfix.pop();
					String postfixValue = val1Post + val2Post + opreator;
					postfix.push(postfixValue);
				}
				opr.push(ch);
			
		}else if(ch  == ')'){

			while(opr.size() > 0 && opr.peek() != '('){
					char opreator = opr.pop();
					String val2 = prefix.pop();
					String val1 = prefix.pop();
					String prefixValue = opreator + val1 + val2; 
					prefix.push(prefixValue);

					String val2Post = postfix.pop();
					String val1Post = postfix.pop();
					String postfixValue = val1Post + val2Post + opreator;
					postfix.push(postfixValue);
				}

				if(opr.size() > 0){
					opr.pop();
				}

		}
    }

	 while(opr.size() != 0){
		 char opreator = opr.pop();
		 String val2 = prefix.pop();
		 String val1 = prefix.pop();
		 String prefixValue = opreator + val1 + val2; 
	     prefix.push(prefixValue);

		String val2Post = postfix.pop();
		String val1Post = postfix.pop();
		String postfixValue = val1Post + val2Post + opreator;
		postfix.push(postfixValue);
	 }

	System.out.println(postfix.pop());
	System.out.println(prefix.pop());
	}
}               
