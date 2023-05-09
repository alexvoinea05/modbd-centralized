package ro.centralized.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ro.centralized.domain.Journey;

/**
 * Spring Data JPA repository for the Journey entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JourneyRepository extends JpaRepository<Journey, Long> {}
