
/**
 * Write a description of class contact here.
 *
 * @author Sam Stephens
 * @version 3.25.20
 */
public class Contact
{
    private String name; private String relation; private String birthday;
    private String phoneNumber; private String email;
    public Contact(String n, String r, String b, String p, String e)
    {
        name = n;
        relation = r;
        birthday = b;
        phoneNumber = p;
        email = e;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getRelation()
    {
        return relation;
    }
    public void setRelation(String r)
    {
        relation = r;
    }
    public String getBirthday()
    {
        return birthday;
    }
    public void setBirthday(String b)
    {
        birthday = b;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String p)
    {
        phoneNumber = p;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String e)
    {
        email = e;
    }
    public String toString()
    {
        String str = String.format( "%-10s %-14s %-13s %-15s %-20s", name, relation, birthday, phoneNumber, email);
        return str;
    }
}
