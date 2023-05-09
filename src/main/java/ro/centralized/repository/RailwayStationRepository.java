package ro.centralized.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ro.centralized.domain.RailwayStation;

/**
 * Spring Data JPA repository for the RailwayStation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RailwayStationRepository extends JpaRepository<RailwayStation, Long> {}
