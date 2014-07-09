package smartnode.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by nogueira on 7/2/14.
 */
@Entity
@Table(name = "Entries")
public class Entry {

     private enum EntryType{
        Paper, Dataset
    }

    private enum EntryStatus{
        download, seed, would_like, ban, unknown
    }

    @Column(name = "type")
    private EntryType type;

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "infohash")
    private String infohash;

    @Column(name = "sizebytes")
    private long totalSizeBytes;

    @Column(name = "mirrors")
    private int mirrors;

    @Column(name = "downloaders")
    private int downloaders;

    @Column(name = "timescompleted")
    private int timesCompleted;

    @Column(name = "dateadded")
    private long dateAdded;

    @Column(name = "datemodified")
    private long dateModified;

    @Column(name = "path")
    private String path;

    @Column(name = "filename")
    private String filename;

    @Column(name = "status")
    private EntryStatus status;

    @Column(name = "bibtex")
    private String bibtex;

    @Column(name = "torrentfile")
    private byte[] torrentFile;

    // needed for hibernate
    /**
     *
     */
    public Entry() {
    }

    /**
     *
     * @param type
     * @param name
     * @param infohash
     * @param total_size_bytes
     * @param mirrors
     * @param downloaders
     * @param times_completed
     * @param date_added
     * @param date_modified
     */
    public Entry(String type, String name, String infohash, long total_size_bytes, int mirrors, int downloaders, int times_completed, long date_added, long date_modified) {

        this.type = EntryType.valueOf(type);
        this.name = name;
        this.infohash = infohash;
        this.totalSizeBytes = total_size_bytes;
        this.mirrors = mirrors;
        this.downloaders = downloaders;
        this.timesCompleted = times_completed;
        this.dateAdded = date_added;
        this.dateModified = date_modified;
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
    public long getTotalSizeByes() { return totalSizeBytes; }

    /**
     *
     * @return
     */
    public int getDownloaders() { return downloaders; }

    /**
     *
     * @return
     */
    public int getTimesCompleted() { return timesCompleted; }

    /**
     *
     * @return
     */
    public long getDateAdded() { return dateAdded; }

    /**
     *
     * @return
     */
    public long getDateModified() { return dateModified; }

    /**
     *
     * @return
     */
    public EntryStatus getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(EntryStatus status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public String getFilename() {
        return filename;
    }

    /**
     *
     * @param filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     */
    public byte[] getTorrentFile() {
        return torrentFile;
    }

    /**
     *
     * @param torrentFile
     */
    public void setTorrentFile(byte[] torrentFile) {
        this.torrentFile = torrentFile;
    }

    /**
     *
     * @return
     */
    public String getBibtex() {
        return bibtex;
    }

    /**
     *
     * @param bibtex
     */
    public void setBibtex(String bibtex) {
        this.bibtex = bibtex;
    }
}
