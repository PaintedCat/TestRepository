package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Phrases;

public interface PhrasesRepository extends CrudRepository<Phrases, Long> {
}
