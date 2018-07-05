package Messenger;

import java.util.ArrayList;

public class Dialog{
    private ArrayList<Message> messages = new ArrayList<>();

    public void printAllMessages(){
        for(Message message : messages){
            System.out.println(message);
        }
    }

    public Dialog addMessage(Message message){
        messages.add(message);
        return this;
    }
}
