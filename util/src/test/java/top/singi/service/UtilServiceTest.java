package top.singi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UtilServiceTest {

    final UtilService utilService = new UtilService();

    @Test
    void getWord(){
        assertEquals(utilService.getWord("singi"), "singi.");
    }
}
