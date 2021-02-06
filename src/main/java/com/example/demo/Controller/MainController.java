package com.example.demo.Controller;

import com.example.demo.Model.Phrases;
import com.example.demo.Repository.PhrasesRepository;
import com.example.demo.Service.PhrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan(basePackageClasses = PhrasesRepository.class)
public class MainController {
    @Autowired
    private PhrasesService phrasesService;
    @PostMapping ("/add")
    public @ResponseBody Phrases create (@RequestParam String Phrase) {
        return phrasesService.create(Phrase);
    }
    @GetMapping("/all")
    public @ResponseBody Iterable<Phrases> getAllPhrases(){
        return phrasesService.findAll();
    }
    @PutMapping ("/set")
    public Phrases setPhraseById(@RequestParam long id, @RequestParam String Phrase){
        return phrasesService.set(id,Phrase);
    }
    @DeleteMapping ("/delete")
    public void deletePhrase(@RequestParam long id){
        phrasesService.deleteById(id);
    }
    @GetMapping("/phr")
    public Phrases findById(@RequestParam long id){
        return phrasesService.findById(id);
    }
}
