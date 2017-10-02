import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Boolean_Evaluation implements booleanExpression 
{
	public static void main(String args[])
	{
System.out.println("Enter the boolean expression : ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.replaceAll("AND","&&");
	s=s.replaceAll("OR","||");
	s=s.toLowerCase();
	Boolean_Evaluation be=new 	Boolean_Evaluation();
	boolean result= be.EvaluateExpression(s);
	System.out.println("Result of expression is : "+result);
}
	public boolean EvaluateExpression(String s){
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
	try
 	{
	return (boolean) engine.eval(s);
	} catch (ScriptException e) {
			e.printStackTrace();

		}
return false;
}
	}
	
	
	
