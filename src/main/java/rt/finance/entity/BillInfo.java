package rt.finance.entity;

import jakarta.persistence.*;

@Entity
@Table(name="bill_info")
public class BillInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double amount;
}
