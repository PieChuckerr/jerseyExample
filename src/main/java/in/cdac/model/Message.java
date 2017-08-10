package in.cdac.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author:Govinda<govinda@cdac.in>
 * Date:09-Aug-2017
 */


@XmlRootElement
public class Message
{
	public long id;
	public String text;
	public Date sentOn;
	public String author;
	
	@XmlTransient
	Map<Long,Comment> comments = new HashMap<>();
	
	public Message( long id, String text, Date sentOn, String author )
	{
		super();
		this.id = id;
		this.text = text;
		this.sentOn = sentOn;
		this.author = author;
	}
	
	public Message( )
	{
		super();
	}
	
	public long getId()
	{
		return id;
	}
	public String getText()
	{
		return text;
	}
	public Date getSentOn()
	{
		return sentOn;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setId( long id )
	{
		this.id = id;
	}
	public void setText( String text )
	{
		this.text = text;
	}
	public void setSentOn( Date sentOn )
	{
		this.sentOn = sentOn;
	}
	public void setAuthor( String author )
	{
		this.author = author;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((sentOn == null) ? 0 : sentOn.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}
	@Override
	public boolean equals( Object obj )
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (author == null)
		{
			if (other.author != null)
				return false;
		}
		else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (sentOn == null)
		{
			if (other.sentOn != null)
				return false;
		}
		else if (!sentOn.equals(other.sentOn))
			return false;
		if (text == null)
		{
			if (other.text != null)
				return false;
		}
		else if (!text.equals(other.text))
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "Message [id=" + id + ", text=" + text + ", sentOn=" + sentOn + ", author=" + author + "]";
	}
	
	
}
