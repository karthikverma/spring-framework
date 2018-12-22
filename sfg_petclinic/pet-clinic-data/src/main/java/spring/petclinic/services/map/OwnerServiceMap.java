package spring.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.petclinic.model.Owner;
import spring.petclinic.services.OwnerService;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Set<Owner> findAll(){
        return super.findAll();
    }

    @Override
    public Owner findById(Long id){
        return super.findById(id);
    }


    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastname(String lastName) {
        return null;
    }
}
