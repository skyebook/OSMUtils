package net.skyebook.osmutils;

import java.util.Date;

/**
 * Base class for Nodes, Ways, and Relations.
 * @author Skye Book
 */
public class NodeWayRelationBaseObject extends TaggableObject{
    private String user;
    private int uid;
    private Date timestamp;
    private boolean visible;
    private int version;
    private int changeset;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * @return the timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * @return the changeset
     */
    public int getChangeset() {
        return changeset;
    }

    /**
     * @param changeset the changeset to set
     */
    public void setChangeset(int changeset) {
        this.changeset = changeset;
    }
}
