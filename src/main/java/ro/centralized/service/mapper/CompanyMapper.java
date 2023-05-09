package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.Company;
import ro.centralized.service.dto.CompanyDTO;

/**
 * Mapper for the entity {@link Company} and its DTO {@link CompanyDTO}.
 */
@Mapper(componentModel = "spring")
public interface CompanyMapper extends EntityMapper<CompanyDTO, Company> {}
