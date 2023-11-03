package in.airline.web.dao;

import org.springframework.data.repository.CrudRepository;

import in.airline.web.entities.Airplane;

public interface AirplaneRepo extends CrudRepository<Airplane,String>{
 
}
