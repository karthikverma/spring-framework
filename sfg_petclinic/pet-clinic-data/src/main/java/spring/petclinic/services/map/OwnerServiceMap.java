package spring.petclinic.services.map;

import spring.petclinic.model.Owner;
import spring.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

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
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }
}
