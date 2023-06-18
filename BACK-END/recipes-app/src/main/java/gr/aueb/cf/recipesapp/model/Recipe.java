package gr.aueb.cf.recipesapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "ingredients", nullable = false)
    private String ingredients;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "duration", nullable = false)
    private int duration;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Favorite> favorites;

    public Recipe(Long recipeId, String title, String ingredients, String description, int duration) {
        this.recipeId = recipeId;
        this.title = title;
        this.ingredients = ingredients;
        this.description = description;
        this.duration = duration;
    }

    public void removeFavorite(Favorite favorite) {
        favorites.remove(favorite);
        favorite.setRecipe(null);
    }
}
