package com.BerkerSpring.BerkerHelloWorld.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //responsible to dataaccess
public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query("SELECT s FROM Student s WHERE s.Email=?1")
    Optional<Student> findStudentByEmail(String email);

}
