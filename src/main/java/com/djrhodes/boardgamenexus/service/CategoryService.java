package com.djrhodes.boardgamenexus.service;

import com.djrhodes.boardgamenexus.model.Category;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Category Service class
 */
@Service
public class CategoryService {

    /** The Rest Template */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * Default Constructor for Spring injection
     */
    public CategoryService() {
    }

    /**
     * Sets the names for each Category in the list
     * @param categories
     * @return Updated Categories
     */
    public List<Category> setCategoryNames(List<Category> categories) {
        List<Category> updatedCategories = new ArrayList<>();

        for (Category category : categories) {
            try {
                Category updatedCategory = findByID(category.getId());
                if (updatedCategory  != null) {
                    updatedCategories.add(updatedCategory);
                }
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }

        return updatedCategories;
    }

    /**
     * Finds a specific Category based on its ID
     * @param id
     * @return The Category
     * @throws JsonProcessingException
     */
    public Category findByID(String id) throws JsonProcessingException {
        String apiUrl = "https://api.boardgameatlas.com/api/game/categories?client_id=cVvqX5AnsC";
        String json = restTemplate.getForObject(apiUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);
        JsonNode categoriesNode = root.get("categories");

        for (JsonNode cat : categoriesNode) {
            if (cat != null && cat.get("id").asText().equals(id)) {
                return mapper.convertValue(cat, Category.class);
            }
        }

        return null;
    }
}
