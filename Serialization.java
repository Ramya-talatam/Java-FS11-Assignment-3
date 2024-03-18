import java.io.*;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contact;
    private String address;

    public Customer(int id, String name, String contact, String address) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

}

public class Serialization {
    public static void main(String[] args) throws IOException {
        Customer customer = new Customer(1, "Talatam Ramya", "1231231230", "D.no 456, Dream City");
        String filename="JavaObject.txt";
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        try
        {   
            out.writeObject(customer);
            out.close();
            file.close();
            System.out.println("serialized Customer object to "+filename+" file.");
 
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        finally 
		{
			out.close();
		}
    }
}
