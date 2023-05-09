package ro.centralized.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ro.centralized.domain.JourneyStatus;

/**
 * Spring Data JPA repository for the JourneyStatus entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JourneyStatusRepository extends JpaRepository<JourneyStatus, Long> {}
