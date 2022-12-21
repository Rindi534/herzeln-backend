package at.beefburger.herzelnbackend.models.entities;

import at.beefburger.herzelnbackend.utils.enums.Roles;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class RoleEntity implements Serializable {
    @Column
    @Enumerated(value = EnumType.STRING)
    private Roles role;
}
