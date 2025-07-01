//package com.kuldeepghorpade.journal.Controller;
//
//import com.kuldeepghorpade.journal.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//
////    used for in memory database
////    consider this map as temp database for keeping and deleting entries
//    private Map<Long, JournalEntry> journalentries = new HashMap<>();
//
//   /** methods inside a controller class should be public so that they can be accesses and invoked by the spring framework or external http requests */
////    get mapping
////    http://localhost:8080/journal  - for get
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalentries.values());
//    }
//
////    http://localhost:8080/journal  - for post
////    post mapping
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myentry){
//        journalentries.put(myentry.getId(), myentry);
//        return true;
//    }
//
////    http://localhost:8080/journal/id/1
////    get mapping specific id
//    @GetMapping("id/{myid}")
//    public JournalEntry getjournalentrybyid(@PathVariable Long myid){
//        return journalentries.get(myid);
//    }
//
//
////   http://localhost:8080/journal/id/1
////    delete by id
//    @DeleteMapping ("id/{myid}")
//    public JournalEntry deletejournalentrybyid(@PathVariable Long myid){
//        return journalentries.remove(myid);
//    }
//
////    to update after deleting
//
//    @PutMapping("/id/{id}")
//    public JournalEntry updatejournalbyid(@PathVariable Long id, @RequestBody JournalEntry myentry){
//       return journalentries.put(id, myentry);
//    }
//
//
//}
