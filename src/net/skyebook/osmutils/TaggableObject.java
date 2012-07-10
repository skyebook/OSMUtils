/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.skyebook.osmutils;

import java.util.HashMap;

/**
 *
 * @author Skye Book
 */
public abstract class TaggableObject {
    private HashMap<String, String> tags;
    
    public TaggableObject(){
        tags = new HashMap<String, String>();
    }

    /**
     * @return the tags
     */
    public HashMap<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(HashMap<String, String> tags) {
        this.tags = tags;
    }
}
