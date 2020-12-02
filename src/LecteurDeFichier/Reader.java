package LecteurDeFichier;
import java.io.*;
import java.util.ArrayList;

public abstract class Reader implements FileReader {
    protected File file;
    protected FileInputStream in;
    protected BufferedReader reader;
    protected ArrayList<String> content;

    public Reader(File file) {
        this.file = file;
        in = null;
        reader = null;
        content = new ArrayList<String>();
        prepareFile();
    }
    
    public void prepareFile() {
        try {
            in = new FileInputStream(this.file);
            reader = new BufferedReader(new InputStreamReader(in));

            String line = reader.readLine();

            while(line != null){
                this.content.add(line);
                line = reader.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    public abstract void display();
}
