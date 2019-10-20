package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.Care;
import pl.justyna.HelloBunnies.service.CareService;

@Configuration
public class CareDataInitializeConfig {

	@Autowired
	private CareService careService;

	@Bean
	public InitializingBean insertCareInitialData() {
		return () -> {

			careService.create(new Care(1L, "Oswajanie królika",
					"Zanim rozpoczniemy proces oswajania, pozwólmy królikowi zapoznać się z klatką i nowym otoczeniem. Pozwólmy mu odpocząć i poczuć się bezpiecznie w nowym domu. Może się zdarzyć, że królik sam po dwóch dniach zacznie wykazywać zainteresowanie światem poza klatką oraz naszą osoba. Najlepszym patentem na oswajanie jest, usiąść razem z królikiem na podłodze, aby mieć lepszy kontakt. Należy dużo mówić do królika aby przyzwyczaił się do naszego głosu. Często po glosie i jego tonacji królik wie, że coś jest dobre, a czegoś nie wolno mu robić. Króliki są bardzo ciekawskie, więc prawdopodobnie ciekawość przezwycięży strach i uszaty szybciutko zacznie ocierać bródką wszystkie zakamarki domu, łącznie z opiekunem. W ten sposób pozostawia swój zapach, który daje mu poczucie bezpieczeństwa. Nie należy królika do niczego zmuszać. Stopniowo możemy głaskać pupila za uszkami i poczęstować rodzynka, aby uszaty dostrzegł, że ma w nas przyjaciela. Wszystko zależy od królika i jego charakteru. Zawsze potrzebna jest cierpliwość, i nic nie robimy na siłę!!! Króliki nie lubią brania na ręce, prawdopodobnie z natury kojarzy się im to z niebezpieczeństwem. Ale kiedy obdarzą opiekuna zaufaniem, strach ten zmaleje. Należy prawidłowo podnosić królika, biorąc go na ręce aby nie zrobić mu krzywdy (patrz podnoszenie królika)"));

			careService.create(new Care(2L, "Zrozumieć królika, czyli królicza mowa", "Dźwięki</br>" + "</br>" + "</br>"
					+ "Popiskiwanie - tak maluchy wzywają swoja mamę, starsze króliki piszczą kiedy się czegoś boją. </br>"
					+ "</br>"
					+ "Warczenie i prychanie - jest to dźwięk ostrzegawczy, jeśli go zignorujemy królik pomoże sobie ząbkami.</br>"
					+ "</br>"
					+ "Bzyczenie i ósemki wokół nóg - to oznaka pobudzenia seksualnego, z braku partnera króliki często znajdują sobie zastępczy obiekt seksualny mianowicie kończyny opiekuna.</br>"
					+ "</br>"
					+ "Mielenie ząbkami - najczęściej królik robi tak gdy go głaszczemy lub gdy drzemie, to znak błogostanu coś jak mruczenie kota.</br>"
					+ "</br>"
					+ "Szczekanie zębami - oznaka bólu, królik siedzi skulony, ma brzydką sierść, widać, że cierpi, trzeba natychmiast udać się z nim do weterynarza.</br>"
					+ "</br>"
					+ "Krzyk - podobny do krzyku dziecka, jest wydawany tuż przed śmiercią, może być też oznaka przerażenia lub bólu. Raz usłyszany na długo pozostaje w pamięci.</br>"
					+ "</br>" + "</br>" + "</br>" + "Mowa ciała</br>" + "</br>" + "</br>"
					+ "Tupanie - to ostrzeżenie, królik się boi, tupiąc ostrzega nas przed niebezpieczeństwem. Może też być oznaka niezadowolenia. Uwaga tupanie może być oznaka silnego bólu brzucha spowodowanego wzdęciami. Należy szybko udać się z królikiem do weterynarza.</br>"
					+ "</br>"
					+ "Dzikie skoki - z obrotami w powietrzu, wyrzucaniem nóg na boki, piruetami i potrząsaniem łebka, to oznaka radości i szczęścia, zwana przez nas głupawką.</br>"
					+ "</br>"
					+ "Przesuwanie i rzucanie przedmiotami - to jedna z zabaw króliczych, doskonale nadają się do tego rolki po papierze toaletowym, wiklinowe kule lub kula smakula, z braku zabawek królik może rzucać miseczkami lub co gorsza kuweta.</br>"
					+ "</br>"
					+ "Kopanie - to wrodzona potrzeba królika, w naturze króliki spędzają dużo czasu na kopaniu, przekopywaniu, sprzątaniu i poszerzaniu tuneli. W mieszkaniu nie mają tej możliwości często więc wyszukują sobie coś w zastępstwie, kopią w rogu klatki i w pościeli, przekopują nasze ubrania,</br>"
					+ "ręcznik, dywanik, róg kanapy itd. Należy umożliwić królikowi kopanie, sprawi mu to ogromną frajdę, można umieścić w kartonie ścinki papieru lub napełnić kuwetę piaskiem, można położyć w klatce ręcznik, królik będzie go układał, przesuwał i przekładał.</br>"
					+ "</br>"
					+ "Wąchanie - czasami jest to zwykła ciekawość \"co masz?\", nosek jest barometrem królika, im szybciej drga tym większe jest podenerwowanie i stres, można to zaobserwować np. u weterynarza. Szybki oddech i drganie noska w upały może wskazywać na udar .</br>"
					+ "</br>"
					+ "Ucieczka - dobrze widoczna biel spodnia ogonka jest ostrzeżeniem dla innych \"kryć się, niebezpieczeństwo\", zostawmy uszaka w spokoju, niech się uspokoi i sam do nas wyjdzie.</br>"
					+ "</br>"
					+ "Ogonek poruszający się szybko w prawo i lewo - jest oznaka dezaprobaty lub zniecierpliwienia \" no pokaż co przyniosłaś, schyl się\".</br>"
					+ "</br>" + "Trącanie noskiem – \"cześć\", \"pobawimy się\" \"czas na pieszczoty\".</br>" + "</br>"
					+ "Energiczne trącanie pyszczkiem - \"dosyć głaskania\" lub \" posuń się\", jeśli zignorujemy to upomnienie ząbki lub pazurki pójdą w ruch.</br>"
					+ "</br>"
					+ "Lizanie - to oznaka wielkiej sympatii, tak miedzy sobą uszaki wymieniają pieszczoty, liżą sobie oczka, pyszczek, nosek i uszka.</br>"
					+ "</br>"
					+ "Mycie - króliki spędzają dużo czasu na pielęgnacji swojego futerka. Wzajemne mycie się służy wzmacnianiu więzi pomiędzy uszakami i sprawia im wiele przyjemności.</br>"
					+ "</br>"
					+ "Ujeżdżanie - nie tylko świadczy o gotowości do seksu, to także oznaka dominacji. Wyżej rangą króliki skaczą na te niżej stojące w hierarchii, jest to umacnianie pozycji lub przywoływanie do porządku.</br>"
					+ "</br>"
					+ "Wyrywanie sierści - samiczki w ciąży i w ciąży urojonej wyrywają sobie sierść z przednich łapek i brzucha i wyściełają nią gniazdko. Królice mogą być w tym czasie agresywne, niespokojne i nie mięć apetytu, także kopanie jest bardziej intensywne.</br>"
					+ "</br>"
					+ "Rzucanie się na bok - najczęściej po dobrej zabawie królik rzuca się ostentacyjnie na bok tam gdzie akurat stoi, oczka opadają uszak zasypia. Wielu opiekunów widząc takie zachowanie boi się, że królik strącił przytomność lub, że ma chore serce, nic podobnego, wszystko w najlepszym porządku, uszak się zmęczył i ma ochotę na drzemkę. Po wysiłku można zauważyć szybkie drganie główki i brzuszka to też normalne, uszak się zziajał, czas na relaksujący sen.</br>"
					+ "</br>"
					+ "Przewracanie na plecki - pełny relaks, moje tak robią w piaskownicy, przewracają się z jednego boku na drugi, łapy w górze, \"ach jak wspaniale\".</br>"
					+ "</br>"
					+ "Przestraszony królik - taki który nie miał szans uciec przywiera płasko do ziemi, oczy ma szeroko otwarte, szybki oddech, uszy położone na ciele, nie rusza się. Wiele drapieżników reaguje na ruch, skamieniały królik ma szanse, ze wróg go nie zauważy.</br>"
					+ "</br>"
					+ "Jeśli zauważymy, że nasz królik też się tak zachowuje zostawmy go w spokoju, uciekając w panice może zrobić sobie krzywdę.</br>"
					+ "</br>"
					+ "Pozycja ostrzegawcza - uszy na plecach, głowa nisko, ciało napięte, omyk w górze, atak może być poprzedzony warknięciem, lepiej zejdźmy uszakowi z drogi.</br>"
					+ "</br>"
					+ "Pozycja poddańcza - głowa nisko, ciałko skulone, uszy po sobie, tak królik pokazuje, że jest niżej w hierarchii.</br>"
					+ "</br>"
					+ "Słupek - w tej pozycji królik widzi co się dzieje na dalszą odległość , może tez wyłowić więcej zapachów i dźwięków, domowe króliki nauczyły się w ten sposób prosić. </br>"
					+ "</br>"
					+ "Ciekawość - ciało, pyszczek i uszy skierowane do przodu, nosek szybko się porusza, jeśli uszak chce zobaczyć nieznany przedmiot lub nowego towarzysza porusza się powoli na sztywnych łapach w kierunku obiektu, napięte ciałko jest gotowe do ucieczki.</br>"
					+ "</br>"
					+ "Podkładanie lepka pod rękę lub łepek partnera - czas na pieszczoty, pogłaszcz mnie, umyj mnie.</br>"
					+ "</br>"
					+ "Gryzienie klatki - królik jest samotny i się nudzi, chce do swojego opiekuna, chce się bawić, biegać, skakać, wypuuuusccie mniee !!! Króliki szybko się uczą, ze hałas przyciąga uwagę opiekuna, doskonale wiedzą, które druty poruszyć żeby było jak najgłośniej, niektóre pomagają sobie</br>"
					+ "miska, uderzając nią o kraty. Każda klatka to wiezienie dla królika, nie skazujmy go na nią, jest przecież naszym przyjacielem.</br>"
					+ "</br>" + "</br>" + "</br>" + "Znaczenie </br>" + "</br>" + "</br>"
					+ "Brodkowanie, czyli pocieranie broda przedmiotów - pod broda znajduje się gruczoł zapachowy, pozostawiając zapach na rożnych przedmiotach królik je podpisuje \"to moje\", mój rewir, moje krzesło, moja pani, moja marchewka, brodkujac uszak zapamiętuje też gdzie dany przedmiot stoi,</br>"
					+ "należy o tym pamiętać mając królika niewidomego lub niedowidzącego. Królicze mamy oznaczają w ten sposób swoje młode.</br>"
					+ "</br>"
					+ "Spryskiwanie - to najbardziej denerwujące znaczenie terenu, zaczyna się około 5-6 miesiąca życia, króliki spryskują strumieniem moczu swoje włości, ukochana samiczkę, króliki które niżej stoją w hierarchii, przedmioty, rośliny, pościel itd. Nawet czyste króliki, które do tej pory ładnie korzystały z kuwety podczas zaprzyjaźniania mogą zacząć znaczyć teren i nowego kolegę. Po okresie zaprzyjaźnienia powinno wszystko wrócić do normy. Samiczki mogą znaczyć podczas rui. Spryskiwanie może być tez kara za coś co się królikowi nie spodobało.</br>"
					+ "</br>"
					+ "Bobki - większa cześć bobków wpada do kuwety, ale niektóre są celowo pozostawiane na podłodze, śluza one oczywiście do oznaczenia terenu, jest to znak dla obcego królika \"wstęp wzbroniony, teren zamieszkany\". Króliki w okresie dojrzewania, w okresie rui i zaprzyjaźniania zostawiają więcej takich \"pachnących\" niespodzianek, perfumowanych dodatkowo wydzielina z gruczołów zapachowych wokół odbytu. Po tym zapachu inne króliki mogą odczytać płeć właściciela bobków, wiek, przynależność do grupy i w przypadku samic czy maja młode czy nie.</br>"
					+ "</br>" + "</br>" + "</br>" + "Jak króliki śpią (na wesoło)</br>" + "</br>" + "</br>"
					+ "Na kurkę - króliki, które nie są jeszcze oswojone często śpią w ten sposób, także uszaki chore lub takie, które maja ochotę na krótką drzemkę. Wbrew pozorom nos i uszy są nastawione na odbiór.</br>"
					+ "</br>"
					+ "Na boczku - relaksująca drzemka, jedna z ulubionych pozycji królika, uszy czuwają, zaniepokojony królik szybko stanie na nogi.</br>"
					+ "</br>" + "Na pieska - łepek oparty na łapkach, pełny relaks, odpływamy</br>" + "</br>"
					+ "Na żabę - to też drzemka z łapkami wyrzuconymi do tylu, trochę śpimy, trochę czuwamy</br>"
					+ "</br>"
					+ "Na zdechlaczka - królik wie, że nic mu nie grozi, śpi twardo z odsłoniętym brzuszkiem, zawsze mnie rozbraja ta pozycja</br>"
					+ "</br>" + "Sen zbiorowy, czyli wszyscy na kupie - tak najbezpieczniej i najprzyjemniej. "));

			careService.create(new Care(3L, "Obcinanie pazurów",
					"To jeden z podstawowych zabiegów pielęgnacyjnych u królików. W naturze, króliki ścierają pazury poruszając się po twardych powierzchniach, niestety króliki miniaturowe (udomowione) nie mają ku temu zbyt wielu okazji. Przerośnięte pazurki wykrzywiają się  stanowiąc zagrożenie i sprawiają ból królikowi, a co za tym idzie zmniejsza się jego aktywność ruchowa i uszatek staje się osowiały.</br>"
							+ "O obcięcie pazurków można poprosić weterynarza, który z racji wykonywanego zawodu wie doskonale jak taki zabieg przeprowadzić. Można oczywiście wykonać to samemu w domu, ale musimy pamiętać o kilku ważnych zasadach.</br>"
							+ "Należy posiadać odpowiednie do tej czynności cążki lub nożyczki. Obecnie każdy dobry sklep zoologiczny posiada w swojej ofercie kilkanaście rodzajów i wielkości cążków, nożyczek, w całkiem przystępnych cenach. A co najważniejsze to odpowiedni sprzęt zmniejsza ryzyko zrobienia krzywdy maluchowi. Cążki przykładamy 3-4mm od części ukrwionej pazurka tzw. miazgi (jest to różowa żyłka, która najlepiej jest widoczna przy pazurkach białych, pozbawionych pigmentu). Gdy mamy do czynienia z ciemną barwą pazurków, i nie bardzo widzimy w którym miejscu zaczyna się cześć ukrwiona możemy podświetlić pazurek latarką. Gdy i to nie daje nam pewności najlepiej obcinać same czubki.</br>"
							+ "Gdyby jednak okazało się, iż mimo ostrożności  przycięliśmy pazur za daleko a co za tym idzie naruszyliśmy miazgę, należy krwawiący pazur przemyć wacikiem z woda utleniona i chwileczkę przytrzymać. Dzięki temu krwawienie powinno szybko ustąpić. OBSERWUJ JAK GOI SIĘ RANA, to bardzo ważne. Króliczek w ramach swoich możliwości będzie sobie wylizywał pazurka co powinno przyśpieszyć gojenie. Jeśli jednak pazurek będzie dalej krwawił, bądź zauważymy iż sprawia ciągły ból NALEŻY NATYCHMIAST UDAC SIĘ DO WETERYNARZA</br>"
							+ "Za ok. 2miesiace od skracania należy ponownie skontrolować, długość. Pazury przednie rosną szybciej niż te z tylnich łapek, więc wymagają częstszego skracania. Uszatki posiadają po 5 pazurów w łapkach przednich i po 4 w tylnich. Pamiętajmy, skracanie pazurów tak dla nas jak i dla królika jest sytuacja stresującą,dlatego Najlepiej wypracować sobie swój własny sposób obcinania, i mieć pod ręka osobę która w razie potrzeby pomoże opanować sytuacje."));

			careService.create(new Care(3L, "Wyłamany pazur", "Niestety taka sytuacja może mieć miejsce.</br>"
					+ "Zazwyczaj przyczyny są dwie: przerośnięte pazury lub złe ułożenie łapki podczas skoku. </br>"
					+ "Królik prawdopodobnie nie pozwoli sobie dotknąć pazurka, dlatego iż sprawia mu on ból.</br>"
					+ "Możliwe jest, że uszatek będzie chwilowo utykać i do tego może pojawić się odrobina krwi. Nie panikujmy, to naturalna kolej rzeczy.</br>"
					+ "Co robić:</br>"
					+ "Należy polać pazur choćby na oślep woda utleniona i pozwolić uszatkowi, aby sam sobie wylizywał bolący pazur. W kolejnych dniach wszystko powinno wracać do normy, a wyłamany pazur po pewnym czasie odpadnie a na jego miejsce wyrośnie nowy zupełnie zdrowy. Czas jaki upłynie do momentu kiedy pazur odpadnie jest indywidualny dla każdego królika. Jeśli zauważymy iż przez kolejne dni królik ma problemy z chodzeniem-utyka, należy udać się do weterynarza!!!"));

			careService.create(new Care(3L, "Linienie",
					"Królik linieje 4 razy do roku. Cykl ten może jednak być zaburzony z powodu stałej temperatury jaka panuje w naszych mieszkaniach. Zazwyczaj czas trwania linienia waha się od tygodnia do miesiąca. Ale ostatecznie jest to sprawa indywidualna każdego króliczka. Bardzo ważne jest aby w tym czasie intensywnie wyczesywać uszatka. Oczywiście myje się on sam na bieżąco, ale większa ilość połkniętego futerka, może doprowadzić do niebezpiecznego dla zdrowia zatoru w układzie pokarmowym. Do wyczesywania, powinniśmy zaopatrzyć się w odpowiednią szczotkę bądź grzebień. Obecnie na rynku jest duży wybór. Pamiętajmy jednak aby dana szczotka była funkcjonalna w wyczesywaniu i aby nie kaleczyła skóry. W tym czasie uszatek powinien mieć dużo ruchu, mnóstwo siana, które dba o prawidłowe funkcjonowanie układu pokarmowego. To nie jest również dobry okres aby wprowadzać do diety malucha nowych pokarmów. Nigdy nie mamy pewności jak układ pokarmowy zareaguje na nowy produkt. Obserwujmy nasze pociechy, to najlepszy sposób aby szybko wykryć, że coś jest nie tak. Spadek aktywności, brak bobków, brak apetytu to wystarczające sygnały do niepokoju.</br>"
							+ "W czasie linienia można podawać specjalną pastę dostępna w sklepach zoologicznych.</br>"
							+ "Pasta ta ma na celu rozpuszczanie zalegającej w układzie pokarmowym sierści. Można również podać, świeżo wyciśnięty sok z ananasa, który zawiera enzymy rozpuszczające sierść, bądź pól kiwi dwa razy w tygodniu lub plasterek dziennie."));

			careService.create(new Care(3L, "Czyszczenie futerka",
					"Królik myje się sam. Może się zdarzyć, iż od biegunki ma brudny kuperek, wtedy wilgotną ściereczką należy przetrzeć kilkakrotnie futerko. NIE KĄPIEMY KRÓLIKA wyjątkiem są kąpiele lecznicze przy chorobach skóry zalecone przez weterynarza, bądź w skrajnym przypadku przy bardzo silnej i długotrwałej biegunce.</br>"
							+ "Musimy uważać aby nie zamoczyć głowy króliczka, oraz pamiętać aby po kąpieli dobrze wytrzeć malucha i zapewnić mu przebywanie w ciepłym pomieszczeniu, pozbawionym przeciągów.</br>"
							+ "Zawsze podczas codziennych pieszczot warto zwrócić uwagę na to czy futerko jest czyste-zwłaszcza kuperek. Ponieważ brudne futerko w okolicach odbytu przyciąga muszki a stąd już tylko kilka kroków do nieszczęścia (czyt. W chorobach-larwy much)."));

			careService.create(new Care(3L, "Króliki długowłose",
					"Chyba nikt nie ma wątpliwości, iż króliki długowłose (zwane angorami) zapierają dech w piersiach. Niestety ogrom zabiegów pielęgnacyjnych również zapiera dech. Obfita bujność futerka dobiegająca do kilkunastu centymetrów nie pozwala na wykonanie wszystkich zabiegów higienicznych samemu królikowi. Dlatego musimy wziąć sprawy w swoje ręce. </br>"
							+ "Oczywiście samo strzyżenie też nie należy do przyjemnych rzeczy ani dla nas, ani dla uszatka..</br>"
							+ "</br>"
							+ "Tak czy inaczej priorytetem jest wyczesywanie. I niestety nie tylko podczas linienia ale systematycznie co dziennie max co dwa dni. Na rynku jest wiele szczotek i grzebieni, u nas świetnie się sprawdza taki z obrotowymi ząbkami, dzięki temu nie ciągnie. Pamiętajmy, że najważniejsze przy wyborze to, aby końce szczotki nie były ostre i nie raniły skory.</br>"
							+ "</br>"
							+ "Są dwa zasadnicze powody dla których wyczesywanie jest tak ważne. Pierwsze to - zapobiega tworzeniu się kołtunów. Kołtuny tworzą się z sfilcowanej sierści, często dochodzą do tego kawałki siana czy ściółki. I kołtun gotowy. Nie należy ich rozczesywać-bo sprawia to uszatkowi duży ból. Najlepiej po prostu próbować wyciąć. Dostępne są również rozcinacze, które bardzo ułatwiają pozbycie się kołtunika. Pamiętajmy jednak, że są one bardzo ostre i musimy używać ich bardzo ostrożnie. Najpierw delikatnie podczas głaskania wyszukujemy palcami kołtun. Delikatnie w środek kołtuna wkładamy rozcinacz i przytrzymując (aby nie sprawiać królikowi bólu) delikatnie rozcinamy. Zazwyczaj taki rozcięty kołtun w dwóch częściach daje się łatwo wyciągnąć. Jeśli sprawa wygląda na bardziej skomplikowaną, a niestety często tak się zdarza, należy rozcięty kołtun na dwie połówki rozciąć ponownie umieszczając rozcinacz w środku każdej z połówek. W skrócie jeden wielki kołtun zostaje rozcięty na cztery małe. Wszystko to wymaga delikatności i dużo cierpliwości. Pamiętajmy, że dla królika też jest to mało komfortowa sytuacja, dlatego nie zmuszajmy go na siłę, aby koniecznie w danym momencie siedział spokojnie. Do takich czynności bardzo dobrze sprawdza się mała ograniczona przestrzeń np.: parapet okienny bądź stolik.</br>"
							+ " </br>"
							+ "Kołtuny należy likwidować jak najszybciej, gdyż mogą powodować odparzany. Najczęściej tworzą się w miejscach najtrudniej dostępnych. Na podbrzuszu, pod szyja, pod ogonem i w okolicach zadku.</br>"
							+ "Zdecydowanie eliminujemy trociny z otoczenia królika.</br>"
							+ "Na rynku jest sporo preparatów, zazwyczaj w spreju bądź proszku, które mają na celu odświeżenie futerka i zapobieganie filcowaniu.</br>"
							+ "</br>"
							+ "Pamiętajmy, że krótka fryzurka dla angory wskazana jest zwłaszcza latem, kiedy to dotykają nas naprawdę wysokie temperatury.</br>"
							+ "</br>"
							+ "Kolejnym i bardzo częstym problemem przy królikach długowłosych jest \"zatykanie\" się. Nasze pociechy podczas codziennej toalety (zwłaszcza w czasie linienia) połykają duże ilości włosów, które bardzo często filcują się w organizmie powodując zatkanie, które, nie leczone prowadzi do śmierci. Pierwszym sygnałem jest widok bobków połączonych ze sobą włoskami tzw. koraliki </br>"
							+ "</br>"
							+ "Wiele osób, w takiej chwili podaje pasty odkłaczające. Na te dolegliwość profilaktyczne można podać dwa razy w tygodniu po połówce owocu kiwi. Kiwi zawiera w swoim soku enzymy, które rozpuszczają w organizmie nagromadzone futro. Kolejnym sposobem jest podanie ciekłej bezzapachowej parafiny. Bezzapachową ciekłą parafinę w strzykawce 2 ml, podajemy co dwie godziny do pyszczka królikowi około 1-2ml (w zależności od wielkości królika) parafiny tylko bardzo powoli, bo niestety jej smak nie należy do najlepszych, a co za tym idzie nasz uszatek będzie się wzbraniał, przed podaniem.. Zdrowe futerko królika lśni, przyjemnie pachnie i jest pozbawione kołtunów."));

			careService.create(new Care(3L, "Pasty i dodatki odkłaczające",
					"Na rynku mamy bardzo dużo produktów wspomagających wydalanie sierści, większość przeznaczona jest dla kotów. Nie wszystkie nadają się dla królików ze względu na dodatek tłuszczu zwierzęcego, produktów pochodzenia zwierzęcego czy cukru.</br>"
							+ "</br>"
							+ "Tłuszcz zawarty w pastach ma za zadanie otoczyć sierść i ułatwić jej wydalenie, zbitej kuli łatwiej jest prześlizgnąć się przez jelita. Papaja zmiękcza sierść. Niestety i tu producenci dodają cukier bądź słód, aby poprawić smak pasty i zachęcić zwierzęta do spożycia produktu.</br>"
							+ "</br>"
							+ "Dodatek cukru narusza równowagę mikroflory jelitowej i może doprowadzić np. do rozwolnienia.</br>"
							+ "</br>"
							+ "Wrażliwe króliki reagują rozwolnieniem, bądź miękkimi kupkami także na dużą zawartość oleju i tłuszczu w paście.</br>"
							+ "</br>" + "</br>" + "Pasta odkłaczająca dla kotów MALT SOFT EXTRA firma Gimpet</br>"
							+ "</br>" + "Skład:</br>"
							+ "Ekstrakt słodu (43%), olej, tłuszcze,produkty roślinne, związek pochodny cukru mlekowego (TGOS 1%) Dostępne w opakowaniach 20 g oraz 220 g. Zawiera przeciwutleniacze. </br>"
							+ "</br>"
							+ "Pasta Malt Soft Extra to produkt o ulepszonej recepturze, która zawiera większą ilość błonnika oraz naturalny słód i olej roślinny. Pasta dodatkowo posiada transgalaktooligosacharyd (TGOS) będący pochodną cukru mlekowego, która ma korzystny wpływ na dobre bakterie przewodu pokarmowego. Wzmacnia ona system immunologiczny oraz poprawia trawienie u kotów.</br>"
							+ "</br>" + "</br>" + "Pasta odkłaczająca dla kotów MALT SOFT firma Gimpet</br>" + "</br>"
							+ "Skład:</br>"
							+ "Ekstrakt słodu - 43%, olej, tłuszcze, produkty roślinne, związek pochodny cukru mlekowego (TGOS 1%). Zawiera przeciwutleniacze. Pasta dostępna jest w opakowaniach: 20 g, 100 g oraz 220 g. Pastę podaje się profilaktycznie w okresie linienia , wielkości groszku raz dziennie.</br>"
							+ "</br>"
							+ "Ze względu na słodki smak obie pasty są bardzo lubiane przez króliki i gryzonie. Nie ma informacji na temat tłuszczu, niewykluczone , ze jest on pochodzenia zwierzęcego,  pasta w końcu przeznaczona jest dla kotów. Mimo tego nie spotkałam się z negatywnymi skutkami stosowania malt soft. Forumowicze piszą, że pasta skutecznie zapobiega odkładaniu się sierści w układzie pokarmowym.</br>"
							+ "</br>" + "</br>" + "BEZO-PET odkłaczająca pasta na bezoary.</br>" + "</br>"
							+ "Skład:</br>"
							+ "Olej sojowy, słód, dekstroza, melasa trzcinowa, olej rybi, Propylenglykol.</br>"
							+ "</br>"
							+ "Jest lubiany przez króliki i dobrze oceniany przez ich opiekunów jednak skład pozostawia dużo do życzenia. Olej rybi, melasa trzcinowa i toksyczny propylenglykol (wywołuje alergie, niszczy nerki i wątrobę), nie powinny być spożywane przez króliki ani inne zwierzęta.</br>"
							+ "</br>" + "</br>" + "CatMalt - Laxacat.</br>" + "</br>" + "Skład:</br>"
							+ "Ekstrakt słodu, , parafina płynna, woda, konserwowane środkiem dopuszczonym przez UE: E216.</br>"
							+ "Analiza składu:</br>"
							+ "białko surowe 2%, tłuszcz surowy 1,4%, włókno surowe 1,0%, popiół surowy 0,5%.</br>"
							+ "Pasta o składzie do zaakceptowania, niestety nie wiem czy smakuje królikom.</br>"
							+ "Będę wdzięczna za opinie na forum lub przesłane na maila miniaturki.</br>" + "</br>"
							+ "</br>" + "Gimborn - przysmak dla gryzoni.</br>" + "</br>" + "Skład:</br>"
							+ "Produkty roślinne (ekstrakt słodu 35,4%, celuloza 10%), oleje i tłuszcze, owoce (Papaja suszona 4%),</br>"
							+ "związek pochodny cukru mlekowego TGOS (1%).</br>" + "Dodatki:</br>"
							+ "BHT (E 321), Guma arabska (E 414, ), Lecytyna( E 322), dwutlenek krzemu ( E 551 b), Celuloza( E 460).</br>"
							+ "</br>"
							+ "Pasta bardzo lubiana przez króliki, skutecznie zapobiega odkładaniu się sierści w układzie pokarmowym. Przeciwutleniacz BHT z Wikipedii: \"Może wywoływać wysypkę, pokrzywkę, rzadko duszność. W wysokim stężeniu wywołuje nowotwory u zwierząt laboratoryjnych\"</br>"
							+ "</br>" + "</br>" + "REMOVER 50G /NTERVET/</br>" + "</br>" + "Skład:</br>"
							+ "Maltodekstryna, lecytyna sojowa, tłuszcze i oleje pochodzenia roślinnego i zwierzęcego, cukry. Substancje dodatkowe w 1 kg:</br>"
							+ "Witamina E - 35mg. Analiza chemiczna: białko surowe - 2%, tłuszcze surowe - 40%, włókno surowe - 0,1%, popiół surowy - 1%</br>"
							+ "Niestety nie nadaje się dla królików ze względu na oleje pochodzenia zwierzęcego i cukry.</br>"
							+ "</br>" + "</br>" + "Red Berry Trixie </br>" + "</br>" + "Skład:</br>"
							+ "70% słód, 12% owoców.</br>"
							+ "Wg informacji producenta usprawnia trawienie i zapobiega tworzeniu się bezoarów,</br>"
							+ "oligodsacharydy pomagają w utrzymaniu prawidłowej flory bakteryjnej jelit.</br>"
							+ "Moim zdaniem jest problematyczna ponieważ składa się głownie z cukru. Wątpię żeby pomagała w usuwaniu włosów. Będę wdzięczna za opinie na temat tej pasty, na forum lub przesłanie jej na maila miniaturki.</br>"
							+ "</br>" + "</br>" + "dr Seidel Malt - pasta odkłaczająca dla kotów 75 ml.</br>" + "</br>"
							+ "Skład:</br>"
							+ "Oleje roślinne (słonecznikowy i rzepakowy), ekstrakt słodowy, krzemionka, hydrolizowane białko zwierzęce.</br>"
							+ "Dodatki: tauryna 0,5% (1 cm pasty zawiera 1,6 mg tauryny).</br>"
							+ "Składniki analityczne: zawartość tłuszczu 53%, białko 4,5%, włókno surowe 2,5%, popiół surowy 11,5%.</br>"
							+ "Składniki aktywne:</br>" + "Oleje roślinne, słód, tauryna.</br>"
							+ "Niestety nie nadaje się dla królików ponieważ zawiera taurynę i białko zwierzęce.</br>"
							+ "</br>" + "</br>" + "Rodikolan</br>" + "</br>"
							+ "Preparat dla gryzoni i królików wspomagający i regulujący zaburzenia procesu trawienia.</br>"
							+ "Oparty jest na naturalnych wyciągach roślinnych.</br>" + "Skład:</br>"
							+ "olej lniany 32%, olej rzepakowy 29,5 %, olej słonecznikowy 10%, olej sojowy 7,5%, ekstrakt z ostu 2,5%,</br>"
							+ "karczoch 2,1%, drożdże 2%, korzeń goryczki 1%, kminek1%, liście mięty pieprzowej 1%,</br>"
							+ "korzeń rabarbaru 1%, kwiat rumianku 1%, korzeń lukrecji 1%, glistnik 1%, korzeń kurkumy 1%.</br>"
							+ "Dodatki na  1000 ml:</br>" + "50.000 mg lecytyny.</br>" + "Składniki:</br>"
							+ "Popiół surowy 0,2%, tłuszcz surowy 97,8%, włókno surowe 0,4%, białko surowe 1,1%.</br>"
							+ "Dawkowanie:</br>"
							+ "Podawać do żywności lub bezpośrednio do jamy ustnej. Przed podaniem wstrząsnąć.</br>"
							+ "Świnki morskie, króliki karłowate - 3x dziennie 5-6 kropli</br>"
							+ "Można go dodawać do jedzenia w okresie linienia zamiast oleju parafinowego czy słonecznikowego, gdy zauważymy mniejsze niż zwykłe bobki lub połączone sierścią \"koraliki\". Profilaktycznie podaje się dwie krople na kg królika np. na ulubionym owocu bądź innym smacznym jedzonku.</br>"
							+ "</br>" + "</br>" + "Alfavet RodiCare akut dla królików i małych gryzoni 15ml.</br>"
							+ "</br>"
							+ "Suplement diety dla małych gryzoni i królików regulujący zaburzenia trawienia.</br>"
							+ "Skład:</br>"
							+ "Olej lniany 32%, olej rzepakowy 27,5%, olej słonecznikowy 8%, olej sojowy 6%, owoce ostropestu plamistego 2,5%;</br>"
							+ "drożdże 2%, liście karczocha zwyczajnego 1,5%; korzeń goryczki 1,5%; owoce kminku 1,5%;</br>"
							+ "liście mięty pieprzowej 1,5%; korzeń rabarbaru 1,5%; kwiaty rumianku 1,5%; korzeń lukrecji 1,5%;</br>"
							+ "glistnik jaskółcze ziele 1,5%; korzeń kurkumy długiej 1,5%; owoce kopru włoskiego (fenkułu) 1,5%; liście jeżyny 1,5%.</br>"
							+ "Dawkowanie:</br>" + "Króliki miniaturowe: 3 x dziennie 5-6 kropli.</br>" + "</br>"
							+ "Można go dodawać do jedzenia w okresie linienia zamiast oleju parafinowego czy słonecznikowego, gdy zauważymy mniejsze niż zwykle bobki lub połączone sierścią \"koraliki\". Profilaktycznie podaje się dwie krople na kg królika np. na ulubionym owocu bądź innym smacznym jedzonku.</br>"
							+ "</br>" + "</br>" + "Alfavet RodiCare akut dla królików i małych gryzoni 15ml.</br>"
							+ "</br>"
							+ "Fruit Plus zawiera aktywne enzymy. Wytworzone z najświeższych owoców papai oraz ananasa</br>"
							+ "(naturalnego źródła enzymów trawiennych). Jedna tabletka zapewnia niezbędną ilość aktywnych enzymów,</br>"
							+ "dużo większą niż przy spożyciu takiej samej ilości owocu papai. Weterynarze zalecają owoc papai oraz ananasa</br>"
							+ "jako suplement diety wspomagający układ trawienny królika. Produkt nie zawiera cukru, nie zawiera sztucznych barwników.</br>"
							+ "W 100% pozbawiony konserwantów. Bardzo smaczny suplement diety. </br>"
							+ "Dawkowanie: 1-2 tabletki dziennie.</br>"
							+ "Wprawdzie weterynarze nadal zalecają ananas, papaje i kiwi w okresie linienia, jednak najnowsze badania podają, ze enzymy proteolityczne (bromelina, papaina, aktynidyna) tracą swoje właściwości w kwaśnym środowisku, czyli w zetknięciu z kwasem solnym w żołądku. Gdy trafia do jelita cienkiego są pozbawione aktywności i w żaden sposób nie wpływają na strukturę włosa czy zmiękczeniu bezoaru, są bezwartościowe."));

			careService.create(new Care(3L, "Pielęgnacja uszu", "O czystość swoich uszów króliczki dbają same.</br>"
					+ "NIE MYJEMY ICH TAK JAK U CZŁOWIEKA. Ale warto zawsze skontrolować ich wygład zwłaszcza jeśli nasz uszatek jest barankiem. Baranki z racji swoich opadniętych uszów mają ograniczona możliwość wentylacji, choć większość z nich trzepiąc głową usuwa woskowinę. Tak czy inaczej należy kontrolować czy uszka są czyste, bez wydzieliny, nalotu czy nieprzyjemnego zapachu. Przy każdej kontrolnej wizycie, bądź szczepieniu zawsze warto pokazać uszy weterynarzowi.</br>"
					+ "Lekarz zbada je odpowiednim wziernikiem i oceni ich stan. A w razie konieczności nauczy nas jak je bezpiecznie czyścić, przy użyciu patyczka namoczonego w parafinie bądź innym wskazanym środku np.: novoscabin do stosowania przy problemach z świerzbowcem. PAMIĘTAJMY, że czyszczenie uszów nie jest łatwą sprawą, dlatego zdecydowanie należy pozostawić je lekarzowi. Króliczki są wiercipiętami a każdy ich ruch podczas czyszczenia stanowi dla nich zagrożenie. Nie należy tego robić samemu, gdyż szkody mogą okazać się ogromne!!! "));

			careService.create(new Care(3L, "Ścieranie zębów",
					"Zęby królika rosną przez całe życie. A ma ich on aż 28. Powinniśmy kontrolować je raz na dwa tygodnie, gdyż tygodniowo zęby uszatka rosną ok. 2-3mm. Dlatego tak ważne jest aby zadbać by królik miał możliwość ścierania ciągłego przyrostu. Do ścierania zębów przede wszystkim służy siano, długie żucie i pocieranie ząb o ząb ściera je. W dalszej kolejności doskonale nadają się gałązki drzew (jabłoń, brzoza, wierzba, lipa, leszczyna) bądź kawałki drewna.</br>"
							+ "Obecnie w każdym dobrym sklepie zoologicznym, można kupić, dobrej jakości pędy jabłoni, bądź innych drzew. Oczywiście możemy sami nazbierać gałązek musimy tylko pamiętać aby: dobrze rozpoznać gatunek drzewa, wybrać drzewa rosnące z dala od ulic, odpowiednio oczyścić gałązki, aby nie były nadto wilgotne, bądź pokryte robactwem czy innym dziwnym nalotem.</br>"
							+ "PAMIETAJMY, że jeśli nie dopilnujemy aby nasza pociecha miała możliwość ścierania zębów, mogą one zacząć wrastać w dziąsła powodując silny ból i kaleczenie języka.</br>"
							+ "</br>"
							+ "UWAGA podczas kupowania wyprawki dla uszatka zazwyczaj w sklepach zoologicznych mało wykwalifikowany personel poleca do ścierania zębów tzw. Wapieńko. Nie dajmy się zwieść, owo wapień ko jest szkodliwe i z czasem prowadzi do kamicy nerkowej, która jest bardzo bolesna a nawet śmiertelna."));

			careService.create(new Care(3L, "Prawidłowe uzębienie",
					"Przynajmniej raz w roku, królik powinien mieć dokładnie przebadaną jamę szczękową u weterynarza. Uszatki, u których wykryto problem z zębami powinny mieć zrobione RTG oraz badanie krwi. Wszystko to pomoże w szybszym zdiagnozowaniu przyczyny problemów. Przyczyny mogą być różne, zaczynając od wad genetycznych a kończąc na niewłaściwym żywieniu. Po wykryciu wady uzębienia, najczęściej kończy się na wykonaniu zabiegu polegającego na przycięciu źle rosnących zębów. Zabieg ten należy powtarzać wg zaleceń weterynarza. NIE ZAPOMINAJMY O ŚCIERANIU."));

			careService.create(new Care(3L, "Płeć",
					"Nie należy wierzyć sprzedawcy w sklepie zoologicznym. Koniecznie płeć królika powinniśmy ustalać u weterynarza."));

			careService.create(new Care(3L, "Wiek", "Junior</br>" + "</br>" + "- od 3 tygodni do 10 tygodni.</br>"
					+ "</br>" + "Nastolatek</br>" + "</br>" + "- od 10 tygodniu do 10-12 miesięcy.</br>" + "</br>"
					+ "Dorosły królik</br>" + "</br>" + "- od 1 roku do 6 lat.</br>" + "</br>" + "Senior</br>" + "</br>"
					+ "- od 6 lat wzwyż.</br>" + "</br>" + "</br>" + "</br>"
					+ "Z wiekiem króliki maja inne zapotrzebowania na pokarmy oraz aktywność fizyczną. Zdrowy i szczęśliwy uszatek żyje nawet 13 lat. :)"));

			careService.create(new Care(4L, "Wielkość i wyposażenie",
					"Nie da się ukryć, że każda klatka to więzienie i nuda dla królika. Idealnie byłoby gdyby uszak mógł biegać 24 godz. na dobę. To bardzo towarzyskie i ciekawskie stworzonka, kraty klatki ograniczają mu dostęp do nas, dostęp do wielu ciekawych miejsc, królik nie może rozładować nadmiar swojej energii, w klatce nie może wykonywać dzikich podskoków z wyrzucaniem na boki nóg i piruetami. Wiemy, że wielu z was nie wyobraża sobie trzymanie królika bez klatki dlatego przedstawiamy kilka z nich oraz inne rozwiązania dotyczące trzymania królika w domu.</br>"
							+ " </br>"
							+ "Wszystko zależy od wagi i rasy królika. Ogólnie pisząc to minimalna klatka dla królika miniaturowego powinna być o wymiarach 100cm długości, 50cm szerokości i 40cm wysokości. Królik powinien w klatce mieć możliwość swobodnego poruszania się. To bardzo ważne, zwłaszcza jeśli większą część dnia przebywa w niej zamknięty. Prócz wielkości jest również kilka rodzajów klatek. Zawsze wybierajmy te z odrutowana górą a by był swobodny przepływ powietrza, podstawa klatki zazwyczaj jest plastikowa choć zdarzają się również klatki z podstawa kratkowaną, które są dość wygodne w utrzymaniu czystości, (gdyż wszystkie odchody przepływają przez kratki bezpośrednio do zamontowanej pod spodem kuwety), ale stanowią równocześnie potworne zagrożenie. Nie wiele trzeba aby łapka królika utkwiła w kratce, powodując zwichnięcie, naderwanie a nawet złamanie. Jeśli już posiadamy taka klatkę to połóżmy na kraty kawałek dość grubego kartonu , który będzie doskonale izolował uchola od kratek, a na to cieplutki kocyk bądź dywanik. Jeśli nie posiadamy takiej klatki a planujemy zakup to od takich raczej trzymajmy się z daleka i zainwestujmy w takie z plastikowa podstawą. Podczas zakupu natkniemy się również na możliwość wyboru klatki z drzwiczkami bocznymi lub drzwiczkami zamontowanymi u góry. Generalnie oba rozwiązania są stosowane, ale jeśli mamy wybór to lepiej postawić na tą z bocznymi drzwiczkami, gdyż dają one swobodną możliwość wskakiwania i wyskakiwania króliczkowi z klatki kiedy tylko ma na to ochotę. Bardziej popularne i chętnie stosowane za granicą są też klatki z drewna do umieszczenia na dworze. Często posiadają one również wbudowana zagrodę. Oczywiście taka klatka, musi być odpowiednio ocieplona i przystosowana do odpowiedniej pory roku. Można również samemu wykonać klatkę dla królika, przy użyciu drewna i siatki, pamiętajmy tylko o wymiarach i przede wszystkim by zbudowana klatka gwarantowała bezpieczeństwo maluchowi.</br>"
							+ "Królika nie możemy trzymać w akwarium!!! Nawet jeśli ma spore rozmiary. Przetrzymywanie królika w akwarium stanowi dla niego śmiertelne zagrożenie. Jest w nim ograniczona cyrkulacja powietrza. Ciężko takie coś umyć, a to bardzo ważne, gdyż istnieją sprzyjające warunki do tworzenia się pleśni i grzybów w takich akwariach. No i królik jest w sumie tam uwięziony, bo nawet nie może sam wyskoczyć ani wskoczyć do środka. Uchol traktuje klatkę jak swój dom, więc musimy zadbać aby czuł się w nim dobrze, z tym związane np.:</br>"
							+ "Wyraźne niezadowolenie spowodowane czyszczeniem klatki, bądź kiedy uchol się przestraszy ucieka do klatki i z niej obserwuje przebieg wydarzeń. W klatce powinna znajdować się kuweta, poidełko bądź miseczka z woda, miseczkę na pokarm suchy, paśnik zawsze wypełniony sianem. Natomiast pozostałą część klatki najlepiej wyłożyć ciepłym dywanikiem."));

			careService.create(new Care(4L, "Podłoże",
					"W sumie klatkę można podzielić na dwie części: kuwetę i miejsce do wypoczynku. Najlepszym rozwiązaniem jeśli chodzi o kuwetę jest wsypanie do niej żwirku. Żwirek doskonale wchłania mocz przy czym ogranicza wydzielanie się nieprzyjemnego zapachu. Na rynku dostępnych jest wiele różnych żwirków, począwszy od najzwyklejszych do zapachowych (przy czym nie wszystkie uchole tolerują inne zapachy dobiegające z kuwety po za swoim).</br>"
							+ "Jeśli chodzi o pozostałą część klatki, przeznaczoną na odpoczynek, to najlepszym podłożem jakie możemy zastosować to mięciutki kocyk, bądź ciepły dywanik. Kategorycznie nie stosujemy trocin!!! Choć właśnie one są najczęściej polecane przez sprzedawców w sklepach zoologicznych. Pyłek unoszący się z trocin może dostać się do oka, zainfekować górne drogi oddechowe, a nawet spowodować choroby skórne. Po co niepotrzebnie narażać malucha na niebezpieczeństwo. Można również znaleźć przyczyny bardziej przyziemne,  mianowicie trociny strasznie roznoszą się po mieszkaniu robiąc bałagan, a dla posiadaczy angorek to już całkowita zmora kiedy trociny przyczepiają się do futerka tworząc przy tym kołtuny. Nie komplikujmy życia sobie a przede wszystkim uszatkom.</br>"
							+ "W miarę bezpiecznym i stosowanym podłożem jest wyściółka składająca się z siana. Na pewno jest na niej króliczkowi wygodnie i ciepło no i zawsze może sobie podjeść. Pamiętajmy, że takie rozwiązanie jest bezpieczne pod warunkiem, że królik nie załatwia na sianie swoich potrzeb fizjologicznych. W mokrym sianie zalęgają się larwy much co jest niebezpieczne dla królika (czyt. choroby), a zjadanie takiego siana również może zaowocować niepotrzebną chorobą.</br>"
							+ "Streszczając, to decyzja o podłożu należy do nas samych, nim jednak ją podejmiemy zwróćmy uwagę na przyzwyczajenia i zachowania naszego malucha, aby naprawdę z czystym sumieniem i satysfakcja stworzyć bezpieczny domek uszatemu."));

			careService.create(new Care(4L, "Utrzymanie czystości",
					"Klatkę - należy czyścić przynajmniej raz w tygodniu wymieniając podłoże na świeże, natomiast pręty klatki raz w miesiącu wilgotną ściereczką, aby pozbyć się kurzu i wszelkich już wytworzonych bakterii przez czynniki atmosferyczne.</br>"
							+ " </br>"
							+ "Kuweta - w zależności od wielkości i wyłożenia kuwety. Ręczniki papierowe należy wymieniać na bieżąco, natomiast żwirek w zależności od użyteczności, raz dwa razy w tygodniu. Warto raz na dwa tygodnie umyć kuwetę mydłem lub octem, który pozwala pozbyć się zalęgających plam z moczu. Dokładnie osuszyć. Bobki wybieramy regularnie.</br>"
							+ "</br>"
							+ "Paśnik - pręty przecieramy przy okazji czyszczenia prętów klatki, wilgotną ściereczką.</br>"
							+ "Siano wymieniamy co dzień na świeże.</br>" + "</br>"
							+ "Mieszczki i poidełka - wodę i jedzenie należy wymieniać każdego dnia. Miseczki dokładnie umyć w ciepłej wodzie, aby nie rozwijały się w nich glony i pleśń. Problem jest z poidełkami, często pojawiają się w nich glony, dlatego warto zainwestować w szczotkę do czyszczenia butelek i ciepłą wodą dobrze wymyć środek, ale jeszcze lepiej przerzucić się na miski.</br>"
							+ ""));

			careService.create(new Care(4L, "Wychowanie bez klatkowe",
					"Jak sama nazwa wskazuje opieka i wychowanie odbywa się bez użycia klatki. Czy to metoda nowa - można by dyskutować, ale na pewno coraz częściej stosowana. A co za tym idzie ma swoich zwolenników jak i przeciwników. Królik minimalnie powinien 4-5 godzin dziennie mieć możliwość swobodnego brykania, więc wychowanie bez klatkowe jest zdecydowanie najlepszą alternatywa dla królika, który mieszka z nami w domu. Oczywiście to wszystko nie jest takie proste. Potrzebne są odpowiednie warunki. Pomieszczenie i jego zabezpieczenie. Bo jak każdy stan rzeczy tak i ten ma swoje wady i zalety. Główna wada, która zazwyczaj decyduje o pozostaniu przy trzymaniu malucha w klatce to niszczenie. Ulubiona zabawa. Jednak jest kilka zasad, które pozwalają zminimalizować ta wadę. A kluczem do wszystkiego jest odpowiednie zabezpieczenie.</br>"
							+ "Ze względów bezpieczeństwa: czyli zabezpieczenie wszelkich kabli, urządzeń grzewczych, kwiatów, lekowi itp.</br>"
							+ "Ze względów wartościowych: czyli zabezpieczenie wszystkich rzeczy, które są dla nas ważne i cenne a pozostają w zasięgu wzroku i zębów uszatka, buty, książki, ubrania itp.</br>"
							+ "Ze względu na nudę: choć to zabawnie brzmi, ale to też klucz do sukcesu. Najczęściej królik niszczy z powodu nudy. Dlatego niezwykle ważne jest aby zapewnić maluchowi odpowiednia ilość pudel kartonowych, gazet, kul wiklinowych, wszystko to co bezpiecznie i z pasja może rozwalać i dzięki czemu mieć zajęcie. Pamiętajmy że króliki szybko się nudzą więc ich zabawki musimy często wymieniać na nowe.</br>"
							+ "Jedna z wad, dla niektórych są również sprawy fizjologiczne. Jeśli jednak maluch jest nauczony korzystania z kuwety to nie powinno być z tym problemów. Co do kwestii znaczenia terenu, podczas okresu dojrzewania po prostu trzeba przeżyć i przeczekać ten okres.</br>"
							+ "Dobrym pomysłem na pozbycie się klatki jest zagroda. Jeśli podejmiemy decyzje, pozbycia się klatki, dawkujmy wolność stopniowo. Co dzień coraz dłużej, zwiększa to szanse iż królik nie zachłyśnie się wolnością.</br>"
							+ "Po pewnym czasie króliki przyzwyczajają się do wolności i nie niszczą tyle co króliki, które mieszkają w klatce i wypuszczane maja w sobie tyle energii że muszą ją rozładować na książkach czy innych przedmiotach, skacząc po meblach itd."));

			careService.create(new Care(5L, "Kuweta",
					"Króliki zazwyczaj na swoją toaletę wybierają sobie jedno miejsce w klatce, bądź w innym miejscu. Naszym zamiarem jest zachęcenie uszatka, aby kuwetę zaakceptował jako swoją toaletę. Na rynku dostępne są rożne kuwety począwszy od wielkości, kształtów po kolory.</br>"
							+ "Popularne trójkątne(narożne), często się nie sprawdzają, gdyż nie są wygodne. Są małe dorastający uchol korzystając z niej może mieć problemy z usadowieniem. Są również kuwety z sepatorem moczu. Królik załatwia się na plastikowej kratce po czym mocz  przelatuje przez nią i zostaje wchłonięty przez żwirek, a bobki zostają na kratce przy czym bardzo łatwo można je na bieżąco usunąć przy użyciu łopatki.</br>"
							+ "Kuwetę najlepiej wyłożyć żwirkiem nie zbrylającym się, jest on bezpieczny dla uszatków. Po nasiąknięciu moczem nie zbryla się, wręcz przeciwnie rozpada się na drobne kawałki, pochłaniając zapach moczu. Można również wyłożyć ją ręcznikami papierowymi, przy czym oczywiście należy na bieżąco usuwać namoknięty papier. Zdecydowanie odradzamy: trociny (nie estetyczne, unoszący się z nich pyłek jest zagrożeniem dla zdrowia) żwirek zbrylający (po dostaniu się do organizmu pod wpływem wilgoci pęcznieje przy czym wyrządza nie małe szkody) ściółki z kamyków (są bardzo nie wygodne, co odstrasza uszatki, a zarazem może kaleczyć łapki), ściółki z siana (choć wydaje się atrakcyjna, bo Kicek może sobie podjeść podczas siusiania, to stanowi poważne zagrożenie zdrowotne. W namokniętym sianie rozwijają się bakterie oraz larwy much).</br>"
							+ " </br>" + "</br>" + "Żwirki, ściółki i podkłady dla naszych króliczków.</br>" + "</br>"
							+ "Mamy ogromny wybór w sklepach zoologicznych i internetowych. Jaki żwirek kupić, który dobrze chłonie, bardziej się opłaca, jaki podpasuje mojemu królikowi? Kupując zwróćcie uwagę na zapach ściółki. Nie Wam ma się podobać, musi on być przyjemny dla królika, który w niej przebywa. Uszaki czują 5 razy lepiej niż człowiek, a więc to co dla nas jest miłe dla królika może być zbyt agresywne. Wszelkim aromatyzowanym cudakom mówimy NIE.</br>"
							+ "</br>" + "</br>" + "Żwirek drewniany typu Pinio , Drewus, Pigwa, Hilton itp.</br>"
							+ "</br>"
							+ "Pojemność 5-10 l. Jest wytwarzany z trocin, ścinków i wiórków drewnianych. Jeden z najczęściej używanych żwirków wśród zakróliczonych, ładnie pachnie drzewem, mało pylący, nie brudzi futerka ani otoczenia, pochłania dużo wilgoci i starcza na długo. Nadaje się jako podłoże do kuwety, na cała klatkę jest zbyt twardy. Jeśli chcemy go użyć do klatki na balkonie bądź w ogrodzie na całej wannie, należy na wierzch położyć warstwę słomy lub ściółki uzupełniającej.</br>"
							+ "</br>" + "</br>" + "Pellet do kominków.</br>" + " </br>"
							+ "Surowcem do ich produkcji są trociny, ścinki i wióry powstałe przy obróbce drewna. Niczym się nie różni od żwirków drewnianych, a jest sporo tańszy. Nie powinien zawierać żadnych chemicznych dodatków,jest prasowany ta sama metoda co żwirki dla zwierząt. Tak samo wchłania wilgoć, jest wydajny, nie pyli, nie brudzi. Stosujemy go tak samo jak Pinio itp.</br>"
							+ "</br>" + "</br>" + "Ściółka bawełniana.</br>" + "</br>"
							+ "Nie nadaje się na cała klatkę ponieważ miesza się z sianem i zielenina i powstaje jeden wielki śmietnik. Poza tym ściółka jest dosyć droga.</br>"
							+ "Nie pyli, ani nie wypada z kuwety, mięciutka dla łapek, niestety słabo wchłania mocz i czuć to gdy przechodzi się koło klatki. Alternatywą byłoby najpierw wsypać żwirek drewniany do kuwety, a na to położyć ściółkę bawełnianą. Nadaje się dla króliczych alergików i uszaków z katarkiem.</br>"
							+ "Na kilku forach czytałam ostrzeżenie, że zjedzona przez królika ściółka doprowadziła do poważnych komplikacji zdrowotnych.</br>"
							+ "</br>" + "</br>" + "Granulat z kolb kukurydzy Chipsi mais , Zolux i inne.</br>" + "</br>"
							+ "Robiony jest z kaczanów kukurydzy. Jego plusem jest, że jest lekki. Świetnie nadaje się do kuwety, nie pachnie, nie pyli, nie przyczepia się do futerka, dobrze wchłania płyn. Starcza na długo jeśli jest używany tylko do kuwety, na całą klatkę nie za bardzo się opłaca, ale oczywiście można nim ją wysypać i codziennie czyścić kącik toaletowy. Żwirek jest bardzo drobny, dlatego królik podczas wyskakiwania rozsypuje go trochę. Jeszcze jedno, im drobniejszy żwirek tym bardziej królik ma ochotę w nim kopać. Dużym minusem jest dodany w żwirkach Zolux aromat, zachęca on króliki do jedzenia ściółki. </br>"
							+ "</br>" + "</br>" + "Trociny.</br>" + "</br>"
							+ "Robione są przeważnie z drzew iglastych, ale można też dostać trociny z drzew liściastych. Dosyć mocno pachną, są miękkie i przyjazne dla łapek. Średnio chłoną mocz, szybko przemakają i zaczyna brzydko pachnieć w okolicy klatki. Nie polecamy dla królików i świnek ponieważ oprócz tego, że wiórki bardzo się roznoszą wokół to jeszcze drobinki trocin drążnia oczy i nos królika, wrażliwe króliki reagują kichaniem i katarkiem, niektóre dostają zapalenia spojówek.</br>"
							+ "</br>" + "</br>" + "Słoma.</br>" + "</br>"
							+ "To łodygi i liście zboża, nie przetworzone, bez ziaren. Powinna być w ładnym złotym kolorze. Nie nadaje się jako samodzielna ściółka ponieważ nie wchłania wilgoci i szybko zaczyna gnić i brzydko pachnieć. Położona na żwirku drewnianym chroni łapki przed otarciami oraz sprawia, że nieczystości spadają niżej na podściółkę, a słoma pozostaje sucha i czysta. Jest niezastąpiona w domkach stojących cały rok na dworze, szczególnie zimą. Trochę się roznosi, króliki lubią ją \"układać\" po swojemu i podgryzać. </br>"
							+ "</br>" + "</br>" + "Granulat ze słomy.</br>" + "</br>"
							+ "To sprasowana słoma, kształtem przypomina granulat drewniany, jest może trochę grubszy. Stosuje się go w kuwecie. Mało pylący, dobrze chłonie wilgoć, jest wydajny. Niestety króliki lubią go podjadać, a to jest bardzo niebezpieczne ze względu na pęcznienie pod wpływem wilgoci, czytałam na króliczych forach o wypadkach śmiertelnych spowodowanych zjedzeniem granulatu.</br>"
							+ "</br>" + "</br>" + "Granulat papierowy np. Hugro.</br>" + "</br>"
							+ "Jest robiony z papieru z odzysku, czyli nie bardzo wiadomo jakiego, pachnie trochę sztucznie i pewnie to sprawiło, że część bobków na początku lądowała obok kuwety. Dużą zaletą jest jego waga. Bez problemu przyniosłam do domu worek 30 litrowy. Kolor ciemno szary, mało atrakcyjny na cała klatkę, do kuwety może być. Dobrze wchłania, jest wydajny, nie rozpada się, nie pyli, minimalnie pęcznieje, nie jest zjadany, pozostaje w kuwecie, no może kilka granulek wypadnie. Godny polecenia.</br>"
							+ "</br>" + "</br>" + "Ściółka z konopi np. Vitakraft, Hugro.</br>" + "</br>"
							+ "Robiona z wnętrza łodyg konopi, wygląda jak małe patyczki/ drzazgi. Można kupić duże opakowanie bo jest lekki. Nie plącze się w futerko i nie jest roznoszony po pokoju. Nadaje się na całą klatkę i oczywiście do samej kuwety też. Nie jest twarda, raczej przyjemna dla króliczych łapek. Zapach neutralny, nie pyli, nie wchłania za dobrze i nie absorbuje zapachu dlatego trzeba ją często wymieniać. Dobra dla króliczków z katarkiem, ponieważ nie podrażnia ukł. oddechowego. Muchy omijają tę ściółkę z daleka. Nie należy do tanich, mimo wszystko to jedna z moich ulubionych ściółek. Świetnie sprawdza się w domku na balkonie.</br>"
							+ "</br>" + "</br>" + "Żwirek silikonowy np. Trixie.</br>" + "</br>"
							+ "Nadaje się tylko do kuwety. Świetnie pochłania zapachy i wilgoć, nie pyli, jest antybakteryjny i bezzapachowy. Trochę grzechocze przy używaniu. Zesiusiana część zabarwia się na żółto i wtedy należy go wymienić. Myślę, że jest to dobra alternatywa dla króliczych alergików lub królików po operacji, jeśli zostanie zaakceptowana.</br>"
							+ "</br>" + "</br>"
							+ "Ściółka uzupełniająca, leśna ściółka, z Holsztynu, z ziołami ,Vitakraft, JR Farm wyściółka wiejska.</br>"
							+ "</br>"
							+ "Składa się z grubszych wiórków, kory, ziół i listków, JR Farm ma dodatek płatków kwiatów, szyszek i kłosów zbóż w zależności od rodzaju ściółki. Ładnie pachnie i wygląda. Króliki bardzo lubią podgryzać duże kawałki kory, listki i zioła też są chętnie zjadane. Myślę, że przebieranie, kopanie i szukanie w niej to świetne zajęcie dla królika. Ściółka może zastąpić piasek w piaskownicy do kopania bądź służyć jako wierzchnia warstwa dla zwykłych trocin czy granulatu drzewnego. W samej kuwecie raczej się nie sprawdzi, z reszta nie taka jej rola.</br>"
							+ "</br>" + "</br>" + "Mata dla gryzoni Hansepet, MultiFit, Hugro.</br>" + "</br>"
							+ "Fajny pomysł, ale niestety mało praktyczny, to mata lniana lub konopiana do klatki. Jest miękka i ociepla dno klatki. Można ja przyciąć tak żeby pasowała do miejsca gdzie chcemy ja położyć. Rozmiary mat to Hansepet 25x40 Hugro i MultiFit 25x40, 40x100, 50x120 Na amazon można dostać taniej i różnych firm. Mata jest prosta w użytku i łatwa do usunięcia. Można ją wyrzucić na kompost. Niestety regularne stosowanie jest dosyć drogie i nie sprawdza się u królików, które nie korzystają z kuwety, szybko przemaka. Dywanik jest w dodatku chętnie zjadany, a że składa się z długich włókien połkniecie może skończyć się tragicznie. Usunęłam mocno poobgryzana mate, bałam się, ze uszaki dostana zatoru.</br>"
							+ "</br>" + "</br>" + "Dry bed.</br>" + "</br>"
							+ "To mata ze specjalnego materiału, który przepuszcza płyny pozostawiając suchy wierzch. Do kupienia w różnych rozmiarach i w dwóch Typach: grubszy A i cieńszy B. Wyłożyć można nim cała klatkę, transporter, półkę, kącik królika. Dobrze sprawdza się u królików, które z jakiś powodów nie mogą korzystać z kuwety (np. inkontynencja). W takim przypadku na spod klatki należy nasypać podłoże z granulatu, a na nie położyć mate. Mocz będzie wsiąkać w granulat, dry bed pozostanie suchy, wystarczy tylko sprzątnąć bobki i resztki jedzenia. Zabrudzona mate można prac w pralce na 40°, trzeba ja tylko dobrze wytrzepać lub odkurzyć.</br>"
							+ "</br>" + "</br>" + "Piasek.</br>" + "</br>"
							+ "Nie nadaje się ani do kuwety ani na cała klatkę. Prawie nie absorbuje moczu ani zaachu, szybko robi się mało apetyczne błoto. Kto chce swoim uszakom sprawić duża radość może nasypać piasku do \"piaskownicy\" gdzie królik będzie mógł się wylegiwać, tarzać i kopać. Piasek trzeba często wymieniać bo króliki lubią się w nim załatwiać. Trzeba się też liczyć z częstym zamiataniem. Piasek kupujemy ten przeznaczony dla dzieci. Ptasi czy dla szynszyli nie nadaje się , jest z dodatkami i zbyt drobny, może trafić do układu oddechowego.</br>"
							+ "</br>" + "</br>" + "Bentonit, koci żwirek zbrylający lub nie.</br>" + "</br>"
							+ "Nie nadaje się dla uszaków, raz że drobny pyłek będzie wdychany, a dwa zjedzenie granulatu wiąże się z niebezpieczeństwem zatrucia, zatoru czy ostrego rozszerzenie żołądka.</br>"
							+ "</br>" + "</br>" + "! Uwaga !</br>" + "</br>"
							+ "Wszystkie sprasowane granulaty pęcznieją pod wpływem wilgoci, jedzenie przez królika ściółki może doprowadzić do poważnych komplikacji zdrowotnych np. zatkania przewodu pokarmowego.</br>"
							+ ""));

			careService.create(new Care(5L, "Nauka korzystania",
					"Choć króliki są czyściochami, to nauka czystości może wymagać od nas cierpliwości i treningu. Dużo łatwiej zasad korzystania z kuwety nauczyć jest starszego uszatka niż maluszka. Ale tak czy inaczej trzeba uzbroić się w cierpliwość i nie poddawać się.</br>"
							+ "</br>"
							+ "Kuwetę stawiamy w miejscu gdzie nasz pupil najczęściej się załatwia. Wszystkie bobki pozostawione w innych miejscach należy pozbierać i wrzucić do kuwety. Podobnie robimy z moczem. Jeśli nasz maluch zrobił siusiu po za kuweta to ścieramy siuśki ręcznikiem papierowym i umieszczamy go w kuwecie. Te zabiegi spowodują, iż maluch zacznie wyczuwać swój zapach w kuwecie.</br>"
							+ "Podejmując się nauki czystości musimy podejść do sprawy bardzo odpowiedzialnie, ponieważ potrzebna tu jest systematyczność. Należy bardzo pilnować, aby wszystkie bobki i siuśki z poza kuwety niezwłocznie trafiały tam gdzie ich miejsce czyli -do kuwety. Trening jest bardzo pracochłonny, ale za to efekty niebywałe. Obserwując malca możemy wyczuć moment, kiedy powinien zostać zwabiony smakołykiem do kuwety. Najczęściej szykując się do siusiania Kicek podnosi ogonek do góry, powstrzymać możemy go używając stanowczej komendy typu NIE lub NIE WOLNO. Warto pamiętać, iż dojrzewające króliki oraz samiczki w rui mogą zapominać do czego \"służy\" kuweta."));

			careService.create(new Care(6L, "Kable",
					"Aby nasza pociecha mogła swobodnie i bezpiecznie poruszać się po mieszkaniu, musimy starannie je zabezpieczyć. Dla uszatka bardzo atrakcyjne są kable. Niestety równie co atrakcyjne są również dla niego niebezpieczne.</br>"
							+ "Oczywiście najlepszym rozwiązaniem jest, aby w pomieszczeniach gdzie porusza się maluch nie było kabli. Jeśli to nie możliwe, jest kilka sposobów na ukrycie ich przed naszymi ciekawskimi Kickami. Można ukryć je pod listwami podłogowymi lub meblami, oczywiście pod warunkiem, że maluch nie zagląda za meble. Jeśli jest to możliwe można również</br>"
							+ "po prowadzić kable wyżej i przymocować ścianie, gdzie mały nawet stając słupka nie dosięgnie."));

			careService.create(new Care(6L, "Rośliny trujące",
					"Króliki są roślinożercami, a co za tym idzie widok zielonego kwiatka napawa naszych pupili radością. Rośnie ich apetyt. Naszym obowiązkiem jest zabezpieczyć mieszkanie, aby wszystkie rośliny i kwiaty znajdowały się w miejscach niedostępnych dla uszatków.</br>"
							+ "Często nie zdajemy sobie sprawy, iż posiadamy w domu kwiat, który jest trujący."));

			careService.create(new Care(6L, "Przedmioty wartościowe",
					"O tak, w tym temacie to mogłabym dużo pisać z własnego doświadczenia. Moje urwisy nie jedna już torebkę czy parę butów pogryzły doszczętnie. Czy je karałam? Nie, bo to naszym obowiązkiem jest, zabezpieczyć wszystkie wartościowe przedmioty. Począwszy od tych, które zagrażają bezpieczeństwu uszatych, po te których gryzienie jest dla nich super zabawa, a tylko dla nas stratą kolejnej torebki."));

			careService.create(new Care(6L, "Niebezpieczenstwa",
					"Na takiego małego stworka jakim jest królik, w domu czeka nie jedno niebezpieczeństwo. Należy dobrze zamykać kubeł ze śmieciami, gdyż uszaty może tam znaleźć wiele ciekawych go rzeczy, a zarazem wiele z nich po zjedzeniu może zagrażać jego zdrowiu. Foliowe reklamówki trzymajmy zamknięte w szufladzie. Królik bawiąc się foliowym workiem może się udusić, jak również po zjedzeniu kawałka naprawdę to odchorować.</br>"
							+ "Nie stawiajmy naczyń, garnków, zwłaszcza z wrzątkiem na stolikach w zasięgu</br>"
							+ "króliczego wzroku. Królik z ciekawości może je stracić.</br>"
							+ "Pozamykane w szafkach również trzymajmy wszelkie środki czyszczące. Proszek, chlor, płyny do okien itp.</br>"
							+ "Kolejne niebezpieczeństwo stanowią słodycze, zwłaszcza czekolada, ale pamiętajmy również o innych pokarmach, które królik nie powinien spożywać.</br>"
							+ "Uwaga na drobne przedmioty np.: koraliki. Często zdarza się, że twórczość naszych dzieci też stanowi potencjalne zagrożenie. Często maluszki zostawiają w zasięgu wzroku królika kawałki plasteliny bądź modeliny.</br>"
							+ "Tapety (niezwykle lubiane przez nasze uszatki) w dużej ilości również stanowią zagrożenie, mogą bowiem powodować zatkanie. Można je zabezpieczyć naklejając na dole folie samoprzylepna.</br>"
							+ "Bardzo poważnym zagrożeniem dla królika są pozostałe zwierzęta zamieszkujące z nami w domu. Często jedne z nich żyją w zgodzie z uszatymi, a inne niestety nie. Do nas należy obowiązek zapewnienia bezpieczeństwa, uszatkom w naszym domu. Jeśli wiemy, iż nasz większy pupil nie przepada za mniejszym, zabezpieczmy tak mieszkanie, aby nie doszło do ich spotkania.</br>"
							+ "Tworząc uszatemu zagrodę miejmy na uwadze możliwości naszych pociech np.: zadajmy sobie pytanie czy zagroda jest na tyle wysoka i stabilna, że ani królik ani pies jej nie przeskoczą?</br>"
							+ "Nie bagatelizujmy, niechęci do siebie naszych zwierząt, życie pokazało już nie raz jak w wyniku braku zabezpieczenia i braku odpowiedzialności ze strony opiekuna doszło do tragedii."));

			careService.create(new Care(7L, "Do kupienia",
					"Na rynku dostępnych jest wiele zabawek przeznaczonych dla naszych pupili, co oczywiście nie oznacza, że wszystkie są naprawdę przyjazne królikowi. Prześledziłam oferty polskich sklepów i nie tylko.</br>"
							+ "Oto wyniki:</br>" + "</br>" + "</br>" + "Domki </br>"
							+ "Dostępne są  rożnego rodzaju, od prostych chatek po zapierające dech w piersiach zamki. Jeśli wykonane są z naturalnego drewna, i nie wystają żadne gwoździe to jest to jak najbardziej bezpieczna zabawka.</br>"
							+ " </br>" + "ZDECYDOWANIE POLECAMY</br>" + " </br>" + " </br>"
							+ "Kule z wikliny i trawy morskiej. </br>"
							+ "Jeśli nie są lakierowane, to zdecydowanie są bezpieczne dla ucholi.</br>" + "</br>"
							+ "ZDECYDOWANIE POLECAMY</br>" + "</br>" + "</br>" + "Namioty</br>"
							+ "Choć brzmi śmiesznie to naprawdę można taki namiot nabyć dla uszatka. Zawsze to jakaś alternatywa dla domków.</br>"
							+ "</br>" + "POLECAMY</br>" + "</br>" + "</br>" + "Tunel wiklinowy i korkowy</br>"
							+ "Z naturalnej wikliny, zabawa przednia.</br>" + "</br>" + "ZDECYDOWANIE POLECAMY</br>"
							+ "</br>" + "</br>" + "Kulka z dzwonkiem </br>"
							+ "Niby zabawka sama w sobie ciekawa. Króliki lubią rzucać przedmiotami. Jednak ta ma znaczącą wadę -posiada dzwoneczek. Króliki maja bardzo wrażliwy słuch i ciągły dźwięk tego dzwoneczka zdecydowanie jest szkodliwy dla zdrowia.</br>"
							+ "</br>" + " NIEPOLECAMY</br>" + "</br>" + "</br>" + "Dzwonek z lucerny i ziół </br>"
							+ "Zawiera skrobie.</br>" + "</br>" + "NIEPOLECAMY</br>" + "</br>" + "</br>"
							+ "Rzodkiewki, marchewki z sizalu</br>"
							+ "Występują w postaci wielu warzyw. Przeznaczone są dla uszatków do gryzienia. Wg producentów nie szkodliwe. Natomiast zabawka ta pokryta jest cienką warstwą barwionego sizalu pod którą jest spora warstwa kleju. Nietrwała</br>"
							+ "</br>" + "NIEPOLECAMY</br>" + "</br>" + "</br>" + "Patyk z suszkami </br>"
							+ "Do kupienia aczkolwiek można go wykonać samemu. Zabawka zdrowa i pyszna.</br>" + "</br>"
							+ "ZDECYDOWANIE POLECAMY</br>" + "</br>" + "</br>" + "Kula </br>"
							+ "Można do niej włożyć i sianko i zieleninę a nawet kawałki warzyw. Królik może kulać ja podobnie jak kule smakule, bądź możemy na łańcuszku przyczepić ją do klatki. Zabawka dostarcza królikowi dodatkowego ruchu.</br>"
							+ "</br>" + "ZDECYDOWANIE POLECAMY</br>" + "</br>" + "</br>" + "Kula smakula </br>"
							+ "Cóż tu dużo mówić- zabawka numer jeden. Kula do której można wsypać przysmak, rodzynki bądź granulat. Podczas turlania smakołyki wypadają. Króliki szaleją na jej punkcie. Zabawka bezpieczna, stymulująca dodatkowy ruch zwierzaka.</br>"
							+ "</br>" + "ZDECYDOWANIE POLECAMY</br>" + " </br>" + " </br>" + "Kong dla gryzoni</br>"
							+ "Pomysł zabawki ciekawy, podobnie jak do kuli smakuli wkłada się jedzenie do środka, zabawka dodatkowo odskakuje gdyż wykonana jest z naturalnego kauczuku.</br>"
							+ "Producent jednak ostrzega - jeśli Kong będzie mieć ślady gryzienia należy niezwłocznie go zabrać.</br>"
							+ "Na logikę skoro gryzonie to naturalne jest ze będą gryzły. Zwłaszcza że króliki wszystko oglądają zębami.</br>"
							+ "</br>" + "ZDECYDOWANIE NIEPOLECAMY</br>" + "</br>" + "</br>"
							+ "Formowane domki z patyków </br>"
							+ "Można dowolnie uformować norkę dla naszego uszatka. I dodatkowo maluch może coś podgryźć.</br>"
							+ "</br>" + "POLECAMY</br>" + "</br>" + "</br>" + "Tunel z materiału </br>"
							+ "Dostarcza królikowi dużo, dużo radości kiedy tak może się przez niego przeciskać. Zabawka bezpieczna. Jedyny minus to fakt iż tunel jest mało stabilny sam w sobie.</br>"
							+ "</br>" + "POLECAMY</br>" + "</br>" + "</br>" + "Drewniane gryzaki </br>"
							+ "Barwione drewno, w wybranym kształcie (tu akurat truskawki) na haku mocuje się do klatki. Królik powinien gryzak obgryzać. Ogólnie mało ciekawa zabawka.</br>"
							+ "</br>" + "NIEPOLECAMY</br>" + "</br>" + "</br>" + "Drapak </br>"
							+ "W sumie to zabawka przeznaczona typowo dla kotów, aczkolwiek króliki ze swoją skłonnością skakania tu i ówdzie chętnie z tej zabawki korzystają.</br>"
							+ "</br>" + "POLECAMY</br>" + "</br>" + "</br>" + "Zabawka edukacyjna</br>"
							+ "Tak można ją nazwać. Składa się z barwionych patyczków poukładanych w specyficzny sposób. Do środka można włożyć przysmak. Cała zabawa polega na tym, żeby uszaty powyciągał te patyki ząbkami, aby dostać się do jedzenia. Zabawka trudna, ale bardzo interesująca.</br>"
							+ "</br>" + "POLECAMY</br>" + "</br>" + "</br>" + "Maskotka</br>"
							+ "To jest zabawka, która każdy króliczek powinien mieć. Dobra do polizania, przytulenia, wytargania za uszy a nawet i osiusiania jak ma się ochotę. Mięciutka i dostępna od koloru do wyboru. Można prac.</br>"
							+ "</br>" + "ZDECYDOWANIE POLECAMY</br>" + " </br>" + " </br>" + "Zabawka edukacyjna</br>"
							+ "Świetna zabawka dla królika, składa się z \"tacki\" i pokrywek. W tacce są zagłębienia, w które wkładamy suszki, nakrywając je pokrywkami, uszak aby się dostać do jedzenia musi ściągnąć pokrywkę. Opiekun równie dobrze się bawi co sam uszak.</br>"
							+ "</br>" + "ZDECYDOWANIE POLECAMY"));

			careService.create(new Care(7L, "Zrób to sam",
					"Jest kilka, możliwości zrobienia samemu zabawek, którymi uszatki bawią się z takim samym zapalę jak kupnymi.</br>"
							+ "Mamy nadzieje ze każdy znajdzie coś dla siebie :)</br>" + "</br>" + "</br>"
							+ "Piaskownica</br>"
							+ "Moje urwisy w takiej piaskownicy mają przednią zabawę. Dużo brykania, kopania i piachu w futerku. Jeśli ktoś nie ma możliwości, to zachęcamy do zrobienia domowej piaskownicy.</br>"
							+ "</br>" + "</br>" + "Przegląd prasy</br>"
							+ "Gryzienie to jest to co uszatki lubią najbardziej. I choć zalecane jest dawanie do gryzienia szarego papieru, chyba nie ma uszatka,  który by nie spróbował kolorowej prasy.</br>"
							+ "Jedni wolą informacje muzyczne a inni plotki</br>" + "</br>" + "</br>"
							+ "Rolka po papierze</br>"
							+ "Idealne do obgryzania a jeszcze lepsze, co osobiście sprawdziły moje Kicki do rzucania po pokoju. Mogą być od papieru toaletowego bądź ręczników papierowych.</br>"
							+ "</br>" + "</br>" + "Tunel</br>"
							+ "Króliki uwielbiają ciasne miejsca. W domu bez wydawania pieniędzy możemy zrobić tunel z bardzo wąskiego kartonu (np: po panelach lub karniszach) lub zrobić przerwę miedzy meblami a szafa.</br>"
							+ " </br>" + "</br>" + "Domowa kula smakula </br>"
							+ "Wystarczy do koperty wsypać troszkę ziółek, rodzynek, bądź granulatu, dobrze zakleić i zrobić w kopercie małą dziurkę. Królik rzuca koperta, bo wie że jak odpowiednio rzuci to coś z niej wypadnie dobrego.</br>"
							+ "</br>" + "</br>" + "Stojak na warzywa</br>"
							+ "Taki stojak można nabyć w sklepie- ale po co skoro możemy go zrobić sami. Wystarczy połączyć dwa kawałki drzewa i zrobić w nich dziury np: na marchewkę, nie wszystko musi być prosto i idealnie.</br>"
							+ "</br>" + "</br>" + "Kartony </br>"
							+ "Wystarczy wyciąć kilka dziur i nasze uszatki mają wspaniałą kryjówkę.</br>" + "</br>"
							+ "</br>" + "Wianki </br>"
							+ "Ciekawym pomysłem jest uplecenie choćby prowizorycznego wianka z giętkich gałązek. Oczywiście z bezpiecznych drzew dla królika. Uszaty zajmie się obgryzaniem.</br>"
							+ "</br>" + "</br>" + "Warzywny szaszłyk</br>"
							+ "Bardzo ciekawie podane danie dla naszych pupili, które nie dość że jest zdrowe,</br>"
							+ " to jeszcze świetnie zabawia uszaka."));

			careService.create(new Care(8L, "Drugi królik",
					"To jest zdecydowanie najlepsze rozwiązanie. I choć charaktery mają rożne to mowę ciała tą samą. Wspólnie lepiej znoszą sytuacje stresowe, nudę, czy chorobę. Bawią się do upadłego jak również i psocą. Jednak nie od razu to wszystko wygląda tak słodko i urokliwie. Większość uszatków potrzebuje troszkę czasu aby zapoznać się z nowym współlokatorem. Dobra wiadomość: jak już się zaprzyjaźnią to na dobre i źle. Zła wiadomość: niestety są przypadki ze nie wszystkie króliki żyją w zgodzie.</br>"
							+ "</br>" + "</br>" + "Zaprzyjaźnianie</br>" + "</br>"
							+ "Króliki w naturze żyją w dużych grupach. Grupa daje poczucie bezpieczeństwa królikowi i schronienie. Zwierzak ma się z kim bawić, wymieniać czułości, posprzeczać, pobyć razem. Nasz domowy królik ma wrodzoną potrzebę życia w grupie. Powinniśmy być świadomi, że ani człowiek ani świnka czy inne zwierze nie zastąpi królikowi partnera. Weźmy sobie do serca tą naturalną potrzebę uszaka i nie skazujmy go na wieloletnią samotność.</br>"
							+ " </br>"
							+ "Idealnie byłoby wziąć od razu dwa uszaki. Króliki do 4 miesiąca życia obojętnie jakiej płci, zaprzyjaźniają się bez problemu. Jeśli weźmiemy parkę samczyka należy jak najwcześniej wykastrować, po 3 miesiącu osiąga zdolność zapładniania. Jeśli weźmiemy dwa samce, musimy poddać je też kastracji, zapobiegnie ona krwawym walką na tle terytorialnym. Można zaadoptować już zaprzyjaźnioną dorosłą parę, oszczędzi nam to stresu podczas zaprzyjaźniania. Jeżeli chcemy swojemu uszakowi sprawić partnera powinien on być mniej więcej w wieku naszego królika. Najlepszy układ to wykastrowany samczyk z samiczką. Dorosłe samice są bardzo terytorialne, młodszy samczyk może zostać przez nie mocno poturbowany lepiej zaadoptować starszego lub równego wiekiem samca.</br>"
							+ "</br>"
							+ "Dwa kastrowane samce - może być przyjaźń do końca życia, ale może być też tak, że króliki się nigdy nie polubią lub polubią się, ale od czasu do czasu będą wybuchały sprzeczki.</br>"
							+ "</br>"
							+ "Dwie samiczki - są problematyczne, zdarzają się oczywiście przyjaźnie pomiędzy samiczkami, ale zwykle pomiędzy 4 a 8 miesiącem dochodzi do walk. Silniejsza królica stara się przegnać rywalkę.</br>"
							+ " </br>"
							+ "Starszy królik z młodszym - starszy zwykle woli spokój, nie w głowie mu figle, zabawy małego mogą go irytować, młodszy natomiast może się nudzić ze starszym królikiem, żaden z niego kompan do zabawy.</br>"
							+ " </br>"
							+ "Małe króliki poniżej 4 miesiąca życia z dorosłym- to zależy od charakteru dorosłego królika, jeśli jest tolerancyjny to ok, w ,innym wypadku może dojść do poważnych okaleczeń malucha, który jeszcze nie umie się bronić i jest ufny w stosunku do każdego.</br>"
							+ " </br>"
							+ "Króliki są bardzo przywiązane do swojego terytorium, każdy królik ma swoje miejsce w grupie, które wywalcza sobie w okresie dorastania. Nasze uszaki spotykając się po raz pierwszy muszą ustalić miedzy sobą kto wyżej stoi w tym układzie, a kto niżej. Nowego królika należy najpierw przebadać u weterynarza, kwarantanna \"nowego\" powinna trwać dwa tygodnie. To ważne ponieważ uszak może mieć pasożyty bądź chorobę, która zarazi naszego futrzaka. Króle nie powinny się widzieć przez ten czas. Po okresie kwarantanny rozpoczynamy zaprzyjaźnianie.</br>"
							+ "</br>"
							+ "Nigdy nie wolno puszczać królika na terytorium innego uszaka! Wywoła to niepotrzebna agresje.</br>"
							+ " </br>"
							+ "1. Musimy znaleźć czas np. weekend dobrze się do tego nadaje, zaprzyjaźnianie może potrwać kilka dni.</br>"
							+ "2. Musimy wybrać neutralne pomieszczenie, które żaden królik nie traktuje jako swoje terytorium. Może to być większa łazienka, kuchnia, przedpokój. Należy mieć świadomość, że to pomieszczenie będzie zajęte przez kilka dni.</br>"
							+ "3. Ustawiamy domki tekturowe (każde musi mieć dwa wyjścia), kuwetę ze żwirkiem, wodę (przynajmniej dwie miseczki) i siano, rozrzucamy zieleninę i warzywa.</br>"
							+ "4. Wszystkie niebezpieczne rzeczy typu kable, książki trzeba pochować.</br>"
							+ "5. Dywany lepiej zwinąć ponieważ króliki mogą znaczyć siebie i teren strumieniami moczu.</br>"
							+ "6. Wpuszczamy króliki</br>" + "</br>"
							+ "Bardzo rzadko zdarza się miłość od pierwszego wejrzenia. Najczęściej po krótkim zlustrowaniu pomieszczenia i siebie dochodzi do konfrontacji. Najważniejsze to nie wtrącać się i zachować spokój.</br>"
							+ "Króliki mogą: </br>" + "- przeganiać i gonić się,</br>"
							+ "- wyrywać sobie kłęby sierści</br>" + "- podgryzać i gryźć się</br>"
							+ "- ujeżdżać się</br>" + "- warczeć i tupać</br>" + "- skryć się w domku</br>"
							+ "- skulić się w kąciku</br>" + "- odganiać słabszego od jedzenia</br>"
							+ "- zmieniając się miejscami wyskakiwać w górę i kopać się skokami</br>"
							+ "- boksować przednimi łapkami</br>" + " </br>"
							+ "Tylko w dwóch przypadkach musimy się wtrącić</br>"
							+ "1. Jeśli któryś uszak został mocno skaleczony</br>"
							+ "2. Jeśli króliki tak mocno się  w siebie wczepiły, że widzimy tylko kłąb ciał</br>"
							+ "</br>"
							+ "Rozdzielamy króliki np. rzucając na nie koc, poszkodowanego/nych dokładnie oglądamy, opatrujemy rany i puszczamy. Jeśli dojdzie do następnych silnych okaleczeń rozdzielamy króliki na okres dwóch - trzech tygodni do osobnych pokoi. Po tym okresie musimy zacząć zaprzyjaźnianie od nowa. Bywa i tak, że króliki zupełnie nie są dla siebie stworzone, zamiast skazywać królika na samotność powinniśmy mu znaleźć innego partnera. Czasami można się umówić ze schroniskiem na próbną konfrontacje dwóch królików.</br>"
							+ "</br>"
							+ "Wracając do naszego zaprzyjaźniania, jak już napisałam wcześniej może trwać od kilku godz. do kilku dni. Nie dajmy się ponieść litości. Jeśli rozdzielimy uszaki będziemy musieli zacząć wszystko od początku. Króliki muszą miedzy sobą ustalić hierarchie, tak jest w naturze i tak samo odbywa się to u naszych królików. Jeśli zauważymy, że króliki leżą koło siebie, jedzą razem i myją sobie futerka - najgorsze mamy za sobą. Poczekajmy dla pewności jeszcze jeden dzień i możemy zacząć przeprowadzkę do docelowego miejsca zamieszkania królików. Myjemy zagródkę dokładnie, możemy poprzestawiać znajdujące się w niej przedmioty. Najpierw wpuszczamy nowego królika niech w spokoju zwiedzi wszystkie kąty. Wpuszczamy domownika. Może dojść do nowych krótkich walk na nowym terytorium to normalne. Króliki szybko dojdą do porozumienia. Przed Tobą niesamowity widok dwóch przytulonych króliczków, myjących się nawzajem, sprzeczających o liść mlecza, ganiających się wesoło po zagrodzie, rozkopujących Twoje kwiaty doniczkowe, wspierających się w chorobie i w robieniu głupot.</br>"
							+ " </br>" + "Warto było."));

			careService.create(new Care(8L, "Świnka morska",
					"Te zwierzaki są bardzo spokojnymi, towarzyskimi stworzeniami. Dlatego często są trzymane razem, w jednej klatce. Cierpią po cichutku przez wiele lat, a ich milczenie jest interpretowane jako akceptacja i przyjaźń. Ta przyjaźń to bycie razem z przymusu. Świnka tęskni za druga świnką, a królik za obecnością królika. Mimo, że razem to obydwoje są bardzo samotni. Oba zwierzaki bardzo różnią się od siebie i na tym polu dochodzi do nieporozumień.</br>"
							+ "</br>" + "Oto kilka przykładów:</br>"
							+ "- Króliki porozumiewają się głównie mową ciała również poprzez zapach, świnki mają bardzo dobrze rozwinięta mowę, gwizdami, turkotaniem i wieloma innymi odgłosami porozumiewają się między sobą. Taka wymiana między królikiem, a świnką jest niemożliwa.</br>"
							+ "- Króliki potrzebują kontaktu cielesnego z drugim królikiem, przytulania, powitania, wzajemnego  mycia. Świnki potrzebują kontaktu wzrokowego i za pomocom głosu, bardzo dużo rozmawiają ze sobą. Nie myją się nawzajem, utrzymują dystans,  przytulają się tylko w sytuacji stresowej,</br>"
							+ "- Króliki mielą ząbkami, gdy jest im dobrze, dla świnek jest to sygnał ostrzegający (nie zbliżaj się)</br>"
							+ "- Króliki zniżają głowę gdy domagają się mycia i czułości, dla świnek jest to oznaka poddaństwa</br>"
							+ "- Króliki podczas witania wąchają się także w okolicach ogona, dla świnki jest to oznaka seksualnego zainteresowania i prosiak będzie się bronił i uciekał, dla królika zupełnie niezrozumiała sytuacja.</br>"
							+ "</br>"
							+ "Problemem w obcowaniu tych dwóch zwierzątek jest też wielkość, króliki są przynajmniej 1,5 razy większe od świnek. Łatwo mogą zrobić śwince krzywdę, nawet przez nieuważne stąpniecie lub bieg na oślep w chwili paniki. W okresie dojrzewania samczyki jak i samiczki królików mogą stać się agresywne, rzucać się drapiąc i gryząc świnkę, lub ujeżdżając ją bez końca. Królica w ciąży urojonej będzie broniła swojego gniazda, świnka ma małe szanse, aby się obronić, czy gdzieś schronić. Szczególnie jeśli trzymane są w sklepowej klatce.</br>"
							+ " </br>"
							+ "Trzymanie tych dwóch gatunków razem nie jest jednak niemożliwe. Ważne żeby zarówno świnka, jak i królik mieli przynajmniej jednego partnera swojego gatunku.</br>"
							+ "</br>"
							+ "- Króliki nie mogą być agresywne w stosunku do świnek ani innych zwierząt.</br>"
							+ "- Zagroda musi być duża, na każdego królika 2 m2 + na każda świnkę 0,50m2, idealny byłby pokój króliczy, bądź duża zagroda na dworze.</br>"
							+ "- Świnki powinny mieć swój kącik z domkami, tunelami, hamakami, gdzie będą mogły wypoczywać i gdzie królik nie będzie mógł wejść.</br>"
							+ "- Dla królików konieczne są podwyższone miejsca niedostępne dla świnek.</br>"
							+ "- Oba gatunki powinny mieć możliwość zejścia sobie z oczu :)</br>"
							+ "- Należy zwracać uwagę, czy wszystkie zwierzaki maja swobodny dostęp do jedzenia i wody, na tym polu też może dochodzić do ograniczeń ze strony królików i sprzeczek.</br>"
							+ "- Konieczna jest kastracja samców zarówno królików jak i świnek.</br>" + "</br>"
							+ "Moje króliki mieszkają wolno, korzystają z kuwet w łazience i toalecie, śpią: Fisio pod łóżkiem w sypialni, Floke albo u prosiaków, albo w pobliżu prosiaków, a jak chce mieć spokój lub jest gorąco to w kibelku na dywaniku :) Świnki mają swój kącik, jedną ściankę zrobiłam niżej żeby w każdej chwili mogły sobie wyjść i pospacerować. Prosiaki nie oddalają się od zagródki. Biegają w takiej odległości żeby w razie zagrożenia czmychnąć do domków. Zarówno prosiaki jak i króliki są do siebie pokojowo nastawione, jednak zauważalne jest, że świnki preferują swoje towarzystwo. Floke chyba nie widzi za bardzo różnicy i opiekuje się tym kto jest akurat w pobliżu, jak trafi się Fisio to myty jest Fisio, a jak nasza staruszka Lucy (świnka) no to myta jest świnka.</br>"
							+ "</br>"
							+ "Spotkałam się w necie z ostrzeżeniem, że króliki przenoszą na świnki E. Cuniculi, tak, zgadza się, ale i świnki są nosicielami tego pierwotniaka, więc takie samo prawdopodobieństwo zachorowania świnek jest gdy dołączamy do stada nową świnkę jak i królika. Nosicielami e.c mogą być też szczury, koty, psy, myszy, chomiki, podobnie jest z bordetella bronchiseptica. My sami możemy naszego pupila zarazić zapaleniem płuc np. a on nas zapaleniem opon mózgowych bądź grzybicą. Nie odstrasza nas to jednak od trzymania w domu zwierząt, nawet od spania z nimi i bardzo dobrze, bo nie wyobrażam sobie bez nich życia :)"));

			careService.create(new Care(8L, "Koszatniczka-chomik",
					"Niestety, z racji rozmiaru ciała, wspólne przebywanie z królikiem jest niemożliwe. Może dojść do sytuacji, iż królik niechcący swoją masywną budową ciała zrobi mniejszemu koledze krzywdę. Pod okiem opiekuna zwierzaki mogą się tolerować jednak pozostawienie ich samych sobie zdecydowanie odradzamy!!! Koszatniczka wolała by partnera w swoim gatunku, tak samo jak królik. Chomik natomiast jest zwierzakiem, który zdecydowanie preferuje samotne życie.</br>"
							+ "</br>"
							+ "Królik jest zwierzęciem stadnym, dlatego powinien posiadać choć jednego partnera swojego gatunku!!!  Nie możemy o tym zapominać ani tego lekceważyć!!! "));

			careService.create(new Care(8L, "Pies-kot",
					"Taka przyjaźń jest możliwa, aczkolwiek raczej okazjonalna. Mogą wzajemnie się tolerować, spędzać czas, ale ich mowa ciała i temperamenty raczej nie pozwolą na wzajemne zabawy do upadłego czy miłość aż po grób.</br>"
							+ "</br>" + "Zaprzyjaźnianie:</br>"
							+ "- przebiega tak samo jak w przypadku innych zwierząt (czyt., świnka morska)</br>"
							+ "</br>"
							+ "Królik jest zwierzęciem stadnym, dlatego powinien posiadać choć jednego partnera swojego gatunku!!!  Nie możemy o tym zapominać ani tego lekceważyć!!! "));

			careService.create(new Care(8L, "Człowiek",
					"Tak to jest cudowna przyjaźń :) ale choć by człowiek stawał na głowie i kochał całym sercem, to nie jest w stanie poświęcić uszatemu tyle czasu ile on potrzebuje. Może go przytulać i całować, ale nie wyliże mu oczu i uszków tak ja by to zrobił drugi królik. No i niestety nie pobawi się z nim do upadłego o 4 nad ranem. A to tylko nieliczne przykłady.</br>"
							+ "  </br>"
							+ "Królik jest zwierzęciem stadnym, dlatego powinien posiadać choć jednego partnera swojego gatunku!!!  Nie możemy o tym zapominać ani tego lekceważyć!!!"));

			careService.create(new Care(9L, "Za/przeciw", "</br>"
					+ "Im więcej na ten temat czytam tym bardziej jestem przekonana że każdy musi sam podjąć decyzje. Generalnie zdania są podzielone. Jedni są za zabraniem królika ze sobą inni przeciw.</br>"
					+ "   </br>" + "Jaki mamy wybór:</br>" + "a) możemy królika zabrać ze sobą</br>"
					+ "b) zostawiamy uszatka w domu i zapewniamy mu opiekuna dochodzącego</br>"
					+ "c) zostawiamy malucha w domu kogoś z rodziny, bądź znajomych</br>"
					+ "d)oddajemy królika do tzw. Hoteli dla zwierząt.</br>" + "</br>"
					+ "Zabieramy królika ze sobą - każdy królik ma swoją osobowość, a co za tym idzie inną odporność na stres. Niewątpliwie podroż jest dla uszatych sytuacją stresową. Zmiana miejsca, doświadczanie wielu nowych dźwięków, nie jest miłe. Ale czasami są sytuacje kiedy po prostu nie ma innego wyjścia i Kicek musi jechać z nami. Warto taką podróż zaplanować wcześniej, sprawdzić dokładnie na mapie najkrótszą trasę dojazdu samochodem bądź najszybsze połączenie autobusowe lub pociągiem. Uszatego przewozimy w transporterku. Ponieważ króliki na stres często reagują biegunką bądź zaparciem, warto do swojej podróżnej apteczki dołączyć espumisan na wzdęcia i herbatkę  z suszonych jagód na biegunkę. Wyjeżdżając za granice musimy dostosować się do zasad panujących w kraju do którego się udajemy. Koniecznie musimy posiadać świadectwo zdrowia wystawione przez służby weterynaryjne. Zaświadczenie to uprawnia do przewozu zwierzaka za granice i jest ważne tylko 10 dni. Obojętnie czy wakacje spędzamy w Polsce czy zagranicą, przed wyjazdem koniecznie upewnijmy się że wybrany przez nas środek transportu zgadza się na przewóz zwierząt.</br>"
					+ "</br>"
					+ "Uwaga: możemy zmniejszyć stres uszatka podając mu przed podróżą krople Bacha rescue, 3 kropelki na ulubiony owoc lub rozcieńczone z woda bezpośrednio do pyszczka.</br>"
					+ "</br>"
					+ "Zostawiamy królika w domu - pod warunkiem że uda nam się zapewnić mu opiekuna dochodzącego, który zadba o czystość w kuwecie i klatce, oraz uzupełni braki siana wody i warzyw </br>"
					+ "Bardzo ważne aby wybrać do tego odpowiedzialną osobę, która opiekę nad naszym pupilem potraktuje bardzo poważnie. Najlepiej jeśli opiekun byłby osobą znajomą królikowi - zawsze to mniejszy niepokój gdy intruz pojawi się w domu. Koniecznie przed wyjazdem spotkajmy się z opiekunem aby dokładnie mu wytłumaczyć na czym polega opieka nad królikiem, jak i kiedy podawać kolejne posiłki. Zostawić notatki z podstawowymi objawami chorób oraz telefon alarmowy do weterynarza oraz nasz prywatny. Najlepiej skład kolejnych posiłków również dobrze jest umieścić w rozpisce na kartce papieru. Zostawić opiekunowi pieniądze, na zakup pożywienia (jeśli wyjazd jest dłuższy), oraz na ewentualna wizytę u weterynarza.</br>"
					+ " </br>"
					+ "Zostawienie malucha u kogoś w domu w sumie równa się oddaniu królika do hotelu. I to i to jest dla malucha nowym miejscem, ma nowy zapach. Często również w towarzystwie innych zwierząt. Pamiętajmy że korzystamy z czyjejś gościnności więc wielu zasadą i my musimy się pod porządkować. Również w tej sytuacji przekazujemy potencjalnym opiekunom spisane na kartce zasady i rozpis żywienia, telefony alarmowe, oraz objawy chorób. Jedyna różnica jak tu ma miejsce, to w domu naszych znajomych bądź rodziny zawsze jest szansa na lepszą opiekę i zainteresowanie zwierzakiem, natomiast w hotelu nasz pupil będzie jednym z wielu zwierząt do opieki.</br>"
					+ "</br>" + ""));

			careService.create(new Care(9L, "Transporter",
					"Służy do transportu zwierząt, na co zresztą sama nazwa wskazuje. Transporter dla królika musi być odpowiednio duży żeby królik mógł spokojnie i wygodnie się w nim położyć. Podczas podroży wkładamy do transporterka tylko siano, nie mocujemy poidełka z wodą, a tym bardziej nie stawiamy w środku miseczki z woda. W czasie jazdy stawiamy go w stabilnym miejscu . Po każdej podroży czyścimy go, aby zachować higienę. Obecnie w sklepach zoologicznych jest duży wybór jeśli chodzi o kolorystykę jak i formę."));

			careService.create(new Care(10L, "Szelki",
					"Dużo królików za nimi nie przepada, co jest rzeczą naturalna. Szelki choć nawet idealnie dobrane zawsze w pewien sposób krępują ruchy no a w połączeniu ze smyczą  sprawiają, że uszaty nie może iść tam gdzie sam by chciał.</br>"
							+ "Nigdy nie używamy obroży i smyczy jakie są przeznaczone dla psów, bowiem grozi to uduszeniem i śmiercią królika.</br>"
							+ "W sklepach zoologicznych do kupienia są specjalne szelki przeznaczone dla królików. Należy odpowiednio przystosować ich obwód do rozmiarów naszego pupila. Króliki są bardzo delikatnymi zwierzakami, wiec nigdy nie postępujmy z nimi na siłę próbując im założyć szelki. wszystko musi odbywać się stopniowo, łącznie z nauka chodzenia na smyczy. Jeśli królik, się denerwuje przy spacerze powinniśmy przemyśleć rezygnacje z szelek i poszukać innej alternatywy na spacer np.: zagroda. W chwili obecnej na rynku godne polecenia są dwa rodzaje szelek</br>"
							+ "Jeśli chodzi o bezpieczeństwo naszego pupila nie polecałabym również szelek na ściągaczu, nie posiadają zatrzasków, przez co samo zakładanie jest bardziej stresujące dla królika.</br>"
							+ "Wiele osób chcąc zabrać maluchy na spacer, dla ich bezpieczeństwa są zmuszone używać szelek. "));

			careService.create(new Care(10L, "Zagroda na balkonie",
					"Może być okazyjna,  sezonowa bądź całoroczna. Po wstępnym zabezpieczeniu balkonu siatka, (o malutkich oczkach, aby nie było możliwości by królik się przecisnął) aby nie doszło do tragedii i nasz pupil nie wypadł z balkonu. Zagrodę okazyjną można wykonać z nici Cubes, bądź zrobić samemu czy kupić. Służy ona głównie temu aby królik w cieple dni mógł zaczerpnąć świeżego powietrza. W środku powinien znajdować się kocyk, miska z woda i jedzeniem i transporterek bądź karton kiedy królik zapragnie się schować.</br>"
							+ "Zagroda sezonowa dotyczy przebywania królika na balkonie całą dobę w okresie letnim. Zagroda ta musi być odpowiednio przystosowana, do nagłej zmiany pogody jak deszcz czy ochłodzenie. Musi posiadać daszek, aby królikowi nie padało. Oraz ocieplone miejsce gdzie maluch może się schować na noc bądź kiedy mu zimno. </br>"
							+ "Natomiast zagroda całoroczna wymaga precyzyjnego planu.  Powinna być częściowo zabudowana, aby Kicek miał ciepło i sucho. Najlepiej ocieplić ją styropianem lub płytami drewnianymi umieszczonymi miedzy ściankami. Bardzo ważne jest aby odpowiednio ocieplić podłogę. Najlepiej jeśli klatka jest ustawiona na nóżkach wtedy jest większa izolacja miedzy nią a zimnym betonem. Polecanym pomysłem zwłaszcza do stosowania nocą jest nakrycie klatki grubą kołdrą i ociepleniem spora ilością słomy. Na balkonie w zimie królik może zostać tylko pod warunkiem jeśli ma futro zimowe. Futro to wykształci się jeśli uszak będzie przebywał na dworze od lata. Zwierzaki,  które cały rok mieszkają na balkonie bądź ogródku dobrze znoszą minusowe temperatury, warunkiem są ocieplony domek, duża powierzchnia do biegania, partner i pod dostatkiem pożywienia. Aby nie dopuścić do zamarzania wody możemy do miseczki włożyć piłeczkę pingpongowa.  Nie zapominajmy, że jeśli planujemy trzymać królika na balkonie to powinien mięć on towarzysza do którego będzie mógł się przytulic w chłodniejsze dni, z którym będzie mógł biegać i bawić się kiedy nas nie będzie. Bez partnera królik będzie osamotniony, wykluczony z życia rodzinnego i nieszczęśliwy.</br>"
							+ " </br>"
							+ "Wyposażenie zagrody jest takie same jak klatki w domu, miseczki z woda i jedzeniem, kuweta paśnik, zabawki. Nie wolno nam do puścić aby królik przebywał na mokrym dywaniku bądź kocyku, powoduje to bowiem częste choroby dróg moczowych. oraz przeziębienia. Konieczne są szczepienia - raz w roku przeciwko pomorowi i dwa razy do roku przeciwko myksomatozie.</br>"
							+ "</br>"
							+ "Przyzwyczajać królika do zmiany otoczenia należy stopniowo najpierw na kilka godzin zapoznawać królika z nowym domkiem na balkonie. Z każdym dniem dłużej, jednak na noc zostawiamy dopiero po zniknięciu pierwszych przymrozków."));

			careService.create(new Care(10L, "Zagroda w ogrodzie",
					"Zagroda w ogrodzie dla królika to fantastyczne rozwiązanie. Królik ma w niej dużo więcej swobody niż w domowej klatce. Im większa tym lepsza, pod warunkiem oczywiście, że jest tak skonstruowana, że zapewnia królikowi maksimum bezpieczeństwa. Pamiętajmy że na naszych działkach, podwórkach, bądź ogrodach często pojawiają się inne zwierzaki, które mogą stanowić niebezpieczeństwo. Taki kojec/zagrodę można zrobić samemu, bądź kupić już gotową.</br>"
							+ "Można wykorzystać do tego również nic Cubes. Powinna być zabezpieczona siatka (o bardzo malutkich oczkach, aby nie mogły się przecisnąć łasiczki) z każdej strony, łącznie z góra i dołem zagrody. Bardzo ważne aby zamykana góra była przymocowana, dzięki czemu lis czy kot za pomocą łapy nie będzie  mógł odchylić siatki. Siatka na dole ważna jest, ponieważ uszatki kopią niesamowicie głębokie tunele, przez które mogły by się wydostać z zagrody. A tam już czyha nie jedno niebezpieczeństwo. Siatkę umieszczoną na dole zagrody wkopujemy w ziemię. Absolutnie nie mogą wystawać ostre gwoździe, czy inne śruby, wkręty na które może nadziać się uszaty. Nie stawiajmy zagrody, bezpośrednio na słonce, zdecydowanie lepsze jest miejsce w pół zacienione. Królik może sam decydować czy wylegiwać się na słoneczku czy ukryć w cieniu. Jeśli zdecydujemy się na zagrodę całoroczną, musimy zastosować się do zasad opisanych w (patrz. Zagroda na balkonie). Nie zapominajmy że w środku stawiamy miskę z woda oraz transporter, bądź karton gdzie w razie potrzeby królik może się schować. Nic królikowi nie zastąpi towarzysza swojego gatunku. Bez partnera królik będzie osamotniony, wykluczony z życia rodzinnego i nieszczęśliwy."));

			careService.create(new Care(10L, "Niebezpieczeństwa nma spacerze",
					"Głównym niebezpieczeństwem jakie nas i naszego pupila może spotkać w czasie spaceru to inne zwierzaki. Bardzo dużo jest biegających luzem psów i kotów. Na terenach łąkowych musimy mieć oczy do okoła głowy. Musimy chronić królika przed ptakami, lisami, polnymi zaskrońcami, kleszczami, a nawet owadami jak pszczoły, bąki, szerszenie. Kolejnym zagrożeniem są wszelkiego rodzaju rośliny i krzewy. Królik nie wszystkie może jeść. Miniaturki z racji wychowywania się w domach mają zatracony instynkt i nie są w stanie samemu określić co może im zaszkodzić, a co nie. Dlatego warto przed spacerem zapoznać się z listą Roślin trujących dla królików.</br>"
							+ "Na miejsce spaceru zdecydowanie wybierajmy miejsca, mało uczęszczane. Uszatki nie lubią bowiem hałasu, a przecież spacer to ma być sama przyjemność. Niebezpieczeństwem są też jeżdżące samochody, może bowiem się zdarzyć iż przestraszony królik wymknie się nam z rąk .... a potem przy jeżdżących samochodach o tragedie już nie trudno. Przyroda jest pełna niebezpieczeństw, ale warto jednak zachować środki ostrożności i spacerować."));

			careService.create(new Care(10L, "Zima",
					"Mówi się że królik ma przecież futro... To prawda, ale miniaturki żyjące w domach, w których jest ciepło nie mają sposobności zmieniać futerka na zimowe, bardziej cieplejsze. Dlatego podczas spaceru zimą mogą od czuwać chłód. Krótki spacer nie jest zakazany, ale wszystko powinno być z umiarem aby nie skończyło się przeziębieniem."));

			careService.create(new Care(10L, "Lato",
					"Króliki są bardzo podatne na upał i wysokie temperatury. Bardzo często zdąża się że króliki na skutek udaru słonecznego umierają. Nigdy nie wystawiamy królika bezpośrednio na słońce!!!Starajmy się wszelkie niedogodności zminimalizować najwięcej jak się da. Im chłodniej w pomieszczeniu w którym przebywa uszaty tym lepiej. Można położyć butelki z zamrożoną wodą, zawsze kiedy maluch znajdzie się w pobliżu butelki poczuje przyjemny  chłód. Zimna woda w miseczce, oraz dostęp do świeżych warzyw zapobiegnie odwodnieniu malucha. Wszelkie zimne powierzchnie stanowią dla królika w upalne dni ratunek. Dlatego Kicki lubią wtedy spacerować po kuchennych kafelkach.</br>"
							+ "</br>" + "Utrzymujmy czystość w kuwecie!!!</br>" + "</br>"
							+ "Bardzo często opiekunowie uszatych nie zdają sobie sprawy z powagi sytuacji, jaką jest możliwość dostania udaru słonecznego. Najczęstsze objawy to przekrwienie naczyń krwionośnych, stopniowe odmawianie pokarmu oraz przyspieszony oddech, zdecydowane przegrzanie ciała. Ratunkiem jest szybka wizyta u weterynarza. Sami w czasie drogi do weterynarza  możemy stopniowo próbować obniżać temperaturę ciała królika zimnymi okładami.</br>"
							+ ""));

			careService.create(new Care(11L, "Noworodki - sztuczne karmienie i opieka",
					"Do karmienia osieroconych maluszków musimy podejść bardzo poważnie. Karmimy je co cztery godziny 1ml mleka zastępczego. Stopniowo dawkę tą zwiększamy. Pamiętajmy iż mleko zastępcze nie jest tak tłuste jak mleko królicy. Karmimy strzykawką z mlekiem kozim lub specjalnym mlekiem dla kociąt, które możemy kupić u weterynarza. Aby poprawić pracę jelit maluszka warto do mleka dodać odrobinę lakcidu. Mleko zamiast w wodzie można rozrobić w herbatce koperkowej lub rumiankowej. Maluszka karmimy trzymając prostopadle na kolanach z lekko uniesiona główka,</br>"
							+ "aby maluch się nie za krztusił. Mleczko podajemy bardzo powoli. A jego ilość musimy dopasować do królika, zbyt obfita ilość spowoduje wzdęcia. Po każdym podaniu pokarmu naśladując zachowanie króliczej mamy, która liże malucha po brzuszku stymulując tym samym malucha do wypróżnienia. Za pomocą wacika zmoczonego w cieplej wodzie masujemy delikatnie odbyt królika ruch te stymulują go do zrobienia siusiu oraz kupki. Zabieg ten powtarzamy po każdym posiłku do czasu kiedy maluszek otworzy oczka ok. 10 dnia. 14 dnia  można stopniowo zacząć do diety maluszka wprowadzać siano, i wodę. A od 4tyg zieleninę. Przestajemy karmić maluszka mlekiem po upływie 6tyg. życia. Dokładnie tak samo zrobiłaby jego mama. Koniecznie należy dbać o higienę zarówno jeśli chodzi o dostarczany pokarm jak i higienę gniazda. Gniazdo tworzymy w kartonie od spodu wyłożonego ręcznikami, a następnie sianem, od góry przyciemniamy ręcznikiem do czasu aż maluszek otworzy oczka. Temperatura w pomieszczeniu gdzie przebywa maluch powinna wynosić ok. 20 C. Nie możemy dopuścić do przegrzania malucha ani do wyziębienia. W takich sytuacjach warto w domu mieć termofor lub mate grzewcza. Dbajmy o malucha pod czujnym okiem weterynarza."));

			careService.create(new Care(11L, "Sterylizacja (kastracja samiczki)",
					"Będę używać tego potocznego terminu dla odróżnienia operacji wykonywanej u samiczki od kastracji samca, lekarze weterynarii też używają tego określenia. Sterylizacja jest to operacyjne usuniecie macicy i jajników.</br>"
							+ "</br>" + "Kiedy jest wykonywana:</br>"
							+ "- z powodu wykrytych zmian chorobowych w układzie rozrodczym,</br>"
							+ "- profilaktycznie, aby zapobiec rakowi, ropomaciczu, czy guzów listwy mlecznej,</br>"
							+ "- z powodu częstych ciąż urojonych, rui permanentnej, agresji, wyładowywania się na partnerze.</br>"
							+ "</br>"
							+ "Sterylizacje można wykonać już w 5 miesiącu życia, górna granica właściwie nie istnieje. Powinniśmy wybrać sprawdzonego weterynarza, najlepiej korzystając z rad forumowiczów na forach króliczych. To trudniejsza operacja niż w przypadku samca, mogą wystąpić powikłania podczas narkozy i podczas wybudzania, dlatego ważne jest żeby przeprowadzał ją doświadczony lekarz.</br>"
							+ "</br>"
							+ "Przed operacją królica może jeść siano i pić wodę. Na 6 godz. przed narkoza zrezygnujmy z podawania granulatu i warzyw, podane przed operacja mogą być przyczyna wzdęcia. U weterynarza uszak zostanie dokładnie zbadany i zważony. Najlepsza narkoza podczas sterylizacji jest narkoza wziewna, nie obciąża tak układu krążenia, łatwiej ją kontrolować i królik szybciej się wybudza. Lekarz wykona ciecie 3-5 cm, usunie jajniki i macice. Weterynarz powinien założyć podwójny szew na wypadek, gdyby królik niepostrzeżenie dobrał się do rany i przeciął nici. Zapobiegawczo możemy w klinice kupić uszakowi kaftanik , odradzam kołnierz, ponieważ jest bardzo niewygodny dla uszaka i niepotrzebnie go stresuje.</br>"
							+ "</br>"
							+ "Dobry lekarz nigdy nie odda królika w pełni niewybudzonego, nie zgódźmy się na odebranie królika jeśli jeszcze śpi. Po operacji uszak dostanie środek przeciwbólowy i antybiotyk, które będą tez podawane przez kilka dalszych dni. Do transporterka możemy włożyć owinięty ręcznikiem termofor, utrzyma on ciepło podczas podroży. W domu zapewnijmy królikowi spokojny, zaciszny kąt z siankiem i woda w zasięgu wzroku. Klatka powinna być wyłożona ręcznikiem, w toalecie zamiast żwirku połóżmy ręczniki papierowe. Rozdzielenie od partnera nie jest konieczne, jeśli króliczy przyjaciel jest spokojny i nie przeszkadza królicy.</br>"
							+ "</br>"
							+ "Po dwunastu godzinach od narkozy królik powinien zacząć jeść, możemy go do tego zachęcić podając koperek, bazylie czy ulubione suszone zioła. Jeśli uszak nie ma apetytu należy zacząć dokarmianie. Najlepiej do tego nadaje się gotowy preparat Critical care, zupki warzywne dla niemowląt lub rozmoczony w rumianku granulat. Zwracajmy tez baczna uwagę na to czy królik pije, jeśli nie robi tego samodzielnie, należy go dopajać. Szew powinien być dwa razy dziennie kontrolowany, w razie gdyby był obrzmiały, mokry lub gdyby się rozszedł konieczna jest ponowna wizyta u weterynarza. Jeśli samiczka bardzo się nim interesuje, próbuje wyjąć szwy powinniśmy założyć jej kaftanik. Po 10 dniach lekarz zdejmuje szew.</br>"
							+ "</br>"
							+ "Samiczki królika są narażone na choroby układu rozrodczego tak samo jak inne zwierzęta i ludzie. Z wiekiem wzrasta ryzyko zachorowania. Z relacji weterynarzy i wolontariuszy SPK wynika, że większość profilaktycznie sterylizowanych królic ma już zmiany chorobowe na jajnikach czy macicy. W początkowym stadium nie dają one żadnych wcześniejszych objawów.</br>"
							+ "</br>"
							+ "Opiekunów, którzy posiadają nie wysterylizowane królice powinno zaniepokoić: częste ciąże urojone, chudniecie, agresja, ból przy dotyku brzucha, nieprzyjemny zapach z okolic ogonka, zgrubienia na listwie mlecznej, krwawe ślady w zagródce lub zakrwawione futerko. Przy w/w objawach należy niezwłocznie skonsultować się z lekarzem i po zrobieniu zdjęcia RTG lub USG  rozważyć przeprowadzenie sterylizacji.</br>"
							+ " </br>"
							+ "Uwaga: operacja u samiczek jest bardziej skomplikowana niż. u samców, aby uniknąć powikłań należy bardzo starannie wybrać lekarza weterynarii, najlepiej korzystając z doświadczenia forumowiczów na forach króliczych i wolontariuszy SPK."));

			careService.create(new Care(11L, "Kastracja samca",
					"Z różnych powodów kastrujemy swoje uszaki. Ja zrobiłam to, bo nie chciałam, żeby moje zwierzaki żyły samotnie. Dwa niekastrowane samce nie mogą być trzymane razem, grozi to poważnymi walkami i uszkodzeniami ciała. Samiec i samiczka to super kombinacja, ale obfitująca w liczne niechciane mioty. Innymi powodami kastracji jest agresja i znaczenie terenu, bardzo uciążliwe dla opiekuna i stresujące dla królika. Bardzo rzadkim powodem kastracji jest rak jąder.</br>"
							+ "</br>"
							+ "Kastracja polega na usunięciu obu jader, zabieg przeprowadzany jest pod narkozą. Trwa mniej więcej 15 minut. Kastruje się uszaki od 3 miesięcy w zwyż, w zasadzie nie ma górnej granicy.</br>"
							+ "Zanim zdecydujemy się na zabieg poszukajmy dobrego sprawdzonego weterynarza. Na wielu króliczych forach można znaleźć polecanego lekarza, cieszącego się dobra opinią.</br>"
							+ " </br>"
							+ "Przed zabiegiem królik może normalnie jeść, to ważne, królicze jelita i żołądek muszą cały czas pracować. Króliki nie potrafią wymiotować także zachłyśnięcie podczas operacji nie stanowi zagrożenia. Na sześć godzin przed operacją zostawmy królika na samym sianie, suszkach i wodzie. Zrezygnujmy z podawania granulatu i zieleniny, długo zalęgający w żołądku ww. pokarm może doprowadzić do wzdęć.</br>"
							+ "</br>"
							+ "Lekarz dokładnie zbada królika, osłucha serduszko, zmierzy temperaturę i zważy królika. Jeśli wszystko będzie ok. wstrzyknie mu dobrana do wagi dawkę narkozy, po chwili uszak już będzie w objęciach morfeusza.</br>"
							+ " </br>"
							+ "Po wszystkimi powinniśmy dostać królika już wybudzonego, będzie to jedna zmęczona kupka nieszczęścia, oczka zaczerwienione i posklejane maścią nawilżająca, zmierzwiona sierść i drżące ciałko.</br>"
							+ " </br>"
							+ "Powinniśmy już w domu przygotować termofor z ciepła woda, owinąć go ręcznikiem i włożyć do transporterka. Króliki po narkozie są zwykle zziębnięte i narażone na przeziębienie. Po przywiezieniu do domu zapewnijmy małemu pacjentowi ciepły, zaciszny kącik z siankiem i wodą w zasięgu wzroku, pozwólmy mu odpocząć.</br>"
							+ "</br>"
							+ "Kuweta w klatce powinna być wyłożona papierem zamiast granulatu lub żwirku, ostre granulki mogą urażać świeżą ranę pooperacyjną, a nawet ją uszkodzić. Po kilku godzinach od zabiegu uszak powinien zainteresować się jedzeniem, pierwsze bobki wskażą nam, że układ pokarmowy podjął swoja prace. Możemy zachęcić królika do jedzenia podając mu koperek czy bazylie. Codziennie kontrolujmy szew, z początku jąderka będą opuchnięte, ważne żeby nic się z nich nie sączyło. Na drugi dzień  po zabiegu królik powinien już normalnie jeść, poruszać się, bobkować, a nawet psocić. Gdyby nie miał apetytu, nie bobkował lub nie sikał, siedział nastroszony lub zgrzytał z bólu zębami musimy natychmiast zabrać go do weterynarza.</br>"
							+ "</br>"
							+ "Pamiętajmy, że wykastrowany królik jest jeszcze przez 3-6 tygodni płodny, dopiero po 6 tygodniowym okresie kwarantanny można go połączyć z samiczką. Niepożądane zachowania jak agresja, znaczenie terenu, kopulowanie znikają stopniowo w przeciągu 2- nawet do 6 miesięcy.</br>"
							+ "</br>"
							+ "Kastracja wczesna wykonywana jest w 10-12 tygodniu życia czyli jeszcze przed dojrzewaniem uszaka. Ma ona sens gdy np. kupiliśmy rodzeństwo. Kastrując tak wcześnie zapobiegamy wczesnej ciąży (znam przypadki 3 miesięcznych ciężarnych samiczek) oraz walk na tle terytorialnym pośród samczyków. Króliki wykastrowane do 12 tygodnia życia nie muszą być poddawane 6 tyg. kwarantannie, od razu mogą wrócić do swojej partnerki."));

			careService.create(new Care(11L, "Opieka nad samiczką w ciąży",
					"Ciąża u samiczki trwa średnio od 28 do 33dni. Samiczka musi pozostawać pod stałą opieka lekarza weterynarii. Ciąży towarzyszą objawy jak przy ciąży urojonej - budowa gniazda, agresja. Do czasu porodu żywimy samiczkę jak dotychczas, dodatkowo zwiększając porcje. Zapewnijmy samiczce maksimum spokoju. Poród odbędzie się miedzi 28 a 33 dniem ciąży i najczęściej odbywa się w nocy, bądź nad ranem. Pamiętajmy aby pod żadnym pozorem nie dotykać świeżo urodzonych maluszków. Kontrole gniazda możemy przeprowadzić kiedy samiczka je opuści</br>"
							+ "</br>"
							+ "Na 14 dni przed porodem powinniśmy zacząć podawać królicy zioła wspomagające laktacje.</br>"
							+ "</br>" + "Czarnuszka siewna: wspomaga laktacje</br>"
							+ "Pokrzywa: zwiększa laktacje i wzmacnia kości maluchów.</br>"
							+ "Przywrotnik: działa uspokajająco, hamuje krwawienie, przeciwzapalnie, oczyszcza krew i przyspiesza gojenie. Podaje się samiczce po porodzie, aby zapobiec zapaleniu macicy.</br>"
							+ "Mniszek lekarski: wspomaga laktacje.</br>" + "Rumianek: działa przeciwzapalnie.</br>"
							+ "Melisa i bazylia: zwiększają laktacje.</br>" + "Natka marchewki: wspomaga laktacje.</br>"
							+ "Fenkuł (koper włoski): wspomaga laktacje.</br>"
							+ "Liście malin: wzmacnia układ rozrodczy.</br>"
							+ "Mieszanka nasion i ziół wspomagająca laktacje: nasiona anyżu, nasiona kopru włoskiego, nasiona koperku, nasiona czarnuszki siewnej, suszona melisa i majeranek, wszystko w jednakowej ilości wymieszać.</br>"
							+ "</br>" + "Zioła których należy unikać:</br>" + "Mięta: zmniejsza laktacje.</br>"
							+ "Pietruszka: może wywołać skurcze, hamuje wydzielanie mleka.</br>"
							+ "Szałwia: zmniejsza laktacje.</br>" + "Seler: zmniejsza laktacje.</br>"
							+ "Lubczyk: nie podajemy ciężarnym królicom.</br>"
							+ "Tasznik pospolity: może wywołać skurcze, nie podajemy ciężarnym królicom</br>"
							+ "Jabłko: podawane karmiącej mamie może wywołać u małych biegunkę.</br>"
							+ "Bardzo ważne w okresie karmienia jest pilnowanie, aby mama miała zawsze miskę z czysta woda.</br>"
							+ "</br>"
							+ "Należy dodać więcej siana i słomy, aby królicza mama mogła je wykorzystać na budowę gniazdka. Dobrze by było postawić plotek/zagródkę wokół klatki lub zostawić otwarta klatkę, aby mama po</br>"
							+ "porodzie mogła swobodnie opuszczać gniazdko. To dla niej duży stres przebywać razem z maluszkami i narażać je tym samym na niebezpieczeństwo. Królicza mama odcina pępowinę i zjada popłód (łożysko, pępowinę i błony płodowe). Dokładnie myje malucha, mycie pobudza krążenie noworodka, oraz wzmacnia więź pomiędzy matka a dzieckiem. Może się urodzić od 4 do 10 maluszków, średnio rodzi się 5-6 królików.</br>"
							+ "</br>"
							+ "Uwaga: samiczka po porodzie jest natychmiast płodna, nie należy dopuszczać do spotkania z samcem, ponieważ grozi to następna ciąża.</br>"
							+ "</br>"
							+ "Dzień po porodzie należy ostrożnie zajrzeć do gniazdka, usunąć mocno zakrwawiona ściółkę, sprawdzić czy nie ma martwych królicząt. Nie powinno się bez konieczności dotykać noworodków. Wielu opiekunów martwi się, że królica nie karmi małych, nie troszczy się o nie, nawet ich nie dostrzega. To leży w naturze króliczej. Królicza mama nie chce zdradzić miejsca gniazdka. Dlatego pozornie wydaje się, że nie zwraca uwagi na maluchy i nie opiekuje się nimi. Królica karmi małe średnio raz-dwa razy dziennie, przeważnie w godzinach nocnych i nad ranem, tak, że opiekun tego</br>"
							+ "nie widzi.</br>" + "</br>"
							+ "Mleko mamy króliczej jest bardzo tłuste i starcza maluchom na długie godziny. Bardzo rzadko mama karmi maluchy po urodzeniu, przeważnie odbywa się to następnego dnia. Jeśli chcemy sprawdzić czy maluczki są nakarmione, z samego rana zaglądamy do gniazdka (mama powinna być na wybiegu, aby jej nie potrzebnie nie stresować) okrągłe brzuszki świadczą o zjedzonym posiłku.</br>"
							+ "</br>" + "Zapadnięte, pofałdowane brzuszki są oznaka, że mama ich nie nakarmiła.</br>"
							+ "Możemy spróbować przystawić małe do piersi królicy. Drugim wyjściem jest zaopatrzenie się w specjalne mleko zastępcze dla kociąt i dokarmianie maluchów, wg wskazań lekarza weterynarii. Jeśli zdecydujemy się na dokarmianie, należy maluchy zabrać od mamy aby nie wyrządziła im krzywdy. Dalsze wskazówki na temat sztucznego karmienia są w dziale Noworodki.</br>"
							+ "</br>"
							+ "Po trzech dniach od narodzin pojawiają się włoski, a czwartego dnia można już rozpoznać wzorki na futerku. Po siedmiu maluczki zaczynają słyszeć. Po 10-12 dniach otwierają się oczka. Po trzech tygodniach króliki zaczynają zwiedzać okolice, interesują się też jedzeniem mamy. W czwartym tygodniu jedzą już pokarmy stałe (siano, warzywa, zieleninę), ale nadal piją mleczko mamy, można już rozróżnić płeć. W wieku 6-8 tygodni mama przestaje je karmić. W wieku 12 tygodni należy rozdzielić samczyki od samiczek, maluchy mogą zacząć się rozmnażać między sobą."));

			careService.create(new Care(11L, "Ciąża urojona",
					"Króliki domowe są płodne cały rok, wiosna są bardziej pobudzone i częściej też dochodzi do ciąży urojonej. Także zaprzyjaźnianie i nowy partner/partnerka może spowodować ciąże urojona. Trwa ona 14-18 dni i później wszystko wraca do normy.</br>"
							+ "</br>" + "Objawy:</br>"
							+ "Samiczka jest nadpobudliwa, może być agresywna w stosunek do opiekuna bądź króliczego partnera. Ma słabszy apetyt dlatego może stracić trochę na wadze. Pod koniec ciąży zaczyna budować gniazdko, używa do tego siana, ściółki i własna sierść, którą wyrywa z okolic przednich łap, brzucha i wyściela nią gniazdko. Moja Lilly zatargała do gniazdka ubranka Barbie i czapkę mojej córki. Jak widać samiczki są bardzo kreatywne i posługują się tym co jest dostępne.</br>"
							+ " </br>"
							+ "Niektóre wyrywają futro swojemu partnerowi. Sutki samiczki mogą być powiększone, a nawet mogą wytwarzać mleko.</br>"
							+ "</br>"
							+ "Jeśli królica przechodzi ciążę urojona częściej niż raz - dwa razy w roku należy skonsultować się z lekarzem weterynarii. Ciąże są bardzo stresujące dla samic i ich partnerów, poza tym mogą być przyczyna ropomacicza lub innych chorób układu rozrodczego. Jeśli często się powtarzają powinniśmy pomyśleć o sterylizacji.</br>"
							+ "</br>"
							+ "Samiczkom w ciąży urojonej powinniśmy zapewnić dużo spokoju, nie powinna być zamykana w klatce razem ze swoim partnerem, klatka powinna być stale otwarta inaczej może dojść do bójek i ugryzień. Nie powinno się niszczyć gniazda, to duży stres dla królika i może wywołać agresje, budowa gniazda zacznie się od nowa. Lepiej poczekać, aż królica sama przestanie się interesować gniazdkiem, wtedy można go sprzątnąć.</br>"
							+ "</br>"
							+ "Pożywienie powinno być urozmaicone, można włączyć zioła, które maja działanie uspakajające np. przywrotnik (Alchemilla vulgaris), szałwie, rumianek, bazylie, melisę, fenkuł."));

			careService.create(new Care(12L, "Podnoszenie królika", "Prawidłowe</br>" + "Temat niezwykle ważny.</br>"
					+ "Prawidłowo podnosimy królika następująco:</br>"
					+ "-  Jedną rękę wkładamy pod brzuch królika a drugą w tym samym momencie podtrzymujemy pupę malucha. Następnie przytulamy malucha do piersi podtrzymując ręką.</br>"
					+ "</br>" + "</br>" + "Nieprawidłowe</br>" + "-  Nie podnosimy królika za uszy!!!</br>"
					+ "-  Nie podnosimy królika za łapki, ani przednie ani tylnie!!!</br>"
					+ "-  Nie podnosimy królika za skórę na grzbiecie!!!</br>"
					+ "-  Nie podnosimy królika za ogon!!!</br>"
					+ "Każda z w/w. nieprawidłowych możliwości jest nieprzyjemna, bolesna i może być groźna dla zdrowia."));

			careService.create(new Care(13L, "Cekotrofy",
					"Są to przydatne, poddawane fermentacji w jelicie ślepym kawałki karmy. Koprofagią - tak nazywa się powtórne zjadanie przez królika cekotrofów. Cekotrofy w przeciwieństwie do normalnych uformowanych bobków, zawierają :</br>"
							+ "- więcej białka</br>" + "- witaminę K</br>" + "- witaminy grupy B</br>"
							+ "- lotne kwasy tłuszczowe</br>" + "- oraz o połowę mniej włókna.</br>" + "</br>"
							+ "Jak rozpoznać cekotrofy:</br>" + "- mają mazistą konsystencje, powleczoną śluzem</br>"
							+ "- mają ciemniejszą barwę od normalnych bobków a nawet czasem zielonkawą</br>"
							+ "- charakteryzują się silna wonią</br>"
							+ "- kształtem przypominające owoce jeżyn bądź malin.</br>" + "</br>"
							+ "Dzięki ponownemu zjedzeniu, składniki odżywcze zawarte w cekotrofach, mają ponowną szanse na wchłonięcie do organizmu. Najczęściej w nocy i z rana następuje wydalanie przez królika cekotrofow. Małe króliki jedzą cekotrofy swojej mamy, zbyt szybko odsadzone od mamy i pozbawione jej cekotrofow mogą zapaść na groźne zapalenie jelit lub inne choroby układu pokarmowego.</br>"
							+ "</br>" + "Gdy ich brak:</br>"
							+ "- po pewnym czasie królik staje się osowiały, pozbawiony witamin, a w następstwie pozbawienia składników odżywczych staje się niedożywiony.</br>"
							+ "</br>" + "Gdy jest ich za dużo:</br>"
							+ "- taka sytuacja ma miejsce kiedy opiekun znajdzie w klatce, kuwecie czy na wybiegu, leżące nie zjedzone przez królika cekotrofy. Ich nadmiar powodowany jest zła dietą, składającą się głównie z ziaren i owoców. Za dużo zawartego w nich białka, węglowodanów. Dlatego nim podamy uszatkowi mieszankę karmy, bądź kolby dwukrotnie się zastanówmy, bowiem skutki takiej diety często są tragiczne."));

			careService.create(new Care(13L, "Kolor moczu",
					"Wielu opiekunom spędza sen z powiek. Zazwyczaj kolor moczu jest wynikiem, tego czym nasz pupil jest karmiony. Barwa może być od bezbarwnego do brązowawego. Warzywa z beta karotenem, barwią mocz. Często pojawia się mocz z białym osadem, to nic niepokojącego, króliki w ten sposób wydalają z organizmu węglan wapnia. Najczęściej opiekunów martwi czerwony kolor moczu. Często przyczyna tego jest zjedzenie mleczu bądź buraków. Czysta krew w moczu przybiera postać pasemek, ale często jest to niedostrzegalne gołym okiem. Wtedy należy udać się do weterynarza, standardowe badanie moczu pokaże czy są w nim erytrocyty (krew). Przy niepokojącej barwie moczu warto jest obserwować zachowanie uszatka, ono bowiem dodatkowo podpowie nam czy nasz niepokój jest słuszny. Pamiętajmy, że zła kondycja fizyczna i dieta przyczyniają się do wielu chorób układu moczowego u królika."));

			careService.create(new Care(13L, "Prawidłowe bobki",
					"Zawierają wszystkie niepotrzebne i trudne do strawienia cząstki pokarmu, opuszczają organizm królika w postaci wysuszonych uformowanych bobków. Ich kształt oraz częstotliwość pojawiania się informuje opiekuna o prawidłowej pracy przewodu pokarmowego. Ich brak, mikroskopijna lub nienaturalnie duża wielkość alarmują że zachodzą nieprawidłowości w funkcjonowaniu przewodu.</br>"
							+ "Przyczyną tego zazwyczaj jest wzdęcie lub zaparcie, nie leczone prowadzi do śmierci. Miękkie boby świadczą o zbyt bogatej diecie, chorobie lub błędach żywieniowych.</br>"
							+ ""));

		};
	}
}
