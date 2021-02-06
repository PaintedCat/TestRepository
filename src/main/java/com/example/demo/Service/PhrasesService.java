package com.example.demo.Service;

import com.example.demo.Model.Phrases;
import com.example.demo.Repository.PhrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Random;
@Service
public class PhrasesService {
    @Autowired
    private PhrasesRepository phrasesRepository;
    public List<Phrases> findAll(){
        return (List<Phrases>) phrasesRepository.findAll();
    }
    public void deleteById(Long id){
        phrasesRepository.deleteById(id);
    }
    public Phrases findById (Long id){
        return phrasesRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public Phrases create(String entity){
        Phrases n=new Phrases();
        n.setPhrase(entity);
        return phrasesRepository.save(n);
    }
    public Phrases save (Phrases entity){
        return phrasesRepository.save(entity);
    }
    public Phrases set(long id,String phr){
        Phrases n = new Phrases();
        n.setId(id);
        n.setPhrase(phr);
        return phrasesRepository.save(n);
    }
}
