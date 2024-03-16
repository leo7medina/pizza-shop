package ec.com.tio.leo.dev.pizza.shop.persistence.repository;

import ec.com.tio.leo.dev.pizza.shop.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
