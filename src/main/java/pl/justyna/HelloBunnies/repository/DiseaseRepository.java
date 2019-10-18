package pl.justyna.HelloBunnies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.justyna.HelloBunnies.model.Disease;

public interface DiseaseRepository extends JpaRepository<Disease, Long>{

	List<Disease> findByIdDiseaseCategory(Long idDiseaseCategory);
}
