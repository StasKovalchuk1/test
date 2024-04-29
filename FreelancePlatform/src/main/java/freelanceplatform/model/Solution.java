package freelanceplatform.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Solution extends AbstractEntity{

    @OneToOne(mappedBy = "solution", optional = false)
    private Task task;

    @Column(nullable = false)
    private String description;

    @Lob
    @Column(nullable = false)
    private byte[] content;
}
