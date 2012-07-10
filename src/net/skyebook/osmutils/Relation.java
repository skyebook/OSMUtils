package net.skyebook.osmutils;

import java.util.ArrayList;

/**
 *
 * @author Skye Book
 */
public class Relation extends NodeWayRelationBaseObject {

    private long id;
    private ArrayList<NodeWayRelationBaseObject> members;

    public Relation() {
        members = new ArrayList<NodeWayRelationBaseObject>();
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
    public ArrayList<NodeWayRelationBaseObject> getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(ArrayList<NodeWayRelationBaseObject> members) {
        this.members = members;
    }
}
