package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.NourishmentCategory;
import pl.justyna.HelloBunnies.service.NourishmentCategoryService;

@Configuration
public class NourishmentCategoryDataInitializeConfig {

	@Autowired
	private NourishmentCategoryService nourishmentCategoryService;

	@Bean
	public InitializingBean insertNourishmentCategoryInitialData() {
		return () -> {

			nourishmentCategoryService.create(new NourishmentCategory("Trawa i siano"));

			nourishmentCategoryService.create(new NourishmentCategory("Zioła"));

			nourishmentCategoryService.create(new NourishmentCategory("Warzywa"));

			nourishmentCategoryService.create(new NourishmentCategory("Owoce"));

			nourishmentCategoryService.create(new NourishmentCategory("Nasiona i zboże"));

			nourishmentCategoryService.create(new NourishmentCategory("Przepisy na sałatki"));

			nourishmentCategoryService.create(new NourishmentCategory("Suszone owoce i warzywa"));

			nourishmentCategoryService.create(new NourishmentCategory("Gałązki"));

			nourishmentCategoryService.create(new NourishmentCategory("Granulat"));

			nourishmentCategoryService.create(new NourishmentCategory("Woda"));

		};
	}
}
