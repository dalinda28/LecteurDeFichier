package LecteurDeFichier;

import java.io.File;

public class TextReaderUpsideDown extends Reader {
    public TextReaderUpsideDown(File file) {
        super(file);
    }

    public void display() {
        for ( int i = content.size()-1; i >= 0; i-- ) {
            System.out.println( content.get(i) );
        }
    }
}
