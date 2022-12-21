package at.beefburger.herzelnbackend.models.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private LocalDate dateOfBirth;

    @CreationTimestamp
    @Column
    private LocalDateTime timeOfRegistration;

    @UpdateTimestamp
    @Column
    private LocalDateTime lastTimeUpdated;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    private List<RoleEntity> roles;
}
