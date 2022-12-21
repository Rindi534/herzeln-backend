package at.beefburger.herzelnbackend.models.dtos;

import at.beefburger.herzelnbackend.utils.enums.Roles;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto {
    private Roles role;
}
