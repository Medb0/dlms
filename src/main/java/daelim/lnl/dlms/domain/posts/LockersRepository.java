package daelim.lnl.dlms.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LockersRepository extends JpaRepository<Lockers, Long> {

    @Query("SELECT p FROM Lockers p ORDER BY p.idx ASC ")
    List<Lockers> findAllDesc();

    @Query("SELECT p FROM Lockers p WHERE p.idx BETWEEN ?1 AND ?1+20 ORDER BY p.idx ASC ")
    List<Lockers> findByIdxBetween(long count);

//    @Query("SELECT p FROM Lockers p WHERE p.position = :position")
//    List<Lockers> findByPosition(String position);

    Lockers findByPosition(String position);

    Lockers save(Lockers positionData);

}
