package gr.aueb.cf.recipesapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Favorites")
public class Favorite {
    @EmbeddedId
    private FavoriteId id;

    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "recipe_id", insertable = false, updatable = false)
    private Recipe recipe;

    public Favorite(FavoriteId id, Customer customer, Recipe recipe) {
        this.id = id;
        this.customer = customer;
        this.recipe = recipe;
    }


}
