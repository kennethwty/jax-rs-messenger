package hk.com.kennethwty.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import hk.com.kennethwty.messenger.databse.Database;
import hk.com.kennethwty.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = Database.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello from the other side!", "Kenneth"));
		messages.put(2L, new Message(2, "Hello from the inside", "Jacky"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long msgId) {
		return messages.get(msgId);
	}
	
	public Message addMessage(Message msg) {
		msg.setId(messages.size() + 1);
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message updateMessage(Message msg) {
		if(msg.getId() <= 0) {
			return null;
		}
		// Updates the previous value for the key
		messages.put(msg.getId(), msg);
		return msg;
	}
	
	public Message deleteMessage(long msgId) {
		return messages.remove(msgId);
	}
	
}
