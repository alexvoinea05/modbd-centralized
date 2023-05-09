package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.RailwayType;
import ro.centralized.service.dto.RailwayTypeDTO;

/**
 * Mapper for the entity {@link RailwayType} and its DTO {@link RailwayTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface RailwayTypeMapper extends EntityMapper<RailwayTypeDTO, RailwayType> {}
