package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Lead;

@Repository
public interface LeadRepository extends MongoRepository<Lead, String>
{
    public Optional<Lead> findById(String id);

    @Query("{'dateOfAddition': {$gte: ?0, $lte:?1 }}")
    public List<Lead> getLeadsByDate(LocalDate from, LocalDate to);
    // should we use LocalDateTime for 
    //https://www.chamindu.dev/posts/localdatetime-spring-mongodb/
    //Date today = new Date();
    //LocalDateTime ldt = LocalDateTime.ofInstant(today.toInstant(),ZoneId.systemDefault());

    //similar for followups
    //public List<Lead> findByAge(int age);
}
