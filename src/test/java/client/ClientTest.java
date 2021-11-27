package client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client singleUser;
    @BeforeEach
    void setUp() {
        singleUser = new Client("Stepan", 18, Gender.MALE);
        ClientID.setCounter(0);
    }

    @Test
    void TestGetName() {
        assertEquals(singleUser.getName(),"Stepan");
    }

    @Test
    void TestGetAge() {
        assertEquals(singleUser.getAge(),18);
    }

    @Test
    void testGetSex() {
        assertEquals(singleUser.getSex(),Gender.MALE);
    }

    @Test
    void TestGetId() {
        assertEquals(singleUser.getId(),1);
    }

}