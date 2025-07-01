package com.kuldeepghorpade.journal.service;

import com.kuldeepghorpade.journal.entity.JournalEntry;
import com.kuldeepghorpade.journal.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Component
public class  JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    // post
    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepo.save(journalEntry);
    }

    // get
    public List<JournalEntry> getall(){
       return journalEntryRepo.findAll();
    }

    //find by id
    public Optional<JournalEntry> findbyid(ObjectId id){
        return journalEntryRepo.findById(id);
    }

    //delete
    public void deletebyid(ObjectId id){
        journalEntryRepo.deleteById(id);
    }

    //put




//flow ---> [controller] ---> [service] ---> [repository]

}