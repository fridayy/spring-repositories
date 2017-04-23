package ninja.harmless.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author bnjm@harmless.ninja - 4/23/17.
 */
@Repository
public interface StudentBaseRepository extends CrudRepository<Student, UUID> {
}
