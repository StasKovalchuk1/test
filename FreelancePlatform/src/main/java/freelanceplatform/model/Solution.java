package freelanceplatform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Solution extends AbstractEntity{

    @OneToOne(mappedBy = "solution", optional = false)
    private Task task;

    @Lob
    @Column
    private String description;

    @Lob
    @Column(nullable = false)
    private String link;
}
