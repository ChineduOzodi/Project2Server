package com.revature.repository;

import org.springframework.data.repository.CrudRepository;

import com.revature.beans.Conversation;

public interface ConversationRepo extends CrudRepository<Conversation, Integer>{

}
