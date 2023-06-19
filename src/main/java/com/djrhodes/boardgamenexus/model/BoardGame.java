package com.djrhodes.boardgamenexus.model;

import java.util.List;

/**
 * Object Class for Board Games
 */
public class BoardGame {

    /** The ID of the Board Game */
    private String id;
    /** The name of the Board Game */
    private String name;
    /** The MSRP in the US */
    private double msrpUS;
    /** The MSRP in the UK */
    private double msrpUK;
    /** The MSRP in AU */
    private double msrpAU;
    /** Year the Board Game was published */
    private int publishYear;
    /** Minimum players needed */
    private int minPlayers;
    /** Maximum possible players */
    private int maxPlayers;
    /** Minimum playtime per game */
    private int minPlaytime;
    /** Maximum playtime per game */
    private int maxPlaytime;
    /** Minimum age requirement */
    private int minAge;
    /** Board Game description */
    private String description;
    /** List of mechanics the game uses */
    private List<Mechanic> mechanics;
    /** List of categories the game fits into */
    private List<Category> categories;
    /** Primary Publisher for the Board Game */
    private String publisher;
    /** Primary Designer of the Board Game */
    private String designer;
    /** URL of the official rule book */
    private String rulesURL;
    /** URL to the official website */
    private String officialURL;
    /** Average user rating */
    private double userRating;
    /** URL to image of the game box */
    private String imageURL;

    /**
     * Default Constructor
     */
    public BoardGame() {
    }

    /**
     * Getters for all Board Game variables
     */

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMsrpUS() {
        return msrpUS;
    }

    public double getMsrpUK() {
        return msrpUK;
    }

    public double getMsrpAU() {
        return msrpAU;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public int getMinPlaytime() {
        return minPlaytime;
    }

    public int getMaxPlaytime() {
        return maxPlaytime;
    }

    public int getMinAge() {
        return minAge;
    }

    public String getDescription() {
        return description;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDesigner() {
        return designer;
    }

    public String getRulesURL() {
        return rulesURL;
    }

    public String getOfficialURL() {
        return officialURL;
    }

    public double getUserRating() {
        return userRating;
    }

    public String getImageURL() {
        return imageURL;
    }

    /**
     * Setters for all Board Game variables
     */

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMsrpUS(double msrpUS) {
        this.msrpUS = msrpUS;
    }

    public void setMsrpUK(double msrpUK) {
        this.msrpUK = msrpUK;
    }

    public void setMsrpAU(double msrpAU) {
        this.msrpAU = msrpAU;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setMinPlaytime(int minPlaytime) {
        this.minPlaytime = minPlaytime;
    }

    public void setMaxPlaytime(int maxPlaytime) {
        this.maxPlaytime = maxPlaytime;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public void setRulesURL(String rulesURL) {
        this.rulesURL = rulesURL;
    }

    public void setOfficialURL(String officialURL) {
        this.officialURL = officialURL;
    }

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
