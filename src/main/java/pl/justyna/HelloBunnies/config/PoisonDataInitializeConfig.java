package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.Poison;
import pl.justyna.HelloBunnies.service.PoisonService;

@Configuration
public class PoisonDataInitializeConfig {

	@Autowired
	private PoisonService poisonService;

	@Bean
	public InitializingBean insertPoisonInitialData() {
		return () -> {

			poisonService.create(new Poison("Rośliny szkodliwe i trujące",
					"\"Wszystko jest trucizną decyduje tylko dawka\" - Paracelsus</br>" + "</br>"
							+ "Króliki należą do zwierząt selekcjonujących rośliny. Wybierają rośliny najbardziej korzystne dla nich pod względem zdrowotnym, bogate w składniki odżywcze, soczyste i świeże. W naturze wykorzystują także rośliny przez nas zakwalifikowane jako trujące, aby poprawić swój stan zdrowia, wzmocnić odporność, pozbyć się pasożytów czy bólu, zapobiec chorobie czy uleczyć już tą istniejącą .</br>"
							+ "</br>"
							+ "W domowych warunkach króliki nie mają możliwości selekcjonowania. To my wybieramy im rośliny jakie mają zjeść i w jakiej ilości. Układamy jadłospis, często mimo naszych dobrych chęci na niekorzyść królika. Z braku innych możliwości królik musi zjeść to co mu damy lub sam przypadkiem znajdzie (np. kwiat doniczkowy).</br>"
							+ "</br>"
							+ "Aby zapobiec zatruciom i wspierać naturalne selekcjonowanie powinniśmy podawać swoim pupilom duże ilości różnych gatunków roślin. Królik sam znajdzie to czego potrzebuje i zostawi to co mu się w tej chwili nie przyda, bądź jest dla niego szkodliwe.</br>"
							+ "</br>"
							+ "Duży wybór warzyw pozwala królikowi odrzucić te warzywa, które zawierają zbyt dużo pestycydów, zje te mniej pryskane. Króliki, które nie mają wyboru zjedzą wszystko z głodu, świadomie narażając własne zdrowie. To tyczy się także siana, zazwyczaj jedna trzecia siana leży rozrzucona wokół paśnika. To są trawy i rośliny odrzucone przez królika, mało wartościowe pod względem odżywczym, zepsute bądź trujące np. często spotykany w sianie śmiertelnie trujący Ziemowit jesienny i starzec jakubek. Dlatego nie należy zmuszać królika do zjadania całości tylko dołożyć następną porcje siana.</br>"
							+ "</br>"
							+ "Szkodliwe rośliny to rośliny, które mogą zaszkodzić królikowi jeśli zje ich za dużo. Kilka przypadkowych pędów wymieszanych z trawą i innymi ziołami nie stanowi niebezpieczeństwa np. jaskier, bluszcz itp. Cebula, por, szczypiorek u wrażliwych królików mogą wywołać wzdęcie. Wiele źródeł przestrzega przed ostrym smakiem i trującymi właściwościami warzyw cebulowych. Pragnę wszystkich uspokoić wbrew informacjom w necie, żaden królik nie zje toksycznej ilości cebuli bądź czosnku. Tymi warzywami interesują się zwierzęta, które mają problemy zdrowotne np. są zarobaczone, o osłabionej odporności, zakatarzone. Króliki doskonale wiedzą na jaką dawkę mogą sobie pozwolić i po kuracji wykluczają warzywa cebulowe ze swojej diety.</br>"
							+ "  </br>"
							+ "Szkodliwe rośliny to też te które regularnie podawane przez długi okres czasu mogą spowodować chorobę, jednorazowo nie stanowią problemu np. rabarbar zawierający duże ilości kwasu szczawiowego czy suszona lucerna - duża zawartość wapnia.</br>"
							+ "</br>"
							+ "Z popularnych warzyw, które mogą zaszkodzić to np. kapustne: kapusta biała, włoska, czerwona, brukselka, a nawet kalafior czy brokuł bez wcześniejszego, stopniowego przyzwyczajenia, może skończyć się u królika bolesnym wzdęciem. Te warzywa nie powinny znaleźć się w diecie królików karmionych suchym pokarmem.</br>"
							+ "</br>"
							+ "Surowe rośliny strączkowe (fasola, groch, soczewica, bob) spowodują rozwolnienie lub wzdęcie. Fasola w stanie surowym jest trująca. Ziemniaki zawierają dużo ciężkostrawnej skrobi, nadziemna część rośliny jest trująca, zielone owoce, kiełki i zielone miejsca na ziemniaku zawierają solaninę, która powoduje zatrucia.</br>"
							+ "</br>" + "Krzak pomidora oraz zielona część na owocu zawiera również solaninę.</br>"
							+ "Owoce egzotyczne jak cherymoja, liczi, owoc granatu, mogą spowodować zaburzenia układu pokarmowego. Awokado jest trujące prawie dla wszystkich zwierząt domowych.</br>"
							+ "</br>"
							+ "Pragnę też wspomnieć o świeżej trawie zaraz po zimie, ponieważ jest nam znanych dużo przypadków wzdęć zakończonych śmiercią. Trawa nie jest trująca, jest bardzo ważnym składnikiem króliczej diety, ale króliki muszą zostać do niej przyzwyczajone, jak do każdego nowego pokarmu. Scenariusz jest zawsze ten sam: pierwsze ciepłe dni, słoneczko, zielona trawa, króliczki są wynoszone na dwór, zabierane na działkę, do ogrodu... Można, ale trzeba najpierw przyzwyczaić królika do zieleniny zaczynając od małych ilości (garstki) codziennie je zwiększając. To bardzo, bardzo ważne.</br>"
							+ "</br>"
							+ "Listy z trującymi roślinami na króliczych stronach bazują na  roślinach trujących stworzonych dla bydła i ludzi, na tej podstawie powstają tez listy dla psów i kotów. Większość przedstawionych tam roślin nie stanowi niebezpieczeństwa, wręcz przeciwnie są zdrowym urozmaiceniem diety królika, uszak jest w stanie wykorzystać je w celach leczniczych jako np. naturalny antybiotyk, środek przeciw pasożytom czy przeciwbólowy.</br>"
							+ "</br>"
							+ "Tylko naprawdę nieliczne rośliny są dla uszaka trujące i nie powinien mieć on z nimi styczności, oto one:</br>"
							+ "bielun dziędzierzawa, ciemiernik biały, cis, czworolist pospolity, kokorycz, konwalia, kulczyba wronie oko, laurośliwa wschodnia, lucky Bamboo, lulek, obrazki, naparstnica purpurowa, oleander, ostrózka wyniosła, psianka czarna, psianka słodkogórz, pszeniec, Rącznik pospolity, słodlin, śniedek, starzec jakubek, szalej jadowity, Szczwół plamisty, szczyr trwały , tojad mocny, trąby anielskie, wawrzyn kalifornijski, wawrzynek wilczełyko, wilczomlecz obrotny, wilczomlecz sosnka, zimowit jesienny, Złotokap."));

			poisonService.create(new Poison("Produkty szkodliwe",
					"Firmy, które produkują poniższe \"przysmaki\" nastawione są na szybki zysk, tak na prawdę nie zależy im na zdrowiu naszych zwierząt. Wmawiają nam poprzez reklamę na pudełkach, że kupując dany produkt robimy dla naszych zwierząt coś dobrego, że dostarczamy mu niezbędne witaminy lub, że bez tego zakupu królicze zęby się nie zetrą. To nie prawda, te wszystkie \"przysmaki\" są szkodliwe, tuczące i zawierają składniki, których w naturze królik nigdy by nie zjadł.</br>"
							+ " </br>"
							+ "Sól - może być niebezpieczna dla królika, odgryzienie większego kawałka może spowodować zatrucie chlorkiem sodu i nieodwracalnym uszkodzeniem nerek. Zjadane warzywa i zielenina dostarczają wszystkich niezbędnych mikroelementów królikowi, sól jest zbędnym i szkodliwym wydatkiem.</br>"
							+ " </br>"
							+ "Wapieńko - przeważnie jest to gips z dodatkiem smakowym i jeśli jest kolorowe to z dodatkiem farby spożywczej. Wapieńko jabłkowe to nic innego jak gips + sztuczny dodatek smakowy. Zbyt dużo wapnia w diecie prowadzi nie tylko do powstawania piasku i kamieni i do niewydolności nerek, nadmiar wapnia odkłada się w innych organach i uszkadza je.</br>"
							+ " </br>"
							+ "Wapieńko blokuje wchłanianie niektórych mikro i makro elementów. Nadmiar może doprowadzić do poważnych niedoborów i anemii. Królik nie potrzebuje tego typu \"przysmaków\", wapń przyjmuje drogą naturalną jedząc siano, zieleninę i warzywa.</br>"
							+ " </br>"
							+ "Kolby, dropsy i ciasteczka - apetycznie wyglądają, ale zawierają dużo cukru, ziaren i sztucznego miodu, tuczą, niszczą zęby i mogą spowodować problemy z układem pokarmowym. Dropsy oprócz cukru mają w swoim składzie produkty mleczne. Królik nie jest w stanie strawić laktozy zawartej w mleku.</br>"
							+ "  </br>"
							+ "Zielone Rollis z lucerny - zawierają za dużo wapnia, mało włókna, tłuszcz. Robione są z lucerny, ziaren, produktów pochodzenia roślinnego i warzyw.</br>"
							+ "  </br>"
							+ "Mieszanki - cokolwiek pisze na pudełkach to nieprawda. Mieszanki składają się z rożnych ziaren, nasion, orzechów i produktów pochodzenia roślinnego. Zawierają za dużo białka i tłuszczu, a za mało włókna. Konsekwencja tego pożywienia to otyłość, przerośnięte zęby, próchnica, ropnie zębów, problemy z układem pokarmowym i moczowym, otłuszczoną wątrobą i serce, krótsze życie. Nie róbmy tego naszym królikom. Im bardziej naturalna i uboga w tłuszcze, białka i cukry dieta tym zdrowszy i szczęśliwszy królik. Siano, zielenina i warzywa zaspakajają zapotrzebowanie</br>"
							+ "na wszystkie składniki odżywcze królika.</br>" + "  </br>"
							+ "Chleb, bułki - to bomba kaloryczna. często na suchym chlebie pojawiają się zarodniki pleśni, jeszcze ich nie widać gołym okiem, ale mogą już być. Szkodliwe są dodatki, tzw. ulepszacze, także drożdże, cukier, sol i ... zboże. Nieprawdą jest, że suchy chleb ściera zęby, dla ostrych zębów królika chleb to żadne wyzwanie. W pyszczku rozpuszcza się na papkę i zostaje połknięte. Pieczywo szybko syci dlatego królik przez jakiś czas nie je siana, leżący w żołądku chleb fermentuje, obniża ph w jelitach przez co giną dobre bakterie, a namnażają się te szkodliwe dla zdrowia, powstaje idealne środowisko dla grzybów i drożdżaków.</br>"
							+ "</br>"
							+ "Zdrowy królik poradzi sobie z niewielką ilością chleba, ale jeśli odporność uszaka będzie z jakiegoś powodu słabszą królik może dostać groźnego dla życia rozwolnienia lub wzdęcia."));

		};
	}
}
