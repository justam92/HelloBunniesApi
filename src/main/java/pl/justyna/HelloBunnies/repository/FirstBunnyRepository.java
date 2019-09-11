package pl.justyna.HelloBunnies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.justyna.HelloBunnies.model.FirstBunny;

public interface FirstBunnyRepository extends JpaRepository<FirstBunny, Long> {

}
