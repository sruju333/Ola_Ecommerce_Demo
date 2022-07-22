package mainpackage.repository;

import mainpackage.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, Long> {

    Cart findById(long id);
}
