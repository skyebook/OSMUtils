package net.skyebook.osmutils;

/**
 * An OpenStreetMap Node
 *
 * @see http://wiki.openstreetmap.org/wiki/Node
 * @author Skye Book
 */
public class Node extends NodeWayRelationBaseObject {

    private long id;
    private double latitude;
    private double longitude;

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
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        if (latitude > 90d || latitude < -90d) {
            throw new IllegalArgumentException("The supplied latitude (" + latitude + ") is invalid.  Value must be in the range of [-90,90]");
        }
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
        if (latitude > 180d || latitude < -180d) {
            throw new IllegalArgumentException("The supplied longitude (" + longitude + ") is invalid.  Value must be in the range of [-180,180]");
        }
        this.longitude = longitude;
    }
}
