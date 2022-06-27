package com.example.bookapplication.models;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Data
public class Book {
    private String title;
    private int cost;
    private String author;
    @Id
    @GeneratedValue
    private Integer id;
}
