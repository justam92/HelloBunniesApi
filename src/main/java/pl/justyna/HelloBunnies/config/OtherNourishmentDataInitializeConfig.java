package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.OtherNourishment;
import pl.justyna.HelloBunnies.service.OtherNourishmentService;

@Configuration
public class OtherNourishmentDataInitializeConfig {

	@Autowired
	private OtherNourishmentService otherNourishmentService;

	@Bean
	public InitializingBean insertOtherNourishmentInitialData() {
		return () -> {

			otherNourishmentService.create(new OtherNourishment(1L, "Trawa i siano",
					"Najzdrowszym pożywieniem dla królika jest łąka pełna soczystej trawy i ziół. Trawa i zioła zawierają wszystkie składniki, które królik potrzebuje. Niestety nie jesteśmy w stanie dostarczyć uszakom tyle zieleniny, a i nie wszyscy mają do niej dostęp. Siano zastępuje w znacznym stopniu świeżą trawę łąkową. Nie bez powodu nazywane jest \"króliczym chlebem\", 70% dziennej racji  żywnościowej królika powinno się składać z siana.</br>"
							+ "</br>" + "Dlaczego siano jest tak ważne?</br>" + "</br>"
							+ "- ściana przewodu pokarmowego królika jest bardzo słabo umięśniona, siano zawiera dużo włókna (22% - 37%), które pomaga przesuwać; pożywienie w przewodzie pokarmowym</br>"
							+ "- wysoko włókniste siano sprawia, że żołądek i jelita królika cały czas pracują</br>"
							+ "- siano równoważy zachodzącą w jelitach fermentacje</br>"
							+ "- zapobiega powstawaniu bezoarów</br>"
							+ "- nie tuczy, jest bardzo dobrym pożywieniem dla królików, które muszą być na diecie np. podczas choroby lub z powodu otyłości</br>"
							+ "- pomimo, że jest suszone zawiera dużo odżywczych składników, witamin i minerałów niezbędnych w diecie królika</br>"
							+ "- podczas przeżuwania siana ścierają się zęby</br>"
							+ "- jedzenie siana zabija nudę, uszak jest zajęty wynajdowaniem najlepszych ździebeł i ziół.</br>"
							+ "</br>"
							+ "Dobre siano składa się z kwiatów, ziół i różnorodnych traw. Ma ładny zielony kolor, grube źdźbła i przyjemny zapach. Zakurzone żółte siano świadczy o złym przechowywaniu lub jest po prostu stare. Nie nadaje się dla królika. Wilgotne, zaparzone lub spleśniałe siano może wywołać ciężka chorobę u naszych zwierzaków. Sianko podajemy królikowi w paśniku, w koszyku wiklinowym lub pudelku możemy też je włożyć do starej bawełnianej torby, zrobić kilka dziur i powiesić. Króliki bardzo lubią jeść sianko z podłogi, ale takie siano szybko się brudzi. Trzeba je często wymieniać i dbać o higienę w klatce.</br>"
							+ "</br>" + "Co zrobić jeśli uszak nie chce jeść siana:</br>" + "</br>"
							+ "- ogranicz inne pokarmy głownie granulat</br>"
							+ "- należy wypróbować kilka rożnych rodzajów siana</br>"
							+ "- można wymieszać siano z ziołami, mieszankę włożyć do płóciennej torby lub poszewki na kilka dni, siano przejdzie zapachem ziół i będzie bardziej atrakcyjne dla uszaka</br>"
							+ "- siano z tymotki większość uszaków lubi</br>"
							+ "- ostatecznie można popryskać sianko odrobina wody z miodem, podać gdy dobrze wyschnie</br>"
							+ "</br>"
							+ "Zwierzęta, które jedzą bardzo dużo trawy i ziół mogą zrezygnować na jakiś czas z jedzenia siana. Nie należy się tym przejmować, zielenina spełnia tą samą role co siano, oprócz tego dostarcza jeszcze wody królikowi. Pamiętajmy, aby po przerwie zimowej stopniowo przyzwyczajać króliki do zieleniny. Zabrane bez przygotowania na działkę mogą dostać poważnego wzdęcia lub rozwolnienia. Już cztero-tygodniowe maluchy skubią ze swoja mama sianko, ziółka i trawę.</br>"
							+ "</br>" + "Spleśniałe siano(również i inne pożywienie) może powodować Mykotoksyny."));

			otherNourishmentService.create(new OtherNourishment(6L, "Sałatki warzywne",
					"W tym dziale będziemy umieszczać najciekawsze przepisy na: sałatki, szaszłyki oraz inne zdrowe i oryginalne potrawy dla naszych uszatych. Wszystkie będą najpierw testowane przez moja trójkę. Ponieważ dostajemy dużo pytań na temat jadłospisu królika pierwszym przepisem, który podam będzie przykładowe danie (w dwóch wersjach) zjadane przez moje króle na kolacje.</br>"
							+ ""));

			otherNourishmentService.create(new OtherNourishment(6L, "Wariacje na kolacje", "Dla trzech królików:</br>"
					+ "Składniki: Trzy łodygi selera korzeniowego (natka), trzy kawałki selera, jedna marchewka pokrojona w plasterki, pomidor pokrojony w ósemki, sześć listków cykorii, trzy liście kalarepy.</br>"
					+ "</br>" + "Wersja druga:</br>"
					+ "Dwie łodygi naci selera, trzy kawałki brokułu, mała cykoria, trzy grubsze plasterki ogórka, trzy ósemki jabłka, marchewka, kawałek selera. Potrawa ozdobiona jest gałązka gooliwog."));

			otherNourishmentService.create(new OtherNourishment(6L, "Młody Bigosik", "Dla dwóch królików</br>"
					+ "Składniki: 6 listków sałaty rzymskiej, ja dodałam jeden listek sałaty lodowej, ale nie musi być, jedna marchewka, koperek, pół papryki czerwonej, pół żółtej.</br>"
					+ "</br>"
					+ "Sposób przygotowania: Wszystkie składniki myjemy, suszymy, kroimy na małe kawałeczki, koperkiem ozdabiamy potrawę i gotowe."));

			otherNourishmentService.create(new OtherNourishment(6L, "Papryka faszerowana", "Dla jednego królika.</br>"
					+ "Składniki: Jedna papryka, dowolne warzywa, ja wykorzystałam: pietruszkę, pomidorka koktajlowego, żółta paprykę i brokuły.</br>"
					+ "</br>"
					+ "Sposób przygotowania: Paprykę i warzywa myjemy, z papryki odcinamy wierzch z ogonkiem, usuwamy nasionka. Resztę warzyw drobno kroimy i wypełniamy nimi paprykę."));

			otherNourishmentService.create(new OtherNourishment(6L, "Flaga Polski",
					"Składniki: białe warzywa np. seler, pietruszka lub pasternak i czerwone buraki, długa marchew. Ja dla dwóch królików użyłam średnia pietruszkę i średniej wielkości buraka ćwikłowego.</br>"
							+ "</br>"
							+ "Sposób przygotowania: Warzywa myjemy, obieramy, pietruszkę i buraczek kroimy w kostkę, mniej</br>"
							+ "leniwi mogą zetrzeć je na tarce o grubych oczkach. Układamy kolorami w kształcie flagi. Z marchewki wycinamy słupek na nim będzie powiewać nasza flaga. Smacznego."));

			otherNourishmentService.create(new OtherNourishment(6L, "Przysmak Uszatego Przyjaciela",
					"Składniki: liście babki, brzozy, koniczyny, porzeczki, poziomki, rumianku, wierzby, winorośli, jabłoni. Do dekoracji kwiaty polne.</br>"
							+ "</br>" + "Wszystko ładnie układamy na tacy, dekorujemy kwiatami i danie gotowe."));

			otherNourishmentService.create(new OtherNourishment(6L, "Przysmak Uszatego Przyjaciela 2",
					"Dla jednego królika.</br>"
							+ "Składniki: liść sałaty (najlepiej rzymskiej), ćwierć marchewki, ćwierć banana, liść kapusty pekińskiej.</br>"
							+ "</br>" + "</br>" + "Sposób przygotowania:</br>"
							+ "Na miseczkę położyć wcześniej umyty liść sałaty, na niego pokrojoną w plastry marchewkę i banana. Wszystko obsypać pokrojoną kapusta pekińska i podać królikowi."));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywna łódeczka", "Dla jednego królika.</br>"
					+ "Składniki: Papryka, Gałązka z liśćmi (z jabłoni, z gruszy itp.), brokuły, ogórek, marchew.</br>"
					+ "</br>" + "Sposób przygotowania:</br>"
					+ "Paprykę umyć, przekroić na pół, usunąć gniazda nasienne, osuszyć. Zrobić żagiel z gałązki z listkami, wbić w paprykę. Do środka włożyć umyte i osuszone warzywa: brokuły, plasterki ogórka, plasterki marchewki."));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywny Stworek",
					"Składniki: Liść kapusty pekińskiej, marchewka, seler, papryka, nać pietruszki, rukola.</br>"
							+ "</br>" + "Sposób przygotowania:</br>"
							+ "Wszystkie składniki dokładnie myjemy i osuszamy. Jako twarz stworka dajemy liść kapusty pekińskiej, jako oczka - 2 plasterki marchewki, jako nos - kawałek selera, jako usta - 2 paseczki papryki, włosy robimy z natki pietruszki i rukoli.</br>"
							+ ""));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 1",
					"Składniki: 6 listków sałaty rzymskiej, kilka listków cykorii, buraczek, pietruszka, dwie różyczki brokuła, dwie brukselki, marchewka."));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 2",
					"Składniki: 3 listki pekińskiej, kilka listków sałaty rzymskiej, brokuły, ćwiartki jabłka, kilka listków cykorii, marchewka, pietruszka."));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 3",
					"Składniki: 3 listki mangold, 3 liście pekińskiej, kilka liści sałaty rzymskiej, pietruszka, marchewka, brokuł."));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 4",
					"Składniki: Jarmuż (bardzo lubiany), troszkę papryki zielonej i czerwonej, marchewka, różyczka brokuła, plasterek kiwi, dwie brukselki, dwie ósemki jabłka, kawałeczki kalarepy."));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 5",
					"Składniki: Jarmuż, 2 brukselki, 2 listki kapusty pekińskiej, marchew, seler, 4 pestki słonecznika (niewidoczne), papryka żółta i czerwona do dekoracji."));

			otherNourishmentService.create(new OtherNourishment(6L, "Łódź na wybrzeżu",
					"Składniki: 2 kawałki brokuł, ćwierć pomidora, kawałki kapusty pekińskiej.</br>" + "</br>"
							+ "Sposób przygotowania:</br>"
							+ "Wszystkie składniki dokładnie myjemy i osuszamy. Na misce układamy kapustę tak, by utworzyć ,,wyspę\". Następnie układamy brokuł  tak, by powstały drzewka, po czym kładziemy pomidora tak, by wyglądał jak łódź."));

			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 6",
					"Składniki: 2 liście kapusty, kilka listków sałaty rzymskiej, pół kalarepy, plastry dyni, pietruszka, pół buraka, pół marchewki."));

			otherNourishmentService.create(new OtherNourishment(6L, "Obiad dla króliczych mistrzów",
					"Składniki: liść kapusty pekińskiej, różyczka brokuła, kilka plasterków marchewki, stokrotki, liście i kwiaty mlecza.</br>"
							+ "</br>" + "</br>" + "Sposób przygotowania:</br>"
							+ "Wszystkie składniki dokładnie myjemy i osuszamy. układamy na talerzu liście kapusty pekińskiej, brokuła, plasterki marchewki, na pekince układamy stokrotki oraz kwiaty i liście mlecza.</br>"
							+ ""));

			otherNourishmentService.create(new OtherNourishment(6L, "Różany obiad w wersji króliczej",
					"Dla jednego króliczka:</br>"
							+ "Składniki: zielenina - mlecze, babki, natka marchewki, natka pietruszki, liście buraków, liście dziewanny, płatki róży, malina</br>"
							+ "</br>" + "</br>" + "Sposób przygotowania:</br>"
							+ "Wszystkie składniki dokładnie myjemy i osuszamy. Układamy grupowo zieleninę, na wierzchu rozkładamy płatki kwiatów, a w środeczku malinę."));

			otherNourishmentService.create(new OtherNourishment(6L, "Wiosenna sałatka", "Dla jednego króliczka:</br>"
					+ "Składniki: gałązki kopru, kilka gałązek liści oraz kosteczek selera korzeniowego,papryka czerwona, 4-5 kawałków marchwi, suszona mięta oraz melisa do smaku</br>"
					+ "</br>" + "</br>" + "Sposób przygotowania:</br>"
					+ "Wszystkie składniki dokładnie myjemy i osuszamy. Wszystko mieszamy razem."));

			otherNourishmentService.create(new OtherNourishment(7L, "Suszone warzywa i owoce",
					"Od czasu do czasu w nagrodę można uszakowi zaserwować suszony owoc, czy warzywa. Najlepiej suszyć te przysmaki samemu, kupne są chemicznie preparowane. Do suszenia nadają się jabłka, gruszki, morele, śliwki, marchew, seler, pietruszka, pasternak, buraczki, żurawina, czarne jagody, pomidory.</br>"
							+ " </br>"
							+ "Warzywa lub owoce dokładnie myjemy, obieramy i kroimy w cienkie plasterki. Bardzo pomocne są specjalne suszarki do grzybów i owoców, ale nie wszyscy takie posiadają. Suszyć możemy w piekarniku rozkładając produkty cienka warstwa na blasze, zalecana temperatura to 40-55°C. Możemy nawiązać plasterki na nici i powiesić w przewiewnym miejscu lub porozkładać je na papierze śniadaniowym i od czasu do czasu przekładać na druga stronę.</br>"
							+ " </br>"
							+ "Dobrze wysuszone przechowujemy w szklanych słojach lub szczelnych pojemnikach. Niedosuszone warzywa mogą niestety spleśnieć dlatego dobrym rozwiązaniem są też płócienne woreczki, powieszone w suchym miejscu. Nie chronią one jednak przed molami spożywczymi.</br>"
							+ " </br>"
							+ "Suszone warzywa i owoce traktujemy jako przysmak, ponieważ zawierają dużo cukru, za to są pozbawione wody. W żołądku pęcznieją, jeśli królik po suchym posiłku nie zje dostatecznej ilości siana bądź zieleniny, może dostać zaparcia. Duża zawartość cukru powoduje obniżenie ph w jelitach, w tak sprzyjających warunkach środowiskowych bakterie pasożytnicze mnożą się bardzo szybko. Częste są też zadławienia suszonymi warzywami.</br>"
							+ "</br>" + "Suszonymi warzywami można napełnić kule smakule."));

			otherNourishmentService.create(new OtherNourishment(8L, "Gałęzie",
					"Gałązki to prawdziwe dobrodziejstwo dla naszych uszaków. Pod korą znajdują się związki, które działają jak pasta do zębów, czyszczą i pielęgnują królicze zęby oraz masują dziąsła. Żując gałązki i korę, króliki równomiernie ścierają swoje stale rosnące zęby. Królikom sprawia ogromna radość obgryzanie kory, przycinanie gałązek, rzucanie nimi, przestawianie, układanie i oczywiście zjadanie</br>"
							+ "listków.</br>"
							+ "Uszaki potrafią się nimi zająć przez długie godziny. Jeśli mamy taką możliwość to codziennie dostarczajmy królikom świeżych gałęzi, wszystkie można podawać wraz z liśćmi i kwiatami. Ulubione gałązki naszych uszaków to jabłoń, grusza, malina, leszczyna, wierzba, porzeczka i brzoza.</br>"
							+ " </br>"
							+ "Gałęzie mogą być pokryte zielonym, czasami żółtym czy szarym nalotem. Są to glony, mchy i porosty. Występują głównie na drzewach, które stoją w zacienionych bądź wilgotnych miejscach, pojawiają się także po długich opadach deszczu, najbardziej są widoczne na starych drzewach i krzewach. Nie są szkodliwe dla królików, można takie gałązki spokojnie podawać. Niektóre króliki zabierają się w pierwszej kolejności za porosty, a później obgryzają inne części gałązki.</br>"
							+ " </br>"
							+ "Nie wszystkie drzewa i krzewy nadają się dla królika, najbardziej trujący z polskich drzew jest cis pospolity, trochę mniej : tuja, bukszpan, cyprysy i akacja (robinia akacjowa), bez, kruszyna pospolita, czeremcha. Kasztan zawiera związki eskuline i escyne, które mogą podrażnić układ pokarmowy, a nawet być przyczyną zatrucia. Dąb ze względu na duże stężenie garbników powinien być podawany rzadko, w celach leczniczych np. przy biegunce. Na temat orzecha włoskiego są podzielone zdania, posiada również duże stężenie garbników, lepiej nie podawać wcale lub rzadko, w małych ilościach. Ma działanie przeciwrobacze.</br>"
							+ "</br>"
							+ "Na temat gałązek drzew owocowych i samych owoców krąży wiele sprzecznych informacji, są uważane za szkodliwe, ponieważ podobno zawierają glikozydy cyjanogenne (amigdaline). Ta teorie obaliła pani dr. Jacqueline Kupper z Universytetu Farmakologii weterynaryjnej i Toksykologii w Zürichu, cytat:</br>"
							+ "\"Tylko nasiona i pestki zawierają cyjanki, gałązki drzew pestkowych mogą być podawane szynszylom, świnkom i królikom, pod warunkiem, że nie są spryskane. Pestek nie powinno się podawać, ponieważ gryzonie są wstanie je przegryźć\""));

			otherNourishmentService.create(new OtherNourishment(9L, "Granulaty",
					"Po fali kolorowych mieszanek, które zostały z czasem uznane za tuczące i niezdrowe, producenci karm dla zwierząt, aby odzyskać klientów wypuścili na rynek \"zdrowszy\" produkt – granulat. Granulat to sprasowane składniki w formie walca, najczęściej są w kolorze zielonym. Jest dużo rodzajów granulatu krajowej produkcji i zagranicznej, grubsze i cieńsze, o różnych odcieniach zielonego, ze zbożem i najnowszy trend - bez zbożowe. Karma ma zapobiec wybieraniu przez królików poszczególnych składników (jak odbywało się to w przypadku mieszanek), a tym samym marnowaniu ich. Dodam, że królik to zwierzątko, które w naturze ma selekcjonowanie. Nie zjada wszystkiego jak kosiarka tylko wybiera najsmaczniejsze, najbogatsze w witaminy, minerały czy białko rośliny. Wybieranie najlepszych i potrzebnych składników zapobiega niedoborom i służy instynktownemu samo leczeniu. Podając dwa razy dziennie taki sam pokarm o tej samej zawartości witamin i minerałów zmuszamy niejako królika, \"potrzebujesz czy nie, musisz zjeść\"."));

			otherNourishmentService.create(new OtherNourishment(9L, "Dlaczego granulat jest szkodliwy dla królików",
					"- naturalny pokarm królika zawiera 70-90% wody, granulat tylko około 9%-12%, większość królików nie jest wstanie uzupełnić brakujących w diecie płynów, stąd zagęszczenie moczu i odkładanie się złogów (piasek, kamienie) w pęcherzu i nerkach, częsty problemy u królików karmionych granulatem,</br>"
							+ "- granulat pęcznieje w zetknięciu z wilgocią, powiększa swoją objętość nawet do 5 razy, może zablokować układ pokarmowy lub uszkodzić jelita królika,</br>"
							+ "- granulki odciągają wodę, napęczniała granulka leży \"na sucho\", może się wręcz przykleić do ścianek żołądka i jelit, w ten sposób zaburza cały proces trawienny, króliki nie gryzą dokładnie granulatu tylko rozdrabniają i połykają także te większe kawałki, </br>"
							+ "- dostarcza zbyt dużo witamin i minerałów, te odkładają się w organach wewnętrznych i są przyczyna różnych chorób,</br>"
							+ "- jest tuczący, nie musi to być widoczne na zewnątrz, najczęściej otłuszczona jest wątroba i serce,</br>"
							+ "- za szybko syci, dlatego króliki rzadziej sięgają po pożywienie, to sprawia, że zęby są niedostatecznie ścierane, a pożywienie zalega w układzie pokarmowym. Króliki mają bardzo słabo umięśniony żołądek, aby treść pokarmowa mogła się przesuwać musi dojść dokładka z góry, jedno pożywienie popycha drugie, żołądek nigdy nie jest pusty. U sytego królika treść pokarmowa nie przesuwa się, gdyż przez dłuższy czas królik nie ma ochoty na jedzenie, zalęgająca treść pokarmowa rozkłada się, tworzą się gazy, których królik nie jest w stanie wydalić, nagromadzone gazy to bardzo bolesna przypadłość i nie rzadko jest przyczyna śmierci,</br>"
							+ "- pożywienie i trawienie mają ścisły związek ze ścieraniem zębów. Im rzadziej królik sięga po pokarm tym mniej ściera zęby, z tego wniosek: jedzenie musi być małokaloryczne, wysoko włókniste, dostępne cały czas,</br>"
							+ "- granulat jest zbyt twardy, królik musi użyć siły, aby go rozdrobnić, jeśli robi to regularnie będą się tworzyć odgniotki na dziąsłach, a zęby zaczną się chwiać, obok rozchwianych zębów tworzą się kieszonki, do których dostaje się pokarm, gnijące resztki są przyczyna zapalenia, stąd już blisko do ropnia i przerostu korzeni zębów. Gryzienie granulatu wymaga innych ruchów szczęki niż np. przy jedzeniu siana czy warzyw, nie wspomaga ścieraniu zębów, rozdrabnianie pożywienia odbywa się za krótko,</br>"
							+ "- granulat jest przyczyną śmierci wielu królików, które się nim po prostu zadławiły,</br>"
							+ "- granulki są drobno zmielone, przez to włókno roślinne ma zmienioną strukturę, takie włókno nie służy ani ścieraniu zębów, ani nie wspomaga trawienia, wręcz przeciwnie jest przyczyną zatwardzeń, być może dlatego do niektórych karm dodaje się sól gorzką,</br>"
							+ "- dobre bakterie bytujące w układzie pokarmowym wymagają odpowiedniego ph, skrobia zawarta w zbożach i wytłokach obniża środowisko bakteryjne, to sprawia, że bakterie chorobotwórcze szybko zaczynają się rozmnażać jednocześnie zmniejsza się ilość bakterii jelitowych. Następstwem są biegunki i wzdęcia. Bogata w cukry dieta ma wpływ na rozwój kokcydiozy i grzybicy układu pokarmowego oraz przebarwień na zębach. Wielu opiekunów pisze o nietolerancji warzyw przez królika, jest to związane ze szkodami jakie wyrządził granulat. Po odstawieniu karmy, zniszczony układ pokarmowy może się regenerować nawet do dwóch lat,</br>"
							+ "- behawioryści łącza agresje królików z karmieniem ich kalorycznym pokarmem, chodzi o nadmiar energii dostarczana z pożywieniem, która w jakiś sposób musi zostać rozładowana, króliczy organizm jest przystosowany do ubogiego w składniki odżywcze pożywienia,</br>"
							+ "- składniki użyte do zrobienia karm nie są nawet zbliżone do naturalnego pożywienia królika, to tanie produkty, których nie można już użyć w przemyśle spożywczym dla ludzi, odpady pakowane w ładne opakowania i sprzedawane jako zbilansowana, pełnowartościowa karma."));

			otherNourishmentService.create(new OtherNourishment(9L, "Co wchodzi w skład granulatów",
					"Siano, zioła.</br>"
							+ "Są mielone, podgrzewane i prasowane, w tym procesie giną najcenniejsze składniki, które później są sztucznie uzupełniane. Do sklejenia granulek używa się melasy lub zboża, zielony kolor daje im dodatek lucerny lub barwnika. Nie mamy pewności jakie zioła wchodzą w skład granulatu i w jakiej ilości. Jako ziołowe dodatki dla zwierząt wykorzystywane są również odpady poprodukcyjne z przemysłu zielarskiego, spożywczego lub kosmetycznego.</br>"
							+ "</br>" + "</br>" + "Warzywa i owoce.</br>"
							+ "Rzadko na opakowaniu jest podane jakie warzywa są użyte i w jakiej ilości. W większości są to tanie odpady z branży warzywno-owocowej, a więc wytłoki powstałe po wyciśnięciu warzyw i owoców (na soki, koncentraty), części owoców i warzyw, od sortowane, zepsute warzywa i owoce, obierki, skórki i pestki. Wytłoki zawierają bardzo dużo skrobi i cukru rożnego rodzaju, ale prawie żadnych witamin. Połknięte pęcznieją w żołądku i szybko nasycają królika. Częste ich podawanie może doprowadzić do otyłości, podwyższenia cukru, grzybicy w układzie pokarmowym, długie ich leżakowanie w żołądku sprzyja gromadzeniu się sierści i powstawaniu bezoarów oraz wzdęć.</br>"
							+ "</br>" + "</br>" + "Produkty pochodzenia roślinnego</br>"
							+ "To odpadki i resztki z  przemysłu spożywczego, produkty uboczne: </br>"
							+ "melasa, wysłodki- odpad z produkcji cukru</br>"
							+ "słód- odpad z produkcji piwa otręby, śruty, mąka, mączki,  plewy, resztki słomy, łupiny,</br>"
							+ "- odpad z produkcji maki, ekstrakty ze słonecznika, wytłoki, łupiny, śruty, mąka sojowa,</br>"
							+ "- resztki z produkcji oleju, ekstrakty z pestek winogron, wytłoki, skórki,</br>"
							+ "- odpady z produkcji  soku, win, przetwórstwa owoców i warzyw.</br>"
							+ "Produkty te maja prawie zerową wartość odżywczą, za to masę cukru i ciężkostrawnego tłuszczu. Czegoś takiego nasze zwierzaki nie potrzebują, nasz ukochany królik to nie pojemnik na odpadki. </br>"
							+ "</br>" + "</br>" + "Zboża i kukurydza.</br>"
							+ "Także (plewy, resztki kolb, śruty, otręby, maczki, mąka). W dalszym ciągu królik jest traktowany jak gryzoń tymczasem jego układ pokarmowy nie jest przystosowany do zjadania dużych ilości zboża. Ziarna zawierają dużo skrobi, ta szybko nasyca zwierzęta, jest powodem ociężałości królików, otyłości, otłuszczenie wątroby i serca. Syty uszak zjada o wiele mniej siana i zieleniny dlatego zęby nie są w dostatecznym stopniu ścierane. Gryzienie twardego zboża podrażnia dziąsła, powstają odgniecenia, częste podrażnienia mogą być przyczyną ropni.</br>"
							+ "Wielocukry trafiają do jelita grubego i służą bakteriom chorobotwórczym (Coli, Clostridium) i drożdżom za pożywkę. Tysiące królików cierpi z tego powodu na wzdęcia i zatory.</br>"
							+ "</br>" + "</br>" + "Lucerna.</br>"
							+ "Nadaje granulkom ładny zielony kolor i podwyższa procentowa ilość włókna. Jest wysokobiałkowa i wiąże wapń, który może się odkładać w pęcherzu i nerkach pod postacią piasku lub kamieni.</br>"
							+ "</br>" + "</br>" + "Orzechy i nasiona.</br>"
							+ "Zawierają bardzo dużo tłuszczu. W nadmiarze prowadzą do otyłości, do zmniejszenia apetytu na zdrowe jedzenie, powodują również różne choroby układu pokarmowego. Zazwyczaj nie ma informacji jakie nasiona i orzechy wchodzą w skład i w jakiej ilości. Można je podawać tylko jako przysmak raz na jakiś czas.</br>"
							+ "</br>" + "</br>" + "Nasiona strączkowe</br>"
							+ "Fasola, groch, groszek, łubin, bob, soja i resztki z nasion, suche strąki - tanie produkty, które mają za zadanie nasycić zwierzaka, łodygi i strąki dostarczają włókna. Surowe są trujące dla zwierząt, przetworzone - ciężkostrawne i wzdymające. Soja używana w żywieniu zwierząt jest genetycznie modyfikowana, u laboratoryjnych szczurków po podawaniu małych ilości zaobserwowano zmiany wyników krwi, zmiany na wątrobie i narządach płciowych.</br>"
							+ "</br>" + "</br>" + "Melasa, słód, cukier i  miód.</br>"
							+ "To bardzo niezdrowe dodatki chętnie używane przez producentów dla uatrakcyjnienia smaku granulatu. Niszczą zęby, obniżają ph układu pokarmowego ułatwiając zasiedlanie się bakteriom, grzybom i drożdżakom. Powodują otyłość i cukrzyce.</br>"
							+ "</br>" + "</br>" + "Produkty piekarnicze.</br>"
							+ "To odpady z piekarń tzw. \"zmiotki z podłogi\", oprócz środków spulchniających, ulepszaczy, jajek, mleka i maki zawierają także cukier.</br>"
							+ "</br>" + "</br>" + "Produkty pochodzenia zwierzęcego</br>"
							+ "Jajka, mączka kostna, mleko, jogurty itd. absolutnie nie powinny być podawane królikom, królik jest weganem, jego układ pokarmowy nie jest przystosowany do jedzenia takiego pożywienia.</br>"
							+ "</br>" + "</br>" + "Konserwanty i dodatki</br>"
							+ "Są zarówno dla ludzi jak i dla zwierząt szkodliwe. Niektóre z nich są rakotwórcze inne działają negatywnie na układ pokarmowy, uszkadzają nerki lub są przyczyna alergii. Przedłużają termin ważności, chronią przed pleśnieniem, bakteriami, brzydkim zapachem. Producenci karm dla zwierząt w krajach EU nie mają obowiązku podawania dodatków (konserwantów, substancji zagęszczających, barwników, wzmacniaczy smaku, aromatów, aminokwasów, antybiotyków, gazów ochronnych) na opakowaniu.</br>"
							+ "Barwniki - po zmieleniu wszystkich składników granulatu powstaje szaro-bura, nieapetyczna papka, aby zasugerować klientowi, że karma jest zdrowa i zrobiona z ziół i siana farbuje się ją na ładny zielony kolor. Z powodzeniem jak się przekonałam, na wielu forach króliczych i świnkowych opiekunowie są pewni, że granulat to sprasowane zioła.</br>"
							+ "Aromat - ma zachęcić zwierzaki do jedzenia, atrakcyjność zapachowa pobudza apetyt i zwiększa ilość pobieranej karmy, co na dłuższą metę doprowadza do otyłości.</br>"
							+ "Wzmacniacze smaku - zachęcają królika do jedzenia, wzmacniaj apetyt, zwiększają ilość pobieranej karmy. Opiekun cieszy się, że uszak ze smakiem rzuca się na jedzenie, następnym razem kupi taki sam granulat. Zarówno aromat jak i dodatki smakowe uzależniają. Stąd częste teksty \"mój królik nie chce jeść żadnej innej karmy\". Aby zwierzęta mogły strawić produkty do których ich układ pokarmowy nie jest stworzony dodaje się enzymy.</br>"
							+ "Emulgatory - pozwalają na łączenie składników, które normalnie nie dają się ze sobą połączyć np. olej i woda.</br>"
							+ "</br>" + "</br>" + "Syntetyczne witaminy i minerały.</br>"
							+ "Podczas obróbki i podgrzewania składników granulatu giną naturalne składniki odżywcze. Dlatego są uzupełniane sztucznymi i to w przesadnej ilości. Błędne jest przekonanie, że nadwyżka wydalana jest z moczem, odkłada się w rożnych organach i po latach daje o sobie znać kamieniami w układzie moczowym, wapnicą, osteoporozą, uszkodzoną wątrobą lub hiperwitaminozą. Część witamin króliki potrafią same wytworzyć (B, C , D i K) inne pobierane są wraz z pożywieniem np. Witamina E, witamina A nie występuje w naturalnym pożywieniu królików tylko Karoten (marchew, papryka, brokuły, szpinak, dynia). Mimo wszystko powyższe witaminy dodawane są do granulatu w ilości 6-10 krotni wyższej niż królik potrzebuje.</br>"
							+ "</br>" + "</br>" + "Leki</br>"
							+ "Najczęściej są to probiotyki podawane by zwierzęta mogły strawić ciężkostrawny i obcy dla ich układu trawiennego pokarm, bez natychmiastowego uszczerbku na zdrowiu. Dodawane są też kokcydiotyki, antybiotyki (zapobiegają rozmnażaniu się bakterii) i środki przeczyszczające. Lekarstwa powinny być zawsze podawane po uzgodnieniu z lekarzem. Podawanie ich profilaktycznie upośledza układ immunologiczny, pokarmowy i uodparnia bakterie na dany lek.</br>"
							+ "</br>" + " </br>"
							+ "Szkodliwość karmienia granulatem rozciąga się w czasie, wychodzi mniej więcej w 3-4 roku życia i na ogół nie jest wiązane z żywieniem \"przecież mój królik cały czas to jadł i nic mu nie było\". Zdrowy królik nie potrzebuje żadnych sztucznie wytwarzanych pokarmów. Siano, zielenina, warzywa i gałązki pokrywają wszystkie potrzeby królika. Utrzymują go w zdrowiu, dbają o zęby i układ pokarmowy, zapobiegają otyłości. Podając zerwane zioła mamy pewność, że jest to np. babka, a nie niewiadomego pochodzenia produkt o wątpliwej zawartości okraszony sztucznymi witaminami."));

			otherNourishmentService.create(new OtherNourishment(10L, "Woda",
					"Królik musi mieć ciągły dostęp do świeżej wody. Wodę możemy wlać do specjalnie przeznaczonego do tego celu poidełka lub do zwykłej miski, najlepiej ceramicznej. Poidełko ma jedną zasadnicza wadę, mianowicie sprawia pewne trudności królikowi w jego korzystaniu, zaś miseczka pomimo łatwości dostępu, może być często wywracana przez królika, a co za tym idzie, woda znajdująca się w środku będzie lądować na podłodze, dlatego ważne jest, aby miska była na tyle ciężka, żeby króliczek nie mógł jej zbyt łatwo wywrócić. Kolejną wadą miseczki jest to że</br>"
							+ "na jej powierzchni mogą kumulować się nieczystości z zewnątrz. Pomimo wad zastosowania miseczki, ja zdecydowanie bardziej polecam właśnie ten sposób podawania picia naszym pupilkom.</br>"
							+ " </br>"
							+ "Poidełko oprócz sprawiania trudności przy korzystaniu z niego przez królika, ma również inne zasadnicze wady, np.:</br>"
							+ "- poidełka nie można dobrze i dokładnie umyć, stąd namnażają się w nim bakterie,</br>"
							+ "- czasami, bez naszej wiedzy ustnik zatyka się, przez co króliczek nie ma dostępu do wody.</br>"
							+ "</br>"
							+ "Jeżeli zdecydujemy się na poidełko, to aby uniknąć bakterii, poprzez złe wymycie należy do środka wrzucić kilkanaście ziarenek ryżu i energicznie potrząsać, aby zetrzeć osad ze środka. Dziubek (ustnik) należy myć wacikami do uszu, ze szczególna ostrożnością, aby kawałki waty nie pozostawały w środku.</br>"
							+ "</br>"
							+ "Bez względu na to czy wybierzemy poidełko czy ceramiczną miseczkę, bezwzględnie musimy pamiętać o tym, że przynajmniej raz dziennie powinniśmy wymieniać wodę na świeżą, a w okresie upałów, takie zmiany powinny być zdecydowanie częstsze.</br>"
							+ "</br>"
							+ "Należy pamiętać że woda nie powinna być prosto z kranu, ale wcześniej należy ją przygotować. Można również używać wód mineralnych, najlepiej nisko mineralizowanych z małą zawartością wapnia, z tym że taka woda powinna być często zmieniana na inną, ponieważ zawarte w niej minerały, powinny być zróżnicowane, im bardziej zróżnicujemy rodzaje wód mineralnych, a co za tym idzie minerałów, tym bardziej zminimalizujemy ewentualne choroby, związane z nadmiarem niektórych pierwiastków. Szczególnie polecam wody: Żywiec zdrój źródlana i wodę dla niemowląt.</br>"
							+ "</br>"
							+ "Z wodą możemy rozpuszczać różnego rodzaju leki, jak i witaminy których uszak nie chce przyjmować w tradycyjny sposób, ale tylko w szczególnych przypadkach. Alternatywą dla wody może być podawanie herbatki koperkowej lub rumiankowej."));

			otherNourishmentService.create(new OtherNourishment(10L, "Miseczka czy poidełko",
					"Badania przeprowadzono na Uniwersytecie w  Zürichu.</br>" + "</br>"
							+ "Króliki chętniej piją z otwartych naczyń niż z poidełek. Mogą szybciej i więcej się napić, wskazują nowe badania na Uniwersytecie w Zürichu. Aby zwierzaki cieszyły się doskonałym zdrowiem muszą być oprócz tego żywione sianem i świeżą zielenina.</br>"
							+ "</br>"
							+ "Poidełko czy miseczka? To pytanie w czym najlepiej podać wodę pupilowi zadaje sobie wielu opiekunów. Bardzo popularne jest poidełko, które przymocowuje się do prętów klatki. W poidełku woda pozostaje czysta i w przeciwieństwie do miseczek nie zostanie zabrudzona czy wylana. Które z pojemników wybiorą króliki i jak przez odpowiedni wybór naczynia i pożywienia osiągnąć optymalny pobór wody zbadała w swojej pracy doktorskiej Pani Anja Tschudin. Wybór pojemnika jest szczególnie ważny dla zwierząt, które miały już kiedyś kamienie w układzie moczowym, co u królików czasami występuje, lub inną chorobę związaną z układem moczowym."));

			otherNourishmentService.create(new OtherNourishment(10L, "Miseczki lepsze",
					"Wszystkie króliki biorące udział w doświadczeniu P. Anja Tschudin wybierały pojemniki otwarte mając do wyboru miseczki i poidła.</br>"
							+ "</br>"
							+ "Zwierzęta mogły w krótszym czasie wypić więcej wody. Gdy pożywienie składało się tylko z siana bądź z granulatu zrobionego z siana króliki wypijały o wiele więcej wody, niż gdy dostawały do jedzenia ziarna. \"Siano jest zalecane dla królików, ponieważ w przeciwieństwie do zbóż odpowiada naturalnemu pożywieniu uszaków, który wspomaga niezbędne ścieranie zębów i gwarantuje odpowiedni pobór wapnia\" - wyjaśnia Anja Tschudin i dodaje \"do tego siano prowadzi do większego zapotrzebowania na wodę i co za tym idzie do zwiększonego wydalania moczu. Rozcieńczony mocz może zapobiec powstaniu kamieni moczowych\".</br>"
							+ "</br>"
							+ "Dostarczanie wody było jeszcze lepsze gdy do siana podawana była zielenina np. natka pietruszki, ponieważ poprzez pożywienie pobierana była dodatkowa ilość płynu. Dla królików popularna marchewka i owoce są ze względu na zawartość cukrów mniej polecane."));

			otherNourishmentService.create(new OtherNourishment(10L,
					"Wystarczająca ilość wody, siano i świeża zielenina",
					"Gdy króliki w doświadczeniu mogły bez ograniczenia pić wodę nie było widać znaczących różnic w ilości wypijanej wody w poszczególnych rodzajach pojemników. Jednak kał w fazie picia z poidełek był zdecydowanie bardziej suchy. To znaczy, że organizm królika aktywował mechanizm oszczędzania wody. Jeśli pobieranie wody było ograniczone do 12 bądź 6 godzin dziennie króliki pobierały mniej wody, ale o wiele więcej pijąc z misek niż z poidełek. \"Napełniona miseczka wody oraz pożywienie składające się z siana i zielonego, świeżego pożywienia zapewnia optymalne zaopatrzenie królika w płyny\" radzi P. Tschudin. To odnosi się także do świnek morskich i innych małych gryzoni jak koszatniczki."));

		};
	}
}
