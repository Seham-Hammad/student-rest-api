package springstudentreatapi.studentrestapi.student;


import java.util.List;

public class Student {
	
	private String id;
	private String name;
	private String desc;
	//private List<String> courses;
	
	public Student() {
		
	}
	
	public Student(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		//this.courses = courses;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
*/
}
