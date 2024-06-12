package entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import top.singi.entity.User;

public class UserTest {
    final User user = new User();

    @Test
    void testUser(){
        user.setName("singi");
        assertEquals(user.getName(), "singi");
    }
}
