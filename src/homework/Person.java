package homework;

public class Person {
	public  Person(){}
	public Person(String job){
		this.job=job;
	}
	public String toString() {
		return job;
	}
	private String name ;
	private String  usename;
	private String  password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	private String job;
	

	
	
	

}
