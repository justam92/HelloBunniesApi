package pl.justyna.HelloBunnies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.justyna.HelloBunnies.model.OtherNourishment;

@Repository
public interface OtherNourishmentRepository extends JpaRepository<OtherNourishment, Long>{

	List<OtherNourishment> findByIdNourishmentCategory(Long idNourishmentCategory);
}
