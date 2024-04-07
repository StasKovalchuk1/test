package com.example.kafkaconsumer.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="test_entity")
@Entity
public class TestEntityData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String eventData;


}
