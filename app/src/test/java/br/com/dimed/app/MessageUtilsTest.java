/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.com.dimed.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageUtilsTest {
    @Test public void testGetMessage() {
        assertEquals("HelWorld!", MessageUtils.getMessage());
    }
}
