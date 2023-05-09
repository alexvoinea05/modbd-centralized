package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.Company;
import ro.centralized.domain.Journey;
import ro.centralized.domain.JourneyStatus;
import ro.centralized.domain.RailwayStation;
import ro.centralized.domain.Train;
import ro.centralized.service.dto.CompanyDTO;
import ro.centralized.service.dto.JourneyDTO;
import ro.centralized.service.dto.JourneyStatusDTO;
import ro.centralized.service.dto.RailwayStationDTO;
import ro.centralized.service.dto.TrainDTO;

/**
 * Mapper for the entity {@link Journey} and its DTO {@link JourneyDTO}.
 */
@Mapper(componentModel = "spring")
public interface JourneyMapper extends EntityMapper<JourneyDTO, Journey> {
    @Mapping(target = "idJourneyStatus", source = "idJourneyStatus", qualifiedByName = "journeyStatusId")
    @Mapping(target = "idTrain", source = "idTrain", qualifiedByName = "trainId")
    @Mapping(target = "idCompany", source = "idCompany", qualifiedByName = "companyId")
    @Mapping(target = "idRailwayStationDeparture", source = "idRailwayStationDeparture", qualifiedByName = "railwayStationId")
    @Mapping(target = "idRailwayStationArrival", source = "idRailwayStationArrival", qualifiedByName = "railwayStationId")
    JourneyDTO toDto(Journey s);

    @Named("journeyStatusId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    JourneyStatusDTO toDtoJourneyStatusId(JourneyStatus journeyStatus);

    @Named("trainId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    TrainDTO toDtoTrainId(Train train);

    @Named("companyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CompanyDTO toDtoCompanyId(Company company);

    @Named("railwayStationId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RailwayStationDTO toDtoRailwayStationId(RailwayStation railwayStation);
}
