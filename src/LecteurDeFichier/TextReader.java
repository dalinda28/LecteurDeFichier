package LecteurDeFichier;

import java.io.File;

public class TextReader extends Reader {
    public TextReader(File file) {
        super(file);
    }

    public void display() {
        for ( int i = 0; i < content.size(); i++ ) {
            System.out.println( content.get(i) );
        }
    }
    
}
