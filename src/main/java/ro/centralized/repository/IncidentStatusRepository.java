package ro.centralized.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ro.centralized.domain.IncidentStatus;

/**
 * Spring Data JPA repository for the IncidentStatus entity.
 */
@SuppressWarnings("unused")
@Repository
public interface IncidentStatusRepository extends JpaRepository<IncidentStatus, Long> {}
