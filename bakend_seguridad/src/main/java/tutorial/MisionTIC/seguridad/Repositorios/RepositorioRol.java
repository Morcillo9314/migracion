package tutorial.MisionTIC.seguridad.Repositorios;

import tutorial.MisionTIC.seguridad.Modelos.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepositorioRol extends MongoRepository<Rol,String> {

}
