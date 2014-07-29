package smartnode.models;

import javax.persistence.*;

/**
 * Created by nogueira on 6/19/14.
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Entity
@Table(name = "collections")
public class Collection {

    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "urlname")
    private String urlname;

    @Column(name = "torrentcount")
    private int torrentCount;

    @Column(name = "sizebytes")
    private long totalSizeBytes;

    @Column(name = "mirrored")
    private boolean mirrored = false;

    @ManyToMany(cascade = CascadeType.ALL)
    @MapKey(name = "infohash")
    @JoinTable(name = "Collection_Entry", joinColumns = {@JoinColumn(name = "urlname")},
               inverseJoinColumns = {@JoinColumn(name = "infohash")})
    private Map<String, Entry> torrents;

    // needed for hibernate
    /**
     *
     */
    public Collection() {
    }

    /**
     *
     * @param collection_name
     * @param urlname
     * @param torrent_count
     * @param total_size
     */
    public Collection(String collection_name, String urlname, int torrent_count, long total_size) {
        this.name = collection_name;
        this.urlname = urlname;
        this.torrentCount = torrent_count;
        this.totalSizeBytes = total_size;
    }

    /**
     *
     * @param urlname
     */
    public Collection(String urlname){

    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getUrlname() {
        return urlname;
    }

    /**
     *
     * @return
     */
    public int getTorrentCount() {
        return torrentCount;
    }

    /**
     *
     * @return
     */
    public long getTotalSizeBytes() {
        return totalSizeBytes;
    }

    /**
     *
     * @return
     */
    public boolean isMirrored() { return mirrored; }

    /**
     * @param mirrored
     * @return
     */
    public void setMirrored(boolean mirrored) { this.mirrored = mirrored; }

    /**
     *
     * @return
     */
    public Map<String, Entry> getTorrents() { return torrents; }

    /**
     *
     * @param torrents
     */
    public void setTorrents(Map<String, Entry> torrents) {
        this.torrents = torrents;
    }
}
