package in.cdac.model;

import java.util.Date;

/**
 * @author:Govinda<govinda@cdac.in>
 * Date:10-Aug-2017
 */
public class Profile
{
	long id;
	String profileName;
	String firstName;
	String lastName;
	Date createdOn;
	
	public Profile( long id, String profileName, String firstName, String lastName, Date createdOn )
	{
		super();
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdOn = createdOn;
	}

	public Profile()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId()
	{
		return id;
	}

	public String getProfileName()
	{
		return profileName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public Date getCreatedOn()
	{
		return createdOn;
	}

	public void setId( long id )
	{
		this.id = id;
	}

	public void setProfileName( String profileName )
	{
		this.profileName = profileName;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}

	public void setCreatedOn( Date createdOn )
	{
		this.createdOn = createdOn;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((profileName == null) ? 0 : profileName.hashCode());
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
		Profile other = (Profile) obj;
		if (createdOn == null)
		{
			if (other.createdOn != null)
				return false;
		}
		else if (!createdOn.equals(other.createdOn))
			return false;
		if (firstName == null)
		{
			if (other.firstName != null)
				return false;
		}
		else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null)
		{
			if (other.lastName != null)
				return false;
		}
		else if (!lastName.equals(other.lastName))
			return false;
		if (profileName == null)
		{
			if (other.profileName != null)
				return false;
		}
		else if (!profileName.equals(other.profileName))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Profile [id=" + id + ", profileName=" + profileName + ", firstName=" + firstName + ", lastName=" + lastName + ", createdOn=" + createdOn + "]";
	}
}
