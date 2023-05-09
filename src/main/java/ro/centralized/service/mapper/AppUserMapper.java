package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.AppUser;
import ro.centralized.domain.User;
import ro.centralized.domain.UserType;
import ro.centralized.service.dto.AppUserDTO;
import ro.centralized.service.dto.UserDTO;
import ro.centralized.service.dto.UserTypeDTO;

/**
 * Mapper for the entity {@link AppUser} and its DTO {@link AppUserDTO}.
 */
@Mapper(componentModel = "spring")
public interface AppUserMapper extends EntityMapper<AppUserDTO, AppUser> {
    @Mapping(target = "user", source = "user", qualifiedByName = "userId")
    @Mapping(target = "idUserType", source = "idUserType", qualifiedByName = "userTypeId")
    AppUserDTO toDto(AppUser s);

    @Named("userId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    UserDTO toDtoUserId(User user);

    @Named("userTypeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    UserTypeDTO toDtoUserTypeId(UserType userType);
}
