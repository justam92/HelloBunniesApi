package pl.justyna.HelloBunnies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.justyna.HelloBunnies.model.FirstAid;

public interface FirstAidRepository extends JpaRepository<FirstAid, Long> {

}
