package com.djrhodes.boardgamenexus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Object Class for Designers
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Designer {

    /** The Designer's ID */
    private String id;
    /** The Designer's name */
    private String name;

    /**
     * Default Constructor
     */
    public Designer() {
    }

    /**
     * Getters and Setters
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
