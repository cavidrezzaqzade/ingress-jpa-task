package az.ingress.ingressjpa.service;

import az.ingress.ingressjpa.model.UserCriteria;
import az.ingress.ingressjpa.model.UserDto;

import java.util.List;

/**
 * @author caci
 */

public interface UserService {

    List<UserDto> getAll();

    UserDto add(UserDto userDto);

    void delete(Long id);

    UserDto update(UserDto dto, Long id);

    UserDto update(UserCriteria userCriteria);

}
