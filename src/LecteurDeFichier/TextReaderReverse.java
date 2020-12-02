package LecteurDeFichier;

import java.io.File;

public class TextReaderReverse extends Reader {
    public TextReaderReverse(File file) {
        super(file);
    }

    public void display() {
        for ( int i = 0; i < content.size(); i++ ) {
            String reverse = "";
            
            for ( int j = content.get(i).length()-1; j >= 0; j--) {
                reverse = reverse + content.get(i).charAt(j);
            }
                    
            System.out.println(reverse);
        }
    }
}
