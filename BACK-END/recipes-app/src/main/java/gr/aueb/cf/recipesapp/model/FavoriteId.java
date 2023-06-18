package gr.aueb.cf.recipesapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class FavoriteId implements Serializable {
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "recipe_id")
    private Long recipeId;




}