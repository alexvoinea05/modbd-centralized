package ro.centralized.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.centralized.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
