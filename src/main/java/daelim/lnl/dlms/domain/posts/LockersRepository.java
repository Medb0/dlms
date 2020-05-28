package daelim.lnl.dlms.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LockersRepository extends JpaRepository<Lockers, Long> {

    @Query("SELECT p FROM Lockers p ORDER BY p.idx asc ")
    List<Lockers> findAllDesc();
}
