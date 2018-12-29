package spring.petclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import spring.petclinic.model.Owner;
import spring.petclinic.repositories.OwnerRepository;
import spring.petclinic.repositories.PetRepository;
import spring.petclinic.repositories.PetTypeRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
        @Mock
        OwnerRepository ownerRepository;
        @Mock
        PetRepository petRepository;
        @Mock
        PetTypeRepository petTypeRepository;
        @InjectMocks
        OwnerSDJpaService ownerSDJpaService;
    @BeforeEach
    void setUp() {
    }

    @Test
    void findByLastname() {
        Owner returnOwner = Owner.builder().id(1L).lastName("Smith").build();
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner smith = ownerSDJpaService.findByLastname("Smith");
        assertEquals("Smith",smith.getLastName());
        verify(ownerRepository.findByLastName(any()));
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deletebyID() {
    }
}