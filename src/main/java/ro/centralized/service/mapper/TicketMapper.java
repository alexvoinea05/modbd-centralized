package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.AppUser;
import ro.centralized.domain.Journey;
import ro.centralized.domain.Ticket;
import ro.centralized.service.dto.AppUserDTO;
import ro.centralized.service.dto.JourneyDTO;
import ro.centralized.service.dto.TicketDTO;

/**
 * Mapper for the entity {@link Ticket} and its DTO {@link TicketDTO}.
 */
@Mapper(componentModel = "spring")
public interface TicketMapper extends EntityMapper<TicketDTO, Ticket> {
    @Mapping(target = "idAppUser", source = "idAppUser", qualifiedByName = "appUserIdUser")
    @Mapping(target = "idJourney", source = "idJourney", qualifiedByName = "journeyId")
    TicketDTO toDto(Ticket s);

    @Named("appUserIdUser")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "idUser", source = "idUser")
    AppUserDTO toDtoAppUserIdUser(AppUser appUser);

    @Named("journeyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    JourneyDTO toDtoJourneyId(Journey journey);
}
