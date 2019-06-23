package hk.com.kennethwty.messenger.databse;

import java.util.HashMap;
import java.util.Map;

import hk.com.kennethwty.messenger.model.Message;
import hk.com.kennethwty.messenger.model.Profile;

/* Acting as an in-memory data source */
public class Database {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
	
}
