package rest.Airport;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {
    Airport findByCode(String code);
    Airport findByName(String name);
}
