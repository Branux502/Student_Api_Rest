package com.demo.student.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Optional<Teacher> findTeacherByCui(Long cui);
    Optional<Teacher> findTeacherByEmail(String email);
}
