package ro.centralized.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link ro.centralized.domain.IncidentStatus} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class IncidentStatusDTO implements Serializable {

    private Long id;

    @NotNull
    private String code;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncidentStatusDTO)) {
            return false;
        }

        IncidentStatusDTO incidentStatusDTO = (IncidentStatusDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, incidentStatusDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "IncidentStatusDTO{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
