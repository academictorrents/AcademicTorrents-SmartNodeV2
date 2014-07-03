package smartnode.utils;

import au.com.bytecode.opencsv.CSVReader;
import smartnode.models.Collection;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by nogueira on 7/2/14.
 */
public class ATFetcher {

    private ATLogger logger;

    /**
     *
     * @param logger
     */
    public ATFetcher(ATLogger logger) {
        this.logger = logger;
    }

    public ArrayList<Collection> getCollections(){

        ArrayList<Collection> collections = new ArrayList<Collection>();

        try {
            // create connection to AT
            logger.log("local string BAD!!");
            logger.log("Opening connection to AT \nGetting collections");
            URI collections_uri = new URI("http://www.academictorrents.com/collections.php?format=.csv");
            URLConnection collections_con = collections_uri.toURL().openConnection();

            // reader content from connection and create collection
            CSVReader reader = new CSVReader(new InputStreamReader(collections_con.getInputStream()));
            String [] line = reader.readNext();
            while((line = reader.readNext()) != null){
                collections.add(new Collection(line[0], line[1], Integer.parseInt(line[2]), Long.parseLong(line[3])));
            }

        }
        catch (URISyntaxException e){
            logger.log(e.getMessage() + e.getInput() + e.getReason() + e.getIndex());
        }
        catch (MalformedURLException e){
            logger.log(e.getMessage());
        }
        catch (IOException e){
            logger.log(e.getMessage());
        }
        catch (NumberFormatException e){
            logger.log("Parse Error");
            logger.log(e.getMessage());
        }
        catch(Exception e){
            logger.log("Unknown Exception in fetcher getting collections");
        }

        return collections;
    }
}
