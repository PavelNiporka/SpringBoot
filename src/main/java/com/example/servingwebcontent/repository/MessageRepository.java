package com.example.servingwebcontent.repository;

import com.example.servingwebcontent.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message,Long> {


}
