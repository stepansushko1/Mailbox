package mailbox;

import lombok.Getter;
import lombok.SneakyThrows;
import java.io.File;
import java.util.Scanner;


@Getter
public enum MailCode {

    USERHELLO("hellouser.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        Scanner sc = new Scanner(filename);
        File file = new File(sc.nextLine());
        Scanner scanFile = new Scanner(file);
        String text = "";

        while (scanFile.hasNextLine()) {
            text += scanFile.nextLine() + '\n';
            System.out.println(text);
        }

        return text;
    }

}
