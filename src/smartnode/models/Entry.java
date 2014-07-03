package smartnode.models;

/**
 * Created by nogueira on 7/2/14.
 */
public class Entry {

    public enum EntryType{
        paper, dataset
    }

    enum EntryStatus{
        download, seed, would_like, ban, unknown
    }

}
