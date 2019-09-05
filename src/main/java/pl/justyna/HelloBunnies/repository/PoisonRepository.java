package pl.justyna.HelloBunnies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.justyna.HelloBunnies.model.Poison;

public interface PoisonRepository extends JpaRepository<Poison, Long> {

}
