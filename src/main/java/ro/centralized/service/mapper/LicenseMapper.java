package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.License;
import ro.centralized.service.dto.LicenseDTO;

/**
 * Mapper for the entity {@link License} and its DTO {@link LicenseDTO}.
 */
@Mapper(componentModel = "spring")
public interface LicenseMapper extends EntityMapper<LicenseDTO, License> {}
