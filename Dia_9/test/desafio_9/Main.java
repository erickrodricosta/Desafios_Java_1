/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio_9;


/**
 *
 * @author ficdev
 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    @Test
    public void testReadFile_Success() {
        // Arrange
        String expected = "Test line 1\nTest line 2\n";
        StringBuilder actual = new StringBuilder();

        // Act
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                actual.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            Assertions.fail("Exception thrown: " + e.getMessage());
        }

        // Assert
        Assertions.assertEquals(expected, actual.toString());
    }

    @Test
    public void testReadFile_FileNotFound() {
        // Arrange
        String expectedErrorMessage = "Arquivo não encontrado: test.txt";

        // Act
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            br.close();
            Assertions.fail("Expected FileNotFoundException was not thrown.");
        } catch (FileNotFoundException e) {
            // Assert
            Assertions.assertEquals(expectedErrorMessage, e.getMessage());
        } catch (IOException e) {
            Assertions.fail("Unexpected IOException was thrown: " + e.getMessage());
        }
    }
}
