package ro.centralized.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ro.centralized.domain.License;

/**
 * Spring Data JPA repository for the License entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LicenseRepository extends JpaRepository<License, Long> {}
