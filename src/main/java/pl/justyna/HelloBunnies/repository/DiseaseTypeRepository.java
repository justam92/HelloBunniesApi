package pl.justyna.HelloBunnies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.justyna.HelloBunnies.model.DiseaseType;

public interface DiseaseTypeRepository extends JpaRepository<DiseaseType, Long> {

	List<DiseaseType> findByIdDiseaseCategory(Long idDiseaseCategory);
}
