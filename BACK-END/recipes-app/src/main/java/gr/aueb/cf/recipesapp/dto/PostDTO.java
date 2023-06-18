package gr.aueb.cf.recipesapp.dto;

import gr.aueb.cf.recipesapp.model.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostDTO {
    private Long postId;

    private String name;
    private String message;

    public PostDTO(Long postId, String name, String message) {
        this.postId = postId;
        this.name = name;
        this.message = message;
    }
}
