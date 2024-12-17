package rt.finance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="bill_info")
@Data
public class BillInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double amount;
}
