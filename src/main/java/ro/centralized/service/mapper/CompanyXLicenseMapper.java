package ro.centralized.service.mapper;

import org.mapstruct.*;
import ro.centralized.domain.Company;
import ro.centralized.domain.CompanyXLicense;
import ro.centralized.domain.License;
import ro.centralized.service.dto.CompanyDTO;
import ro.centralized.service.dto.CompanyXLicenseDTO;
import ro.centralized.service.dto.LicenseDTO;

/**
 * Mapper for the entity {@link CompanyXLicense} and its DTO {@link CompanyXLicenseDTO}.
 */
@Mapper(componentModel = "spring")
public interface CompanyXLicenseMapper extends EntityMapper<CompanyXLicenseDTO, CompanyXLicense> {
    @Mapping(target = "idCompany", source = "idCompany", qualifiedByName = "companyId")
    @Mapping(target = "idLicense", source = "idLicense", qualifiedByName = "licenseId")
    CompanyXLicenseDTO toDto(CompanyXLicense s);

    @Named("companyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CompanyDTO toDtoCompanyId(Company company);

    @Named("licenseId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    LicenseDTO toDtoLicenseId(License license);
}
