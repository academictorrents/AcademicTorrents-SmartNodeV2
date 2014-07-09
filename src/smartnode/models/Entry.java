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

    protected EntryType type;
    protected String name;
    protected String infohash;
    protected long total_size_byes;
    protected int mirrors;
    protected int downloaders;
    protected int times_completed;
    protected long date_added;
    protected long date_modified;
    protected String path;
    protected String filename;
    protected EntryStatus status;
    protected String bibtex;
    protected byte[] torrent_file;


}
