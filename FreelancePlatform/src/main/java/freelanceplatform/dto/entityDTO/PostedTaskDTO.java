package freelanceplatform.dto.entityDTO;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PostedTaskDTO {

    private final String customerName;
    private final String title;
    private final String problem;
    private final Date deadline;
    private final Double payment;
}
