package spring.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.petclinic.model.Owner;
import spring.petclinic.model.Pet;
import spring.petclinic.services.OwnerService;
import spring.petclinic.services.PetService;
import spring.petclinic.services.PetTypeService;

import java.util.List;
import java.util.Set;
@Service
@Profile({"default","map"})
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if(object!=null){
            if(object.getPets()!=null){
                object.getPets().forEach(pet -> {
                    if(pet.getPetType()!=null){
                        if(pet.getPetType().getId()!=null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }

                    }else{
                        throw new RuntimeException("Pet type is Required");
                    }
                    if(pet.getId()!=null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());

                    }
                });
            }

            return super.save(object);
        }else return null;

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
        return this.findAll()
                .stream()
                .filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Owner> findByLastNameLike(String lastName) {
        return null;
    }
}
