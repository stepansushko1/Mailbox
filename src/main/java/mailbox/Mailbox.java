package mailbox;

import lombok.Getter;
import mailbox.MailAddInfo;
import client.MailSender;

import java.util.ArrayList;

@Getter
public class Mailbox {
    private ArrayList<MailAddInfo> information = new ArrayList<>();

    public Mailbox(){}

    public void addMailInfo(MailAddInfo info){
        information.add(info);
    }

    public void sendAll(){
        for (int i = 0; i < information.size(); i++){
            MailSender.sendMail(information.get(i));
        }
    }
}