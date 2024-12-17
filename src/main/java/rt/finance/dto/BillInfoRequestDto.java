package rt.finance.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BillInfoRequestDto {
    @Schema(description = "The bill name", example = "Electricity", minimum = "0", maximum = "100" )
    @NotBlank(message = "Bill name cannot be blank")
    @Size(max = 100, message = "Bill name cannot be longer than 100 characters")
    private String billName;
    @Schema(description = "The bill amount", example = "2500.00", minimum = "1" )
    @NotBlank(message = "Bill amount cannot be blank")
    private Double billAmount;
}
