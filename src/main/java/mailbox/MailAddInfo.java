package mailbox;

import client.Client;
import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;

@Setter @Getter
public class MailAddInfo {

    private Client client;
    private MailCode mailCode;

    public String getText(){
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", (new Integer(this.client.getAge())).toString());
        String text = mailCode.generateText();

        for (String neededKey : templates.keySet()){
            text = text.replace(neededKey, templates.get(neededKey));
        }

        return text;
    }

    public String getEmail(){
        return client.getEmail();
    }




}
