package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.FuelType;
import ro.centralized.domain.Train;
import ro.centralized.domain.TrainType;
import ro.centralized.service.dto.FuelTypeDTO;
import ro.centralized.service.dto.TrainDTO;
import ro.centralized.service.dto.TrainTypeDTO;

/**
 * Mapper for the entity {@link Train} and its DTO {@link TrainDTO}.
 */
@Mapper(componentModel = "spring")
public interface TrainMapper extends EntityMapper<TrainDTO, Train> {
    @Mapping(target = "idFuelType", source = "idFuelType", qualifiedByName = "fuelTypeId")
    @Mapping(target = "idTrainType", source = "idTrainType", qualifiedByName = "trainTypeId")
    TrainDTO toDto(Train s);

    @Named("fuelTypeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    FuelTypeDTO toDtoFuelTypeId(FuelType fuelType);

    @Named("trainTypeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TrainTypeDTO toDtoTrainTypeId(TrainType trainType);
}
