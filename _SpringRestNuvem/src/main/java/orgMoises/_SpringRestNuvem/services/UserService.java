package orgMoises._SpringRestNuvem.services;

import orgMoises._SpringRestNuvem.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
