package at.beefburger.herzelnbackend.services;

import at.beefburger.herzelnbackend.models.converters.UserConverter;
import at.beefburger.herzelnbackend.models.dtos.UserDto;
import at.beefburger.herzelnbackend.repositorys.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public List<UserDto> getAllUsers() {
        return userConverter.convertToDtoList(userRepository.findAll());
    }
}
