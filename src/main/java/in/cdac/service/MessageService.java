package in.cdac.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import in.cdac.model.Message;

/**
 * @author:Govinda<govinda@cdac.in>
 * Date:09-Aug-2017
 */
public class MessageService
{	
	
	
	public static long id=4L;
	public List<Message> messages = new ArrayList<Message>(){{
		add(new Message(1L, "Hello world", getCurrentDate(), "Govinda"));
		add(new Message(2L, "Demo msg 2nd", getCurrentDate(), "Abc"));
		add(new Message(3L, "Third message", getCurrentDate(), "Xyz"));
		add(new Message(4L, "4th message", getCurrentDate(), "Wadsa"));
	}};
	/**
	 * @param id
	 * @return
	 */
	
	public Date getCurrentDate(){
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 0); 
		return today.getTime();
	}
	
	public List<Message> getAll( )
	{
		return this.messages;
	}
	
	public Message get( Long id )
	{
		Message msg = null;
		for(Message message: messages){
			if(message.id == id){
				return message;
			}
		}
		return msg;
	}
	
	public Message update( Message update )
	{
		Message msg = null;
		for(Message message: messages){
			if(message.id == update.id){
				message.text=update.text;
				message.sentOn =  getCurrentDate();
				message.author = update.author;
				return message;
			}
		}
		return msg;
	}
	
	public Message add(Message message)
	{	
		Message genMessage = new Message(id++, message.text, getCurrentDate(), message.author);
		this.messages.add(genMessage);
		return genMessage;
	}
	
	public Message delete(long id)
	{	
		Message msg = null;
		for(Message message: messages){
			if(message.id == id){
				messages.remove(message);
				return message;
			}
		}
		return msg;
	}
}
