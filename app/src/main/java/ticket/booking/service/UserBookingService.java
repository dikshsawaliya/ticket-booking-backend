package ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jdi.request.StepRequest;
import ticket.booking.entities.Ticket;
import ticket.booking.entities.User;
import ticket.booking.utils.UserServiceUtil;

import javax.swing.text.html.Option;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;

    private List<User> userList;

    private  ObjectMapper objectMapper = new ObjectMapper();

    private static final  String USERS_PATH = "../localDb/users.json";

    public UserBookingService(User user1) throws IOException {
        this.user = user1;

        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) &&
                    UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try {
            userList.add(user1);
            saveUserListFile();
            return Boolean.TRUE;
        }catch (IOException e){
            return Boolean.FALSE;
        }
    }

    private void saveUserListFile() throws IOException {
        File file = new File(USERS_PATH);
        objectMapper.writeValue(file, userList);
    }

    public void fetUserBooking(){
        user.printTickets();
    }

    public void cancelBooking(String ticketId){
        File file = new File(USERS_PATH);
        Optional<Ticket> ticket = user.getTicketsBooked().stream().filter(ticket ->{
            ticket.equals(ticketId);
        }).findFirst();

        user.getTicketsBooked().remove(ticket);

    }
}
