package spring.petclinic.services;

import spring.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastname(String lastName);
}
