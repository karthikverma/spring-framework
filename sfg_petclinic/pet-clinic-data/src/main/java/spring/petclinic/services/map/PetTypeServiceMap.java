package spring.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.petclinic.model.PetType;
import spring.petclinic.services.PetTypeService;

import java.util.Set;
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll(){
        return super.findAll();
    }

    @Override
    public PetType findById(Long id){
        return super.findById(id);
    }


    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }

}
