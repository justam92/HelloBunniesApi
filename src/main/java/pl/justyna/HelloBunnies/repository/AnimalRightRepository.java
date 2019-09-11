package pl.justyna.HelloBunnies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.justyna.HelloBunnies.model.AnimalRight;

public interface AnimalRightRepository extends JpaRepository<AnimalRight, Long> {

}
