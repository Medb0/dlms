package daelim.lnl.dlms.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LockersRepository extends JpaRepository<Lockers, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id asc ")
    List<Lockers> findAllDesc();
}
