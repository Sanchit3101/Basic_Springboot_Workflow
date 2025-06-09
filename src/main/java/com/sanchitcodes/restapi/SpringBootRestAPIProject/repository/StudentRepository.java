package com.sanchitcodes.restapi.SpringBootRestAPIProject.repository;

import com.sanchitcodes.restapi.SpringBootRestAPIProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
