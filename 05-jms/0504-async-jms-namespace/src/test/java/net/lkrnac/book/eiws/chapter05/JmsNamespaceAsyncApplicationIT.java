package net.lkrnac.book.eiws.chapter05;

import net.lkrnac.book.eiws.chapter05.test.simplemessage.CommonJmsSimpleMessageTest;

import org.springframework.boot.test.SpringApplicationConfiguration;

/**
 * This test is relies on separate HornetQ server. During build Maven runs it
 * via hornetq-maven-plugin.
 * 
 * @author Lubos Krnac
 *
 */
@SpringApplicationConfiguration(classes = JmsNamespaceAsyncApplication.class)
public class JmsNamespaceAsyncApplicationIT extends CommonJmsSimpleMessageTest {
}
