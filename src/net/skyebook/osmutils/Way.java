package net.skyebook.osmutils;

import java.util.ArrayList;

/**
 *
 * @author Skye Book
 */
public class Way extends NodeWayRelationBaseObject {

    private long id;
    private ArrayList<Node> members;

    public Way() {
        members = new ArrayList<Node>();
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the members
     */
    public ArrayList<Node> getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(ArrayList<Node> members) {
        this.members = members;
    }
}