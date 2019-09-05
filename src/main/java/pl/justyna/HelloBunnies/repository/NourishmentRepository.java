package pl.justyna.HelloBunnies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.justyna.HelloBunnies.model.Nourishment;

@Repository
public interface NourishmentRepository extends JpaRepository<Nourishment, Long> {

	List<Nourishment> findByIdNourishmentCategory(Long idNourishmentCategory);
}
