package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.Disease;
import pl.justyna.HelloBunnies.service.DiseaseService;

@Configuration
public class DiseaseDataInitializeConfig {

	@Autowired
	private DiseaseService diseaseService;

	@Bean
	public InitializingBean insertDiseaseInitialData() {
		return () -> {

			diseaseService.create(new Disease(1L, "Osteoporoza",
					"Jest to mało znana choroba u królików. Polega na postępującym ubytku masy kostnej w wyniku czego częste są złamania i problemy z zębami.</br>"
							+ " </br>" + "Przyczyny:</br>" + "- zbyt mało ruchu</br>"
							+ "- zaburzenia wchłaniania wapnia</br>" + "- dieta wysokobiałkowa</br>" + "</br>"
							+ "Jak zapobiegać:</br>"
							+ "Siano i trawa zawierają wystarczającą ilość wapnia. W sianie znajduje się też witamina D, powinno być zawsze dostępne dla królika. Pozwólmy w ciepłe dni królikowi na wylegiwanie się w słoneczku na zabezpieczonym balkonie. Uwaga! Nie wolno stawiać klatki na słońcu, uszak musi mieć wybór gdzie chce przebywać. Królik powinien mieć możliwość codziennego wybiegania się, im więcej tym lepiej."));

			diseaseService.create(new Disease(1L, "Złamanie",
					"Może się zdarzyć, że nasz ukochany uszak podczas swoich dzikich skoków uderzy się mocno o twardy przedmiot, podwinie mu się łapka lub kończyna utkwi w paśniku i szarpiąc się, królik ję sobie złamie.</br>"
							+ " </br>" + "Symptomy:</br>"
							+ "Królik nie biega tak jak zwykle, prawie się nie rusza, a jeśli już to kuleje, tylna łapka ucieka na bok, królik nie obciąża skoku, trzyma łapkę w powietrzu.</br>"
							+ "</br>" + "Diagnoza:</br>"
							+ "Należy wykonać zdjęcie RTG, na jego podstawie lekarz zadecyduje o dalszym leczeniu. Królicze kości łamią się inaczej niż ludzkie powstaje wiele odłamków, które maja bardzo ostre krawędzie. Źle ustabilizowana kość może przebić się na zewnątrz i doprowadzić do martwicy lub gangreny.</br>"
							+ "</br>"
							+ "W mało skomplikowanych przypadkach wystarczy unieruchomić kończynę na kilka tygodni, uszak musi dostać środki przeciwbólowe np. metacam. Zazwyczaj jednak musi być wykonana operacja i drutowanie tzw. drutami Kirschera lub gwoździowanie metoda Steinmanna. Gwoździe usuwa się po około 6 tyg. jeśli nie ma przeciwwskazań gwóźdź może pozostać w kości.</br>"
							+ "</br>"
							+ "W najgorszym wypadku trzeba przeprowadzić amputacje. Króliki szybko przyzwyczajają się do skakania na trzech łapkach i po okresie rekonwalescencji są tak samo ruchliwe i radosne jak ich koledzy z czterema sprawnymi kończynami.</br>"
							+ "</br>"
							+ "Królik po operacji powinien mieć ograniczona powierzchnie do poruszania się, bez możliwości wskakiwania na przedmioty. Podłoga powinny być miękka, nieślizgająca się. Dobrze sprawdzają się podkłady higieniczne dla niemowląt, pozwalają utrzymać higienę i zapobiegają odparzeniom i zanieczyszczeniu rany. Przez okres 10 dni (o ile lekarz nie zaleci inaczej) królik powinien otrzymywać antybiotyk i środki przeciwbólowe. Środki przeciwbólowe są bardzo ważne, kończyna musi być w małym stopniu używana, aby nie dopuścić do całkowitego zaniku mięśni.</br>"
							+ " </br>"
							+ "Jeśli uszak nie ma apetytu powinno się go dokarmiać np. warzywnymi słoiczkami dla niemowląt lub rozmoczonym granulatem, więcej w temacie \"dokarmianie\".</br>"
							+ "</br>"
							+ "Wszystkim wypadkom nie da się zapobiec, ale chciałabym Wam zwrócić uwagę na kilka rzeczy np.:</br>"
							+ "- paśnik to prawdziwa pułapka dla królików, uszaki chętnie na niego wskakują, łapka wpada pomiędzy kratki, królik w panice szarpnie łapkę i nieszczęście gotowe.</br>"
							+ "Znam kilka takich przypadków.</br>"
							+ "Umocujcie paśnik albo na zewnątrz klatki, albo tak żeby uszak nie mógł na niego wskoczyć lub zastąpcie go np. koszykiem wiklinowym.</br>"
							+ "- drzwiczki klatki, które otwierają się do dołu, spróbujcie przepleść tekturę pomiędzy szczebelki lub przełóżcie drzwiczki tak żeby otwierały się na bok lub do góry.</br>"
							+ "- balkon, musi być dobrze zabezpieczony, bez niebezpiecznych szpar, świetne są siatki, które opiekunowie kotów montują dla bezpieczeństwa na swoich balkonach.</br>"
							+ "- wysokie meble, nie da się ich całkowicie zabezpieczyć, uszaki lubią wskakiwać na rożne wysokie przedmioty, problem później jest zejściem, miejcie oczy dookoła głowy,świetne są plotki/zagródki, którymi można odgrodzić zakazany mebel lub zamknąć w niej królika podczas naszej nieobecności.</br>"
							+ ""));

			diseaseService.create(new Disease(1L, "Uraz kręgosłupa",
					"Należą do dosyć częstych urazów, powstają np. gdy królik wyrwie nam się z rąk i upadnie na podłogę, zeskoczy ze stołu w gabinecie lekarskim, zostanie zaatakowany przez kota lub drapieżnego ptaka.</br>"
							+ "</br>" + "Objawy:</br>"
							+ "Królik może mieć trudności z poruszaniem się, kuleje lub ciągnie łapę za sobą. Jeśli doszło do uszkodzenia rdzenia kręgowego może nastąpić częściowy lub całkowity paraliż, oraz problemy z wydalaniem moczu i kału. Dokładną diagnozę stawia lekarz po badaniu neurologicznym i na podstawie zdjęć RTG. Leczenie zależy od stopnia uszkodzenia kręgosłupa. Pomóc mogą masaże, akupunktura i ćwiczenia wg zaleceń weterynarza. Dużym problemem jest utrzymanie higieny uszaka. Królik załatwia się pod siebie, mocz podrażnia skórę na brzuszku i w okolicach płciowych, powstają odparzenia i stany zapalne. Dodatkowe zagrożenie w ciepłe dni stanowią muchy, można się przed nimi bronić zakładając siatki w oknie. Ściółkę trzeba zmieniać bardzo często, królika myć i smarować maściami zaleconymi przez lekarza. Dobrze sprawdzają się pampersy i maty dla niemowląt, szybko wchłaniają mocz. Pamiętajmy o regularnym dopijaniu i dokarmianiu uszaka."));

			diseaseService.create(new Disease(2L, "Jaskra",
					"Jaskra jest poważną i bolesną chorobą, która prowadzi do nieodwracalnego uszkodzenia nerwu wzrokowego. Najczęściej spowodowana jest wysokim ciśnieniem wewnątrz gałki ocznej. Prawidłowe ciśnienie powinno być w granicach 15-25 mmHG. Jaskra może być też pierwszym objawem E.cuniculi.</br>"
							+ "</br>" + "Objawy:</br>" + "- czasami można zauważyć zielony refleks w oku,</br>"
							+ "- zaczerwienione i bolesne oko,</br>" + "- biała mgiełka,</br>"
							+ "- wytrzeszcz oka.</br>"
							+ "Lekarz zmierzy ciśnienie oka, przepisze krople na obniżenie ciśnienia, środek przeciwbólowy i ewentualnie antybiotyk. Jaskrę leczy się też operacyjnie. Jeśli królik stracił wzrok trzeba wspólnie z lekarzem rozważyć usuniecie oka, sprawia ono królikowi dotkliwy ból, a podawanie do końca życia środka przeciwbólowego nie rozwiąże sprawy.</br>"
							+ "</br>" + "Wspomagające leczenie zioła: szałwia i czarna jagoda."));

			diseaseService.create(new Disease(2L, "Zaćma (katarakta)",
					"Jest to choroba oczu prowadząca do zmętnienia soczewki i w końcowym etapie do ślepoty. Zaćma może być wrodzona i nabyta. Nabyta powstaje w wyniku przebytych chorób (jaskry, cukrzycy e.cuniculi), jako efekt uboczny niektórych leków np. sterydów, w wyniku zatrucia, błędów w żywieniu, uszkodzeniu oka.</br>"
							+ "</br>" + "Objawem jest:</br>" + "-  szaro/biała mgiełka na oku.</br>"
							+ "Weterynarz powinien dokładnie przebadać uszaka, także powinien zbadać mocz i krew, żeby wykluczyć cukrzyce, e.cuniculi lub inna chorobę, która mogła spowodować zmętnienie oka. Czasami wskazana jest operacja. Podczas operacji usuwa się zmienioną soczewkę i wstawia sztuczna."));

			diseaseService.create(new Disease(2L, "Królik niewidomy",
					"Może być tak samo szczęśliwy jak królik widzący. I inne zmysły wyostrzają się i zastępują uszakowi oczy. Początkowo królik będzie trochę zagubiony i może tracić orientacje, ale szybko przyzwyczai się do nowej sytuacji. Będzie uważnie nasłuchiwał i używał swoich wibrysów. Pocierając brodą przedmioty nie tylko je znaczy, ale też zapamiętuje gdzie co stoi. Dlatego nie zmieniaj nic w pokoju, nie przestawiaj doniczek, ani mebli, zabezpiecz schody i ostre kanty mebli, a jedzenie i miseczkę z woda kładź zawsze w tym samym miejscu. Wkrótce uszak będzie przemierzał pewnie pokój, odnajdywał swoją klatkę i wskakiwał na łóżko oczekując pieszczot."));

			diseaseService.create(new Disease(2L, "Usunięcie oka",
					"Wiadomość, że konieczna jest operacja oka ścina z nóg. Nie jest łatwo podjąć taka decyzję, ale w wielu przypadkach uratuje ona życie królikowi i pozbawi go na zawsze bólu. Królik szybko wraca do zdrowia i przyzwyczaja się do braku oka, ucho po operowanej stronie stoi prawie zawsze na baczność i wychwytuje każdy dźwięk, włosy czuciowe pomagają w orientacji.</br>"
							+ "</br>" + "Główne przyczyny amputacji:</br>"
							+ "- mocno przerośnięte korzenie zębów, ropa w oczodole,</br>" + "- guz za gałka oczną</br>"
							+ "- jaskra</br>" + "- uszkodzenie oka</br>" + "</br>"
							+ "Powinniśmy dostać uszaka już wybudzonego, królik musi brać antybiotyk i środek przeciwbólowy, większość królików nosi kołnierz (zależy od lecznicy)\\ zapobiega rozdrapaniu rany. Uszak powinien jak najszybciej zacząć jeść żeby pobudzić układ pokarmowy do pracy. Większość królików nie ma po narkozie apetytu, dlatego powinniśmy zwierzaczka dokarmiać. Królik w kołnierzu będzie miał problemy z myciem, trzeba mu w tym pomoc, często kontrolować sierść i przemywać ubrudzone miejsca przegotowana woda. Po około 10 dniach zostanie zdjęty szef i kołnierz a po dwóch miesiącach rana będzie ładnie porośnięta sierścią."));

			diseaseService.create(new Disease(2L, "Uszkodzenie oka",
					"Moje króle dwukrotnie miały uszkodzone oko, winowajcami były koty. Szczęście w nieszczęściu, zadrapania nie były poważne (o ile można tak powiedzieć) i szybko się zagoiły.</br>"
							+ "</br>" + "Objawy:</br>" + "- zaczerwieniona lub spuchnięta powieka</br>"
							+ "- mrużenie oka</br>" + "- mokra sklejona sierść pod okiem</br>" + "- ropa w kąciku</br>"
							+ "</br>"
							+ "Królika musimy jak najszybciej pokazać lekarzowi. Lekarz zbada dokładnie oko, wpuści specjalne krople, które zabarwią ewentualne skaleczenie na seledynowy kolor. Powinien też zajrzeć do pyszczka i sprawdzić zęby bo one też mogą być przyczyną spuchniętego i zaropiałego oka. Jeśli w oku znajduje się ciało obce weterynarz usunie je pęsetą lub przepłukując oko roztworem soli fizjologicznej. W zależności od stopnia skaleczenia, królik może dostać maść lub krople o działaniu przeciwzapalnym, antybiotyk i (lub) maść na odbudowę rogówki.</br>"
							+ "</br>"
							+ "Wydzielina, która brudzi futerko i skleja oko jest dosyć agresywna, może doprowadzić do odparzeń i wypadania sierści dlatego trzeba ją regularnie usuwać za pomocą wacika namoczonego w wodzie, czarnej herbacie, świetlika lub roztworze soli fizjologicznej. Nie używamy do tego celu rumianku działa rozmiękczająco na rogówkę oka, podrażnia chore oko, rumianek bardziej może zaszkodzić niż pomoc."));

			diseaseService.create(new Disease(2L, "Zatkany kanalik łzowy",
					"Łzy rozprowadzane są przez ruchy powiek, chronią oko przed uszkodzeniem, infekcjami i wysychaniem. Łzy spływają do punktu łzowego, który jest połączony kanalikiem łzowym z woreczkiem łzowym, a ten z jama nosową.</br>"
							+ "</br>" + "Objawy zatkania woreczka:</br>" + "- Zaczerwieniona i bolesna powieka</br>"
							+ "- ropa w kąciku oka</br>" + "- ropny katar</br>" + "- sklejone futerko pod okiem</br>"
							+ "</br>"
							+ "Zatkanie może być spowodowane zakażeniem bakteryjnym, najczęściej jednak powodem są przerośnięte korzenie zębów. Korzenie uciskają na przewód nosowo-łzowy utrudniając przepływ łez. Lekarz może udrożnić kanalik wykonując pod narkozą płukanie przewodu nosowo-łzowego roztworem fizjologicznym. Konieczne może być podanie antybiotyku. Jeśli to przerośnięte korzenie zębów są powodem zatkania woreczka prawdopodobnie trzeba będzie niektóre zęby usunąć."));

			diseaseService.create(new Disease(2L, "Zapalenie spojówki",
					"Może być spowodowane przeciągiem, podrażnieniem oka trocinami, zakurzonym sianem, alergią lub bakteriami - najczęściej : Staphylococcus aureus, Streptococcus,  Pseudomonas lub Pasteurella.</br>"
							+ "</br>" + "Objawy:</br>" + "- Czerwona, spuchnięta powieka</br>"
							+ "- posklejana ropą powieka</br>" + "- łzawienie</br>" + " </br>"
							+ "Może być chore tylko jedno oko. Jak najszybciej trzeba iść z uszakiem do weterynarza. Lekarz obejrzy dokładnie oko, czy nie jest skaleczone, nie ma ciała obcego, czy zęby nie są przerośnięte. Przepisze antybiotyk. Sklejone oko przemywamy czystą przegotowaną wodą, czarną herbatą lub świetlikiem, nigdy rumiankiem, może on doprowadzić do poważnych komplikacji. Antybiotyk należy podawać/wkraplać tyle dni ile zaleci lekarz, nie krócej, inaczej infekcja może nawracać, a bakterie rozwiną odporność na dany antybiotyk. Jeśli królik do tej pory miał w klatce trociny warto je zamienić na granulat drzewny i wsypać do kuwety, a na resztę podłogi w klatce położyć dywanik, kocyk, bądź gazetę."));

			diseaseService.create(new Disease(3L, "Zapalenie uszu", "Chore ucho zewnętrzne, objawy:</br>"
					+ "- drapanie uszu</br>" + "- potrząsanie głową</br>" + "- przekrzywiona głowa</br>" + "</br>"
					+ "Najczęściej zapalenie wywołane jest przez pasożyty, grzyby, bakterie lub ciało obce.</br>"
					+ "</br>" + "Zapalenie ucha środkowego, objawy:</br>"
					+ "- potrząsanie głowa, trzepotanie uszami</br>" + "- przekrzywiona głowa</br>" + "- ból ucha</br>"
					+ "- brak apetytu,</br>" + "- wybieranie miękkiego pokarmu</br>" + "- osowiałość</br>" + "</br>"
					+ "Konieczne jest podanie antybiotyku. Jeśli doszło do pęknięcia błony bębenkowej lekarz może wykonać przepłukanie ucha roztworem soli fizjologicznej.</br>"
					+ "</br>" + "Zapalenie ucha wewnętrznego objawy:</br>" + "- przekrzywiona głowa,</br>"
					+ "- problemy z utrzymaniem równowagi</br>" + "- oczopląs</br>" + "- brak apetytu</br>" + "</br>"
					+ "Uwaga: te objawy mogą też  wskazywać na E.cuniculi, te dwie choroby są często ze sobą mylone. </br>"
					+ "</br>"
					+ "Zapalenie ucha wewnętrznego zwykle jest powikłaniem po zapalenia ucha środkowego. Leczenie jest długotrwałe, trwa od 2 do 6 tygodni. Podczas leczenia stosuje się antybiotyki najczęściej penicylinę lub chloramfenikol. Przed podaniem antybiotyków powinno się zrobić posiew aby ustalić na jaki antybiotyk dana bakteria najlepiej zareaguje. Jeśli królik nie ma apetytu należy go dokarmiać i dopajać."));

			diseaseService.create(new Disease(3L, "Świerzb uszny",
					"Jest to dosyć częsta choroba pasożytnicza, wywołana przez roztocze najczęściej z rodzaju Psoroptes cuniculi, rzadziej Chorioptes cuniculi (żywi się łupieżem). Roztocze zagnieżdża się w uchu i żywi się wydzielina, płynem tkankowym i krwią. Pojedynczy osobnik żyje przeciętnie 40 dni, samica składa około 100 jaj, już po 9-11 dniach następne pokolenie jest gotowe do rozrodu.</br>"
							+ "</br>" + "Objawy:</br>"
							+ "Łupież i egzema, potrząsanie uszami, silny świąd, przekrzywiona głowa, zabrudzone brązowo-czarną wydzieliną ucho w środku. Przy silnym zakażeniu objęte może być ucho po zewnętrznej stronie, głowa, szyja i barki. Uszak może mieć także zapalenie ucha wewnętrznego. Żeby dokładnie określić pasożyta lekarz powinien pobrać zeskrobinę i obejrzeć ją pod mikroskopem. Najczęściej stosuje się Ivermektyne w zastrzykach lub płyn do smarowania uszu Biodylon. Świerzb w temp. 22-25°C potrafi przeżyć w ściółce około 10 dni, dlatego bardzo ważna jest wymiana siana, żwirku, dokładne umycie klatki najlepiej gorącą wodą z octem, musimy umyć też wszystkie miseczki i zabawki. Tą chorobą mogą się zarazić inne zwierzęta domowe np. pies, kot, świnka, koszatniczka itd., rzadko człowiek."));

			diseaseService.create(new Disease(3L, "Królik niesłyszący",
					"W naturze nie miałby większych szans na przeżycie. Nie usłyszałby krzyku jastrzębia, kroków skradającego się lisa czy ostrzegającego tupania swojego kolegi. W mieszkaniu królik jest bezpieczny, to my czuwamy nad jego bezpieczeństwem, także napotkanie drapieżnego zwierzęcia jest prawie niemożliwe.</br>"
							+ "</br>"
							+ "Jak sprawdzić czy królik nie słyszy? Wystarczy klasnąć w ręce, zagrzechotać granulatem, gwizdnąć - czy zareagował, zastrzygł uszami, odwrócił się?</br>"
							+ "</br>"
							+ "Królik niesłyszący jest takim samym królikiem jak słyszący, brak słuchu nie upośledza go, czuje drgania podłogi kiedy podchodzimy, widzi nas i czuje zapach. Jest o wiele bardziej zrelaksowany, niepokojące odgłosy nie robią na nim żadnego wrażenia. Można futrzaka nauczyć żeby przychodził na dany znak np. wyciągnięcie ręki. Przy pomocy smakołyku można prawie wszystko osiągnąć, a radość z nauki jest wielka i dla królika bo poświęcamy mu czas i dla nas, bo szybko widać efekty nauki.</br>"
							+ "</br>"
							+ "Pamiętajmy, żeby nie zachodzić królika od tylu, najpierw tupnijmy kilka razy lub stawiajmy silniejsze kroki żeby zwrócić uwagę królika, poczuje drgania podłogi. Jeśli nagle podejdziemy od tylu królik może wpaść w panikę. Dla niesłyszącego uszaka bardzo ważny jest partner, obserwując go królik pewniej się czuje, może w pełni zdać się na swojego partnera. Króliki między sobą posługują się przeważnie mową ciała, jeśli uszy towarzysza są postawione to znak dla niesłyszącego królika, że trzeba uważać, coś jest nie tak, jeśli niesłyszący królik widzi biały spód ogonka swego partnera jest to znak \"w nogi niebezpieczeństwo\". Nie trzeba się obawiać, że królik może nie usłyszeć ostrzegawczego warknięcia kolegi, jednocześnie kolega pokazuje swoją postawą i układem uszu, że nie ma ochoty teraz na towarzystwo czy, że należy mu się pierwszeństwo. Partner to duża pomoc dla królika niesłyszącego, jest zawsze przy nim, wspiera go, pielęgnuje i słucha za dwóch :)"));

			diseaseService.create(new Disease(4L, "Piaseki kamienie w drogach moczowych",
					"Choroba ta występuje u królików niezależnie od rasy i wieku. Samce ze względu na budowę cewki moczowej chorują częściej niż samiczki. W zagęszczonym moczu tworzą się kryształy, z kryształków powstają kamienie, które mają rożny kształt i formę. Na te drobniejsze, ale występujące w dużej ilości mówi się potocznie piasek. Kamienie drażnią nerki i pęcherz, ocierają i kaleczą śluzówkę. Mogą utkwić w moczowodach lub w cewce moczowej.</br>"
							+ "</br>" + "Przyczyny powstawania kamieni:</br>" + "- zakażenie bakteryjne,</br>"
							+ "- choroba nerek utrudniająca wydalanie wapnia,</br>"
							+ "- polipy lub torbiele w pęcherzu,</br>"
							+ "- tusza i problemy ze stawami zniechęcająca uszaka do wizyt w kuwecie,</br>"
							+ "- zmiana ph moczu (prawidłowe 7,6- 8,8),</br>"
							+ "- niewystarczająca ilość wypijanej wody np. przez zepsute poidełko,</br>"
							+ "- niechęć do poidełka, zabrudzona miseczka itd.</br>"
							+ "- niechęć do toalety np. zabrudzona, stoi w złym miejscu,</br>"
							+ "- dieta bogata w wapń,</br>" + "- zbyt mało witaminy B w diecie królika.</br>" + "</br>"
							+ "Objawy:</br>"
							+ "Zmniejszony apetyt lub brak apetytu, obojętność, uszak często chodził do toalety lub kuwety teraz siusia obok, ma trudności z oddawaniem moczu, mocz może być bardzo gesty i skleja sierść, czasami można zauważyć krew w moczu. Diagnozę stawia się na podstawie badań moczu, badań krwi, USG i RTG. Piasek można wypłukać roztworem soli fizjologicznej. Zabieg odbywa się pod narkoza, do dróg moczowych wprowadza się katete i kilkakrotnie przepłukuje. Duże kamienie usuwa się operacyjnie.</br>"
							+ "</br>" + "Jak zapobiec nawrotom:</br>"
							+ "Przede wszystkim królik musi mięć dostęp do czystej wody, polecam miseczkę, króliki chętniej z niej korzystają niż z poidełek przy których muszą się trochę napracować. Suszone zioła i warzywa zastąpmy świeżymi, ograniczmy granulat, który zawiera więcej minerałów niż królik potrzebuje, lucernę. Polecane zioła to mniszek (cala roślina wraz z korzeniami), suszona pokrzywa, liście brzozowe (świeże i suszone), krwawnik i babka lancetowata, do picia oprócz wody rumianek.</br>"
							+ " </br>" + "Uwaga:</br>"
							+ "Krew w moczu u samiczek może być związana z choroba dróg rodnych."));

			diseaseService.create(new Disease(4L, "Zapalenie nerek",
					"Może być powikłaniem zapalenia pęcherza. Występuje też razem z E.cuniculi, może być też wynikiem zatrucia.</br>"
							+ "</br>" + "Objawy:</br>"
							+ "Utrata wagi, apatia, częste siusianie, leżenie w dziwnej pozycji, ból, brzydka matowa sierść, wzmożone pragnienie.</br>"
							+ " </br>" + "Diagnoza:</br>"
							+ "Przede wszystkim należy zrobić badanie moczu, krwi, RTG lub USG. Leczenie stosuje się po ustaleniu przyczyny zapalenia nerek, jeśli jest ono spowodowane bakteriami, królik dostanie antybiotyk, jeśli np. pierwotniakiem E.cuniculi leczenie będzie przebiegać pod tym kątem.</br>"
							+ "</br>" + "Co wspomaga leczenie:</br>"
							+ "Królik powinien dużo pić, dlatego pamiętajmy o świeżej wodzie o jak najmniejszej zawartości wapnia.</br>"
							+ "</br>"
							+ "Przyjazne zioła to: mniszek lekarski cała roślina, brzoza, suszona pokrzywa i herbatka z niej, melisa, bazylia, kolendra, pietruszka.</br>"
							+ ""));

			diseaseService.create(new Disease(4L, "Zapalenie pęcherza",
					"Najczęściej spowodowane jest zakażeniem bakteryjnym, piaskiem lub kamieniami w pęcherzu.</br>"
							+ "</br>" + "Objawy:</br>" + "- brak apetytu,</br>"
							+ "- mocne napinanie się przy sikaniu,</br>" + "- cedzenie moczu,</br>"
							+ "- wielokrotne wskakiwanie i wyskakiwanie z kuwety,</br>"
							+ "- częste wizyty w kuwecie,</br>" + "- sikanie po kropelce,</br>"
							+ "- długie przesiadywanie w kuwecie (co wcześniej nie było w zwyczaju królika)</br>"
							+ "- zmiana nawyków toaletowych- sikanie obok toalety lub w zupełnie innym miejscu,</br>"
							+ "- piaskowy (białawy, gęsty) mocz,</br>"
							+ "- zmniejszenie ilości moczu lub brak moczu,</br>" + "- krew w moczu,</br>"
							+ "- brudne posklejane futerko w okolicach ogonka.</br>" + "</br>"
							+ "Diagnozę stawia się na podstawie badań moczu, badań krwi, USG i RTG. O leczeniu zadecyduje lekarz, jeśli królik dostanie antybiotyk nie zapomnijmy o podaniu probiotyku np. Lakcid, jedna kapsułkę dziennie.</br>"
							+ "</br>"
							+ "Pamiętajmy, że królik musi mieć dostęp do czystej wody, polecam miseczkę, króliki chętniej z niej korzystają niż z poidełek przy których muszą się trochę napracować. Suszone zioła i warzywa zastąpmy świeżymi, ograniczmy granulat, który zawiera więcej minerałów niż królik potrzebuje i lucernę, lucerna wiąże wapń. Polecane zioła to mniszek (cała roślina wraz z korzeniami), suszona pokrzywa, liście brzozowe (świeże i suszone), krwawnik i babka lancetowata, do picia oprócz wody rumianek."));

			diseaseService.create(new Disease(5L, "Katar",
					"Kichanie nie musi być od razu spowodowane chorobą. Przyczyną częstego kichania mogą być trociny - bardzo pylą i drążnia układ oddechowy królika, zakurzone siano u mojej Lilly wywołuje serie kichnięć, przeciąg i alergie mogą być też powodem kichania. Dbanie o higienę klatki, zmiana trocin na mało pylący żwirek, przeniesienie klatki w zaciszne miejsce, częste wietrzenie pomieszczenia (bez przeciągów) może całkowicie wykluczyć kichanie.</br>"
							+ "</br>"
							+ "Jeśli nic nie pomaga, królik nadal kicha, ma mokry nosek należy udać się jak najszybciej do weterynarza. Wymaz z nosa pomoże ustalić bakterie i dobrać antybiotyk. Najgorszy nie jest sam katar, ale obniżona odporność, a tym samym podatność uszaka na inne choroby. Najlepszym zapobieganiem chorobie jest szczepionka, szczególnie jeśli królik ma styczność z innymi królikami. Króliczy katar jest bardzo zaraźliwy, króliki, które same nie wykazują żadnych objawów kataru mogą być nosicielami tej choroby. Króliczy katar wywoływany jest najczęściej przez bakterie Pasteurella multocida lub Bordetella bronchseptica. Z założenia powinna pomóc zwykła kuracja antybiotykowa, ale niestety tak się nie dzieje. Przyczyną tego jest umiejscowienie bakterii w zatokach przynosowych, lokalne antybiotyki nie są w stanie ich zwalczyć.</br>"
							+ "</br>"
							+ "Jeśli jednak usłyszymy diagnozę króliczy katar, lekarz przepisze nam antybiotyk. Będzie on stosowany 5-7 dni. Dawka jest zależna od wagi królika. Ważne żeby nie przerywać kuracji, grozi to uodpornieniem się bakterii na dany antybiotyk i nawrotem infekcji. Podczas kuracji należy podawać probiotyk np. Lakcid, jedna kapsułkę dziennie o ile lekarz nie zaleci inaczej. Antybiotyk wyjaławia florę bakteryjna jelit, zdrowe bakterie są zabijane, mogą pojawić się problemy z trawieniem dlatego bardzo ważne jest podawanie probiotyku. Bardzo dobre wyniki daje leczenie Interferonem, jest to lek stosowany głównie u ludzi, kotów i psów, mało znany w leczeniu królików."));

			diseaseService.create(new Disease(5L, "Przeziębienie", "Objawy:</br>"
					+ "Kichanie, częste mycie pyszczka, katar, brak apetytu, załzawione oczka. Konieczna jest szybka wizyta u weterynarza. Bakterie, które mogą wywołać przeziębienie to p. pneumotropica, Streptokoki, Sendai wirus, Pasteurella, Bordetella, Staphylokokki. Te bakterie mogą być w organizmie zdrowego królika nie wywołując choroby.</br>"
					+ "</br>" + "Do zachorowania może dojść w wyniku:</br>" + "- stresu,</br>"
					+ "- braku higieny w otoczeniu uszaka lub sterylnych warunkach gdzie królik nie ma szans rozwinąć odporności,</br>"
					+ "- w klatce z plastikowa góra, tworzy się sprzyjający mikroklimat dla wszelkiego rodzaju zarazków.</br>"
					+ "- przeciąg lub suche powietrze może być przyczyna choroby</br>"
					+ "- monotonne pożywienie nie dostarczające dostatecznej dawki witamin i minerałów,</br>" + " </br>"
					+ "Królik może się też zarazić od swojego opiekuna jeśli ten jest przeziębiony bądź przechodzi właśnie anginę czy inna chorobę wywołaną przez streptokoki. Leczenie wg zaleceń lekarza.</br>"
					+ "</br>" + "Jak możemy dopomóc:</br>"
					+ "Dobrze zrobią futrzakowi inhalacje z rumianku lub majeranku z dodatkiem np. soli morskiej.</br>"
					+ "</br>" + "Inhalacja z tymianku:</br>"
					+ "Łyżeczkę tymianku i łyżeczkę rumianku wrzucić do zimnej wody, zagotować. Odstawić z ognia dodać pół łyżeczki sody (uwaga ucieka z garnka). Postawić obok klatki na około 10 min, klatkę i garnek przykryć kocem. Trzeba później dobrze wytrzeć uszaka ręcznikiem, bo para osiada też na sierści i uszak może się przeziębić lub będzie mu zimno. Nie polecam olejków do inhalacji, ponieważ mogą one podrażnić układ oddechowy królika, niektóre króliki mają też alergie na olejki eteryczne. Należy włączyć do diety królika zioła: bazylie, mięte, rumianek, koperek, tymianek - poprawiają trawienie, uspakajają, działają rozkurczowo i przeciwzapalnie. Lampka podczerwona ogrzeje uszaka, ale strumień światła powinien być tylko w jednej części klatki, żeby królik mógł wybrać czy chce leżeć w cieple czy nie. Można też termofor z ciepłą wodą  zapakować w ręcznik lub kocyk i włożyć do klatki. Jeśli uszak dostanie antybiotyk nie zapomnijmy o podawaniu probiotyku np. Lakcid, kapsułka dziennie."));

			diseaseService.create(new Disease(5L, "Zaktuszenie i zadławienie", "Objawy: </br>"
					+ "- wytrzeszcz oczu</br>" + "- trudności ze złapaniem oddechu</br>" + "- sztywność ciała</br>"
					+ "- nerwowe poruszanie się, bieganie</br>" + "- odruch wymiotny</br>"
					+ "- śluz z nosa i z pyszczka (ślinienie)</br>" + "- odruch przesadnego gryzienia/przeżuwania</br>"
					+ "</br>"
					+ "Od naszej reakcji i natychmiastowej pomocy zależy życie zwierzaka. Zachowajmy spokój, królik nie będzie się bronił bo wie, że chcemy mu pomóc. Należy ustawić się do królika tak, żeby jego głowa była przodem do nas. Chwytamy lewą ręka pod brzuszek, prawą sobie pomagamy i układamy królika głową do dołu, plecami przywiera do naszego brzucha. Rozciągamy przednie łapy królika - jeśli sam tego nie zrobił, to ważne, brzuszek musi być napięty i elastyczny jak trampolina. Teraz prawą ręka szukamy miejsca gdzie kończy się brzuch a zaczynają żeberka - taki trójkąt - splot słoneczny. Teraz naciskamy znalezione miejsce palcem wskazującym i środkowym od 1-3 razy, ale nie tylko do środka także trochę w kierunku głowy. Najczęściej zadławiony królik zaczyna przeżuwać, to znak, że jedzenie zostało wypchnięte i znajduje się teraz w pyszczku. Jeśli zwierzak normalnie oddycha, przeżuwa, najgorsze mamy za sobą. Musimy teraz zabrać królika do weterynarza, ponieważ istnieje niebezpieczeństwo zachłystowego zapalenia płuc, może ono skończyć się śmiercią uszaka. Jeśli ktoś ma krople Bacha - remedy rescue w domu może wetrzeć po dwie krople w uszy królika. Krople działają uspokajająco, królik przeżył okropny stres, paniczny strach. Najczęściej przyczyna zachłyśnięcia są małe twarde rzeczy np. granulat, suszone owoce i warzywa. Dobrze przećwiczyć jest taka pierwsza pomoc na pluszaku lub balonie, żeby w opisanej sytuacji wiedzcie już co trzeba zrobić, ponieważ liczy się każda sekunda."));

			diseaseService.create(new Disease(5L, "Zapalenie płuc", "Objawy:</br>"
					+ "Chudnięcie, brak apetytu, chrapliwy oddech, trudności z oddychaniem, katar, nieprzyjemny zapach z pyszczka, apatia. Konieczna jest wizyta u weterynarza, to bardzo poważna choroba i rokowania są ostrożne. Królik dostanie antybiotyk i prawdopodobnie lek na rozrzedzenie wydzieliny w płucach. Pamiętajmy o podaniu probiotyku np. Lakcid - jedna kapsułka dziennie, pomocny dla utrzymania</br>"
					+ "prawidłowego składu mikroflory jelitowej. Królik powinien być trzymany w cieple. Możemy do klatki włożyć ciepły zawinięty w koc termofor lub część klatki naświetlać lampa podczerwona. Pomocne w leczeniu są inhalacje.</br>"
					+ "</br>" + "Na zimno:</br>"
					+ "Skropić ręcznik lub dywanik kropelkami dla niemowląt Babix i położyć w klatce królika.</br>"
					+ "</br>" + "Na ciepło:</br>"
					+ "Łyżeczkę tymianku i łyżeczkę rumianku wrzucić do zimnej wody, zagotować. Odstawić z ognia dodać pół łyżeczki sody (uwaga ucieka z garnka). Postawić obok klatki na około 10 min, klatkę i garnek przykryć kocem.</br>"
					+ "</br>" + "Inny przepis:</br>"
					+ "Do wrzątku dodać 2 łyżki soli iwonickiej i kilka kropel Inhalol, postawić obok klatki jw. Trzeba później dobrze wytrzeć uszaka ręcznikiem, bo para osiada też na sierści i uszak może się przeziębić lub będzie mu zimno. Jeśli królik nie ma apetytu i odmawia jedzenia należy go dokarmiać. Więcej na ten temat w poddziale \"Dokarmianie\"."));

			diseaseService.create(new Disease(6L, "Bezoary - kule włosowe",
					"Króliki są wielkimi czyściochami, tak jak koty i tak samo jak u kotów w żołądku mogą się zbierać połknięte włosy. W przeciwieństwie do mruczków króliki nie umieją zwymiotować nagromadzonej sierści. Kula włosowa składa się nie tylko ze sfilcowanych, zbitych włosów, ale także z resztek jedzenia. To wszystko blokuje i wypełnia żołądek.</br>"
							+ "</br>" + "Objawy:</br>" + "- połączone włosami bobki (koraliki)</br>"
							+ "- nienaturalnie duże lub coraz mniejsze bobki</br>" + "- brak apetytu</br>"
							+ "- apatia</br>" + "</br>"
							+ "Potrzebna jest natychmiastowa pomoc lekarza. Na zdjęciu RTG będzie można dobrze zobaczyć bezoar. Jeśli kula jest duża pomoc może jedynie natychmiastowa operacja.</br>"
							+ "</br>"
							+ "Zapobieganie to przede wszystkim wysoko włóknista i bogata w błonnik dieta: siano, gałązki, zielenina.</br>"
							+ "- Codzienne wyczesywanie uszaka w okresie linienia.</br>" + "- Dużo ruchu</br>"
							+ "- 2 razy w tygodniu pasta na odkłaczanie - 1 cm, niektóre króliki mają lekkie rozwolnienie po paście, jeśli się pojawi, proszę więcej nie podawać.</br>"
							+ "- zamiast pasty można dwa razy w tygodniu podać kiwi po pół owocu lub codziennie plasterek, lub świeży sok z ananasa, łyżkę dziennie. Resztę soku można zamrozić w pojemniczkach do lodu i później wykorzystać. Kiwi zawiera enzym aktynidyna, ananas bromeline, enzymy te rozkładają białko w przypadku włosa zmiękczają go co znacznie pomaga w wydaleniu.</br>"
							+ "</br>"
							+ "Królikom, które często się \"zatykają\" lub widać już połączone bobki można podać 1 krople oleju lnianego, słonecznikowego lub rzepakowego np. na kawałeczku cykorii lub na jabłku.</br>"
							+ "</br>"
							+ "Gdyby tak się stało, że jest podejrzenie zatkaniem kulą włosową, a w żaden sposób nie można dostać się do weterynarza - koniecznie proszę nawadniać zwierzaka. Może to być woda po rozgotowanym siemieniu lnianym, herbatka koperkowa, sok z ananasa. Królik musi pić. Co trzy -cztery godz. podajemy 1 ml oleju parafinowego, słonecznikowego, lnianego lub innego, aż do czasu skontaktowania się z lekarzem.</br>"
							+ ""));

			diseaseService.create(new Disease(6L, "Nieżyt żołądka i jelit",
					"Powstaje w wyniku zaburzenia równowagi flory bakteryjnej w przewodzie pokarmowym królika. W układzie pokarmowym królika mieszkają bakterie, które są bardzo wrażliwe na jakiekolwiek zmiany np. przechodzenie z mleka mamy na pokarmy stale, z pokarmów zimowych na zieleninę, zmiana z mieszanki na granulat. Zaburzenia w równowadze bakterii mogą być też spowodowane podawaniem zbyt dużo skrobi w diecie, warzyw wzdymających, zaparzonej trawy, niedosuszonego siana, zimnego lub mokrego jedzenia itd.</br>"
							+ "</br>" + "Objawy:</br>" + "- biegunka często ze śluzem i pasemkami krwi</br>"
							+ "- ból brzucha</br>" + "- apatia i brak apetytu</br>"
							+ "- zaniedbana, nastroszona sierść</br>" + "</br>"
							+ "Szczególnie dla maluchów ta choroba jest niebezpieczna, jeśli zauważymy któryś z powyższych objawów u kilku-tygodniowego maluszka, natychmiast trzeba go zabrać do weterynarza. Śmiertelność jest bardzo duża niestety, króliki są za wcześnie zabierane od mamy, ich układ pokarmowy nie jest jeszcze na tyle dojrzały żeby przeżyć bez mleka i cekotrofow  królicy, także szybkie zmiany w żywieniu i stres są przyczyna choroby .</br>"
							+ " </br>"
							+ "Starsze króliki chorują głównie przez nasze błędy w żywieniu. Pamiętajmy aby na wiosnę powoli przyzwyczajać królika do zieleniny, nie częstujmy uszaka ziemniakami i ciasteczkami, dokładnie sprawdzajmy czy siano nie jest spleśniałe, jeśli zmieniamy granulat róbmy to powoli, stopniowo mieszając stary pokarm z nowym. Chory królik powinien zostać pokazany lekarzowi. Dobrze jest zebrać bobki i dać do zbadania na obecność kokcydów lub innych pasożytów. Weterynarz zadecyduje o dalszym leczeniu.</br>"
							+ "</br>"
							+ "Wspomagająco można podać kleik z siemienia lnianego, herbatkę rumiankowa, nagietkowa lub miętowa. Jeśli królik odmawia jedzenia należy go dokarmiać (patrz. Dokarmianie.) Można podać uszakowi Lakcid, przywróci florę bakteryjna w przewodzie pokarmowym lub lek o nazwie Perenterol - zawiera drożdże, które wspomogą  przewód pokarmowy i nie dopuszczą do rozmnażania się szkodliwych bakterii. Kapsułkę należy dodać do wody pitnej. Suszone jagody pomogą zahamować biegunkę. Można również podać herbatkę z suszonych jagód, która jest do kupienia w aptece. Ona również pomoże w zahamowaniu biegunki."));

			diseaseService.create(new Disease(6L, "Rozwolnienie",
					"Może mieć rożne przyczyny. Jedną z nich jest nagła zmiana żywienia. Szczególnie młode króliki muszą być przyzwyczajane powoli do nowego pożywienia. Inne przyczyny to błędy żywieniowe, zatrucie np. spryskiwanymi owocami, zjedzonym plastikiem lub szkodliwą roślinnością, choroby zębów, pasożyty, wirusy, bakterie chorobotwórcze: E coli, Salmonella, Yersinia .</br>"
							+ "</br>" + "Objawy:</br>" + "- wodnista kupa o nieprzyjemnym zapachu,</br>"
							+ "- brudna, oblepiona pupa</br>" + "- apatia</br>" + "- brak apetytu</br>"
							+ "- chudniecie</br>" + "</br>"
							+ "Należy jak najszybciej udać się do weterynarza. Proszę zebrać próbkę kału do zbadania na obecność pasożytów, drożdży i bakterii. Jeśli w próbce zostaną stwierdzone bakterie uszak otrzyma antybiotyk. Brudną pupę myjemy w ciepłej wodzie, można bardzo posklejane kłaczki obciąć nożyczkami. Do jedzenia sianko, suszone zioła, odrobinę trawy, kilka listków mniszka lekarskiego lub koperku . Do picia wodę, herbatkę koperkową, nagietkowa i rumiankową z dodatkiem glukozy (1/4 łyżeczki dziennie). Aby zachęcić uszaka do jedzenia można zetrzeć jabłko i zmieszać</br>"
							+ "z tarta marchewka. Taka dieta powinna trwać około 7 dni, o ile lekarz nie zaleci inaczej. Żeby odbudować florę bakteryjną podajemy królikowi Lakcid, kapsułkę dziennie lub Perenterol. Suszone czarne jagody pomogą zahamować biegunkę, podobnie jak herbatka z suszonych jagód. Pomocne są też gałązki wierzbowe i dębowe. Po każdym kontakcie z chorym zwierzątkiem myjemy dokładnie ręce."));

			diseaseService.create(new Disease(6L, "Wzdęcia", "Są spowodowane przeważnie przez:</br>"
					+ "- zjedzenie mokrego, zimnego lub zaparzonego pokarmu (zielenina, ciepła trawa),</br>"
					+ "- warzywami i roślinami wzdymającymi np. kapusta, por, koniczyna.</br>"
					+ "- w wyniku innych chorób np. przerostem zębów</br>"
					+ "- w wyniku zatrucia np. nieumytymi spryskanymi owocami</br>" + "- nadwagą i brakiem ruchu</br>"
					+ "- bakteriami chorobotwórczymi np. e.koli lub pasożytami np. kokcydami</br>" + "</br>"
					+ "Objawy:</br>" + "- królik ma wzdęty, mocno napięty i bolesny brzuszek</br>"
					+ "- brak apetytu</br>" + "- apatia</br>" + "- brzydka, nastroszona sierść</br>"
					+ "Przy silnym wzdęciu mogą wystąpić trudności z oddychaniem, szybkie oddychanie, tupanie z bólu tylnymi skokami, wytrzeszcz oczu.</br>"
					+ "</br>"
					+ "Musimy natychmiast udać się z królikiem do weterynarza, wzdęcia są bardzo niebezpiecznie i w przeciągu kilku godzin mogą się skończyć śmiercią. Królik dostanie środek przeciwbólowy i rozluźniający, także coś na pozbycie się gazów np. Espumisan i prawdopodobnie kroplówkę, aby ustabilizować układ krążenia.</br>"
					+ "</br>" + "Co możemy zrobić sami: </br>"
					+ "Zieleninę, warzywa i granulat należy usunąć z klatki, zostawiamy tylko siano i suszone zioła: mięta, koperek, melisa, rumianek i krwawnik. Zalecane herbatki to koperkowa, kminkowa i miętowa. Pomóc może delikatny masaż brzuszka, ale ma to być bardziej głaskanie niż naciskanie! Dopóki królik ma wzdęcia powinien jeść tylko siano i suszone zioła. Zniszczoną florę bakteryjną należy odbudować podając Lakcid - kapsułkę dziennie. Po zakończeniu choroby musimy ponownie przyzwyczaić królika do jedzenia zielonego i warzyw, robimy to stopniowo, dosłownie po listeczku</br>"
					+ "i obserwujemy reakcje układu pokarmowego. Jeśli nic się nie dzieje, codziennie zwiększamy ilość zieleniny.</br>"
					+ "</br>"
					+ "UWAGA!!! - jeśli wystąpi sytuacja iż chwilowo nie mamy możliwości kontaktu z weterynarzem możemy łagodzić sytuacje podając dwa razy dziennie pół kapsułki espumisanu. Bardzo łatwo i bez boleśnie można go podać wyciskając połowę żelu z kapsułki na liść mleczu czy innego suszu. Kicek na pewno da się skusić."));

			diseaseService.create(new Disease(6L, "Zaparcia",
					"Mogą być spowodowane połkniętymi włosami, przekarmianiem królika ciężkostrawnymi pokarmami np. chlebem, czy mieszankami o dużej zawartości zboża i cukru, zjedzeniem żwirku drewnianego czy suszonych warzyw, które w żołądku pęcznieją i wypełniają/przepełniają żołądek. Zakażenie drożdżakami, torbiele i wzdęcia mogą też być przyczyna zaparć.</br>"
							+ "</br>" + "</br>" + "Objawy:</br>" + "- Królik ma trudności z oddawaniem bobków,</br>"
							+ "- bobki są bardzo małe lub są połączone ze sobą włosami,</br>"
							+ "- całkowity brak bobków</br>" + "- apatia</br>" + "- brak apetytu</br>" + " </br>"
							+ "Królik powinien być jak najszybciej pokazany weterynarzowi. Zaparcie bez pomocy lekarza często kończy się śmiercią królika. Wskazane jest wykonanie zdjęcia RTG, aby wykryć przyczynę zaparcia. Leczenie wg zaleceń lekarza. W ciężkich przypadkach może być konieczna</br>"
							+ "natychmiastowa operacja. Królik powinien dużo pić, jeśli sam nie ma ochoty powinniśmy go dopajać. Najlepiej nadają się do tego herbatki ziołowe: rumiankowa, miętowa, koperkowa. Olej pomaga w przesuwaniu masy kałowej, można podać 3x dziennie po 1ml oleju parafinowego, lnianego lub spożywczego - wysoko gatunkowego. Można leciutko masować brzuszek królika oraz namawiać go do ruchu. Do jedzenia dajemy siano i suszone zioła. Jeśli uszak nie ma apetytu musimy go dokarmiać. Najlepiej nadaje się do tego utarte jabłko z marchewka, gotowe warzywne słoiczki dla niemowląt, bądź rozmoczony granulat - nie więcej niż 10ml za jednym razem. Do odbudowy flory bakteryjnej stosujemy Lakcid, kapsułkę dziennie, lub po pół kapsułki dwa razy dziennie. Pojawiające się bobki, mogą być na początku miękkie i tłuste (przez podany olej) będą takie jeszcze przez kilka dni. Nie musimy podawać już więcej oleju, ale możemy podać espumisan, aby zapobiec wzdęciom 2x dziennie po pół kapsułki. Możemy powoli powrócić do podawania zieleniny, zacznijmy od koperku, fenkułu, bazylii i mięty- wspomaga trawienie i poprawia apetyt."));

			diseaseService.create(new Disease(6L, "Enterocolitis - Bakteryjne zapalenie jelit",
					"Ta choroba znana jest od 1997 roku, wywołują ja bakterie Clostridia Perfrigens i Escherichia Coli. Cechuje się duża śmiertelnością. Pośród młodych zwierząt śmiertelność wynosi nawet 80%, u dorosłych królików 25%. Być może dlatego, że choroba postępuje bardzo szybko, a zwierzęta padają często przed ukazaniem się pełnych objawów. Clostridia produkuje toksyny, które są przyczyną zatrzymania pracy jelit oraz zmian patologicznych w jelitach i innych organach. E.coli wywołuje wodnistą biegunkę.</br>"
							+ "</br>" + "Objawy:</br>" + "- apatia</br>" + "- brak apetytu</br>"
							+ "- śluzowata lub galaretowata biegunka o zgniłym zapachu</br>"
							+ "- wzdęty, bolesny brzuch</br>" + "- burczenie i przelewanie się w brzuchu</br>"
							+ "- szczekanie/zgrzytanie zębami</br>" + "</br>"
							+ "Do zachorowania może dojść w wyniku:</br>" + "- stresu</br>"
							+ "- odstawienia młodych od matki</br>" + "- infekcji gronkowcami (ropnie)</br>"
							+ "- kataru i obniżenia odporności</br>" + "- zarażenia glistami</br>" + "- kokcydiozy</br>"
							+ "- karmienia pszenica, gluten jest świetną pożywka dla Clostridia</br>"
							+ "- braku higieny (brudne klatki, miski itp.)</br>" + "</br>" + "</br>"
							+ "Jeśli zauważymy któryś z powyższych objawów musimy natychmiast udać się do lekarza weterynarii i koniecznie wziąć próbkę króliczego kału. Na jego podstawie lekarz stwierdzi jakie bakterie są przyczyną choroby. Najczęściej stosowane leki przeciw Closteridia to Pulmotil lub Tiamutin, (nie w połączeniu z lekami na kokcydioze), jeśli w kale znajduje się też E.Coli, trzeba podąć Colistinsulfat .</br>"
							+ "</br>"
							+ "Uwaga, leki podajemy tylko przepisane przez lekarza, sami nie eksperymentujemy!!!</br>"
							+ "</br>"
							+ "Klatkę/zagródkę dokładnie myjemy i odkażamy. Poidełko i miseczki muszą być wyparzane i regularnie myte. Do jedzenia podajemy siano, dużo zieleniny, zioła: babkę lancetowata, oregano, bazylie, mniszek, tasznik itp. gałązki wierzby.</br>"
							+ "</br>"
							+ "W dużych hodowlach sporządza się na podstawie wyodrębnionych z kału chorego zwierzęcia bakterii, indywidualna szczepionkę. Można nią szczepić maluchy w wieku 25-45 dni oraz inne zagrożone króliki."));

			diseaseService.create(new Disease(6L, "Przepełnienie żołądka",
					"Króliki posiadają bardzo skomplikowany i wrażliwy układ pokarmowy. Ich żołądek nie ma prawie muskulatury, więc jedzenie aby przebyć całą drogę musi być popchnięte następną zjedzona porcja. Królik doskonale dba o swój układ pokarmowy pobierając do około 80 małych porcji jedzenia w ciągu doby. Najlepiej, gdy dostarczymy mu jedzenie małokaloryczne i wysoko włókniste, uszak będzie częściej po nie sięgał, a co za tym idzie układ pokarmowy nie przerwie swojej pracy. Mieszanki i granulaty są zbyt kaloryczne, prowadza do dłuższych przerw pomiędzy pobieraniem pokarmu, to może doprowadzić do rożnych powikłań zdrowotnych (przerost zębów, zaparcia, wzdęcia itd.). Króliki nie umieją wymiotować, a więc to wszystko co uszak połknął (włosy, zepsute jedzenie itd.) musi przebyć całą drogę by zostać w końcu wydalonym. Zbyt mała ilość zjedzonego pokarmu, łapczywe jedzenie i połykanie dużych kawałków, brak dostępu do wody, zbyt kaloryczny i pęczniejący pokarm oraz długie przerwy pomiędzy posiłkami utrudniają, wydłużają lub uniemożliwiają transport, powodują zaleganie i fermentowanie treści pokarmowej.</br>"
							+ "</br>" + "Objawy:</br>" + "- odmowa jedzenia,</br>"
							+ "- szczekanie/zgrzytanie zębami</br>" + "- niepokój</br>"
							+ "- częsta zmiana pozycji, raz siedząca raz leżąca,</br>" + "- płytki oddech</br>"
							+ "- zaokrąglony, twardy brzuch</br>"
							+ "Bardzo szybko te symptomy mogą się zaostrzyć i przejść w stan zagrażający życiu królika, mogą wystąpić problemy z oddychaniem i układem krążenia. Przepełnienie żołądka jest zawsze nagłym przypadkiem, należy natychmiast udać się z królikiem do weterynarza.</br>"
							+ "</br>"
							+ "Przed wizyta zadbajmy o ciepło pacjenta dając mu do transporterka owinięty w ręcznik termofor. Weterynarz obmaca chory brzuch, dla potwierdzenia diagnozy powinno być wykonane RTG.</br>"
							+ "</br>"
							+ "Wzdęcie byłoby widoczne jako czarne pole wypełniające żołądek, także zator kula włosowa można</br>"
							+ "odróżnić od przepełnienia. Dla ustabilizowania układu krążenia królik dostanie kroplówkę, koniecznie powinien tez dostać środek przeciwbólowy. Następnie uszak otrzyma lekarstwo poprawiające perylistyke jelit i probiotyk. W domu dokarmiamy królika preparatem Critical Care rozpuszczonym w herbatce koperkowej. Podajemy też probiotyk i wykonujemy masaż kilka razy dziennie, pobudza on żołądek i jelita do pracy i pomaga w wydalaniu. Aby nie dopuścić do kolejnego przepełnienia należy zmienić dietę na wysoko włóknistą, profilaktycznie przebadać kał na obecność pasożytów i skontrolować zęby królika."));

			diseaseService.create(new Disease(7L, "Zapalenie pochwy",
					"Zapalenie często jest wywoływane przez bakterie, wirusy i drożdżaki. Może powstać w wyniku urazu, np. podczas ciężkiego porodu.</br>"
							+ "</br>" + "Objawy:</br>" + "- Częste mycie okolic sromu,</br>"
							+ "- wydzielina z dróg rodnych,</br>" + "- problemy z oddawaniem moczu,</br>" + "</br>"
							+ "Leczenie polega na podaniu antybiotyku. Nie leczone zapalenie może być przyczyna zapalenia macicy.</br>"
							+ "</br>"
							+ "Pomocne zioła to przywrotnik pospolity, tymianek i rumianek. Przywrotnik (Alchemilla vulgaris) można podawać królicy zaraz po porodzie, profilaktycznie, działa przeciwzapalnie, uspakajająco, wspomaga leczenie ran, hamuje krwawienie."));

			diseaseService.create(new Disease(7L, "Zapalenie macicy",
					"Przyczyną zapalenia są duże wahania hormonów progesteronu i estrogenu. Te króliki, które są bardzo pobudzone seksualnie i często przechodzą ciąże urojona są najbardziej narażone na tą chorobę.</br>"
							+ " </br>" + "Objawy:</br>" + "- problemy z trawieniem</br>" + "- bóle brzucha</br>"
							+ "- rozwolnienie</br>" + "- chudniecie</br>" + "- powiększenie obwodu brzucha</br>"
							+ "- mocz z krwią</br>" + "- ropny wyciek z dróg rodnych</br>" + "</br>"
							+ "Diagnozę można postawić na podstawie dokładnego badania, zdjęcia RTG i USG. Badanie krwi pokaże w jakim stanie znajduje się organizm królika. Najlepszym rozwiązaniem jest kastracja królicy czyli usuniecie macicy wraz z jajnikami i jajowodami. Przez kilka dni po kastracji uszak może być nawadniany za pomocą kroplówek, być może lekarz zaleci też podawanie antybiotyku. Należy dwa razy dziennie kontrolować ranę, oraz pilnować żeby królica jadła i pila. W razie gdyby nie miała apetytu musimy ja do pajać i dokarmiać (patrz. Dokarmianie)"));

			diseaseService.create(new Disease(7L, "Zapalenie gruczołów mlecznych",
					"Przyczyną zapalenia może być uderzenie lub przygniecenie sutka, zakłucie ściółką, infekcja bakteryjna lub zastój mleka spowodowany np. zbyt wczesnym odstawieniem młodych lub zatkaniem kanalika mlecznego.</br>"
							+ "</br>" + "Objawy:</br>"
							+ "- Królica nie chce karmić młodych, ucieka od nich na skutek bólu jaki sprawia jej ssanie,</br>"
							+ "- sutki są bolesne, nabrzmiałe i bardzo cieple</br>" + "- gorączka</br>" + "</br>"
							+ "Nieleczone zapalenie może skończyć się sepsą i śmiercią królicy. Lekkie zapalenie leczy się lekkimi masażami sutków, chłodnymi okładami i maściami przeciwzapalnymi. Cięższe z gorączką muszą być leczone antybiotykami. Jeśli w sutku zebrała się ropa prawdopodobnie będzie trzeba ją usunąć pod narkoza.</br>"
							+ "</br>"
							+ "Chora mama nie będzie chciała karmić swoich maleństw dlatego opiekun powinien przejąć jej obowiązki. Jeśli lekarz nie zaleci inaczej małe karmimy co trzy godziny, mlekiem dla kociąt rozpuszczonym w herbatce koperkowej lub rumiankowej. Proporcja 1: 2 czyli jedna łyżka proszku dwie łyżki herbatki. Temperatura mleka to 36-38 stopni, maluszki początkowo piją nie więcej niż 1ml podczas jednego posiłku. Po jedzeniu nie zapomnijmy o masażu brzuszka. Masujemy delikatnie w kierunku odbytu.</br>"
							+ " </br>"
							+ "Zioła które działają zapobiegawczo i są pomocne przy zapaleniu gruczołów mlecznych to Przywrotnik pospolity, suszona pokrzywa, mniszek lekarski, fenkuł."));

			diseaseService.create(new Disease(7L, "Rak narządów płciowych",
					"U samic najczęściej  spotykanym nowotworem jest rak macicy – gruczolakorak. W zaawansowanym stadium daje on przerzuty do płuc, otrzewnej, węzłów chłonnych i wątroby. Ryzyko zachorowania rośnie razem z wiekiem.</br>"
							+ "</br>" + "Objawy:</br>" + "- agresja</br>" + "- chudniecie,</br>"
							+ "- wyciek z pochwy</br>" + "- krew w moczu</br>"
							+ "- bolesność brzucha podczas dotykania</br>" + "</br>"
							+ "Diagnozę lekarz postawi po dokładnym zbadaniu królika, pomocne będzie badanie USG, badanie krwi oraz RTG - pokaże czy nie ma już przerzutów w płucach. Najskuteczniejszą metoda leczenia jest sterylizacja (kastracja), czyli usuniecie całej macicy wraz z przydatkami.</br>"
							+ " </br>" + "Rakowi macicy można zapobiec poddając młode samiczki sterylizacji.</br>"
							+ "</br>" + "</br>" + "Rak jąder</br>" + " </br>"
							+ "Rak jąder jest na szczęście u królików bardzo rzadki. Objawia się powiększeniem i bolesnością jednego jąderka. Najskuteczniejszą metodą leczenia jest kastracja."));

			diseaseService.create(new Disease(8L, "Chejletieloza",
					"Cheyletiella parasitivorax to pajęczak zamieszkujący powierzchniową warstwę naskórka, często u nasady włosa. Chejletiele odżywiają się naskórkiem i płynami ustrojowymi. Nie są związane tylko z jednym gatunkiem zwierzaka, mogą się przenieść na inne zwierzęta domowe, człowiek też może się zarazić.</br>"
							+ "</br>" + "Symptomy: </br>" + "- łupież</br>" + "- gołe placki na grzbiecie i karku</br>"
							+ "- egzema</br>" + "- świąd</br>" + "- niepokój, a nawet agresja</br>" + "- linienie</br>"
							+ "</br>"
							+ "Lekarz pobierze próbkę ze skóry lub sierści królika i obejrzy ją pod mikroskopem. Zwykle weterynarz podaje zastrzyk z Ivermectyny, trzeba go powtórzyć po 10 dniach. Inne sposoby to zakroplenie sierści pomiędzy łopatkami królika preparatem Stronghold. Aby zapobiec powtórnemu zarażeniu się królików musimy zadbać o higienę w klatce i w innych miejscach gdzie królik chętnie przebywa. Klatkę dokładnie myjemy gorącą woda z octem, miseczki wyparzamy, drewniane zabawki możemy włożyć na 10 min. do piekarnika nagrzanego do 90 stopni. Myjemy szczotkę królika. Podłogę myjemy woda z octem możemy ją spryskać płynem owadobójczym poleconym przez weterynarza.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Kleszcze",
					"To malutkie pajęczaki z rzędu roztoczy. Żyją w wysokich trawach, w parkach, na terenach leśnych, łąkach, przenoszone są przez ssaki i ptaki dlatego nie zdziwmy się, że po wizycie na działce królik wrócił z kleszczem. Żywią się krwią ssaków i ptaków, jest ona im potrzebna do dalszego rozwoju. Owady te są aktywne od wczesnej wiosny do późnej jesieni. Kleszcze wybierają sobie zwykle miejsce wokół pyszczka królika, wokół oczu, na uszach ponieważ tam sierść jest najkrótsza i skóra najbardziej dostępną. Kleszcze najpierw szukają dogodnego miejsca zanim się wczepią, dobrze jest po wycieczce na zieloną trawę przeczesać uszaka np. grzebieniem na pchły. Grzebień ten jest bardzo gęsty, znaleziony kleszcz zostanie uwieziony pomiędzy ząbkami.</br>"
							+ " </br>"
							+ "Znalezionego kleszcza należy jak najszybciej usunąć. Opiekun, który nigdy tego jeszcze nie robił powinien iść z królikiem do weterynarza. Jeśli ktoś ma wprawę to:  kleszcza chwytamy dwoma palcami tuż przy skórze i szybkim ruchem wyrywamy krwiopijcę. W sklepach dostępne są specjalne pęsety, które ułatwią nam usuniecie kleszcza w całości.</br>"
							+ " </br>"
							+ "Bardzo proste i przydatne w obsłudze widełki/hak którymi podważa się kleszcza.</br>"
							+ "</br>"
							+ "Po wyciągnięciu rankę należy zdezynfekować. Przez kilka dni, a nawet tygodni może być widoczna różowa grudka. Ugryzienie trzeba kontrolować czy nie zmienia swojego kształtu, nie powiększa się bądź ropieje. Gdyby z ranką coś się działo, konieczna jest wizyta u weterynarza. Nie ma skutecznego preparatu przeciw kleszczowego, wszystkie są przeznaczone dla psów i kotów, szkodliwe jednak dla królików.</br>"
							+ " </br>"
							+ "Kleszcze przenoszą takie choroby jak pomór i myksomatoza. Dlatego bardzo ważne jest szczepienie uszaków na te choroby, na pomór raz w roku, na myksomatoze dwa razy.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Pchły",
					"Króliki kupione z niepewnego źródła bądź ze sklepu mogą być zarażone pchłami. Królik może przynieść pasożyty także z dworu lub zarazić się od swojego psiego lub kociego przyjaciela. Najczęściej jest to pchła królicza Spilopsyllus cuniculi, ale pchły psie i kocie też mogą zaatakować naszego pupilka.</br>"
							+ " </br>" + "Objawy </br>" + "- mocny świąd i częste drapanie</br>"
							+ "- czarne grudki w sierści (odchody pcheł)</br>" + "- egzema</br>"
							+ "- czarne szybko uciekające punkciki</br>" + "</br>"
							+ "Pchły przenoszą myksomatoze i pomór, przed tymi chorobami chronią szczepienia, na myksomatoze wykonuje je się co pół roku, a przeciw pomorowi raz na rok. Jeśli wszystko wskazuje na to, że nasz ulubieniec ma pchły powinniśmy udać się do weterynarza. Lekarz popsika, zakropi lub wstrzyknie preparat owadobójczy dostosowany do wagi królika.</br>"
							+ "</br>"
							+ "Bezpieczne preparaty to Stronghold (zakrapia się go pomiędzy łopatkami zwierzaka), zasypki Pularyl i Insectin oraz płyn Biocyd. Ściółkę, siano i granulat należy całkowicie wymienić, klatkę dokładnie umyć, zabawki z materiału np. tunel i posłanie trzeba wyprać. Resztę mieszkania dobrze odkurzyć, podłogę umyć. Jeśli królik jest u nas długo należy spryskać środkiem owadobójczym ulubione miejsca królika np. fotel, dywan. Jaja pcheł spadają z sierści futrzaka na podłogę, dlatego dobrze jest profilaktycznie spryskać te miejsca po których królik często biegał. Preparat do spryskiwania powinien być z polecenia weterynarza, jest on przeznaczony do spryskiwania pomieszczenia i mebli, absolutnie nie wolno nim spryskiwać zwierząt.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Swędzik jesienny",
					"To pajęczak z rzędu roztoczy. Dla nas i dla naszych zwierząt groźne są larwy Swędzika. Zwykle bytują na terenach porośniętych trawą i na krzewach cierpliwie czekając na swojego żywiciela. Żywią się płynem organicznym, nie krwią, a do ich żywicieli należą myszy, krety, króliki, psy, koty, ptaki, a nawet człowiek. Larwy mają wielkość 0,2 - 0,3 mm gołym okiem nie można ich zobaczyć. Od żywiciela odpadają natychmiast jak tylko najedzą się do syta, czyli po około 6 dniach, u człowieka po 4-8 godzinach. Syta larwa przeobraża się po miesiącu w nimfę, a później w dorosłą postać Swędzika. Dorosły swędzik ma 1-2 mm i jest koloru lekko żółtego.</br>"
							+ "</br>" + "Objawy:</br>" + "- świąd</br>"
							+ "- zaczerwienienie skóry/pokrzywka na głowie, wokół oczu, nosa, na uszach, pomiędzy palcami</br>"
							+ "- wypadanie sierści</br>" + "- pęcherze</br>" + "</br>"
							+ "Diagnozę weterynarz postawi po dokładnym obejrzeniu sierści przez mocniejszą lupę lub pobranej próbki pod mikroskopem. Bezpiecznym środkiem do zwalczania larwy swędzika jest Stronghold, zakrapla się go pomiędzy łopatkami królika.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Świerzb drążący",
					"Roztocze to żyje pod skórą i żywi się płynem tkankowym i komórkowym królika. Ich ulubionymi miejscami są nasada nosa, pyszczek, grzbiet i dolna część pleców.</br>"
							+ "</br>" + "Objawy:</br>" + "- mocny świąd,</br>"
							+ "- otarte, krwawiące miejsca, strupy</br>" + "- wypadanie sierści</br>"
							+ "- niepokój</br>"
							+ "W późniejszych stadiach: apatia, niechęć przed dotykiem, wycieńczenie i śmierć zwierzaka.</br>"
							+ "</br>"
							+ "Diagnoza jest dosyć prosta ponieważ wygład skóry i sierści jest charakterystyczny dla tej choroby, pomocna w postawieniu dokładnej diagnozy jest zeskrobina pobrana z zajętej skóry. Lekarz najczęściej podaje zastrzyk z Ivermektyny, który trzeba powtórzyć po 10 dniach. Inne preparaty to Stronghold (zakrapla się pomiędzy łopatkami królika), Dectomax - zastrzyk przeciw roztoczom. W domu powinniśmy wymienić siano i ściółkę, dokładnie umyć klatkę i cały sprzęt królika, podłogę w gorącej wodzie z dodatkiem octu. Roztocze może bez jedzenia wytrzymać nawet trzy tygodnie dlatego ważna jest higiena w tym okresie. Drewniane zabawki można włożyć do piekarnika 95° na 40 min. Zabawki lub posłania których nie można umyć trzeba włożyć do zamrażalki na 48 godzin.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Wszoły",
					"Gliricola porcelli, Gyropus ovalis i Trimenopon hispidum</br>" + "</br>"
							+ "Pasożyty te mieszkają w sierści, najczęściej można je zobaczyć na głowie, plecach i pupie zwierzaka. Są dobrze widoczne gołym okiem, długość ciała to 1-2 mm, kolor od srebrno - białego do brązowego. Żywią się obumarłym naskórkiem, płynem tworzącym się w otartych miejscach</br>"
							+ "i sekretem z gruczołów. Najbardziej narażone na zachorowanie są słabe, chorowite lub</br>"
							+ "zaniedbane zwierzęta.</br>" + "</br>" + "Objawy:</br>" + "- świąd</br>"
							+ "- zadrapania i krwawiące rany</br>" + "- wypadanie i łamliwość sierści</br>"
							+ "- malutkie ruchome robaczki w sierści</br>" + "- niepokój</br>"
							+ "Nieleczony zwierzak staje się apatyczny, wycieńczony choroba umiera.</br>" + "</br>"
							+ "Diagnozę weterynarz postawi po obejrzeniu sierści i skóry królika, w razie wątpliwości można pobrać próbkę za pomocą taśmy klejącej i obejrzeć pod mikroskopem. Preparaty chętnie stosowane przez weterynarzy: Stronghold (zakrapla się pomiędzy łopatki), Ivermektyna (zastrzyk) po 10 dniach trzeba powtórzyć.</br>"
							+ "</br>"
							+ "Aby nie dopuścić do wtórnego zakażenia myjemy całą klatkę, wymieniamy ściółkę, siano. Należy dokładnie umyć podłogę wokół najlepiej gorąca woda z octem, posłania i tunele z materiału pierzemy.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Wszy",
					"Najczęściej spotykana wesz u królików jest wesz zajęcza Haemodipsus lyriocephalus. Zarażenie wszami jest bardzo rzadkie, częściej u królików są spotykane wszoły lub pchły. Wesz żywi się krwią królika, jajeczka składa w sierści, każde przylepione jest do włosa specjalnym spoiwem.</br>"
							+ " </br>" + "Objawy:</br>" + "- świąd,</br>" + "- niepokój</br>"
							+ "- małe rozdrapane krostki</br>" + "- poprzylepiane do sierści jajeczka</br>"
							+ "- widoczne gołym okiem pasożyty</br>" + "</br>"
							+ "Diagnozę lekarz stawia po obejrzeniu sierści, skóry i gnid przez łupę. Najczęściej przepisywane lekarstwa to Stronghold (do zakraplania pomiędzy łopatkami) lub Ivermektyna - zastrzyk,</br>"
							+ "który trzeba powtórzyć po 10 dniach.</br>" + "</br>"
							+ "Aby nie dopuścić do wtórnego zakażenia myjemy całą klatkę, wymieniamy ściółkę, siano. Należy dokładnie umyć podłogę wokół najlepiej gorącą woda z octem, posłania i tunele z materiału pierzemy.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Larwy much - muszyca (myjoza)",
					"Nie tylko króliki chore, zaniedbane, chorują na Muszyce. Muchy chętnie składają jaja na królikach długowłosych, u których choroba często wykrywana jest zbyt późno. Muchy przyciąga brzydki zapach, poprzyklejane miękkie kupy, rany na ciele, sklejone futerko wokół oczu czy odbytu. Starsze zwierzęta, chore czy te z nadwagą, które nie są wstanie dokładnie się umyć i dotrzeć do wszystkich miejsc są najbardziej narażone. Wokół ran i zanieczyszczeń insekty składają swoje jaja, z których w przeciągu kilku godzin rozwijają się larwy. Larwy po zjedzeniu wierzchniej warstwy wgryzają się w ciało, wytwarzają przy tym groźne dla królika toksyny, które wprowadzają uszaka w stan szoku. Jeśli królik nie otrzyma natychmiastowej pomocy, larwy zjedzą go dosłownie żywcem. Jeśli zauważycie chociaż jedną larwę na ciele królika musicie jak najszybciej udać się do weterynarza!!! Jeżeli na daną chwile kontakt z weterynarzem z jakiegoś powodu jest niemożliwy, należy delikatnie obciąć sierść wokół rany i z pomocą pincety wyjąc wszystkie larwy (maja one ok. 1cm). Ostre światło sprawi, że robale schowają się głębiej, za to ciepłe powietrze z suszarki może je wywabić na powierzchnie. Po usunięciu larw, ranę trzeba przemyć roztworem soli fizjologicznej i zdezynfekować np. jodyna. Wizyta u lekarza jest konieczna czasami trzeba podać Ivermektyne lub antybiotyk, poza tym królik może być w stanie szoku spowodowanym trucizną wytwarzaną przez larwy.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(8L, "Nużyce",
					"Chorobę wywołują roztocza Demodex cuniculi, które żyją w mieszkach włosowych zwierząt i tam też przechodzą wszystkie stadia rozwoju, mogą występować na całym ciele.</br>"
							+ " </br>" + "Objawy:</br>" + "- często zakażenie jest bezobjawowe</br>"
							+ "- u wycieńczonych, słabych zwierząt występuje egzema i świąd,</br>"
							+ "- łamliwość włosów</br>" + "- łupież</br>" + "- łyse placki</br>"
							+ "- zapalenie skóry</br>" + "- ropne pęcherze</br>" + "</br>"
							+ "Diagnozę lekarz postawi pobierając zeskrobinę i oglądając ją pod mikroskopem. Najczęściej stosowane są zastrzyki z Ivermektyny, które powtarza się po 10-14 dniach, Stronghold (zakrapla się pomiędzy łopatkami), Biocyd do smarowania miejsc zmienionych chorobowo. Jeśli zwierzęta mają duże rany lub skóra jest w stanie zapalnym konieczne będzie podanie antybiotyku.</br>"
							+ " </br>"
							+ "W domu powinniśmy wymienić całą ściółkę i siano, klatkę i miejsce wokół klatki dobrze umyć gorącą woda z dodatkiem octu, zabawki wymyć, materiałowe posłanie i tunel wyprać. Drewniane rzeczy włożyć albo na 48 godzin do zamrażalki albo do piekarnika nagrzanego 95° na 40 minut, miseczki ceramiczne można włożyć do mikrofali na 2 min. Porady dotyczące higieny mogą się wydawać niektórym przesadą, ale jest to uzasadnione ponieważ jaja niektórych roztoczy mogą przeżyć od 2 do 8 tygodni.</br>"
							+ "</br>"
							+ "UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));

			diseaseService.create(new Disease(9L, "Encephalitozon Cuniculi",
					"Podobno około 80% królików jest nosicielem tej choroby. Niewiadomo dlaczego, u niektórych Uszaków choroba ujawnia się, a u innych pozostaje w ukryciu. Być może stres odgrywa tu dużą role, znaczne osłabienie organizmu lub złe warunki w jakich uszak żyje. Ta choroba występuje też u innych ssaków: u szczurów, myszy, chomików, świnek morskich, owiec, świń, psów itd. Człowiek może się zarazić tylko w przypadku dużego osłabienia układu odpornościowego.</br>"
							+ "</br>" + "Jak dochodzi do zarażenia?</br>"
							+ "Ciężarne chore królice zarażają rozwijający się płód. Królik może się zarazić też poprzez zarodniki znajdujące się w moczu chorego królika np. zasikane siano. Sporo może się dostać do organizmu także przez drogi oddechowe. Pierwotniak atakuje układ nerwowy, nerki, wątrobę, śledzionę czasami też gałki oczne i mięsień sercowy.</br>"
							+ "</br>" + "Najczęstsze objawy:</br>"
							+ "Przekrzywiona głowa, problemy z utrzymaniem równowagi, drgawki, kręcenie się w kółko, oczopląs, zaćma, brak apetytu, potrząsanie uszami. Może wystąpić paraliż częściowy lub całkowity. Konieczna jest jak najszybsza wizyta u lekarza!!! Diagnozę można postawić na podstawie badania neurologicznego, badania moczu i badania serologicznego - we krwi obecne są przeciwciała, ich ilość wskazuje czy choroba jest w toku czy królik jest tylko nosicielem</br>"
							+ "</br>" + "Najczęściej stosowane lekarstwa: </br>"
							+ "- Antybiotyki zawierające Chloramphenicol lub Tetracykline</br>"
							+ "- Panacur - pasta na odrobaczenie, powinna być stosowana przynajmniej 3-4 tygodnie.</br>"
							+ "- Duże dawki witaminy B - wzmacnia układ nerwowy.</br>"
							+ "- Cortyzon- zwalcza zapalenie,</br>"
							+ "Przez pierwszy tydzień choroby, wskazane są kroplówki z roztworu soli fizjologicznej. Roztwór ten oczyszcza zaatakowane przez pierwotniaka nerki.</br>"
							+ "</br>" + "Co możemy sami zrobić:</br>"
							+ "- Nie oddzielajmy uszaka od swojego przyjaciela czy grupy królików, to duży stres dla królika. Kicek może stracić ochotę do walki z choroba. Jest duże prawdopodobieństwo, że pozostałe uszatki noszą już w sobie tego pierwotniaka, bez jakichkolwiek objawów klinicznych.</br>"
							+ "- Przy antybiotyku dobrze jest podawać probiotyk np. Lakcid,( jedna ampułkę dziennie) rozrobić w wodzie i podać królikowi.</br>"
							+ "- Echinacea suszona wzmocni odporność królika. Inne sprzyjające zioła: krwawnik, babka lancetowata, mniszek lekarski, liście brzozowe suszone i świeże, pokrzywa suszona.</br>"
							+ "- Ziołowe herbatki wzmocnią i oczyszczą nerki.</br>"
							+ "- Lekkie masaże sparaliżowanych łapek lub delikatne ich szczotkowanie na pewno wspomogą leczenie.</br>"
							+ "- Jeśli uszak nie ma apetytu trzeba go dokarmiać np. gotowym preparatem Critical Care,  warzywnymi słoiczkami dla niemowląt lub rozmoczonym granulatem."));

			diseaseService.create(new Disease(9L, "Kokcydioza",
					"Kokcydy są to pierwotniaki z rodzaju Eimeria. W zależności od tego którym gatunkiem kokcydii nastąpi zarażenie, rozróżniamy dwie postacie choroby - wątrobowej i jelitowej. Oocysty wydalane są z kałem i dojrzewają przez 4-6 dni w ściółce, sianie czy trawie. Zjedzone trafiają z powrotem do organizmu. Dużo królików jest nosicielami tego pierwotniaka, ale nie wszystkie uszaki chorują. Do zachorowania dochodzi w wyniku stresu, obniżonej odporności, błędów żywieniowych czy nie przestrzegania higieny np. brudna kuweta, klatka.</br>"
							+ "</br>" + "Objawy:</br>"
							+ "Chudniecie, brak apetytu, apatia, rozwolnienie ze śladami krwi lub śluzem, nadmierna ilość niezjadanych cekotrofów, wzdęty brzuch. Najbardziej niebezpieczna choroba ta jest dla młodych zwierząt do 12 tygodnia życia. U maluchów występuje przeważnie kokcydioza jelitowa, a u starszych królików częściej kokcydioza wątrobowa. Biegunka przy odmianie wątrobowej jest rzadkością. Kokcydoze stwierdza się na podstawie mikroskopowego badania kału. Należy zbierać bobki w ciągu dnia o rożnych porach. Jeśli robimy badanie profilaktyczne to zbieramy bobki przez trzy dni i zanosimy do weterynarza. Najczęściej stosowany w leczeniu jest Baycox, Retardon lub Cytostat R. Dwa tygodnie po kuracji trzeba powtórzyć badanie kału.</br>"
							+ "</br>" + "Co możemy zrobić sami:</br>"
							+ "Podczas leczenia królika nie powinno się podawać pokarmów zawierających zboże. Skrobia zawarta w zbożu jest doskonałą pożywka dla kokcydów. Zrezygnujmy z podawania owoców i warzyw takich jak marchew czy seler korzeniowy.</br>"
							+ " </br>"
							+ "WSKAZANIE : papryka, kapusta pekińska, pomidor, seler naciowy, ogórek, liście kalarepy, trawa, mniszek lekarski, herbatka rumiankowa i nagietkowa. Na rozwolnienie pomagają suszone owoce czarnej jagody (czernicy), można również kupić w aptece herbatkę z suszonych jagód.</br>"
							+ " </br>"
							+ "Klatkę, zagrodę, podłogę, zabawki trzeba dobrze umyć, wyparzyć miseczki i kuwety. Drewniane zabawki możemy włożyć do piekarnika 60° na 10 minut, czynności te powtarzamy regularnie przynajmniej przez pierwszy tydzień leczenia. Zieleninę i siano nie podajemy na podłodze, ponieważ  mogą się zetknąć z oocystami, które po zjedzeniu znowu trafia do organizmu królika. Nowo przybyłe zwierzęta powinny być poddane dwutygodniowej kwarantannie zanim połączymy je z domowymi uszakami. Profilaktycznie można oddać bobki do badania."));

			diseaseService.create(new Disease(9L, "Nicienie",
					"Najczęstszymi pasożytami żyjącymi w jelitach są nicienie : Garphidium strigosum, Trichostrongylus retortaeformis, Passalurus ambiguus (owsik).</br>"
							+ " </br>" + "Objawy:</br>" + "- brak apetytu,</br>" + "- apatia</br>" + "- chudniecie</br>"
							+ "- rozwolnienie ze śluzem</br>" + "- widoczne gołym okiem białe robaki w bobkach</br>"
							+ "- chroniczne zapalenie jelit</br>" + "</br>"
							+ "Diagnozę weterynarz postawi po badaniu kału. Należy zebrać bobki, najlepiej z trzech dni lub z rożnych pór dnia i oddać do badania. Widoczne gołym okiem owsiki można nakleić na zwykłą taśmę klejącą i pokazać weterynarzowi.</br>"
							+ "</br>"
							+ "Najczęściej w leczeniu stosuje się Fenbendazol. Moje króliki dostały pastę panacur. Pasta jest łatwa w dozowaniu, ma podziałkę na kg, łatwa w obsłudze i ma jeszcze tą zaletę, że króliki ją zazwyczaj lubią. Podaje się ją przez trzy dni, po dwóch tygodniach przerwy kuracje należy powtórzyć - o ile lekarz nie zaleci inaczej. Innym chętnie stosowanym lekiem jest Ivermectyna, wstrzykuje się ją dwa razy w odstępach 10- 14 dniowych.</br>"
							+ "</br>"
							+ "Klatkę należy dobrze umyć gorącą woda z octem, także kuwetę, miseczki i zabawki. Zieleninę zbieramy z dala od miejsc gdzie wyprowadzane są psy, na polanach i łąkach. Zwróćmy uwagę czy nie ma odchodów dzikich królików.</br>"
							+ "</br>"
							+ "Profilaktycznie powinno się robić badanie kału każdemu nowo nabytemu królikowi."));

			diseaseService.create(new Disease(10L, "Grzybica",
					"Najczęstszymi grzybicami na które zapadają króliki są: grzybica drobno zarodnikowa, grzybica woszczynowa, strzygąca (Trichophyton mentagrophytes) i grzybica narządowa. Grzybice należą do Zoonoz czyli chorób, którymi może zarazić się też człowiek.</br>"
							+ "</br>" + "Głównymi przyczynami zachorowań na grzybice są:</br>"
							+ "- silny stres np. na skutek zaprzyjaźniania, częste branie na ręce przez dzieci, dojrzewanie i walki w grupie</br>"
							+ "- złe warunki higieniczne w jakich żyją króliki, rzadkie sprzątanie klatki</br>"
							+ "- osłabienie odporności na skutek nieodpowiedniego żywienia</br>"
							+ "- inne choroby oraz lekarstwa</br>" + " </br>"
							+ "Na początku omówię grzybice atakującą skórę i sierść królika.</br>" + "</br>"
							+ "Objawy:</br>"
							+ "- okrągłe łyse placki, w początkowej fazie na uszach, wokół pyszczka, na kończynach, później też na grzbiecie i brzuchu.</br>"
							+ "- łupież</br>" + "- łamliwość włosów</br>" + "- strupki na ciele</br>" + "</br>"
							+ "Diagnozę stawia się po pobraniu zeskrobiny lub sierści i wyhodowaniu grzybów w laboratorium. Inną metodą jest naświetlenie sierści lampą UV, w miejscach zaatakowanych występuje zielono - żółta fluorescencja. Brak fluorescencji nie wyklucza jednak grzybicy.  Na podstawie badań lekarz zaleci dalsze leczenie. Przed nasmarowaniem skóry przepisanymi lekarstwami sierść wokół ognisk</br>"
							+ "chorobotwórczych należy ogolić ponieważ w sierści znajdują się spory grzybów, które rozprzestrzeniają się na zdrową skórę.</br>"
							+ "</br>" + "Najczęściej stosowane leki: </br>"
							+ "Surolan, Undofen, Canasten, bardzo swędzące miejsca można cienko posmarować Fenistilem. Leczenie trwa przynajmniej trzy tygodnie. Wymieniamy ściółkę i siano, klatkę, zagrodę, zabawki, kuwetę itd. dokładnie myjemy gorącą wodą. Zabawki i posłania z materiału pierzemy, drewniane zabawki wkładamy do piekarnika 90° na 40 minut. Jeśli królik żyje w małej grupie z innymi zwierzętami nie należy go rozłączać. Stres związany z rozłąką opóźni powrót do zdrowia uszaka.</br>"
							+ "</br>" + "</br>" + "Grzybica narządowa </br>" + "</br>"
							+ "Najczęściej zasiedla jelita królika. Do namnażania się grzybów dochodzi na skutek osłabienia organizmu, stres jest bardzo ważnym faktorem, szybka zmiana pożywienia, pożywienie zawierające dużo skrobi np. granulaty, które mają w swoim składzie zboże, produkty zawierające dużo cukru np. owoce, kolby mogą się przyczynić do zmiany ph w jelitach i szybkiemu namnażaniu się grzybów i drożdży. Także zepsute, nieświeże jedzenie może zawierać spory grzybów.</br>"
							+ "</br>" + "Objawy:</br>" + "- częste biegunki</br>" + "- częste zaparcia</br>"
							+ "- brzydka matowa i łamliwa sierść</br>" + "- łamliwość zębów</br>" + "</br>"
							+ "Diagnozę lekarz postawi oglądając kał chorego królika pod mikroskopem. Może też wysłać próbkę do laboratorium, w tym wypadku trzeba będzie poczekać na wyniki około tygodnia. Najczęściej podaje się Nystatin doustnie - o ile lekarz nie zaleci inaczej. Leczenie powinno trwać przynajmniej 10 dni, po 6-8 tygodniach trzeba wykonać ponowne badanie kału."));

			diseaseService.create(new Disease(10L, "Zapalenie skóry podeszwy",
					"Rany na podeszwach są bardzo bolesne dla królika, zwykle pojawiają się na tylnich skokach. Przy pierwszych objawach należy rozpocząć leczenie. Najczęściej pojawiają się u królików, które są trzymane na twardym podłożu, w brudnej i wilgotnej klatce, u królików z tuszą lub po urazie kończyn (uszak odciąża chora łapę, ciężar ciała przenosi na zdrowa łapkę).</br>"
							+ " </br>"
							+ "Jeśli kuweta jest rzadko sprzątana, królik siedzi w nasiąkniętym moczem żwirku, mocz jest bardzo agresywny, mocno podrażnia skórę, na rozmiękczonej i podrażnionej skórze tworzą się bolesne rany.</br>"
							+ " </br>"
							+ "Króliki poruszające się po nieodpowiednim podłożu są narażone na zapalenie podeszew.</br>"
							+ "</br>" + "Sprzyjające powstawaniu ran powierzchnie:</br>"
							+ "- twarda, chropowata podłoga</br>" + "- twardy plastik</br>" + "- twardy żwirek</br>"
							+ "- sztuczne dywany i wykładziny (ścierają sierść i skórę)</br>" + "</br>"
							+ "Najpierw wyciera się sierść, pojawiają się łyse miejsca na skokach, powstają odciski, które z biegiem czasu staja się większe, skóra robi się zaogniona. Opuchnięte podeszwy coraz bardziej zaczynają piec,skóra jest napięta i bolesna.</br>"
							+ "</br>"
							+ "Podczas biegania podrażniona skóra ściera się i zaczyna krwawic. Robią się otarcia i strupy. Z powodu zanieczyszczeń i bakterii rany mogą puchnąć i przejść w stan zapalny. Jeśli nie zostanie podjęte leczenie zapalenie obejmie kości.</br>"
							+ "</br>" + "Leczenie:</br>" + "</br>"
							+ "Bardzo ważne jest utrzymanie podeszw w czystości. Myjemy je regularnie, czystą chłodną wodą, ciepła może spowodować ból, chłodna daje ukojenie. Zamiast wody możemy użyć srebra koloidalnego ma ono ta zaletę, że działa dezynfekująco i wspomaga gojenie.</br>"
							+ "</br>" + "Po umyciu i delikatnym osuszeniu stop smarujemy je maścią np.</br>"
							+ "- Betadine (ma działanie odkażające, bakteriobójcze),</br>"
							+ "- Bepathen ( działa odkażająco i przeciwzapalnie, przyspiesza gojenie i chroni skórę  przed nadmiernym działaniem wilgoci, zwiększa elastyczność i nawilżenie skóry).</br>"
							+ "- Maść nagietkowa (przyspiesza gojenie się ran, natłuszcza) - nadaje się do lekkich otarć.</br>"
							+ "</br>"
							+ "Silnie zaognione, krwawiące lub zainfekowane rany wymagają podania maści z antybiotykiem lub kortyzonem. Weterynarz pokaże jak powinno się bandażować skoki i zmieniać opatrunek.</br>"
							+ "</br>" + "</br>"
							+ "Na czas leczenia żwirek w kuwecie należy zamienić na ręczniki papierowe lub papier toaletowy, który często zmieniamy aby nie podrażniać chorych łapek i nie dopuścić do infekcji.</br>"
							+ " </br>" + "</br>"
							+ "Uwaga: informacje zawarte w tym artykule nie zastąpią wizyty u weterynarza."));

			diseaseService.create(new Disease(10L, "Zapalenie warg",
					"Tworzy się przede wszystkim na skutek niedoboru witaminy C i A oraz niedoboru kwasów tłuszczowych i pantotenowych.</br>"
							+ "Na pyszczku, nosie i na śluzowce w pyszczku tworzą się bolesne pęknięcia, które pokrywają się strupkami, skóra jest zaczerwieniona i sucha. W tych rankach osiadają grzyby i bakterie, dochodzi do infekcji.</br>"
							+ " </br>"
							+ "Lekarz weterynarii pobierze próbkę i na jej podstawie zostanie wyhodowany szczep bakterii. Najczęściej są to gronkowce, rzadziej mikrokoki lub paciorkowce. Na zmienionej chorobowo śluzowce można znaleźć też roztocza, drożdże i grzyby.</br>"
							+ " </br>"
							+ "W zależności od postawionej diagnozy stosuje się antybiotyk, maść przeciwgrzybiczną, maść z witamina A lub inne polecone przez weterynarza. Strupki można zmiękczyć przykładając rumianek w chore miejsca i smarując maścią gojąca lub maścią z Wit. A.</br>"
							+ "</br>"
							+ "Powinniśmy urozmaicić dietę naszego uszaka o warzywa zawierające witaminy C i A np. papryka, brokuły, marchew, nać pietruszki, dynia. Nie ma potrzeby podawania sztucznych witamin. Kwasy tłuszczowe znajdziemy w ziarnach słonecznika i siemieniu lnianym - można posypać nimi warzywa. Zrezygnujmy na czas leczenia z podawania owoców, sok podrażnia ranki, szczypie i powoduje ból."));

			diseaseService.create(new Disease(11L, "Myksomatoza",
					"Myksomatoza jest jedna z najniebezpieczniejszych chorób króliczych, w większości przypadków kończy się śmiercią zwierzaka, śmiertelność wynosi mniej więcej 90%. Chorobę wywołuje Leporipoxvirus z rodziny pokswirusow. Chorują tylko króliki, inne zwierzęta i człowiek nie mogą się nią zarazić. Jeśli królik zwalczy chorobę zaraża nią w dalszym ciągu przez okres 6 miesięcy.</br>"
							+ "</br>"
							+ "Najczęściej wirus przenoszony jest przez pchle króliczą, komary, roztocza, kleszcze, wszy i muchy. Wirus można przynieść także z zerwana zielenina. Królik może się zarazić od innego królika mimo, że ten nie wykazuje żadnych oznak zachorowania i od człowieka jeśli ten miął kontakt z chorym zwierzęciem. Szczepione króliki nie powinny przebywać razem z nieszczepionymi uszakami.</br>"
							+ "</br>" + "Postać ostra:</br>"
							+ "Choroba daje o sobie znać po 3-5 dniach od zarażenia. Pierwsze objawy to opuchniecie oczu, zapalenie spojówek, opuchlizna nosa, uszu, warg także okolic narządów płciowych. Pojawia się gorączka i problemy z oddychaniem. Zwierzęta nie maja apetytu, są apatyczne, chudną. Śmierć następuje po 8-10 dniach.</br>"
							+ "</br>" + "Postać chroniczna:</br>"
							+ "Na uszach, wokół oczu, wokół pyszczka, odbytu i narządów płciowych tworzą się krostki. Tą postać myksomatozy silne króliki mogą przezwyciężyć.</br>"
							+ "</br>"
							+ "Najczęściej chore zwierzęta są usypiane. Jeśli lekarz podejmie się leczenia zastosuje antybiotyk (Baytril najczęściej), krople do oczu, witaminy i lekarstwa wspomagające układ immunologiczny królika. Leczenie jest długie i rzadko kończy się uzdrowieniem zwierzaka.</br>"
							+ "</br>"
							+ "Najważniejszym i najskuteczniejszym środkiem zapobiegawczym jest szczepionka przeciwko myksomatozie. Szczepi się 4-6 tygodniowe króliki, po miesiącu szczepienie należy powtórzyć. Następne szczepienia wypadają co pół roku. Idealnymi miesiącami szczepienie jest marzec i wrzesień. Szczepionka nie daje 100% gwarancji, ale nawet jeśli królik zachoruje choroba przebiegnie łagodniej i jest duża szansa na całkowite wyzdrowienie. Oprócz tego należy zadbać aby królik nie był nękany przez komary, meszki i muchy. W oknach można powiesić siatki chroniące przed muchami i komarami. Po spacerze sprawdzamy sierść w poszukiwaniu kleszczy. Zieleninę zbieramy z dala od siedzib dzikich królików, ich obecność można poznać po bobkach zostawianych na granicy rewiru. Może się zdarzyć, że znajdziemy dzikiego, chorego królika z objawami myksomatozy (opuchnięte oczy, nos, krosty na uszach) w żadnym wypadku nie zabierajmy go do mieszkanie. Zwierzaka należy zanieść do weterynarza.</br>"
							+ "</br>" + "Aktualizacja z dnia 22.03.2016r. </br>" + "</br>"
							+ "Nowa szczepionka kombinowana dla królików.</br>" + "</br>"
							+ "Szczepionka kombinowana dla królików Nobivac</br>" + "</br>"
							+ "W 2011 roku Europejska Agencja Leków ( EMA) dopuściła nową szczepionkę dla królików Nobivac Myxo-RHD. Szczepionka zawiera żywy wirus myksomatozy z wektorem wirusa RHD. Szczepi się króliki od 5 tygodnia życia, nabieranie odporności trwa 3 tygodnie i odporność utrzymuje się przez rok. Czyli jeśli zaszczepimy królika na wiosnę to szczepienie należy powtórzyć wiosna przyszłego roku, a nie jak w przypadku innych szczepionek jesienią.</br>"
							+ "</br>"
							+ "Jak w przypadku innych szczepionek, szczepić należy tylko zdrowe króliki. Działania niepożądane, które mogą wystąpić to podwyższenie temperatury o 1-2 stopni C, niebolesny obrzęk w miejscu ukłucia, który może utrzymywać się do 3 tygodni. Ciężarne samiczki można zaszczepić dopiero po 14 dniach ciąży.</br>"
							+ "</br>"
							+ "W porównaniu do innych szczepionek RHD, nowy produkt zrobił ogromny postęp odnośnie ochrony zwierząt. Mało kto wie, że aby powstała szczepionka przeciw pomorowi, infekuje się zdrowe króliki i z ich wątroby pozyskuje się materiał na szczepionkę RHD. Czyli po to żeby nasze uszaki uchronić przed choroba, muszą te laboratoryjne zapłacić swoim zdrowiem i życiem. Szczepionka Nobivak jest produkowana z genetycznie zmienionego Myxo- wirusa, żaden królik nie musi zostać zabity do jej produkcji."));

			diseaseService.create(new Disease(11L, "Pomór króliczy",
					"Pomór jest bardzo groźna chorobą wirusową, zapadają na nią króliki i zające, inne zwierzęta i człowiek nie mogą się nią zarazić. Choroba wywoływana jest przez wirusa z grupy Picorna (Kaliciwirusy). Najwięcej zachorowań notuje się w miesiącach letnich, pojedyncze przypadki w zimie. Pomór w 80-100% kończy się śmiercią zwierzaka.</br>"
							+ " </br>"
							+ "Okres inkubacji wynosi 1-3 dni. Najczęściej wirus przenoszony jest przez pchłę króliczą, komary, roztocza, kleszcze, wszy i muchy. Wirus można przynieść także z zerwaną zieleniną. Królik może się zarazić od innego królika i od człowieka, jeśli ten miął kontakt z chorym zwierzęciem.</br>"
							+ " </br>" + "Postać ostra :</br>"
							+ "Charakteryzuje się niepokojem lub apatia i wycieńczeniem, brakiem apetytu, trudnością w oddychaniu, gorączką może dojść biegunki. Zwierzęta duszą się i umierają w cierpieniu.</br>"
							+ "</br>" + "Postać nad ostra:</br>"
							+ "Może nie dawać żadnych objawów, zwierzak znajdowany jest w klatce nieżywy z krwawym wyciekiem z nosa lub nagle dostaje drgawek, dusi się, często z wygiętą do tylu głową i krwawym wyciekiem z nosa.</br>"
							+ "</br>" + "Postać łagodną:</br>"
							+ "Królik źle się czuje, może mieć biegunkę. Po kilku dniach wszystko wraca do normy, uszak zdrowieje. Przez kilka miesięcy może zarażać pomorem inne króliki, wirus pozostaje przez jakiś czas w organizmie.</br>"
							+ "</br>"
							+ "Najważniejszym środkiem zapobiegawczym jest szczepionka przeciwko pomorowi. Można ją kombinować ze szczepionką na myksomatoze. Szczepienie podstawowe w wieku 4-6 tygodni na pomór lub pomór i myksomatoze, po czterech tygodniach powtórzenie szczepienia. Dawki przypomina się co 12 miesięcy.</br>"
							+ "</br>" + "Aktualizacja z dnia 22.03.2016r. </br>" + "</br>"
							+ "Nowa szczepionka kombinowana dla królików.</br>" + "</br>"
							+ "Szczepionka kombinowana dla królików Nobivac</br>" + "</br>"
							+ "W 2011 roku Europejska Agencja Leków ( EMA) dopuściła nową szczepionkę dla królików Nobivac Myxo-RHD. Szczepionka zawiera żywy wirus myksomatozy z wektorem wirusa RHD. Szczepi się króliki od 5 tygodnia życia, nabieranie odporności trwa 3 tygodnie i odporność utrzymuje się przez rok. Czyli jeśli zaszczepimy królika na wiosnę to szczepienie należy powtórzyć wiosna przyszłego roku, a nie jak w przypadku innych szczepionek jesienią.</br>"
							+ "</br>"
							+ "Jak w przypadku innych szczepionek, szczepić należy tylko zdrowe króliki. Działania niepożądane, które mogą wystąpić to podwyższenie temperatury o 1-2 stopni C, niebolesny obrzęk w miejscu ukłucia, który może utrzymywać się do 3 tygodni. Ciężarne samiczki można zaszczepić dopiero po 14 dniach ciąży.</br>"
							+ "</br>"
							+ "W porównaniu do innych szczepionek RHD, nowy produkt zrobił ogromny postęp odnośnie ochrony zwierząt. Mało kto wie, że aby powstała szczepionka przeciw pomorowi, infekuje się zdrowe króliki i z ich wątroby pozyskuje się materiał na szczepionkę RHD. Czyli po to żeby nasze uszaki uchronić przed choroba, muszą te laboratoryjne zapłacić swoim zdrowiem i życiem. Szczepionka Nobivak jest produkowana z genetycznie zmienionego Myxo- wirusa, żaden królik nie musi zostać zabity do jej produkcji."));

			diseaseService.create(new Disease(11L, "Pasteurelloza",
					"Jest bardzo rozpowszechniona wśród królików. Wywołuje ją bakteria Pasteurella multocida, rzadziej Bordetella bronchiseptica. Niektóre króliki są nosicielami tej choroby. Ta bakterie spotyka się także u świnek morskich, psów i kotów, dzieci i dorośli z osłabioną odpornością mogą się nią zarazić. Zaleca się częste mycie rąk i unikanie kontaktu ze śliną chorych zwierząt. Uszaki zarażają się poprzez wydzielinie z nosa i ślinę zarażonego królika, osiada ona na pożywieniu, na podłodze, klatce, zdrowe zwierzęta wdychają bakterie, dochodzi do epidemii.</br>"
							+ " </br>" + "Objawy:</br>"
							+ "Choroba zaczyna się suchymi kichnięciami. Z czasem kichanie staje się częste i towarzyszy mu przezroczysta wydzielina. Sierść wokół noska jest mokra i sklejona. Dochodzi do zapalenia spojówki, może dojść do zapalenia ucha środkowego i wewnętrznego (przechylona głowa), zapalenie płuc i zapalenie osierdzia. Pasteurelloza może być przyczyną ropni, zapalenia jąder i pochwy.</br>"
							+ " </br>"
							+ "Przy postaci nad ostrej śmierć przychodzi nagle, bez widocznych objawów choroby.</br>"
							+ "</br>"
							+ "W postaci ostrej-  bakterie przedostają się do układu krążenia i wywołują coś w stylu \" zakażenia krwi\". Osłabiony organizm nie jest w stanie obronić się przed kolejnymi atakami, królik wycieńczony chorobą umiera w przeciągu 2-8 dni. Postać chroniczną - trwa latami, cechuje się częstymi nawrotami, ale ogólnie królik czuje się dobrze i może z tą postacią żyć.</br>"
							+ "</br>"
							+ "Lekarz pobierze wydzielinę z nosa królika aby ustalić bakterie i wrażliwość jej na antybiotyki (antybiogram). Antybiotyk podaje się przeważnie 5-7 dni. Dawka jest zależna od wagi królika. Ważne żeby nie przerywać kuracji, grozi to uodpornieniem się bakterii na dany antybiotyk i nawrotem infekcji. Podczas kuracji należy podawać probiotyk np. Lakcid, jedną kapsułkę dziennie.</br>"
							+ "Choroby nie da się tak do końca wyleczyć, często nawraca, królik ma okresowo katar, zapalenie spojówek, oskrzeli lub na ciele tworzą się ropnie. Bardzo dobre wyniki daje leczenie Interferonem, jest to lek stosowany głównie u ludzi, kotów i psów, mało znany w leczeniu królików.</br>"
							+ "</br>" + "Pomocne zioła:</br>"
							+ "Tymianek, dzieła przeciw zapalnie, odksztuszająco, wzmacnia, dezynfekuje, poprawia trawienie. Pomaga przy chorobach układu oddechowego: katarze, przeziębieniu, zapaleniu oskrzeli. Posiada naturalne właściwości antybiotyku, wzmacnia równocześnie system immunologiczny, w przeciwieństwie do antybiotyku, który niszczy florę jelit. Podajemy w formie herbatki zamiast wody, lub suszony. Liście malin, jeżyn i babki lancetowatej są pomocne przy przeziębieniu. Jeżówka purpurowa(echinacea) wzmacnia odporność królika. Natka pietruszki jest bogata w witaminę C, wzmacnia odporność.</br>"
							+ " </br>"
							+ "Inhalacje bardzo pomagają królikom w czasie katarku, można je robić ze zwykłego majeranku lub rumianku.</br>"
							+ "</br>" + "Przepis na bardziej skomplikowaną: </br>"
							+ "Łyżeczkę tymianku i łyżeczkę rumianku wrzucić do zimnej wody, zagotować. Odstawić z ognia dodać pół łyżeczki sody ( uwaga ucieka z garnka). Postawić obok klatki na około 10 min, klatkę i garnek przykryć kocem. Trzeba później dobrze wytrzeć uszaka ręcznikiem bo para osiada też na sierści i uszak może się przeziębić lub będzie mu zimno. Dobre efekty daje ogrzewanie królika lampka podczerwona np. zaraz po inhalacji.</br>"
							+ "</br>"
							+ "Pasteurellozie można zapobiec stosując szczepionkę. Zwłaszcza ma to sens w dużych grupach królików bądź hodowlach. Szczepionkę można kojarzyć ze szczepieniem na myksomatoze bądź pomór lub zaszczepić oddzielnie 4 tygodnie po szczepieniach na myksomatoze i pomór. Dawkę przypominającą wykonuje się co 6 miesięcy."));

			diseaseService.create(new Disease(12L, "Przerost korony zębów",
					"Dosyć często spotykana anomalia u królików. Spowodowana jest:</br>"
							+ "- błędami w żywieniu: rozdrabnianie, krojenie jedzenia, zbyt mało siana w diecie, zbyt kaloryczna dieta - powoduje, że królik nie ma ochoty jeść siana.</br>"
							+ "- wada genetyczna, zły zgryz, zęby nie ścierają się równomiernie, rosną, przeszkadzają w jedzeniu, tworzące się ostre krawędzie ranią dziąsła i język.</br>"
							+ " </br>" + "Objawy:</br>" + "- powolne jedzenie</br>" + "- ślinienie się</br>"
							+ "- przesadne ruchy podczas gryzienie</br>" + "- przerośnięte siekacze</br>"
							+ "- spadek wagi</br>" + " </br>"
							+ "Weterynarz wyrówna i wyszlifuje ząbki (pod narkozą). Jeśli przyczyna przerostu koron jest wadą genetyczną to tą procedurę trzeba będzie powtarzać mniej więcej co dwa miesiące. Siano, gałązki i zielenina ścierają zęby i masują dziąsła, powinny być codziennie podawane.</br>"
							+ "</br>"
							+ "Chleb, mieszanki, granulat, kolby i dropsy wbrew wierzeniom i reklamom na pudełkach nie ścierają zębów, powodują że królik przez długi czas jest syty i nie sięga po siano tak często jak powinien, żeby zetrzeć trzonowce. Poza tym te \"przysmaki\" zawierają cukier, który oblepia zęby i tym samym</br>"
							+ "przyczyniają się do powstawania próchnicy i łamliwości zębów."));

			diseaseService.create(new Disease(12L, "Przerost korzeni zębów",
					"Nawet jeśli korona zęba jest zdrowa i nie widać żadnych zmian w pyszczku korzenie mogą być przerośnięte. Przebijając się przez szczękę, mogą przyczynić się do zatkania kanalika łzowego, powodując katar i łzawienie oczek. Często są przyczyna ropni. W najgorszym wypadku mogą uszkodzić oko. Powodują nieprzyjemny ból i ucisk zwłaszcza przy zmianach pogody.</br>"
							+ " </br>" + "Objawy:</br>" + "-  wyczuwalna gulka pod broda</br>"
							+ "-  łzawienie lub ropny wyciek z oka</br>" + "-  katar</br>" + "-  wytrzeszcz oka</br>"
							+ "-  ropień</br>" + " </br>"
							+ "Aby zdiagnozować przerost korzeni u królika należy zrobić RTG czaszki. Przerośnięte zęby trzeba usunąć, jeśli powstał już ropień należy go wyczyścić. W przypadku gdy kości szczeki są uszkodzone i grożą pęknięciem usuniecie zęba jest niemożliwe, można tylko usunąć ropień i zastosować antybiotykoterapie oraz środek przeciwbólowy."));

			diseaseService.create(new Disease(12L, "Ropnie",
					"Częstymi powikłaniami wad zgryzu i przerostu korzeni są ropnie. W kieszenie powstałe obok poluzowanych zębów dostaje się pożywienie i bakterie. Dochodzi do zapalenia w wyniku którego zęby jeszcze bardziej się poluzowują. Bakterie dostają się głębiej i niszczą kość, tworzy się ropa. Niektóre ropnie osiągają rozmiar kurzego jajka.</br>"
							+ " </br>" + "Objawy:</br>" + "-  zniekształcenie pyszczka,</br>"
							+ "-  wyczuwalna gulka pod pyszczkiem</br>" + "-  wydzielina z oka lub nosa</br>"
							+ "-  długie, ostrożne przeżuwanie</br>" + "-  zjadanie tylko miękkiego pożywienia</br>"
							+ "-  ślinienie</br>" + "-  wytrzeszcz oka</br>" + " </br>"
							+ "Diagnozę lekarz postawi na podstawie oględzin zębów oraz zdjęcia RTG. Ropnie muszą być usunięte chirurgicznie (w narkozie), rana dobrze wypłukana, czasami konieczne jest usuniecie zęba. Na podstawie posiewu podaje się antybiotyk. Królik powinien przez pierwsze dni po operacji otrzymać środek przeciwbólowy. Rana po ropniu powinna być przez jakiś czas przemywana środkiem antyseptycznym raz- dwa razy dziennie. Zestresowany i obolały uszak może nie mieć apetytu dlatego powinniśmy go dopajać i dokarmiać (więcej w dziale dokarmianie).</br>"
							+ "</br>"
							+ "Ten typ ropni może niestety nawracać dlatego powinniśmy często kontrolować zęby i pyszczek uszaka oraz zwracać uwagę na jego zachowanie przy jedzeniu."));

			diseaseService.create(new Disease(12L, "Złamania zębów",
					"Królik może spaść np. z łóżka lub regalu tak niefortunnie, że dojdzie do złamania ząbków, niektóre uszaki lubią gryźć pręty klatki jeśli zahaczy się ząbkami, szarpiąc się w panice może złamać lub nawet wyrwać sobie siekacze. Złamania zębów trzonowych mogą być spowodowane niedoborem mikroelementów lub być skutkiem infekcji bakteryjnej, ropni czy silnego zapalenia warg.</br>"
							+ " </br>" + "Objawy:</br>" + "-  królik nie może odgryźć jedzenia</br>"
							+ "-  ssie lub liże swój pokarm</br>" + "-  wypluwa jedzenie</br>" + "-  ślini się</br>"
							+ "-  większość pożywienia zostaje nie zjedzona</br>" + "</br>"
							+ "Złamane siekacze odrastają same, jeśli są rożnej długości weterynarz je wyrówna. Zanim złamane ząbki odrosną trzeba ułatwić królikowi pobieranie pokarmu. Twarde warzywa ścieramy na grubej tarce (pozostałe zęby muszą się ścierać), zieleninę, miękkie warzywa i listki możemy posiekać nożem lub pokroić na paseczki szerokości mniej więcej 1 cm, długość obojętna, królik sobie poradzi. Początkowo uszak nie będzie umiał chwycić siana, ale po kilku dniach nauczy się, a i ząbki będą stopniowo odrastać. Należy skontrolować u weterynarza czy zdrowe zęby nie przerosły za bardzo, może się tak zdarzyć ponieważ królik je bardziej rozdrobnione pożywienie."));

			diseaseService.create(new Disease(13L, "Cukrzyca",
					"To bardzo rzadka i mało znana choroba królików, w naturze prawie nie występuje ponieważ dzikie króliki potrafią same kontrolować z pobieranym pokarmem poziom cukru.</br>"
							+ "  </br>" + "Najczęstszą przyczyna cukrzycy jest:</br>" + "- choroba trzustki,</br>"
							+ "- stres</br>" + "- otyłość i mało ruchu</br>" + "- nieprawidłowe żywienie</br>"
							+ "- skutek uboczny przejmowania lekarstw</br>" + "</br>" + "Objawy:</br>"
							+ "- duże pragnienie, chciwe picie</br>" + "- wahania wagi</br>" + "- chciwe jedzenie</br>"
							+ "- słabsza odporność, częste zachorowania</br>" + "- mgiełka na oczach, zaćma</br>"
							+ "- nadmierne siusianie lub niekontrolowane siusianie</br>"
							+ "- zmęczenie, częste spanie</br>" + "- śpiączka</br>" + "- drgawki</br>" + "- szok</br>"
							+ " </br>"
							+ "Diagnozę lekarz postawi na podstawie badan krwi. Poziom cukru zdrowego królika może się wahać pomiędzy 64, a 134 mg/dl ( 3,55 - 7,44 mmol/l ). Poprzez medykamenty także homeopatyczne i skorygowanie żywienia można wyrównać poziom cukru. W cięższych przypadkach cukrzycy konieczne jest podawanie insuliny. Podaje się ją zwykle 1-3 razy dziennie, wcześniej należy zrobić badanie krwi, aby ustalić poziom stężenia glukozy we krwi i dobrać odpowiednia dawkę leku. Badanie przeprowadzamy glukometrem dostępnym w aptece. Krew najłatwiej pobrać z ucha, jeśli żyły nie są dobrze widoczne należy lekko rozmasować ucho. Insulina powinna być przechowywana w lodowce w temperaturze 2°- 8 ° stopni. Źle dobrana dawka insuliny może być przykra w skutkach i być przyczyna:</br>"
							+ "</br>" + "Hypoglikemia (niedocukrzenie)</br>"
							+ "Następuje, jeśli królik dostanie zbyt duża dawkę insuliny. Objawy to drgawki całego ciała, niepokój, niekontrolowane ruchy, nagły głód, śmierć. Królik powinien natychmiast otrzymać roztwór glukozy w zastrzyku lub doustnie.</br>"
							+ "  </br>" + "Hiperglikemia</br>"
							+ "Jest to zbyt wysoki poziom cukru we krwi. Objawy to pragnienie, zmęczenie, problemy z utrzymaniem równowagi w najgorszym wypadku śpiączka. Trzeba natychmiast zareagować i podać królikowi insulinę.</br>"
							+ "</br>" + "Zdrowe odżywianie, czyli co służy \"słodkim\" królikom:</br>"
							+ "- zielenina i warzywa</br>" + "- siano, zioła, trawa</br>"
							+ "- owoce (kwaśne jabłka) rzadko od czasu do czasu orzech lub migdał w nagrodę</br>"
							+ "- płatki owsiane i chleb pełnoziarnisty (rzadko)</br>" + "</br>" + "</br>"
							+ "Czego \"słodkie\" uszaki nie powinny jeść:</br>"
							+ "- owoce: banany, winogrona, melony, gruszki, czereśnie, mirabelki, suszone owoce są tabu</br>"
							+ "- mieszanki i granulaty zawierają zbyt dużo cukru i skrobi</br>"
							+ "- przysmaki typu kolby i dropsy, miód</br>" + "</br>"
							+ "Zapewnijmy królikowi dużo ruchu, ruch sprzyja nam w walce z cukrzyca i pozwala na zachowanie super kondycji naszego futrzaczka."));

			diseaseService.create(new Disease(13L, "Padaczka (epilepsja)",
					"Niestety na temat tej choroby nie ma zbyt dużo informacji. Być może jedną z przyczyn występowania ataków jest wada serca, zbyt małe serce, które nie jest w stanie doprowadzić do wszystkich organów wystarczającą ilość tlenu. Królik wiedeński biały zapada częściej na epilepsje niż inne rasy.</br>"
							+ "</br>" + "Objawy:</br>" + "- silne drgawki tylnych skoków</br>"
							+ "- drgawki całego ciała</br>" + "- wywrócenie oczu</br>"
							+ "- otwarty szeroko pyszczek ze spływającą śliną</br>" + "- prężenie ciała</br>"
							+ "- niekontrolowane wydalanie moczu i kału</br>" + "- nieprzytomność</br>" + "</br>"
							+ "Nie wszystkie te objawy muszą występować naraz, może to być kilkusekundowe drżenie całego ciała lub tylnich kończyn. Należy jak najszybciej pójść z królikiem do weterynarza. Kompletne badanie krwi, EKG, USG serca i RTG pomoże ustalić lub wykluczyć przyczynę ataków np. guza mózgu, wadę serca, cukrzyce. Z pomocą lekarstw można ograniczyć ataki, królik ma szanse na długie i szczęśliwe życie.</br>"
							+ " </br>" + "Jak się zachować w czasie ataku:</br>"
							+ "- należy usunąć wszystkie twarde czy niebezpieczne przedmioty, o które królik mógłby się uderzyć</br>"
							+ "- należy wyłączyć radio i telewizje,</br>"
							+ "- przygasić światło, jeśli świeci słońce zasłonić okno zasłonką bądź roletą</br>"
							+ "- zachowywać się cicho, cicho mówić do zwierzaka</br>"
							+ "- w żadnym wypadku nie brać go na ręce</br>" + " </br>"
							+ "Po ataku królik czuje się jak gdyby nic się nie stało, wraca do swoich zajęć, ma apetyt. Po silnym ataku uszak może być zmęczony. Drgawki trwają mniej więcej do 30 sek."));

			diseaseService.create(new Disease(13L, "Udar słoneczny",
					"Króliki źle znoszą upały, nie umieją się pocić, ciepło regulują przez dobrze ukrwione uszy. W naturze żyją w norkach o długich korytarzach, na żer wychodzą wieczorem i rano kiedy nie jest już tak gorąco.</br>"
							+ " </br>" + "Jak możemy pomoc królikowi w gorące dni:</br>"
							+ "- w żadnym wypadku klatka bądź zagródkę nie może być wystawiona na słońce</br>"
							+ "- zwykle klatki sklepowe nie nadają się na balkon</br>"
							+ "- nie wystawiajmy uszaka w południe na balkon bądź do ogródka, późne południe i wieczór to przyjemniejsza dla królika pora</br>"
							+ "- mieszkanie i pokój powinno być dobrze przewietrzone</br>"
							+ "- króliki o długim futerku można ostrzyc, to wielka ulga dla królika</br>"
							+ "- w klatce i zagródce możemy powiesić zamrożone wkłady do przenośnych lodówek bądź butelki z wodą owinięte w ręcznik.</br>"
							+ "Ja zamrożone wkłady wkładam pod duży talerz na pizze, owijam w kocyk i daje na balkon, uszaki chętnie się kładą na takim posłaniu.</br>"
							+ "- w zagródce lub klatce można położyć kilka zwykłych kafelków, bądź jeden duży</br>"
							+ "- kuweta z piaskiem (można go lekko spryskać woda) przyjemnie chłodzi</br>"
							+ "- powieszone mokre ręczniki na klatce bądź zagródce nawilżają, dają cień i chłodzą powietrze</br>"
							+ "- wiatrak w pomieszczeniu (nie kierujmy go bezpośrednio na królika) każdy zna zalety tego urządzenia</br>"
							+ "- woda do picia powinna być zawsze dostępna</br>"
							+ "- jedzenie podajemy rano i wieczorem, w ciągu dnia tylko małe porcje</br>"
							+ "- wizyty u weterynarza lub transport powinny się odbywać wczesnym rankiem lub późnym popołudniem</br>"
							+ "- klimatyzacja w aucie nie powinna być nastawiona na zbyt zimna temperaturę uszak mógłby się przeziębić</br>"
							+ "- pamiętajmy, że \"słońce\" się przemieszcza i rano klatka może stać w cieniu, ale kilka godzin później może stać już w pełnym słońcu.</br>"
							+ "</br>" + "Objawy udaru:</br>" + "- szybki oddech</br>" + "- szybki puls</br>"
							+ "- brak reakcji \"nieobecność\" królika</br>" + "- uszak leży na boku i drży</br>"
							+ " </br>"
							+ "Natychmiast należy zabrać królika do chłodniejszego pomieszczenia. Podajmy mu wodę do picia. Chłodnym (nie zimnym jak lód!), wilgotnym ręcznikiem chłodzimy najpierw głowę i uszy królika zaraz potem stopy. Bierzemy uszaka i jedziemy do weterynarza. Lekarz ustabilizuje układ krążenia królika. Jeśli z jakiegoś powodu nie możemy jechać do weterynarza, udar może się skończyć śmiercią.</br>"
							+ "</br>"
							+ "Uwaga: nigdy nie wkładamy królika do zimnej wody może to doprowadzić do szoku termicznego !!! </br>"
							+ ""));

			diseaseService.create(new Disease(13L, "Dokarmianie",
					"Chory królik tak samo jak i chory człowiek nie ma specjalnie ochoty na jedzenie. Układ pokarmowy królika jest dosyć skomplikowany, dłuższe przerwy w jedzeniu mogą się skończyć zaparciami, wzdęciem, krwawieniami żołądka, otłuszczeniem wątroby, anoreksją i śmiercią zwierzaka. Nie możemy dopuścić, żeby uszak głodował, musimy sami go dokarmiać i dopajać strzykawka (bez igły) lub z pomocą łyżeczki. Rozgrzanym drutem można trochę powiększyć otwór w strzykawce. Dokarmiamy wsuwając koniec strzykawki z boku pyszczka, zaraz za siekaczami.</br>"
							+ " </br>"
							+ " Najlepsze produkty do dokarmiania to gotowe wysoko włókniste preparaty, które w swoim składzie zawierają oprócz ziół niezbędne witaminy, minerały i probiotyki. Najbardziej znane to Critical Care, Herbi Care Plus, Rodi Care i Dental Aid Herbi. Proszek miesza się z wodą wg przepisu na opakowaniu, uzyskana papka jest na tyle rzadka, że można ją bez problemu podać przez strzykawkę. Króliki zwykle chętnie ją jedzą. Można też odmierzoną ilość podać w miseczce jeśli uszak sam chce jeść, a ma np. kłopoty z ząbkami. Jedzenie podajemy co trzy godziny, wielkość posiłku to mniej więcej 1-2 łyżeczki. Potrawy powinny być letnie lub o temperaturze pokojowej.</br>"
							+ " </br>" + "Papki robione samemu:</br>"
							+ "1. W herbatce ziołowej moczymy granulat do którego nasz królik jest przyzwyczajony, możemy dodać zmielone w młynku suszone warzywa i owoce. Powstałą papką napełniamy strzykawkę, podajemy uszakowi.</br>"
							+ "</br>"
							+ "2. Seler, marchewkę i jabłko (banan) pokroić w kostkę i ugotować, miękkie zmiksować i ostudzić. Puree podać uszakowi. Warzywa można dowolnie zmieniać, można dodać suszony koperek bądź natkę.</br>"
							+ "</br>"
							+ "3. Jako urozmaicenie diety chorego malucha możemy użyć warzywnych (bezmięsnych) zupek dla niemowląt. Siano kroimy na małe kawałeczki, mielimy w młynku i mieszamy z zupka.</br>"
							+ "</br>"
							+ "4. Suszone lub świeże zioła mielimy dodajemy do zupki lub marchewki dla niemowląt.</br>"
							+ " </br>"
							+ "Dwa razy dziennie do papki zrobionej przez nas dodajemy probiotyk np. Lakcid lub Omniflora N pół kapsułki rano i pół wieczorem. Probiotyk utrzyma środowisko bakteriologiczne układu pokarmowego w równowadze, która może być zachwiana po chorobie i w wyniku zmienionej diety/dokarmiania, rzadszych posiłków.</br>"
							+ " </br>"
							+ "Uszakom, które mają problemy z gryzieniem, ale mogą jeść i chętnie same jedzą ścieramy warzywa na tarce o grubych oczkach. Miękkie części roślin wystarczy pokroić na mniejsze kawałki. Dobrym ułatwieniem jest pokrojenie pokarmu w centymetrowe paseczki.</br>"
							+ "</br>"
							+ "Zwierzakom wychudzonym podajemy zwiększoną ilość warzyw korzeniowych, możemy od czasu do czasu podać gotowanego ziemniaka z odrobina płatków owsianych."));

			diseaseService.create(new Disease(13L, "Mykotoksyny",
					"Mykotoksyny są truciznami, które degradują organizm, w którym się znajdują. Trucizna ta znajduje się na pożywieniu nawet gdy już nie ma na niej pleśni. Mykotoksyny, są komórkobójcze, to znaczy że niszczą błony i struktury komórkowe, utleniają białko z organizmu jak również spowalniają syntezę.</br>"
							+ " </br>"
							+ "Powinniśmy zwrócić szczególną uwagę na pożywienie, czy nie jest zapleśniałe. Pod żadnym warunkiem nie podawajmy żywności, u której podejrzewamy chociażby zalążki pleśni, pleśń może powodować szereg poważnych chorób, które bez szybkiej reakcji mogą okazać się śmiertelne.</br>"
							+ " </br>"
							+ "Pleśń powstaje przy zmianach temperatur, szczególnie jest na nie narażona żywność w czasie zimy, gdy kupujmy np. siano na bazarach. Spleśniałe pożywienie wydziela trucizny, nazywane mykotoksyny.</br>"
							+ "</br>"
							+ "Pleśń na pożywieniu osiąga rożne barwy/ kolory, powinniśmy zwrócić szczególną uwagę na barwę: żółtą, żółto-zieloną, brązową, czarną, białą i różową, na pożywieniach, na których ten kolor nie powinien być spotykany.</br>"
							+ "</br>"
							+ "Obecność trucizny w organizmie w początkowej jej fazie jest praktycznie niezauważalna, a gdy jej objawy są widoczne, organizm w którym się znajdują jest już zazwyczaj bardzo wyniszczony, że jego leczenie jest nadzwyczaj trudne, lub praktycznie niemożliwe, co kończy się śmiercią.</br>"
							+ "</br>"
							+ "Najczęstszymi powodami powstawania mykotoksyn jest niewłaściwe przechowywanie żywności, tj. trzymanie siana w szczelnie zamkniętych plastikowych workach, zbieranie traw w zabrudzonych miejscach. Niewłaściwe składowanie pasz i granulatów.</br>"
							+ "</br>"
							+ "Objawy spowodowane przez Mykotoksyny, są różnorodne i zazwyczaj bardzo podobne do innych chorób, dlatego poprawna ich diagnoza jest bardzo trudna.</br>"
							+ "</br>" + "Mykotoksyny mogą powodować:</br>"
							+ "- Problemy gastryczne (zator, wzdęcia, krwotoki jelitowe)</br>"
							+ "- Wrzody żołądka,</br>" + "- Uszkodzenie nerek</br>" + "- Problemy wątrobowe</br>"
							+ "- Uszkodzenie centralnego układu nerwowego (drgawki, chwilowy paraliż)</br>"
							+ "- Osłabienie układu odpornościowego (częste zapadanie na inne choroby, podatność na różnego rodzaju inne wirusy).</br>"
							+ "- Raka,</br>" + "- Problemy z oczami,</br>" + "- Problemy z płucami,</br>"
							+ "- Osłabienie możliwości reprodukcyjnych,</br>" + "- Problemy płucne,</br>"
							+ "- Problemy sercowe,</br>" + "- Problemy skórne,</br>" + "- Uszkodzenie kości,</br>"
							+ "- Uszkodzenie układów naczyniowych. </br>" + "</br>"
							+ "Właśnie z wyżej wymienionych powodów tak trudno jest zdiagnozować istnienie mykotoksyn w organizmie, jedynym pewnym sposobem są badania toksykologiczne.</br>"
							+ "</br>"
							+ "Nie będę podawać objawów jakie występują przy obecności tej trucizny, powodem jest że te objawy można przypisać szeregowi innych chorób, stąd niezbędna jest wizyta u weterynarza, który powinien przeprowadzić bardzo szczegółowe badania, wraz z wywiadem, co królik ostatnio jadał itp.</br>"
							+ "</br>" + "Przy dobrej diagnozie pomocne może się okazać badanie pożywienia.</br>"
							+ "</br>" + "Jak my możemy zminimalizować obecność mykotoksyn w pożywieniu królika?</br>"
							+ "- Nie karmmy królików starą i wilgotną żywnością,</br>"
							+ "- Zapewnijmy stały dostęp do świeżego siana i wody,</br>"
							+ "- Kupujmy dobre jakościowo karmy ze sprawdzonych źródeł.</br>"
							+ "- Nie zbierajmy traw i siana w miejscach zanieczyszczonych (np. przez samochody, lub obecność zakładów przemysłowych),</br>"
							+ "- Zwracajmy uwagę na jakość siana, szczególnie w porach zimowych.</br>" + "</br>"
							+ "Nie podawajmy suchego pieczywa, ponieważ często znajdują się w nim zarodniki pleśni mimo, że gołym okiem ich nie widać.</br>"
							+ "</br>"
							+ "Niektóre pleśnie np. z rodzaju Fusarium atakują zboże: pszenice, jęczmień, kukurydze już w okresie wzrostu. Chratoksyny powstają podczas składowania i przechowywania produktów, a alfatoksyny powstają w klimacie tropikalnym i są do nas sprowadzane np. z wiórkami kokosowymi, fistaszkami, migdałami w zbożu."));

			diseaseService.create(new Disease(14L, "Apteczka",
					"Lakcid - probiotyk, stosuje się w czasie i po antybiotykoterapii, przy biegunkach , profilaktycznie dla utrzymania prawidłowego składu mikroflory jelitowej. Jedną kapsułkę dziennie, można ją podzielić i podać po pół rano i wieczorem. Inne probiotyki to Perenterol i Omniflora N</br>"
							+ "</br>"
							+ "Echinacea (jeżówka purpurowa) - Pobudza układ odpornościowy, pomocna przy chorobach układu oddechowego, katarku - kilka listków suszonej jeżówki dziennie lub w kroplach 1-2 krople dziennie</br>"
							+ "</br>"
							+ "Espumisan - łagodzi wzdęcia, podajemy: pół kapsułki dwa razy dziennie, w kroplach 1ml co 6 godz.</br>"
							+ "</br>"
							+ "Koper i herbatka koperkowa - poprawia apetyt, działa rozkurczowo, pomocny podczas nieżytu żołądka.</br>"
							+ " </br>"
							+ "Krople Bacha Rescue - łagodzą stres np. podczas wizyty u weterynarza lub transportu, w okresie zaprzyjaźniania. Podajemy po trzy krople, trzy razy dziennie, podając bezpośrednio do pyszczka musimy kropelki rozcieńczyć w wodzie lub soku, ponieważ są na alkoholu. Możemy je podać np. na kawałeczku jabłka lub w ostateczności kropelki wetrzeć w uszy królika.</br>"
							+ " </br>" + "Suszone jagody lub herbatka z suszonych jagód - hamuje rozwolnienie.</br>"
							+ "</br>"
							+ "Mięta i herbatka z mięty - poprawia apetyt, wzmacnia, zapobiega wzdęciom (hamuje wydzielanie mleka, nie dajemy mamom karmiącym).</br>"
							+ " </br>"
							+ "Maść Bepanthen - uszkodzenia i otarcia naskórka, ugryzienia, rany i odgniotki na stopach</br>"
							+ " </br>"
							+ "Nagietek i herbatka z nagietka - działa przeciwzapalnie, przeciwskurczowo, oczyszczająco i poprawia apetyt. Stosuje się przy nieżytach żołądka.</br>"
							+ " </br>"
							+ "Parafina ciekła - powleka błonę śluzową jelit, co powoduje rozmiękczenie mas kałowych i ułatwia wypróżnienie, podczas zaparć, profilaktycznie kropelkę dziennie podczas linienia (połączone bobki - koraliki), co trzy godz. jeśli królik ma zaparcie: W ostateczności można zastosować olej słonecznikowy bądź rzepakowy.</br>"
							+ " </br>"
							+ "Pasta odkłaczająca - rozpuszcza zalęgające włosy, w okresie linienia profilaktycznie 1 cm pasty dziennie.</br>"
							+ "</br>"
							+ "Rumianek (herbatka) - działa przeciwzapalnie, przeciwskurczowo, uspokajająco, przeciwbakteryjnie i dezynfekująco. Stosujemy podczas nieżytów żołądka.</br>"
							+ "</br>"
							+ "Siemie lniane - wywar z gotowanego siemienia lnianego stosuje się w przypadku zaparć, łyżeczkę siemienia zalewamy pół szklanki wody gotujemy aż powstanie \"kisiel\", studzimy i podajemy sam wywar (bez ziaren).</br>"
							+ "</br>" + "Świetlik - herbatkę stosuje się do przemywania podrażnionych oczu</br>"
							+ " </br>"
							+ "Tymianek - działa przeciwzapalnie, wykrztuśnie, rozrzedza wydzielinę, wzmacnia odporność, dezynfekuje - stosuje się w chorobach układu oddechowego (inhalacje, herbatka do picia)</br>"
							+ " </br>"
							+ "Vibowit - (witaminy w kroplach dla niemowląt), dla zwierząt osłabionych, dostarcza witamin, wzmacnia odporność zwłaszcza w zimowe i jesienne dni.</br>"
							+ "</br>"
							+ "Critical care/ Herbi Care Plus - gotowy preparat do dokarmiania królików w czasie choroby, wysoko włóknisty, bogaty w witaminy. i elektrolity, dba o florę bakteryjna jelit i uzupełnia minerały.</br>"
							+ " </br>"
							+ "Sól fizjologiczna- płyn nawadniający  stosowany w medycynie. Można nim przemywać oczy królika oraz wszelkie rany, nawet pokryte strupami.</br>"
							+ "</br>"
							+ "Szałwia - zapobiega infekcjom, dezynfekuje, hamuje rozwolnienie, działa bakteriobójczo i wspomaga trawienie, hamuje wydzielanie mleka. Podawana codziennie ( 2-3 listki ) zapobiega ciążą urojonym i łagodzi ruje.</br>"
							+ "</br>" + "Inne:</br>" + "Strzykawka do dokarmiania</br>"
							+ "Nożyczki do obcinania paznokci</br>" + "Termometr</br>" + "Termofor"));

		};
	}
}
