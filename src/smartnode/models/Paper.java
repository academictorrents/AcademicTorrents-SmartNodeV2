package smartnode.models;

/**
 * Created by nogueira on 7/2/14.
 */
public class Paper extends Entry {

    private EntryType type = EntryType.Paper;
    private String name;
    private String infohash;
    private long total_size_byes;
    private int mirrors;
    private int downloaders;
    private int times_completed;
    private long date_added;
    private long date_modified;

    /**
     *
     * @param name
     * @param infohash
     * @param total_size_byes
     * @param mirrors
     * @param downloaders
     * @param times_completed
     * @param date_added
     * @param date_modified
     */
    public Paper(String name, String infohash, long total_size_byes, int mirrors, int downloaders, int times_completed, long date_added, long date_modified) {
        this.name = name;
        this.infohash = infohash;
        this.total_size_byes = total_size_byes;
        this.mirrors = mirrors;
        this.downloaders = downloaders;
        this.times_completed = times_completed;
        this.date_added = date_added;
        this.date_modified = date_modified;
    }

    /**
     *
     * @return
     */
    public EntryType getType() { return type; }

    /**
     *
     * @return
     */
    public String getName() { return name; }

    /**
     *
     * @return
     */
    public String getInfohash() { return infohash; }

    /**
     *
     * @return
     */
    public int getMirrors() { return mirrors; }

    /**
     *
     * @return
     */
    public long getTotal_size_byes() { return total_size_byes; }

    /**
     *
     * @return
     */
    public int getDownloaders() { return downloaders; }

    /**
     *
     * @return
     */
    public int getTimes_completed() { return times_completed; }

    /**
     *
     * @return
     */
    public long getDate_added() { return date_added; }

    /**
     *
     * @return
     */
    public long getDate_modified() { return date_modified; }
}
