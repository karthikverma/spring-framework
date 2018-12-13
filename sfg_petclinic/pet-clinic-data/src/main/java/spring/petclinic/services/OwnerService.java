package spring.petclinic.services;

import spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService  {
    Owner findByLastname(String lastName);
    Owner findById (Long id);
    Owner save (Owner owner);
    Set<Owner> findAll();
}
