package compa.June2023;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Food {
    private String name;
    private int cal;
    private String category;

    private int buy;

}
