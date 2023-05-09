package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.TrainType;
import ro.centralized.service.dto.TrainTypeDTO;

/**
 * Mapper for the entity {@link TrainType} and its DTO {@link TrainTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface TrainTypeMapper extends EntityMapper<TrainTypeDTO, TrainType> {}
