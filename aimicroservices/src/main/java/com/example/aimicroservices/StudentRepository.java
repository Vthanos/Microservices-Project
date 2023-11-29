package com.example.aimicroservices;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student> findAllByschoolId(Integer schooId);

}
