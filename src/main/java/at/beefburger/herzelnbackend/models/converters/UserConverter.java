package at.beefburger.herzelnbackend.models.converters;

import at.beefburger.herzelnbackend.configs.MapstructConfig;
import at.beefburger.herzelnbackend.models.dtos.UserDto;
import at.beefburger.herzelnbackend.models.entities.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", config = MapstructConfig.class)
public interface UserConverter {
    UserEntity convertToEntity(UserDto userDto);
    UserDto convertToEntity(UserEntity userEntity);

    List<UserDto> convertToDtoList(Iterable<UserEntity> userEntities);
    List<UserEntity> convertToEntityList(Iterable<UserDto> userDtos);
}
