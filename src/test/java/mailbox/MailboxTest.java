package mailbox;

import client.Client;
import client.Gender;
import mailbox.MailCode;
import mailbox.MailAddInfo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailboxTest {
    Mailbox mailBox;
    MailAddInfo mailInfo;
    MailCode mailCode;
    Client client;
    ArrayList<MailAddInfo> mailInfos = new ArrayList<>();

    @BeforeEach
    void setUp(){
        mailBox = new Mailbox();
        mailInfo = new MailAddInfo();

        client = new Client("Stepan", 18, Gender.MALE);
        client.setEmail("stepan@gmail.com");

        mailCode = MailCode.USERHELLO;
        mailInfo.setClient(client);
        mailInfo.setMailCode(mailCode);

        mailBox.addMailInfo(mailInfo);
    }

    @Test
    void TestAddMailInfo(){
        mailBox.addMailInfo(mailInfo);
        mailInfos.add(mailInfo);
        assertEquals(mailBox.getInformation().get(0).getEmail(), mailInfos.get(0).getEmail());
    }

}