package com.djrhodes.boardgamenexus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Object Class for Board Games
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoardGame {

    /** The ID of the Board Game */
    private String id;
    /** The name of the Board Game */
    private String name;
    /** The price in the US */
    @JsonProperty("price")
    private double priceUS;
    /** The price in the UK */
    @JsonProperty("price_uk")
    private double priceUK;
    /** The price in AU */
    @JsonProperty("price_au")
    private double priceAU;
    /** The price in CA */
    @JsonProperty("price_ca")
    private double priceCA;
    /** Year the Board Game was published */
    @JsonProperty("year_published")
    private int publishYear;
    /** Minimum players needed */
    @JsonProperty("min_players")
    private int minPlayers;
    /** Maximum possible players */
    @JsonProperty("max_players")
    private int maxPlayers;
    /** Minimum playtime per game */
    @JsonProperty("min_playtime")
    private int minPlaytime;
    /** Maximum playtime per game */
    @JsonProperty("max_playtime")
    private int maxPlaytime;
    /** Minimum age requirement */
    @JsonProperty("min_age")
    private int minAge;
    /** Board Game description */
    private String description;
    /** List of mechanics the game uses */
    private List<Mechanic> mechanics;
    /** List of categories the game fits into */
    @JsonIgnore
    private List<Category> categories;
    /** Primary Publisher for the Board Game */
    @JsonProperty("primary_publisher")
    private Publisher publisher;
    /** Primary Designer of the Board Game */
    @JsonProperty("primary_designer")
    private Designer designer;
    /** URL of the official rule book */
    @JsonProperty("rules_url")
    private String rulesURL;
    /** URL to the official website */
    @JsonProperty("official_url")
    private String officialURL;
    /** Average user rating */
    @JsonProperty("average_user_rating")
    private double userRating;
    /** URL to image of the game box */
    @JsonProperty("image_url")
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

    public double getPriceUS() {
        return priceUS;
    }

    public double getPriceUK() {
        return priceUK;
    }

    public double getPriceAU() {
        return priceAU;
    }

    public double getPriceCA() {
        return priceCA;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public Designer getDesigner() {
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

    public void setPriceUS(double priceUS) {
        this.priceUS = priceUS;
    }

    public void setPriceUK(double priceUK) {
        this.priceUK = priceUK;
    }

    public void setPriceAU(double priceAU) {
        this.priceAU = priceAU;
    }

    public void setPriceCA(double priceCA) {
        this.priceCA = priceCA;
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

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setDesigner(Designer designer) {
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
