package gr.aueb.cf.recipesapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RecipeDTO {
    private Long recipeId;
    private String title;
    private String ingredients;
    private String description;
    private int duration;



    public RecipeDTO(Long recipeId, String title, String ingredients, String description, int duration) {
        this.recipeId = recipeId;
        this.title = title;
        this.ingredients = ingredients;
        this.description = description;
        this.duration = duration;
    }
}
