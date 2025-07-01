package com.kuldeepghorpade.journal.Controller;

import com.kuldeepghorpade.journal.entity.JournalEntry;
import com.kuldeepghorpade.journal.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerv2 {

    @Autowired
    private JournalEntryService journalEntryService;


   /** methods inside a controller class should be public so that they can be accesses and invoked by the spring framework or external http requests */
//    get mapping
//    http://localhost:8080/journal  - for get
    @GetMapping
    public List<JournalEntry> getAll(){
       return journalEntryService.getall();
    }

//    http://localhost:8080/journal  - for post
//    post mapping
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }

//    http://localhost:8080/journal/id/1
//    get mapping specific id
    @GetMapping("id/{myid}")
    public JournalEntry getjournalentrybyid(@PathVariable ObjectId myid){
        return journalEntryService.findbyid(myid).orElse(null);
    }


//   http://localhost:8080/journal/id/1
//    delete by id
    @DeleteMapping ("id/{myid}")
    public boolean deletejournalentrybyid(@PathVariable ObjectId myid){
        journalEntryService.deletebyid(myid);
        return true;
    }

//    to update after deleting

    @PutMapping("/id/{id}")
    public JournalEntry updatejournalbyid(@PathVariable ObjectId id, @RequestBody JournalEntry newentry){
     JournalEntry oldentry =  journalEntryService.findbyid(id).orElse(null);

     if(oldentry != null){
         oldentry.setTitle(newentry.getTitle() != null && !newentry.getTitle().equals("") ? newentry.getTitle() : oldentry.getTitle());
         oldentry.setContent(newentry.getContent() != null && !newentry.getContent().equals("") ? newentry.getContent() : oldentry.getContent());
     }

        journalEntryService.saveEntry(oldentry);
        return oldentry;
    }


}
