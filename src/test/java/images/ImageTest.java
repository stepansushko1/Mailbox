package images;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImageTest {
    public RealImage realImg;
    public ProxyImage proxyImg;

    @BeforeEach
    void setUp(){
        realImg = new RealImage("/home/stepan/Programming/Mailbox1");
        proxyImg = new ProxyImage("/home/stepan/Programming/Mailbox");
    }

    @Test
    void TestGetFileNameRealImage(){
        assertEquals(realImg.getFileName(), "/home/stepan/Programming/Mailbox1");
    }

    @Test
    void TestGetFileNameProxyImage(){
        assertEquals(proxyImg.getFileName(), "/home/stepan/Programming/Mailbox");
    }


}