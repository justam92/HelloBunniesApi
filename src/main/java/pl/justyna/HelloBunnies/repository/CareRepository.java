package pl.justyna.HelloBunnies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.justyna.HelloBunnies.model.Care;

@Repository
public interface CareRepository extends JpaRepository<Care, Long>{

	List<Care> findByIdCareCategory(Long idCareCategory);
}
