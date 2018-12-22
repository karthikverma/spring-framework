package spring.petclinic.services.map;

import org.springframework.stereotype.Service;
import spring.petclinic.model.Speciality;
import spring.petclinic.services.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll(){
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id){
        return super.findById(id);
    }


    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public void deletebyID(Long id) {
        super.deleteById(id);
    }

}
