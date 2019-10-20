package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.DiseaseCategory;
import pl.justyna.HelloBunnies.service.DiseaseCategoryService;

@Configuration
public class DiseaseCategoryDataInitializeConfig {

	@Autowired
	private DiseaseCategoryService diseaseCategoryService;

	@Bean
	public InitializingBean insertDiseaseCategoryInitialData() {
		return () -> {
			
			diseaseCategoryService.create(new DiseaseCategory("Choroby kości"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby oczu"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby uszu"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby układu moczowego"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby układu oddechowego"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby układu pokarmowego"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby układu rozrodczego"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby pasożytnicze zewnętrzne"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby pasożytnicze wewnętrzne"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby skóry"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby wymagające szczepień"));

			diseaseCategoryService.create(new DiseaseCategory("Choroby zębów"));

			diseaseCategoryService.create(new DiseaseCategory("Inne choroby"));

			diseaseCategoryService.create(new DiseaseCategory("Apteczka"));
			
		};
	}
}
