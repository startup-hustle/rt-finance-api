package rt.finance.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BillInfoRequestDto {
    private String billName;
    private String billAmount;
}
