package Messenger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message{
    private String author;
    private Text content;
    private Date date = new Date();

    public Message(String author, Text content){
        this.author = author;
        this.content = content;
    }

    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd:MM:yyyy");
        return author + " "+ sdf.format(date) + ":  '" + content + "'";
    }
}
