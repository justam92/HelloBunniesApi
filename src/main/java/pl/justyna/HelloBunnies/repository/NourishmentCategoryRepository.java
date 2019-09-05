package pl.justyna.HelloBunnies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.justyna.HelloBunnies.model.NourishmentCategory;

@Repository
public interface NourishmentCategoryRepository extends JpaRepository<NourishmentCategory, Long> {

}
