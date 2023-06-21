package com.djrhodes.boardgamenexus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Object Class for Mechanic
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mechanic {

    /** The Mechanic ID */
    private String id;
    /** The Mechanic Name */
    private String name;

    /**
     * Default Constructor
     */
    public Mechanic() {
    }

    /**
     * Gets the Mechanic ID
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the Mechanic ID
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the Mechanic Name
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Mechanic Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
