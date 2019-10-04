package springstudentreatapi.studentrestapi.student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//we have to annotate it as a controller
@RestController
public class StudentController {
	//we need map the request to this method
	//@RequestMapping maps only to Get request
	
	@Autowired 
	private StudentService studentService;
	
	@GetMapping("/students")// what ever we return will be converted to JSON object by spring automatically
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
		
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> getStudent(@PathVariable String id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/students")// here we are adding the student object or instance to the list
	public void addStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);		
	}
	
	/**Update the student instance/object based on the selected id*/
	@PutMapping("/students/{id}")
	//@RequestMapping(method=RequestMethod.PUT, value=("/students/{id}"))
	public void updateStudent(@RequestBody Student student,@PathVariable String id) {
		studentService.UpdateStudentWithId(id, student);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable String id) {
	       studentService.delete(id);
	}

}