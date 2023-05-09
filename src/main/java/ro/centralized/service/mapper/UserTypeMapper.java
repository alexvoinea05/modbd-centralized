package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.UserType;
import ro.centralized.service.dto.UserTypeDTO;

/**
 * Mapper for the entity {@link UserType} and its DTO {@link UserTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface UserTypeMapper extends EntityMapper<UserTypeDTO, UserType> {}
