package com.djrhodes.boardgamenexus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Object Class for Category
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

    /** Category ID */
    private String id;
    /** Category name */
    private String name;

    /**
     * Default Constructor
     */
    public Category() {
    }

    /**
     * Gets Category ID
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets Category ID
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets Category Name
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Category Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
