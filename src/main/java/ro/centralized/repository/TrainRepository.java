package ro.centralized.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ro.centralized.domain.Train;

/**
 * Spring Data JPA repository for the Train entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {}
