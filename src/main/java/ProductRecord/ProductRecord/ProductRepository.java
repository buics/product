package ProductRecord.ProductRecord;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "productdb", path = "productdb")
public interface ProductRepository extends MongoRepository<Products, String> {

}
