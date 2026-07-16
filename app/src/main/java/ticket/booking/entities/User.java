package ticket.booking.entities;

import java.util.List;

public class User {

    private String name;
    private String password;
    private String hashedPassword;
    List<Ticket> ticketsBooked;
    String userId;


    public User(String name, String password, String hashedPassword, String userId, List<Ticket> ticketsBooked){
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.userId = userId;
        this.ticketsBooked = ticketsBooked;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
    public String getHashedPassword(){
        return hashedPassword;
    }
    public String getUserId(){
        return userId;
    }
    public List<Ticket> getTicketsBooked(){
        return ticketsBooked;
    }

    public void printTickets(){
        for (int i = 0; i < ticketsBooked.toArray().length; i++) {
            System.out.println(ticketsBooked.get(i).getTrainInfo());
        }
    }





}
