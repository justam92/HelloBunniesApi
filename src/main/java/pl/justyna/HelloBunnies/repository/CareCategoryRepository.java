package pl.justyna.HelloBunnies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.justyna.HelloBunnies.model.CareCategory;

@Repository
public interface CareCategoryRepository extends JpaRepository<CareCategory, Long>{

}
