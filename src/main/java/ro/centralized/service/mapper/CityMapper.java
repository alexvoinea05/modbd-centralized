package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.City;
import ro.centralized.domain.District;
import ro.centralized.service.dto.CityDTO;
import ro.centralized.service.dto.DistrictDTO;

/**
 * Mapper for the entity {@link City} and its DTO {@link CityDTO}.
 */
@Mapper(componentModel = "spring")
public interface CityMapper extends EntityMapper<CityDTO, City> {
    @Mapping(target = "idDistrict", source = "idDistrict", qualifiedByName = "districtId")
    CityDTO toDto(City s);

    @Named("districtId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DistrictDTO toDtoDistrictId(District district);
}
