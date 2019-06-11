package control;//登録を行う

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class RegisterLogic implements Serializable{

	static Map<String,RegisterDetaUnit> setdeta = new HashMap<>();

	public static void execute(String name,RegisterDetaUnit unit){
			setdeta.put(name,unit);
	}

	public static String getid(String formid ){
		RegisterDetaUnit ia = setdeta.get(formid);
		String id = ia.getid();
		return id;}

	public static String getpass(String formpass ){
		RegisterDetaUnit ai = setdeta.get(formpass);
		String pass = ai.getpass();
		return pass;}


}

