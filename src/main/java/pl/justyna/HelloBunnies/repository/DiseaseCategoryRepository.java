package pl.justyna.HelloBunnies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.justyna.HelloBunnies.model.DiseaseCategory;

public interface DiseaseCategoryRepository extends JpaRepository<DiseaseCategory, Long> {

}
