import smartnode.models.Collection;
import smartnode.utils.ATFetcher;
import smartnode.utils.ATLogger;

import java.util.ArrayList;

/**
 * Created by nogueira on 7/2/14.
 */
public class TestClass {

    public static void main(String [] args){
        ATLogger logger = new ATLogger("logfile.log", ATLogger.LogLevel.Error);
        ATFetcher fetcher = new ATFetcher(logger);

        ArrayList<Collection> collections = fetcher.getCollections();

        for(Collection collection : collections){
            System.out.println(collection.getName());
        }

    }
}
