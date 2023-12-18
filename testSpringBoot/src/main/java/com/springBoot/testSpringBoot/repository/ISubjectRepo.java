package com.springBoot.testSpringBoot.repository;

import com.springBoot.testSpringBoot.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepo extends JpaRepository<Subjects, Integer> {
}
