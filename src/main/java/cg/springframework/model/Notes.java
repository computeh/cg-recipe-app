package cg.springframework.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // No cascading is needed b/c propagation takes place in the Recipe entity
    private Recipe recipe; // 1-1 Property

    @Lob
    private String recipeNotes;

}
