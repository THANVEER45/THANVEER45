import javax.script.ScriptEngine;
import.java.io.FileNotFoundException;

public class NashornJs {
	public static void main(String[] args) throws FileNotFoundException,ScriptException{
		ScriptEngine se=new ScriptEngineManager().GetEngineByName("Nashorn");
		se.eval(new FileReader("sample.js"));
	}
	
		
}
