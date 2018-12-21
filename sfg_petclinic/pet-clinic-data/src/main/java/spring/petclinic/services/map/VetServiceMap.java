package spring.petclinic.services.map;

import spring.petclinic.model.Vet;
import spring.petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll(){
        return super.findAll();
    }

    @Override
    public Vet findById(Long id){
        return super.findById(id);
    }


    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }
}
