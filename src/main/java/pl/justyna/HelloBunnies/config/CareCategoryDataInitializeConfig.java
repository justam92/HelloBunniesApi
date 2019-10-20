package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.CareCategory;
import pl.justyna.HelloBunnies.service.CareCategoryServie;

@Configuration
public class CareCategoryDataInitializeConfig {

	@Autowired
	private CareCategoryServie careCategoryService;

	@Bean
	public InitializingBean insertCareCategoryInitialData() {
		return () -> {

			careCategoryService.create(new CareCategory("Oswajanie królika"));

			careCategoryService.create(new CareCategory("Królicza mowa"));

			careCategoryService.create(new CareCategory("Pielęgnacja królika"));

			careCategoryService.create(new CareCategory("Klatka dla królika"));

			careCategoryService.create(new CareCategory("Kuweta i nauka korzystania z kuwety"));

			careCategoryService.create(new CareCategory("Zabezpieczenie domu"));

			careCategoryService.create(new CareCategory("Królicze zabawki"));

			careCategoryService.create(new CareCategory("Towarzystwo dla królika"));

			careCategoryService.create(new CareCategory("Podróż"));

			careCategoryService.create(new CareCategory("Spacer z królikiem"));

			careCategoryService.create(new CareCategory("Ciąża i noworodki"));

			careCategoryService.create(new CareCategory("Podnoszenie królika"));

			careCategoryService.create(new CareCategory("Fizjologia"));

		};
	}
}
