package rt.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rt.finance.entity.BillInfo;

@Repository
public interface BillInfoRepository extends JpaRepository<BillInfo, Long> {
}
