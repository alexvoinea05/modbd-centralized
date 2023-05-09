package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.IncidentStatus;
import ro.centralized.service.dto.IncidentStatusDTO;

/**
 * Mapper for the entity {@link IncidentStatus} and its DTO {@link IncidentStatusDTO}.
 */
@Mapper(componentModel = "spring")
public interface IncidentStatusMapper extends EntityMapper<IncidentStatusDTO, IncidentStatus> {}
