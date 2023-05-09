package ro.centralized.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import ro.centralized.domain.CompanyXLicense;

/**
 * Spring Data JPA repository for the CompanyXLicense entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CompanyXLicenseRepository extends JpaRepository<CompanyXLicense, Long> {}
