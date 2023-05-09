package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.FuelType;
import ro.centralized.service.dto.FuelTypeDTO;

/**
 * Mapper for the entity {@link FuelType} and its DTO {@link FuelTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface FuelTypeMapper extends EntityMapper<FuelTypeDTO, FuelType> {}
