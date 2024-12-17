package rt.finance.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BillInfoResponseDto {
    private String billName;
    private String billAmount;
}
