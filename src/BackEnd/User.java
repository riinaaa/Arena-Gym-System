package BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //نقرأ من الفايل ونقارن اليوسرنيم بالid 
    public static int Login(String name, String pass)  {
        try {
            Scanner input = new Scanner(new File("AccountsInfo.txt"));
            while (input.hasNext()) {
                int ID=input.nextInt();
                String User_Name = input.next();
                String Password = input.next();
                if (User_Name.equalsIgnoreCase(name) && Password.equals(pass)) {
                    return ID;
                }
            }
            return -1;
        } catch (FileNotFoundException ex) {
            System.out.println("Error:File not found");
            return -1;
        }
    }
    


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
