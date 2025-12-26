package com.example.database.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.database.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student findByName(String name);

}
