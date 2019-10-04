package springstudentreatapi.studentrestapi.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired 
	private StudentRepository studentRepo;
	
	public List<Student> getAllStudents() {
		
		List<Student> students = new ArrayList<>();
		 studentRepo.findAll()
				.forEach(students::add);
				 return students;
		
	}
	public Optional<Student> getStudentById(String id) {
		 return studentRepo.findById(id);
	}
	public void addNewStudent(Student student) {
		//students.add(student);
		  studentRepo.save(student);
		
	}
	public void UpdateStudentWithId(String id, Student student) {
		studentRepo.save(student);		//save can do both add new row or if the row is already esixt then update it	
		}
	
	public void delete(String id) {
		studentRepo.deleteById(id);
		
	}


}
