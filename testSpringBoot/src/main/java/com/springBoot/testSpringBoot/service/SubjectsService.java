package com.springBoot.testSpringBoot.service;

import com.springBoot.testSpringBoot.model.Subjects;
import com.springBoot.testSpringBoot.repository.ISubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsService {
    @Autowired
    private ISubjectRepo repo;
    
    public void saveSubject(Subjects sub){
        repo.save(sub);
    }
    
    public List<Subjects> getAllSub(){
        
        return repo.findAll();
    }
    
    public void deleteSub(Integer id){
        repo.deleteById(id);
    }
    
    public Subjects findSub(Integer id){
        return repo.findById(id).get();
                
    }


}
