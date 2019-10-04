package springstudentreatapi.studentrestapi.student;

import java.util.List;

public class Course {
	
	private String id;
	private String name;
	private String desc;
	private List<String> steps;

	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String id, String name, String desc, List<String> steps) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.steps = steps;
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

	public List<String> getSteps() {
		return steps;
	}

	public void setSteps(List<String> steps) {
		this.steps = steps;
	}

	

	

}
