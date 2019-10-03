package pl.justyna.HelloBunnies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.justyna.HelloBunnies.model.SeedAndCereal;

@Repository
public interface SeedAndCerealRepository extends JpaRepository<SeedAndCereal, Long>{

	List<SeedAndCereal> findByIdNourishmentCategory(Long idNoutrishmentCategory);
}
