package com.example.kafkaconsumer.repository;


import com.example.kafkaconsumer.entity.TestEntityData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDataRepository extends JpaRepository<TestEntityData, Long> {

}
