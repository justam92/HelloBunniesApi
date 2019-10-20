package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.OilyOrCereal;
import pl.justyna.HelloBunnies.model.SeedAndCereal;
import pl.justyna.HelloBunnies.service.SeedAndCerealService;

@Configuration
public class SeedAndCerealDataInitializeConfig {

	@Autowired
	private SeedAndCerealService seedAndCerealService;

	@Bean
	public InitializingBean insertSeedAndCerealInitialData() {
		return () -> {

			seedAndCerealService.create(new SeedAndCereal(5L, "Amarant", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Gryka (podajemy rzadko", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Jęczmień", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Kanar", OilyOrCereal.CEREAL, null));

			seedAndCerealService
					.create(new SeedAndCereal(5L, "Kukurydza (bardzo rzadko, dużo skrobi)", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Anyżu", OilyOrCereal.OILY, "kaszel, wzdęcia"));

			seedAndCerealService
					.create(new SeedAndCereal(5L, "Nasiona Babki (lancetowa, zwyczajna)", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Bratków", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Chabru Bławatka", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Cykorii", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Dyni", OilyOrCereal.OILY, null));

			seedAndCerealService
					.create(new SeedAndCereal(5L, "Nasiona Fenkułu (kopru włoskiego)", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Gorczycy", OilyOrCereal.OILY, null));

			seedAndCerealService
					.create(new SeedAndCereal(5L, "Nasiona Gwiazdnicy pospolitej", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Komosy", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Komosy ryżowej", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Koniczyny", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Konopi", OilyOrCereal.OILY, null));

			seedAndCerealService
					.create(new SeedAndCereal(5L, "Nasiona Kopru", OilyOrCereal.OILY, "problem z trawieniem, wzdęcia"));

			seedAndCerealService
					.create(new SeedAndCereal(5L, "Nasiona Kozieradka", null, "apetyt, mlekopędne i przeciwskurczowe"));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Lucerny", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Maku", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Malwy", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Marchwi", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Mniszka", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Ogórka", null, null));

			seedAndCerealService
					.create(new SeedAndCereal(5L, "Nasiona Ostródy wodnej (dziki ryż)", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Ostu", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Pokrzywy", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Pora", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Rdestu", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Rzodkiewki", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Rumianku", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Sałat", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Sezamu", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Słonecznika", OilyOrCereal.OILY,
					"bardzo dobre na sierść i suchą skórę"));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Szczawiu", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Szpinaku", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Tasznika", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Traw", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Wiesiołka", OilyOrCereal.OILY,
					"dobrze działa na sierść w czasie linienia"));

			seedAndCerealService.create(new SeedAndCereal(5L, "Orkisz", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Orzechy (różne rodzaje)", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Owies (z wiechciem)", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Płatki owsianek", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Proso", OilyOrCereal.CEREAL, null));

			seedAndCerealService.create(
					new SeedAndCereal(5L, "Siemie lniane (zawiera glikozydy cyjanogenne", OilyOrCereal.OILY, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Szałwia", null, null));

			seedAndCerealService.create(new SeedAndCereal(5L, "Szałwia hiszpańska", null, null));

		};
	}
}
