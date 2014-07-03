package smartnode.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;

/**
 * Created by nogueira on 7/2/14.
 */
public class ATLogger {

    BufferedWriter log_file_writer;

    /**
     *
     */
    public ATLogger(String log_file_path) {
        File log_file = new File(log_file_path);
        try {
            log_file_writer  = new BufferedWriter(new FileWriter(log_file));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     *
     */
    public void log(String log_message){

        try{
            log_file_writer.write(log_message + '\n');
            log_file_writer.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
