import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Solution ob =new Solution();
    ob.evaluation(exp);
  }
}

class Solution{
	public int calculate(int val1, int val2, char opr){
		if(opr  == '+'){
			return val1 + val2;
		}else if(opr == '-'){
			return val1 - val2;
		}else if(opr == '*'){
			return val1*val2;
		}else{
			return val1/val2;
		}
	}
    public void evaluation(String exp){
       Stack<Integer> st = new Stack<>();
	   Stack<String> infix = new Stack<>();
	   Stack<String> prefix = new Stack<>(); 
	   for(int i  = 0; i < exp.length(); i++){
		   char ch = exp.charAt(i);
		   if(ch >= '0' && ch <= '9'){
			   st.push(ch  - '0');
			   infix.push(ch  + "");
			   prefix.push(ch + "");
		   }else if(ch  == '+' || ch == '-' || ch == '*' || ch == '/'){
			   // Evaluation
			   int val2 = st.pop();
			   int val1 = st.pop();
			   int res = calculate(val1, val2, ch);
			   st.push(res);

			   
			   // Infix Expression 

			   String val2In = infix.pop();
			   String val1In = infix.pop();
			   String infixExpression  = '(' + val1In + ch + val2In + ')';
			   infix.push(infixExpression);


			   // prefix Expression 

			   String val2Pre = prefix.pop();
			   String val1Pre = prefix.pop();
			   String prefixExpression = ch + val1Pre + val2Pre;
			   prefix.push(prefixExpression);
			   
		   }
	   }

	  int evaluationRes = st.pop();
	  System.out.println(evaluationRes);
	  System.out.println(infix.pop());
	  System.out.println(prefix.pop());
    }
}                         
