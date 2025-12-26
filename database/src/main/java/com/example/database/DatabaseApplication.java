package com.example.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.database.entity.Student;
import com.example.database.repository.StudentRepository;

@SpringBootApplication
public class DatabaseApplication {

    private final StudentRepository studentRepository;

    DatabaseApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

	public static void main(String[] args) {
		// SpringApplication.run(DatabaseApplication.class, args);

		ApplicationContext context = SpringApplication.run(DatabaseApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		Student student = new Student();

		// STORE 1 STUDENET:
		// student.setName("Candice");
		// student.setAddress("Washington");
		// student.setCourse("Occutl Studies");

		// Student st = studentRepository.save(student);
		// System.out.println(st);


		// STORE LIST OF STUDENTS:
		// List<Student> students = new ArrayList<>();
		// students.add(new Student(0, "Tyler", "Georgia", "Maths"));
		// students.add(new Student(0, "Bonnie", "New Orleans", "History"));
		// students.add(new Student(0, "Klauds", "Forks", "Physics"));

		// studentRepository.saveAll(students);

		// // ITERATE ALL STUDENTS:
		// Iterable<Student> iterable = studentRepository.saveAll(students);
		// for (Student s : iterable) {
		// 	System.out.println(s);			
		// } 

		// UPDATE STUDENT:
		// Student s1 = studentRepository.findById(2).get();
		// s1.setName("Elijah");
		// s1.setAddress("Mystic Falls");
		// s1.setCourse("Biology");

		// studentRepository.save(s1);

		// System.out.println(s1);

		// List<Integer> del = List.of(3,4);
		// studentRepository.deleteAllById(del);
		
		Student byName = studentRepository.findByName("Tyler");
		System.out.println(byName); 
	}

}
