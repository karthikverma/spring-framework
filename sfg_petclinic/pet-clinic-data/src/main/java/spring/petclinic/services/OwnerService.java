package spring.petclinic.services;

import spring.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastname(String lastName);
    List<Owner> findByLastNameLike (String lastName);
}
