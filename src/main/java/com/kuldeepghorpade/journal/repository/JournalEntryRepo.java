package com.kuldeepghorpade.journal.repository;

import com.kuldeepghorpade.journal.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/** `MongoRepository` is a Spring Data interface that lets you perform **CRUD operations** on MongoDB **without writing any code** — just extend it and Spring handles the rest.

 ### Example:

 ```java
 public interface UserRepository extends MongoRepository<User, String> {
 List<User> findByName(String name);
 }
 ```

 - It saves, finds, deletes documents in MongoDB.
 - No need to write SQL or Mongo queries for basic tasks.

 ✅ Super quick, powerful, and built for MongoDB. */

public interface JournalEntryRepo extends MongoRepository<JournalEntry, ObjectId>{

}
