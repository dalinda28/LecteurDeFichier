package LecteurDeFichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;

public class Read {
    public static void main(String[] args) {
        
        File file1 = new File("src/lecteurDeFichier/test.txt");
        File file2 = new File("src/lecteurDeFichier/test2.txt");
        
        System.out.println("Normal File Content : ----------------");
        TextReader testReader = new TextReader(file1);
        testReader.display();
        
        System.out.println(" Reverse File Content : -----------------");
        TextReaderUpsideDown testReaderUpsideDown = new TextReaderUpsideDown(file1);
        testReaderUpsideDown.display();
        
        System.out.println(" Palindrome File Content : --------------------");
        TextReaderReverse testReaderReverse = new TextReaderReverse(file1);
        testReaderReverse.display();
        
    }
}
