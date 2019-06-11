package control;

import java.io.Serializable;

public class RegisterDetaUnit implements Serializable{

	private String id,pass,name,huri,old,gender;


	public RegisterDetaUnit(){}
	public RegisterDetaUnit(String id, String pass, String name,String huri, String old,String gender){
		this.id = id;
		this.pass= pass;
		this.name=name;
		this.huri=huri;
		this.old=old;
		this.gender=gender;
	}

	public String getid(){return id;}
	public String getpass(){return pass;}
	public String getname(){return name;}
	public String gethuri(){return huri;}
	public String getold(){return old;}
	public String getgender(){return gender;}

	public void setid(String id){this.id=id;}
	public void setpass(String pass){this.id=pass;}
	public void setname(String name){this.id=name;}
	public void sethuri(String huri){this.id=huri;}
	public void setold(String old){this.id=old;}
	public void setgender(String gender){this.id=gender;}

	}


