package at.beefburger.herzelnbackend.repositorys;

import at.beefburger.herzelnbackend.models.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends CrudRepository<UserEntity, UUID> {
    Optional<UserEntity> findByUserName(String username);
}
