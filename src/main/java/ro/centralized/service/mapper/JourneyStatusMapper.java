package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.JourneyStatus;
import ro.centralized.service.dto.JourneyStatusDTO;

/**
 * Mapper for the entity {@link JourneyStatus} and its DTO {@link JourneyStatusDTO}.
 */
@Mapper(componentModel = "spring")
public interface JourneyStatusMapper extends EntityMapper<JourneyStatusDTO, JourneyStatus> {}
