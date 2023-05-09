package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.Address;
import ro.centralized.domain.City;
import ro.centralized.service.dto.AddressDTO;
import ro.centralized.service.dto.CityDTO;

/**
 * Mapper for the entity {@link Address} and its DTO {@link AddressDTO}.
 */
@Mapper(componentModel = "spring")
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {
    @Mapping(target = "idCity", source = "idCity", qualifiedByName = "cityId")
    AddressDTO toDto(Address s);

    @Named("cityId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CityDTO toDtoCityId(City city);
}
