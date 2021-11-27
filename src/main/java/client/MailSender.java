package client;

import lombok.SneakyThrows;
import mailbox.MailAddInfo;

public class MailSender {

    @SneakyThrows
    public static void sendMail(MailAddInfo info){
        System.out.println(info.getEmail() + " has new email: \n" + info.getText());
    }

}