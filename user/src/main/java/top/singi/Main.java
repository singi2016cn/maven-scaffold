package top.singi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.singi.service.UtilService;

public class Main {
    static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.info("{}", (new UtilService()).getWord("singi"));
    }
}