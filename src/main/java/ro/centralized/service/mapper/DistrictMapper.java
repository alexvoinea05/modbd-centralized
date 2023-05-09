package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.District;
import ro.centralized.service.dto.DistrictDTO;

/**
 * Mapper for the entity {@link District} and its DTO {@link DistrictDTO}.
 */
@Mapper(componentModel = "spring")
public interface DistrictMapper extends EntityMapper<DistrictDTO, District> {}
