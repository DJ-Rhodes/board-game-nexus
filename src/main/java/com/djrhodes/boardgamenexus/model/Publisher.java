package com.djrhodes.boardgamenexus.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Object Class for Publishers
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Publisher {

    /** The Publisher's ID */
    private String id;
    /** The Publisher's Name */
    private String name;

    /**
     * Default COnstructor
     */
    public Publisher() {
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
