package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.AnimalRight;
import pl.justyna.HelloBunnies.model.Care;
import pl.justyna.HelloBunnies.model.CareCategory;
import pl.justyna.HelloBunnies.model.Disease;
import pl.justyna.HelloBunnies.model.DiseaseCategory;
import pl.justyna.HelloBunnies.model.FirstAid;
import pl.justyna.HelloBunnies.model.FirstBunny;
import pl.justyna.HelloBunnies.model.Nourishment;
import pl.justyna.HelloBunnies.model.NourishmentCategory;
import pl.justyna.HelloBunnies.model.OilyOrCereal;
import pl.justyna.HelloBunnies.model.OtherNourishment;
import pl.justyna.HelloBunnies.model.Poison;
import pl.justyna.HelloBunnies.model.SeedAndCereal;
import pl.justyna.HelloBunnies.service.AnimalRightService;
import pl.justyna.HelloBunnies.service.CareCategoryServie;
import pl.justyna.HelloBunnies.service.CareService;
import pl.justyna.HelloBunnies.service.DiseaseCategoryService;
import pl.justyna.HelloBunnies.service.DiseaseService;
import pl.justyna.HelloBunnies.service.FirstAidService;
import pl.justyna.HelloBunnies.service.FirstBunnyService;
import pl.justyna.HelloBunnies.service.NourishmentCategoryService;
import pl.justyna.HelloBunnies.service.NourishmentService;
import pl.justyna.HelloBunnies.service.OtherNourishmentService;
import pl.justyna.HelloBunnies.service.PoisonService;
import pl.justyna.HelloBunnies.service.SeedAndCerealService;

@Configuration
public class DataInitializeConfig {
	
	@Autowired
	private AnimalRightService animalRightService;
	
	@Autowired
	private FirstAidService firstAidService;
	
	@Autowired
	private FirstBunnyService firstBunnyService;
	
	@Autowired
	private DiseaseCategoryService diseaseCategoryService;
	
	@Autowired
	private DiseaseService diseaseService;
	
	@Autowired
	private CareCategoryServie careCategoryService;
	
	@Autowired
	private CareService careService;
	
	@Autowired
	private PoisonService poisonService;
	
	@Autowired 
	private NourishmentCategoryService nourishmentCategoryService;
	
	@Autowired
	private NourishmentService nourishmentService;
	
	@Autowired
	private SeedAndCerealService seedAndCerealService;
	
	@Autowired
	private OtherNourishmentService otherNourishmentService;

	@Bean
	public InitializingBean insertInitialData() {
		return () -> {
			animalRightService.create(new AnimalRight("Światowa Deklaracja Praw Zwierząt", "</br>" + 
					"Uchwalona 21.09.1977 r. w Londynie przez Międzynarodową Federację Praw Zwierzęcia,</br>" + 
					" zał. 2.04.1977 w Genewie. Deklaracja przedłożona została UNESCO wraz z podpisami</br>" + 
					" dwu i pół miliona osób, członków europejskich towarzystw opieki i ochrony zwierząt:</br>" + 
					"</br>" + 
					"\"Z uwagi na to, że każde zwierzę ma pewne prawa,</br>" + 
					"że nieznajomość i lekceważenie tych praw sprowadziły człowieka i prowadzą go nadal</br>" + 
					"na drogę przestępstw przeciwko naturze i zwierzętom;</br>" + 
					"że uznanie przez gatunek ludzki prawa innych gatunków zwierzęcych do egzystencji stanowi</br>" + 
					"podstawę współistnienia wszystkich istot żywych;</br>" + 
					"że człowiek popełnia zbrodnię ludobójstwa;</br>" + 
					"że poszanowanie zwierząt przez człowieka wiąże się z poszanowaniem ludzi między sobą</br>" + 
					"i że już od najmłodszych lat należy człowieka uczyć obserwować, rozumieć, szanować</br>" + 
					"i kochać zwierzęta;</br>" + 
					"</br>" + 
					"Niniejszym obwieszcza się:</br>" + 
					"</br>" + 
					"Art.1.</br>" + 
					"</br>" + 
					"Wszystkie zwierzęta rodzą się równe wobec życia i mają te same prawa do egzystencji.</br>" + 
					"</br>" + 
					"Art.2.</br>" + 
					"</br>" + 
					"a) każde zwierzę ma prawo do szacunku</br>" + 
					"b) człowiek, jako gatunek zwierzęcy, nie może rościć sobie prawa do tępienia innych</br>" + 
					"zwierząt lub do ich wyzyskiwania. Ma natomiast obowiązek wykorzystania całej swej</br>" + 
					"wiedzy w służbie zwierząt,</br>" + 
					"c) każde zwierzę ma prawo oczekiwać od człowieka poszanowania, opieki i ochrony.</br>" + 
					" </br>" + 
					"Art.3.</br>" + 
					"</br>" + 
					"a) żadne zwierzę nie może być przedmiotem maltretowania i aktów okrucieństwa</br>" + 
					"b) jeśli okaże się, że zwierzę musi być zabite, należy je uśmiercić szybko, nie narażając</br>" + 
					" je na ból i trwogę.</br>" + 
					" </br>" + 
					"Art.4.</br>" + 
					"</br>" + 
					"Każde zwierzę, które należy do gatunku dzikiego, ma prawo do życia na wolności w swym</br>" + 
					"naturalnym otoczeniu, ziemskim, powietrznym lub wodnym oraz prawo do rozmnażania się.</br>" + 
					"Każde pozbawienie wolności, choćby w celach edukacyjnych, jest z tym prawem sprzeczne.</br>" + 
					"</br>" + 
					"Art.5.</br>" + 
					"</br>" + 
					"a) każde zwierzę należące do gatunku, które żyje zazwyczaj w środowisku ludzkim,</br>" + 
					"ma prawo żyć i rosnąć zgodnie z rytmem i warunkami życia i wolności właściwymi dla swego gatunku,</br>" + 
					"b) każde zakłócenie tego rytmu i tych warunków przez człowieka w celach merkantylnych jest</br>" + 
					" z tym prawem sprzeczne.</br>" + 
					"</br>" + 
					"Art.6.</br>" + 
					"</br>" + 
					"a) każde zwierzę, które człowiek wybrał na swego towarzysza, ma prawo żyć tak długo,</br>" + 
					"jak długo pozwala na to jego gatunkowa natura,</br>" + 
					"b) porzucenie zwierzęcia jest aktem okrutnym i nikczemnym.</br>" + 
					"</br>" + 
					"Art.7.</br>" + 
					"</br>" + 
					"Każde zwierzę pracujące ma prawo do pewnych ograniczeń czasu i intensywności tej pracy,</br>" + 
					" do odpowiedniego wyżywienia i odpoczynku.</br>" + 
					" </br>" + 
					"Art.8.</br>" + 
					"</br>" + 
					"a) doświadczenia na zwierzętach, które wiążą się z cierpieniem fizycznym i psychicznym</br>" + 
					"niezgodne są z literą prawa zwierząt, zarówno w wypadku doświadczeń medycznych, naukowych,</br>" + 
					"handlowych, jak i wszystkich innych,</br>" + 
					"b) należy rozwijać i stosować w tym celu zastępcze metody techniczne.</br>" + 
					"</br>" + 
					"Art.9.</br>" + 
					"</br>" + 
					"Jeśli człowiek hoduje zwierzę w celach żywnościowych, należy je karmić, hodować,</br>" + 
					"przewozić i zabijać, nie narażając go na niepokój i ból.</br>" + 
					"</br>" + 
					"Art.10.</br>" + 
					"</br>" + 
					"a) żadne zwierzę nie może służyć rozrywce człowieka,</br>" + 
					"b) wystawianie zwierząt na pokaz oraz widowiska z udziałem zwierząt narażają na szwank</br>" + 
					"godność zwierzęcia.</br>" + 
					"</br>" + 
					"Art.11.</br>" + 
					"</br>" + 
					"Każdy akt prowadzący do zabicia zwierzęcia bez koniecznej przyczyny jest mordem,</br>" + 
					"czyli zbrodnią przeciwko życiu.</br>" + 
					"</br>" + 
					"Art.12.</br>" + 
					"</br>" + 
					"a) każdy akt prowadzący do uśmiercenia dużej ilości zwierząt dzikich jest masowym morderstwem,</br>" + 
					" czyli zbrodnią przeciwko gatunkowi,</br>" + 
					"b) zanieczyszczenie i niszczenie środowiska naturalnego sieje śmierć.</br>" + 
					"</br>" + 
					"Art.13.</br>" + 
					"</br>" + 
					"a) zwierzę martwe należy traktować z poszanowaniem,</br>" + 
					"b) sceny przemocy, której ofiarą padają zwierzęta, nie powinny mieć wstępu na ekrany kin</br>" + 
					" i telewizji, chyba, że mają inny cel poza samym tylko pokazywaniem, jak gwałci się prawa zwierząt.</br>" + 
					"</br>" + 
					"Art.14.</br>" + 
					"</br>" + 
					"a) stowarzyszenia ochrony i opieki zwierząt powinny mieć reprezentantów na szczeblu rządowym,</br>" + 
					"b) prawa zwierząt powinny być rozpowszechniane na równi z prawami człowieka.\"</br>" + 
					""));
			
			firstAidService.create(new FirstAid("Pierwsza pomoc", "</br>" + 
					"Zwykle wypadki jak na złość zdarzają się w weekendy lub w święta. Dlatego opisze jak udzielić pierwszej pomocy zanim skontaktujemy się z weterynarzem. Dobrze mieć pod ręką adres i nr telefonu dyżurującego lekarza weterynarii lub kliniki. Pierwsze i najważniejsze to zachowujemy spokój. Pamiętajmy o nawadnianiu chorych zwierząt, nie możemy w żadnym wypadku dopuścić do odwodnienia. Króliki, które nie maja apetytu dokarmiamy rozmoczonym granulatem z pomocą strzykawki ( bez igły).</br>" + 
					"</br>" + 
					" "));
			
			firstAidService.create(new FirstAid("Zawarte tu rady nie zastąpią wizyty u weterynarza !!!", "</br>" + 
					"Drobne rany, rany po ugryzieniu - smarujemy środkiem odkażającym np. riwanolem, wodą utlenioną lub jeśli nic takiego nie mamy - czystą, przegotowaną wodą. Nigdy nie smarujemy maściami ponieważ maść skleja futerko i weterynarz będzie miał duże trudności żeby ją usunąć.</br>" + 
					"</br>" + 
					"Przy większych ranach - krwawiących, musimy założyć bandaż lub opaskę uciskową zanim pojedziemy do weterynarza.</br>" + 
					"</br>" + 
					"Złamania - nigdy nie nastawiamy ani nie bandażujemy królikowi łapy, narazimy go na jeszcze większy ból. Wkładamy królika do transporterka żeby się nie poruszał i nie urażał sobie łapy i jedziemy do weterynarza.</br>" + 
					"</br>" + 
					"Trucizna - jeśli podejrzewamy, że królik zjadł coś trującego, bierzemy próbkę np. rośliny ze sobą, wtedy lekarz będzie mógł szybciej zareagować i podać właściwy lek.</br>" + 
					"</br>" + 
					"Ugryzienia przez owady - do  miejsca ugryzienia przykładamy zimny okład, jeśli królik wykazuje reakcje alergiczna musimy natychmiast udać się do weterynarza.</br>" + 
					"</br>" + 
					"Kleszcza - możemy sami usunąć chwytając go tuż przy nasadzie, jak najbliżej skóry, jednym szarpnięciem usuwamy pasożyta. Można się posłużyć pesetą lub specjalnymi haczykami do wyciągania kleszczy. Ranke dezynfekujemy.</br>" + 
					"</br>" + 
					"Lekkie rozwolnienie - ograniczamy dietę do sianka, do picia podajemy ciepłą herbatkę rumiankową, nagietkową, koperkową lub z czarnych jagód. Podajemy też suszone jagody i lakcid lub inny probiotyk. Pół kapsułki rano i pół wieczorem. Często zmieniamy ściółkę w klatce, a brudną pupę myjemy ciepłą wodą i dokładnie osuszamy. Jeśli rozwolnienie nie mija w ciągu 48 godz. lub stan królika się pogarsza idziemy do weterynarza. Weźmy ze sobą próbkę kału.</br>" + 
					"</br>" + 
					"Lekkie wzdęcie - zostawiamy w klatce tylko siano, do picia podajemy herbatkę koperkową, kminkową lub miętową. Podajemy dwa razy dziennie po pół kapsułki espumisan na wzdęcia. </br>" + 
					"</br>" + 
					"Lekkie zatwardzenie - odstawiamy granulat, do jedzenia tylko siano, suszone zioła, herbatka koperkowa, rumiankowa, miętowa, trzy razy dziennie 1 ml oleju parafinowego lub lnianego w ostateczności spożywczego.</br>" + 
					"Siemię lniane nawilża masę zalegającą w jelitach i pomaga w jej przesuwaniu. Gotujemy łyżeczkę siemienia w pół szklanki wody aż woda stanie się śliska i lekko ciągnąca, odstawiamy do wystygnięcia. Przecedzamy. Lekko ciepły kleik podajemy strzykawką (bez igły) do pyszczka, kilka razy dziennie. Ruch pomaga w przesuwaniu się treści pokarmowej, jeśli uszak odmawia biegania pomasujmy mu delikatnie brzuszek.</br>" + 
					"</br>" + 
					"Katar, przeziębienie - doraźnie może pomóc inhalacja takimi ziołami jak majeranek, tymianek i rumianek. Gorący wywar stawiamy blisko klatki, garnek i klatkę przykrywamy kocem na około 10 minut. Później dokładnie wycieramy uszaka. Możemy użyć też olejków dla niemowląt, skropić materiał i położyć w pobliżu klatki lub wkropić kilka kropelek do gorącej wody. Zapchany nosek czyścimy pompką/gruszką dla niemowląt.</br>" + 
					"</br>" + 
					"Oczy - łzawienie, zaczerwienienie, ropa - sprawdzamy czy przyczyna nie jest np. ciało obce, oczko przemywamy delikatnie solą fizjologiczną, świetlikiem lub zwykłą czarną herbatą. Królika pokazujemy weterynarzowi.</br>" + 
					"</br>" + 
					"Padaczka - usuwamy wszystkie niebezpieczne i twarde przedmioty, przygaszamy światło, wyłączamy tv i radio, cicho mówimy do królika, nie bierzemy na ręce!!!</br>" + 
					"</br>" + 
					"Udar cieplny - tu każda sekunda się liczy, chorego zwierzaka przenosimy w cień, podajemy wodę o temp. pokojowej! Ręcznikiem zamoczonym w chłodnej (nie lodowatej) wodzie przetrzeć najpierw głowę i uszy później łapy królika. Można podać pół łyżeczki kawy(nie w proszku), tak jak robimy normalnie kawę dla siebie. I szybko do weterynarza.</br>" + 
					"</br>" + 
					"Nieprzytomny królik - układamy zwierzaka na boku, głowę odchylamy do tylu aby umożliwić mu oddychanie.</br>" + 
					"</br>" + 
					"Świąd - można ulżyć królikowi smarując swędzące miejsce fenistilem. </br>" + 
					"</br>" + 
					"Zapalenie skóry podeszw, odgniotki - myjemy delikatnie skoki czystą, chłodną wodą, wycieramy i smarujemy maścią np. nagietkową, bepathen, tranową, sudocremem. Żwirek w kuwecie przykrywamy warstwa słomy lub siana, aby nie podrażniać chorych miejsc.</br>" + 
					"</br>" + 
					"Zakrztuszenie - układamy królika głową do dołu, jego plecy przylegają do naszego brzucha, prawą ręka szukamy miejsca gdzie kończą się żeberka a zaczyna brzuszek, naciskamy palcem wskazującym i środkowym 1-3 razy. </br>" + 
					"Jeśli zwierzak normalnie oddycha i przeżuwa to znaczy, że wszystko w porządku, jeśli nie - czynność powtarzamy.</br>" + 
					"</br>" + 
					"Mierzenie temperatury - Ważnym aspektem przy podejrzeniu choroby, lub początku infekcji jest kontrola ciepłoty królika. Odpowiednia temperatura ciała królika to 38-39,5 st.C. W przypadku podwyższonej temperatury należy zgłosić się do weterynarza, który przepisze odpowiednie leki, nigdy nie podawajmy na własną ręke leków stosowanych przez ludzi!</br>" + 
					"W przypadku temperatury zbyt niskiej ważne jest dogrzewanie królika, przy pomocy termoforu. Musimy pamiętać, że spadek temperatury u królika powoduje również, że leki działają dużo słabiej, lub nie działają wcale, dlatego istotne jest, aby temperatura została unormowana przed podawaniem leków.</br>" + 
					"Temperaturę mierzymy termometrem elektronicznym, i wkładamy go w odbyt nie głębiej niż 2 cm, głębsze włożenie może spowodować uszkodzenie narządów wewnętrznych. (głębokość zależna jest również od wielkości króliczka, ale nigdy nie wiecej niż 2 cm).</br>" + 
					"</br>" + 
					"Leki przeciwbólowe - Nigdy nie podawajmy na własną rękę, róbmy to zawsze po konsultacji z lekarzem, ale nie zapominajmy że w przypadku ch.oroby, której towarzyszy ból, środki przeciwbólowe są ważnym czynnikiem, który pomaga króliczkowi walczyć o siebie i w konsekwencji wyzdrowieć."));
			
			firstBunnyService.create(new FirstBunny("Dziecko i królik, czy to dobre rozwiązanie?", "Jednoznaczna odpowiedź na to pytanie jest niemożliwa, ponieważ to czy dziecko będzie dobrym opiekunem dla królika zależy od wielu czynników. Kilka z nich to: wiek dziecka, poczucie obowiązku i odpowiedzialności, nasz wpływ na zachowanie dziecka, naszą chęć pomocy przy opiece (niezbędny czynnik) i jeden z najważniejszych, nie wychowywać dziecka kosztem królika.</br>" + 
					"</br>" + 
					"Przed zakupem/adopcją królika dla dziecka musimy sobie uzmysłowić kilka podstawowych kwestii odnośnie królika. Na ich temat w internecie i w naszej świadomości krąży szereg stereotypów i mitów nie mających odzwierciedlenia w rzeczywistości. Większości wydaje się że są to zwierzęta spokojne, kochane, idealne do przytulania i zabaw z nimi lub nimi.</br>" + 
					"</br>" + 
					"Powinniśmy wiedzieć, że królik świat poznaje poprzez gryzienie, to mebli, to listew przypodłogowych, progów itp., są częstymi bywalcami za źle zabezpieczonymi szafami, pod segmentami i wersalkami. Dzieje się tak gdy króliki biegają \"luzem\" po domu, więc pewnie po przeczytaniu tego fragmentu, rodzic stwierdzi że królika zamkną w klatce, co jest bardzo złym rozwiązaniem, które ma wpływ na zdrowie i szybszą śmierć królika. Króliki są również bardzo delikatnymi zwierzętami fizycznie, to oznacza że dzieci przy \"zabawie\" mogą zrobić im krzywdę uszkadzając organy wewnętrzne, zresztą nie każdy królik lubi zabawy, a już na pewno błędem jest myślenie, że z królikiem będziemy bawić się tak jak z psem. Zazwyczaj branie uszatego pupila wiąże się dla niego ze stresem, stąd częste podrapania i wyrywanie zwierzęcia, takie zachowanie bierze się z instynktownego poczucia, że gdy jest brane na ręce, czyli podnoszone do góry, to tak jakby był porywany przez drapieżnego ptaka, więc gdy królik reaguje na to strachem i agresją, nie warto narażać go na takie doznania. Króliki swoje zalety pokazują dopiero gdy zostawimy je w spokoju, co zazwyczaj zniechęca dzieci. Królik lubi się bawić, ale na własnych zasadach, tzn. że jeżeli straci zainteresowanie zabawą, nie ma ochoty lub wypatrzył inne zajęcie to zabawa dziecka się kończy i żadne zmuszanie nie przekona uszaka do powrotu. Jak już wcześniej zostało wspomniane, króliki swoje prawdziwe oblicze pokazują, gdy zostawimy je w spokoju i skupimy się na obserwacji, wtedy możemy zauważyć szereg ciekawych zachowań, które potęgują doznania w chwili gdy królik jest trzymany ze współtowarzyszem.</br>" + 
					"</br>" + 
					"Atutami królika są:</br>" + 
					" - mogą być bardzo zabawne i śmieszne gdy na nie patrzymy, bez ingerencji;</br>" + 
					" - stosunkowo potrzebują mniej miejsca w domu niż pies czy kot;</br>" + 
					" - potrafią nawiązać bardzo silną więź z człowiekiem.</br>" + 
					"</br>" + 
					"Króliki są zwierzętami społecznymi, co oznacza, że do prawidłowego funkcjonowania potrzebują współtowarzysza w postaci drugiego królika, najlepszym połączeniem jest samica + wykastrowany samiec. Aby współżycie dziecka i królika odbywało się w poprawnych stosunkach należy uzmysłowić z natury niecierpliwemu dziecku, że przymusem, krzykiem i nie daj Boże biciem nic nie wskóramy u tego zwierzęcia, na takie zachowanie dziecka królik będzie reagować ucieczką i tupaniem. Podstawą nawiązania przyjaźni z królikiem jest zdobycie jego zaufania, które wiąże się z duża cierpliwością z naszej strony, jak również dziecka.</br>" + 
					"</br>" + 
					"Królik jako zwierze potrzebujące dużo ruchu powinno jak największą część dnia spędzać poza klatką, więc gdy dziecko straci zainteresowanie odpowiedzialność pilnowania królika spada na jego rodziców.</br>" + 
					"</br>" + 
					"W okresie dojrzewania i rujki królik może zmienić swoje zachowanie. Z grzecznego i ładnie korzystającego z kuwety królika może z dnia na dzień powstać mała bestyjka, która przy każdej próbie włożenia ręki do klatki warczy i próbuje ugryźć w palec, bzyczy i gania dookoła nóg, znaczy teren obsikując właściciela, przedmioty, pościel, ściany itd. oraz zostawia masę bobków na podłodze i łóżku. Jednak nie powinniśmy się tym zrażać jest to okres przejściowy i wiąże się z młodzieńczym buntem i dorastaniem</br>" + 
					"</br>" + 
					"Więc dziecko wraz z królikiem ma szansę powodzenia, tylko i wyłącznie przy pomocy osób dorosłych, ustaleniu stały, rozsądnych (dla królika) i niezmiennych zasad, warto również brać pod uwagę fakt że króliki potrafią dożyć do 13 lat, więc jest to zobowiązanie na lata, w trakcie których sytuacja dziecka (nowe szkoły, wyjazdy itp.) mogą ulec zmianie i to należy także brać pod uwagę.</br>" + 
					""));
			
			firstBunnyService.create(new FirstBunny("Zanim adoptujesz/kupisz królika", "Jak to zazwyczaj bywa, w przypadku wzięcia zwierzęcia dla dziecka, końcowa odpowiedzialność opieki spada na rodziców. To właśnie głównie na dorosłych będzie obowiązek zdobywania wiedzy na różnego rodzaju tematy.</br>" + 
					"</br>" + 
					"Ważne jest aby przed zakupem/adopcją królika zdobyć podstawy wiedzy na temat tych przemiłych stworzeń. Są to zwierzęta, które bardzo źle znoszą zmiany, szczególnie zmiany żywieniowe i właśnie od diety powinniśmy zacząć poznawać te zwierzęta, to najważniejszy aspekt przy ich opiece. Rodzic musi sobie uzmysłowić, że króliki są niebywale delikatnymi zwierzętami, wrażliwymi na stres i nieodpowiednią dietę. Objawy wszelkich chorób są bardzo subtelne i dużym atutem opiekuna jest ich znajomość i umiejętność szybkiej reakcji. Króliki to zwierzęta dość łatwo zapadające na choroby, więc dużo rozsądniejsze jest zapobieganie ich, niż ewentualne leczenie, które może by długotrwałe i kosztowne. Istotne są również regularne szczepienia.</br>" + 
					"</br>" + 
					"Przed podjęciem się opieki nad królikiem, należy (co było już wspomniane w temacie \"królik i dziecko\") wziąć pod uwagę wiek życia królika, czyli nie może być sytuacji, że po kilku miesiącach/latach nasza sytuacja na tyle się zmieni że królika albo oddamy do schroniska, albo porzucimy w \"ustronnym miejscu\".</br>" + 
					"</br>" + 
					"Niezmiernie ważna jest również cierpliwość, szczególnie na początku, przy nauce korzystania z toalety i oswojenie się z naturą królika. Królik potrzebuje również, aby człowiek poświęcał mu sporo czasu, przez co wytwarza się silna więź, która wynagrodzi nam poświęcony czas. Wiedza odnośnie zdrowia królika, nie sprowadza się tylko do prawidłowej diety, ale również do \"przestrzeni życiowej\", jeżeli nie możemy sobie pozwolić na trzymanie królika wolno biegającego po pokoju (wychowanie bezklatkowe), to dziennie musimy mu zapewnić co najmniej 4 godziny swobodnego biegania poza klatką, ma to ogromny wpływ na prawidłowy rozwój kości i ogólną kondycję. W związku z wypuszczaniem królika, lub właśnie \"wychowaniem bezklatkowym\" musimy się liczyć z tym że królik pomimo że sam jest wielkim czyściochem to jego otoczeniu już niekoniecznie, więc na nas spadnie obowiązek sprzątania ewentualnych bobków, podartych gazet itp. Jak już jesteśmy przy gazetach, to nie sposób nie wspomnieć o zabawkach, które są istotne w życiu królik.  Nudzący się królik, to chodzący niszczyciel, więc warto pomyśleć o zagospodarowaniu czasu naszemu pupilowi (rodzaje zabawek są opisane w dziale królicze zabawki), ale nie popadajmy w paranoję i nie wychodźmy z założenia, że królik wolno biegający to tylko zniszczenia, po prostu poznając dobrze naturę królika, w dość łatwy sposób jesteśmy wstanie zminimalizować szkody, które może wyrządzić uszak. Wpływ na zachowanie ma również wiek królika i to jak się z nim obchodzimy, nie możemy w żadnej sytuacji pozwolić sobie na krzyk i bicie, takie praktyki odniosą odwrotny efekt od zamierzonego i również zniszczą naszą więź z królikiem, nie wspominając o zaufaniu zwierzęcia do nas. Również wiek dziecka i usposobienie nie jest bez znaczenia, mianowicie króliki zdecydowanie są odradzane dzieciom poniżej 7 roku życia, gdyż dzieci w takim wieku są zazwyczaj hałaśliwe, również ważne jest jak dziecko jest usposobione, czy jest agresywne, czy jest (nadal) bardzo hałaśliwe, lubiące ruch itp. Króliki to spokojne zwierzęta, które nie lubią w swoim otoczeniu nadmiernego hałasu, szybkiego ruchu, to je bardzo stresuje i w takich sytuacjach bardzo łatwo o paniczne zachowanie, które odbija się na naszych stosunkach z uszakiem. Dlatego też ustawienie klatki powinno być na tyle rozsądne, aby nie stało blisko urządzeń, takich jak TV, wieża grająca, ale również nie była odosobniona i abyśmy mieli kontakt wzrokowy z nią.</br>" + 
					"</br>" + 
					"Koszty początkowe przy zakupie królika, są tak naprawdę kroplą w morzu późniejszych wydatków. Po zakupie niezbędnych rzeczy takich jak: duża klatka, poidełka, kuwet, podłoże itp., do kolejnych wydatków dojdzie odpowiednie pożywienie, wszelkiego rodzaju przyrządy ułatwiające pielęgnację, ewentualne leki itp. Więc przy zakupie królika nie liczmy ile nas to wyniesie na początku, ale policzmy czy będzie nas stać na późniejszą opiekę, na której naprawdę nie warto oszczędzać, bo koszty leczenia są zdecydowanie wyższe.</br>" + 
					"</br>" + 
					"Na początku przygody z królikiem, ważne jest również zwrócenie uwagi na ewentualne alergie naszych domowników, aby potem nie było sytuacji, że \"oddaje królika bo dziecko ma alergie\" takie rzeczy musimy sprawdzać wcześniej, bo królik to nie przedmiot, bardzo przeżywa rozstania z opiekunami, źle znosi brak zainteresowania i wyczuwa naszą niechęć do siebie.</br>" + 
					"</br>" + 
					"Więc rodzicu zanim zdecydujesz się na królika w domu, bardzo poważnie przemyśl decyzję, wybiegając w przyszłość. Artykuł wyżej nie ma zniechęcać do tych kochanych zwierząt, ale pokazać że kupno królika wiąże się ze zdobyciem ogromu wiedzy, ale gwarantuję że wszystkie nasze starania zostaną wielokrotnie wynagrodzone!</br>" + 
					""));
			
			firstBunnyService.create(new FirstBunny("Trzymanie królików zgodnie z ich naturą w mieszkaniu", " Trzymanie królików zgodnie z naturą w mieszkaniu? To stwierdzenie jest jednocześnie zaprzeczeniem, ponieważ w większości mieszkań króliki nie mają możliwości zgodnie z naturalną potrzebą np. kopać w podłożu. Większość opiekunów pragnie trzymać swoje króliki u siebie w mieszkaniu, lub na balkonie, aby mieć z nimi ścisły kontakt. Oczywiście można także w mieszkaniu stworzyć królikowi warunki jak najbardziej zbliżone do naturalnych. Jest to powiązane z dużym nakładem pracy i zrozumieniem, liczeniem się z królikiem.</br>" + 
					"</br>" + 
					"Jak powinna wyglądać zagródka?</br>" + 
					"Jaka nie powinna być można zobaczyć w sklepach zoologicznych i u wielu opiekunów. Mała klatka dla 1-2 królików, dekoracyjnie ustawiona w kacie pokoju, przy ścianie, lub niszy gdzie zwierzęta są przetrzymywane w zamknięciu. Niestety jest to jeszcze do dnia dzisiejszego częsty obraz. Z naturalnymi potrzebami gatunku nie ma to nic wspólnego i każdy opiekun powinien zdawać sobie z tego sprawę, że taka klatkowa hodowla dla właściciela jest bardzo praktyczna, ale dla aktywnych i zdrowych królików jest katorga. Małe klatki nie mają na tyle miejsca, żeby królik mógł przeżyć cały swój repertuar naturalnych zachowań. Każdy królik potrzebuje \"norki\" do spania, w klatce musi być możliwość zejścia sobie z drogi, każdy królik powinien mieć swoje miejsce do odpoczynku. Do tego króliki są bardzo aktywnymi zwierzątkami, które chętnie biegają i kicają, zagroda powinna więc mieć dosyć miejsca, żeby uszak mógł wykonać jeden duży skok bez zagrożenia, że wyląduje na kracie klatki. Musi być oddzielne miejsce na jedzenie i oddzielne na toaletę. Sklepowe klatki tych warunków nie spełniają, mogą służyć jedynie jako miejsce przejściowe np. przy kwarantannie lub jako miejsce na odpoczynek w zagródce. Idealnie byłoby dla wszystkich królików gdyby mogły w dzień i w nocy biegać po całym mieszkaniu lub przynajmniej w jednym pokoju. Niestety nie zawsze jest to możliwe, duże zagrody z metalowych elementów są świetną alternatywą dla całodobowej wolności.</br>" + 
					"</br>" + 
					"Wielkość</br>" + 
					"Na jednego królika przypada 2m² wybiegu większe rasy potrzebują 3m². Większość opiekunów będzie zaszokowana, 2m² na małe zwierzątko, dlaczego? Odpowiem obrazowo: w celi więziennej na jednego więźnia przypada łóżko, stół, krzesło, toaleta i umywalka. Teraz spójrzmy na normalnej wielkości klatkę: w kącie toaleta, jeśli królik ma szczęście to półka gdzie może sie umyć, niżej domek służący za łóżko, kąt na jedzenie i więcej nic sie nie zmieści. Więzień wychodzi ze swojej celi na kilka godzin na spacer. Króliki mają kilka godzin wybiegu. Co takiego zrobiły nasze zwierzęta, że są traktowane jak więźniowie? Czyż nie mają prawa jako nasi przyjaciele i współlokatorzy do naszego mieszkania? Króliki potrzebują przestrzeni gdzie zagospodarują swój wolny czas, muszą biegać, skakać, przytulać się i bawić. Do tego potrzeba 4m² dla dwóch uszaków. Każdy człowiek może wydzielić taki obszar ze swojego mieszkania. Wystarczy zrezygnować z kilku regałów,  stolika, poprzestawiać meble czy przegrodzić balkon. Tak, można, ale nie wszyscy ludzie są na to gotowi. Zadaje sobie pytanie: dlaczego więc trzymają swoje zwierzaki, miłość do zwierząt nie może być tu powodem.</br>" + 
					"</br>" + 
					"Króliki poruszają się do przodu kicając i skacząc. W zwykłej sklepowej klatce nie mogą wykonać jednego dużego skoku żeby nie wylądować na kracie, czy to jest zgodne z ich potrzebami? Często w książkach i organizacjach zwierzęcych poleca się klatkę o wymiarach 140 na 70 jako minimum dla dwóch królików, ale tylko dlatego, ponieważ większych klatek w sklepach nie ma. Jeśli ktoś musi mieć taką klatkę powinien połączyć dwie, (stawiając jedną na drugiej) oprócz tego pół dnia wybiegu to obowiązek. (...) Zupełnie nie nadają się klatki z plastikowa góra. Cyrkulacji powietrza prawie w niej nie ma, źle uchodzi gorąco i wilgoć. Akwarium też absolutnie się nie nadaje.</br>" + 
					"</br>" + 
					"Zbudowane własnoręcznie</br>" + 
					"Świetnie nadają się zagrody zbudowane samemu, są tańsze i o wiele ładniejsze niż klatki. Przy wysokości 100cm góra może być otwarta, podłoga i 2-3 ściany ze sklejki, z przodu metalowa siatka, (lepsza cyrkulacja powietrza i oświetlenie) do tego drzwiczki żeby zwierzęta mogły same wychodzić i wchodzić kiedy chcą. Zrozumiałe, że nie każdy właściciel chce poświęcić swoje mieszkanie dla królików. W sklepach można znaleźć tanie zagródki z metalowych elementów, które można szybko rozłożyć i ustawić w dogodnym miejscu.</br>" + 
					"</br>" + 
					"Przy wyborze i urządzaniu zagródki warto przestrzegać pewnych zasad. Zagroda powinna chociaż w małej części zapewnić wszystkie możliwości naturalnego środowiska królika. W króliczym stadku panuje ścisła hierarchia. Każdy zwierzak potrzebuje miejsca do spania. Może to być duży domek, dolna część klatki z poleczka wyłożona słomą itp.</br>" + 
					"</br>" + 
					"Króliki o najwyższej pozycji w naturze zajmują norkę w środku rewiru. Nasze domowe zwierzęta często postępują tak samo. Dlatego w małych grupach króliczych domki/posłania powinny być ustawione na środku i na tylniej ścianie w bezpiecznym miejscu. Dla trzech zwierząt stawiamy dodatkowe posłania na brzegach aby niżej stojące w hierarchii króliki znalazły tam miejsce dla siebie. W kątach zagródki trzeba ustawić kuwety. Gdzie króliki będą chciały mięć swoje toalety wskażą państwu same. W oddali od kuwet stawiamy wodę i miseczki na pokarm. W zagródkach na dworze będą one stały w miejscu zadaszonym, w  mieszkaniu z dala od żwirku lub np. na pięterku.</br>" + 
					" </br>" + 
					"Paśniki i kąciki z sianem rozstawiamy w rożnych miejscach, szczególnie jednak w miejscach do odpoczynku. Część zagródki musi zapewnić miejsce do biegania i skakania, najlepiej do tego nadaje sie część przednia. Nie powinna ona być zastawiona zabawkami i innymi przedmiotami. Resztę miejsca przeznaczona jest do odkrywania, zabawy i szukania. Tu postawimy połówki rur, tunele i inne użytkowe przedmioty. Jeśli zagródka jest na to za mała, zabawki stawiamy na wybiegu. (...)"));
			
			firstBunnyService.create(new FirstBunny("Królik w klatce", "Zwierzęta, w tym również małe ssaki są kupowane przez ludzi, chcących się o nie troszczyć i dbać. Niestety w dużej mierze kupując zwierzę ludzie nie zdają sobie sprawy z ich wymagań. Szczególną popularnością w śród małych ssaków cieszą się króliki, które w przeciwieństwie do niektórych zwierząt w czasie głodu, strachu lub frustracji nie robią dużego hałasu, przez co są mniej uciążliwe dla opiekuna.</br>" + 
					"</br>" + 
					"Króliki są bardzo często kupowane przez dorosłych pod wpływem dzieci, które obiecują sumienne opiekowanie się zwierzęciem. Dzieci nie są skłonne w pełni zaopiekować się zwierzęciem, a do tego dochodzi jeszcze fakt, że wcześniejsze obietnice zostają szybko zapomniane i cały ciężar opieki spada na rodziców, którzy zazwyczaj nie mają czasu na opiekowanie się królikiem. W konsekwencji królik zostaje włożony do klatki, która zazwyczaj jest stawiana w odosobnionym miejscu np. garażu. Czasami dla koleżeństwa dodajemy drugiego królika do klatki, co może powodować sytuacje stresujące, szczególnie gdy jeden z osobników jest szczególnie dominujący, a królik zdominowany nie ma możliwości ucieczki. W konsekwencji królik spędza tak całe życie, które może trwać 13 lat. Opieka właściciela ogranicza się do podania jedzenia i picia, często nieświadomy właściciel nie wie nawet że królik jest chory i tak naprawdę pomału umiera w zamknięciu.</br>" + 
					"</br>" + 
					"Istnieje prawo, które mówi że zwierzęta gospodarcze, np. króliki trzymane na ubój muszą być codziennie badane w dobrym świetle, jak również muszą mieć codzienny dostęp do świeżej karmy, jak również picia. Chore osobniki muszą być odizolowane od reszty zwierząt. Jest to zapisane w ustawie o prawach zwierząt z 1911r.</br>" + 
					"</br>" + 
					"Bardzo ciężko jest stwierdzić prawdziwe zachowania królików, które są trzymane pojedynczo w klatkach. Dzikie króliki są bardzo towarzyskie, żyją w małych społecznościach, w których można zauważyć silny instynkt terytorialny. Ich układ trawienny jest przystosowany do spożywania wysoko włóknistej diety, w której niestrawne porcje są w szybki sposób wydalane, w postaci okrągłych bobków. Przyswajalny ułamek pokarmu jest zatrzymywany w jelicie ślepym i tam ulega fermentacji bakteryjnej, zanim zostanie wydalony w postaci małych kulek pokrytych śluzem i o silnym zapachu. Te kulki (cekotrofy) są dostarczycielem niezbędnych do prawidłowego funkcjonowania królika odżywek witaminowych. Proces, w którym powstają cekotrofy pozwala królikowi w szybki sposób przetrawić pokarm, co ma wpływ na szybszą ucieczkę do schronienia przed czyhającymi na nich drapieżnikami, jak również nieociężałość w czasie ucieczki. Twardy kał pełni role swoistego znacznika terytorium. Potrzeby fizjologiczne są głównym wyznacznikiem codziennego rytmu życia. Wzmożoną aktywność króliki wykazują późnym popołudniem i wczesnym rankiem, ten czas pożytkują na jedzenie, zabawę, znaczenie terenu i gody. Resztę dnia spędzają w swoich jamach, gdzie odpoczywają i budują wzajemne relacje społeczne. W szczególnie piękne dni króliki odpoczywają przed swoimi jamami, takiego zachowania nie zauważymy u samotnych królików, trzymanych w klatkach.</br>" + 
					"</br>" + 
					"W ostatnich latach warunki laboratoryjne uległy zmianie, został wdrążony plan trzymania królików bardziej zbliżony do naturalnych, tzn króliki nie są już trzymane w klatkach, a w większych pomieszczeniach i w większych grupach. Przeprowadzając tak badania tj. na królikach trzymanych pojedynczo w klatkach i na królikach w większych społecznościach naukowcy zauważyli zmiany morfologiczne w gruczołach nadnerczych między dwoma badanymi grupami, takie badania również dowiodły że króliki trzymane pojedynczo w klatkach mają mniejszą gęstość kości, co może prowadzić do deformacji kręgosłupa, szczególnie tyczy się to hodowanych tak samiczek. Takie \"dolegliwości\" są bardzo często spotykane u królików domowych, które mogą prowadzić do utraty elastyczności kręgosłupa, a co za tym idzie w znaczny sposób utrudniają, lub nawet uniemożliwiają spożywanie cekotrofów prosto z odbytu. Przy prawidłowym pobieraniu cekotrofów może również przeszkadzać dolegliwości związane z zębami, jak i otyłość królika. W klatkach takie </br>" + 
					"dolegliwości są bardzo uciążliwe dla królika, jak również dla jego opiekuna, szczególnie jeżeli chodzi o pielęgnację. Króliki w klatkach, które nie mogą pobierać cekotrofów prosto z odbytu są narażone na wiele problemów pielęgnacyjnych. W bardzo ograniczonej  przestrzeni wypadające cekotrofy nie są swobodnie pobierane, więc może się to skończyć przysiadaniem królika na swoich odchodach, a co za tym idzie tworzenia się kołtunów, w skład których wchodzić będzie sierść i cekotrofy. Zapach takiej mieszanki jest częstym powodem kolejnych następstw odosobnienia królika, które wraz z klatką są wynoszone w inne pomieszczenia, w których nieprzyjemny zapach nie doskwiera \"opiekunom\", lub są porzucane w inny sposób.</br>" + 
					"</br>" + 
					"Szczególną uwagę powinniśmy zwrócić na włóknistą dietę, której zaniedbania mogą prowadzić do</br>" + 
					" problemów gastrycznych, nieleczone są częstym powodem śmierci królika. Wiele królików kończy tak życie, zupełnie nieświadomych opiekunów. Stan, który uniemożliwia prawidłowemu pobieraniu cekotrofów, jest przyczyną chorób związanych z nieprawidłową pielęgnacją futra i skóry. Szczególnie częstymi pasożytami w takich problemach są Leporacus Gibbus i Cheyletiella parasitovorax (chejletieloza). Króliki trzymane w grupach nawzajem dbają o higienę w miejscach trudniej dostępnych. Osobniki trzymane pojedynczo, szczególnie ras długowłosych jak angory, nie są w stanie samotnie utrzymać higienę na przyzwoitym poziomie, a sytuacja ulega jeszcze pogorszeniu gdy doskwierają mu dolegliwości opisane powyżej. Bardzo otyłe samiczki mają dużo problemów z dbałością o higienę \"krocza\", gromadzą się tam różnego rodzaju nieczystości, zaniedbanie takich miejsc będzie prowadzić do zapaleń i zakażeń.</br>" + 
					"</br>" + 
					"Pododermatitis (schorzenie międzypalcowe) jest bardzo bolesnym stanem dla zwierzęcia, początek choroby zaczyna się właśnie u królików trzymanych w klatkach, gdzie podłoże jest mokre i brudne.</br>" + 
					" Konsekwencją takiego stanu będzie zagnieżdżenie się larw much, które mogą być przyczyną dalszych ułomności pielęgnacyjnych królika, co w końcu pogarsza jeszcze bardziej jego stan. Zarówno \"schorzenie międzypalcowe\" i larwy much jest często niezauważone przez opiekunów, aż do momentu znacznego pogorszenia stanu, taka sytuacja jest wyjątkowo częsta właśnie u zwierząt odizolowanych w innym pomieszczeniu niż pozostali domownicy. Na pogorszenie stanu zdrowia ma też wpływ nieodpowiednia dieta. Obecnie większość opiekunów swoją opiekę nad królikiem sprowadza do podania karmy. Kiedyś króliki były żywione kuchennymi karmami, plus pożywienie, które zdobyły same w ogrodzie takie jak trawa i inne zielska. Obecnie większość opiekunów kupuje karmę w sklepie, lub supermarkecie. Są zachęcani do karm składających się z dużej ilości zbóż, lub słodkich dodatków, wierząc że taka karma jest najlepsza dla naszych uszatych pupili. Mylące są również rady udzielane przez pracowników sklepowych, którzy nie mają pojęcia o potrzebach i wymaganiach królików. Powszechnym mitem jest że królik po zjedzeniu zieleniny może dostać biegunkę. Właściciele zwierząt, zachęcani przez reklamy, jak również swoją wygodę podają miskę lub dwie dziennie z taką mieszanką, która w znaczny sposób ogranicza spożycie siana, lub zieleniny. Taka dieta dostarcza bardzo mało składników mineralnych, niezmiernie ważnych do prawidłowego uzębienia i funkcjonowania królika. Niska zawartość włókna i wysoka węglowodanów sprawia że zmniejsza się fizjologiczne zapotrzebowanie na cekotrofy, ale również forma cekotrofów ulega przeinaczeniu. Cekotrofy zmieniają swoją formę na bardziej miękką, i kleistą, a w konsekwencji królik trzymany w klatce jest jeszcze bardziej narażony na kołtunie się sierści z cekotrofami. Takie karmowe mieszanki pozwalają królikowi na wybieranie ulubionych składników, są to szczególnie: kukurydza, groszek, pszenica, jest to dieta o bardzo małej zawartości wapna i witaminy D, przez co zęby, które rosną całe życie zostają pozbawione budulca, przez co dochodzi do szeregu schorzeń, jak również deformacji uzębienia. Problemy z korzeniami zębów, jak również z ich koroną sprawiają duży ból królikowi. Następstwami tych chorób mogą być ropnie, które utrudniają, lub wręcz uniemożliwiają spożywania pokarmów. Zboża wraz ze swoimi mieszankami, zawierają również bardzo małą ilość włókna, prowadzi to do poważnych problemów jak bezoary i owsiki w przewodzie pokarmowym. Króliki poddane diecie węglowodanowej</br>" + 
					" są narażone na otyłość i wszystkich problemów z tym związanych.</br>" + 
					"</br>" + 
					"Podczas badań prowadzonych w latach 1995-1997, pobrano krew od królików z chorobami zębów. Stan krwi u królików \"wolno biegających\" był zupełnie inny niż królików zamkniętych w klatkach.</br>" + 
					"U królików chowanych bez klatkowo poziom krwinek czerwonych i białka był wyższy. Limfocyty nie były niskie tylko u chorych królików trzymanych w klatkach, ale również zaniżona wartość występowała u zdrowych \"więzionych\" osobników. W ostatniej dekadzie można zauważyć wzrost wiedzy na temat wymagań królika, przez co ich warunki bytowania w domach się poprawiły. Króliki nie są już tylko zachcianką dziecka, coraz więcej dorosłych ludzi wybiera te zwierzątka na domowego pupila zamiast psa czy kota, wpływ na to ma stosunkowo łatwiejsza pielęgnacja, szczególnie jeżeli jest mowa o wyjściach na spacer z psem. Nadal nader często spotykamy że króliki są zamykane w klatkach w czasie nieobecności domowników, lub są wypuszczane raz na kilka dni z klatki. Indywidualne cechy królików, jak również ciekawa natura sprawia że króliki są coraz częstszymi mieszkańcami w naszych domach. Są zwierzętami, które potrafią nawiązywać z człowiekiem bardzo silne wzajemne więzi. Kastracja (sterylizacja) zmieszają u królików zachowania niepożądane przez człowieka, przez co również są częściej wybierane na towarzyszy rodzinnych. Nowoczesne zakłady produkującą jedzenie, wypuszczają na rynek coraz więcej wysoko włóknistej karmy, które w połączeniu z zielenina i nieograniczonym dostępem do siana tworzą dietę niemal idealną. Świadomość społeczna jest coraz większa i przed zakupem przyszły właściciel zastanowi się nad swoim nabytkiem. Idealne życie królik wiedzie ze swoimi współtowarzyszami (czyt. inne króliki), w naszym ogrodzie z dala od drapieżników, gdzie mają nieograniczony dostęp do różnorakiej roślinności, kopią swoje jamy, jak również mają dużo miejsca do zabaw i pościgów. Takie warunki nie są jednak możliwe w większości domach, więc kompromisem jest zaopatrzyć się w dobrze usytuowaną klatkę o jak największych wymiarach, rozsądną dietę, codzienną dbałość o higienę klatki, jak również królika, zapewnienie królikowi dużo ruchu poza klatką, jak również współtowarzysza w postaci innego królika. "));
			
			firstBunnyService.create(new FirstBunny("Żaden królik nie zasługuje na samotność", "W naturze króliki żyją w dużych grupach i mają bardzo rozbudowane zachowania społeczne.</br>" + 
					"Tak jak ludzie potrzebują partnera, żeby być szczęśliwym.</br>" + 
					"Człowiek jest izolowany w celi za straszne czyny które popełnił.</br>" + 
					"Co zrobił królik, że trzeba go izolować?</br>" + 
					"Argumenty przeciwko trzymaniu królika w pojedynkę.</br>" + 
					"</br>" + 
					"Większość opiekunów jednego królika ma przeważnie podobne argumenty za pojedynczym chowem. Najczęstsze i najbardziej przekonujące będą tu wymienione.</br>" + 
					"</br>" + 
					"1. Mój królik czuje się szczęśliwy sam.</br>" + 
					"</br>" + 
					"Króliki potrafią się świetnie przystosować. To, że królik był nieszczęśliwy widać dopiero po zaprzyjaźnieniu go z innym, jak bardzo się cieszy mając u boku partnera, jak odżył przy nowym przyjacielu. Czysto naukowo wszystko przemawia przeciwko szczęśliwemu życiu królika trzymanego w pojedynkę. Kto raz podpatrywał dzikie króliki, wie, że żyją one w dużych grupach. Mają bardzo rozwinięte zachowania społeczne: myją się wzajemnie, śpią obok siebie i bawią się razem. Także inne zachowania świadczą o stadnej naturze królika np. tupanie tylnymi skokami, które podczas zagrożenia ostrzega całą grupę. Według Ustawy o Ochronie zwierząt wszystkie zwierzęta powinny być chowane zgodnie ze swoja natura. Naturalne dla królika jest życie w grupie.</br>" + 
					"</br>" + 
					"2. Bardzo dużo czasu poświęcam królikowi, rzadko jest sam.</br>" + 
					"</br>" + 
					"Możesz go głaskać, ale nie lizać i myć. Możesz go karmić, ale nie sprzeczać się z nim o liść kalarepy. Możesz mu sianem wyścielić zagródkę, ale nie ogrzewać go w nocy, ale przede wszystkim możesz do niego mówić, ale nie jego mowa. Tego wszystkiego strasznie mu brakuje, nawet jeśli jesteś doskonałym opiekunem.</br>" + 
					"</br>" + 
					"3. Mój królik nie jest sam, ma świnkę morska za partnera.</br>" + 
					" </br>" + 
					"To jest jeden z gorszych tragizmowi dla królika, że ktoś wpadł na pomysł, że te dwa zwierzęta mogą być trzymane razem. Jeszcze gorszy dla świnki, która jest często dominowana i uciskana przez większego królika. Oczywiście \"rozumieją się\" czasami, ale jest to bardziej tolerancja niż przyjaźń. Oczywiście liżą się i leżą obok siebie, ale daj królikowi drugiego królika i świnkę do zagrody. Jak myślisz wybierze świnkę na swojego przyjaciela? Eksperyment pokazał: trzymana  grupa królików i grupa świnek w jednej zagrodzie, (żadne zwierze się wcześniej nie znało) podzieli się na dwie grupy, zgodnie ze swoim gatunkiem.</br>" + 
					"</br>" + 
					"4. Nie mam miejsca na drugiego królika.</br>" + 
					"</br>" + 
					"Tu jest inny temat poruszony, który przysparza być może tyle samo cierpienia królikowi co samotność. Wielkość klatki. Tak na prawdę to każdy kto kupuje królika chce dla niego jak najlepiej, dlatego kupuje dla niego \"dużą klatkę\" w sklepie zoologicznym. Niestety w sklepach nie ma dużych klatek. Wyliczono, że królik , który jest hodowany zgodnie z jego naturalnymi wymaganiami potrzebuje przynajmniej (!!!) 2 m2 dla siebie. Na podłodze byłoby to 2m x 1m. Uzasadnienie tego jest logiczne: Królik musi kicać, (to znaczy zrobić więcej niż trzy skoki) musi móc się wyciągnąć i przeciągnąć. Dwugodzinny wybieg nic nie daje jeśli przez 22 godziny królik siedzi w klatce 1,20 m na 0,6 m. Także króliczy dzień składa się z 24 godzin. Jeśli ktoś nie ma wystarczająco miejsca może zbudować kilku-poziomowa zagrodę. Dla dwóch królików powinno być zapewnione odpowiednio więcej miejsca.</br>" + 
					"</br>" + 
					"5. Dwa króliki to dwa razy więcej pracy i dwa razy większe koszty.</br>" + 
					"</br>" + 
					"Drugi królik przysparza nam tylko minimalnie więcej pracy niż jeden. Przede wszystkim potrzebujemy więcej ściółki, jedzenia i miejsca. Za to nie musimy poświęcać królikowi tyle czasu bo ma już towarzystwo. Króliki mogą być bardzo drogie. Są choroby, które wymagają długiego leczenia, a co za tym idzie dużych kosztów, ale to trzeba wziąć pod uwagę przy kupnie pierwszego królika. Wiele chorób i zaburzeń w zachowaniu królika jest rezultatem  pojedynczego chowu. Drugi królik kosztuje może trochę więcej pieniędzy, ale jest to inwestycja w szczęście pierwszego uszaka, która się zwraca: Ty zapobiegasz zaburzeniom u swojego królika i pomagasz innemu (jeśli wziąłeś go np. ze schroniska) i masz dwa zwierzaki do kochania i obserwowania (co jest po prostu cudowne).</br>" + 
					"</br>" + 
					"6. Chce żeby mój królik był oswojony.</br>" + 
					"</br>" + 
					"Powszechna obawa jest, że przez towarzysza królik nie będzie taki przymilny. Z naszych doświadczeń wynika, że przez nowego partnera skraca się tylko czas, który królik spędzał sam. On ma kogoś do zabawy i jeśli wchodzimy do domu przybiegnie się przywitać nie tylko nasz jeden, ale obydwa naraz (trzy, cztery, pięć... :) ). U bojaźliwych królików partner sprawia, że są one odważniejsze, nadpobudliwe, staja się często spokojniejsze. Naturalnie nie jest się już tą najważniejszą osobą dla swojego królika, ale czy nie byłoby egoizmem oczekiwać tego od niego?</br>" + 
					"</br>" + 
					"7. Mój królik jest za stary, żeby go przyzwyczajać do innego.</br>" + 
					"</br>" + 
					"To jest w większości przypadków przekonanie opiekuna, a nie rzeczywistość. Prawdopodobnie wzięło się ono stąd, że królik np. podczas opieki nad innym królikiem, (w czasie wyjazdu właściciela) został na krótko wypuszczony na wybieg z przyjezdnym królikiem i doszło do przeganiania i pogryzień. Podczas takiego \"zapoznawania\" nie są przestrzegane żadne reguły dotyczące zaprzyjaźniania królików dlatego walki są normalne i wystąpiłyby u każdego królika. Opłaca się spróbować \"porządnie\", z dużą prawdopodobnością się powiedzie.</br>" + 
					"</br>" + 
					"</br>" + 
					"Kto mimo wszystko się obawia, że na końcu zostanie z dwoma nielubiącymi się królikami może skorzystać ze schronisk, które chętnie dają króliki na próbę i w razie czego gdyby się nie zaprzyjaźniły można je z powrotem oddać. Ale jeszcze raz: jeśli przestrzega się wszystkich reguł zaprzyjaźniania, ma się cierpliwość, zwierzęta są przeciwnej płci i zapoznawane na neutralnym gruncie, musi się powieść !</br>" + 
					"</br>" + 
					"Podsumowując:</br>" + 
					"Są przekonywujące argumenty za pojedynczym trzymaniem królika ?</br>" + 
					"My nie znamy żadnego.</br>" + 
					"Trzymanie królika samego jest jak więzienna izolacja człowieka!!!</br>" + 
					"Tekst napisany przez niemiecki odpowiednik Stowarzyszenia Pomocy Królikom (Kaninchenschutz). "));
			
			firstBunnyService.create(new FirstBunny("Porzucanie zwierząt", "Czas wakacyjno-urlopowy jest szczególny, nie tylko dla człowieka, ale również dla zwierząt, które w tym okresie zdecydowanie częściej są porzucane. W Polsce szacuje się, że od 12-15% zwiększa się porzucanie zwierząt właśnie w tym okresie. Nie dotyczy to tylko psów i kotów, (choć są w zdecydowanej większości) ale również są to króliki i inne. Z badań przeprowadzonych przez CBOS wynika że w ponad 54% polskich domów żyje jedno lub więcej zwierząt udomowionych. W roku 2003 zdecydowana większość badanych tj. około 72% deklarowało, że w czasie wyjazdów oddają zwierzęta pod opiekę kogoś z rodziny lub przyjaciół. Żaden z badanych nie przyznał się również co do porzucania zwierząt, ani do oddawania ich na czas urlopu do przechowalni. W roku ubiegłym tj. 2008 można zauważyć zdecydowany wzrost osób, które korzystają z hoteli dla zwierząt, jak dotąd nikt nie przeprowadził badań na temat tego wzrostu, ale po wypowiedziach samych właścicieli takich hoteli można wywnioskować, że tego typu działalność jest coraz bardziej potrzebna, szczególnie w czasie wakacji, jak również weekendów.</br>" + 
					"</br>" + 
					"W badaniach opinii publicznej na temat posiadania zwierząt, również znajdujemy, że zdecydowanie częściej trzymamy zwierzęta w gospodarstwach domowych, w których są dzieci do lat 18. Niektórzy uważają, że właśnie jednym z czynników porzucania zwierząt, jest nieodpowiedzialność dziecka wraz z jego rodzicami, tzn. gdy dziecku dane zwierze się znudzi, a rodzic nie ma czasu na opiekę nad nim, po prostu pozbywają się zwierzęcia w najmniej dla nich kłopotliwy sposób, czyli porzucenie w lesie, przywiązanie do płotu, lub wywiezienie w nieznane miejsce dla danego zwierzęcia, ewentualnie oddanie do schroniska. Takie sytuacje nasilają się szczególnie w czasie wakacji, gdy nie możemy zabrać ze sobą zwierząt, lub po prostu nie chcemy tego robić.</br>" + 
					"</br>" + 
					"Właściciele oddają zwierzęta do schronisk podają różne powody takiej decyzji m.in.:</br>" + 
					" - alergia dziecka,</br>" + 
					" - brak czasu na opiekę,</br>" + 
					" - mniejsze mieszkanie,</br>" + 
					" - gorsza sytuacja finansowa</br>" + 
					" - agresja,</br>" + 
					" - niszczenie mieszkanie (tyczy się nieznajomości natury, co jest napisane poniżej),</br>" + 
					" - ciągłe szczekanie.</br>" + 
					"</br>" + 
					"Około 30-35% zwierzaków jest oddawana osobiście przez właścicieli, którzy do tego się przyznają, ale osoby pracujące w schroniskach z racji doświadczenia uważają, że znacznie więcej zwierząt jest oddawanych przez właścicieli, którzy wstydzą się do tego przyznać.</br>" + 
					"W rzeczywistości powody porzucania zwierząt są bardziej złożone niż może się nam wydawać. Należy nadmienić że porzucanie zwierząt, jest prawnie uznane za znęcanie się (ustawa o ochronie zwierząt art. 6 ust.2 punkt 11.), czyli przestępstwem.</br>" + 
					"Najczęstsza przyczyna porzucania zwierząt jest pochopną decyzją i nieznajomość natury zwierzaka na jakiego się decydujemy.</br>" + 
					"Kolejnym z czynników, który powoduje wzrost liczebności porzuconych zwierząt są nielegalne hodowle, tyczy się to hodowli nie tylko psów, ale również kotów, królików, jak i innych mniej</br>" + 
					"lub bardziej popularnych zwierząt. Nielegalne hodowle są tylko i wyłącznie nastawione na finansowy zysk, co oznacza, że zupełnie nie zależy im na zwierzętach, jak również na ich jakości życia. Zwierzęta chore, niezdolne do reprodukcji, lub niesprzedające się są porzucane, oddawane do schronisk, lub uśmiercane.</br>" + 
					"Od dawna toczą się spory, czy zwykły klient, kupujący zwierzęta z takich hodowli nie wspomaga</br>" + 
					"tego biznesu. Oczywiście nie mówimy tutaj tylko o bezpośrednim kupowaniu zwierząt od właścicieli, ale również w sklepach zoologicznych, które \"zaopatrują się w towar\" właśnie w takich nielegalnych hodowlach, lub po prostu na targach. Wielu powie że wykupują zwierzęta ze sklepów, hodowli, targów aby poprawić im jakość życia, ale tak naprawdę nakręcają ten niehumanitarny biznes. Właściwszym wyjściem jest organizacja interwencji upoważnionych do tego celu organów.</br>" + 
					"</br>" + 
					"Kolejnym z powodów porzucania zwierząt, jest obecnie panująca moda, której w szczególnej mierze poddają się dzieci i nastolatki. Moda na daną rasę lub gatunek przemija, wraz z nią fascynacja, jak również ochota do opieki nad zwierzakiem, wtedy właśnie są podejmowane drastyczne kroki, które prowadzą właściciela do \"wyrzucenia\" zwierzęcia, bądź to w lesie, bądź do schroniska.</br>" + 
					"</br>" + 
					"Niekontrolowane rozmnażanie, jest kolejną przyczyną, która powoduje wzrost zwierząt które trafiają do schronisk. Każdy lubi małe, urocze stworzonka, ale gdy dorastają pojawia się problem co z nimi zrobić, najczęściej właśnie trafiają do schronisk. Kiedyś również popularna praktyką, szczególnie na wsiach było topienie małych zwierząt w rzekach i stawach.</br>" + 
					"</br>" + 
					"Do schronisk, również trafiają zwierzęta, które same uciekły od właścicieli. Przyczyny ucieczek są bardzo różne, od złego traktowania zwierzęcia, do zwykłej ucieczki, która jest spowodowana instynktem (chęć wolności), lub popędami.</br>" + 
					"</br>" + 
					"Zanim zdecydujemy się na zwierzę, nie bierzmy pod uwagę tylko jego wyglądu, ale jeszcze przed zakupem zapoznajmy się z naturą zwierzaka i wymaganiami. Pamiętajmy również że króliki mogą dożyć do 13 lat, koty do 20, podobnie jak psy, nie wspominając o papugach, które potrafią żyć tyle samo co człowiek. Powinniśmy sobie uświadamiać fakt, że przez taki okres mamy zajmować się danym zwierzęciem, które bardzo się do nas przywiązuje i każde rozstanie jest dla niego bardzo nieprzyjemnym przeżyciem.</br>" + 
					"</br>" + 
					"Zwierzęta pozostawione w domu przez dłuższy czas bez opieki, potrafią narobić szkód z nudów, dlatego aby uniknąć problemów i rozczarowań zapewnijmy im w czasie naszej nieobecności zabawki, tak aby pupilowi uprzyjemnić rozstania z nami, a nam pozwoli to zminimalizować ewentualne szkody. "));
			
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
			
			diseaseService.create(new Disease(1L, "Osteoporoza", "Jest to mało znana choroba u królików. Polega na postępującym ubytku masy kostnej w wyniku czego częste są złamania i problemy z zębami.</br>" + 
					" </br>" + 
					"Przyczyny:</br>" + 
					"- zbyt mało ruchu</br>" + 
					"- zaburzenia wchłaniania wapnia</br>" + 
					"- dieta wysokobiałkowa</br>" + 
					"</br>" + 
					"Jak zapobiegać:</br>" + 
					"Siano i trawa zawierają wystarczającą ilość wapnia. W sianie znajduje się też witamina D, powinno być zawsze dostępne dla królika. Pozwólmy w ciepłe dni królikowi na wylegiwanie się w słoneczku na zabezpieczonym balkonie. Uwaga! Nie wolno stawiać klatki na słońcu, uszak musi mieć wybór gdzie chce przebywać. Królik powinien mieć możliwość codziennego wybiegania się, im więcej tym lepiej."));
		
			diseaseService.create(new Disease(1L, "Złamanie", "Może się zdarzyć, że nasz ukochany uszak podczas swoich dzikich skoków uderzy się mocno o twardy przedmiot, podwinie mu się łapka lub kończyna utkwi w paśniku i szarpiąc się, królik ję sobie złamie.</br>" + 
					" </br>" + 
					"Symptomy:</br>" + 
					"Królik nie biega tak jak zwykle, prawie się nie rusza, a jeśli już to kuleje, tylna łapka ucieka na bok, królik nie obciąża skoku, trzyma łapkę w powietrzu.</br>" + 
					"</br>" + 
					"Diagnoza:</br>" + 
					"Należy wykonać zdjęcie RTG, na jego podstawie lekarz zadecyduje o dalszym leczeniu. Królicze kości łamią się inaczej niż ludzkie powstaje wiele odłamków, które maja bardzo ostre krawędzie. Źle ustabilizowana kość może przebić się na zewnątrz i doprowadzić do martwicy lub gangreny.</br>" + 
					"</br>" + 
					"W mało skomplikowanych przypadkach wystarczy unieruchomić kończynę na kilka tygodni, uszak musi dostać środki przeciwbólowe np. metacam. Zazwyczaj jednak musi być wykonana operacja i drutowanie tzw. drutami Kirschera lub gwoździowanie metoda Steinmanna. Gwoździe usuwa się po około 6 tyg. jeśli nie ma przeciwwskazań gwóźdź może pozostać w kości.</br>" + 
					"</br>" + 
					"W najgorszym wypadku trzeba przeprowadzić amputacje. Króliki szybko przyzwyczajają się do skakania na trzech łapkach i po okresie rekonwalescencji są tak samo ruchliwe i radosne jak ich koledzy z czterema sprawnymi kończynami.</br>" + 
					"</br>" + 
					"Królik po operacji powinien mieć ograniczona powierzchnie do poruszania się, bez możliwości wskakiwania na przedmioty. Podłoga powinny być miękka, nieślizgająca się. Dobrze sprawdzają się podkłady higieniczne dla niemowląt, pozwalają utrzymać higienę i zapobiegają odparzeniom i zanieczyszczeniu rany. Przez okres 10 dni (o ile lekarz nie zaleci inaczej) królik powinien otrzymywać antybiotyk i środki przeciwbólowe. Środki przeciwbólowe są bardzo ważne, kończyna musi być w małym stopniu używana, aby nie dopuścić do całkowitego zaniku mięśni.</br>" + 
					" </br>" + 
					"Jeśli uszak nie ma apetytu powinno się go dokarmiać np. warzywnymi słoiczkami dla niemowląt lub rozmoczonym granulatem, więcej w temacie \"dokarmianie\".</br>" + 
					"</br>" + 
					"Wszystkim wypadkom nie da się zapobiec, ale chciałabym Wam zwrócić uwagę na kilka rzeczy np.:</br>" + 
					"- paśnik to prawdziwa pułapka dla królików, uszaki chętnie na niego wskakują, łapka wpada pomiędzy kratki, królik w panice szarpnie łapkę i nieszczęście gotowe.</br>" + 
					"Znam kilka takich przypadków.</br>" + 
					"Umocujcie paśnik albo na zewnątrz klatki, albo tak żeby uszak nie mógł na niego wskoczyć lub zastąpcie go np. koszykiem wiklinowym.</br>" + 
					"- drzwiczki klatki, które otwierają się do dołu, spróbujcie przepleść tekturę pomiędzy szczebelki lub przełóżcie drzwiczki tak żeby otwierały się na bok lub do góry.</br>" + 
					"- balkon, musi być dobrze zabezpieczony, bez niebezpiecznych szpar, świetne są siatki, które opiekunowie kotów montują dla bezpieczeństwa na swoich balkonach.</br>" + 
					"- wysokie meble, nie da się ich całkowicie zabezpieczyć, uszaki lubią wskakiwać na rożne wysokie przedmioty, problem później jest zejściem, miejcie oczy dookoła głowy,świetne są plotki/zagródki, którymi można odgrodzić zakazany mebel lub zamknąć w niej królika podczas naszej nieobecności.</br>" + 
					""));
			
			diseaseService.create(new Disease(1L, "Uraz kręgosłupa", "Należą do dosyć częstych urazów, powstają np. gdy królik wyrwie nam się z rąk i upadnie na podłogę, zeskoczy ze stołu w gabinecie lekarskim, zostanie zaatakowany przez kota lub drapieżnego ptaka.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"Królik może mieć trudności z poruszaniem się, kuleje lub ciągnie łapę za sobą. Jeśli doszło do uszkodzenia rdzenia kręgowego może nastąpić częściowy lub całkowity paraliż, oraz problemy z wydalaniem moczu i kału. Dokładną diagnozę stawia lekarz po badaniu neurologicznym i na podstawie zdjęć RTG. Leczenie zależy od stopnia uszkodzenia kręgosłupa. Pomóc mogą masaże, akupunktura i ćwiczenia wg zaleceń weterynarza. Dużym problemem jest utrzymanie higieny uszaka. Królik załatwia się pod siebie, mocz podrażnia skórę na brzuszku i w okolicach płciowych, powstają odparzenia i stany zapalne. Dodatkowe zagrożenie w ciepłe dni stanowią muchy, można się przed nimi bronić zakładając siatki w oknie. Ściółkę trzeba zmieniać bardzo często, królika myć i smarować maściami zaleconymi przez lekarza. Dobrze sprawdzają się pampersy i maty dla niemowląt, szybko wchłaniają mocz. Pamiętajmy o regularnym dopijaniu i dokarmianiu uszaka."));
			
			diseaseService.create(new Disease(2L, "Jaskra", "Jaskra jest poważną i bolesną chorobą, która prowadzi do nieodwracalnego uszkodzenia nerwu wzrokowego. Najczęściej spowodowana jest wysokim ciśnieniem wewnątrz gałki ocznej. Prawidłowe ciśnienie powinno być w granicach 15-25 mmHG. Jaskra może być też pierwszym objawem E.cuniculi.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- czasami można zauważyć zielony refleks w oku,</br>" + 
					"- zaczerwienione i bolesne oko,</br>" + 
					"- biała mgiełka,</br>" + 
					"- wytrzeszcz oka.</br>" + 
					"Lekarz zmierzy ciśnienie oka, przepisze krople na obniżenie ciśnienia, środek przeciwbólowy i ewentualnie antybiotyk. Jaskrę leczy się też operacyjnie. Jeśli królik stracił wzrok trzeba wspólnie z lekarzem rozważyć usuniecie oka, sprawia ono królikowi dotkliwy ból, a podawanie do końca życia środka przeciwbólowego nie rozwiąże sprawy.</br>" + 
					"</br>" + 
					"Wspomagające leczenie zioła: szałwia i czarna jagoda."));
			
			diseaseService.create(new Disease(2L, "Zaćma (katarakta)", "Jest to choroba oczu prowadząca do zmętnienia soczewki i w końcowym etapie do ślepoty. Zaćma może być wrodzona i nabyta. Nabyta powstaje w wyniku przebytych chorób (jaskry, cukrzycy e.cuniculi), jako efekt uboczny niektórych leków np. sterydów, w wyniku zatrucia, błędów w żywieniu, uszkodzeniu oka.</br>" + 
					"</br>" + 
					"Objawem jest:</br>" + 
					"-  szaro/biała mgiełka na oku.</br>" + 
					"Weterynarz powinien dokładnie przebadać uszaka, także powinien zbadać mocz i krew, żeby wykluczyć cukrzyce, e.cuniculi lub inna chorobę, która mogła spowodować zmętnienie oka. Czasami wskazana jest operacja. Podczas operacji usuwa się zmienioną soczewkę i wstawia sztuczna."));
			
			diseaseService.create(new Disease(2L, "Królik niewidomy", "Może być tak samo szczęśliwy jak królik widzący. I inne zmysły wyostrzają się i zastępują uszakowi oczy. Początkowo królik będzie trochę zagubiony i może tracić orientacje, ale szybko przyzwyczai się do nowej sytuacji. Będzie uważnie nasłuchiwał i używał swoich wibrysów. Pocierając brodą przedmioty nie tylko je znaczy, ale też zapamiętuje gdzie co stoi. Dlatego nie zmieniaj nic w pokoju, nie przestawiaj doniczek, ani mebli, zabezpiecz schody i ostre kanty mebli, a jedzenie i miseczkę z woda kładź zawsze w tym samym miejscu. Wkrótce uszak będzie przemierzał pewnie pokój, odnajdywał swoją klatkę i wskakiwał na łóżko oczekując pieszczot."));
			
			diseaseService.create(new Disease(2L, "Usunięcie oka", "Wiadomość, że konieczna jest operacja oka ścina z nóg. Nie jest łatwo podjąć taka decyzję, ale w wielu przypadkach uratuje ona życie królikowi i pozbawi go na zawsze bólu. Królik szybko wraca do zdrowia i przyzwyczaja się do braku oka, ucho po operowanej stronie stoi prawie zawsze na baczność i wychwytuje każdy dźwięk, włosy czuciowe pomagają w orientacji.</br>" + 
					"</br>" + 
					"Główne przyczyny amputacji:</br>" + 
					"- mocno przerośnięte korzenie zębów, ropa w oczodole,</br>" + 
					"- guz za gałka oczną</br>" + 
					"- jaskra</br>" + 
					"- uszkodzenie oka</br>" + 
					"</br>" + 
					"Powinniśmy dostać uszaka już wybudzonego, królik musi brać antybiotyk i środek przeciwbólowy, większość królików nosi kołnierz (zależy od lecznicy)\\ zapobiega rozdrapaniu rany. Uszak powinien jak najszybciej zacząć jeść żeby pobudzić układ pokarmowy do pracy. Większość królików nie ma po narkozie apetytu, dlatego powinniśmy zwierzaczka dokarmiać. Królik w kołnierzu będzie miał problemy z myciem, trzeba mu w tym pomoc, często kontrolować sierść i przemywać ubrudzone miejsca przegotowana woda. Po około 10 dniach zostanie zdjęty szef i kołnierz a po dwóch miesiącach rana będzie ładnie porośnięta sierścią."));
			
			diseaseService.create(new Disease(2L, "Uszkodzenie oka", "Moje króle dwukrotnie miały uszkodzone oko, winowajcami były koty. Szczęście w nieszczęściu, zadrapania nie były poważne (o ile można tak powiedzieć) i szybko się zagoiły.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- zaczerwieniona lub spuchnięta powieka</br>" + 
					"- mrużenie oka</br>" + 
					"- mokra sklejona sierść pod okiem</br>" + 
					"- ropa w kąciku</br>" + 
					"</br>" + 
					"Królika musimy jak najszybciej pokazać lekarzowi. Lekarz zbada dokładnie oko, wpuści specjalne krople, które zabarwią ewentualne skaleczenie na seledynowy kolor. Powinien też zajrzeć do pyszczka i sprawdzić zęby bo one też mogą być przyczyną spuchniętego i zaropiałego oka. Jeśli w oku znajduje się ciało obce weterynarz usunie je pęsetą lub przepłukując oko roztworem soli fizjologicznej. W zależności od stopnia skaleczenia, królik może dostać maść lub krople o działaniu przeciwzapalnym, antybiotyk i (lub) maść na odbudowę rogówki.</br>" + 
					"</br>" + 
					"Wydzielina, która brudzi futerko i skleja oko jest dosyć agresywna, może doprowadzić do odparzeń i wypadania sierści dlatego trzeba ją regularnie usuwać za pomocą wacika namoczonego w wodzie, czarnej herbacie, świetlika lub roztworze soli fizjologicznej. Nie używamy do tego celu rumianku działa rozmiękczająco na rogówkę oka, podrażnia chore oko, rumianek bardziej może zaszkodzić niż pomoc."));
			
			diseaseService.create(new Disease(2L, "Zatkany kanalik łzowy", "Łzy rozprowadzane są przez ruchy powiek, chronią oko przed uszkodzeniem, infekcjami i wysychaniem. Łzy spływają do punktu łzowego, który jest połączony kanalikiem łzowym z woreczkiem łzowym, a ten z jama nosową.</br>" + 
					"</br>" + 
					"Objawy zatkania woreczka:</br>" + 
					"- Zaczerwieniona i bolesna powieka</br>" + 
					"- ropa w kąciku oka</br>" + 
					"- ropny katar</br>" + 
					"- sklejone futerko pod okiem</br>" + 
					"</br>" + 
					"Zatkanie może być spowodowane zakażeniem bakteryjnym, najczęściej jednak powodem są przerośnięte korzenie zębów. Korzenie uciskają na przewód nosowo-łzowy utrudniając przepływ łez. Lekarz może udrożnić kanalik wykonując pod narkozą płukanie przewodu nosowo-łzowego roztworem fizjologicznym. Konieczne może być podanie antybiotyku. Jeśli to przerośnięte korzenie zębów są powodem zatkania woreczka prawdopodobnie trzeba będzie niektóre zęby usunąć."));
			
			diseaseService.create(new Disease(2L, "Zapalenie spojówki", "Może być spowodowane przeciągiem, podrażnieniem oka trocinami, zakurzonym sianem, alergią lub bakteriami - najczęściej : Staphylococcus aureus, Streptococcus,  Pseudomonas lub Pasteurella.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- Czerwona, spuchnięta powieka</br>" + 
					"- posklejana ropą powieka</br>" + 
					"- łzawienie</br>" + 
					" </br>" + 
					"Może być chore tylko jedno oko. Jak najszybciej trzeba iść z uszakiem do weterynarza. Lekarz obejrzy dokładnie oko, czy nie jest skaleczone, nie ma ciała obcego, czy zęby nie są przerośnięte. Przepisze antybiotyk. Sklejone oko przemywamy czystą przegotowaną wodą, czarną herbatą lub świetlikiem, nigdy rumiankiem, może on doprowadzić do poważnych komplikacji. Antybiotyk należy podawać/wkraplać tyle dni ile zaleci lekarz, nie krócej, inaczej infekcja może nawracać, a bakterie rozwiną odporność na dany antybiotyk. Jeśli królik do tej pory miał w klatce trociny warto je zamienić na granulat drzewny i wsypać do kuwety, a na resztę podłogi w klatce położyć dywanik, kocyk, bądź gazetę."));
			
			diseaseService.create(new Disease(3L, "Zapalenie uszu", "Chore ucho zewnętrzne, objawy:</br>" + 
					"- drapanie uszu</br>" + 
					"- potrząsanie głową</br>" + 
					"- przekrzywiona głowa</br>" + 
					"</br>" + 
					"Najczęściej zapalenie wywołane jest przez pasożyty, grzyby, bakterie lub ciało obce.</br>" + 
					"</br>" + 
					"Zapalenie ucha środkowego, objawy:</br>" + 
					"- potrząsanie głowa, trzepotanie uszami</br>" + 
					"- przekrzywiona głowa</br>" + 
					"- ból ucha</br>" + 
					"- brak apetytu,</br>" + 
					"- wybieranie miękkiego pokarmu</br>" + 
					"- osowiałość</br>" + 
					"</br>" + 
					"Konieczne jest podanie antybiotyku. Jeśli doszło do pęknięcia błony bębenkowej lekarz może wykonać przepłukanie ucha roztworem soli fizjologicznej.</br>" + 
					"</br>" + 
					"Zapalenie ucha wewnętrznego objawy:</br>" + 
					"- przekrzywiona głowa,</br>" + 
					"- problemy z utrzymaniem równowagi</br>" + 
					"- oczopląs</br>" + 
					"- brak apetytu</br>" + 
					"</br>" + 
					"Uwaga: te objawy mogą też  wskazywać na E.cuniculi, te dwie choroby są często ze sobą mylone. </br>" + 
					"</br>" + 
					"Zapalenie ucha wewnętrznego zwykle jest powikłaniem po zapalenia ucha środkowego. Leczenie jest długotrwałe, trwa od 2 do 6 tygodni. Podczas leczenia stosuje się antybiotyki najczęściej penicylinę lub chloramfenikol. Przed podaniem antybiotyków powinno się zrobić posiew aby ustalić na jaki antybiotyk dana bakteria najlepiej zareaguje. Jeśli królik nie ma apetytu należy go dokarmiać i dopajać."));
			
			diseaseService.create(new Disease(3L, "Świerzb uszny", "Jest to dosyć częsta choroba pasożytnicza, wywołana przez roztocze najczęściej z rodzaju Psoroptes cuniculi, rzadziej Chorioptes cuniculi (żywi się łupieżem). Roztocze zagnieżdża się w uchu i żywi się wydzielina, płynem tkankowym i krwią. Pojedynczy osobnik żyje przeciętnie 40 dni, samica składa około 100 jaj, już po 9-11 dniach następne pokolenie jest gotowe do rozrodu.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"Łupież i egzema, potrząsanie uszami, silny świąd, przekrzywiona głowa, zabrudzone brązowo-czarną wydzieliną ucho w środku. Przy silnym zakażeniu objęte może być ucho po zewnętrznej stronie, głowa, szyja i barki. Uszak może mieć także zapalenie ucha wewnętrznego. Żeby dokładnie określić pasożyta lekarz powinien pobrać zeskrobinę i obejrzeć ją pod mikroskopem. Najczęściej stosuje się Ivermektyne w zastrzykach lub płyn do smarowania uszu Biodylon. Świerzb w temp. 22-25°C potrafi przeżyć w ściółce około 10 dni, dlatego bardzo ważna jest wymiana siana, żwirku, dokładne umycie klatki najlepiej gorącą wodą z octem, musimy umyć też wszystkie miseczki i zabawki. Tą chorobą mogą się zarazić inne zwierzęta domowe np. pies, kot, świnka, koszatniczka itd., rzadko człowiek."));
			
			diseaseService.create(new Disease(3L, "Królik niesłyszący", "W naturze nie miałby większych szans na przeżycie. Nie usłyszałby krzyku jastrzębia, kroków skradającego się lisa czy ostrzegającego tupania swojego kolegi. W mieszkaniu królik jest bezpieczny, to my czuwamy nad jego bezpieczeństwem, także napotkanie drapieżnego zwierzęcia jest prawie niemożliwe.</br>" + 
					"</br>" + 
					"Jak sprawdzić czy królik nie słyszy? Wystarczy klasnąć w ręce, zagrzechotać granulatem, gwizdnąć - czy zareagował, zastrzygł uszami, odwrócił się?</br>" + 
					"</br>" + 
					"Królik niesłyszący jest takim samym królikiem jak słyszący, brak słuchu nie upośledza go, czuje drgania podłogi kiedy podchodzimy, widzi nas i czuje zapach. Jest o wiele bardziej zrelaksowany, niepokojące odgłosy nie robią na nim żadnego wrażenia. Można futrzaka nauczyć żeby przychodził na dany znak np. wyciągnięcie ręki. Przy pomocy smakołyku można prawie wszystko osiągnąć, a radość z nauki jest wielka i dla królika bo poświęcamy mu czas i dla nas, bo szybko widać efekty nauki.</br>" + 
					"</br>" + 
					"Pamiętajmy, żeby nie zachodzić królika od tylu, najpierw tupnijmy kilka razy lub stawiajmy silniejsze kroki żeby zwrócić uwagę królika, poczuje drgania podłogi. Jeśli nagle podejdziemy od tylu królik może wpaść w panikę. Dla niesłyszącego uszaka bardzo ważny jest partner, obserwując go królik pewniej się czuje, może w pełni zdać się na swojego partnera. Króliki między sobą posługują się przeważnie mową ciała, jeśli uszy towarzysza są postawione to znak dla niesłyszącego królika, że trzeba uważać, coś jest nie tak, jeśli niesłyszący królik widzi biały spód ogonka swego partnera jest to znak \"w nogi niebezpieczeństwo\". Nie trzeba się obawiać, że królik może nie usłyszeć ostrzegawczego warknięcia kolegi, jednocześnie kolega pokazuje swoją postawą i układem uszu, że nie ma ochoty teraz na towarzystwo czy, że należy mu się pierwszeństwo. Partner to duża pomoc dla królika niesłyszącego, jest zawsze przy nim, wspiera go, pielęgnuje i słucha za dwóch :)"));
			
			diseaseService.create(new Disease(4L, "Piaseki kamienie w drogach moczowych", "Choroba ta występuje u królików niezależnie od rasy i wieku. Samce ze względu na budowę cewki moczowej chorują częściej niż samiczki. W zagęszczonym moczu tworzą się kryształy, z kryształków powstają kamienie, które mają rożny kształt i formę. Na te drobniejsze, ale występujące w dużej ilości mówi się potocznie piasek. Kamienie drażnią nerki i pęcherz, ocierają i kaleczą śluzówkę. Mogą utkwić w moczowodach lub w cewce moczowej.</br>" + 
					"</br>" + 
					"Przyczyny powstawania kamieni:</br>" + 
					"- zakażenie bakteryjne,</br>" + 
					"- choroba nerek utrudniająca wydalanie wapnia,</br>" + 
					"- polipy lub torbiele w pęcherzu,</br>" + 
					"- tusza i problemy ze stawami zniechęcająca uszaka do wizyt w kuwecie,</br>" + 
					"- zmiana ph moczu (prawidłowe 7,6- 8,8),</br>" + 
					"- niewystarczająca ilość wypijanej wody np. przez zepsute poidełko,</br>" + 
					"- niechęć do poidełka, zabrudzona miseczka itd.</br>" + 
					"- niechęć do toalety np. zabrudzona, stoi w złym miejscu,</br>" + 
					"- dieta bogata w wapń,</br>" + 
					"- zbyt mało witaminy B w diecie królika.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"Zmniejszony apetyt lub brak apetytu, obojętność, uszak często chodził do toalety lub kuwety teraz siusia obok, ma trudności z oddawaniem moczu, mocz może być bardzo gesty i skleja sierść, czasami można zauważyć krew w moczu. Diagnozę stawia się na podstawie badań moczu, badań krwi, USG i RTG. Piasek można wypłukać roztworem soli fizjologicznej. Zabieg odbywa się pod narkoza, do dróg moczowych wprowadza się katete i kilkakrotnie przepłukuje. Duże kamienie usuwa się operacyjnie.</br>" + 
					"</br>" + 
					"Jak zapobiec nawrotom:</br>" + 
					"Przede wszystkim królik musi mięć dostęp do czystej wody, polecam miseczkę, króliki chętniej z niej korzystają niż z poidełek przy których muszą się trochę napracować. Suszone zioła i warzywa zastąpmy świeżymi, ograniczmy granulat, który zawiera więcej minerałów niż królik potrzebuje, lucernę. Polecane zioła to mniszek (cala roślina wraz z korzeniami), suszona pokrzywa, liście brzozowe (świeże i suszone), krwawnik i babka lancetowata, do picia oprócz wody rumianek.</br>" + 
					" </br>" + 
					"Uwaga:</br>" + 
					"Krew w moczu u samiczek może być związana z choroba dróg rodnych."));
			
			diseaseService.create(new Disease(4L, "Zapalenie nerek", "Może być powikłaniem zapalenia pęcherza. Występuje też razem z E.cuniculi, może być też wynikiem zatrucia.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"Utrata wagi, apatia, częste siusianie, leżenie w dziwnej pozycji, ból, brzydka matowa sierść, wzmożone pragnienie.</br>" + 
					" </br>" + 
					"Diagnoza:</br>" + 
					"Przede wszystkim należy zrobić badanie moczu, krwi, RTG lub USG. Leczenie stosuje się po ustaleniu przyczyny zapalenia nerek, jeśli jest ono spowodowane bakteriami, królik dostanie antybiotyk, jeśli np. pierwotniakiem E.cuniculi leczenie będzie przebiegać pod tym kątem.</br>" + 
					"</br>" + 
					"Co wspomaga leczenie:</br>" + 
					"Królik powinien dużo pić, dlatego pamiętajmy o świeżej wodzie o jak najmniejszej zawartości wapnia.</br>" + 
					"</br>" + 
					"Przyjazne zioła to: mniszek lekarski cała roślina, brzoza, suszona pokrzywa i herbatka z niej, melisa, bazylia, kolendra, pietruszka.</br>" + 
					""));
			
			diseaseService.create(new Disease(4L, "Zapalenie pęcherza", "Najczęściej spowodowane jest zakażeniem bakteryjnym, piaskiem lub kamieniami w pęcherzu.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- brak apetytu,</br>" + 
					"- mocne napinanie się przy sikaniu,</br>" + 
					"- cedzenie moczu,</br>" + 
					"- wielokrotne wskakiwanie i wyskakiwanie z kuwety,</br>" + 
					"- częste wizyty w kuwecie,</br>" + 
					"- sikanie po kropelce,</br>" + 
					"- długie przesiadywanie w kuwecie (co wcześniej nie było w zwyczaju królika)</br>" + 
					"- zmiana nawyków toaletowych- sikanie obok toalety lub w zupełnie innym miejscu,</br>" + 
					"- piaskowy (białawy, gęsty) mocz,</br>" + 
					"- zmniejszenie ilości moczu lub brak moczu,</br>" + 
					"- krew w moczu,</br>" + 
					"- brudne posklejane futerko w okolicach ogonka.</br>" + 
					"</br>" + 
					"Diagnozę stawia się na podstawie badań moczu, badań krwi, USG i RTG. O leczeniu zadecyduje lekarz, jeśli królik dostanie antybiotyk nie zapomnijmy o podaniu probiotyku np. Lakcid, jedna kapsułkę dziennie.</br>" + 
					"</br>" + 
					"Pamiętajmy, że królik musi mieć dostęp do czystej wody, polecam miseczkę, króliki chętniej z niej korzystają niż z poidełek przy których muszą się trochę napracować. Suszone zioła i warzywa zastąpmy świeżymi, ograniczmy granulat, który zawiera więcej minerałów niż królik potrzebuje i lucernę, lucerna wiąże wapń. Polecane zioła to mniszek (cała roślina wraz z korzeniami), suszona pokrzywa, liście brzozowe (świeże i suszone), krwawnik i babka lancetowata, do picia oprócz wody rumianek."));
			
			diseaseService.create(new Disease(5L, "Katar", "Kichanie nie musi być od razu spowodowane chorobą. Przyczyną częstego kichania mogą być trociny - bardzo pylą i drążnia układ oddechowy królika, zakurzone siano u mojej Lilly wywołuje serie kichnięć, przeciąg i alergie mogą być też powodem kichania. Dbanie o higienę klatki, zmiana trocin na mało pylący żwirek, przeniesienie klatki w zaciszne miejsce, częste wietrzenie pomieszczenia (bez przeciągów) może całkowicie wykluczyć kichanie.</br>" + 
					"</br>" + 
					"Jeśli nic nie pomaga, królik nadal kicha, ma mokry nosek należy udać się jak najszybciej do weterynarza. Wymaz z nosa pomoże ustalić bakterie i dobrać antybiotyk. Najgorszy nie jest sam katar, ale obniżona odporność, a tym samym podatność uszaka na inne choroby. Najlepszym zapobieganiem chorobie jest szczepionka, szczególnie jeśli królik ma styczność z innymi królikami. Króliczy katar jest bardzo zaraźliwy, króliki, które same nie wykazują żadnych objawów kataru mogą być nosicielami tej choroby. Króliczy katar wywoływany jest najczęściej przez bakterie Pasteurella multocida lub Bordetella bronchseptica. Z założenia powinna pomóc zwykła kuracja antybiotykowa, ale niestety tak się nie dzieje. Przyczyną tego jest umiejscowienie bakterii w zatokach przynosowych, lokalne antybiotyki nie są w stanie ich zwalczyć.</br>" + 
					"</br>" + 
					"Jeśli jednak usłyszymy diagnozę króliczy katar, lekarz przepisze nam antybiotyk. Będzie on stosowany 5-7 dni. Dawka jest zależna od wagi królika. Ważne żeby nie przerywać kuracji, grozi to uodpornieniem się bakterii na dany antybiotyk i nawrotem infekcji. Podczas kuracji należy podawać probiotyk np. Lakcid, jedna kapsułkę dziennie o ile lekarz nie zaleci inaczej. Antybiotyk wyjaławia florę bakteryjna jelit, zdrowe bakterie są zabijane, mogą pojawić się problemy z trawieniem dlatego bardzo ważne jest podawanie probiotyku. Bardzo dobre wyniki daje leczenie Interferonem, jest to lek stosowany głównie u ludzi, kotów i psów, mało znany w leczeniu królików."));
			
			diseaseService.create(new Disease(5L, "Przeziębienie", "Objawy:</br>" + 
					"Kichanie, częste mycie pyszczka, katar, brak apetytu, załzawione oczka. Konieczna jest szybka wizyta u weterynarza. Bakterie, które mogą wywołać przeziębienie to p. pneumotropica, Streptokoki, Sendai wirus, Pasteurella, Bordetella, Staphylokokki. Te bakterie mogą być w organizmie zdrowego królika nie wywołując choroby.</br>" + 
					"</br>" + 
					"Do zachorowania może dojść w wyniku:</br>" + 
					"- stresu,</br>" + 
					"- braku higieny w otoczeniu uszaka lub sterylnych warunkach gdzie królik nie ma szans rozwinąć odporności,</br>" + 
					"- w klatce z plastikowa góra, tworzy się sprzyjający mikroklimat dla wszelkiego rodzaju zarazków.</br>" + 
					"- przeciąg lub suche powietrze może być przyczyna choroby</br>" + 
					"- monotonne pożywienie nie dostarczające dostatecznej dawki witamin i minerałów,</br>" + 
					" </br>" + 
					"Królik może się też zarazić od swojego opiekuna jeśli ten jest przeziębiony bądź przechodzi właśnie anginę czy inna chorobę wywołaną przez streptokoki. Leczenie wg zaleceń lekarza.</br>" + 
					"</br>" + 
					"Jak możemy dopomóc:</br>" + 
					"Dobrze zrobią futrzakowi inhalacje z rumianku lub majeranku z dodatkiem np. soli morskiej.</br>" + 
					"</br>" + 
					"Inhalacja z tymianku:</br>" + 
					"Łyżeczkę tymianku i łyżeczkę rumianku wrzucić do zimnej wody, zagotować. Odstawić z ognia dodać pół łyżeczki sody (uwaga ucieka z garnka). Postawić obok klatki na około 10 min, klatkę i garnek przykryć kocem. Trzeba później dobrze wytrzeć uszaka ręcznikiem, bo para osiada też na sierści i uszak może się przeziębić lub będzie mu zimno. Nie polecam olejków do inhalacji, ponieważ mogą one podrażnić układ oddechowy królika, niektóre króliki mają też alergie na olejki eteryczne. Należy włączyć do diety królika zioła: bazylie, mięte, rumianek, koperek, tymianek - poprawiają trawienie, uspakajają, działają rozkurczowo i przeciwzapalnie. Lampka podczerwona ogrzeje uszaka, ale strumień światła powinien być tylko w jednej części klatki, żeby królik mógł wybrać czy chce leżeć w cieple czy nie. Można też termofor z ciepłą wodą  zapakować w ręcznik lub kocyk i włożyć do klatki. Jeśli uszak dostanie antybiotyk nie zapomnijmy o podawaniu probiotyku np. Lakcid, kapsułka dziennie."));
			
			diseaseService.create(new Disease(5L, "Zaktuszenie i zadławienie", "Objawy: </br>" + 
					"- wytrzeszcz oczu</br>" + 
					"- trudności ze złapaniem oddechu</br>" + 
					"- sztywność ciała</br>" + 
					"- nerwowe poruszanie się, bieganie</br>" + 
					"- odruch wymiotny</br>" + 
					"- śluz z nosa i z pyszczka (ślinienie)</br>" + 
					"- odruch przesadnego gryzienia/przeżuwania</br>" + 
					"</br>" + 
					"Od naszej reakcji i natychmiastowej pomocy zależy życie zwierzaka. Zachowajmy spokój, królik nie będzie się bronił bo wie, że chcemy mu pomóc. Należy ustawić się do królika tak, żeby jego głowa była przodem do nas. Chwytamy lewą ręka pod brzuszek, prawą sobie pomagamy i układamy królika głową do dołu, plecami przywiera do naszego brzucha. Rozciągamy przednie łapy królika - jeśli sam tego nie zrobił, to ważne, brzuszek musi być napięty i elastyczny jak trampolina. Teraz prawą ręka szukamy miejsca gdzie kończy się brzuch a zaczynają żeberka - taki trójkąt - splot słoneczny. Teraz naciskamy znalezione miejsce palcem wskazującym i środkowym od 1-3 razy, ale nie tylko do środka także trochę w kierunku głowy. Najczęściej zadławiony królik zaczyna przeżuwać, to znak, że jedzenie zostało wypchnięte i znajduje się teraz w pyszczku. Jeśli zwierzak normalnie oddycha, przeżuwa, najgorsze mamy za sobą. Musimy teraz zabrać królika do weterynarza, ponieważ istnieje niebezpieczeństwo zachłystowego zapalenia płuc, może ono skończyć się śmiercią uszaka. Jeśli ktoś ma krople Bacha - remedy rescue w domu może wetrzeć po dwie krople w uszy królika. Krople działają uspokajająco, królik przeżył okropny stres, paniczny strach. Najczęściej przyczyna zachłyśnięcia są małe twarde rzeczy np. granulat, suszone owoce i warzywa. Dobrze przećwiczyć jest taka pierwsza pomoc na pluszaku lub balonie, żeby w opisanej sytuacji wiedzcie już co trzeba zrobić, ponieważ liczy się każda sekunda."));
			
			diseaseService.create(new Disease(5L, "Zapalenie płuc", "Objawy:</br>" + 
					"Chudnięcie, brak apetytu, chrapliwy oddech, trudności z oddychaniem, katar, nieprzyjemny zapach z pyszczka, apatia. Konieczna jest wizyta u weterynarza, to bardzo poważna choroba i rokowania są ostrożne. Królik dostanie antybiotyk i prawdopodobnie lek na rozrzedzenie wydzieliny w płucach. Pamiętajmy o podaniu probiotyku np. Lakcid - jedna kapsułka dziennie, pomocny dla utrzymania</br>" + 
					"prawidłowego składu mikroflory jelitowej. Królik powinien być trzymany w cieple. Możemy do klatki włożyć ciepły zawinięty w koc termofor lub część klatki naświetlać lampa podczerwona. Pomocne w leczeniu są inhalacje.</br>" + 
					"</br>" + 
					"Na zimno:</br>" + 
					"Skropić ręcznik lub dywanik kropelkami dla niemowląt Babix i położyć w klatce królika.</br>" + 
					"</br>" + 
					"Na ciepło:</br>" + 
					"Łyżeczkę tymianku i łyżeczkę rumianku wrzucić do zimnej wody, zagotować. Odstawić z ognia dodać pół łyżeczki sody (uwaga ucieka z garnka). Postawić obok klatki na około 10 min, klatkę i garnek przykryć kocem.</br>" + 
					"</br>" + 
					"Inny przepis:</br>" + 
					"Do wrzątku dodać 2 łyżki soli iwonickiej i kilka kropel Inhalol, postawić obok klatki jw. Trzeba później dobrze wytrzeć uszaka ręcznikiem, bo para osiada też na sierści i uszak może się przeziębić lub będzie mu zimno. Jeśli królik nie ma apetytu i odmawia jedzenia należy go dokarmiać. Więcej na ten temat w poddziale \"Dokarmianie\"."));
			
			diseaseService.create(new Disease(6L, "Bezoary - kule włosowe", "Króliki są wielkimi czyściochami, tak jak koty i tak samo jak u kotów w żołądku mogą się zbierać połknięte włosy. W przeciwieństwie do mruczków króliki nie umieją zwymiotować nagromadzonej sierści. Kula włosowa składa się nie tylko ze sfilcowanych, zbitych włosów, ale także z resztek jedzenia. To wszystko blokuje i wypełnia żołądek.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- połączone włosami bobki (koraliki)</br>" + 
					"- nienaturalnie duże lub coraz mniejsze bobki</br>" + 
					"- brak apetytu</br>" + 
					"- apatia</br>" + 
					"</br>" + 
					"Potrzebna jest natychmiastowa pomoc lekarza. Na zdjęciu RTG będzie można dobrze zobaczyć bezoar. Jeśli kula jest duża pomoc może jedynie natychmiastowa operacja.</br>" + 
					"</br>" + 
					"Zapobieganie to przede wszystkim wysoko włóknista i bogata w błonnik dieta: siano, gałązki, zielenina.</br>" + 
					"- Codzienne wyczesywanie uszaka w okresie linienia.</br>" + 
					"- Dużo ruchu</br>" + 
					"- 2 razy w tygodniu pasta na odkłaczanie - 1 cm, niektóre króliki mają lekkie rozwolnienie po paście, jeśli się pojawi, proszę więcej nie podawać.</br>" + 
					"- zamiast pasty można dwa razy w tygodniu podać kiwi po pół owocu lub codziennie plasterek, lub świeży sok z ananasa, łyżkę dziennie. Resztę soku można zamrozić w pojemniczkach do lodu i później wykorzystać. Kiwi zawiera enzym aktynidyna, ananas bromeline, enzymy te rozkładają białko w przypadku włosa zmiękczają go co znacznie pomaga w wydaleniu.</br>" + 
					"</br>" + 
					"Królikom, które często się \"zatykają\" lub widać już połączone bobki można podać 1 krople oleju lnianego, słonecznikowego lub rzepakowego np. na kawałeczku cykorii lub na jabłku.</br>" + 
					"</br>" + 
					"Gdyby tak się stało, że jest podejrzenie zatkaniem kulą włosową, a w żaden sposób nie można dostać się do weterynarza - koniecznie proszę nawadniać zwierzaka. Może to być woda po rozgotowanym siemieniu lnianym, herbatka koperkowa, sok z ananasa. Królik musi pić. Co trzy -cztery godz. podajemy 1 ml oleju parafinowego, słonecznikowego, lnianego lub innego, aż do czasu skontaktowania się z lekarzem.</br>" + 
					""));
			
			diseaseService.create(new Disease(6L, "Nieżyt żołądka i jelit", "Powstaje w wyniku zaburzenia równowagi flory bakteryjnej w przewodzie pokarmowym królika. W układzie pokarmowym królika mieszkają bakterie, które są bardzo wrażliwe na jakiekolwiek zmiany np. przechodzenie z mleka mamy na pokarmy stale, z pokarmów zimowych na zieleninę, zmiana z mieszanki na granulat. Zaburzenia w równowadze bakterii mogą być też spowodowane podawaniem zbyt dużo skrobi w diecie, warzyw wzdymających, zaparzonej trawy, niedosuszonego siana, zimnego lub mokrego jedzenia itd.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- biegunka często ze śluzem i pasemkami krwi</br>" + 
					"- ból brzucha</br>" + 
					"- apatia i brak apetytu</br>" + 
					"- zaniedbana, nastroszona sierść</br>" + 
					"</br>" + 
					"Szczególnie dla maluchów ta choroba jest niebezpieczna, jeśli zauważymy któryś z powyższych objawów u kilku-tygodniowego maluszka, natychmiast trzeba go zabrać do weterynarza. Śmiertelność jest bardzo duża niestety, króliki są za wcześnie zabierane od mamy, ich układ pokarmowy nie jest jeszcze na tyle dojrzały żeby przeżyć bez mleka i cekotrofow  królicy, także szybkie zmiany w żywieniu i stres są przyczyna choroby .</br>" + 
					" </br>" + 
					"Starsze króliki chorują głównie przez nasze błędy w żywieniu. Pamiętajmy aby na wiosnę powoli przyzwyczajać królika do zieleniny, nie częstujmy uszaka ziemniakami i ciasteczkami, dokładnie sprawdzajmy czy siano nie jest spleśniałe, jeśli zmieniamy granulat róbmy to powoli, stopniowo mieszając stary pokarm z nowym. Chory królik powinien zostać pokazany lekarzowi. Dobrze jest zebrać bobki i dać do zbadania na obecność kokcydów lub innych pasożytów. Weterynarz zadecyduje o dalszym leczeniu.</br>" + 
					"</br>" + 
					"Wspomagająco można podać kleik z siemienia lnianego, herbatkę rumiankowa, nagietkowa lub miętowa. Jeśli królik odmawia jedzenia należy go dokarmiać (patrz. Dokarmianie.) Można podać uszakowi Lakcid, przywróci florę bakteryjna w przewodzie pokarmowym lub lek o nazwie Perenterol - zawiera drożdże, które wspomogą  przewód pokarmowy i nie dopuszczą do rozmnażania się szkodliwych bakterii. Kapsułkę należy dodać do wody pitnej. Suszone jagody pomogą zahamować biegunkę. Można również podać herbatkę z suszonych jagód, która jest do kupienia w aptece. Ona również pomoże w zahamowaniu biegunki."));
			
			diseaseService.create(new Disease(6L, "Rozwolnienie", "Może mieć rożne przyczyny. Jedną z nich jest nagła zmiana żywienia. Szczególnie młode króliki muszą być przyzwyczajane powoli do nowego pożywienia. Inne przyczyny to błędy żywieniowe, zatrucie np. spryskiwanymi owocami, zjedzonym plastikiem lub szkodliwą roślinnością, choroby zębów, pasożyty, wirusy, bakterie chorobotwórcze: E coli, Salmonella, Yersinia .</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- wodnista kupa o nieprzyjemnym zapachu,</br>" + 
					"- brudna, oblepiona pupa</br>" + 
					"- apatia</br>" + 
					"- brak apetytu</br>" + 
					"- chudniecie</br>" + 
					"</br>" + 
					"Należy jak najszybciej udać się do weterynarza. Proszę zebrać próbkę kału do zbadania na obecność pasożytów, drożdży i bakterii. Jeśli w próbce zostaną stwierdzone bakterie uszak otrzyma antybiotyk. Brudną pupę myjemy w ciepłej wodzie, można bardzo posklejane kłaczki obciąć nożyczkami. Do jedzenia sianko, suszone zioła, odrobinę trawy, kilka listków mniszka lekarskiego lub koperku . Do picia wodę, herbatkę koperkową, nagietkowa i rumiankową z dodatkiem glukozy (1/4 łyżeczki dziennie). Aby zachęcić uszaka do jedzenia można zetrzeć jabłko i zmieszać</br>" + 
					"z tarta marchewka. Taka dieta powinna trwać około 7 dni, o ile lekarz nie zaleci inaczej. Żeby odbudować florę bakteryjną podajemy królikowi Lakcid, kapsułkę dziennie lub Perenterol. Suszone czarne jagody pomogą zahamować biegunkę, podobnie jak herbatka z suszonych jagód. Pomocne są też gałązki wierzbowe i dębowe. Po każdym kontakcie z chorym zwierzątkiem myjemy dokładnie ręce."));
			
			diseaseService.create(new Disease(6L, "Wzdęcia", "Są spowodowane przeważnie przez:</br>" + 
					"- zjedzenie mokrego, zimnego lub zaparzonego pokarmu (zielenina, ciepła trawa),</br>" + 
					"- warzywami i roślinami wzdymającymi np. kapusta, por, koniczyna.</br>" + 
					"- w wyniku innych chorób np. przerostem zębów</br>" + 
					"- w wyniku zatrucia np. nieumytymi spryskanymi owocami</br>" + 
					"- nadwagą i brakiem ruchu</br>" + 
					"- bakteriami chorobotwórczymi np. e.koli lub pasożytami np. kokcydami</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- królik ma wzdęty, mocno napięty i bolesny brzuszek</br>" + 
					"- brak apetytu</br>" + 
					"- apatia</br>" + 
					"- brzydka, nastroszona sierść</br>" + 
					"Przy silnym wzdęciu mogą wystąpić trudności z oddychaniem, szybkie oddychanie, tupanie z bólu tylnymi skokami, wytrzeszcz oczu.</br>" + 
					"</br>" + 
					"Musimy natychmiast udać się z królikiem do weterynarza, wzdęcia są bardzo niebezpiecznie i w przeciągu kilku godzin mogą się skończyć śmiercią. Królik dostanie środek przeciwbólowy i rozluźniający, także coś na pozbycie się gazów np. Espumisan i prawdopodobnie kroplówkę, aby ustabilizować układ krążenia.</br>" + 
					"</br>" + 
					"Co możemy zrobić sami: </br>" + 
					"Zieleninę, warzywa i granulat należy usunąć z klatki, zostawiamy tylko siano i suszone zioła: mięta, koperek, melisa, rumianek i krwawnik. Zalecane herbatki to koperkowa, kminkowa i miętowa. Pomóc może delikatny masaż brzuszka, ale ma to być bardziej głaskanie niż naciskanie! Dopóki królik ma wzdęcia powinien jeść tylko siano i suszone zioła. Zniszczoną florę bakteryjną należy odbudować podając Lakcid - kapsułkę dziennie. Po zakończeniu choroby musimy ponownie przyzwyczaić królika do jedzenia zielonego i warzyw, robimy to stopniowo, dosłownie po listeczku</br>" + 
					"i obserwujemy reakcje układu pokarmowego. Jeśli nic się nie dzieje, codziennie zwiększamy ilość zieleniny.</br>" + 
					"</br>" + 
					"UWAGA!!! - jeśli wystąpi sytuacja iż chwilowo nie mamy możliwości kontaktu z weterynarzem możemy łagodzić sytuacje podając dwa razy dziennie pół kapsułki espumisanu. Bardzo łatwo i bez boleśnie można go podać wyciskając połowę żelu z kapsułki na liść mleczu czy innego suszu. Kicek na pewno da się skusić."));
			
			diseaseService.create(new Disease(6L, "Zaparcia", "Mogą być spowodowane połkniętymi włosami, przekarmianiem królika ciężkostrawnymi pokarmami np. chlebem, czy mieszankami o dużej zawartości zboża i cukru, zjedzeniem żwirku drewnianego czy suszonych warzyw, które w żołądku pęcznieją i wypełniają/przepełniają żołądek. Zakażenie drożdżakami, torbiele i wzdęcia mogą też być przyczyna zaparć.</br>" + 
					"</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- Królik ma trudności z oddawaniem bobków,</br>" + 
					"- bobki są bardzo małe lub są połączone ze sobą włosami,</br>" + 
					"- całkowity brak bobków</br>" + 
					"- apatia</br>" + 
					"- brak apetytu</br>" + 
					" </br>" + 
					"Królik powinien być jak najszybciej pokazany weterynarzowi. Zaparcie bez pomocy lekarza często kończy się śmiercią królika. Wskazane jest wykonanie zdjęcia RTG, aby wykryć przyczynę zaparcia. Leczenie wg zaleceń lekarza. W ciężkich przypadkach może być konieczna</br>" + 
					"natychmiastowa operacja. Królik powinien dużo pić, jeśli sam nie ma ochoty powinniśmy go dopajać. Najlepiej nadają się do tego herbatki ziołowe: rumiankowa, miętowa, koperkowa. Olej pomaga w przesuwaniu masy kałowej, można podać 3x dziennie po 1ml oleju parafinowego, lnianego lub spożywczego - wysoko gatunkowego. Można leciutko masować brzuszek królika oraz namawiać go do ruchu. Do jedzenia dajemy siano i suszone zioła. Jeśli uszak nie ma apetytu musimy go dokarmiać. Najlepiej nadaje się do tego utarte jabłko z marchewka, gotowe warzywne słoiczki dla niemowląt, bądź rozmoczony granulat - nie więcej niż 10ml za jednym razem. Do odbudowy flory bakteryjnej stosujemy Lakcid, kapsułkę dziennie, lub po pół kapsułki dwa razy dziennie. Pojawiające się bobki, mogą być na początku miękkie i tłuste (przez podany olej) będą takie jeszcze przez kilka dni. Nie musimy podawać już więcej oleju, ale możemy podać espumisan, aby zapobiec wzdęciom 2x dziennie po pół kapsułki. Możemy powoli powrócić do podawania zieleniny, zacznijmy od koperku, fenkułu, bazylii i mięty- wspomaga trawienie i poprawia apetyt."));
			
			diseaseService.create(new Disease(6L, "Enterocolitis - Bakteryjne zapalenie jelit", "Ta choroba znana jest od 1997 roku, wywołują ja bakterie Clostridia Perfrigens i Escherichia Coli. Cechuje się duża śmiertelnością. Pośród młodych zwierząt śmiertelność wynosi nawet 80%, u dorosłych królików 25%. Być może dlatego, że choroba postępuje bardzo szybko, a zwierzęta padają często przed ukazaniem się pełnych objawów. Clostridia produkuje toksyny, które są przyczyną zatrzymania pracy jelit oraz zmian patologicznych w jelitach i innych organach. E.coli wywołuje wodnistą biegunkę.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- apatia</br>" + 
					"- brak apetytu</br>" + 
					"- śluzowata lub galaretowata biegunka o zgniłym zapachu</br>" + 
					"- wzdęty, bolesny brzuch</br>" + 
					"- burczenie i przelewanie się w brzuchu</br>" + 
					"- szczekanie/zgrzytanie zębami</br>" + 
					"</br>" + 
					"Do zachorowania może dojść w wyniku:</br>" + 
					"- stresu</br>" + 
					"- odstawienia młodych od matki</br>" + 
					"- infekcji gronkowcami (ropnie)</br>" + 
					"- kataru i obniżenia odporności</br>" + 
					"- zarażenia glistami</br>" + 
					"- kokcydiozy</br>" + 
					"- karmienia pszenica, gluten jest świetną pożywka dla Clostridia</br>" + 
					"- braku higieny (brudne klatki, miski itp.)</br>" + 
					"</br>" + 
					"</br>" + 
					"Jeśli zauważymy któryś z powyższych objawów musimy natychmiast udać się do lekarza weterynarii i koniecznie wziąć próbkę króliczego kału. Na jego podstawie lekarz stwierdzi jakie bakterie są przyczyną choroby. Najczęściej stosowane leki przeciw Closteridia to Pulmotil lub Tiamutin, (nie w połączeniu z lekami na kokcydioze), jeśli w kale znajduje się też E.Coli, trzeba podąć Colistinsulfat .</br>" + 
					"</br>" + 
					"Uwaga, leki podajemy tylko przepisane przez lekarza, sami nie eksperymentujemy!!!</br>" + 
					"</br>" + 
					"Klatkę/zagródkę dokładnie myjemy i odkażamy. Poidełko i miseczki muszą być wyparzane i regularnie myte. Do jedzenia podajemy siano, dużo zieleniny, zioła: babkę lancetowata, oregano, bazylie, mniszek, tasznik itp. gałązki wierzby.</br>" + 
					"</br>" + 
					"W dużych hodowlach sporządza się na podstawie wyodrębnionych z kału chorego zwierzęcia bakterii, indywidualna szczepionkę. Można nią szczepić maluchy w wieku 25-45 dni oraz inne zagrożone króliki."));
			
			diseaseService.create(new Disease(6L, "Przepełnienie żołądka", "Króliki posiadają bardzo skomplikowany i wrażliwy układ pokarmowy. Ich żołądek nie ma prawie muskulatury, więc jedzenie aby przebyć całą drogę musi być popchnięte następną zjedzona porcja. Królik doskonale dba o swój układ pokarmowy pobierając do około 80 małych porcji jedzenia w ciągu doby. Najlepiej, gdy dostarczymy mu jedzenie małokaloryczne i wysoko włókniste, uszak będzie częściej po nie sięgał, a co za tym idzie układ pokarmowy nie przerwie swojej pracy. Mieszanki i granulaty są zbyt kaloryczne, prowadza do dłuższych przerw pomiędzy pobieraniem pokarmu, to może doprowadzić do rożnych powikłań zdrowotnych (przerost zębów, zaparcia, wzdęcia itd.). Króliki nie umieją wymiotować, a więc to wszystko co uszak połknął (włosy, zepsute jedzenie itd.) musi przebyć całą drogę by zostać w końcu wydalonym. Zbyt mała ilość zjedzonego pokarmu, łapczywe jedzenie i połykanie dużych kawałków, brak dostępu do wody, zbyt kaloryczny i pęczniejący pokarm oraz długie przerwy pomiędzy posiłkami utrudniają, wydłużają lub uniemożliwiają transport, powodują zaleganie i fermentowanie treści pokarmowej.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- odmowa jedzenia,</br>" + 
					"- szczekanie/zgrzytanie zębami</br>" + 
					"- niepokój</br>" + 
					"- częsta zmiana pozycji, raz siedząca raz leżąca,</br>" + 
					"- płytki oddech</br>" + 
					"- zaokrąglony, twardy brzuch</br>" + 
					"Bardzo szybko te symptomy mogą się zaostrzyć i przejść w stan zagrażający życiu królika, mogą wystąpić problemy z oddychaniem i układem krążenia. Przepełnienie żołądka jest zawsze nagłym przypadkiem, należy natychmiast udać się z królikiem do weterynarza.</br>" + 
					"</br>" + 
					"Przed wizyta zadbajmy o ciepło pacjenta dając mu do transporterka owinięty w ręcznik termofor. Weterynarz obmaca chory brzuch, dla potwierdzenia diagnozy powinno być wykonane RTG.</br>" + 
					"</br>" + 
					"Wzdęcie byłoby widoczne jako czarne pole wypełniające żołądek, także zator kula włosowa można</br>" + 
					"odróżnić od przepełnienia. Dla ustabilizowania układu krążenia królik dostanie kroplówkę, koniecznie powinien tez dostać środek przeciwbólowy. Następnie uszak otrzyma lekarstwo poprawiające perylistyke jelit i probiotyk. W domu dokarmiamy królika preparatem Critical Care rozpuszczonym w herbatce koperkowej. Podajemy też probiotyk i wykonujemy masaż kilka razy dziennie, pobudza on żołądek i jelita do pracy i pomaga w wydalaniu. Aby nie dopuścić do kolejnego przepełnienia należy zmienić dietę na wysoko włóknistą, profilaktycznie przebadać kał na obecność pasożytów i skontrolować zęby królika."));
			
			diseaseService.create(new Disease(7L, "Zapalenie pochwy", "Zapalenie często jest wywoływane przez bakterie, wirusy i drożdżaki. Może powstać w wyniku urazu, np. podczas ciężkiego porodu.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- Częste mycie okolic sromu,</br>" + 
					"- wydzielina z dróg rodnych,</br>" + 
					"- problemy z oddawaniem moczu,</br>" + 
					"</br>" + 
					"Leczenie polega na podaniu antybiotyku. Nie leczone zapalenie może być przyczyna zapalenia macicy.</br>" + 
					"</br>" + 
					"Pomocne zioła to przywrotnik pospolity, tymianek i rumianek. Przywrotnik (Alchemilla vulgaris) można podawać królicy zaraz po porodzie, profilaktycznie, działa przeciwzapalnie, uspakajająco, wspomaga leczenie ran, hamuje krwawienie."));
			
			diseaseService.create(new Disease(7L, "Zapalenie macicy", "Przyczyną zapalenia są duże wahania hormonów progesteronu i estrogenu. Te króliki, które są bardzo pobudzone seksualnie i często przechodzą ciąże urojona są najbardziej narażone na tą chorobę.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"- problemy z trawieniem</br>" + 
					"- bóle brzucha</br>" + 
					"- rozwolnienie</br>" + 
					"- chudniecie</br>" + 
					"- powiększenie obwodu brzucha</br>" + 
					"- mocz z krwią</br>" + 
					"- ropny wyciek z dróg rodnych</br>" + 
					"</br>" + 
					"Diagnozę można postawić na podstawie dokładnego badania, zdjęcia RTG i USG. Badanie krwi pokaże w jakim stanie znajduje się organizm królika. Najlepszym rozwiązaniem jest kastracja królicy czyli usuniecie macicy wraz z jajnikami i jajowodami. Przez kilka dni po kastracji uszak może być nawadniany za pomocą kroplówek, być może lekarz zaleci też podawanie antybiotyku. Należy dwa razy dziennie kontrolować ranę, oraz pilnować żeby królica jadła i pila. W razie gdyby nie miała apetytu musimy ja do pajać i dokarmiać (patrz. Dokarmianie)"));
			
			diseaseService.create(new Disease(7L, "Zapalenie gruczołów mlecznych", "Przyczyną zapalenia może być uderzenie lub przygniecenie sutka, zakłucie ściółką, infekcja bakteryjna lub zastój mleka spowodowany np. zbyt wczesnym odstawieniem młodych lub zatkaniem kanalika mlecznego.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- Królica nie chce karmić młodych, ucieka od nich na skutek bólu jaki sprawia jej ssanie,</br>" + 
					"- sutki są bolesne, nabrzmiałe i bardzo cieple</br>" + 
					"- gorączka</br>" + 
					"</br>" + 
					"Nieleczone zapalenie może skończyć się sepsą i śmiercią królicy. Lekkie zapalenie leczy się lekkimi masażami sutków, chłodnymi okładami i maściami przeciwzapalnymi. Cięższe z gorączką muszą być leczone antybiotykami. Jeśli w sutku zebrała się ropa prawdopodobnie będzie trzeba ją usunąć pod narkoza.</br>" + 
					"</br>" + 
					"Chora mama nie będzie chciała karmić swoich maleństw dlatego opiekun powinien przejąć jej obowiązki. Jeśli lekarz nie zaleci inaczej małe karmimy co trzy godziny, mlekiem dla kociąt rozpuszczonym w herbatce koperkowej lub rumiankowej. Proporcja 1: 2 czyli jedna łyżka proszku dwie łyżki herbatki. Temperatura mleka to 36-38 stopni, maluszki początkowo piją nie więcej niż 1ml podczas jednego posiłku. Po jedzeniu nie zapomnijmy o masażu brzuszka. Masujemy delikatnie w kierunku odbytu.</br>" + 
					" </br>" + 
					"Zioła które działają zapobiegawczo i są pomocne przy zapaleniu gruczołów mlecznych to Przywrotnik pospolity, suszona pokrzywa, mniszek lekarski, fenkuł."));
			
			diseaseService.create(new Disease(7L, "Rak narządów płciowych", "U samic najczęściej  spotykanym nowotworem jest rak macicy – gruczolakorak. W zaawansowanym stadium daje on przerzuty do płuc, otrzewnej, węzłów chłonnych i wątroby. Ryzyko zachorowania rośnie razem z wiekiem.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- agresja</br>" + 
					"- chudniecie,</br>" + 
					"- wyciek z pochwy</br>" + 
					"- krew w moczu</br>" + 
					"- bolesność brzucha podczas dotykania</br>" + 
					"</br>" + 
					"Diagnozę lekarz postawi po dokładnym zbadaniu królika, pomocne będzie badanie USG, badanie krwi oraz RTG - pokaże czy nie ma już przerzutów w płucach. Najskuteczniejszą metoda leczenia jest sterylizacja (kastracja), czyli usuniecie całej macicy wraz z przydatkami.</br>" + 
					" </br>" + 
					"Rakowi macicy można zapobiec poddając młode samiczki sterylizacji.</br>" + 
					"</br>" + 
					"</br>" + 
					"Rak jąder</br>" + 
					" </br>" + 
					"Rak jąder jest na szczęście u królików bardzo rzadki. Objawia się powiększeniem i bolesnością jednego jąderka. Najskuteczniejszą metodą leczenia jest kastracja."));
			
			diseaseService.create(new Disease(8L, "Chejletieloza", "Cheyletiella parasitivorax to pajęczak zamieszkujący powierzchniową warstwę naskórka, często u nasady włosa. Chejletiele odżywiają się naskórkiem i płynami ustrojowymi. Nie są związane tylko z jednym gatunkiem zwierzaka, mogą się przenieść na inne zwierzęta domowe, człowiek też może się zarazić.</br>" + 
					"</br>" + 
					"Symptomy: </br>" + 
					"- łupież</br>" + 
					"- gołe placki na grzbiecie i karku</br>" + 
					"- egzema</br>" + 
					"- świąd</br>" + 
					"- niepokój, a nawet agresja</br>" + 
					"- linienie</br>" + 
					"</br>" + 
					"Lekarz pobierze próbkę ze skóry lub sierści królika i obejrzy ją pod mikroskopem. Zwykle weterynarz podaje zastrzyk z Ivermectyny, trzeba go powtórzyć po 10 dniach. Inne sposoby to zakroplenie sierści pomiędzy łopatkami królika preparatem Stronghold. Aby zapobiec powtórnemu zarażeniu się królików musimy zadbać o higienę w klatce i w innych miejscach gdzie królik chętnie przebywa. Klatkę dokładnie myjemy gorącą woda z octem, miseczki wyparzamy, drewniane zabawki możemy włożyć na 10 min. do piekarnika nagrzanego do 90 stopni. Myjemy szczotkę królika. Podłogę myjemy woda z octem możemy ją spryskać płynem owadobójczym poleconym przez weterynarza.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Kleszcze", "To malutkie pajęczaki z rzędu roztoczy. Żyją w wysokich trawach, w parkach, na terenach leśnych, łąkach, przenoszone są przez ssaki i ptaki dlatego nie zdziwmy się, że po wizycie na działce królik wrócił z kleszczem. Żywią się krwią ssaków i ptaków, jest ona im potrzebna do dalszego rozwoju. Owady te są aktywne od wczesnej wiosny do późnej jesieni. Kleszcze wybierają sobie zwykle miejsce wokół pyszczka królika, wokół oczu, na uszach ponieważ tam sierść jest najkrótsza i skóra najbardziej dostępną. Kleszcze najpierw szukają dogodnego miejsca zanim się wczepią, dobrze jest po wycieczce na zieloną trawę przeczesać uszaka np. grzebieniem na pchły. Grzebień ten jest bardzo gęsty, znaleziony kleszcz zostanie uwieziony pomiędzy ząbkami.</br>" + 
					" </br>" + 
					"Znalezionego kleszcza należy jak najszybciej usunąć. Opiekun, który nigdy tego jeszcze nie robił powinien iść z królikiem do weterynarza. Jeśli ktoś ma wprawę to:  kleszcza chwytamy dwoma palcami tuż przy skórze i szybkim ruchem wyrywamy krwiopijcę. W sklepach dostępne są specjalne pęsety, które ułatwią nam usuniecie kleszcza w całości.</br>" + 
					" </br>" + 
					"Bardzo proste i przydatne w obsłudze widełki/hak którymi podważa się kleszcza.</br>" + 
					"</br>" + 
					"Po wyciągnięciu rankę należy zdezynfekować. Przez kilka dni, a nawet tygodni może być widoczna różowa grudka. Ugryzienie trzeba kontrolować czy nie zmienia swojego kształtu, nie powiększa się bądź ropieje. Gdyby z ranką coś się działo, konieczna jest wizyta u weterynarza. Nie ma skutecznego preparatu przeciw kleszczowego, wszystkie są przeznaczone dla psów i kotów, szkodliwe jednak dla królików.</br>" + 
					" </br>" + 
					"Kleszcze przenoszą takie choroby jak pomór i myksomatoza. Dlatego bardzo ważne jest szczepienie uszaków na te choroby, na pomór raz w roku, na myksomatoze dwa razy.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Pchły", "Króliki kupione z niepewnego źródła bądź ze sklepu mogą być zarażone pchłami. Królik może przynieść pasożyty także z dworu lub zarazić się od swojego psiego lub kociego przyjaciela. Najczęściej jest to pchła królicza Spilopsyllus cuniculi, ale pchły psie i kocie też mogą zaatakować naszego pupilka.</br>" + 
					" </br>" + 
					"Objawy </br>" + 
					"- mocny świąd i częste drapanie</br>" + 
					"- czarne grudki w sierści (odchody pcheł)</br>" + 
					"- egzema</br>" + 
					"- czarne szybko uciekające punkciki</br>" + 
					"</br>" + 
					"Pchły przenoszą myksomatoze i pomór, przed tymi chorobami chronią szczepienia, na myksomatoze wykonuje je się co pół roku, a przeciw pomorowi raz na rok. Jeśli wszystko wskazuje na to, że nasz ulubieniec ma pchły powinniśmy udać się do weterynarza. Lekarz popsika, zakropi lub wstrzyknie preparat owadobójczy dostosowany do wagi królika.</br>" + 
					"</br>" + 
					"Bezpieczne preparaty to Stronghold (zakrapia się go pomiędzy łopatkami zwierzaka), zasypki Pularyl i Insectin oraz płyn Biocyd. Ściółkę, siano i granulat należy całkowicie wymienić, klatkę dokładnie umyć, zabawki z materiału np. tunel i posłanie trzeba wyprać. Resztę mieszkania dobrze odkurzyć, podłogę umyć. Jeśli królik jest u nas długo należy spryskać środkiem owadobójczym ulubione miejsca królika np. fotel, dywan. Jaja pcheł spadają z sierści futrzaka na podłogę, dlatego dobrze jest profilaktycznie spryskać te miejsca po których królik często biegał. Preparat do spryskiwania powinien być z polecenia weterynarza, jest on przeznaczony do spryskiwania pomieszczenia i mebli, absolutnie nie wolno nim spryskiwać zwierząt.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Swędzik jesienny", "To pajęczak z rzędu roztoczy. Dla nas i dla naszych zwierząt groźne są larwy Swędzika. Zwykle bytują na terenach porośniętych trawą i na krzewach cierpliwie czekając na swojego żywiciela. Żywią się płynem organicznym, nie krwią, a do ich żywicieli należą myszy, krety, króliki, psy, koty, ptaki, a nawet człowiek. Larwy mają wielkość 0,2 - 0,3 mm gołym okiem nie można ich zobaczyć. Od żywiciela odpadają natychmiast jak tylko najedzą się do syta, czyli po około 6 dniach, u człowieka po 4-8 godzinach. Syta larwa przeobraża się po miesiącu w nimfę, a później w dorosłą postać Swędzika. Dorosły swędzik ma 1-2 mm i jest koloru lekko żółtego.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- świąd</br>" + 
					"- zaczerwienienie skóry/pokrzywka na głowie, wokół oczu, nosa, na uszach, pomiędzy palcami</br>" + 
					"- wypadanie sierści</br>" + 
					"- pęcherze</br>" + 
					"</br>" + 
					"Diagnozę weterynarz postawi po dokładnym obejrzeniu sierści przez mocniejszą lupę lub pobranej próbki pod mikroskopem. Bezpiecznym środkiem do zwalczania larwy swędzika jest Stronghold, zakrapla się go pomiędzy łopatkami królika.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Świerzb drążący", "Roztocze to żyje pod skórą i żywi się płynem tkankowym i komórkowym królika. Ich ulubionymi miejscami są nasada nosa, pyszczek, grzbiet i dolna część pleców.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- mocny świąd,</br>" + 
					"- otarte, krwawiące miejsca, strupy</br>" + 
					"- wypadanie sierści</br>" + 
					"- niepokój</br>" + 
					"W późniejszych stadiach: apatia, niechęć przed dotykiem, wycieńczenie i śmierć zwierzaka.</br>" + 
					"</br>" + 
					"Diagnoza jest dosyć prosta ponieważ wygład skóry i sierści jest charakterystyczny dla tej choroby, pomocna w postawieniu dokładnej diagnozy jest zeskrobina pobrana z zajętej skóry. Lekarz najczęściej podaje zastrzyk z Ivermektyny, który trzeba powtórzyć po 10 dniach. Inne preparaty to Stronghold (zakrapla się pomiędzy łopatkami królika), Dectomax - zastrzyk przeciw roztoczom. W domu powinniśmy wymienić siano i ściółkę, dokładnie umyć klatkę i cały sprzęt królika, podłogę w gorącej wodzie z dodatkiem octu. Roztocze może bez jedzenia wytrzymać nawet trzy tygodnie dlatego ważna jest higiena w tym okresie. Drewniane zabawki można włożyć do piekarnika 95° na 40 min. Zabawki lub posłania których nie można umyć trzeba włożyć do zamrażalki na 48 godzin.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Wszoły", "Gliricola porcelli, Gyropus ovalis i Trimenopon hispidum</br>" + 
					"</br>" + 
					"Pasożyty te mieszkają w sierści, najczęściej można je zobaczyć na głowie, plecach i pupie zwierzaka. Są dobrze widoczne gołym okiem, długość ciała to 1-2 mm, kolor od srebrno - białego do brązowego. Żywią się obumarłym naskórkiem, płynem tworzącym się w otartych miejscach</br>" + 
					"i sekretem z gruczołów. Najbardziej narażone na zachorowanie są słabe, chorowite lub</br>" + 
					"zaniedbane zwierzęta.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- świąd</br>" + 
					"- zadrapania i krwawiące rany</br>" + 
					"- wypadanie i łamliwość sierści</br>" + 
					"- malutkie ruchome robaczki w sierści</br>" + 
					"- niepokój</br>" + 
					"Nieleczony zwierzak staje się apatyczny, wycieńczony choroba umiera.</br>" + 
					"</br>" + 
					"Diagnozę weterynarz postawi po obejrzeniu sierści i skóry królika, w razie wątpliwości można pobrać próbkę za pomocą taśmy klejącej i obejrzeć pod mikroskopem. Preparaty chętnie stosowane przez weterynarzy: Stronghold (zakrapla się pomiędzy łopatki), Ivermektyna (zastrzyk) po 10 dniach trzeba powtórzyć.</br>" + 
					"</br>" + 
					"Aby nie dopuścić do wtórnego zakażenia myjemy całą klatkę, wymieniamy ściółkę, siano. Należy dokładnie umyć podłogę wokół najlepiej gorąca woda z octem, posłania i tunele z materiału pierzemy.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Wszy", "Najczęściej spotykana wesz u królików jest wesz zajęcza Haemodipsus lyriocephalus. Zarażenie wszami jest bardzo rzadkie, częściej u królików są spotykane wszoły lub pchły. Wesz żywi się krwią królika, jajeczka składa w sierści, każde przylepione jest do włosa specjalnym spoiwem.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"- świąd,</br>" + 
					"- niepokój</br>" + 
					"- małe rozdrapane krostki</br>" + 
					"- poprzylepiane do sierści jajeczka</br>" + 
					"- widoczne gołym okiem pasożyty</br>" + 
					"</br>" + 
					"Diagnozę lekarz stawia po obejrzeniu sierści, skóry i gnid przez łupę. Najczęściej przepisywane lekarstwa to Stronghold (do zakraplania pomiędzy łopatkami) lub Ivermektyna - zastrzyk,</br>" + 
					"który trzeba powtórzyć po 10 dniach.</br>" + 
					"</br>" + 
					"Aby nie dopuścić do wtórnego zakażenia myjemy całą klatkę, wymieniamy ściółkę, siano. Należy dokładnie umyć podłogę wokół najlepiej gorącą woda z octem, posłania i tunele z materiału pierzemy.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Larwy much - muszyca (myjoza)", "Nie tylko króliki chore, zaniedbane, chorują na Muszyce. Muchy chętnie składają jaja na królikach długowłosych, u których choroba często wykrywana jest zbyt późno. Muchy przyciąga brzydki zapach, poprzyklejane miękkie kupy, rany na ciele, sklejone futerko wokół oczu czy odbytu. Starsze zwierzęta, chore czy te z nadwagą, które nie są wstanie dokładnie się umyć i dotrzeć do wszystkich miejsc są najbardziej narażone. Wokół ran i zanieczyszczeń insekty składają swoje jaja, z których w przeciągu kilku godzin rozwijają się larwy. Larwy po zjedzeniu wierzchniej warstwy wgryzają się w ciało, wytwarzają przy tym groźne dla królika toksyny, które wprowadzają uszaka w stan szoku. Jeśli królik nie otrzyma natychmiastowej pomocy, larwy zjedzą go dosłownie żywcem. Jeśli zauważycie chociaż jedną larwę na ciele królika musicie jak najszybciej udać się do weterynarza!!! Jeżeli na daną chwile kontakt z weterynarzem z jakiegoś powodu jest niemożliwy, należy delikatnie obciąć sierść wokół rany i z pomocą pincety wyjąc wszystkie larwy (maja one ok. 1cm). Ostre światło sprawi, że robale schowają się głębiej, za to ciepłe powietrze z suszarki może je wywabić na powierzchnie. Po usunięciu larw, ranę trzeba przemyć roztworem soli fizjologicznej i zdezynfekować np. jodyna. Wizyta u lekarza jest konieczna czasami trzeba podać Ivermektyne lub antybiotyk, poza tym królik może być w stanie szoku spowodowanym trucizną wytwarzaną przez larwy.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(8L, "Nużyce", "Chorobę wywołują roztocza Demodex cuniculi, które żyją w mieszkach włosowych zwierząt i tam też przechodzą wszystkie stadia rozwoju, mogą występować na całym ciele.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"- często zakażenie jest bezobjawowe</br>" + 
					"- u wycieńczonych, słabych zwierząt występuje egzema i świąd,</br>" + 
					"- łamliwość włosów</br>" + 
					"- łupież</br>" + 
					"- łyse placki</br>" + 
					"- zapalenie skóry</br>" + 
					"- ropne pęcherze</br>" + 
					"</br>" + 
					"Diagnozę lekarz postawi pobierając zeskrobinę i oglądając ją pod mikroskopem. Najczęściej stosowane są zastrzyki z Ivermektyny, które powtarza się po 10-14 dniach, Stronghold (zakrapla się pomiędzy łopatkami), Biocyd do smarowania miejsc zmienionych chorobowo. Jeśli zwierzęta mają duże rany lub skóra jest w stanie zapalnym konieczne będzie podanie antybiotyku.</br>" + 
					" </br>" + 
					"W domu powinniśmy wymienić całą ściółkę i siano, klatkę i miejsce wokół klatki dobrze umyć gorącą woda z dodatkiem octu, zabawki wymyć, materiałowe posłanie i tunel wyprać. Drewniane rzeczy włożyć albo na 48 godzin do zamrażalki albo do piekarnika nagrzanego 95° na 40 minut, miseczki ceramiczne można włożyć do mikrofali na 2 min. Porady dotyczące higieny mogą się wydawać niektórym przesadą, ale jest to uzasadnione ponieważ jaja niektórych roztoczy mogą przeżyć od 2 do 8 tygodni.</br>" + 
					"</br>" + 
					"UWAGA – PREPARATY FIPREX I FRONTLINE NIE STOSUJEMY U KRÓLIKÓW. POWODUJĄ ONE CIĘŻKIE ZATRUCIA I ŚMIERĆ ZWIERZĄT."));
			
			diseaseService.create(new Disease(9L, "Encephalitozon Cuniculi", "Podobno około 80% królików jest nosicielem tej choroby. Niewiadomo dlaczego, u niektórych Uszaków choroba ujawnia się, a u innych pozostaje w ukryciu. Być może stres odgrywa tu dużą role, znaczne osłabienie organizmu lub złe warunki w jakich uszak żyje. Ta choroba występuje też u innych ssaków: u szczurów, myszy, chomików, świnek morskich, owiec, świń, psów itd. Człowiek może się zarazić tylko w przypadku dużego osłabienia układu odpornościowego.</br>" + 
					"</br>" + 
					"Jak dochodzi do zarażenia?</br>" + 
					"Ciężarne chore królice zarażają rozwijający się płód. Królik może się zarazić też poprzez zarodniki znajdujące się w moczu chorego królika np. zasikane siano. Sporo może się dostać do organizmu także przez drogi oddechowe. Pierwotniak atakuje układ nerwowy, nerki, wątrobę, śledzionę czasami też gałki oczne i mięsień sercowy.</br>" + 
					"</br>" + 
					"Najczęstsze objawy:</br>" + 
					"Przekrzywiona głowa, problemy z utrzymaniem równowagi, drgawki, kręcenie się w kółko, oczopląs, zaćma, brak apetytu, potrząsanie uszami. Może wystąpić paraliż częściowy lub całkowity. Konieczna jest jak najszybsza wizyta u lekarza!!! Diagnozę można postawić na podstawie badania neurologicznego, badania moczu i badania serologicznego - we krwi obecne są przeciwciała, ich ilość wskazuje czy choroba jest w toku czy królik jest tylko nosicielem</br>" + 
					"</br>" + 
					"Najczęściej stosowane lekarstwa: </br>" + 
					"- Antybiotyki zawierające Chloramphenicol lub Tetracykline</br>" + 
					"- Panacur - pasta na odrobaczenie, powinna być stosowana przynajmniej 3-4 tygodnie.</br>" + 
					"- Duże dawki witaminy B - wzmacnia układ nerwowy.</br>" + 
					"- Cortyzon- zwalcza zapalenie,</br>" + 
					"Przez pierwszy tydzień choroby, wskazane są kroplówki z roztworu soli fizjologicznej. Roztwór ten oczyszcza zaatakowane przez pierwotniaka nerki.</br>" + 
					"</br>" + 
					"Co możemy sami zrobić:</br>" + 
					"- Nie oddzielajmy uszaka od swojego przyjaciela czy grupy królików, to duży stres dla królika. Kicek może stracić ochotę do walki z choroba. Jest duże prawdopodobieństwo, że pozostałe uszatki noszą już w sobie tego pierwotniaka, bez jakichkolwiek objawów klinicznych.</br>" + 
					"- Przy antybiotyku dobrze jest podawać probiotyk np. Lakcid,( jedna ampułkę dziennie) rozrobić w wodzie i podać królikowi.</br>" + 
					"- Echinacea suszona wzmocni odporność królika. Inne sprzyjające zioła: krwawnik, babka lancetowata, mniszek lekarski, liście brzozowe suszone i świeże, pokrzywa suszona.</br>" + 
					"- Ziołowe herbatki wzmocnią i oczyszczą nerki.</br>" + 
					"- Lekkie masaże sparaliżowanych łapek lub delikatne ich szczotkowanie na pewno wspomogą leczenie.</br>" + 
					"- Jeśli uszak nie ma apetytu trzeba go dokarmiać np. gotowym preparatem Critical Care,  warzywnymi słoiczkami dla niemowląt lub rozmoczonym granulatem."));
			
			diseaseService.create(new Disease(9L, "Kokcydioza", "Kokcydy są to pierwotniaki z rodzaju Eimeria. W zależności od tego którym gatunkiem kokcydii nastąpi zarażenie, rozróżniamy dwie postacie choroby - wątrobowej i jelitowej. Oocysty wydalane są z kałem i dojrzewają przez 4-6 dni w ściółce, sianie czy trawie. Zjedzone trafiają z powrotem do organizmu. Dużo królików jest nosicielami tego pierwotniaka, ale nie wszystkie uszaki chorują. Do zachorowania dochodzi w wyniku stresu, obniżonej odporności, błędów żywieniowych czy nie przestrzegania higieny np. brudna kuweta, klatka.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"Chudniecie, brak apetytu, apatia, rozwolnienie ze śladami krwi lub śluzem, nadmierna ilość niezjadanych cekotrofów, wzdęty brzuch. Najbardziej niebezpieczna choroba ta jest dla młodych zwierząt do 12 tygodnia życia. U maluchów występuje przeważnie kokcydioza jelitowa, a u starszych królików częściej kokcydioza wątrobowa. Biegunka przy odmianie wątrobowej jest rzadkością. Kokcydoze stwierdza się na podstawie mikroskopowego badania kału. Należy zbierać bobki w ciągu dnia o rożnych porach. Jeśli robimy badanie profilaktyczne to zbieramy bobki przez trzy dni i zanosimy do weterynarza. Najczęściej stosowany w leczeniu jest Baycox, Retardon lub Cytostat R. Dwa tygodnie po kuracji trzeba powtórzyć badanie kału.</br>" + 
					"</br>" + 
					"Co możemy zrobić sami:</br>" + 
					"Podczas leczenia królika nie powinno się podawać pokarmów zawierających zboże. Skrobia zawarta w zbożu jest doskonałą pożywka dla kokcydów. Zrezygnujmy z podawania owoców i warzyw takich jak marchew czy seler korzeniowy.</br>" + 
					" </br>" + 
					"WSKAZANIE : papryka, kapusta pekińska, pomidor, seler naciowy, ogórek, liście kalarepy, trawa, mniszek lekarski, herbatka rumiankowa i nagietkowa. Na rozwolnienie pomagają suszone owoce czarnej jagody (czernicy), można również kupić w aptece herbatkę z suszonych jagód.</br>" + 
					" </br>" + 
					"Klatkę, zagrodę, podłogę, zabawki trzeba dobrze umyć, wyparzyć miseczki i kuwety. Drewniane zabawki możemy włożyć do piekarnika 60° na 10 minut, czynności te powtarzamy regularnie przynajmniej przez pierwszy tydzień leczenia. Zieleninę i siano nie podajemy na podłodze, ponieważ  mogą się zetknąć z oocystami, które po zjedzeniu znowu trafia do organizmu królika. Nowo przybyłe zwierzęta powinny być poddane dwutygodniowej kwarantannie zanim połączymy je z domowymi uszakami. Profilaktycznie można oddać bobki do badania."));
			
			diseaseService.create(new Disease(9L, "Nicienie", "Najczęstszymi pasożytami żyjącymi w jelitach są nicienie : Garphidium strigosum, Trichostrongylus retortaeformis, Passalurus ambiguus (owsik).</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"- brak apetytu,</br>" + 
					"- apatia</br>" + 
					"- chudniecie</br>" + 
					"- rozwolnienie ze śluzem</br>" + 
					"- widoczne gołym okiem białe robaki w bobkach</br>" + 
					"- chroniczne zapalenie jelit</br>" + 
					"</br>" + 
					"Diagnozę weterynarz postawi po badaniu kału. Należy zebrać bobki, najlepiej z trzech dni lub z rożnych pór dnia i oddać do badania. Widoczne gołym okiem owsiki można nakleić na zwykłą taśmę klejącą i pokazać weterynarzowi.</br>" + 
					"</br>" + 
					"Najczęściej w leczeniu stosuje się Fenbendazol. Moje króliki dostały pastę panacur. Pasta jest łatwa w dozowaniu, ma podziałkę na kg, łatwa w obsłudze i ma jeszcze tą zaletę, że króliki ją zazwyczaj lubią. Podaje się ją przez trzy dni, po dwóch tygodniach przerwy kuracje należy powtórzyć - o ile lekarz nie zaleci inaczej. Innym chętnie stosowanym lekiem jest Ivermectyna, wstrzykuje się ją dwa razy w odstępach 10- 14 dniowych.</br>" + 
					"</br>" + 
					"Klatkę należy dobrze umyć gorącą woda z octem, także kuwetę, miseczki i zabawki. Zieleninę zbieramy z dala od miejsc gdzie wyprowadzane są psy, na polanach i łąkach. Zwróćmy uwagę czy nie ma odchodów dzikich królików.</br>" + 
					"</br>" + 
					"Profilaktycznie powinno się robić badanie kału każdemu nowo nabytemu królikowi."));
			
			diseaseService.create(new Disease(10L, "Grzybica", "Najczęstszymi grzybicami na które zapadają króliki są: grzybica drobno zarodnikowa, grzybica woszczynowa, strzygąca (Trichophyton mentagrophytes) i grzybica narządowa. Grzybice należą do Zoonoz czyli chorób, którymi może zarazić się też człowiek.</br>" + 
					"</br>" + 
					"Głównymi przyczynami zachorowań na grzybice są:</br>" + 
					"- silny stres np. na skutek zaprzyjaźniania, częste branie na ręce przez dzieci, dojrzewanie i walki w grupie</br>" + 
					"- złe warunki higieniczne w jakich żyją króliki, rzadkie sprzątanie klatki</br>" + 
					"- osłabienie odporności na skutek nieodpowiedniego żywienia</br>" + 
					"- inne choroby oraz lekarstwa</br>" + 
					" </br>" + 
					"Na początku omówię grzybice atakującą skórę i sierść królika.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- okrągłe łyse placki, w początkowej fazie na uszach, wokół pyszczka, na kończynach, później też na grzbiecie i brzuchu.</br>" + 
					"- łupież</br>" + 
					"- łamliwość włosów</br>" + 
					"- strupki na ciele</br>" + 
					"</br>" + 
					"Diagnozę stawia się po pobraniu zeskrobiny lub sierści i wyhodowaniu grzybów w laboratorium. Inną metodą jest naświetlenie sierści lampą UV, w miejscach zaatakowanych występuje zielono - żółta fluorescencja. Brak fluorescencji nie wyklucza jednak grzybicy.  Na podstawie badań lekarz zaleci dalsze leczenie. Przed nasmarowaniem skóry przepisanymi lekarstwami sierść wokół ognisk</br>" + 
					"chorobotwórczych należy ogolić ponieważ w sierści znajdują się spory grzybów, które rozprzestrzeniają się na zdrową skórę.</br>" + 
					"</br>" + 
					"Najczęściej stosowane leki: </br>" + 
					"Surolan, Undofen, Canasten, bardzo swędzące miejsca można cienko posmarować Fenistilem. Leczenie trwa przynajmniej trzy tygodnie. Wymieniamy ściółkę i siano, klatkę, zagrodę, zabawki, kuwetę itd. dokładnie myjemy gorącą wodą. Zabawki i posłania z materiału pierzemy, drewniane zabawki wkładamy do piekarnika 90° na 40 minut. Jeśli królik żyje w małej grupie z innymi zwierzętami nie należy go rozłączać. Stres związany z rozłąką opóźni powrót do zdrowia uszaka.</br>" + 
					"</br>" + 
					"</br>" + 
					"Grzybica narządowa </br>" + 
					"</br>" + 
					"Najczęściej zasiedla jelita królika. Do namnażania się grzybów dochodzi na skutek osłabienia organizmu, stres jest bardzo ważnym faktorem, szybka zmiana pożywienia, pożywienie zawierające dużo skrobi np. granulaty, które mają w swoim składzie zboże, produkty zawierające dużo cukru np. owoce, kolby mogą się przyczynić do zmiany ph w jelitach i szybkiemu namnażaniu się grzybów i drożdży. Także zepsute, nieświeże jedzenie może zawierać spory grzybów.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- częste biegunki</br>" + 
					"- częste zaparcia</br>" + 
					"- brzydka matowa i łamliwa sierść</br>" + 
					"- łamliwość zębów</br>" + 
					"</br>" + 
					"Diagnozę lekarz postawi oglądając kał chorego królika pod mikroskopem. Może też wysłać próbkę do laboratorium, w tym wypadku trzeba będzie poczekać na wyniki około tygodnia. Najczęściej podaje się Nystatin doustnie - o ile lekarz nie zaleci inaczej. Leczenie powinno trwać przynajmniej 10 dni, po 6-8 tygodniach trzeba wykonać ponowne badanie kału."));
			
			diseaseService.create(new Disease(10L, "Zapalenie skóry podeszwy", "Rany na podeszwach są bardzo bolesne dla królika, zwykle pojawiają się na tylnich skokach. Przy pierwszych objawach należy rozpocząć leczenie. Najczęściej pojawiają się u królików, które są trzymane na twardym podłożu, w brudnej i wilgotnej klatce, u królików z tuszą lub po urazie kończyn (uszak odciąża chora łapę, ciężar ciała przenosi na zdrowa łapkę).</br>" + 
					" </br>" + 
					"Jeśli kuweta jest rzadko sprzątana, królik siedzi w nasiąkniętym moczem żwirku, mocz jest bardzo agresywny, mocno podrażnia skórę, na rozmiękczonej i podrażnionej skórze tworzą się bolesne rany.</br>" + 
					" </br>" + 
					"Króliki poruszające się po nieodpowiednim podłożu są narażone na zapalenie podeszew.</br>" + 
					"</br>" + 
					"Sprzyjające powstawaniu ran powierzchnie:</br>" + 
					"- twarda, chropowata podłoga</br>" + 
					"- twardy plastik</br>" + 
					"- twardy żwirek</br>" + 
					"- sztuczne dywany i wykładziny (ścierają sierść i skórę)</br>" + 
					"</br>" + 
					"Najpierw wyciera się sierść, pojawiają się łyse miejsca na skokach, powstają odciski, które z biegiem czasu staja się większe, skóra robi się zaogniona. Opuchnięte podeszwy coraz bardziej zaczynają piec,skóra jest napięta i bolesna.</br>" + 
					"</br>" + 
					"Podczas biegania podrażniona skóra ściera się i zaczyna krwawic. Robią się otarcia i strupy. Z powodu zanieczyszczeń i bakterii rany mogą puchnąć i przejść w stan zapalny. Jeśli nie zostanie podjęte leczenie zapalenie obejmie kości.</br>" + 
					"</br>" + 
					"Leczenie:</br>" + 
					"</br>" + 
					"Bardzo ważne jest utrzymanie podeszw w czystości. Myjemy je regularnie, czystą chłodną wodą, ciepła może spowodować ból, chłodna daje ukojenie. Zamiast wody możemy użyć srebra koloidalnego ma ono ta zaletę, że działa dezynfekująco i wspomaga gojenie.</br>" + 
					"</br>" + 
					"Po umyciu i delikatnym osuszeniu stop smarujemy je maścią np.</br>" + 
					"- Betadine (ma działanie odkażające, bakteriobójcze),</br>" + 
					"- Bepathen ( działa odkażająco i przeciwzapalnie, przyspiesza gojenie i chroni skórę  przed nadmiernym działaniem wilgoci, zwiększa elastyczność i nawilżenie skóry).</br>" + 
					"- Maść nagietkowa (przyspiesza gojenie się ran, natłuszcza) - nadaje się do lekkich otarć.</br>" + 
					"</br>" + 
					"Silnie zaognione, krwawiące lub zainfekowane rany wymagają podania maści z antybiotykiem lub kortyzonem. Weterynarz pokaże jak powinno się bandażować skoki i zmieniać opatrunek.</br>" + 
					"</br>" + 
					"</br>" + 
					"Na czas leczenia żwirek w kuwecie należy zamienić na ręczniki papierowe lub papier toaletowy, który często zmieniamy aby nie podrażniać chorych łapek i nie dopuścić do infekcji.</br>" + 
					" </br>" + 
					"</br>" + 
					"Uwaga: informacje zawarte w tym artykule nie zastąpią wizyty u weterynarza."));
			
			diseaseService.create(new Disease(10L, "Zapalenie warg", "Tworzy się przede wszystkim na skutek niedoboru witaminy C i A oraz niedoboru kwasów tłuszczowych i pantotenowych.</br>" + 
					"Na pyszczku, nosie i na śluzowce w pyszczku tworzą się bolesne pęknięcia, które pokrywają się strupkami, skóra jest zaczerwieniona i sucha. W tych rankach osiadają grzyby i bakterie, dochodzi do infekcji.</br>" + 
					" </br>" + 
					"Lekarz weterynarii pobierze próbkę i na jej podstawie zostanie wyhodowany szczep bakterii. Najczęściej są to gronkowce, rzadziej mikrokoki lub paciorkowce. Na zmienionej chorobowo śluzowce można znaleźć też roztocza, drożdże i grzyby.</br>" + 
					" </br>" + 
					"W zależności od postawionej diagnozy stosuje się antybiotyk, maść przeciwgrzybiczną, maść z witamina A lub inne polecone przez weterynarza. Strupki można zmiękczyć przykładając rumianek w chore miejsca i smarując maścią gojąca lub maścią z Wit. A.</br>" + 
					"</br>" + 
					"Powinniśmy urozmaicić dietę naszego uszaka o warzywa zawierające witaminy C i A np. papryka, brokuły, marchew, nać pietruszki, dynia. Nie ma potrzeby podawania sztucznych witamin. Kwasy tłuszczowe znajdziemy w ziarnach słonecznika i siemieniu lnianym - można posypać nimi warzywa. Zrezygnujmy na czas leczenia z podawania owoców, sok podrażnia ranki, szczypie i powoduje ból."));
			
			diseaseService.create(new Disease(11L, "Myksomatoza", "Myksomatoza jest jedna z najniebezpieczniejszych chorób króliczych, w większości przypadków kończy się śmiercią zwierzaka, śmiertelność wynosi mniej więcej 90%. Chorobę wywołuje Leporipoxvirus z rodziny pokswirusow. Chorują tylko króliki, inne zwierzęta i człowiek nie mogą się nią zarazić. Jeśli królik zwalczy chorobę zaraża nią w dalszym ciągu przez okres 6 miesięcy.</br>" + 
					"</br>" + 
					"Najczęściej wirus przenoszony jest przez pchle króliczą, komary, roztocza, kleszcze, wszy i muchy. Wirus można przynieść także z zerwana zielenina. Królik może się zarazić od innego królika mimo, że ten nie wykazuje żadnych oznak zachorowania i od człowieka jeśli ten miął kontakt z chorym zwierzęciem. Szczepione króliki nie powinny przebywać razem z nieszczepionymi uszakami.</br>" + 
					"</br>" + 
					"Postać ostra:</br>" + 
					"Choroba daje o sobie znać po 3-5 dniach od zarażenia. Pierwsze objawy to opuchniecie oczu, zapalenie spojówek, opuchlizna nosa, uszu, warg także okolic narządów płciowych. Pojawia się gorączka i problemy z oddychaniem. Zwierzęta nie maja apetytu, są apatyczne, chudną. Śmierć następuje po 8-10 dniach.</br>" + 
					"</br>" + 
					"Postać chroniczna:</br>" + 
					"Na uszach, wokół oczu, wokół pyszczka, odbytu i narządów płciowych tworzą się krostki. Tą postać myksomatozy silne króliki mogą przezwyciężyć.</br>" + 
					"</br>" + 
					"Najczęściej chore zwierzęta są usypiane. Jeśli lekarz podejmie się leczenia zastosuje antybiotyk (Baytril najczęściej), krople do oczu, witaminy i lekarstwa wspomagające układ immunologiczny królika. Leczenie jest długie i rzadko kończy się uzdrowieniem zwierzaka.</br>" + 
					"</br>" + 
					"Najważniejszym i najskuteczniejszym środkiem zapobiegawczym jest szczepionka przeciwko myksomatozie. Szczepi się 4-6 tygodniowe króliki, po miesiącu szczepienie należy powtórzyć. Następne szczepienia wypadają co pół roku. Idealnymi miesiącami szczepienie jest marzec i wrzesień. Szczepionka nie daje 100% gwarancji, ale nawet jeśli królik zachoruje choroba przebiegnie łagodniej i jest duża szansa na całkowite wyzdrowienie. Oprócz tego należy zadbać aby królik nie był nękany przez komary, meszki i muchy. W oknach można powiesić siatki chroniące przed muchami i komarami. Po spacerze sprawdzamy sierść w poszukiwaniu kleszczy. Zieleninę zbieramy z dala od siedzib dzikich królików, ich obecność można poznać po bobkach zostawianych na granicy rewiru. Może się zdarzyć, że znajdziemy dzikiego, chorego królika z objawami myksomatozy (opuchnięte oczy, nos, krosty na uszach) w żadnym wypadku nie zabierajmy go do mieszkanie. Zwierzaka należy zanieść do weterynarza.</br>" + 
					"</br>" + 
					"Aktualizacja z dnia 22.03.2016r. </br>" + 
					"</br>" + 
					"Nowa szczepionka kombinowana dla królików.</br>" + 
					"</br>" + 
					"Szczepionka kombinowana dla królików Nobivac</br>" + 
					"</br>" + 
					"W 2011 roku Europejska Agencja Leków ( EMA) dopuściła nową szczepionkę dla królików Nobivac Myxo-RHD. Szczepionka zawiera żywy wirus myksomatozy z wektorem wirusa RHD. Szczepi się króliki od 5 tygodnia życia, nabieranie odporności trwa 3 tygodnie i odporność utrzymuje się przez rok. Czyli jeśli zaszczepimy królika na wiosnę to szczepienie należy powtórzyć wiosna przyszłego roku, a nie jak w przypadku innych szczepionek jesienią.</br>" + 
					"</br>" + 
					"Jak w przypadku innych szczepionek, szczepić należy tylko zdrowe króliki. Działania niepożądane, które mogą wystąpić to podwyższenie temperatury o 1-2 stopni C, niebolesny obrzęk w miejscu ukłucia, który może utrzymywać się do 3 tygodni. Ciężarne samiczki można zaszczepić dopiero po 14 dniach ciąży.</br>" + 
					"</br>" + 
					"W porównaniu do innych szczepionek RHD, nowy produkt zrobił ogromny postęp odnośnie ochrony zwierząt. Mało kto wie, że aby powstała szczepionka przeciw pomorowi, infekuje się zdrowe króliki i z ich wątroby pozyskuje się materiał na szczepionkę RHD. Czyli po to żeby nasze uszaki uchronić przed choroba, muszą te laboratoryjne zapłacić swoim zdrowiem i życiem. Szczepionka Nobivak jest produkowana z genetycznie zmienionego Myxo- wirusa, żaden królik nie musi zostać zabity do jej produkcji."));
			
			diseaseService.create(new Disease(11L, "Pomór króliczy", "Pomór jest bardzo groźna chorobą wirusową, zapadają na nią króliki i zające, inne zwierzęta i człowiek nie mogą się nią zarazić. Choroba wywoływana jest przez wirusa z grupy Picorna (Kaliciwirusy). Najwięcej zachorowań notuje się w miesiącach letnich, pojedyncze przypadki w zimie. Pomór w 80-100% kończy się śmiercią zwierzaka.</br>" + 
					" </br>" + 
					"Okres inkubacji wynosi 1-3 dni. Najczęściej wirus przenoszony jest przez pchłę króliczą, komary, roztocza, kleszcze, wszy i muchy. Wirus można przynieść także z zerwaną zieleniną. Królik może się zarazić od innego królika i od człowieka, jeśli ten miął kontakt z chorym zwierzęciem.</br>" + 
					" </br>" + 
					"Postać ostra :</br>" + 
					"Charakteryzuje się niepokojem lub apatia i wycieńczeniem, brakiem apetytu, trudnością w oddychaniu, gorączką może dojść biegunki. Zwierzęta duszą się i umierają w cierpieniu.</br>" + 
					"</br>" + 
					"Postać nad ostra:</br>" + 
					"Może nie dawać żadnych objawów, zwierzak znajdowany jest w klatce nieżywy z krwawym wyciekiem z nosa lub nagle dostaje drgawek, dusi się, często z wygiętą do tylu głową i krwawym wyciekiem z nosa.</br>" + 
					"</br>" + 
					"Postać łagodną:</br>" + 
					"Królik źle się czuje, może mieć biegunkę. Po kilku dniach wszystko wraca do normy, uszak zdrowieje. Przez kilka miesięcy może zarażać pomorem inne króliki, wirus pozostaje przez jakiś czas w organizmie.</br>" + 
					"</br>" + 
					"Najważniejszym środkiem zapobiegawczym jest szczepionka przeciwko pomorowi. Można ją kombinować ze szczepionką na myksomatoze. Szczepienie podstawowe w wieku 4-6 tygodni na pomór lub pomór i myksomatoze, po czterech tygodniach powtórzenie szczepienia. Dawki przypomina się co 12 miesięcy.</br>" + 
					"</br>" + 
					"Aktualizacja z dnia 22.03.2016r. </br>" + 
					"</br>" + 
					"Nowa szczepionka kombinowana dla królików.</br>" + 
					"</br>" + 
					"Szczepionka kombinowana dla królików Nobivac</br>" + 
					"</br>" + 
					"W 2011 roku Europejska Agencja Leków ( EMA) dopuściła nową szczepionkę dla królików Nobivac Myxo-RHD. Szczepionka zawiera żywy wirus myksomatozy z wektorem wirusa RHD. Szczepi się króliki od 5 tygodnia życia, nabieranie odporności trwa 3 tygodnie i odporność utrzymuje się przez rok. Czyli jeśli zaszczepimy królika na wiosnę to szczepienie należy powtórzyć wiosna przyszłego roku, a nie jak w przypadku innych szczepionek jesienią.</br>" + 
					"</br>" + 
					"Jak w przypadku innych szczepionek, szczepić należy tylko zdrowe króliki. Działania niepożądane, które mogą wystąpić to podwyższenie temperatury o 1-2 stopni C, niebolesny obrzęk w miejscu ukłucia, który może utrzymywać się do 3 tygodni. Ciężarne samiczki można zaszczepić dopiero po 14 dniach ciąży.</br>" + 
					"</br>" + 
					"W porównaniu do innych szczepionek RHD, nowy produkt zrobił ogromny postęp odnośnie ochrony zwierząt. Mało kto wie, że aby powstała szczepionka przeciw pomorowi, infekuje się zdrowe króliki i z ich wątroby pozyskuje się materiał na szczepionkę RHD. Czyli po to żeby nasze uszaki uchronić przed choroba, muszą te laboratoryjne zapłacić swoim zdrowiem i życiem. Szczepionka Nobivak jest produkowana z genetycznie zmienionego Myxo- wirusa, żaden królik nie musi zostać zabity do jej produkcji."));
			
			diseaseService.create(new Disease(11L, "Pasteurelloza", "Jest bardzo rozpowszechniona wśród królików. Wywołuje ją bakteria Pasteurella multocida, rzadziej Bordetella bronchiseptica. Niektóre króliki są nosicielami tej choroby. Ta bakterie spotyka się także u świnek morskich, psów i kotów, dzieci i dorośli z osłabioną odpornością mogą się nią zarazić. Zaleca się częste mycie rąk i unikanie kontaktu ze śliną chorych zwierząt. Uszaki zarażają się poprzez wydzielinie z nosa i ślinę zarażonego królika, osiada ona na pożywieniu, na podłodze, klatce, zdrowe zwierzęta wdychają bakterie, dochodzi do epidemii.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"Choroba zaczyna się suchymi kichnięciami. Z czasem kichanie staje się częste i towarzyszy mu przezroczysta wydzielina. Sierść wokół noska jest mokra i sklejona. Dochodzi do zapalenia spojówki, może dojść do zapalenia ucha środkowego i wewnętrznego (przechylona głowa), zapalenie płuc i zapalenie osierdzia. Pasteurelloza może być przyczyną ropni, zapalenia jąder i pochwy.</br>" + 
					" </br>" + 
					"Przy postaci nad ostrej śmierć przychodzi nagle, bez widocznych objawów choroby.</br>" + 
					"</br>" + 
					"W postaci ostrej-  bakterie przedostają się do układu krążenia i wywołują coś w stylu \" zakażenia krwi\". Osłabiony organizm nie jest w stanie obronić się przed kolejnymi atakami, królik wycieńczony chorobą umiera w przeciągu 2-8 dni. Postać chroniczną - trwa latami, cechuje się częstymi nawrotami, ale ogólnie królik czuje się dobrze i może z tą postacią żyć.</br>" + 
					"</br>" + 
					"Lekarz pobierze wydzielinę z nosa królika aby ustalić bakterie i wrażliwość jej na antybiotyki (antybiogram). Antybiotyk podaje się przeważnie 5-7 dni. Dawka jest zależna od wagi królika. Ważne żeby nie przerywać kuracji, grozi to uodpornieniem się bakterii na dany antybiotyk i nawrotem infekcji. Podczas kuracji należy podawać probiotyk np. Lakcid, jedną kapsułkę dziennie.</br>" + 
					"Choroby nie da się tak do końca wyleczyć, często nawraca, królik ma okresowo katar, zapalenie spojówek, oskrzeli lub na ciele tworzą się ropnie. Bardzo dobre wyniki daje leczenie Interferonem, jest to lek stosowany głównie u ludzi, kotów i psów, mało znany w leczeniu królików.</br>" + 
					"</br>" + 
					"Pomocne zioła:</br>" + 
					"Tymianek, dzieła przeciw zapalnie, odksztuszająco, wzmacnia, dezynfekuje, poprawia trawienie. Pomaga przy chorobach układu oddechowego: katarze, przeziębieniu, zapaleniu oskrzeli. Posiada naturalne właściwości antybiotyku, wzmacnia równocześnie system immunologiczny, w przeciwieństwie do antybiotyku, który niszczy florę jelit. Podajemy w formie herbatki zamiast wody, lub suszony. Liście malin, jeżyn i babki lancetowatej są pomocne przy przeziębieniu. Jeżówka purpurowa(echinacea) wzmacnia odporność królika. Natka pietruszki jest bogata w witaminę C, wzmacnia odporność.</br>" + 
					" </br>" + 
					"Inhalacje bardzo pomagają królikom w czasie katarku, można je robić ze zwykłego majeranku lub rumianku.</br>" + 
					"</br>" + 
					"Przepis na bardziej skomplikowaną: </br>" + 
					"Łyżeczkę tymianku i łyżeczkę rumianku wrzucić do zimnej wody, zagotować. Odstawić z ognia dodać pół łyżeczki sody ( uwaga ucieka z garnka). Postawić obok klatki na około 10 min, klatkę i garnek przykryć kocem. Trzeba później dobrze wytrzeć uszaka ręcznikiem bo para osiada też na sierści i uszak może się przeziębić lub będzie mu zimno. Dobre efekty daje ogrzewanie królika lampka podczerwona np. zaraz po inhalacji.</br>" + 
					"</br>" + 
					"Pasteurellozie można zapobiec stosując szczepionkę. Zwłaszcza ma to sens w dużych grupach królików bądź hodowlach. Szczepionkę można kojarzyć ze szczepieniem na myksomatoze bądź pomór lub zaszczepić oddzielnie 4 tygodnie po szczepieniach na myksomatoze i pomór. Dawkę przypominającą wykonuje się co 6 miesięcy."));
			
			diseaseService.create(new Disease(12L, "Przerost korony zębów", "Dosyć często spotykana anomalia u królików. Spowodowana jest:</br>" + 
					"- błędami w żywieniu: rozdrabnianie, krojenie jedzenia, zbyt mało siana w diecie, zbyt kaloryczna dieta - powoduje, że królik nie ma ochoty jeść siana.</br>" + 
					"- wada genetyczna, zły zgryz, zęby nie ścierają się równomiernie, rosną, przeszkadzają w jedzeniu, tworzące się ostre krawędzie ranią dziąsła i język.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"- powolne jedzenie</br>" + 
					"- ślinienie się</br>" + 
					"- przesadne ruchy podczas gryzienie</br>" + 
					"- przerośnięte siekacze</br>" + 
					"- spadek wagi</br>" + 
					" </br>" + 
					"Weterynarz wyrówna i wyszlifuje ząbki (pod narkozą). Jeśli przyczyna przerostu koron jest wadą genetyczną to tą procedurę trzeba będzie powtarzać mniej więcej co dwa miesiące. Siano, gałązki i zielenina ścierają zęby i masują dziąsła, powinny być codziennie podawane.</br>" + 
					"</br>" + 
					"Chleb, mieszanki, granulat, kolby i dropsy wbrew wierzeniom i reklamom na pudełkach nie ścierają zębów, powodują że królik przez długi czas jest syty i nie sięga po siano tak często jak powinien, żeby zetrzeć trzonowce. Poza tym te \"przysmaki\" zawierają cukier, który oblepia zęby i tym samym</br>" + 
					"przyczyniają się do powstawania próchnicy i łamliwości zębów."));
			
			diseaseService.create(new Disease(12L, "Przerost korzeni zębów", "Nawet jeśli korona zęba jest zdrowa i nie widać żadnych zmian w pyszczku korzenie mogą być przerośnięte. Przebijając się przez szczękę, mogą przyczynić się do zatkania kanalika łzowego, powodując katar i łzawienie oczek. Często są przyczyna ropni. W najgorszym wypadku mogą uszkodzić oko. Powodują nieprzyjemny ból i ucisk zwłaszcza przy zmianach pogody.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"-  wyczuwalna gulka pod broda</br>" + 
					"-  łzawienie lub ropny wyciek z oka</br>" + 
					"-  katar</br>" + 
					"-  wytrzeszcz oka</br>" + 
					"-  ropień</br>" + 
					" </br>" + 
					"Aby zdiagnozować przerost korzeni u królika należy zrobić RTG czaszki. Przerośnięte zęby trzeba usunąć, jeśli powstał już ropień należy go wyczyścić. W przypadku gdy kości szczeki są uszkodzone i grożą pęknięciem usuniecie zęba jest niemożliwe, można tylko usunąć ropień i zastosować antybiotykoterapie oraz środek przeciwbólowy."));
			
			diseaseService.create(new Disease(12L, "Ropnie", "Częstymi powikłaniami wad zgryzu i przerostu korzeni są ropnie. W kieszenie powstałe obok poluzowanych zębów dostaje się pożywienie i bakterie. Dochodzi do zapalenia w wyniku którego zęby jeszcze bardziej się poluzowują. Bakterie dostają się głębiej i niszczą kość, tworzy się ropa. Niektóre ropnie osiągają rozmiar kurzego jajka.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"-  zniekształcenie pyszczka,</br>" + 
					"-  wyczuwalna gulka pod pyszczkiem</br>" + 
					"-  wydzielina z oka lub nosa</br>" + 
					"-  długie, ostrożne przeżuwanie</br>" + 
					"-  zjadanie tylko miękkiego pożywienia</br>" + 
					"-  ślinienie</br>" + 
					"-  wytrzeszcz oka</br>" + 
					" </br>" + 
					"Diagnozę lekarz postawi na podstawie oględzin zębów oraz zdjęcia RTG. Ropnie muszą być usunięte chirurgicznie (w narkozie), rana dobrze wypłukana, czasami konieczne jest usuniecie zęba. Na podstawie posiewu podaje się antybiotyk. Królik powinien przez pierwsze dni po operacji otrzymać środek przeciwbólowy. Rana po ropniu powinna być przez jakiś czas przemywana środkiem antyseptycznym raz- dwa razy dziennie. Zestresowany i obolały uszak może nie mieć apetytu dlatego powinniśmy go dopajać i dokarmiać (więcej w dziale dokarmianie).</br>" + 
					"</br>" + 
					"Ten typ ropni może niestety nawracać dlatego powinniśmy często kontrolować zęby i pyszczek uszaka oraz zwracać uwagę na jego zachowanie przy jedzeniu."));
			
			diseaseService.create(new Disease(12L, "Złamania zębów", "Królik może spaść np. z łóżka lub regalu tak niefortunnie, że dojdzie do złamania ząbków, niektóre uszaki lubią gryźć pręty klatki jeśli zahaczy się ząbkami, szarpiąc się w panice może złamać lub nawet wyrwać sobie siekacze. Złamania zębów trzonowych mogą być spowodowane niedoborem mikroelementów lub być skutkiem infekcji bakteryjnej, ropni czy silnego zapalenia warg.</br>" + 
					" </br>" + 
					"Objawy:</br>" + 
					"-  królik nie może odgryźć jedzenia</br>" + 
					"-  ssie lub liże swój pokarm</br>" + 
					"-  wypluwa jedzenie</br>" + 
					"-  ślini się</br>" + 
					"-  większość pożywienia zostaje nie zjedzona</br>" + 
					"</br>" + 
					"Złamane siekacze odrastają same, jeśli są rożnej długości weterynarz je wyrówna. Zanim złamane ząbki odrosną trzeba ułatwić królikowi pobieranie pokarmu. Twarde warzywa ścieramy na grubej tarce (pozostałe zęby muszą się ścierać), zieleninę, miękkie warzywa i listki możemy posiekać nożem lub pokroić na paseczki szerokości mniej więcej 1 cm, długość obojętna, królik sobie poradzi. Początkowo uszak nie będzie umiał chwycić siana, ale po kilku dniach nauczy się, a i ząbki będą stopniowo odrastać. Należy skontrolować u weterynarza czy zdrowe zęby nie przerosły za bardzo, może się tak zdarzyć ponieważ królik je bardziej rozdrobnione pożywienie."));
			
			diseaseService.create(new Disease(13L, "Cukrzyca", "To bardzo rzadka i mało znana choroba królików, w naturze prawie nie występuje ponieważ dzikie króliki potrafią same kontrolować z pobieranym pokarmem poziom cukru.</br>" + 
					"  </br>" + 
					"Najczęstszą przyczyna cukrzycy jest:</br>" + 
					"- choroba trzustki,</br>" + 
					"- stres</br>" + 
					"- otyłość i mało ruchu</br>" + 
					"- nieprawidłowe żywienie</br>" + 
					"- skutek uboczny przejmowania lekarstw</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- duże pragnienie, chciwe picie</br>" + 
					"- wahania wagi</br>" + 
					"- chciwe jedzenie</br>" + 
					"- słabsza odporność, częste zachorowania</br>" + 
					"- mgiełka na oczach, zaćma</br>" + 
					"- nadmierne siusianie lub niekontrolowane siusianie</br>" + 
					"- zmęczenie, częste spanie</br>" + 
					"- śpiączka</br>" + 
					"- drgawki</br>" + 
					"- szok</br>" + 
					" </br>" + 
					"Diagnozę lekarz postawi na podstawie badan krwi. Poziom cukru zdrowego królika może się wahać pomiędzy 64, a 134 mg/dl ( 3,55 - 7,44 mmol/l ). Poprzez medykamenty także homeopatyczne i skorygowanie żywienia można wyrównać poziom cukru. W cięższych przypadkach cukrzycy konieczne jest podawanie insuliny. Podaje się ją zwykle 1-3 razy dziennie, wcześniej należy zrobić badanie krwi, aby ustalić poziom stężenia glukozy we krwi i dobrać odpowiednia dawkę leku. Badanie przeprowadzamy glukometrem dostępnym w aptece. Krew najłatwiej pobrać z ucha, jeśli żyły nie są dobrze widoczne należy lekko rozmasować ucho. Insulina powinna być przechowywana w lodowce w temperaturze 2°- 8 ° stopni. Źle dobrana dawka insuliny może być przykra w skutkach i być przyczyna:</br>" + 
					"</br>" + 
					"Hypoglikemia (niedocukrzenie)</br>" + 
					"Następuje, jeśli królik dostanie zbyt duża dawkę insuliny. Objawy to drgawki całego ciała, niepokój, niekontrolowane ruchy, nagły głód, śmierć. Królik powinien natychmiast otrzymać roztwór glukozy w zastrzyku lub doustnie.</br>" + 
					"  </br>" + 
					"Hiperglikemia</br>" + 
					"Jest to zbyt wysoki poziom cukru we krwi. Objawy to pragnienie, zmęczenie, problemy z utrzymaniem równowagi w najgorszym wypadku śpiączka. Trzeba natychmiast zareagować i podać królikowi insulinę.</br>" + 
					"</br>" + 
					"Zdrowe odżywianie, czyli co służy \"słodkim\" królikom:</br>" + 
					"- zielenina i warzywa</br>" + 
					"- siano, zioła, trawa</br>" + 
					"- owoce (kwaśne jabłka) rzadko od czasu do czasu orzech lub migdał w nagrodę</br>" + 
					"- płatki owsiane i chleb pełnoziarnisty (rzadko)</br>" + 
					"</br>" + 
					"</br>" + 
					"Czego \"słodkie\" uszaki nie powinny jeść:</br>" + 
					"- owoce: banany, winogrona, melony, gruszki, czereśnie, mirabelki, suszone owoce są tabu</br>" + 
					"- mieszanki i granulaty zawierają zbyt dużo cukru i skrobi</br>" + 
					"- przysmaki typu kolby i dropsy, miód</br>" + 
					"</br>" + 
					"Zapewnijmy królikowi dużo ruchu, ruch sprzyja nam w walce z cukrzyca i pozwala na zachowanie super kondycji naszego futrzaczka."));
			
			diseaseService.create(new Disease(13L, "Padaczka (epilepsja)", "Niestety na temat tej choroby nie ma zbyt dużo informacji. Być może jedną z przyczyn występowania ataków jest wada serca, zbyt małe serce, które nie jest w stanie doprowadzić do wszystkich organów wystarczającą ilość tlenu. Królik wiedeński biały zapada częściej na epilepsje niż inne rasy.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"- silne drgawki tylnych skoków</br>" + 
					"- drgawki całego ciała</br>" + 
					"- wywrócenie oczu</br>" + 
					"- otwarty szeroko pyszczek ze spływającą śliną</br>" + 
					"- prężenie ciała</br>" + 
					"- niekontrolowane wydalanie moczu i kału</br>" + 
					"- nieprzytomność</br>" + 
					"</br>" + 
					"Nie wszystkie te objawy muszą występować naraz, może to być kilkusekundowe drżenie całego ciała lub tylnich kończyn. Należy jak najszybciej pójść z królikiem do weterynarza. Kompletne badanie krwi, EKG, USG serca i RTG pomoże ustalić lub wykluczyć przyczynę ataków np. guza mózgu, wadę serca, cukrzyce. Z pomocą lekarstw można ograniczyć ataki, królik ma szanse na długie i szczęśliwe życie.</br>" + 
					" </br>" + 
					"Jak się zachować w czasie ataku:</br>" + 
					"- należy usunąć wszystkie twarde czy niebezpieczne przedmioty, o które królik mógłby się uderzyć</br>" + 
					"- należy wyłączyć radio i telewizje,</br>" + 
					"- przygasić światło, jeśli świeci słońce zasłonić okno zasłonką bądź roletą</br>" + 
					"- zachowywać się cicho, cicho mówić do zwierzaka</br>" + 
					"- w żadnym wypadku nie brać go na ręce</br>" + 
					" </br>" + 
					"Po ataku królik czuje się jak gdyby nic się nie stało, wraca do swoich zajęć, ma apetyt. Po silnym ataku uszak może być zmęczony. Drgawki trwają mniej więcej do 30 sek."));
			
			diseaseService.create(new Disease(13L, "Udar słoneczny", "Króliki źle znoszą upały, nie umieją się pocić, ciepło regulują przez dobrze ukrwione uszy. W naturze żyją w norkach o długich korytarzach, na żer wychodzą wieczorem i rano kiedy nie jest już tak gorąco.</br>" + 
					" </br>" + 
					"Jak możemy pomoc królikowi w gorące dni:</br>" + 
					"- w żadnym wypadku klatka bądź zagródkę nie może być wystawiona na słońce</br>" + 
					"- zwykle klatki sklepowe nie nadają się na balkon</br>" + 
					"- nie wystawiajmy uszaka w południe na balkon bądź do ogródka, późne południe i wieczór to przyjemniejsza dla królika pora</br>" + 
					"- mieszkanie i pokój powinno być dobrze przewietrzone</br>" + 
					"- króliki o długim futerku można ostrzyc, to wielka ulga dla królika</br>" + 
					"- w klatce i zagródce możemy powiesić zamrożone wkłady do przenośnych lodówek bądź butelki z wodą owinięte w ręcznik.</br>" + 
					"Ja zamrożone wkłady wkładam pod duży talerz na pizze, owijam w kocyk i daje na balkon, uszaki chętnie się kładą na takim posłaniu.</br>" + 
					"- w zagródce lub klatce można położyć kilka zwykłych kafelków, bądź jeden duży</br>" + 
					"- kuweta z piaskiem (można go lekko spryskać woda) przyjemnie chłodzi</br>" + 
					"- powieszone mokre ręczniki na klatce bądź zagródce nawilżają, dają cień i chłodzą powietrze</br>" + 
					"- wiatrak w pomieszczeniu (nie kierujmy go bezpośrednio na królika) każdy zna zalety tego urządzenia</br>" + 
					"- woda do picia powinna być zawsze dostępna</br>" + 
					"- jedzenie podajemy rano i wieczorem, w ciągu dnia tylko małe porcje</br>" + 
					"- wizyty u weterynarza lub transport powinny się odbywać wczesnym rankiem lub późnym popołudniem</br>" + 
					"- klimatyzacja w aucie nie powinna być nastawiona na zbyt zimna temperaturę uszak mógłby się przeziębić</br>" + 
					"- pamiętajmy, że \"słońce\" się przemieszcza i rano klatka może stać w cieniu, ale kilka godzin później może stać już w pełnym słońcu.</br>" + 
					"</br>" + 
					"Objawy udaru:</br>" + 
					"- szybki oddech</br>" + 
					"- szybki puls</br>" + 
					"- brak reakcji \"nieobecność\" królika</br>" + 
					"- uszak leży na boku i drży</br>" + 
					" </br>" + 
					"Natychmiast należy zabrać królika do chłodniejszego pomieszczenia. Podajmy mu wodę do picia. Chłodnym (nie zimnym jak lód!), wilgotnym ręcznikiem chłodzimy najpierw głowę i uszy królika zaraz potem stopy. Bierzemy uszaka i jedziemy do weterynarza. Lekarz ustabilizuje układ krążenia królika. Jeśli z jakiegoś powodu nie możemy jechać do weterynarza, udar może się skończyć śmiercią.</br>" + 
					"</br>" + 
					"Uwaga: nigdy nie wkładamy królika do zimnej wody może to doprowadzić do szoku termicznego !!! </br>" + 
					""));
			
			diseaseService.create(new Disease(13L, "Dokarmianie", "Chory królik tak samo jak i chory człowiek nie ma specjalnie ochoty na jedzenie. Układ pokarmowy królika jest dosyć skomplikowany, dłuższe przerwy w jedzeniu mogą się skończyć zaparciami, wzdęciem, krwawieniami żołądka, otłuszczeniem wątroby, anoreksją i śmiercią zwierzaka. Nie możemy dopuścić, żeby uszak głodował, musimy sami go dokarmiać i dopajać strzykawka (bez igły) lub z pomocą łyżeczki. Rozgrzanym drutem można trochę powiększyć otwór w strzykawce. Dokarmiamy wsuwając koniec strzykawki z boku pyszczka, zaraz za siekaczami.</br>" + 
					" </br>" + 
					" Najlepsze produkty do dokarmiania to gotowe wysoko włókniste preparaty, które w swoim składzie zawierają oprócz ziół niezbędne witaminy, minerały i probiotyki. Najbardziej znane to Critical Care, Herbi Care Plus, Rodi Care i Dental Aid Herbi. Proszek miesza się z wodą wg przepisu na opakowaniu, uzyskana papka jest na tyle rzadka, że można ją bez problemu podać przez strzykawkę. Króliki zwykle chętnie ją jedzą. Można też odmierzoną ilość podać w miseczce jeśli uszak sam chce jeść, a ma np. kłopoty z ząbkami. Jedzenie podajemy co trzy godziny, wielkość posiłku to mniej więcej 1-2 łyżeczki. Potrawy powinny być letnie lub o temperaturze pokojowej.</br>" + 
					" </br>" + 
					"Papki robione samemu:</br>" + 
					"1. W herbatce ziołowej moczymy granulat do którego nasz królik jest przyzwyczajony, możemy dodać zmielone w młynku suszone warzywa i owoce. Powstałą papką napełniamy strzykawkę, podajemy uszakowi.</br>" + 
					"</br>" + 
					"2. Seler, marchewkę i jabłko (banan) pokroić w kostkę i ugotować, miękkie zmiksować i ostudzić. Puree podać uszakowi. Warzywa można dowolnie zmieniać, można dodać suszony koperek bądź natkę.</br>" + 
					"</br>" + 
					"3. Jako urozmaicenie diety chorego malucha możemy użyć warzywnych (bezmięsnych) zupek dla niemowląt. Siano kroimy na małe kawałeczki, mielimy w młynku i mieszamy z zupka.</br>" + 
					"</br>" + 
					"4. Suszone lub świeże zioła mielimy dodajemy do zupki lub marchewki dla niemowląt.</br>" + 
					" </br>" + 
					"Dwa razy dziennie do papki zrobionej przez nas dodajemy probiotyk np. Lakcid lub Omniflora N pół kapsułki rano i pół wieczorem. Probiotyk utrzyma środowisko bakteriologiczne układu pokarmowego w równowadze, która może być zachwiana po chorobie i w wyniku zmienionej diety/dokarmiania, rzadszych posiłków.</br>" + 
					" </br>" + 
					"Uszakom, które mają problemy z gryzieniem, ale mogą jeść i chętnie same jedzą ścieramy warzywa na tarce o grubych oczkach. Miękkie części roślin wystarczy pokroić na mniejsze kawałki. Dobrym ułatwieniem jest pokrojenie pokarmu w centymetrowe paseczki.</br>" + 
					"</br>" + 
					"Zwierzakom wychudzonym podajemy zwiększoną ilość warzyw korzeniowych, możemy od czasu do czasu podać gotowanego ziemniaka z odrobina płatków owsianych."));
			
			diseaseService.create(new Disease(13L, "Mykotoksyny", "Mykotoksyny są truciznami, które degradują organizm, w którym się znajdują. Trucizna ta znajduje się na pożywieniu nawet gdy już nie ma na niej pleśni. Mykotoksyny, są komórkobójcze, to znaczy że niszczą błony i struktury komórkowe, utleniają białko z organizmu jak również spowalniają syntezę.</br>" + 
					" </br>" + 
					"Powinniśmy zwrócić szczególną uwagę na pożywienie, czy nie jest zapleśniałe. Pod żadnym warunkiem nie podawajmy żywności, u której podejrzewamy chociażby zalążki pleśni, pleśń może powodować szereg poważnych chorób, które bez szybkiej reakcji mogą okazać się śmiertelne.</br>" + 
					" </br>" + 
					"Pleśń powstaje przy zmianach temperatur, szczególnie jest na nie narażona żywność w czasie zimy, gdy kupujmy np. siano na bazarach. Spleśniałe pożywienie wydziela trucizny, nazywane mykotoksyny.</br>" + 
					"</br>" + 
					"Pleśń na pożywieniu osiąga rożne barwy/ kolory, powinniśmy zwrócić szczególną uwagę na barwę: żółtą, żółto-zieloną, brązową, czarną, białą i różową, na pożywieniach, na których ten kolor nie powinien być spotykany.</br>" + 
					"</br>" + 
					"Obecność trucizny w organizmie w początkowej jej fazie jest praktycznie niezauważalna, a gdy jej objawy są widoczne, organizm w którym się znajdują jest już zazwyczaj bardzo wyniszczony, że jego leczenie jest nadzwyczaj trudne, lub praktycznie niemożliwe, co kończy się śmiercią.</br>" + 
					"</br>" + 
					"Najczęstszymi powodami powstawania mykotoksyn jest niewłaściwe przechowywanie żywności, tj. trzymanie siana w szczelnie zamkniętych plastikowych workach, zbieranie traw w zabrudzonych miejscach. Niewłaściwe składowanie pasz i granulatów.</br>" + 
					"</br>" + 
					"Objawy spowodowane przez Mykotoksyny, są różnorodne i zazwyczaj bardzo podobne do innych chorób, dlatego poprawna ich diagnoza jest bardzo trudna.</br>" + 
					"</br>" + 
					"Mykotoksyny mogą powodować:</br>" + 
					"- Problemy gastryczne (zator, wzdęcia, krwotoki jelitowe)</br>" + 
					"- Wrzody żołądka,</br>" + 
					"- Uszkodzenie nerek</br>" + 
					"- Problemy wątrobowe</br>" + 
					"- Uszkodzenie centralnego układu nerwowego (drgawki, chwilowy paraliż)</br>" + 
					"- Osłabienie układu odpornościowego (częste zapadanie na inne choroby, podatność na różnego rodzaju inne wirusy).</br>" + 
					"- Raka,</br>" + 
					"- Problemy z oczami,</br>" + 
					"- Problemy z płucami,</br>" + 
					"- Osłabienie możliwości reprodukcyjnych,</br>" + 
					"- Problemy płucne,</br>" + 
					"- Problemy sercowe,</br>" + 
					"- Problemy skórne,</br>" + 
					"- Uszkodzenie kości,</br>" + 
					"- Uszkodzenie układów naczyniowych. </br>" + 
					"</br>" + 
					"Właśnie z wyżej wymienionych powodów tak trudno jest zdiagnozować istnienie mykotoksyn w organizmie, jedynym pewnym sposobem są badania toksykologiczne.</br>" + 
					"</br>" + 
					"Nie będę podawać objawów jakie występują przy obecności tej trucizny, powodem jest że te objawy można przypisać szeregowi innych chorób, stąd niezbędna jest wizyta u weterynarza, który powinien przeprowadzić bardzo szczegółowe badania, wraz z wywiadem, co królik ostatnio jadał itp.</br>" + 
					"</br>" + 
					"Przy dobrej diagnozie pomocne może się okazać badanie pożywienia.</br>" + 
					"</br>" + 
					"Jak my możemy zminimalizować obecność mykotoksyn w pożywieniu królika?</br>" + 
					"- Nie karmmy królików starą i wilgotną żywnością,</br>" + 
					"- Zapewnijmy stały dostęp do świeżego siana i wody,</br>" + 
					"- Kupujmy dobre jakościowo karmy ze sprawdzonych źródeł.</br>" + 
					"- Nie zbierajmy traw i siana w miejscach zanieczyszczonych (np. przez samochody, lub obecność zakładów przemysłowych),</br>" + 
					"- Zwracajmy uwagę na jakość siana, szczególnie w porach zimowych.</br>" + 
					"</br>" + 
					"Nie podawajmy suchego pieczywa, ponieważ często znajdują się w nim zarodniki pleśni mimo, że gołym okiem ich nie widać.</br>" + 
					"</br>" + 
					"Niektóre pleśnie np. z rodzaju Fusarium atakują zboże: pszenice, jęczmień, kukurydze już w okresie wzrostu. Chratoksyny powstają podczas składowania i przechowywania produktów, a alfatoksyny powstają w klimacie tropikalnym i są do nas sprowadzane np. z wiórkami kokosowymi, fistaszkami, migdałami w zbożu."));
			
			diseaseService.create(new Disease(14L, "Apteczka", "Lakcid - probiotyk, stosuje się w czasie i po antybiotykoterapii, przy biegunkach , profilaktycznie dla utrzymania prawidłowego składu mikroflory jelitowej. Jedną kapsułkę dziennie, można ją podzielić i podać po pół rano i wieczorem. Inne probiotyki to Perenterol i Omniflora N</br>" + 
					"</br>" + 
					"Echinacea (jeżówka purpurowa) - Pobudza układ odpornościowy, pomocna przy chorobach układu oddechowego, katarku - kilka listków suszonej jeżówki dziennie lub w kroplach 1-2 krople dziennie</br>" + 
					"</br>" + 
					"Espumisan - łagodzi wzdęcia, podajemy: pół kapsułki dwa razy dziennie, w kroplach 1ml co 6 godz.</br>" + 
					"</br>" + 
					"Koper i herbatka koperkowa - poprawia apetyt, działa rozkurczowo, pomocny podczas nieżytu żołądka.</br>" + 
					" </br>" + 
					"Krople Bacha Rescue - łagodzą stres np. podczas wizyty u weterynarza lub transportu, w okresie zaprzyjaźniania. Podajemy po trzy krople, trzy razy dziennie, podając bezpośrednio do pyszczka musimy kropelki rozcieńczyć w wodzie lub soku, ponieważ są na alkoholu. Możemy je podać np. na kawałeczku jabłka lub w ostateczności kropelki wetrzeć w uszy królika.</br>" + 
					" </br>" + 
					"Suszone jagody lub herbatka z suszonych jagód - hamuje rozwolnienie.</br>" + 
					"</br>" + 
					"Mięta i herbatka z mięty - poprawia apetyt, wzmacnia, zapobiega wzdęciom (hamuje wydzielanie mleka, nie dajemy mamom karmiącym).</br>" + 
					" </br>" + 
					"Maść Bepanthen - uszkodzenia i otarcia naskórka, ugryzienia, rany i odgniotki na stopach</br>" + 
					" </br>" + 
					"Nagietek i herbatka z nagietka - działa przeciwzapalnie, przeciwskurczowo, oczyszczająco i poprawia apetyt. Stosuje się przy nieżytach żołądka.</br>" + 
					" </br>" + 
					"Parafina ciekła - powleka błonę śluzową jelit, co powoduje rozmiękczenie mas kałowych i ułatwia wypróżnienie, podczas zaparć, profilaktycznie kropelkę dziennie podczas linienia (połączone bobki - koraliki), co trzy godz. jeśli królik ma zaparcie: W ostateczności można zastosować olej słonecznikowy bądź rzepakowy.</br>" + 
					" </br>" + 
					"Pasta odkłaczająca - rozpuszcza zalęgające włosy, w okresie linienia profilaktycznie 1 cm pasty dziennie.</br>" + 
					"</br>" + 
					"Rumianek (herbatka) - działa przeciwzapalnie, przeciwskurczowo, uspokajająco, przeciwbakteryjnie i dezynfekująco. Stosujemy podczas nieżytów żołądka.</br>" + 
					"</br>" + 
					"Siemie lniane - wywar z gotowanego siemienia lnianego stosuje się w przypadku zaparć, łyżeczkę siemienia zalewamy pół szklanki wody gotujemy aż powstanie \"kisiel\", studzimy i podajemy sam wywar (bez ziaren).</br>" + 
					"</br>" + 
					"Świetlik - herbatkę stosuje się do przemywania podrażnionych oczu</br>" + 
					" </br>" + 
					"Tymianek - działa przeciwzapalnie, wykrztuśnie, rozrzedza wydzielinę, wzmacnia odporność, dezynfekuje - stosuje się w chorobach układu oddechowego (inhalacje, herbatka do picia)</br>" + 
					" </br>" + 
					"Vibowit - (witaminy w kroplach dla niemowląt), dla zwierząt osłabionych, dostarcza witamin, wzmacnia odporność zwłaszcza w zimowe i jesienne dni.</br>" + 
					"</br>" + 
					"Critical care/ Herbi Care Plus - gotowy preparat do dokarmiania królików w czasie choroby, wysoko włóknisty, bogaty w witaminy. i elektrolity, dba o florę bakteryjna jelit i uzupełnia minerały.</br>" + 
					" </br>" + 
					"Sól fizjologiczna- płyn nawadniający  stosowany w medycynie. Można nim przemywać oczy królika oraz wszelkie rany, nawet pokryte strupami.</br>" + 
					"</br>" + 
					"Szałwia - zapobiega infekcjom, dezynfekuje, hamuje rozwolnienie, działa bakteriobójczo i wspomaga trawienie, hamuje wydzielanie mleka. Podawana codziennie ( 2-3 listki ) zapobiega ciążą urojonym i łagodzi ruje.</br>" + 
					"</br>" + 
					"Inne:</br>" + 
					"Strzykawka do dokarmiania</br>" + 
					"Nożyczki do obcinania paznokci</br>" + 
					"Termometr</br>" + 
					"Termofor"));
			
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
			
			careService.create(new Care(1L, "Oswajanie królika", "Zanim rozpoczniemy proces oswajania, pozwólmy królikowi zapoznać się z klatką i nowym otoczeniem. Pozwólmy mu odpocząć i poczuć się bezpiecznie w nowym domu. Może się zdarzyć, że królik sam po dwóch dniach zacznie wykazywać zainteresowanie światem poza klatką oraz naszą osoba. Najlepszym patentem na oswajanie jest, usiąść razem z królikiem na podłodze, aby mieć lepszy kontakt. Należy dużo mówić do królika aby przyzwyczaił się do naszego głosu. Często po glosie i jego tonacji królik wie, że coś jest dobre, a czegoś nie wolno mu robić. Króliki są bardzo ciekawskie, więc prawdopodobnie ciekawość przezwycięży strach i uszaty szybciutko zacznie ocierać bródką wszystkie zakamarki domu, łącznie z opiekunem. W ten sposób pozostawia swój zapach, który daje mu poczucie bezpieczeństwa. Nie należy królika do niczego zmuszać. Stopniowo możemy głaskać pupila za uszkami i poczęstować rodzynka, aby uszaty dostrzegł, że ma w nas przyjaciela. Wszystko zależy od królika i jego charakteru. Zawsze potrzebna jest cierpliwość, i nic nie robimy na siłę!!! Króliki nie lubią brania na ręce, prawdopodobnie z natury kojarzy się im to z niebezpieczeństwem. Ale kiedy obdarzą opiekuna zaufaniem, strach ten zmaleje. Należy prawidłowo podnosić królika, biorąc go na ręce aby nie zrobić mu krzywdy (patrz podnoszenie królika)"));
			
			careService.create(new Care(2L, "Zrozumieć królika, czyli królicza mowa", "Dźwięki</br>" + 
					"</br>" + 
					"</br>" + 
					"Popiskiwanie - tak maluchy wzywają swoja mamę, starsze króliki piszczą kiedy się czegoś boją. </br>" + 
					"</br>" + 
					"Warczenie i prychanie - jest to dźwięk ostrzegawczy, jeśli go zignorujemy królik pomoże sobie ząbkami.</br>" + 
					"</br>" + 
					"Bzyczenie i ósemki wokół nóg - to oznaka pobudzenia seksualnego, z braku partnera króliki często znajdują sobie zastępczy obiekt seksualny mianowicie kończyny opiekuna.</br>" + 
					"</br>" + 
					"Mielenie ząbkami - najczęściej królik robi tak gdy go głaszczemy lub gdy drzemie, to znak błogostanu coś jak mruczenie kota.</br>" + 
					"</br>" + 
					"Szczekanie zębami - oznaka bólu, królik siedzi skulony, ma brzydką sierść, widać, że cierpi, trzeba natychmiast udać się z nim do weterynarza.</br>" + 
					"</br>" + 
					"Krzyk - podobny do krzyku dziecka, jest wydawany tuż przed śmiercią, może być też oznaka przerażenia lub bólu. Raz usłyszany na długo pozostaje w pamięci.</br>" + 
					"</br>" + 
					"</br>" + 
					"</br>" + 
					"Mowa ciała</br>" + 
					"</br>" + 
					"</br>" + 
					"Tupanie - to ostrzeżenie, królik się boi, tupiąc ostrzega nas przed niebezpieczeństwem. Może też być oznaka niezadowolenia. Uwaga tupanie może być oznaka silnego bólu brzucha spowodowanego wzdęciami. Należy szybko udać się z królikiem do weterynarza.</br>" + 
					"</br>" + 
					"Dzikie skoki - z obrotami w powietrzu, wyrzucaniem nóg na boki, piruetami i potrząsaniem łebka, to oznaka radości i szczęścia, zwana przez nas głupawką.</br>" + 
					"</br>" + 
					"Przesuwanie i rzucanie przedmiotami - to jedna z zabaw króliczych, doskonale nadają się do tego rolki po papierze toaletowym, wiklinowe kule lub kula smakula, z braku zabawek królik może rzucać miseczkami lub co gorsza kuweta.</br>" + 
					"</br>" + 
					"Kopanie - to wrodzona potrzeba królika, w naturze króliki spędzają dużo czasu na kopaniu, przekopywaniu, sprzątaniu i poszerzaniu tuneli. W mieszkaniu nie mają tej możliwości często więc wyszukują sobie coś w zastępstwie, kopią w rogu klatki i w pościeli, przekopują nasze ubrania,</br>" + 
					"ręcznik, dywanik, róg kanapy itd. Należy umożliwić królikowi kopanie, sprawi mu to ogromną frajdę, można umieścić w kartonie ścinki papieru lub napełnić kuwetę piaskiem, można położyć w klatce ręcznik, królik będzie go układał, przesuwał i przekładał.</br>" + 
					"</br>" + 
					"Wąchanie - czasami jest to zwykła ciekawość \"co masz?\", nosek jest barometrem królika, im szybciej drga tym większe jest podenerwowanie i stres, można to zaobserwować np. u weterynarza. Szybki oddech i drganie noska w upały może wskazywać na udar .</br>" + 
					"</br>" + 
					"Ucieczka - dobrze widoczna biel spodnia ogonka jest ostrzeżeniem dla innych \"kryć się, niebezpieczeństwo\", zostawmy uszaka w spokoju, niech się uspokoi i sam do nas wyjdzie.</br>" + 
					"</br>" + 
					"Ogonek poruszający się szybko w prawo i lewo - jest oznaka dezaprobaty lub zniecierpliwienia \" no pokaż co przyniosłaś, schyl się\".</br>" + 
					"</br>" + 
					"Trącanie noskiem – \"cześć\", \"pobawimy się\" \"czas na pieszczoty\".</br>" + 
					"</br>" + 
					"Energiczne trącanie pyszczkiem - \"dosyć głaskania\" lub \" posuń się\", jeśli zignorujemy to upomnienie ząbki lub pazurki pójdą w ruch.</br>" + 
					"</br>" + 
					"Lizanie - to oznaka wielkiej sympatii, tak miedzy sobą uszaki wymieniają pieszczoty, liżą sobie oczka, pyszczek, nosek i uszka.</br>" + 
					"</br>" + 
					"Mycie - króliki spędzają dużo czasu na pielęgnacji swojego futerka. Wzajemne mycie się służy wzmacnianiu więzi pomiędzy uszakami i sprawia im wiele przyjemności.</br>" + 
					"</br>" + 
					"Ujeżdżanie - nie tylko świadczy o gotowości do seksu, to także oznaka dominacji. Wyżej rangą króliki skaczą na te niżej stojące w hierarchii, jest to umacnianie pozycji lub przywoływanie do porządku.</br>" + 
					"</br>" + 
					"Wyrywanie sierści - samiczki w ciąży i w ciąży urojonej wyrywają sobie sierść z przednich łapek i brzucha i wyściełają nią gniazdko. Królice mogą być w tym czasie agresywne, niespokojne i nie mięć apetytu, także kopanie jest bardziej intensywne.</br>" + 
					"</br>" + 
					"Rzucanie się na bok - najczęściej po dobrej zabawie królik rzuca się ostentacyjnie na bok tam gdzie akurat stoi, oczka opadają uszak zasypia. Wielu opiekunów widząc takie zachowanie boi się, że królik strącił przytomność lub, że ma chore serce, nic podobnego, wszystko w najlepszym porządku, uszak się zmęczył i ma ochotę na drzemkę. Po wysiłku można zauważyć szybkie drganie główki i brzuszka to też normalne, uszak się zziajał, czas na relaksujący sen.</br>" + 
					"</br>" + 
					"Przewracanie na plecki - pełny relaks, moje tak robią w piaskownicy, przewracają się z jednego boku na drugi, łapy w górze, \"ach jak wspaniale\".</br>" + 
					"</br>" + 
					"Przestraszony królik - taki który nie miał szans uciec przywiera płasko do ziemi, oczy ma szeroko otwarte, szybki oddech, uszy położone na ciele, nie rusza się. Wiele drapieżników reaguje na ruch, skamieniały królik ma szanse, ze wróg go nie zauważy.</br>" + 
					"</br>" + 
					"Jeśli zauważymy, że nasz królik też się tak zachowuje zostawmy go w spokoju, uciekając w panice może zrobić sobie krzywdę.</br>" + 
					"</br>" + 
					"Pozycja ostrzegawcza - uszy na plecach, głowa nisko, ciało napięte, omyk w górze, atak może być poprzedzony warknięciem, lepiej zejdźmy uszakowi z drogi.</br>" + 
					"</br>" + 
					"Pozycja poddańcza - głowa nisko, ciałko skulone, uszy po sobie, tak królik pokazuje, że jest niżej w hierarchii.</br>" + 
					"</br>" + 
					"Słupek - w tej pozycji królik widzi co się dzieje na dalszą odległość , może tez wyłowić więcej zapachów i dźwięków, domowe króliki nauczyły się w ten sposób prosić. </br>" + 
					"</br>" + 
					"Ciekawość - ciało, pyszczek i uszy skierowane do przodu, nosek szybko się porusza, jeśli uszak chce zobaczyć nieznany przedmiot lub nowego towarzysza porusza się powoli na sztywnych łapach w kierunku obiektu, napięte ciałko jest gotowe do ucieczki.</br>" + 
					"</br>" + 
					"Podkładanie lepka pod rękę lub łepek partnera - czas na pieszczoty, pogłaszcz mnie, umyj mnie.</br>" + 
					"</br>" + 
					"Gryzienie klatki - królik jest samotny i się nudzi, chce do swojego opiekuna, chce się bawić, biegać, skakać, wypuuuusccie mniee !!! Króliki szybko się uczą, ze hałas przyciąga uwagę opiekuna, doskonale wiedzą, które druty poruszyć żeby było jak najgłośniej, niektóre pomagają sobie</br>" + 
					"miska, uderzając nią o kraty. Każda klatka to wiezienie dla królika, nie skazujmy go na nią, jest przecież naszym przyjacielem.</br>" + 
					"</br>" + 
					"</br>" + 
					"</br>" + 
					"Znaczenie </br>" + 
					"</br>" + 
					"</br>" + 
					"Brodkowanie, czyli pocieranie broda przedmiotów - pod broda znajduje się gruczoł zapachowy, pozostawiając zapach na rożnych przedmiotach królik je podpisuje \"to moje\", mój rewir, moje krzesło, moja pani, moja marchewka, brodkujac uszak zapamiętuje też gdzie dany przedmiot stoi,</br>" + 
					"należy o tym pamiętać mając królika niewidomego lub niedowidzącego. Królicze mamy oznaczają w ten sposób swoje młode.</br>" + 
					"</br>" + 
					"Spryskiwanie - to najbardziej denerwujące znaczenie terenu, zaczyna się około 5-6 miesiąca życia, króliki spryskują strumieniem moczu swoje włości, ukochana samiczkę, króliki które niżej stoją w hierarchii, przedmioty, rośliny, pościel itd. Nawet czyste króliki, które do tej pory ładnie korzystały z kuwety podczas zaprzyjaźniania mogą zacząć znaczyć teren i nowego kolegę. Po okresie zaprzyjaźnienia powinno wszystko wrócić do normy. Samiczki mogą znaczyć podczas rui. Spryskiwanie może być tez kara za coś co się królikowi nie spodobało.</br>" + 
					"</br>" + 
					"Bobki - większa cześć bobków wpada do kuwety, ale niektóre są celowo pozostawiane na podłodze, śluza one oczywiście do oznaczenia terenu, jest to znak dla obcego królika \"wstęp wzbroniony, teren zamieszkany\". Króliki w okresie dojrzewania, w okresie rui i zaprzyjaźniania zostawiają więcej takich \"pachnących\" niespodzianek, perfumowanych dodatkowo wydzielina z gruczołów zapachowych wokół odbytu. Po tym zapachu inne króliki mogą odczytać płeć właściciela bobków, wiek, przynależność do grupy i w przypadku samic czy maja młode czy nie.</br>" + 
					"</br>" + 
					"</br>" + 
					"</br>" + 
					"Jak króliki śpią (na wesoło)</br>" + 
					"</br>" + 
					"</br>" + 
					"Na kurkę - króliki, które nie są jeszcze oswojone często śpią w ten sposób, także uszaki chore lub takie, które maja ochotę na krótką drzemkę. Wbrew pozorom nos i uszy są nastawione na odbiór.</br>" + 
					"</br>" + 
					"Na boczku - relaksująca drzemka, jedna z ulubionych pozycji królika, uszy czuwają, zaniepokojony królik szybko stanie na nogi.</br>" + 
					"</br>" + 
					"Na pieska - łepek oparty na łapkach, pełny relaks, odpływamy</br>" + 
					"</br>" + 
					"Na żabę - to też drzemka z łapkami wyrzuconymi do tylu, trochę śpimy, trochę czuwamy</br>" + 
					"</br>" + 
					"Na zdechlaczka - królik wie, że nic mu nie grozi, śpi twardo z odsłoniętym brzuszkiem, zawsze mnie rozbraja ta pozycja</br>" + 
					"</br>" + 
					"Sen zbiorowy, czyli wszyscy na kupie - tak najbezpieczniej i najprzyjemniej. "));
			
			careService.create(new Care(3L, "Obcinanie pazurów", "To jeden z podstawowych zabiegów pielęgnacyjnych u królików. W naturze, króliki ścierają pazury poruszając się po twardych powierzchniach, niestety króliki miniaturowe (udomowione) nie mają ku temu zbyt wielu okazji. Przerośnięte pazurki wykrzywiają się  stanowiąc zagrożenie i sprawiają ból królikowi, a co za tym idzie zmniejsza się jego aktywność ruchowa i uszatek staje się osowiały.</br>" + 
					"O obcięcie pazurków można poprosić weterynarza, który z racji wykonywanego zawodu wie doskonale jak taki zabieg przeprowadzić. Można oczywiście wykonać to samemu w domu, ale musimy pamiętać o kilku ważnych zasadach.</br>" + 
					"Należy posiadać odpowiednie do tej czynności cążki lub nożyczki. Obecnie każdy dobry sklep zoologiczny posiada w swojej ofercie kilkanaście rodzajów i wielkości cążków, nożyczek, w całkiem przystępnych cenach. A co najważniejsze to odpowiedni sprzęt zmniejsza ryzyko zrobienia krzywdy maluchowi. Cążki przykładamy 3-4mm od części ukrwionej pazurka tzw. miazgi (jest to różowa żyłka, która najlepiej jest widoczna przy pazurkach białych, pozbawionych pigmentu). Gdy mamy do czynienia z ciemną barwą pazurków, i nie bardzo widzimy w którym miejscu zaczyna się cześć ukrwiona możemy podświetlić pazurek latarką. Gdy i to nie daje nam pewności najlepiej obcinać same czubki.</br>" + 
					"Gdyby jednak okazało się, iż mimo ostrożności  przycięliśmy pazur za daleko a co za tym idzie naruszyliśmy miazgę, należy krwawiący pazur przemyć wacikiem z woda utleniona i chwileczkę przytrzymać. Dzięki temu krwawienie powinno szybko ustąpić. OBSERWUJ JAK GOI SIĘ RANA, to bardzo ważne. Króliczek w ramach swoich możliwości będzie sobie wylizywał pazurka co powinno przyśpieszyć gojenie. Jeśli jednak pazurek będzie dalej krwawił, bądź zauważymy iż sprawia ciągły ból NALEŻY NATYCHMIAST UDAC SIĘ DO WETERYNARZA</br>" + 
					"Za ok. 2miesiace od skracania należy ponownie skontrolować, długość. Pazury przednie rosną szybciej niż te z tylnich łapek, więc wymagają częstszego skracania. Uszatki posiadają po 5 pazurów w łapkach przednich i po 4 w tylnich. Pamiętajmy, skracanie pazurów tak dla nas jak i dla królika jest sytuacja stresującą,dlatego Najlepiej wypracować sobie swój własny sposób obcinania, i mieć pod ręka osobę która w razie potrzeby pomoże opanować sytuacje."));
			
			careService.create(new Care(3L, "Wyłamany pazur", "Niestety taka sytuacja może mieć miejsce.</br>" + 
					"Zazwyczaj przyczyny są dwie: przerośnięte pazury lub złe ułożenie łapki podczas skoku. </br>" + 
					"Królik prawdopodobnie nie pozwoli sobie dotknąć pazurka, dlatego iż sprawia mu on ból.</br>" + 
					"Możliwe jest, że uszatek będzie chwilowo utykać i do tego może pojawić się odrobina krwi. Nie panikujmy, to naturalna kolej rzeczy.</br>" + 
					"Co robić:</br>" + 
					"Należy polać pazur choćby na oślep woda utleniona i pozwolić uszatkowi, aby sam sobie wylizywał bolący pazur. W kolejnych dniach wszystko powinno wracać do normy, a wyłamany pazur po pewnym czasie odpadnie a na jego miejsce wyrośnie nowy zupełnie zdrowy. Czas jaki upłynie do momentu kiedy pazur odpadnie jest indywidualny dla każdego królika. Jeśli zauważymy iż przez kolejne dni królik ma problemy z chodzeniem-utyka, należy udać się do weterynarza!!!"));
			
			careService.create(new Care(3L, "Linienie", "Królik linieje 4 razy do roku. Cykl ten może jednak być zaburzony z powodu stałej temperatury jaka panuje w naszych mieszkaniach. Zazwyczaj czas trwania linienia waha się od tygodnia do miesiąca. Ale ostatecznie jest to sprawa indywidualna każdego króliczka. Bardzo ważne jest aby w tym czasie intensywnie wyczesywać uszatka. Oczywiście myje się on sam na bieżąco, ale większa ilość połkniętego futerka, może doprowadzić do niebezpiecznego dla zdrowia zatoru w układzie pokarmowym. Do wyczesywania, powinniśmy zaopatrzyć się w odpowiednią szczotkę bądź grzebień. Obecnie na rynku jest duży wybór. Pamiętajmy jednak aby dana szczotka była funkcjonalna w wyczesywaniu i aby nie kaleczyła skóry. W tym czasie uszatek powinien mieć dużo ruchu, mnóstwo siana, które dba o prawidłowe funkcjonowanie układu pokarmowego. To nie jest również dobry okres aby wprowadzać do diety malucha nowych pokarmów. Nigdy nie mamy pewności jak układ pokarmowy zareaguje na nowy produkt. Obserwujmy nasze pociechy, to najlepszy sposób aby szybko wykryć, że coś jest nie tak. Spadek aktywności, brak bobków, brak apetytu to wystarczające sygnały do niepokoju.</br>" + 
					"W czasie linienia można podawać specjalną pastę dostępna w sklepach zoologicznych.</br>" + 
					"Pasta ta ma na celu rozpuszczanie zalegającej w układzie pokarmowym sierści. Można również podać, świeżo wyciśnięty sok z ananasa, który zawiera enzymy rozpuszczające sierść, bądź pól kiwi dwa razy w tygodniu lub plasterek dziennie."));
			
			careService.create(new Care(3L, "Czyszczenie futerka", "Królik myje się sam. Może się zdarzyć, iż od biegunki ma brudny kuperek, wtedy wilgotną ściereczką należy przetrzeć kilkakrotnie futerko. NIE KĄPIEMY KRÓLIKA wyjątkiem są kąpiele lecznicze przy chorobach skóry zalecone przez weterynarza, bądź w skrajnym przypadku przy bardzo silnej i długotrwałej biegunce.</br>" + 
					"Musimy uważać aby nie zamoczyć głowy króliczka, oraz pamiętać aby po kąpieli dobrze wytrzeć malucha i zapewnić mu przebywanie w ciepłym pomieszczeniu, pozbawionym przeciągów.</br>" + 
					"Zawsze podczas codziennych pieszczot warto zwrócić uwagę na to czy futerko jest czyste-zwłaszcza kuperek. Ponieważ brudne futerko w okolicach odbytu przyciąga muszki a stąd już tylko kilka kroków do nieszczęścia (czyt. W chorobach-larwy much)."));
			
			careService.create(new Care(3L, "Króliki długowłose", "Chyba nikt nie ma wątpliwości, iż króliki długowłose (zwane angorami) zapierają dech w piersiach. Niestety ogrom zabiegów pielęgnacyjnych również zapiera dech. Obfita bujność futerka dobiegająca do kilkunastu centymetrów nie pozwala na wykonanie wszystkich zabiegów higienicznych samemu królikowi. Dlatego musimy wziąć sprawy w swoje ręce. </br>" + 
					"Oczywiście samo strzyżenie też nie należy do przyjemnych rzeczy ani dla nas, ani dla uszatka..</br>" + 
					"</br>" + 
					"Tak czy inaczej priorytetem jest wyczesywanie. I niestety nie tylko podczas linienia ale systematycznie co dziennie max co dwa dni. Na rynku jest wiele szczotek i grzebieni, u nas świetnie się sprawdza taki z obrotowymi ząbkami, dzięki temu nie ciągnie. Pamiętajmy, że najważniejsze przy wyborze to, aby końce szczotki nie były ostre i nie raniły skory.</br>" + 
					"</br>" + 
					"Są dwa zasadnicze powody dla których wyczesywanie jest tak ważne. Pierwsze to - zapobiega tworzeniu się kołtunów. Kołtuny tworzą się z sfilcowanej sierści, często dochodzą do tego kawałki siana czy ściółki. I kołtun gotowy. Nie należy ich rozczesywać-bo sprawia to uszatkowi duży ból. Najlepiej po prostu próbować wyciąć. Dostępne są również rozcinacze, które bardzo ułatwiają pozbycie się kołtunika. Pamiętajmy jednak, że są one bardzo ostre i musimy używać ich bardzo ostrożnie. Najpierw delikatnie podczas głaskania wyszukujemy palcami kołtun. Delikatnie w środek kołtuna wkładamy rozcinacz i przytrzymując (aby nie sprawiać królikowi bólu) delikatnie rozcinamy. Zazwyczaj taki rozcięty kołtun w dwóch częściach daje się łatwo wyciągnąć. Jeśli sprawa wygląda na bardziej skomplikowaną, a niestety często tak się zdarza, należy rozcięty kołtun na dwie połówki rozciąć ponownie umieszczając rozcinacz w środku każdej z połówek. W skrócie jeden wielki kołtun zostaje rozcięty na cztery małe. Wszystko to wymaga delikatności i dużo cierpliwości. Pamiętajmy, że dla królika też jest to mało komfortowa sytuacja, dlatego nie zmuszajmy go na siłę, aby koniecznie w danym momencie siedział spokojnie. Do takich czynności bardzo dobrze sprawdza się mała ograniczona przestrzeń np.: parapet okienny bądź stolik.</br>" + 
					" </br>" + 
					"Kołtuny należy likwidować jak najszybciej, gdyż mogą powodować odparzany. Najczęściej tworzą się w miejscach najtrudniej dostępnych. Na podbrzuszu, pod szyja, pod ogonem i w okolicach zadku.</br>" + 
					"Zdecydowanie eliminujemy trociny z otoczenia królika.</br>" + 
					"Na rynku jest sporo preparatów, zazwyczaj w spreju bądź proszku, które mają na celu odświeżenie futerka i zapobieganie filcowaniu.</br>" + 
					"</br>" + 
					"Pamiętajmy, że krótka fryzurka dla angory wskazana jest zwłaszcza latem, kiedy to dotykają nas naprawdę wysokie temperatury.</br>" + 
					"</br>" + 
					"Kolejnym i bardzo częstym problemem przy królikach długowłosych jest \"zatykanie\" się. Nasze pociechy podczas codziennej toalety (zwłaszcza w czasie linienia) połykają duże ilości włosów, które bardzo często filcują się w organizmie powodując zatkanie, które, nie leczone prowadzi do śmierci. Pierwszym sygnałem jest widok bobków połączonych ze sobą włoskami tzw. koraliki </br>" + 
					"</br>" + 
					"Wiele osób, w takiej chwili podaje pasty odkłaczające. Na te dolegliwość profilaktyczne można podać dwa razy w tygodniu po połówce owocu kiwi. Kiwi zawiera w swoim soku enzymy, które rozpuszczają w organizmie nagromadzone futro. Kolejnym sposobem jest podanie ciekłej bezzapachowej parafiny. Bezzapachową ciekłą parafinę w strzykawce 2 ml, podajemy co dwie godziny do pyszczka królikowi około 1-2ml (w zależności od wielkości królika) parafiny tylko bardzo powoli, bo niestety jej smak nie należy do najlepszych, a co za tym idzie nasz uszatek będzie się wzbraniał, przed podaniem.. Zdrowe futerko królika lśni, przyjemnie pachnie i jest pozbawione kołtunów."));
			
			careService.create(new Care(3L, "Pasty i dodatki odkłaczające", "Na rynku mamy bardzo dużo produktów wspomagających wydalanie sierści, większość przeznaczona jest dla kotów. Nie wszystkie nadają się dla królików ze względu na dodatek tłuszczu zwierzęcego, produktów pochodzenia zwierzęcego czy cukru.</br>" + 
					"</br>" + 
					"Tłuszcz zawarty w pastach ma za zadanie otoczyć sierść i ułatwić jej wydalenie, zbitej kuli łatwiej jest prześlizgnąć się przez jelita. Papaja zmiękcza sierść. Niestety i tu producenci dodają cukier bądź słód, aby poprawić smak pasty i zachęcić zwierzęta do spożycia produktu.</br>" + 
					"</br>" + 
					"Dodatek cukru narusza równowagę mikroflory jelitowej i może doprowadzić np. do rozwolnienia.</br>" + 
					"</br>" + 
					"Wrażliwe króliki reagują rozwolnieniem, bądź miękkimi kupkami także na dużą zawartość oleju i tłuszczu w paście.</br>" + 
					"</br>" + 
					"</br>" + 
					"Pasta odkłaczająca dla kotów MALT SOFT EXTRA firma Gimpet</br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"Ekstrakt słodu (43%), olej, tłuszcze,produkty roślinne, związek pochodny cukru mlekowego (TGOS 1%) Dostępne w opakowaniach 20 g oraz 220 g. Zawiera przeciwutleniacze. </br>" + 
					"</br>" + 
					"Pasta Malt Soft Extra to produkt o ulepszonej recepturze, która zawiera większą ilość błonnika oraz naturalny słód i olej roślinny. Pasta dodatkowo posiada transgalaktooligosacharyd (TGOS) będący pochodną cukru mlekowego, która ma korzystny wpływ na dobre bakterie przewodu pokarmowego. Wzmacnia ona system immunologiczny oraz poprawia trawienie u kotów.</br>" + 
					"</br>" + 
					"</br>" + 
					"Pasta odkłaczająca dla kotów MALT SOFT firma Gimpet</br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"Ekstrakt słodu - 43%, olej, tłuszcze, produkty roślinne, związek pochodny cukru mlekowego (TGOS 1%). Zawiera przeciwutleniacze. Pasta dostępna jest w opakowaniach: 20 g, 100 g oraz 220 g. Pastę podaje się profilaktycznie w okresie linienia , wielkości groszku raz dziennie.</br>" + 
					"</br>" + 
					"Ze względu na słodki smak obie pasty są bardzo lubiane przez króliki i gryzonie. Nie ma informacji na temat tłuszczu, niewykluczone , ze jest on pochodzenia zwierzęcego,  pasta w końcu przeznaczona jest dla kotów. Mimo tego nie spotkałam się z negatywnymi skutkami stosowania malt soft. Forumowicze piszą, że pasta skutecznie zapobiega odkładaniu się sierści w układzie pokarmowym.</br>" + 
					"</br>" + 
					"</br>" + 
					"BEZO-PET odkłaczająca pasta na bezoary.</br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"Olej sojowy, słód, dekstroza, melasa trzcinowa, olej rybi, Propylenglykol.</br>" + 
					"</br>" + 
					"Jest lubiany przez króliki i dobrze oceniany przez ich opiekunów jednak skład pozostawia dużo do życzenia. Olej rybi, melasa trzcinowa i toksyczny propylenglykol (wywołuje alergie, niszczy nerki i wątrobę), nie powinny być spożywane przez króliki ani inne zwierzęta.</br>" + 
					"</br>" + 
					"</br>" + 
					"CatMalt - Laxacat.</br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"Ekstrakt słodu, , parafina płynna, woda, konserwowane środkiem dopuszczonym przez UE: E216.</br>" + 
					"Analiza składu:</br>" + 
					"białko surowe 2%, tłuszcz surowy 1,4%, włókno surowe 1,0%, popiół surowy 0,5%.</br>" + 
					"Pasta o składzie do zaakceptowania, niestety nie wiem czy smakuje królikom.</br>" + 
					"Będę wdzięczna za opinie na forum lub przesłane na maila miniaturki.</br>" + 
					"</br>" + 
					"</br>" + 
					"Gimborn - przysmak dla gryzoni.</br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"Produkty roślinne (ekstrakt słodu 35,4%, celuloza 10%), oleje i tłuszcze, owoce (Papaja suszona 4%),</br>" + 
					"związek pochodny cukru mlekowego TGOS (1%).</br>" + 
					"Dodatki:</br>" + 
					"BHT (E 321), Guma arabska (E 414, ), Lecytyna( E 322), dwutlenek krzemu ( E 551 b), Celuloza( E 460).</br>" + 
					"</br>" + 
					"Pasta bardzo lubiana przez króliki, skutecznie zapobiega odkładaniu się sierści w układzie pokarmowym. Przeciwutleniacz BHT z Wikipedii: \"Może wywoływać wysypkę, pokrzywkę, rzadko duszność. W wysokim stężeniu wywołuje nowotwory u zwierząt laboratoryjnych\"</br>" + 
					"</br>" + 
					"</br>" + 
					"REMOVER 50G /NTERVET/</br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"Maltodekstryna, lecytyna sojowa, tłuszcze i oleje pochodzenia roślinnego i zwierzęcego, cukry. Substancje dodatkowe w 1 kg:</br>" + 
					"Witamina E - 35mg. Analiza chemiczna: białko surowe - 2%, tłuszcze surowe - 40%, włókno surowe - 0,1%, popiół surowy - 1%</br>" + 
					"Niestety nie nadaje się dla królików ze względu na oleje pochodzenia zwierzęcego i cukry.</br>" + 
					"</br>" + 
					"</br>" + 
					"Red Berry Trixie </br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"70% słód, 12% owoców.</br>" + 
					"Wg informacji producenta usprawnia trawienie i zapobiega tworzeniu się bezoarów,</br>" + 
					"oligodsacharydy pomagają w utrzymaniu prawidłowej flory bakteryjnej jelit.</br>" + 
					"Moim zdaniem jest problematyczna ponieważ składa się głownie z cukru. Wątpię żeby pomagała w usuwaniu włosów. Będę wdzięczna za opinie na temat tej pasty, na forum lub przesłanie jej na maila miniaturki.</br>" + 
					"</br>" + 
					"</br>" + 
					"dr Seidel Malt - pasta odkłaczająca dla kotów 75 ml.</br>" + 
					"</br>" + 
					"Skład:</br>" + 
					"Oleje roślinne (słonecznikowy i rzepakowy), ekstrakt słodowy, krzemionka, hydrolizowane białko zwierzęce.</br>" + 
					"Dodatki: tauryna 0,5% (1 cm pasty zawiera 1,6 mg tauryny).</br>" + 
					"Składniki analityczne: zawartość tłuszczu 53%, białko 4,5%, włókno surowe 2,5%, popiół surowy 11,5%.</br>" + 
					"Składniki aktywne:</br>" + 
					"Oleje roślinne, słód, tauryna.</br>" + 
					"Niestety nie nadaje się dla królików ponieważ zawiera taurynę i białko zwierzęce.</br>" + 
					"</br>" + 
					"</br>" + 
					"Rodikolan</br>" + 
					"</br>" + 
					"Preparat dla gryzoni i królików wspomagający i regulujący zaburzenia procesu trawienia.</br>" + 
					"Oparty jest na naturalnych wyciągach roślinnych.</br>" + 
					"Skład:</br>" + 
					"olej lniany 32%, olej rzepakowy 29,5 %, olej słonecznikowy 10%, olej sojowy 7,5%, ekstrakt z ostu 2,5%,</br>" + 
					"karczoch 2,1%, drożdże 2%, korzeń goryczki 1%, kminek1%, liście mięty pieprzowej 1%,</br>" + 
					"korzeń rabarbaru 1%, kwiat rumianku 1%, korzeń lukrecji 1%, glistnik 1%, korzeń kurkumy 1%.</br>" + 
					"Dodatki na  1000 ml:</br>" + 
					"50.000 mg lecytyny.</br>" + 
					"Składniki:</br>" + 
					"Popiół surowy 0,2%, tłuszcz surowy 97,8%, włókno surowe 0,4%, białko surowe 1,1%.</br>" + 
					"Dawkowanie:</br>" + 
					"Podawać do żywności lub bezpośrednio do jamy ustnej. Przed podaniem wstrząsnąć.</br>" + 
					"Świnki morskie, króliki karłowate - 3x dziennie 5-6 kropli</br>" + 
					"Można go dodawać do jedzenia w okresie linienia zamiast oleju parafinowego czy słonecznikowego, gdy zauważymy mniejsze niż zwykłe bobki lub połączone sierścią \"koraliki\". Profilaktycznie podaje się dwie krople na kg królika np. na ulubionym owocu bądź innym smacznym jedzonku.</br>" + 
					"</br>" + 
					"</br>" + 
					"Alfavet RodiCare akut dla królików i małych gryzoni 15ml.</br>" + 
					"</br>" + 
					"Suplement diety dla małych gryzoni i królików regulujący zaburzenia trawienia.</br>" + 
					"Skład:</br>" + 
					"Olej lniany 32%, olej rzepakowy 27,5%, olej słonecznikowy 8%, olej sojowy 6%, owoce ostropestu plamistego 2,5%;</br>" + 
					"drożdże 2%, liście karczocha zwyczajnego 1,5%; korzeń goryczki 1,5%; owoce kminku 1,5%;</br>" + 
					"liście mięty pieprzowej 1,5%; korzeń rabarbaru 1,5%; kwiaty rumianku 1,5%; korzeń lukrecji 1,5%;</br>" + 
					"glistnik jaskółcze ziele 1,5%; korzeń kurkumy długiej 1,5%; owoce kopru włoskiego (fenkułu) 1,5%; liście jeżyny 1,5%.</br>" + 
					"Dawkowanie:</br>" + 
					"Króliki miniaturowe: 3 x dziennie 5-6 kropli.</br>" + 
					"</br>" + 
					"Można go dodawać do jedzenia w okresie linienia zamiast oleju parafinowego czy słonecznikowego, gdy zauważymy mniejsze niż zwykle bobki lub połączone sierścią \"koraliki\". Profilaktycznie podaje się dwie krople na kg królika np. na ulubionym owocu bądź innym smacznym jedzonku.</br>" + 
					"</br>" + 
					"</br>" + 
					"Alfavet RodiCare akut dla królików i małych gryzoni 15ml.</br>" + 
					"</br>" + 
					"Fruit Plus zawiera aktywne enzymy. Wytworzone z najświeższych owoców papai oraz ananasa</br>" + 
					"(naturalnego źródła enzymów trawiennych). Jedna tabletka zapewnia niezbędną ilość aktywnych enzymów,</br>" + 
					"dużo większą niż przy spożyciu takiej samej ilości owocu papai. Weterynarze zalecają owoc papai oraz ananasa</br>" + 
					"jako suplement diety wspomagający układ trawienny królika. Produkt nie zawiera cukru, nie zawiera sztucznych barwników.</br>" + 
					"W 100% pozbawiony konserwantów. Bardzo smaczny suplement diety. </br>" + 
					"Dawkowanie: 1-2 tabletki dziennie.</br>" + 
					"Wprawdzie weterynarze nadal zalecają ananas, papaje i kiwi w okresie linienia, jednak najnowsze badania podają, ze enzymy proteolityczne (bromelina, papaina, aktynidyna) tracą swoje właściwości w kwaśnym środowisku, czyli w zetknięciu z kwasem solnym w żołądku. Gdy trafia do jelita cienkiego są pozbawione aktywności i w żaden sposób nie wpływają na strukturę włosa czy zmiękczeniu bezoaru, są bezwartościowe."));
			
			careService.create(new Care(3L, "Pielęgnacja uszu", "O czystość swoich uszów króliczki dbają same.</br>" + 
					"NIE MYJEMY ICH TAK JAK U CZŁOWIEKA. Ale warto zawsze skontrolować ich wygład zwłaszcza jeśli nasz uszatek jest barankiem. Baranki z racji swoich opadniętych uszów mają ograniczona możliwość wentylacji, choć większość z nich trzepiąc głową usuwa woskowinę. Tak czy inaczej należy kontrolować czy uszka są czyste, bez wydzieliny, nalotu czy nieprzyjemnego zapachu. Przy każdej kontrolnej wizycie, bądź szczepieniu zawsze warto pokazać uszy weterynarzowi.</br>" + 
					"Lekarz zbada je odpowiednim wziernikiem i oceni ich stan. A w razie konieczności nauczy nas jak je bezpiecznie czyścić, przy użyciu patyczka namoczonego w parafinie bądź innym wskazanym środku np.: novoscabin do stosowania przy problemach z świerzbowcem. PAMIĘTAJMY, że czyszczenie uszów nie jest łatwą sprawą, dlatego zdecydowanie należy pozostawić je lekarzowi. Króliczki są wiercipiętami a każdy ich ruch podczas czyszczenia stanowi dla nich zagrożenie. Nie należy tego robić samemu, gdyż szkody mogą okazać się ogromne!!! "));
			
			careService.create(new Care(3L, "Ścieranie zębów", "Zęby królika rosną przez całe życie. A ma ich on aż 28. Powinniśmy kontrolować je raz na dwa tygodnie, gdyż tygodniowo zęby uszatka rosną ok. 2-3mm. Dlatego tak ważne jest aby zadbać by królik miał możliwość ścierania ciągłego przyrostu. Do ścierania zębów przede wszystkim służy siano, długie żucie i pocieranie ząb o ząb ściera je. W dalszej kolejności doskonale nadają się gałązki drzew (jabłoń, brzoza, wierzba, lipa, leszczyna) bądź kawałki drewna.</br>" + 
					"Obecnie w każdym dobrym sklepie zoologicznym, można kupić, dobrej jakości pędy jabłoni, bądź innych drzew. Oczywiście możemy sami nazbierać gałązek musimy tylko pamiętać aby: dobrze rozpoznać gatunek drzewa, wybrać drzewa rosnące z dala od ulic, odpowiednio oczyścić gałązki, aby nie były nadto wilgotne, bądź pokryte robactwem czy innym dziwnym nalotem.</br>" + 
					"PAMIETAJMY, że jeśli nie dopilnujemy aby nasza pociecha miała możliwość ścierania zębów, mogą one zacząć wrastać w dziąsła powodując silny ból i kaleczenie języka.</br>" + 
					"</br>" + 
					"UWAGA podczas kupowania wyprawki dla uszatka zazwyczaj w sklepach zoologicznych mało wykwalifikowany personel poleca do ścierania zębów tzw. Wapieńko. Nie dajmy się zwieść, owo wapień ko jest szkodliwe i z czasem prowadzi do kamicy nerkowej, która jest bardzo bolesna a nawet śmiertelna."));
			
			careService.create(new Care(3L, "Prawidłowe uzębienie", "Przynajmniej raz w roku, królik powinien mieć dokładnie przebadaną jamę szczękową u weterynarza. Uszatki, u których wykryto problem z zębami powinny mieć zrobione RTG oraz badanie krwi. Wszystko to pomoże w szybszym zdiagnozowaniu przyczyny problemów. Przyczyny mogą być różne, zaczynając od wad genetycznych a kończąc na niewłaściwym żywieniu. Po wykryciu wady uzębienia, najczęściej kończy się na wykonaniu zabiegu polegającego na przycięciu źle rosnących zębów. Zabieg ten należy powtarzać wg zaleceń weterynarza. NIE ZAPOMINAJMY O ŚCIERANIU."));
			
			careService.create(new Care(3L, "Płeć", "Nie należy wierzyć sprzedawcy w sklepie zoologicznym. Koniecznie płeć królika powinniśmy ustalać u weterynarza."));
			
			careService.create(new Care(3L, "Wiek", "Junior</br>" + 
					"</br>" + 
					"- od 3 tygodni do 10 tygodni.</br>" + 
					"</br>" + 
					"Nastolatek</br>" + 
					"</br>" + 
					"- od 10 tygodniu do 10-12 miesięcy.</br>" + 
					"</br>" + 
					"Dorosły królik</br>" + 
					"</br>" + 
					"- od 1 roku do 6 lat.</br>" + 
					"</br>" + 
					"Senior</br>" + 
					"</br>" + 
					"- od 6 lat wzwyż.</br>" + 
					"</br>" + 
					"</br>" + 
					"</br>" + 
					"Z wiekiem króliki maja inne zapotrzebowania na pokarmy oraz aktywność fizyczną. Zdrowy i szczęśliwy uszatek żyje nawet 13 lat. :)"));
			
			careService.create(new Care(4L, "Wielkość i wyposażenie", "Nie da się ukryć, że każda klatka to więzienie i nuda dla królika. Idealnie byłoby gdyby uszak mógł biegać 24 godz. na dobę. To bardzo towarzyskie i ciekawskie stworzonka, kraty klatki ograniczają mu dostęp do nas, dostęp do wielu ciekawych miejsc, królik nie może rozładować nadmiar swojej energii, w klatce nie może wykonywać dzikich podskoków z wyrzucaniem na boki nóg i piruetami. Wiemy, że wielu z was nie wyobraża sobie trzymanie królika bez klatki dlatego przedstawiamy kilka z nich oraz inne rozwiązania dotyczące trzymania królika w domu.</br>" + 
					" </br>" + 
					"Wszystko zależy od wagi i rasy królika. Ogólnie pisząc to minimalna klatka dla królika miniaturowego powinna być o wymiarach 100cm długości, 50cm szerokości i 40cm wysokości. Królik powinien w klatce mieć możliwość swobodnego poruszania się. To bardzo ważne, zwłaszcza jeśli większą część dnia przebywa w niej zamknięty. Prócz wielkości jest również kilka rodzajów klatek. Zawsze wybierajmy te z odrutowana górą a by był swobodny przepływ powietrza, podstawa klatki zazwyczaj jest plastikowa choć zdarzają się również klatki z podstawa kratkowaną, które są dość wygodne w utrzymaniu czystości, (gdyż wszystkie odchody przepływają przez kratki bezpośrednio do zamontowanej pod spodem kuwety), ale stanowią równocześnie potworne zagrożenie. Nie wiele trzeba aby łapka królika utkwiła w kratce, powodując zwichnięcie, naderwanie a nawet złamanie. Jeśli już posiadamy taka klatkę to połóżmy na kraty kawałek dość grubego kartonu , który będzie doskonale izolował uchola od kratek, a na to cieplutki kocyk bądź dywanik. Jeśli nie posiadamy takiej klatki a planujemy zakup to od takich raczej trzymajmy się z daleka i zainwestujmy w takie z plastikowa podstawą. Podczas zakupu natkniemy się również na możliwość wyboru klatki z drzwiczkami bocznymi lub drzwiczkami zamontowanymi u góry. Generalnie oba rozwiązania są stosowane, ale jeśli mamy wybór to lepiej postawić na tą z bocznymi drzwiczkami, gdyż dają one swobodną możliwość wskakiwania i wyskakiwania króliczkowi z klatki kiedy tylko ma na to ochotę. Bardziej popularne i chętnie stosowane za granicą są też klatki z drewna do umieszczenia na dworze. Często posiadają one również wbudowana zagrodę. Oczywiście taka klatka, musi być odpowiednio ocieplona i przystosowana do odpowiedniej pory roku. Można również samemu wykonać klatkę dla królika, przy użyciu drewna i siatki, pamiętajmy tylko o wymiarach i przede wszystkim by zbudowana klatka gwarantowała bezpieczeństwo maluchowi.</br>" + 
					"Królika nie możemy trzymać w akwarium!!! Nawet jeśli ma spore rozmiary. Przetrzymywanie królika w akwarium stanowi dla niego śmiertelne zagrożenie. Jest w nim ograniczona cyrkulacja powietrza. Ciężko takie coś umyć, a to bardzo ważne, gdyż istnieją sprzyjające warunki do tworzenia się pleśni i grzybów w takich akwariach. No i królik jest w sumie tam uwięziony, bo nawet nie może sam wyskoczyć ani wskoczyć do środka. Uchol traktuje klatkę jak swój dom, więc musimy zadbać aby czuł się w nim dobrze, z tym związane np.:</br>" + 
					"Wyraźne niezadowolenie spowodowane czyszczeniem klatki, bądź kiedy uchol się przestraszy ucieka do klatki i z niej obserwuje przebieg wydarzeń. W klatce powinna znajdować się kuweta, poidełko bądź miseczka z woda, miseczkę na pokarm suchy, paśnik zawsze wypełniony sianem. Natomiast pozostałą część klatki najlepiej wyłożyć ciepłym dywanikiem."));
			
			careService.create(new Care(4L, "Podłoże", "W sumie klatkę można podzielić na dwie części: kuwetę i miejsce do wypoczynku. Najlepszym rozwiązaniem jeśli chodzi o kuwetę jest wsypanie do niej żwirku. Żwirek doskonale wchłania mocz przy czym ogranicza wydzielanie się nieprzyjemnego zapachu. Na rynku dostępnych jest wiele różnych żwirków, począwszy od najzwyklejszych do zapachowych (przy czym nie wszystkie uchole tolerują inne zapachy dobiegające z kuwety po za swoim).</br>" + 
					"Jeśli chodzi o pozostałą część klatki, przeznaczoną na odpoczynek, to najlepszym podłożem jakie możemy zastosować to mięciutki kocyk, bądź ciepły dywanik. Kategorycznie nie stosujemy trocin!!! Choć właśnie one są najczęściej polecane przez sprzedawców w sklepach zoologicznych. Pyłek unoszący się z trocin może dostać się do oka, zainfekować górne drogi oddechowe, a nawet spowodować choroby skórne. Po co niepotrzebnie narażać malucha na niebezpieczeństwo. Można również znaleźć przyczyny bardziej przyziemne,  mianowicie trociny strasznie roznoszą się po mieszkaniu robiąc bałagan, a dla posiadaczy angorek to już całkowita zmora kiedy trociny przyczepiają się do futerka tworząc przy tym kołtuny. Nie komplikujmy życia sobie a przede wszystkim uszatkom.</br>" + 
					"W miarę bezpiecznym i stosowanym podłożem jest wyściółka składająca się z siana. Na pewno jest na niej króliczkowi wygodnie i ciepło no i zawsze może sobie podjeść. Pamiętajmy, że takie rozwiązanie jest bezpieczne pod warunkiem, że królik nie załatwia na sianie swoich potrzeb fizjologicznych. W mokrym sianie zalęgają się larwy much co jest niebezpieczne dla królika (czyt. choroby), a zjadanie takiego siana również może zaowocować niepotrzebną chorobą.</br>" + 
					"Streszczając, to decyzja o podłożu należy do nas samych, nim jednak ją podejmiemy zwróćmy uwagę na przyzwyczajenia i zachowania naszego malucha, aby naprawdę z czystym sumieniem i satysfakcja stworzyć bezpieczny domek uszatemu."));
			
			careService.create(new Care(4L, "Utrzymanie czystości", "Klatkę - należy czyścić przynajmniej raz w tygodniu wymieniając podłoże na świeże, natomiast pręty klatki raz w miesiącu wilgotną ściereczką, aby pozbyć się kurzu i wszelkich już wytworzonych bakterii przez czynniki atmosferyczne.</br>" + 
					" </br>" + 
					"Kuweta - w zależności od wielkości i wyłożenia kuwety. Ręczniki papierowe należy wymieniać na bieżąco, natomiast żwirek w zależności od użyteczności, raz dwa razy w tygodniu. Warto raz na dwa tygodnie umyć kuwetę mydłem lub octem, który pozwala pozbyć się zalęgających plam z moczu. Dokładnie osuszyć. Bobki wybieramy regularnie.</br>" + 
					"</br>" + 
					"Paśnik - pręty przecieramy przy okazji czyszczenia prętów klatki, wilgotną ściereczką.</br>" + 
					"Siano wymieniamy co dzień na świeże.</br>" + 
					"</br>" + 
					"Mieszczki i poidełka - wodę i jedzenie należy wymieniać każdego dnia. Miseczki dokładnie umyć w ciepłej wodzie, aby nie rozwijały się w nich glony i pleśń. Problem jest z poidełkami, często pojawiają się w nich glony, dlatego warto zainwestować w szczotkę do czyszczenia butelek i ciepłą wodą dobrze wymyć środek, ale jeszcze lepiej przerzucić się na miski.</br>" + 
					""));
			
			careService.create(new Care(4L, "Wychowanie bez klatkowe", "Jak sama nazwa wskazuje opieka i wychowanie odbywa się bez użycia klatki. Czy to metoda nowa - można by dyskutować, ale na pewno coraz częściej stosowana. A co za tym idzie ma swoich zwolenników jak i przeciwników. Królik minimalnie powinien 4-5 godzin dziennie mieć możliwość swobodnego brykania, więc wychowanie bez klatkowe jest zdecydowanie najlepszą alternatywa dla królika, który mieszka z nami w domu. Oczywiście to wszystko nie jest takie proste. Potrzebne są odpowiednie warunki. Pomieszczenie i jego zabezpieczenie. Bo jak każdy stan rzeczy tak i ten ma swoje wady i zalety. Główna wada, która zazwyczaj decyduje o pozostaniu przy trzymaniu malucha w klatce to niszczenie. Ulubiona zabawa. Jednak jest kilka zasad, które pozwalają zminimalizować ta wadę. A kluczem do wszystkiego jest odpowiednie zabezpieczenie.</br>" + 
					"Ze względów bezpieczeństwa: czyli zabezpieczenie wszelkich kabli, urządzeń grzewczych, kwiatów, lekowi itp.</br>" + 
					"Ze względów wartościowych: czyli zabezpieczenie wszystkich rzeczy, które są dla nas ważne i cenne a pozostają w zasięgu wzroku i zębów uszatka, buty, książki, ubrania itp.</br>" + 
					"Ze względu na nudę: choć to zabawnie brzmi, ale to też klucz do sukcesu. Najczęściej królik niszczy z powodu nudy. Dlatego niezwykle ważne jest aby zapewnić maluchowi odpowiednia ilość pudel kartonowych, gazet, kul wiklinowych, wszystko to co bezpiecznie i z pasja może rozwalać i dzięki czemu mieć zajęcie. Pamiętajmy że króliki szybko się nudzą więc ich zabawki musimy często wymieniać na nowe.</br>" + 
					"Jedna z wad, dla niektórych są również sprawy fizjologiczne. Jeśli jednak maluch jest nauczony korzystania z kuwety to nie powinno być z tym problemów. Co do kwestii znaczenia terenu, podczas okresu dojrzewania po prostu trzeba przeżyć i przeczekać ten okres.</br>" + 
					"Dobrym pomysłem na pozbycie się klatki jest zagroda. Jeśli podejmiemy decyzje, pozbycia się klatki, dawkujmy wolność stopniowo. Co dzień coraz dłużej, zwiększa to szanse iż królik nie zachłyśnie się wolnością.</br>" + 
					"Po pewnym czasie króliki przyzwyczajają się do wolności i nie niszczą tyle co króliki, które mieszkają w klatce i wypuszczane maja w sobie tyle energii że muszą ją rozładować na książkach czy innych przedmiotach, skacząc po meblach itd."));
			
			careService.create(new Care(5L, "Kuweta", "Króliki zazwyczaj na swoją toaletę wybierają sobie jedno miejsce w klatce, bądź w innym miejscu. Naszym zamiarem jest zachęcenie uszatka, aby kuwetę zaakceptował jako swoją toaletę. Na rynku dostępne są rożne kuwety począwszy od wielkości, kształtów po kolory.</br>" + 
					"Popularne trójkątne(narożne), często się nie sprawdzają, gdyż nie są wygodne. Są małe dorastający uchol korzystając z niej może mieć problemy z usadowieniem. Są również kuwety z sepatorem moczu. Królik załatwia się na plastikowej kratce po czym mocz  przelatuje przez nią i zostaje wchłonięty przez żwirek, a bobki zostają na kratce przy czym bardzo łatwo można je na bieżąco usunąć przy użyciu łopatki.</br>" + 
					"Kuwetę najlepiej wyłożyć żwirkiem nie zbrylającym się, jest on bezpieczny dla uszatków. Po nasiąknięciu moczem nie zbryla się, wręcz przeciwnie rozpada się na drobne kawałki, pochłaniając zapach moczu. Można również wyłożyć ją ręcznikami papierowymi, przy czym oczywiście należy na bieżąco usuwać namoknięty papier. Zdecydowanie odradzamy: trociny (nie estetyczne, unoszący się z nich pyłek jest zagrożeniem dla zdrowia) żwirek zbrylający (po dostaniu się do organizmu pod wpływem wilgoci pęcznieje przy czym wyrządza nie małe szkody) ściółki z kamyków (są bardzo nie wygodne, co odstrasza uszatki, a zarazem może kaleczyć łapki), ściółki z siana (choć wydaje się atrakcyjna, bo Kicek może sobie podjeść podczas siusiania, to stanowi poważne zagrożenie zdrowotne. W namokniętym sianie rozwijają się bakterie oraz larwy much).</br>" + 
					" </br>" + 
					"</br>" + 
					"Żwirki, ściółki i podkłady dla naszych króliczków.</br>" + 
					"</br>" + 
					"Mamy ogromny wybór w sklepach zoologicznych i internetowych. Jaki żwirek kupić, który dobrze chłonie, bardziej się opłaca, jaki podpasuje mojemu królikowi? Kupując zwróćcie uwagę na zapach ściółki. Nie Wam ma się podobać, musi on być przyjemny dla królika, który w niej przebywa. Uszaki czują 5 razy lepiej niż człowiek, a więc to co dla nas jest miłe dla królika może być zbyt agresywne. Wszelkim aromatyzowanym cudakom mówimy NIE.</br>" + 
					"</br>" + 
					"</br>" + 
					"Żwirek drewniany typu Pinio , Drewus, Pigwa, Hilton itp.</br>" + 
					"</br>" + 
					"Pojemność 5-10 l. Jest wytwarzany z trocin, ścinków i wiórków drewnianych. Jeden z najczęściej używanych żwirków wśród zakróliczonych, ładnie pachnie drzewem, mało pylący, nie brudzi futerka ani otoczenia, pochłania dużo wilgoci i starcza na długo. Nadaje się jako podłoże do kuwety, na cała klatkę jest zbyt twardy. Jeśli chcemy go użyć do klatki na balkonie bądź w ogrodzie na całej wannie, należy na wierzch położyć warstwę słomy lub ściółki uzupełniającej.</br>" + 
					"</br>" + 
					"</br>" + 
					"Pellet do kominków.</br>" + 
					" </br>" + 
					"Surowcem do ich produkcji są trociny, ścinki i wióry powstałe przy obróbce drewna. Niczym się nie różni od żwirków drewnianych, a jest sporo tańszy. Nie powinien zawierać żadnych chemicznych dodatków,jest prasowany ta sama metoda co żwirki dla zwierząt. Tak samo wchłania wilgoć, jest wydajny, nie pyli, nie brudzi. Stosujemy go tak samo jak Pinio itp.</br>" + 
					"</br>" + 
					"</br>" + 
					"Ściółka bawełniana.</br>" + 
					"</br>" + 
					"Nie nadaje się na cała klatkę ponieważ miesza się z sianem i zielenina i powstaje jeden wielki śmietnik. Poza tym ściółka jest dosyć droga.</br>" + 
					"Nie pyli, ani nie wypada z kuwety, mięciutka dla łapek, niestety słabo wchłania mocz i czuć to gdy przechodzi się koło klatki. Alternatywą byłoby najpierw wsypać żwirek drewniany do kuwety, a na to położyć ściółkę bawełnianą. Nadaje się dla króliczych alergików i uszaków z katarkiem.</br>" + 
					"Na kilku forach czytałam ostrzeżenie, że zjedzona przez królika ściółka doprowadziła do poważnych komplikacji zdrowotnych.</br>" + 
					"</br>" + 
					"</br>" + 
					"Granulat z kolb kukurydzy Chipsi mais , Zolux i inne.</br>" + 
					"</br>" + 
					"Robiony jest z kaczanów kukurydzy. Jego plusem jest, że jest lekki. Świetnie nadaje się do kuwety, nie pachnie, nie pyli, nie przyczepia się do futerka, dobrze wchłania płyn. Starcza na długo jeśli jest używany tylko do kuwety, na całą klatkę nie za bardzo się opłaca, ale oczywiście można nim ją wysypać i codziennie czyścić kącik toaletowy. Żwirek jest bardzo drobny, dlatego królik podczas wyskakiwania rozsypuje go trochę. Jeszcze jedno, im drobniejszy żwirek tym bardziej królik ma ochotę w nim kopać. Dużym minusem jest dodany w żwirkach Zolux aromat, zachęca on króliki do jedzenia ściółki. </br>" + 
					"</br>" + 
					"</br>" + 
					"Trociny.</br>" + 
					"</br>" + 
					"Robione są przeważnie z drzew iglastych, ale można też dostać trociny z drzew liściastych. Dosyć mocno pachną, są miękkie i przyjazne dla łapek. Średnio chłoną mocz, szybko przemakają i zaczyna brzydko pachnieć w okolicy klatki. Nie polecamy dla królików i świnek ponieważ oprócz tego, że wiórki bardzo się roznoszą wokół to jeszcze drobinki trocin drążnia oczy i nos królika, wrażliwe króliki reagują kichaniem i katarkiem, niektóre dostają zapalenia spojówek.</br>" + 
					"</br>" + 
					"</br>" + 
					"Słoma.</br>" + 
					"</br>" + 
					"To łodygi i liście zboża, nie przetworzone, bez ziaren. Powinna być w ładnym złotym kolorze. Nie nadaje się jako samodzielna ściółka ponieważ nie wchłania wilgoci i szybko zaczyna gnić i brzydko pachnieć. Położona na żwirku drewnianym chroni łapki przed otarciami oraz sprawia, że nieczystości spadają niżej na podściółkę, a słoma pozostaje sucha i czysta. Jest niezastąpiona w domkach stojących cały rok na dworze, szczególnie zimą. Trochę się roznosi, króliki lubią ją \"układać\" po swojemu i podgryzać. </br>" + 
					"</br>" + 
					"</br>" + 
					"Granulat ze słomy.</br>" + 
					"</br>" + 
					"To sprasowana słoma, kształtem przypomina granulat drewniany, jest może trochę grubszy. Stosuje się go w kuwecie. Mało pylący, dobrze chłonie wilgoć, jest wydajny. Niestety króliki lubią go podjadać, a to jest bardzo niebezpieczne ze względu na pęcznienie pod wpływem wilgoci, czytałam na króliczych forach o wypadkach śmiertelnych spowodowanych zjedzeniem granulatu.</br>" + 
					"</br>" + 
					"</br>" + 
					"Granulat papierowy np. Hugro.</br>" + 
					"</br>" + 
					"Jest robiony z papieru z odzysku, czyli nie bardzo wiadomo jakiego, pachnie trochę sztucznie i pewnie to sprawiło, że część bobków na początku lądowała obok kuwety. Dużą zaletą jest jego waga. Bez problemu przyniosłam do domu worek 30 litrowy. Kolor ciemno szary, mało atrakcyjny na cała klatkę, do kuwety może być. Dobrze wchłania, jest wydajny, nie rozpada się, nie pyli, minimalnie pęcznieje, nie jest zjadany, pozostaje w kuwecie, no może kilka granulek wypadnie. Godny polecenia.</br>" + 
					"</br>" + 
					"</br>" + 
					"Ściółka z konopi np. Vitakraft, Hugro.</br>" + 
					"</br>" + 
					"Robiona z wnętrza łodyg konopi, wygląda jak małe patyczki/ drzazgi. Można kupić duże opakowanie bo jest lekki. Nie plącze się w futerko i nie jest roznoszony po pokoju. Nadaje się na całą klatkę i oczywiście do samej kuwety też. Nie jest twarda, raczej przyjemna dla króliczych łapek. Zapach neutralny, nie pyli, nie wchłania za dobrze i nie absorbuje zapachu dlatego trzeba ją często wymieniać. Dobra dla króliczków z katarkiem, ponieważ nie podrażnia ukł. oddechowego. Muchy omijają tę ściółkę z daleka. Nie należy do tanich, mimo wszystko to jedna z moich ulubionych ściółek. Świetnie sprawdza się w domku na balkonie.</br>" + 
					"</br>" + 
					"</br>" + 
					"Żwirek silikonowy np. Trixie.</br>" + 
					"</br>" + 
					"Nadaje się tylko do kuwety. Świetnie pochłania zapachy i wilgoć, nie pyli, jest antybakteryjny i bezzapachowy. Trochę grzechocze przy używaniu. Zesiusiana część zabarwia się na żółto i wtedy należy go wymienić. Myślę, że jest to dobra alternatywa dla króliczych alergików lub królików po operacji, jeśli zostanie zaakceptowana.</br>" + 
					"</br>" + 
					"</br>" + 
					"Ściółka uzupełniająca, leśna ściółka, z Holsztynu, z ziołami ,Vitakraft, JR Farm wyściółka wiejska.</br>" + 
					"</br>" + 
					"Składa się z grubszych wiórków, kory, ziół i listków, JR Farm ma dodatek płatków kwiatów, szyszek i kłosów zbóż w zależności od rodzaju ściółki. Ładnie pachnie i wygląda. Króliki bardzo lubią podgryzać duże kawałki kory, listki i zioła też są chętnie zjadane. Myślę, że przebieranie, kopanie i szukanie w niej to świetne zajęcie dla królika. Ściółka może zastąpić piasek w piaskownicy do kopania bądź służyć jako wierzchnia warstwa dla zwykłych trocin czy granulatu drzewnego. W samej kuwecie raczej się nie sprawdzi, z reszta nie taka jej rola.</br>" + 
					"</br>" + 
					"</br>" + 
					"Mata dla gryzoni Hansepet, MultiFit, Hugro.</br>" + 
					"</br>" + 
					"Fajny pomysł, ale niestety mało praktyczny, to mata lniana lub konopiana do klatki. Jest miękka i ociepla dno klatki. Można ja przyciąć tak żeby pasowała do miejsca gdzie chcemy ja położyć. Rozmiary mat to Hansepet 25x40 Hugro i MultiFit 25x40, 40x100, 50x120 Na amazon można dostać taniej i różnych firm. Mata jest prosta w użytku i łatwa do usunięcia. Można ją wyrzucić na kompost. Niestety regularne stosowanie jest dosyć drogie i nie sprawdza się u królików, które nie korzystają z kuwety, szybko przemaka. Dywanik jest w dodatku chętnie zjadany, a że składa się z długich włókien połkniecie może skończyć się tragicznie. Usunęłam mocno poobgryzana mate, bałam się, ze uszaki dostana zatoru.</br>" + 
					"</br>" + 
					"</br>" + 
					"Dry bed.</br>" + 
					"</br>" + 
					"To mata ze specjalnego materiału, który przepuszcza płyny pozostawiając suchy wierzch. Do kupienia w różnych rozmiarach i w dwóch Typach: grubszy A i cieńszy B. Wyłożyć można nim cała klatkę, transporter, półkę, kącik królika. Dobrze sprawdza się u królików, które z jakiś powodów nie mogą korzystać z kuwety (np. inkontynencja). W takim przypadku na spod klatki należy nasypać podłoże z granulatu, a na nie położyć mate. Mocz będzie wsiąkać w granulat, dry bed pozostanie suchy, wystarczy tylko sprzątnąć bobki i resztki jedzenia. Zabrudzona mate można prac w pralce na 40°, trzeba ja tylko dobrze wytrzepać lub odkurzyć.</br>" + 
					"</br>" + 
					"</br>" + 
					"Piasek.</br>" + 
					"</br>" + 
					"Nie nadaje się ani do kuwety ani na cała klatkę. Prawie nie absorbuje moczu ani zaachu, szybko robi się mało apetyczne błoto. Kto chce swoim uszakom sprawić duża radość może nasypać piasku do \"piaskownicy\" gdzie królik będzie mógł się wylegiwać, tarzać i kopać. Piasek trzeba często wymieniać bo króliki lubią się w nim załatwiać. Trzeba się też liczyć z częstym zamiataniem. Piasek kupujemy ten przeznaczony dla dzieci. Ptasi czy dla szynszyli nie nadaje się , jest z dodatkami i zbyt drobny, może trafić do układu oddechowego.</br>" + 
					"</br>" + 
					"</br>" + 
					"Bentonit, koci żwirek zbrylający lub nie.</br>" + 
					"</br>" + 
					"Nie nadaje się dla uszaków, raz że drobny pyłek będzie wdychany, a dwa zjedzenie granulatu wiąże się z niebezpieczeństwem zatrucia, zatoru czy ostrego rozszerzenie żołądka.</br>" + 
					"</br>" + 
					"</br>" + 
					"! Uwaga !</br>" + 
					"</br>" + 
					"Wszystkie sprasowane granulaty pęcznieją pod wpływem wilgoci, jedzenie przez królika ściółki może doprowadzić do poważnych komplikacji zdrowotnych np. zatkania przewodu pokarmowego.</br>" + 
					""));
			
			careService.create(new Care(5L, "Nauka korzystania", "Choć króliki są czyściochami, to nauka czystości może wymagać od nas cierpliwości i treningu. Dużo łatwiej zasad korzystania z kuwety nauczyć jest starszego uszatka niż maluszka. Ale tak czy inaczej trzeba uzbroić się w cierpliwość i nie poddawać się.</br>" + 
					"</br>" + 
					"Kuwetę stawiamy w miejscu gdzie nasz pupil najczęściej się załatwia. Wszystkie bobki pozostawione w innych miejscach należy pozbierać i wrzucić do kuwety. Podobnie robimy z moczem. Jeśli nasz maluch zrobił siusiu po za kuweta to ścieramy siuśki ręcznikiem papierowym i umieszczamy go w kuwecie. Te zabiegi spowodują, iż maluch zacznie wyczuwać swój zapach w kuwecie.</br>" + 
					"Podejmując się nauki czystości musimy podejść do sprawy bardzo odpowiedzialnie, ponieważ potrzebna tu jest systematyczność. Należy bardzo pilnować, aby wszystkie bobki i siuśki z poza kuwety niezwłocznie trafiały tam gdzie ich miejsce czyli -do kuwety. Trening jest bardzo pracochłonny, ale za to efekty niebywałe. Obserwując malca możemy wyczuć moment, kiedy powinien zostać zwabiony smakołykiem do kuwety. Najczęściej szykując się do siusiania Kicek podnosi ogonek do góry, powstrzymać możemy go używając stanowczej komendy typu NIE lub NIE WOLNO. Warto pamiętać, iż dojrzewające króliki oraz samiczki w rui mogą zapominać do czego \"służy\" kuweta."));
			
			careService.create(new Care(6L, "Kable", "Aby nasza pociecha mogła swobodnie i bezpiecznie poruszać się po mieszkaniu, musimy starannie je zabezpieczyć. Dla uszatka bardzo atrakcyjne są kable. Niestety równie co atrakcyjne są również dla niego niebezpieczne.</br>" + 
					"Oczywiście najlepszym rozwiązaniem jest, aby w pomieszczeniach gdzie porusza się maluch nie było kabli. Jeśli to nie możliwe, jest kilka sposobów na ukrycie ich przed naszymi ciekawskimi Kickami. Można ukryć je pod listwami podłogowymi lub meblami, oczywiście pod warunkiem, że maluch nie zagląda za meble. Jeśli jest to możliwe można również</br>" + 
					"po prowadzić kable wyżej i przymocować ścianie, gdzie mały nawet stając słupka nie dosięgnie."));
			
			careService.create(new Care(6L, "Rośliny trujące", "Króliki są roślinożercami, a co za tym idzie widok zielonego kwiatka napawa naszych pupili radością. Rośnie ich apetyt. Naszym obowiązkiem jest zabezpieczyć mieszkanie, aby wszystkie rośliny i kwiaty znajdowały się w miejscach niedostępnych dla uszatków.</br>" + 
					"Często nie zdajemy sobie sprawy, iż posiadamy w domu kwiat, który jest trujący."));
			
			careService.create(new Care(6L, "Przedmioty wartościowe", "O tak, w tym temacie to mogłabym dużo pisać z własnego doświadczenia. Moje urwisy nie jedna już torebkę czy parę butów pogryzły doszczętnie. Czy je karałam? Nie, bo to naszym obowiązkiem jest, zabezpieczyć wszystkie wartościowe przedmioty. Począwszy od tych, które zagrażają bezpieczeństwu uszatych, po te których gryzienie jest dla nich super zabawa, a tylko dla nas stratą kolejnej torebki."));
			
			careService.create(new Care(6L, "Niebezpieczenstwa", "Na takiego małego stworka jakim jest królik, w domu czeka nie jedno niebezpieczeństwo. Należy dobrze zamykać kubeł ze śmieciami, gdyż uszaty może tam znaleźć wiele ciekawych go rzeczy, a zarazem wiele z nich po zjedzeniu może zagrażać jego zdrowiu. Foliowe reklamówki trzymajmy zamknięte w szufladzie. Królik bawiąc się foliowym workiem może się udusić, jak również po zjedzeniu kawałka naprawdę to odchorować.</br>" + 
					"Nie stawiajmy naczyń, garnków, zwłaszcza z wrzątkiem na stolikach w zasięgu</br>" + 
					"króliczego wzroku. Królik z ciekawości może je stracić.</br>" + 
					"Pozamykane w szafkach również trzymajmy wszelkie środki czyszczące. Proszek, chlor, płyny do okien itp.</br>" + 
					"Kolejne niebezpieczeństwo stanowią słodycze, zwłaszcza czekolada, ale pamiętajmy również o innych pokarmach, które królik nie powinien spożywać.</br>" + 
					"Uwaga na drobne przedmioty np.: koraliki. Często zdarza się, że twórczość naszych dzieci też stanowi potencjalne zagrożenie. Często maluszki zostawiają w zasięgu wzroku królika kawałki plasteliny bądź modeliny.</br>" + 
					"Tapety (niezwykle lubiane przez nasze uszatki) w dużej ilości również stanowią zagrożenie, mogą bowiem powodować zatkanie. Można je zabezpieczyć naklejając na dole folie samoprzylepna.</br>" + 
					"Bardzo poważnym zagrożeniem dla królika są pozostałe zwierzęta zamieszkujące z nami w domu. Często jedne z nich żyją w zgodzie z uszatymi, a inne niestety nie. Do nas należy obowiązek zapewnienia bezpieczeństwa, uszatkom w naszym domu. Jeśli wiemy, iż nasz większy pupil nie przepada za mniejszym, zabezpieczmy tak mieszkanie, aby nie doszło do ich spotkania.</br>" + 
					"Tworząc uszatemu zagrodę miejmy na uwadze możliwości naszych pociech np.: zadajmy sobie pytanie czy zagroda jest na tyle wysoka i stabilna, że ani królik ani pies jej nie przeskoczą?</br>" + 
					"Nie bagatelizujmy, niechęci do siebie naszych zwierząt, życie pokazało już nie raz jak w wyniku braku zabezpieczenia i braku odpowiedzialności ze strony opiekuna doszło do tragedii."));
			
			careService.create(new Care(7L, "Do kupienia", "Na rynku dostępnych jest wiele zabawek przeznaczonych dla naszych pupili, co oczywiście nie oznacza, że wszystkie są naprawdę przyjazne królikowi. Prześledziłam oferty polskich sklepów i nie tylko.</br>" + 
					"Oto wyniki:</br>" + 
					"</br>" + 
					"</br>" + 
					"Domki </br>" + 
					"Dostępne są  rożnego rodzaju, od prostych chatek po zapierające dech w piersiach zamki. Jeśli wykonane są z naturalnego drewna, i nie wystają żadne gwoździe to jest to jak najbardziej bezpieczna zabawka.</br>" + 
					" </br>" + 
					"ZDECYDOWANIE POLECAMY</br>" + 
					" </br>" + 
					" </br>" + 
					"Kule z wikliny i trawy morskiej. </br>" + 
					"Jeśli nie są lakierowane, to zdecydowanie są bezpieczne dla ucholi.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Namioty</br>" + 
					"Choć brzmi śmiesznie to naprawdę można taki namiot nabyć dla uszatka. Zawsze to jakaś alternatywa dla domków.</br>" + 
					"</br>" + 
					"POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Tunel wiklinowy i korkowy</br>" + 
					"Z naturalnej wikliny, zabawa przednia.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Kulka z dzwonkiem </br>" + 
					"Niby zabawka sama w sobie ciekawa. Króliki lubią rzucać przedmiotami. Jednak ta ma znaczącą wadę -posiada dzwoneczek. Króliki maja bardzo wrażliwy słuch i ciągły dźwięk tego dzwoneczka zdecydowanie jest szkodliwy dla zdrowia.</br>" + 
					"</br>" + 
					" NIEPOLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Dzwonek z lucerny i ziół </br>" + 
					"Zawiera skrobie.</br>" + 
					"</br>" + 
					"NIEPOLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Rzodkiewki, marchewki z sizalu</br>" + 
					"Występują w postaci wielu warzyw. Przeznaczone są dla uszatków do gryzienia. Wg producentów nie szkodliwe. Natomiast zabawka ta pokryta jest cienką warstwą barwionego sizalu pod którą jest spora warstwa kleju. Nietrwała</br>" + 
					"</br>" + 
					"NIEPOLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Patyk z suszkami </br>" + 
					"Do kupienia aczkolwiek można go wykonać samemu. Zabawka zdrowa i pyszna.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Kula </br>" + 
					"Można do niej włożyć i sianko i zieleninę a nawet kawałki warzyw. Królik może kulać ja podobnie jak kule smakule, bądź możemy na łańcuszku przyczepić ją do klatki. Zabawka dostarcza królikowi dodatkowego ruchu.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Kula smakula </br>" + 
					"Cóż tu dużo mówić- zabawka numer jeden. Kula do której można wsypać przysmak, rodzynki bądź granulat. Podczas turlania smakołyki wypadają. Króliki szaleją na jej punkcie. Zabawka bezpieczna, stymulująca dodatkowy ruch zwierzaka.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE POLECAMY</br>" + 
					" </br>" + 
					" </br>" + 
					"Kong dla gryzoni</br>" + 
					"Pomysł zabawki ciekawy, podobnie jak do kuli smakuli wkłada się jedzenie do środka, zabawka dodatkowo odskakuje gdyż wykonana jest z naturalnego kauczuku.</br>" + 
					"Producent jednak ostrzega - jeśli Kong będzie mieć ślady gryzienia należy niezwłocznie go zabrać.</br>" + 
					"Na logikę skoro gryzonie to naturalne jest ze będą gryzły. Zwłaszcza że króliki wszystko oglądają zębami.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE NIEPOLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Formowane domki z patyków </br>" + 
					"Można dowolnie uformować norkę dla naszego uszatka. I dodatkowo maluch może coś podgryźć.</br>" + 
					"</br>" + 
					"POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Tunel z materiału </br>" + 
					"Dostarcza królikowi dużo, dużo radości kiedy tak może się przez niego przeciskać. Zabawka bezpieczna. Jedyny minus to fakt iż tunel jest mało stabilny sam w sobie.</br>" + 
					"</br>" + 
					"POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Drewniane gryzaki </br>" + 
					"Barwione drewno, w wybranym kształcie (tu akurat truskawki) na haku mocuje się do klatki. Królik powinien gryzak obgryzać. Ogólnie mało ciekawa zabawka.</br>" + 
					"</br>" + 
					"NIEPOLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Drapak </br>" + 
					"W sumie to zabawka przeznaczona typowo dla kotów, aczkolwiek króliki ze swoją skłonnością skakania tu i ówdzie chętnie z tej zabawki korzystają.</br>" + 
					"</br>" + 
					"POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Zabawka edukacyjna</br>" + 
					"Tak można ją nazwać. Składa się z barwionych patyczków poukładanych w specyficzny sposób. Do środka można włożyć przysmak. Cała zabawa polega na tym, żeby uszaty powyciągał te patyki ząbkami, aby dostać się do jedzenia. Zabawka trudna, ale bardzo interesująca.</br>" + 
					"</br>" + 
					"POLECAMY</br>" + 
					"</br>" + 
					"</br>" + 
					"Maskotka</br>" + 
					"To jest zabawka, która każdy króliczek powinien mieć. Dobra do polizania, przytulenia, wytargania za uszy a nawet i osiusiania jak ma się ochotę. Mięciutka i dostępna od koloru do wyboru. Można prac.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE POLECAMY</br>" + 
					" </br>" + 
					" </br>" + 
					"Zabawka edukacyjna</br>" + 
					"Świetna zabawka dla królika, składa się z \"tacki\" i pokrywek. W tacce są zagłębienia, w które wkładamy suszki, nakrywając je pokrywkami, uszak aby się dostać do jedzenia musi ściągnąć pokrywkę. Opiekun równie dobrze się bawi co sam uszak.</br>" + 
					"</br>" + 
					"ZDECYDOWANIE POLECAMY"));
			
			careService.create(new Care(7L, "Zrób to sam", "Jest kilka, możliwości zrobienia samemu zabawek, którymi uszatki bawią się z takim samym zapalę jak kupnymi.</br>" + 
					"Mamy nadzieje ze każdy znajdzie coś dla siebie :)</br>" + 
					"</br>" + 
					"</br>" + 
					"Piaskownica</br>" + 
					"Moje urwisy w takiej piaskownicy mają przednią zabawę. Dużo brykania, kopania i piachu w futerku. Jeśli ktoś nie ma możliwości, to zachęcamy do zrobienia domowej piaskownicy.</br>" + 
					"</br>" + 
					"</br>" + 
					"Przegląd prasy</br>" + 
					"Gryzienie to jest to co uszatki lubią najbardziej. I choć zalecane jest dawanie do gryzienia szarego papieru, chyba nie ma uszatka,  który by nie spróbował kolorowej prasy.</br>" + 
					"Jedni wolą informacje muzyczne a inni plotki</br>" + 
					"</br>" + 
					"</br>" + 
					"Rolka po papierze</br>" + 
					"Idealne do obgryzania a jeszcze lepsze, co osobiście sprawdziły moje Kicki do rzucania po pokoju. Mogą być od papieru toaletowego bądź ręczników papierowych.</br>" + 
					"</br>" + 
					"</br>" + 
					"Tunel</br>" + 
					"Króliki uwielbiają ciasne miejsca. W domu bez wydawania pieniędzy możemy zrobić tunel z bardzo wąskiego kartonu (np: po panelach lub karniszach) lub zrobić przerwę miedzy meblami a szafa.</br>" + 
					" </br>" + 
					"</br>" + 
					"Domowa kula smakula </br>" + 
					"Wystarczy do koperty wsypać troszkę ziółek, rodzynek, bądź granulatu, dobrze zakleić i zrobić w kopercie małą dziurkę. Królik rzuca koperta, bo wie że jak odpowiednio rzuci to coś z niej wypadnie dobrego.</br>" + 
					"</br>" + 
					"</br>" + 
					"Stojak na warzywa</br>" + 
					"Taki stojak można nabyć w sklepie- ale po co skoro możemy go zrobić sami. Wystarczy połączyć dwa kawałki drzewa i zrobić w nich dziury np: na marchewkę, nie wszystko musi być prosto i idealnie.</br>" + 
					"</br>" + 
					"</br>" + 
					"Kartony </br>" + 
					"Wystarczy wyciąć kilka dziur i nasze uszatki mają wspaniałą kryjówkę.</br>" + 
					"</br>" + 
					"</br>" + 
					"Wianki </br>" + 
					"Ciekawym pomysłem jest uplecenie choćby prowizorycznego wianka z giętkich gałązek. Oczywiście z bezpiecznych drzew dla królika. Uszaty zajmie się obgryzaniem.</br>" + 
					"</br>" + 
					"</br>" + 
					"Warzywny szaszłyk</br>" + 
					"Bardzo ciekawie podane danie dla naszych pupili, które nie dość że jest zdrowe,</br>" + 
					" to jeszcze świetnie zabawia uszaka."));
			
			careService.create(new Care(8L, "Drugi królik", "To jest zdecydowanie najlepsze rozwiązanie. I choć charaktery mają rożne to mowę ciała tą samą. Wspólnie lepiej znoszą sytuacje stresowe, nudę, czy chorobę. Bawią się do upadłego jak również i psocą. Jednak nie od razu to wszystko wygląda tak słodko i urokliwie. Większość uszatków potrzebuje troszkę czasu aby zapoznać się z nowym współlokatorem. Dobra wiadomość: jak już się zaprzyjaźnią to na dobre i źle. Zła wiadomość: niestety są przypadki ze nie wszystkie króliki żyją w zgodzie.</br>" + 
					"</br>" + 
					"</br>" + 
					"Zaprzyjaźnianie</br>" + 
					"</br>" + 
					"Króliki w naturze żyją w dużych grupach. Grupa daje poczucie bezpieczeństwa królikowi i schronienie. Zwierzak ma się z kim bawić, wymieniać czułości, posprzeczać, pobyć razem. Nasz domowy królik ma wrodzoną potrzebę życia w grupie. Powinniśmy być świadomi, że ani człowiek ani świnka czy inne zwierze nie zastąpi królikowi partnera. Weźmy sobie do serca tą naturalną potrzebę uszaka i nie skazujmy go na wieloletnią samotność.</br>" + 
					" </br>" + 
					"Idealnie byłoby wziąć od razu dwa uszaki. Króliki do 4 miesiąca życia obojętnie jakiej płci, zaprzyjaźniają się bez problemu. Jeśli weźmiemy parkę samczyka należy jak najwcześniej wykastrować, po 3 miesiącu osiąga zdolność zapładniania. Jeśli weźmiemy dwa samce, musimy poddać je też kastracji, zapobiegnie ona krwawym walką na tle terytorialnym. Można zaadoptować już zaprzyjaźnioną dorosłą parę, oszczędzi nam to stresu podczas zaprzyjaźniania. Jeżeli chcemy swojemu uszakowi sprawić partnera powinien on być mniej więcej w wieku naszego królika. Najlepszy układ to wykastrowany samczyk z samiczką. Dorosłe samice są bardzo terytorialne, młodszy samczyk może zostać przez nie mocno poturbowany lepiej zaadoptować starszego lub równego wiekiem samca.</br>" + 
					"</br>" + 
					"Dwa kastrowane samce - może być przyjaźń do końca życia, ale może być też tak, że króliki się nigdy nie polubią lub polubią się, ale od czasu do czasu będą wybuchały sprzeczki.</br>" + 
					"</br>" + 
					"Dwie samiczki - są problematyczne, zdarzają się oczywiście przyjaźnie pomiędzy samiczkami, ale zwykle pomiędzy 4 a 8 miesiącem dochodzi do walk. Silniejsza królica stara się przegnać rywalkę.</br>" + 
					" </br>" + 
					"Starszy królik z młodszym - starszy zwykle woli spokój, nie w głowie mu figle, zabawy małego mogą go irytować, młodszy natomiast może się nudzić ze starszym królikiem, żaden z niego kompan do zabawy.</br>" + 
					" </br>" + 
					"Małe króliki poniżej 4 miesiąca życia z dorosłym- to zależy od charakteru dorosłego królika, jeśli jest tolerancyjny to ok, w ,innym wypadku może dojść do poważnych okaleczeń malucha, który jeszcze nie umie się bronić i jest ufny w stosunku do każdego.</br>" + 
					" </br>" + 
					"Króliki są bardzo przywiązane do swojego terytorium, każdy królik ma swoje miejsce w grupie, które wywalcza sobie w okresie dorastania. Nasze uszaki spotykając się po raz pierwszy muszą ustalić miedzy sobą kto wyżej stoi w tym układzie, a kto niżej. Nowego królika należy najpierw przebadać u weterynarza, kwarantanna \"nowego\" powinna trwać dwa tygodnie. To ważne ponieważ uszak może mieć pasożyty bądź chorobę, która zarazi naszego futrzaka. Króle nie powinny się widzieć przez ten czas. Po okresie kwarantanny rozpoczynamy zaprzyjaźnianie.</br>" + 
					"</br>" + 
					"Nigdy nie wolno puszczać królika na terytorium innego uszaka! Wywoła to niepotrzebna agresje.</br>" + 
					" </br>" + 
					"1. Musimy znaleźć czas np. weekend dobrze się do tego nadaje, zaprzyjaźnianie może potrwać kilka dni.</br>" + 
					"2. Musimy wybrać neutralne pomieszczenie, które żaden królik nie traktuje jako swoje terytorium. Może to być większa łazienka, kuchnia, przedpokój. Należy mieć świadomość, że to pomieszczenie będzie zajęte przez kilka dni.</br>" + 
					"3. Ustawiamy domki tekturowe (każde musi mieć dwa wyjścia), kuwetę ze żwirkiem, wodę (przynajmniej dwie miseczki) i siano, rozrzucamy zieleninę i warzywa.</br>" + 
					"4. Wszystkie niebezpieczne rzeczy typu kable, książki trzeba pochować.</br>" + 
					"5. Dywany lepiej zwinąć ponieważ króliki mogą znaczyć siebie i teren strumieniami moczu.</br>" + 
					"6. Wpuszczamy króliki</br>" + 
					"</br>" + 
					"Bardzo rzadko zdarza się miłość od pierwszego wejrzenia. Najczęściej po krótkim zlustrowaniu pomieszczenia i siebie dochodzi do konfrontacji. Najważniejsze to nie wtrącać się i zachować spokój.</br>" + 
					"Króliki mogą: </br>" + 
					"- przeganiać i gonić się,</br>" + 
					"- wyrywać sobie kłęby sierści</br>" + 
					"- podgryzać i gryźć się</br>" + 
					"- ujeżdżać się</br>" + 
					"- warczeć i tupać</br>" + 
					"- skryć się w domku</br>" + 
					"- skulić się w kąciku</br>" + 
					"- odganiać słabszego od jedzenia</br>" + 
					"- zmieniając się miejscami wyskakiwać w górę i kopać się skokami</br>" + 
					"- boksować przednimi łapkami</br>" + 
					" </br>" + 
					"Tylko w dwóch przypadkach musimy się wtrącić</br>" + 
					"1. Jeśli któryś uszak został mocno skaleczony</br>" + 
					"2. Jeśli króliki tak mocno się  w siebie wczepiły, że widzimy tylko kłąb ciał</br>" + 
					"</br>" + 
					"Rozdzielamy króliki np. rzucając na nie koc, poszkodowanego/nych dokładnie oglądamy, opatrujemy rany i puszczamy. Jeśli dojdzie do następnych silnych okaleczeń rozdzielamy króliki na okres dwóch - trzech tygodni do osobnych pokoi. Po tym okresie musimy zacząć zaprzyjaźnianie od nowa. Bywa i tak, że króliki zupełnie nie są dla siebie stworzone, zamiast skazywać królika na samotność powinniśmy mu znaleźć innego partnera. Czasami można się umówić ze schroniskiem na próbną konfrontacje dwóch królików.</br>" + 
					"</br>" + 
					"Wracając do naszego zaprzyjaźniania, jak już napisałam wcześniej może trwać od kilku godz. do kilku dni. Nie dajmy się ponieść litości. Jeśli rozdzielimy uszaki będziemy musieli zacząć wszystko od początku. Króliki muszą miedzy sobą ustalić hierarchie, tak jest w naturze i tak samo odbywa się to u naszych królików. Jeśli zauważymy, że króliki leżą koło siebie, jedzą razem i myją sobie futerka - najgorsze mamy za sobą. Poczekajmy dla pewności jeszcze jeden dzień i możemy zacząć przeprowadzkę do docelowego miejsca zamieszkania królików. Myjemy zagródkę dokładnie, możemy poprzestawiać znajdujące się w niej przedmioty. Najpierw wpuszczamy nowego królika niech w spokoju zwiedzi wszystkie kąty. Wpuszczamy domownika. Może dojść do nowych krótkich walk na nowym terytorium to normalne. Króliki szybko dojdą do porozumienia. Przed Tobą niesamowity widok dwóch przytulonych króliczków, myjących się nawzajem, sprzeczających o liść mlecza, ganiających się wesoło po zagrodzie, rozkopujących Twoje kwiaty doniczkowe, wspierających się w chorobie i w robieniu głupot.</br>" + 
					" </br>" + 
					"Warto było."));
			
			careService.create(new Care(8L, "Świnka morska", "Te zwierzaki są bardzo spokojnymi, towarzyskimi stworzeniami. Dlatego często są trzymane razem, w jednej klatce. Cierpią po cichutku przez wiele lat, a ich milczenie jest interpretowane jako akceptacja i przyjaźń. Ta przyjaźń to bycie razem z przymusu. Świnka tęskni za druga świnką, a królik za obecnością królika. Mimo, że razem to obydwoje są bardzo samotni. Oba zwierzaki bardzo różnią się od siebie i na tym polu dochodzi do nieporozumień.</br>" + 
					"</br>" + 
					"Oto kilka przykładów:</br>" + 
					"- Króliki porozumiewają się głównie mową ciała również poprzez zapach, świnki mają bardzo dobrze rozwinięta mowę, gwizdami, turkotaniem i wieloma innymi odgłosami porozumiewają się między sobą. Taka wymiana między królikiem, a świnką jest niemożliwa.</br>" + 
					"- Króliki potrzebują kontaktu cielesnego z drugim królikiem, przytulania, powitania, wzajemnego  mycia. Świnki potrzebują kontaktu wzrokowego i za pomocom głosu, bardzo dużo rozmawiają ze sobą. Nie myją się nawzajem, utrzymują dystans,  przytulają się tylko w sytuacji stresowej,</br>" + 
					"- Króliki mielą ząbkami, gdy jest im dobrze, dla świnek jest to sygnał ostrzegający (nie zbliżaj się)</br>" + 
					"- Króliki zniżają głowę gdy domagają się mycia i czułości, dla świnek jest to oznaka poddaństwa</br>" + 
					"- Króliki podczas witania wąchają się także w okolicach ogona, dla świnki jest to oznaka seksualnego zainteresowania i prosiak będzie się bronił i uciekał, dla królika zupełnie niezrozumiała sytuacja.</br>" + 
					"</br>" + 
					"Problemem w obcowaniu tych dwóch zwierzątek jest też wielkość, króliki są przynajmniej 1,5 razy większe od świnek. Łatwo mogą zrobić śwince krzywdę, nawet przez nieuważne stąpniecie lub bieg na oślep w chwili paniki. W okresie dojrzewania samczyki jak i samiczki królików mogą stać się agresywne, rzucać się drapiąc i gryząc świnkę, lub ujeżdżając ją bez końca. Królica w ciąży urojonej będzie broniła swojego gniazda, świnka ma małe szanse, aby się obronić, czy gdzieś schronić. Szczególnie jeśli trzymane są w sklepowej klatce.</br>" + 
					" </br>" + 
					"Trzymanie tych dwóch gatunków razem nie jest jednak niemożliwe. Ważne żeby zarówno świnka, jak i królik mieli przynajmniej jednego partnera swojego gatunku.</br>" + 
					"</br>" + 
					"- Króliki nie mogą być agresywne w stosunku do świnek ani innych zwierząt.</br>" + 
					"- Zagroda musi być duża, na każdego królika 2 m2 + na każda świnkę 0,50m2, idealny byłby pokój króliczy, bądź duża zagroda na dworze.</br>" + 
					"- Świnki powinny mieć swój kącik z domkami, tunelami, hamakami, gdzie będą mogły wypoczywać i gdzie królik nie będzie mógł wejść.</br>" + 
					"- Dla królików konieczne są podwyższone miejsca niedostępne dla świnek.</br>" + 
					"- Oba gatunki powinny mieć możliwość zejścia sobie z oczu :)</br>" + 
					"- Należy zwracać uwagę, czy wszystkie zwierzaki maja swobodny dostęp do jedzenia i wody, na tym polu też może dochodzić do ograniczeń ze strony królików i sprzeczek.</br>" + 
					"- Konieczna jest kastracja samców zarówno królików jak i świnek.</br>" + 
					"</br>" + 
					"Moje króliki mieszkają wolno, korzystają z kuwet w łazience i toalecie, śpią: Fisio pod łóżkiem w sypialni, Floke albo u prosiaków, albo w pobliżu prosiaków, a jak chce mieć spokój lub jest gorąco to w kibelku na dywaniku :) Świnki mają swój kącik, jedną ściankę zrobiłam niżej żeby w każdej chwili mogły sobie wyjść i pospacerować. Prosiaki nie oddalają się od zagródki. Biegają w takiej odległości żeby w razie zagrożenia czmychnąć do domków. Zarówno prosiaki jak i króliki są do siebie pokojowo nastawione, jednak zauważalne jest, że świnki preferują swoje towarzystwo. Floke chyba nie widzi za bardzo różnicy i opiekuje się tym kto jest akurat w pobliżu, jak trafi się Fisio to myty jest Fisio, a jak nasza staruszka Lucy (świnka) no to myta jest świnka.</br>" + 
					"</br>" + 
					"Spotkałam się w necie z ostrzeżeniem, że króliki przenoszą na świnki E. Cuniculi, tak, zgadza się, ale i świnki są nosicielami tego pierwotniaka, więc takie samo prawdopodobieństwo zachorowania świnek jest gdy dołączamy do stada nową świnkę jak i królika. Nosicielami e.c mogą być też szczury, koty, psy, myszy, chomiki, podobnie jest z bordetella bronchiseptica. My sami możemy naszego pupila zarazić zapaleniem płuc np. a on nas zapaleniem opon mózgowych bądź grzybicą. Nie odstrasza nas to jednak od trzymania w domu zwierząt, nawet od spania z nimi i bardzo dobrze, bo nie wyobrażam sobie bez nich życia :)"));
			
			careService.create(new Care(8L, "Koszatniczka-chomik", "Niestety, z racji rozmiaru ciała, wspólne przebywanie z królikiem jest niemożliwe. Może dojść do sytuacji, iż królik niechcący swoją masywną budową ciała zrobi mniejszemu koledze krzywdę. Pod okiem opiekuna zwierzaki mogą się tolerować jednak pozostawienie ich samych sobie zdecydowanie odradzamy!!! Koszatniczka wolała by partnera w swoim gatunku, tak samo jak królik. Chomik natomiast jest zwierzakiem, który zdecydowanie preferuje samotne życie.</br>" + 
					"</br>" + 
					"Królik jest zwierzęciem stadnym, dlatego powinien posiadać choć jednego partnera swojego gatunku!!!  Nie możemy o tym zapominać ani tego lekceważyć!!! "));
			
			careService.create(new Care(8L, "Pies-kot", "Taka przyjaźń jest możliwa, aczkolwiek raczej okazjonalna. Mogą wzajemnie się tolerować, spędzać czas, ale ich mowa ciała i temperamenty raczej nie pozwolą na wzajemne zabawy do upadłego czy miłość aż po grób.</br>" + 
					"</br>" + 
					"Zaprzyjaźnianie:</br>" + 
					"- przebiega tak samo jak w przypadku innych zwierząt (czyt., świnka morska)</br>" + 
					"</br>" + 
					"Królik jest zwierzęciem stadnym, dlatego powinien posiadać choć jednego partnera swojego gatunku!!!  Nie możemy o tym zapominać ani tego lekceważyć!!! "));
			
			careService.create(new Care(8L, "Człowiek", "Tak to jest cudowna przyjaźń :) ale choć by człowiek stawał na głowie i kochał całym sercem, to nie jest w stanie poświęcić uszatemu tyle czasu ile on potrzebuje. Może go przytulać i całować, ale nie wyliże mu oczu i uszków tak ja by to zrobił drugi królik. No i niestety nie pobawi się z nim do upadłego o 4 nad ranem. A to tylko nieliczne przykłady.</br>" + 
					"  </br>" + 
					"Królik jest zwierzęciem stadnym, dlatego powinien posiadać choć jednego partnera swojego gatunku!!!  Nie możemy o tym zapominać ani tego lekceważyć!!!"));
			
			careService.create(new Care(9L, "Za/przeciw", "</br>" + 
					"Im więcej na ten temat czytam tym bardziej jestem przekonana że każdy musi sam podjąć decyzje. Generalnie zdania są podzielone. Jedni są za zabraniem królika ze sobą inni przeciw.</br>" + 
					"   </br>" + 
					"Jaki mamy wybór:</br>" + 
					"a) możemy królika zabrać ze sobą</br>" + 
					"b) zostawiamy uszatka w domu i zapewniamy mu opiekuna dochodzącego</br>" + 
					"c) zostawiamy malucha w domu kogoś z rodziny, bądź znajomych</br>" + 
					"d)oddajemy królika do tzw. Hoteli dla zwierząt.</br>" + 
					"</br>" + 
					"Zabieramy królika ze sobą - każdy królik ma swoją osobowość, a co za tym idzie inną odporność na stres. Niewątpliwie podroż jest dla uszatych sytuacją stresową. Zmiana miejsca, doświadczanie wielu nowych dźwięków, nie jest miłe. Ale czasami są sytuacje kiedy po prostu nie ma innego wyjścia i Kicek musi jechać z nami. Warto taką podróż zaplanować wcześniej, sprawdzić dokładnie na mapie najkrótszą trasę dojazdu samochodem bądź najszybsze połączenie autobusowe lub pociągiem. Uszatego przewozimy w transporterku. Ponieważ króliki na stres często reagują biegunką bądź zaparciem, warto do swojej podróżnej apteczki dołączyć espumisan na wzdęcia i herbatkę  z suszonych jagód na biegunkę. Wyjeżdżając za granice musimy dostosować się do zasad panujących w kraju do którego się udajemy. Koniecznie musimy posiadać świadectwo zdrowia wystawione przez służby weterynaryjne. Zaświadczenie to uprawnia do przewozu zwierzaka za granice i jest ważne tylko 10 dni. Obojętnie czy wakacje spędzamy w Polsce czy zagranicą, przed wyjazdem koniecznie upewnijmy się że wybrany przez nas środek transportu zgadza się na przewóz zwierząt.</br>" + 
					"</br>" + 
					"Uwaga: możemy zmniejszyć stres uszatka podając mu przed podróżą krople Bacha rescue, 3 kropelki na ulubiony owoc lub rozcieńczone z woda bezpośrednio do pyszczka.</br>" + 
					"</br>" + 
					"Zostawiamy królika w domu - pod warunkiem że uda nam się zapewnić mu opiekuna dochodzącego, który zadba o czystość w kuwecie i klatce, oraz uzupełni braki siana wody i warzyw </br>" + 
					"Bardzo ważne aby wybrać do tego odpowiedzialną osobę, która opiekę nad naszym pupilem potraktuje bardzo poważnie. Najlepiej jeśli opiekun byłby osobą znajomą królikowi - zawsze to mniejszy niepokój gdy intruz pojawi się w domu. Koniecznie przed wyjazdem spotkajmy się z opiekunem aby dokładnie mu wytłumaczyć na czym polega opieka nad królikiem, jak i kiedy podawać kolejne posiłki. Zostawić notatki z podstawowymi objawami chorób oraz telefon alarmowy do weterynarza oraz nasz prywatny. Najlepiej skład kolejnych posiłków również dobrze jest umieścić w rozpisce na kartce papieru. Zostawić opiekunowi pieniądze, na zakup pożywienia (jeśli wyjazd jest dłuższy), oraz na ewentualna wizytę u weterynarza.</br>" + 
					" </br>" + 
					"Zostawienie malucha u kogoś w domu w sumie równa się oddaniu królika do hotelu. I to i to jest dla malucha nowym miejscem, ma nowy zapach. Często również w towarzystwie innych zwierząt. Pamiętajmy że korzystamy z czyjejś gościnności więc wielu zasadą i my musimy się pod porządkować. Również w tej sytuacji przekazujemy potencjalnym opiekunom spisane na kartce zasady i rozpis żywienia, telefony alarmowe, oraz objawy chorób. Jedyna różnica jak tu ma miejsce, to w domu naszych znajomych bądź rodziny zawsze jest szansa na lepszą opiekę i zainteresowanie zwierzakiem, natomiast w hotelu nasz pupil będzie jednym z wielu zwierząt do opieki.</br>" + 
					"</br>" + 
					""));
			
			careService.create(new Care(9L, "Transporter", "Służy do transportu zwierząt, na co zresztą sama nazwa wskazuje. Transporter dla królika musi być odpowiednio duży żeby królik mógł spokojnie i wygodnie się w nim położyć. Podczas podroży wkładamy do transporterka tylko siano, nie mocujemy poidełka z wodą, a tym bardziej nie stawiamy w środku miseczki z woda. W czasie jazdy stawiamy go w stabilnym miejscu . Po każdej podroży czyścimy go, aby zachować higienę. Obecnie w sklepach zoologicznych jest duży wybór jeśli chodzi o kolorystykę jak i formę."));
			
			careService.create(new Care(10L, "Szelki", "Dużo królików za nimi nie przepada, co jest rzeczą naturalna. Szelki choć nawet idealnie dobrane zawsze w pewien sposób krępują ruchy no a w połączeniu ze smyczą  sprawiają, że uszaty nie może iść tam gdzie sam by chciał.</br>" + 
					"Nigdy nie używamy obroży i smyczy jakie są przeznaczone dla psów, bowiem grozi to uduszeniem i śmiercią królika.</br>" + 
					"W sklepach zoologicznych do kupienia są specjalne szelki przeznaczone dla królików. Należy odpowiednio przystosować ich obwód do rozmiarów naszego pupila. Króliki są bardzo delikatnymi zwierzakami, wiec nigdy nie postępujmy z nimi na siłę próbując im założyć szelki. wszystko musi odbywać się stopniowo, łącznie z nauka chodzenia na smyczy. Jeśli królik, się denerwuje przy spacerze powinniśmy przemyśleć rezygnacje z szelek i poszukać innej alternatywy na spacer np.: zagroda. W chwili obecnej na rynku godne polecenia są dwa rodzaje szelek</br>" + 
					"Jeśli chodzi o bezpieczeństwo naszego pupila nie polecałabym również szelek na ściągaczu, nie posiadają zatrzasków, przez co samo zakładanie jest bardziej stresujące dla królika.</br>" + 
					"Wiele osób chcąc zabrać maluchy na spacer, dla ich bezpieczeństwa są zmuszone używać szelek. "));
			
			careService.create(new Care(10L, "Zagroda na balkonie", "Może być okazyjna,  sezonowa bądź całoroczna. Po wstępnym zabezpieczeniu balkonu siatka, (o malutkich oczkach, aby nie było możliwości by królik się przecisnął) aby nie doszło do tragedii i nasz pupil nie wypadł z balkonu. Zagrodę okazyjną można wykonać z nici Cubes, bądź zrobić samemu czy kupić. Służy ona głównie temu aby królik w cieple dni mógł zaczerpnąć świeżego powietrza. W środku powinien znajdować się kocyk, miska z woda i jedzeniem i transporterek bądź karton kiedy królik zapragnie się schować.</br>" + 
					"Zagroda sezonowa dotyczy przebywania królika na balkonie całą dobę w okresie letnim. Zagroda ta musi być odpowiednio przystosowana, do nagłej zmiany pogody jak deszcz czy ochłodzenie. Musi posiadać daszek, aby królikowi nie padało. Oraz ocieplone miejsce gdzie maluch może się schować na noc bądź kiedy mu zimno. </br>" + 
					"Natomiast zagroda całoroczna wymaga precyzyjnego planu.  Powinna być częściowo zabudowana, aby Kicek miał ciepło i sucho. Najlepiej ocieplić ją styropianem lub płytami drewnianymi umieszczonymi miedzy ściankami. Bardzo ważne jest aby odpowiednio ocieplić podłogę. Najlepiej jeśli klatka jest ustawiona na nóżkach wtedy jest większa izolacja miedzy nią a zimnym betonem. Polecanym pomysłem zwłaszcza do stosowania nocą jest nakrycie klatki grubą kołdrą i ociepleniem spora ilością słomy. Na balkonie w zimie królik może zostać tylko pod warunkiem jeśli ma futro zimowe. Futro to wykształci się jeśli uszak będzie przebywał na dworze od lata. Zwierzaki,  które cały rok mieszkają na balkonie bądź ogródku dobrze znoszą minusowe temperatury, warunkiem są ocieplony domek, duża powierzchnia do biegania, partner i pod dostatkiem pożywienia. Aby nie dopuścić do zamarzania wody możemy do miseczki włożyć piłeczkę pingpongowa.  Nie zapominajmy, że jeśli planujemy trzymać królika na balkonie to powinien mięć on towarzysza do którego będzie mógł się przytulic w chłodniejsze dni, z którym będzie mógł biegać i bawić się kiedy nas nie będzie. Bez partnera królik będzie osamotniony, wykluczony z życia rodzinnego i nieszczęśliwy.</br>" + 
					" </br>" + 
					"Wyposażenie zagrody jest takie same jak klatki w domu, miseczki z woda i jedzeniem, kuweta paśnik, zabawki. Nie wolno nam do puścić aby królik przebywał na mokrym dywaniku bądź kocyku, powoduje to bowiem częste choroby dróg moczowych. oraz przeziębienia. Konieczne są szczepienia - raz w roku przeciwko pomorowi i dwa razy do roku przeciwko myksomatozie.</br>" + 
					"</br>" + 
					"Przyzwyczajać królika do zmiany otoczenia należy stopniowo najpierw na kilka godzin zapoznawać królika z nowym domkiem na balkonie. Z każdym dniem dłużej, jednak na noc zostawiamy dopiero po zniknięciu pierwszych przymrozków."));
			
			careService.create(new Care(10L, "Zagroda w ogrodzie", "Zagroda w ogrodzie dla królika to fantastyczne rozwiązanie. Królik ma w niej dużo więcej swobody niż w domowej klatce. Im większa tym lepsza, pod warunkiem oczywiście, że jest tak skonstruowana, że zapewnia królikowi maksimum bezpieczeństwa. Pamiętajmy że na naszych działkach, podwórkach, bądź ogrodach często pojawiają się inne zwierzaki, które mogą stanowić niebezpieczeństwo. Taki kojec/zagrodę można zrobić samemu, bądź kupić już gotową.</br>" + 
					"Można wykorzystać do tego również nic Cubes. Powinna być zabezpieczona siatka (o bardzo malutkich oczkach, aby nie mogły się przecisnąć łasiczki) z każdej strony, łącznie z góra i dołem zagrody. Bardzo ważne aby zamykana góra była przymocowana, dzięki czemu lis czy kot za pomocą łapy nie będzie  mógł odchylić siatki. Siatka na dole ważna jest, ponieważ uszatki kopią niesamowicie głębokie tunele, przez które mogły by się wydostać z zagrody. A tam już czyha nie jedno niebezpieczeństwo. Siatkę umieszczoną na dole zagrody wkopujemy w ziemię. Absolutnie nie mogą wystawać ostre gwoździe, czy inne śruby, wkręty na które może nadziać się uszaty. Nie stawiajmy zagrody, bezpośrednio na słonce, zdecydowanie lepsze jest miejsce w pół zacienione. Królik może sam decydować czy wylegiwać się na słoneczku czy ukryć w cieniu. Jeśli zdecydujemy się na zagrodę całoroczną, musimy zastosować się do zasad opisanych w (patrz. Zagroda na balkonie). Nie zapominajmy że w środku stawiamy miskę z woda oraz transporter, bądź karton gdzie w razie potrzeby królik może się schować. Nic królikowi nie zastąpi towarzysza swojego gatunku. Bez partnera królik będzie osamotniony, wykluczony z życia rodzinnego i nieszczęśliwy."));
			
			careService.create(new Care(10L, "Niebezpieczeństwa nma spacerze", "Głównym niebezpieczeństwem jakie nas i naszego pupila może spotkać w czasie spaceru to inne zwierzaki. Bardzo dużo jest biegających luzem psów i kotów. Na terenach łąkowych musimy mieć oczy do okoła głowy. Musimy chronić królika przed ptakami, lisami, polnymi zaskrońcami, kleszczami, a nawet owadami jak pszczoły, bąki, szerszenie. Kolejnym zagrożeniem są wszelkiego rodzaju rośliny i krzewy. Królik nie wszystkie może jeść. Miniaturki z racji wychowywania się w domach mają zatracony instynkt i nie są w stanie samemu określić co może im zaszkodzić, a co nie. Dlatego warto przed spacerem zapoznać się z listą Roślin trujących dla królików.</br>" + 
					"Na miejsce spaceru zdecydowanie wybierajmy miejsca, mało uczęszczane. Uszatki nie lubią bowiem hałasu, a przecież spacer to ma być sama przyjemność. Niebezpieczeństwem są też jeżdżące samochody, może bowiem się zdarzyć iż przestraszony królik wymknie się nam z rąk .... a potem przy jeżdżących samochodach o tragedie już nie trudno. Przyroda jest pełna niebezpieczeństw, ale warto jednak zachować środki ostrożności i spacerować."));
			
			careService.create(new Care(10L, "Zima", "Mówi się że królik ma przecież futro... To prawda, ale miniaturki żyjące w domach, w których jest ciepło nie mają sposobności zmieniać futerka na zimowe, bardziej cieplejsze. Dlatego podczas spaceru zimą mogą od czuwać chłód. Krótki spacer nie jest zakazany, ale wszystko powinno być z umiarem aby nie skończyło się przeziębieniem."));
			
			careService.create(new Care(10L, "Lato", "Króliki są bardzo podatne na upał i wysokie temperatury. Bardzo często zdąża się że króliki na skutek udaru słonecznego umierają. Nigdy nie wystawiamy królika bezpośrednio na słońce!!!Starajmy się wszelkie niedogodności zminimalizować najwięcej jak się da. Im chłodniej w pomieszczeniu w którym przebywa uszaty tym lepiej. Można położyć butelki z zamrożoną wodą, zawsze kiedy maluch znajdzie się w pobliżu butelki poczuje przyjemny  chłód. Zimna woda w miseczce, oraz dostęp do świeżych warzyw zapobiegnie odwodnieniu malucha. Wszelkie zimne powierzchnie stanowią dla królika w upalne dni ratunek. Dlatego Kicki lubią wtedy spacerować po kuchennych kafelkach.</br>" + 
					"</br>" + 
					"Utrzymujmy czystość w kuwecie!!!</br>" + 
					"</br>" + 
					"Bardzo często opiekunowie uszatych nie zdają sobie sprawy z powagi sytuacji, jaką jest możliwość dostania udaru słonecznego. Najczęstsze objawy to przekrwienie naczyń krwionośnych, stopniowe odmawianie pokarmu oraz przyspieszony oddech, zdecydowane przegrzanie ciała. Ratunkiem jest szybka wizyta u weterynarza. Sami w czasie drogi do weterynarza  możemy stopniowo próbować obniżać temperaturę ciała królika zimnymi okładami.</br>" + 
					""));
			
			careService.create(new Care(11L, "Noworodki - sztuczne karmienie i opieka", "Do karmienia osieroconych maluszków musimy podejść bardzo poważnie. Karmimy je co cztery godziny 1ml mleka zastępczego. Stopniowo dawkę tą zwiększamy. Pamiętajmy iż mleko zastępcze nie jest tak tłuste jak mleko królicy. Karmimy strzykawką z mlekiem kozim lub specjalnym mlekiem dla kociąt, które możemy kupić u weterynarza. Aby poprawić pracę jelit maluszka warto do mleka dodać odrobinę lakcidu. Mleko zamiast w wodzie można rozrobić w herbatce koperkowej lub rumiankowej. Maluszka karmimy trzymając prostopadle na kolanach z lekko uniesiona główka,</br>" + 
					"aby maluch się nie za krztusił. Mleczko podajemy bardzo powoli. A jego ilość musimy dopasować do królika, zbyt obfita ilość spowoduje wzdęcia. Po każdym podaniu pokarmu naśladując zachowanie króliczej mamy, która liże malucha po brzuszku stymulując tym samym malucha do wypróżnienia. Za pomocą wacika zmoczonego w cieplej wodzie masujemy delikatnie odbyt królika ruch te stymulują go do zrobienia siusiu oraz kupki. Zabieg ten powtarzamy po każdym posiłku do czasu kiedy maluszek otworzy oczka ok. 10 dnia. 14 dnia  można stopniowo zacząć do diety maluszka wprowadzać siano, i wodę. A od 4tyg zieleninę. Przestajemy karmić maluszka mlekiem po upływie 6tyg. życia. Dokładnie tak samo zrobiłaby jego mama. Koniecznie należy dbać o higienę zarówno jeśli chodzi o dostarczany pokarm jak i higienę gniazda. Gniazdo tworzymy w kartonie od spodu wyłożonego ręcznikami, a następnie sianem, od góry przyciemniamy ręcznikiem do czasu aż maluszek otworzy oczka. Temperatura w pomieszczeniu gdzie przebywa maluch powinna wynosić ok. 20 C. Nie możemy dopuścić do przegrzania malucha ani do wyziębienia. W takich sytuacjach warto w domu mieć termofor lub mate grzewcza. Dbajmy o malucha pod czujnym okiem weterynarza."));
			
			careService.create(new Care(11L, "Sterylizacja (kastracja samiczki)", "Będę używać tego potocznego terminu dla odróżnienia operacji wykonywanej u samiczki od kastracji samca, lekarze weterynarii też używają tego określenia. Sterylizacja jest to operacyjne usuniecie macicy i jajników.</br>" + 
					"</br>" + 
					"Kiedy jest wykonywana:</br>" + 
					"- z powodu wykrytych zmian chorobowych w układzie rozrodczym,</br>" + 
					"- profilaktycznie, aby zapobiec rakowi, ropomaciczu, czy guzów listwy mlecznej,</br>" + 
					"- z powodu częstych ciąż urojonych, rui permanentnej, agresji, wyładowywania się na partnerze.</br>" + 
					"</br>" + 
					"Sterylizacje można wykonać już w 5 miesiącu życia, górna granica właściwie nie istnieje. Powinniśmy wybrać sprawdzonego weterynarza, najlepiej korzystając z rad forumowiczów na forach króliczych. To trudniejsza operacja niż w przypadku samca, mogą wystąpić powikłania podczas narkozy i podczas wybudzania, dlatego ważne jest żeby przeprowadzał ją doświadczony lekarz.</br>" + 
					"</br>" + 
					"Przed operacją królica może jeść siano i pić wodę. Na 6 godz. przed narkoza zrezygnujmy z podawania granulatu i warzyw, podane przed operacja mogą być przyczyna wzdęcia. U weterynarza uszak zostanie dokładnie zbadany i zważony. Najlepsza narkoza podczas sterylizacji jest narkoza wziewna, nie obciąża tak układu krążenia, łatwiej ją kontrolować i królik szybciej się wybudza. Lekarz wykona ciecie 3-5 cm, usunie jajniki i macice. Weterynarz powinien założyć podwójny szew na wypadek, gdyby królik niepostrzeżenie dobrał się do rany i przeciął nici. Zapobiegawczo możemy w klinice kupić uszakowi kaftanik , odradzam kołnierz, ponieważ jest bardzo niewygodny dla uszaka i niepotrzebnie go stresuje.</br>" + 
					"</br>" + 
					"Dobry lekarz nigdy nie odda królika w pełni niewybudzonego, nie zgódźmy się na odebranie królika jeśli jeszcze śpi. Po operacji uszak dostanie środek przeciwbólowy i antybiotyk, które będą tez podawane przez kilka dalszych dni. Do transporterka możemy włożyć owinięty ręcznikiem termofor, utrzyma on ciepło podczas podroży. W domu zapewnijmy królikowi spokojny, zaciszny kąt z siankiem i woda w zasięgu wzroku. Klatka powinna być wyłożona ręcznikiem, w toalecie zamiast żwirku połóżmy ręczniki papierowe. Rozdzielenie od partnera nie jest konieczne, jeśli króliczy przyjaciel jest spokojny i nie przeszkadza królicy.</br>" + 
					"</br>" + 
					"Po dwunastu godzinach od narkozy królik powinien zacząć jeść, możemy go do tego zachęcić podając koperek, bazylie czy ulubione suszone zioła. Jeśli uszak nie ma apetytu należy zacząć dokarmianie. Najlepiej do tego nadaje się gotowy preparat Critical care, zupki warzywne dla niemowląt lub rozmoczony w rumianku granulat. Zwracajmy tez baczna uwagę na to czy królik pije, jeśli nie robi tego samodzielnie, należy go dopajać. Szew powinien być dwa razy dziennie kontrolowany, w razie gdyby był obrzmiały, mokry lub gdyby się rozszedł konieczna jest ponowna wizyta u weterynarza. Jeśli samiczka bardzo się nim interesuje, próbuje wyjąć szwy powinniśmy założyć jej kaftanik. Po 10 dniach lekarz zdejmuje szew.</br>" + 
					"</br>" + 
					"Samiczki królika są narażone na choroby układu rozrodczego tak samo jak inne zwierzęta i ludzie. Z wiekiem wzrasta ryzyko zachorowania. Z relacji weterynarzy i wolontariuszy SPK wynika, że większość profilaktycznie sterylizowanych królic ma już zmiany chorobowe na jajnikach czy macicy. W początkowym stadium nie dają one żadnych wcześniejszych objawów.</br>" + 
					"</br>" + 
					"Opiekunów, którzy posiadają nie wysterylizowane królice powinno zaniepokoić: częste ciąże urojone, chudniecie, agresja, ból przy dotyku brzucha, nieprzyjemny zapach z okolic ogonka, zgrubienia na listwie mlecznej, krwawe ślady w zagródce lub zakrwawione futerko. Przy w/w objawach należy niezwłocznie skonsultować się z lekarzem i po zrobieniu zdjęcia RTG lub USG  rozważyć przeprowadzenie sterylizacji.</br>" + 
					" </br>" + 
					"Uwaga: operacja u samiczek jest bardziej skomplikowana niż. u samców, aby uniknąć powikłań należy bardzo starannie wybrać lekarza weterynarii, najlepiej korzystając z doświadczenia forumowiczów na forach króliczych i wolontariuszy SPK."));
			
			careService.create(new Care(11L, "Kastracja samca", "Z różnych powodów kastrujemy swoje uszaki. Ja zrobiłam to, bo nie chciałam, żeby moje zwierzaki żyły samotnie. Dwa niekastrowane samce nie mogą być trzymane razem, grozi to poważnymi walkami i uszkodzeniami ciała. Samiec i samiczka to super kombinacja, ale obfitująca w liczne niechciane mioty. Innymi powodami kastracji jest agresja i znaczenie terenu, bardzo uciążliwe dla opiekuna i stresujące dla królika. Bardzo rzadkim powodem kastracji jest rak jąder.</br>" + 
					"</br>" + 
					"Kastracja polega na usunięciu obu jader, zabieg przeprowadzany jest pod narkozą. Trwa mniej więcej 15 minut. Kastruje się uszaki od 3 miesięcy w zwyż, w zasadzie nie ma górnej granicy.</br>" + 
					"Zanim zdecydujemy się na zabieg poszukajmy dobrego sprawdzonego weterynarza. Na wielu króliczych forach można znaleźć polecanego lekarza, cieszącego się dobra opinią.</br>" + 
					" </br>" + 
					"Przed zabiegiem królik może normalnie jeść, to ważne, królicze jelita i żołądek muszą cały czas pracować. Króliki nie potrafią wymiotować także zachłyśnięcie podczas operacji nie stanowi zagrożenia. Na sześć godzin przed operacją zostawmy królika na samym sianie, suszkach i wodzie. Zrezygnujmy z podawania granulatu i zieleniny, długo zalęgający w żołądku ww. pokarm może doprowadzić do wzdęć.</br>" + 
					"</br>" + 
					"Lekarz dokładnie zbada królika, osłucha serduszko, zmierzy temperaturę i zważy królika. Jeśli wszystko będzie ok. wstrzyknie mu dobrana do wagi dawkę narkozy, po chwili uszak już będzie w objęciach morfeusza.</br>" + 
					" </br>" + 
					"Po wszystkimi powinniśmy dostać królika już wybudzonego, będzie to jedna zmęczona kupka nieszczęścia, oczka zaczerwienione i posklejane maścią nawilżająca, zmierzwiona sierść i drżące ciałko.</br>" + 
					" </br>" + 
					"Powinniśmy już w domu przygotować termofor z ciepła woda, owinąć go ręcznikiem i włożyć do transporterka. Króliki po narkozie są zwykle zziębnięte i narażone na przeziębienie. Po przywiezieniu do domu zapewnijmy małemu pacjentowi ciepły, zaciszny kącik z siankiem i wodą w zasięgu wzroku, pozwólmy mu odpocząć.</br>" + 
					"</br>" + 
					"Kuweta w klatce powinna być wyłożona papierem zamiast granulatu lub żwirku, ostre granulki mogą urażać świeżą ranę pooperacyjną, a nawet ją uszkodzić. Po kilku godzinach od zabiegu uszak powinien zainteresować się jedzeniem, pierwsze bobki wskażą nam, że układ pokarmowy podjął swoja prace. Możemy zachęcić królika do jedzenia podając mu koperek czy bazylie. Codziennie kontrolujmy szew, z początku jąderka będą opuchnięte, ważne żeby nic się z nich nie sączyło. Na drugi dzień  po zabiegu królik powinien już normalnie jeść, poruszać się, bobkować, a nawet psocić. Gdyby nie miał apetytu, nie bobkował lub nie sikał, siedział nastroszony lub zgrzytał z bólu zębami musimy natychmiast zabrać go do weterynarza.</br>" + 
					"</br>" + 
					"Pamiętajmy, że wykastrowany królik jest jeszcze przez 3-6 tygodni płodny, dopiero po 6 tygodniowym okresie kwarantanny można go połączyć z samiczką. Niepożądane zachowania jak agresja, znaczenie terenu, kopulowanie znikają stopniowo w przeciągu 2- nawet do 6 miesięcy.</br>" + 
					"</br>" + 
					"Kastracja wczesna wykonywana jest w 10-12 tygodniu życia czyli jeszcze przed dojrzewaniem uszaka. Ma ona sens gdy np. kupiliśmy rodzeństwo. Kastrując tak wcześnie zapobiegamy wczesnej ciąży (znam przypadki 3 miesięcznych ciężarnych samiczek) oraz walk na tle terytorialnym pośród samczyków. Króliki wykastrowane do 12 tygodnia życia nie muszą być poddawane 6 tyg. kwarantannie, od razu mogą wrócić do swojej partnerki."));
			
			careService.create(new Care(11L, "Opieka nad samiczką w ciąży", "Ciąża u samiczki trwa średnio od 28 do 33dni. Samiczka musi pozostawać pod stałą opieka lekarza weterynarii. Ciąży towarzyszą objawy jak przy ciąży urojonej - budowa gniazda, agresja. Do czasu porodu żywimy samiczkę jak dotychczas, dodatkowo zwiększając porcje. Zapewnijmy samiczce maksimum spokoju. Poród odbędzie się miedzi 28 a 33 dniem ciąży i najczęściej odbywa się w nocy, bądź nad ranem. Pamiętajmy aby pod żadnym pozorem nie dotykać świeżo urodzonych maluszków. Kontrole gniazda możemy przeprowadzić kiedy samiczka je opuści</br>" + 
					"</br>" + 
					"Na 14 dni przed porodem powinniśmy zacząć podawać królicy zioła wspomagające laktacje.</br>" + 
					"</br>" + 
					"Czarnuszka siewna: wspomaga laktacje</br>" + 
					"Pokrzywa: zwiększa laktacje i wzmacnia kości maluchów.</br>" + 
					"Przywrotnik: działa uspokajająco, hamuje krwawienie, przeciwzapalnie, oczyszcza krew i przyspiesza gojenie. Podaje się samiczce po porodzie, aby zapobiec zapaleniu macicy.</br>" + 
					"Mniszek lekarski: wspomaga laktacje.</br>" + 
					"Rumianek: działa przeciwzapalnie.</br>" + 
					"Melisa i bazylia: zwiększają laktacje.</br>" + 
					"Natka marchewki: wspomaga laktacje.</br>" + 
					"Fenkuł (koper włoski): wspomaga laktacje.</br>" + 
					"Liście malin: wzmacnia układ rozrodczy.</br>" + 
					"Mieszanka nasion i ziół wspomagająca laktacje: nasiona anyżu, nasiona kopru włoskiego, nasiona koperku, nasiona czarnuszki siewnej, suszona melisa i majeranek, wszystko w jednakowej ilości wymieszać.</br>" + 
					"</br>" + 
					"Zioła których należy unikać:</br>" + 
					"Mięta: zmniejsza laktacje.</br>" + 
					"Pietruszka: może wywołać skurcze, hamuje wydzielanie mleka.</br>" + 
					"Szałwia: zmniejsza laktacje.</br>" + 
					"Seler: zmniejsza laktacje.</br>" + 
					"Lubczyk: nie podajemy ciężarnym królicom.</br>" + 
					"Tasznik pospolity: może wywołać skurcze, nie podajemy ciężarnym królicom</br>" + 
					"Jabłko: podawane karmiącej mamie może wywołać u małych biegunkę.</br>" + 
					"Bardzo ważne w okresie karmienia jest pilnowanie, aby mama miała zawsze miskę z czysta woda.</br>" + 
					"</br>" + 
					"Należy dodać więcej siana i słomy, aby królicza mama mogła je wykorzystać na budowę gniazdka. Dobrze by było postawić plotek/zagródkę wokół klatki lub zostawić otwarta klatkę, aby mama po</br>" + 
					"porodzie mogła swobodnie opuszczać gniazdko. To dla niej duży stres przebywać razem z maluszkami i narażać je tym samym na niebezpieczeństwo. Królicza mama odcina pępowinę i zjada popłód (łożysko, pępowinę i błony płodowe). Dokładnie myje malucha, mycie pobudza krążenie noworodka, oraz wzmacnia więź pomiędzy matka a dzieckiem. Może się urodzić od 4 do 10 maluszków, średnio rodzi się 5-6 królików.</br>" + 
					"</br>" + 
					"Uwaga: samiczka po porodzie jest natychmiast płodna, nie należy dopuszczać do spotkania z samcem, ponieważ grozi to następna ciąża.</br>" + 
					"</br>" + 
					"Dzień po porodzie należy ostrożnie zajrzeć do gniazdka, usunąć mocno zakrwawiona ściółkę, sprawdzić czy nie ma martwych królicząt. Nie powinno się bez konieczności dotykać noworodków. Wielu opiekunów martwi się, że królica nie karmi małych, nie troszczy się o nie, nawet ich nie dostrzega. To leży w naturze króliczej. Królicza mama nie chce zdradzić miejsca gniazdka. Dlatego pozornie wydaje się, że nie zwraca uwagi na maluchy i nie opiekuje się nimi. Królica karmi małe średnio raz-dwa razy dziennie, przeważnie w godzinach nocnych i nad ranem, tak, że opiekun tego</br>" + 
					"nie widzi.</br>" + 
					"</br>" + 
					"Mleko mamy króliczej jest bardzo tłuste i starcza maluchom na długie godziny. Bardzo rzadko mama karmi maluchy po urodzeniu, przeważnie odbywa się to następnego dnia. Jeśli chcemy sprawdzić czy maluczki są nakarmione, z samego rana zaglądamy do gniazdka (mama powinna być na wybiegu, aby jej nie potrzebnie nie stresować) okrągłe brzuszki świadczą o zjedzonym posiłku.</br>" + 
					"</br>" + 
					"Zapadnięte, pofałdowane brzuszki są oznaka, że mama ich nie nakarmiła.</br>" + 
					"Możemy spróbować przystawić małe do piersi królicy. Drugim wyjściem jest zaopatrzenie się w specjalne mleko zastępcze dla kociąt i dokarmianie maluchów, wg wskazań lekarza weterynarii. Jeśli zdecydujemy się na dokarmianie, należy maluchy zabrać od mamy aby nie wyrządziła im krzywdy. Dalsze wskazówki na temat sztucznego karmienia są w dziale Noworodki.</br>" + 
					"</br>" + 
					"Po trzech dniach od narodzin pojawiają się włoski, a czwartego dnia można już rozpoznać wzorki na futerku. Po siedmiu maluczki zaczynają słyszeć. Po 10-12 dniach otwierają się oczka. Po trzech tygodniach króliki zaczynają zwiedzać okolice, interesują się też jedzeniem mamy. W czwartym tygodniu jedzą już pokarmy stałe (siano, warzywa, zieleninę), ale nadal piją mleczko mamy, można już rozróżnić płeć. W wieku 6-8 tygodni mama przestaje je karmić. W wieku 12 tygodni należy rozdzielić samczyki od samiczek, maluchy mogą zacząć się rozmnażać między sobą."));
			
			careService.create(new Care(11L, "Ciąża urojona", "Króliki domowe są płodne cały rok, wiosna są bardziej pobudzone i częściej też dochodzi do ciąży urojonej. Także zaprzyjaźnianie i nowy partner/partnerka może spowodować ciąże urojona. Trwa ona 14-18 dni i później wszystko wraca do normy.</br>" + 
					"</br>" + 
					"Objawy:</br>" + 
					"Samiczka jest nadpobudliwa, może być agresywna w stosunek do opiekuna bądź króliczego partnera. Ma słabszy apetyt dlatego może stracić trochę na wadze. Pod koniec ciąży zaczyna budować gniazdko, używa do tego siana, ściółki i własna sierść, którą wyrywa z okolic przednich łap, brzucha i wyściela nią gniazdko. Moja Lilly zatargała do gniazdka ubranka Barbie i czapkę mojej córki. Jak widać samiczki są bardzo kreatywne i posługują się tym co jest dostępne.</br>" + 
					" </br>" + 
					"Niektóre wyrywają futro swojemu partnerowi. Sutki samiczki mogą być powiększone, a nawet mogą wytwarzać mleko.</br>" + 
					"</br>" + 
					"Jeśli królica przechodzi ciążę urojona częściej niż raz - dwa razy w roku należy skonsultować się z lekarzem weterynarii. Ciąże są bardzo stresujące dla samic i ich partnerów, poza tym mogą być przyczyna ropomacicza lub innych chorób układu rozrodczego. Jeśli często się powtarzają powinniśmy pomyśleć o sterylizacji.</br>" + 
					"</br>" + 
					"Samiczkom w ciąży urojonej powinniśmy zapewnić dużo spokoju, nie powinna być zamykana w klatce razem ze swoim partnerem, klatka powinna być stale otwarta inaczej może dojść do bójek i ugryzień. Nie powinno się niszczyć gniazda, to duży stres dla królika i może wywołać agresje, budowa gniazda zacznie się od nowa. Lepiej poczekać, aż królica sama przestanie się interesować gniazdkiem, wtedy można go sprzątnąć.</br>" + 
					"</br>" + 
					"Pożywienie powinno być urozmaicone, można włączyć zioła, które maja działanie uspakajające np. przywrotnik (Alchemilla vulgaris), szałwie, rumianek, bazylie, melisę, fenkuł."));
			
			careService.create(new Care(12L, "Podnoszenie królika", "Prawidłowe</br>" + 
					"Temat niezwykle ważny.</br>" + 
					"Prawidłowo podnosimy królika następująco:</br>" + 
					"-  Jedną rękę wkładamy pod brzuch królika a drugą w tym samym momencie podtrzymujemy pupę malucha. Następnie przytulamy malucha do piersi podtrzymując ręką.</br>" + 
					"</br>" + 
					"</br>" + 
					"Nieprawidłowe</br>" + 
					"-  Nie podnosimy królika za uszy!!!</br>" + 
					"-  Nie podnosimy królika za łapki, ani przednie ani tylnie!!!</br>" + 
					"-  Nie podnosimy królika za skórę na grzbiecie!!!</br>" + 
					"-  Nie podnosimy królika za ogon!!!</br>" + 
					"Każda z w/w. nieprawidłowych możliwości jest nieprzyjemna, bolesna i może być groźna dla zdrowia."));
			
			careService.create(new Care(13L, "Cekotrofy", "Są to przydatne, poddawane fermentacji w jelicie ślepym kawałki karmy. Koprofagią - tak nazywa się powtórne zjadanie przez królika cekotrofów. Cekotrofy w przeciwieństwie do normalnych uformowanych bobków, zawierają :</br>" + 
					"- więcej białka</br>" + 
					"- witaminę K</br>" + 
					"- witaminy grupy B</br>" + 
					"- lotne kwasy tłuszczowe</br>" + 
					"- oraz o połowę mniej włókna.</br>" + 
					"</br>" + 
					"Jak rozpoznać cekotrofy:</br>" + 
					"- mają mazistą konsystencje, powleczoną śluzem</br>" + 
					"- mają ciemniejszą barwę od normalnych bobków a nawet czasem zielonkawą</br>" + 
					"- charakteryzują się silna wonią</br>" + 
					"- kształtem przypominające owoce jeżyn bądź malin.</br>" + 
					"</br>" + 
					"Dzięki ponownemu zjedzeniu, składniki odżywcze zawarte w cekotrofach, mają ponowną szanse na wchłonięcie do organizmu. Najczęściej w nocy i z rana następuje wydalanie przez królika cekotrofow. Małe króliki jedzą cekotrofy swojej mamy, zbyt szybko odsadzone od mamy i pozbawione jej cekotrofow mogą zapaść na groźne zapalenie jelit lub inne choroby układu pokarmowego.</br>" + 
					"</br>" + 
					"Gdy ich brak:</br>" + 
					"- po pewnym czasie królik staje się osowiały, pozbawiony witamin, a w następstwie pozbawienia składników odżywczych staje się niedożywiony.</br>" + 
					"</br>" + 
					"Gdy jest ich za dużo:</br>" + 
					"- taka sytuacja ma miejsce kiedy opiekun znajdzie w klatce, kuwecie czy na wybiegu, leżące nie zjedzone przez królika cekotrofy. Ich nadmiar powodowany jest zła dietą, składającą się głównie z ziaren i owoców. Za dużo zawartego w nich białka, węglowodanów. Dlatego nim podamy uszatkowi mieszankę karmy, bądź kolby dwukrotnie się zastanówmy, bowiem skutki takiej diety często są tragiczne."));
			
			careService.create(new Care(13L, "Kolor moczu", "Wielu opiekunom spędza sen z powiek. Zazwyczaj kolor moczu jest wynikiem, tego czym nasz pupil jest karmiony. Barwa może być od bezbarwnego do brązowawego. Warzywa z beta karotenem, barwią mocz. Często pojawia się mocz z białym osadem, to nic niepokojącego, króliki w ten sposób wydalają z organizmu węglan wapnia. Najczęściej opiekunów martwi czerwony kolor moczu. Często przyczyna tego jest zjedzenie mleczu bądź buraków. Czysta krew w moczu przybiera postać pasemek, ale często jest to niedostrzegalne gołym okiem. Wtedy należy udać się do weterynarza, standardowe badanie moczu pokaże czy są w nim erytrocyty (krew). Przy niepokojącej barwie moczu warto jest obserwować zachowanie uszatka, ono bowiem dodatkowo podpowie nam czy nasz niepokój jest słuszny. Pamiętajmy, że zła kondycja fizyczna i dieta przyczyniają się do wielu chorób układu moczowego u królika."));
			
			careService.create(new Care(13L, "Prawidłowe bobki", "Zawierają wszystkie niepotrzebne i trudne do strawienia cząstki pokarmu, opuszczają organizm królika w postaci wysuszonych uformowanych bobków. Ich kształt oraz częstotliwość pojawiania się informuje opiekuna o prawidłowej pracy przewodu pokarmowego. Ich brak, mikroskopijna lub nienaturalnie duża wielkość alarmują że zachodzą nieprawidłowości w funkcjonowaniu przewodu.</br>" + 
					"Przyczyną tego zazwyczaj jest wzdęcie lub zaparcie, nie leczone prowadzi do śmierci. Miękkie boby świadczą o zbyt bogatej diecie, chorobie lub błędach żywieniowych.</br>" + 
					""));
			
			poisonService.create(new Poison("Rośliny szkodliwe i trujące", "\"Wszystko jest trucizną decyduje tylko dawka\" - Paracelsus</br>" + 
					"</br>" + 
					"Króliki należą do zwierząt selekcjonujących rośliny. Wybierają rośliny najbardziej korzystne dla nich pod względem zdrowotnym, bogate w składniki odżywcze, soczyste i świeże. W naturze wykorzystują także rośliny przez nas zakwalifikowane jako trujące, aby poprawić swój stan zdrowia, wzmocnić odporność, pozbyć się pasożytów czy bólu, zapobiec chorobie czy uleczyć już tą istniejącą .</br>" + 
					"</br>" + 
					"W domowych warunkach króliki nie mają możliwości selekcjonowania. To my wybieramy im rośliny jakie mają zjeść i w jakiej ilości. Układamy jadłospis, często mimo naszych dobrych chęci na niekorzyść królika. Z braku innych możliwości królik musi zjeść to co mu damy lub sam przypadkiem znajdzie (np. kwiat doniczkowy).</br>" + 
					"</br>" + 
					"Aby zapobiec zatruciom i wspierać naturalne selekcjonowanie powinniśmy podawać swoim pupilom duże ilości różnych gatunków roślin. Królik sam znajdzie to czego potrzebuje i zostawi to co mu się w tej chwili nie przyda, bądź jest dla niego szkodliwe.</br>" + 
					"</br>" + 
					"Duży wybór warzyw pozwala królikowi odrzucić te warzywa, które zawierają zbyt dużo pestycydów, zje te mniej pryskane. Króliki, które nie mają wyboru zjedzą wszystko z głodu, świadomie narażając własne zdrowie. To tyczy się także siana, zazwyczaj jedna trzecia siana leży rozrzucona wokół paśnika. To są trawy i rośliny odrzucone przez królika, mało wartościowe pod względem odżywczym, zepsute bądź trujące np. często spotykany w sianie śmiertelnie trujący Ziemowit jesienny i starzec jakubek. Dlatego nie należy zmuszać królika do zjadania całości tylko dołożyć następną porcje siana.</br>" + 
					"</br>" + 
					"Szkodliwe rośliny to rośliny, które mogą zaszkodzić królikowi jeśli zje ich za dużo. Kilka przypadkowych pędów wymieszanych z trawą i innymi ziołami nie stanowi niebezpieczeństwa np. jaskier, bluszcz itp. Cebula, por, szczypiorek u wrażliwych królików mogą wywołać wzdęcie. Wiele źródeł przestrzega przed ostrym smakiem i trującymi właściwościami warzyw cebulowych. Pragnę wszystkich uspokoić wbrew informacjom w necie, żaden królik nie zje toksycznej ilości cebuli bądź czosnku. Tymi warzywami interesują się zwierzęta, które mają problemy zdrowotne np. są zarobaczone, o osłabionej odporności, zakatarzone. Króliki doskonale wiedzą na jaką dawkę mogą sobie pozwolić i po kuracji wykluczają warzywa cebulowe ze swojej diety.</br>" + 
					"  </br>" + 
					"Szkodliwe rośliny to też te które regularnie podawane przez długi okres czasu mogą spowodować chorobę, jednorazowo nie stanowią problemu np. rabarbar zawierający duże ilości kwasu szczawiowego czy suszona lucerna - duża zawartość wapnia.</br>" + 
					"</br>" + 
					"Z popularnych warzyw, które mogą zaszkodzić to np. kapustne: kapusta biała, włoska, czerwona, brukselka, a nawet kalafior czy brokuł bez wcześniejszego, stopniowego przyzwyczajenia, może skończyć się u królika bolesnym wzdęciem. Te warzywa nie powinny znaleźć się w diecie królików karmionych suchym pokarmem.</br>" + 
					"</br>" + 
					"Surowe rośliny strączkowe (fasola, groch, soczewica, bob) spowodują rozwolnienie lub wzdęcie. Fasola w stanie surowym jest trująca. Ziemniaki zawierają dużo ciężkostrawnej skrobi, nadziemna część rośliny jest trująca, zielone owoce, kiełki i zielone miejsca na ziemniaku zawierają solaninę, która powoduje zatrucia.</br>" + 
					"</br>" + 
					"Krzak pomidora oraz zielona część na owocu zawiera również solaninę.</br>" + 
					"Owoce egzotyczne jak cherymoja, liczi, owoc granatu, mogą spowodować zaburzenia układu pokarmowego. Awokado jest trujące prawie dla wszystkich zwierząt domowych.</br>" + 
					"</br>" + 
					"Pragnę też wspomnieć o świeżej trawie zaraz po zimie, ponieważ jest nam znanych dużo przypadków wzdęć zakończonych śmiercią. Trawa nie jest trująca, jest bardzo ważnym składnikiem króliczej diety, ale króliki muszą zostać do niej przyzwyczajone, jak do każdego nowego pokarmu. Scenariusz jest zawsze ten sam: pierwsze ciepłe dni, słoneczko, zielona trawa, króliczki są wynoszone na dwór, zabierane na działkę, do ogrodu... Można, ale trzeba najpierw przyzwyczaić królika do zieleniny zaczynając od małych ilości (garstki) codziennie je zwiększając. To bardzo, bardzo ważne.</br>" + 
					"</br>" + 
					"Listy z trującymi roślinami na króliczych stronach bazują na  roślinach trujących stworzonych dla bydła i ludzi, na tej podstawie powstają tez listy dla psów i kotów. Większość przedstawionych tam roślin nie stanowi niebezpieczeństwa, wręcz przeciwnie są zdrowym urozmaiceniem diety królika, uszak jest w stanie wykorzystać je w celach leczniczych jako np. naturalny antybiotyk, środek przeciw pasożytom czy przeciwbólowy.</br>" + 
					"</br>" + 
					"Tylko naprawdę nieliczne rośliny są dla uszaka trujące i nie powinien mieć on z nimi styczności, oto one:</br>" + 
					"bielun dziędzierzawa, ciemiernik biały, cis, czworolist pospolity, kokorycz, konwalia, kulczyba wronie oko, laurośliwa wschodnia, lucky Bamboo, lulek, obrazki, naparstnica purpurowa, oleander, ostrózka wyniosła, psianka czarna, psianka słodkogórz, pszeniec, Rącznik pospolity, słodlin, śniedek, starzec jakubek, szalej jadowity, Szczwół plamisty, szczyr trwały , tojad mocny, trąby anielskie, wawrzyn kalifornijski, wawrzynek wilczełyko, wilczomlecz obrotny, wilczomlecz sosnka, zimowit jesienny, Złotokap."));
			
			poisonService.create(new Poison("Produkty szkodliwe", "Firmy, które produkują poniższe \"przysmaki\" nastawione są na szybki zysk, tak na prawdę nie zależy im na zdrowiu naszych zwierząt. Wmawiają nam poprzez reklamę na pudełkach, że kupując dany produkt robimy dla naszych zwierząt coś dobrego, że dostarczamy mu niezbędne witaminy lub, że bez tego zakupu królicze zęby się nie zetrą. To nie prawda, te wszystkie \"przysmaki\" są szkodliwe, tuczące i zawierają składniki, których w naturze królik nigdy by nie zjadł.</br>" + 
					" </br>" + 
					"Sól - może być niebezpieczna dla królika, odgryzienie większego kawałka może spowodować zatrucie chlorkiem sodu i nieodwracalnym uszkodzeniem nerek. Zjadane warzywa i zielenina dostarczają wszystkich niezbędnych mikroelementów królikowi, sól jest zbędnym i szkodliwym wydatkiem.</br>" + 
					" </br>" + 
					"Wapieńko - przeważnie jest to gips z dodatkiem smakowym i jeśli jest kolorowe to z dodatkiem farby spożywczej. Wapieńko jabłkowe to nic innego jak gips + sztuczny dodatek smakowy. Zbyt dużo wapnia w diecie prowadzi nie tylko do powstawania piasku i kamieni i do niewydolności nerek, nadmiar wapnia odkłada się w innych organach i uszkadza je.</br>" + 
					" </br>" + 
					"Wapieńko blokuje wchłanianie niektórych mikro i makro elementów. Nadmiar może doprowadzić do poważnych niedoborów i anemii. Królik nie potrzebuje tego typu \"przysmaków\", wapń przyjmuje drogą naturalną jedząc siano, zieleninę i warzywa.</br>" + 
					" </br>" + 
					"Kolby, dropsy i ciasteczka - apetycznie wyglądają, ale zawierają dużo cukru, ziaren i sztucznego miodu, tuczą, niszczą zęby i mogą spowodować problemy z układem pokarmowym. Dropsy oprócz cukru mają w swoim składzie produkty mleczne. Królik nie jest w stanie strawić laktozy zawartej w mleku.</br>" + 
					"  </br>" + 
					"Zielone Rollis z lucerny - zawierają za dużo wapnia, mało włókna, tłuszcz. Robione są z lucerny, ziaren, produktów pochodzenia roślinnego i warzyw.</br>" + 
					"  </br>" + 
					"Mieszanki - cokolwiek pisze na pudełkach to nieprawda. Mieszanki składają się z rożnych ziaren, nasion, orzechów i produktów pochodzenia roślinnego. Zawierają za dużo białka i tłuszczu, a za mało włókna. Konsekwencja tego pożywienia to otyłość, przerośnięte zęby, próchnica, ropnie zębów, problemy z układem pokarmowym i moczowym, otłuszczoną wątrobą i serce, krótsze życie. Nie róbmy tego naszym królikom. Im bardziej naturalna i uboga w tłuszcze, białka i cukry dieta tym zdrowszy i szczęśliwszy królik. Siano, zielenina i warzywa zaspakajają zapotrzebowanie</br>" + 
					"na wszystkie składniki odżywcze królika.</br>" + 
					"  </br>" + 
					"Chleb, bułki - to bomba kaloryczna. często na suchym chlebie pojawiają się zarodniki pleśni, jeszcze ich nie widać gołym okiem, ale mogą już być. Szkodliwe są dodatki, tzw. ulepszacze, także drożdże, cukier, sol i ... zboże. Nieprawdą jest, że suchy chleb ściera zęby, dla ostrych zębów królika chleb to żadne wyzwanie. W pyszczku rozpuszcza się na papkę i zostaje połknięte. Pieczywo szybko syci dlatego królik przez jakiś czas nie je siana, leżący w żołądku chleb fermentuje, obniża ph w jelitach przez co giną dobre bakterie, a namnażają się te szkodliwe dla zdrowia, powstaje idealne środowisko dla grzybów i drożdżaków.</br>" + 
					"</br>" + 
					"Zdrowy królik poradzi sobie z niewielką ilością chleba, ale jeśli odporność uszaka będzie z jakiegoś powodu słabszą królik może dostać groźnego dla życia rozwolnienia lub wzdęcia."));
			
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
			
			otherNourishmentService.create(new OtherNourishment(1L, "Trawa i siano", "Najzdrowszym pożywieniem dla królika jest łąka pełna soczystej trawy i ziół. Trawa i zioła zawierają wszystkie składniki, które królik potrzebuje. Niestety nie jesteśmy w stanie dostarczyć uszakom tyle zieleniny, a i nie wszyscy mają do niej dostęp. Siano zastępuje w znacznym stopniu świeżą trawę łąkową. Nie bez powodu nazywane jest \"króliczym chlebem\", 70% dziennej racji  żywnościowej królika powinno się składać z siana.</br>" + 
					"</br>" + 
					"Dlaczego siano jest tak ważne?</br>" + 
					"</br>" + 
					"- ściana przewodu pokarmowego królika jest bardzo słabo umięśniona, siano zawiera dużo włókna (22% - 37%), które pomaga przesuwać; pożywienie w przewodzie pokarmowym</br>" + 
					"- wysoko włókniste siano sprawia, że żołądek i jelita królika cały czas pracują</br>" + 
					"- siano równoważy zachodzącą w jelitach fermentacje</br>" + 
					"- zapobiega powstawaniu bezoarów</br>" + 
					"- nie tuczy, jest bardzo dobrym pożywieniem dla królików, które muszą być na diecie np. podczas choroby lub z powodu otyłości</br>" + 
					"- pomimo, że jest suszone zawiera dużo odżywczych składników, witamin i minerałów niezbędnych w diecie królika</br>" + 
					"- podczas przeżuwania siana ścierają się zęby</br>" + 
					"- jedzenie siana zabija nudę, uszak jest zajęty wynajdowaniem najlepszych ździebeł i ziół.</br>" + 
					"</br>" + 
					"Dobre siano składa się z kwiatów, ziół i różnorodnych traw. Ma ładny zielony kolor, grube źdźbła i przyjemny zapach. Zakurzone żółte siano świadczy o złym przechowywaniu lub jest po prostu stare. Nie nadaje się dla królika. Wilgotne, zaparzone lub spleśniałe siano może wywołać ciężka chorobę u naszych zwierzaków. Sianko podajemy królikowi w paśniku, w koszyku wiklinowym lub pudelku możemy też je włożyć do starej bawełnianej torby, zrobić kilka dziur i powiesić. Króliki bardzo lubią jeść sianko z podłogi, ale takie siano szybko się brudzi. Trzeba je często wymieniać i dbać o higienę w klatce.</br>" + 
					"</br>" + 
					"Co zrobić jeśli uszak nie chce jeść siana:</br>" + 
					"</br>" + 
					"- ogranicz inne pokarmy głownie granulat</br>" + 
					"- należy wypróbować kilka rożnych rodzajów siana</br>" + 
					"- można wymieszać siano z ziołami, mieszankę włożyć do płóciennej torby lub poszewki na kilka dni, siano przejdzie zapachem ziół i będzie bardziej atrakcyjne dla uszaka</br>" + 
					"- siano z tymotki większość uszaków lubi</br>" + 
					"- ostatecznie można popryskać sianko odrobina wody z miodem, podać gdy dobrze wyschnie</br>" + 
					"</br>" + 
					"Zwierzęta, które jedzą bardzo dużo trawy i ziół mogą zrezygnować na jakiś czas z jedzenia siana. Nie należy się tym przejmować, zielenina spełnia tą samą role co siano, oprócz tego dostarcza jeszcze wody królikowi. Pamiętajmy, aby po przerwie zimowej stopniowo przyzwyczajać króliki do zieleniny. Zabrane bez przygotowania na działkę mogą dostać poważnego wzdęcia lub rozwolnienia. Już cztero-tygodniowe maluchy skubią ze swoja mama sianko, ziółka i trawę.</br>" + 
					"</br>" + 
					"Spleśniałe siano(również i inne pożywienie) może powodować Mykotoksyny."));
			
			nourishmentService.create(new Nourishment(2L, "Bazylia", "10,7/61", "86/369", null, null, null));
			
			nourishmentService.create(new Nourishment(2L, "Golliwoog", null, "180", null, null, null));
			
			nourishmentService.create(new Nourishment(2L, "Gwiazdnica pospolita", "89", "80", "54", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Komosa biała", "35/152", "100/1090", "35/381", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Koperek", "50/116,8", "230/1343", "66", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Lucerna (alfala)", "8/---", "450/950", "62/250", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Macierzanka", "9/50", "300/1800", "35/200", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Majeranek", "10/50", "350/2000", "50/300", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Malwa", "178", "200", "95", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Melisa", "45/126", "150/1056", "50/352", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Mięta", "45", "150", "50", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Mniszek lekarski", "30/82,2", "170/1164", "70/479", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Ogórecznik", "35", "93", "53", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Oregano", "10/60", "264/1576", "54", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Pietruszka (nać)", "160/472,8", "250/1847", "130/960", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Podagrecznik pospolity", "201", "230", "88", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Podbiał pospolity", "104", "320", "51", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Pokrzywa", "377,4", "1078", "647", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Rozmaryn", "10/61", "221/1280", "12/70", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Rukiew wodna", "185", "230", "79", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Rzeżucha", "bardzo dużo", "214", null, null, null));
			
			nourishmentService.create(new Nourishment(2L, "Stokrotka", "87", "190", null, null, null));
			
			nourishmentService.create(new Nourishment(2L, "Szałwia", "5", "270", "15", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Szczaw zwyczajny", "50/243,4", "50/609", "70/852", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Trawa", "114", "80", "72", null, null));
			
			nourishmentService.create(new Nourishment(2L, "Trybula ogrodowa", "36/65", "400/1819", "50/227", null, null));
			
			nourishmentService.create(new Nourishment(3L, "Bakłażan", "5", "12", "20", "rzadko", "dojarzałe owoce, bez ogonka"));
			
			nourishmentService.create(new Nourishment(3L, "Brokuły", "110", "100", "80", "codziennie", "liście, różyczki i łodyga"));
			
			nourishmentService.create(new Nourishment(3L, "Brukiew", "21,2", "49", "21", "codziennie", "korzeń i liście"));
			
			nourishmentService.create(new Nourishment(3L, "Brukselka", "94", "22", "72", "codziennie", "łodyga, liście i główki"));
			
			nourishmentService.create(new Nourishment(3L, "Buraki", "5,1", "25", "38", "w małych ilościach", "korzeń i liście"));
			
			nourishmentService.create(new Nourishment(3L, "Liście buraka", "30", "97", "36", null, "liście"));
			
			nourishmentService.create(new Nourishment(3L, "Cukinia", "16", "23", "32", null, "owoc razem ze skórką, liście i kwiaty"));
			
			nourishmentService.create(new Nourishment(3L, "Cykoria", "10", "20", "23", "codziennie", "liście i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Cykoria ctalogna", null, null, null, "codziennie" , "liście"));
			
			nourishmentService.create(new Nourishment(3L, "Dynia", "18", "25", "30", "codziennie", "liście, owoc, nasiona i kwiaty"));
			
			nourishmentService.create(new Nourishment(3L, "Endywia", "10", "50", "60", "codziennie", "liście"));
			
			nourishmentService.create(new Nourishment(3L, "Fenkuł", "93", "100", "51", "codziennie", "liście, bulwa i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Groszek zielony", "16,3", "28", "122", null, "razem ze strąkiem, liśćmi i kwiatami"));
			
			nourishmentService.create(new Nourishment(3L, "Jarmuż", "110", "210", "80", "codziennie", "liście i łodyga"));
			
			nourishmentService.create(new Nourishment(3L, "Kabaczek", "12,3", "22", "19", null, "owoc razem ze skórką, liście i kwiaty"));
			
			nourishmentService.create(new Nourishment(3L, "Kalafior", "49", "20", "28", "w małych ilościach", "różyczki, liście, łodyga"));
			
			nourishmentService.create(new Nourishment(3L, "Kalarepa", "64", "70", "50", "codziennie", "liście i korzeń"));
			
			nourishmentService.create(new Nourishment(3L, "Kapusta", "82", "169", "139", "rzadko, może powodować wzdęcia, uwaga: wzdęcie może skończyć się śmiercią", "liście, głąb"));
			
			nourishmentService.create(new Nourishment(3L, "Kapusta pekińska", "35", "80", "30", "codziennie", "liście"));
			
			nourishmentService.create(new Nourishment(3L, "Koper", "50", "230", "66", "codziennie", "listki, łodygi, kwiaty i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Karczoch", "8", "50", "130", "1-2 w tygodniu", "tylko główka"));
			
			nourishmentService.create(new Nourishment(3L, "Kukurydza", "12", "5", "120", "w małych ilościach", "liście, łodyga, kolby"));
			
			nourishmentService.create(new Nourishment(3L, "Mangold", "35", "100", "40", "w małych ilościach", "liście z łodygami"));
			
			nourishmentService.create(new Nourishment(3L, "Marchew", "7", "40", "30", "codziennie", "korzeń, liście, kwiaty i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Ogórek", "10", "20", "24", "codziennie - może powodować miękkie bobki", "owoc, kwiat, nasiona i liście"));
			
			nourishmentService.create(new Nourishment(3L, "Papryka czerwona", "150", "15", "35", "codziennie", null));
			
			nourishmentService.create(new Nourishment(3L, "Papryka żółta", "394", "51", "26", "codziennie", "bez ogonka, zawiera solaninę"));
			
			nourishmentService.create(new Nourishment(3L, "Papryka zielona", "192", "10", "25", "codziennie", "bez ogonka, zawiera solaninę"));
			
			nourishmentService.create(new Nourishment(3L, "Pasternak", "17", "50", "70", "codziennie", "korzeń i liście"));
			
			nourishmentService.create(new Nourishment(3L, "Pietruszka (korzeń)", "41", "60", "60", "codziennie", "korzeń, natka, kwiat (nasiona nie dla ciężarnych samic)"));
			
			nourishmentService.create(new Nourishment(3L, "Pomidor (bez zielonych części)", "22", "13", "25", null, "owoc bez ogonka, cały krzaczek jest trujący"));
			
			nourishmentService.create(new Nourishment(3L, "Roszponka", "30", "30", "49", "rzadko", "listki, nasiona i kwiat"));
			
			nourishmentService.create(new Nourishment(3L, "Rukola", "30", "160", "52", "rzadko", "liście"));
			
			nourishmentService.create(new Nourishment(3L, "Rzepa", "38", "50", "30", "codziennie", "korzeń i liście"));
			
			nourishmentService.create(new Nourishment(3L, "Rzeżucha", "60,2", "195", "60", "w małych ilościach", "nasiona, cała roślina"));
			
			nourishmentService.create(new Nourishment(3L, "Rzodkiewka (korzeń)", "26", "bardzo dużo", "19", "rzadko", "korzeń, nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Sałata głowiasta", "14", "35", "30", "rzadko", "liście i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Salata lodowa", "3,9", "19", "20", "rzadko", "liście i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Sałata rzymska", "24", "36", "45", "codziennie", "liście i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Seler korzeniowy", "9", "70", "90", "codziennie", null));
			
			nourishmentService.create(new Nourishment(3L, "Seler listkowy", "100", "587", "402", "codziennie", "korzeń i liście"));
			
			nourishmentService.create(new Nourishment(3L, "Seler naciowy", "20", "41", "90", "codziennie", "całość"));
			
			nourishmentService.create(new Nourishment(3L, "Szczaw", "50", "80", "23", "w małych ilościach", "liście i nasiona"));
			
			nourishmentService.create(new Nourishment(3L, "Szparagi", "21", "20", "52", "rzadko", "odmiana zielona i biała"));
			
			nourishmentService.create(new Nourishment(3L, "Szpinak", "50", "125", "55", "w małych ilościach", "liście"));
			
			nourishmentService.create(new Nourishment(3L, "Topinambur", "4", "10", "78", null, "całą roślinę z kwiatami i korzeniem"));
			
			nourishmentService.create(new Nourishment(4L, "Ananas", "20", "16", "9", "wspomaga wydalanie sierści", null));
			
			nourishmentService.create(new Nourishment(4L, "Agrest", null, null, null, null, "owoce, gałązki i liście"));
			
			nourishmentService.create(new Nourishment(4L, "Arbuz", "6", "10", "9", "w lecie 2-3 razy w tygodniu", "owoc z pestkami"));
			
			nourishmentService.create(new Nourishment(4L, "Aronia", null, null, null, null, "owoce, gałązki i liście"));
			
			nourishmentService.create(new Nourishment(4L, "Banan", "11", "8", "20", "w małych ilościach, bardzo kaloryczny", "bez skórki"));
			
			nourishmentService.create(new Nourishment(4L, "Brzoskwinia", "6,6", "8", "24", null, "owoc bez pestki"));
			
			nourishmentService.create(new Nourishment(4L, "Czereśnie", "7", "20", "16", "może wywoływać biegunki", "owoc bez pestki i ogonka"));
			
			nourishmentService.create(new Nourishment(4L, "Dzika róża", "257", "258", "61", null, "całe owoce, liście i gałązki, także suszone"));
			
			nourishmentService.create(new Nourishment(4L, "Figa", "2,5", "50", "32", "rzadko, duża zawartość cukru", "świeże i suszone"));
			
			nourishmentService.create(new Nourishment(4L, "Grejpfrut", "32,2", "15", "14", "rzadko, w małych ilościach, może wywołać biegunkę", null));
			
			nourishmentService.create(new Nourishment(4L, "Gruszka", "4,5", "9", "15", "duża zawartość cukrów, działa wspomagając w leczeniu chorób układu moczowego", null));
			
			nourishmentService.create(new Nourishment(4L, "Jabłko", "10", "7", "10", "małe ilości nawet codziennie, pomocne przy biegunce, problemach z trawieniem", null));
			
			nourishmentService.create(new Nourishment(4L, "Jagody", "22", "10", "14", "świeże i suszone, 1-2 razy w tygodniu", "można podawać całą roślinę"));
			
			nourishmentService.create(new Nourishment(4L, "Jeżyny", "17", "44", "30", "1-2 razy w tygodniu", "owoce i liście, kolce nie stanowią problemu"));
			
			nourishmentService.create(new Nourishment(4L, "Kaki", "80", "34", "32", "wspomaga wydalanie sierści, wzmacnia odporność", null));
			
			nourishmentService.create(new Nourishment(4L, "Malina", "25", "40", "33", "świeża i suszona, poprawia apetyt", "można podawać całą roślinę"));
			
			nourishmentService.create(new Nourishment(4L, "Mandarynka", "30", "35", "18", "wzmacnia odporność", "bez skórki i pestek"));
			
			nourishmentService.create(new Nourishment(4L, "Mango", "36,5", "10", "13", null, "bez pestek, ze skórką"));
			
			nourishmentService.create(new Nourishment(4L, "Melon", "30", "10", "22", null, "bez pestek, ze skórką"));
			
			nourishmentService.create(new Nourishment(4L, "Miechunka peruwiańska", null, null, null, null, "sam owoc, bez osłonki"));
			
			nourishmentService.create(new Nourishment(4L, "Morele", "9", "17", "21", null, "bez pestki"));
			
			nourishmentService.create(new Nourishment(4L, "Nektarynki", "9", "4", "24", null, "bez pestki"));
			
			nourishmentService.create(new Nourishment(4L, "Papaja", "61,8", "20", "5", "wspomaga wydalanie sierści", null));
			
			nourishmentService.create(new Nourishment(4L, "Pigwa", null, null, null, null, "dobrze dojrzałe owoce - rzadko; gałązki, kwiaty i liście - codziennie"));
			
			nourishmentService.create(new Nourishment(4L, "Pomarańcza", "50", "40", "22", "w małych ilościach, rzadko, wzmacnia odporność", null));
			
			nourishmentService.create(new Nourishment(4L, "Porzeczka czarna", "182,6", "39", "58", null, "owoce - rzadko; liście i gałązki - codziennie"));
			
			nourishmentService.create(new Nourishment(4L, "Porzeczka czerwona", "45,8", "36", "33", null, "owoce - rzadko; liście i gałązki - codziennie"));
			
			nourishmentService.create(new Nourishment(4L, "Porzeczka biała", "40", "30", "28", null, "owoce - rzadko; liście i gałązki - codziennie"));
			
			nourishmentService.create(new Nourishment(4L, "Poziomka", "62", "30", "27", null, "cały krzaczek wraz z owocami"));
			
			nourishmentService.create(new Nourishment(4L, "Rokitnik", null, null, null, "dużo witaminy C", null));
			
			nourishmentService.create(new Nourishment(4L, "Śliwka (wszystkie rodzaje)", "9,5", "14", "20", null, "bez pestki, rzadko"));
			
			nourishmentService.create(new Nourishment(4L, "Truskawka", "60", "30", "25", null, "świeże i suszone, razem z liśćmi"));
			
			nourishmentService.create(new Nourishment(4L, "Winogrono (ciemne i zielone) i rodzynki", "4", "4-19", "21", "Rodzynki jako przysmak", "można podawać z pestkami"));
			
			nourishmentService.create(new Nourishment(4L, "Wiśnie", "12", "20", "20", "w połączeniu z wodą mogą powodować biegunki", null));
			
			nourishmentService.create(new Nourishment(4L, "Żurawina", "13,5", "8", "12", "pomocna w chorobach układu moczowego", null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Amarant", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Gryka (podajemy rzadko", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Jęczmień", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Kanar", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Kukurydza (bardzo rzadko, dużo skrobi)", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Anyżu", OilyOrCereal.OILY, "kaszel, wzdęcia"));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Babki (lancetowa, zwyczajna)", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Bratków", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Chabru Bławatka", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Cykorii", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Dyni", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Fenkułu (kopru włoskiego)", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Gorczycy", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Gwiazdnicy pospolitej", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Komosy", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Komosy ryżowej", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Koniczyny", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Konopi", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Kopru", OilyOrCereal.OILY, "problem z trawieniem, wzdęcia"));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Kozieradka", null, "apetyt, mlekopędne i przeciwskurczowe"));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Lucerny", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Maku", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Malwy", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Marchwi", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Mniszka", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Ogórka", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Ostródy wodnej (dziki ryż)", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Ostu", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Pokrzywy", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Pora", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Rdestu", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Rzodkiewki", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Rumianku", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Sałat", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Sezamu", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Słonecznika", OilyOrCereal.OILY, "bardzo dobre na sierść i suchą skórę"));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Szczawiu", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Szpinaku", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Tasznika", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Traw", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Nasiona Wiesiołka", OilyOrCereal.OILY, "dobrze działa na sierść w czasie linienia"));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Orkisz", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Orzechy (różne rodzaje)", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Owies (z wiechciem)", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Płatki owsianek", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Proso", OilyOrCereal.CEREAL, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Siemie lniane (zawiera glikozydy cyjanogenne", OilyOrCereal.OILY, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Szałwia", null, null));
			
			seedAndCerealService.create(new SeedAndCereal(5L, "Szałwia hiszpańska", null, null));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Sałatki warzywne", "W tym dziale będziemy umieszczać najciekawsze przepisy na :sałatki, szaszłyki oraz inne zdrowe i oryginalne potrawy dla naszych uszatych. Wszystkie będą najpierw testowane przez moja trójkę. Ponieważ dostajemy dużo pytań na temat jadłospisu królika pierwszym przepisem, który podam będzie przykładowe danie (w dwóch wersjach) zjadane przez moje króle na kolacje.</br>" + 
					""));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Wariacje na kolacje", "Dla trzech królików:</br>" + 
					"Składniki: Trzy łodygi selera korzeniowego (natka), trzy kawałki selera, jedna marchewka pokrojona w plasterki, pomidor pokrojony w ósemki, sześć listków cykorii, trzy liście kalarepy.</br>" + 
					"</br>" + 
					"Wersja druga:</br>" + 
					"Dwie łodygi naci selera, trzy kawałki brokułu, mała cykoria, trzy grubsze plasterki ogórka, trzy ósemki jabłka, marchewka, kawałek selera. Potrawa ozdobiona jest gałązka gooliwog."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Młody Bigosik", "Dla dwóch królików</br>" + 
					"Składniki: 6 listków sałaty rzymskiej, ja dodałam jeden listek sałaty lodowej, ale nie musi być, jedna marchewka, koperek, pół papryki czerwonej, pół żółtej.</br>" + 
					"</br>" + 
					"Sposób przygotowania: Wszystkie składniki myjemy, suszymy, kroimy na małe kawałeczki, koperkiem ozdabiamy potrawę i gotowe."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Papryka faszerowana", "Dla jednego królika.</br>" + 
					"Składniki: Jedna papryka, dowolne warzywa, ja wykorzystałam: pietruszkę, pomidorka koktajlowego, żółta paprykę i brokuły.</br>" + 
					"</br>" + 
					"Sposób przygotowania: Paprykę i warzywa myjemy, z papryki odcinamy wierzch z ogonkiem, usuwamy nasionka. Resztę warzyw drobno kroimy i wypełniamy nimi paprykę."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Flaga Polski", "Składniki: białe warzywa np. seler, pietruszka lub pasternak i czerwone buraki, długa marchew. Ja dla dwóch królików użyłam średnia pietruszkę i średniej wielkości buraka ćwikłowego.</br>" + 
					"</br>" + 
					"Sposób przygotowania: Warzywa myjemy, obieramy, pietruszkę i buraczek kroimy w kostkę, mniej</br>" + 
					"leniwi mogą zetrzeć je na tarce o grubych oczkach. Układamy kolorami w kształcie flagi. Z marchewki wycinamy słupek na nim będzie powiewać nasza flaga. Smacznego."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Przysmak Uszatego Przyjaciela", "Składniki: liście babki, brzozy, koniczyny, porzeczki, poziomki, rumianku, wierzby, winorośli, jabłoni. Do dekoracji kwiaty polne.</br>" + 
					"</br>" + 
					"Wszystko ładnie układamy na tacy, dekorujemy kwiatami i danie gotowe."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Przysmak Uszatego Przyjaciela 2", "Dla jednego królika.</br>" + 
					"Składniki: liść sałaty (najlepiej rzymskiej), ćwierć marchewki, ćwierć banana, liść kapusty pekińskiej.</br>" + 
					"</br>" + 
					"</br>" + 
					"Sposób przygotowania:</br>" + 
					"Na miseczkę położyć wcześniej umyty liść sałaty, na niego pokrojoną w plastry marchewkę i banana. Wszystko obsypać pokrojoną kapusta pekińska i podać królikowi."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywna łódeczka", "Dla jednego królika.</br>" + 
					"Składniki: Papryka, Gałązka z liśćmi (z jabłoni, z gruszy itp.), brokuły, ogórek, marchew.</br>" + 
					"</br>" + 
					"Sposób przygotowania:</br>" + 
					"Paprykę umyć, przekroić na pół, usunąć gniazda nasienne, osuszyć. Zrobić żagiel z gałązki z listkami, wbić w paprykę. Do środka włożyć umyte i osuszone warzywa: brokuły, plasterki ogórka, plasterki marchewki."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywny Stworek", "Składniki: Liść kapusty pekińskiej, marchewka, seler, papryka, nać pietruszki, rukola.</br>" + 
					"</br>" + 
					"Sposób przygotowania:</br>" + 
					"Wszystkie składniki dokładnie myjemy i osuszamy. Jako twarz stworka dajemy liść kapusty pekińskiej, jako oczka - 2 plasterki marchewki, jako nos - kawałek selera, jako usta - 2 paseczki papryki, włosy robimy z natki pietruszki i rukoli.</br>" + 
					""));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 1", "Składniki: 6 listków sałaty rzymskiej, kilka listków cykorii, buraczek, pietruszka, dwie różyczki brokuła, dwie brukselki, marchewka."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 2", "Składniki: 3 listki pekińskiej, kilka listków sałaty rzymskiej, brokuły, ćwiartki jabłka, kilka listków cykorii, marchewka, pietruszka."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 3", "Składniki: 3 listki mangold, 3 liście pekińskiej, kilka liści sałaty rzymskiej, pietruszka, marchewka, brokuł."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 4", "Składniki: Jarmuż (bardzo lubiany), troszkę papryki zielonej i czerwonej, marchewka, różyczka brokuła, plasterek kiwi, dwie brukselki, dwie ósemki jabłka, kawałeczki kalarepy."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 5", "Składniki: Jarmuż, 2 brukselki, 2 listki kapusty pekińskiej, marchew, seler, 4 pestki słonecznika (niewidoczne), papryka żółta i czerwona do dekoracji."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Łódna waybrzeżu", "Składniki: 2 kawałki brokuł, ćwierć pomidora, kawałki kapusty pekińskiej.</br>" + 
					"</br>" + 
					"Sposób przygotowania:</br>" + 
					"Wszystkie składniki dokładnie myjemy i osuszamy. Na misce układamy kapustę tak, by utworzyć ,,wyspę\". Następnie układamy brokuł  tak, by powstały drzewka, po czym kładziemy pomidora tak, by wyglądał jak łódź."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Warzywne wariacje 6", "Składniki: 2 liście kapusty, kilka listków sałaty rzymskiej, pół kalarepy, plastry dyni, pietruszka, pół buraka, pół marchewki."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Obiad dla króliczych mistrzów", "Składniki: liść kapusty pekińskiej, różyczka brokuła, kilka plasterków marchewki, stokrotki, liście i kwiaty mlecza.</br>" + 
					"</br>" + 
					"</br>" + 
					"Sposób przygotowania:</br>" + 
					"Wszystkie składniki dokładnie myjemy i osuszamy. układamy na talerzu liście kapusty pekińskiej, brokuła, plasterki marchewki, na pekince układamy stokrotki oraz kwiaty i liście mlecza.</br>" + 
					""));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Różany obiad w wersji króliczej", "Dla jednego króliczka:</br>" + 
					"Składniki: zielenina - mlecze, babki, natka marchewki, natka pietruszki, liście buraków, liście dziewanny, płatki róży, malina</br>" + 
					"</br>" + 
					"</br>" + 
					"Sposób przygotowania:</br>" + 
					"Wszystkie składniki dokładnie myjemy i osuszamy. Układamy grupowo zieleninę, na wierzchu rozkładamy płatki kwiatów, a w środeczku malinę."));
			
			otherNourishmentService.create(new OtherNourishment(6L, "Wiosenna sałatka", "Dla jednego króliczka:</br>" + 
					"Składniki: gałązki kopru, kilka gałązek liści oraz kosteczek selera korzeniowego,papryka czerwona, 4-5 kawałków marchwi, suszona mięta oraz melisa do smaku</br>" + 
					"</br>" + 
					"</br>" + 
					"Sposób przygotowania:</br>" + 
					"Wszystkie składniki dokładnie myjemy i osuszamy. Wszystko mieszamy razem."));
			
			otherNourishmentService.create(new OtherNourishment(7L, "Suszone warzywa i owoce", "Od czasu do czasu w nagrodę można uszakowi zaserwować suszony owoc, czy warzywa. Najlepiej suszyć te przysmaki samemu, kupne są chemicznie preparowane. Do suszenia nadają się jabłka, gruszki, morele, śliwki, marchew, seler, pietruszka, pasternak, buraczki, żurawina, czarne jagody, pomidory.</br>" + 
					" </br>" + 
					"Warzywa lub owoce dokładnie myjemy, obieramy i kroimy w cienkie plasterki. Bardzo pomocne są specjalne suszarki do grzybów i owoców, ale nie wszyscy takie posiadają. Suszyć możemy w piekarniku rozkładając produkty cienka warstwa na blasze, zalecana temperatura to 40-55°C. Możemy nawiązać plasterki na nici i powiesić w przewiewnym miejscu lub porozkładać je na papierze śniadaniowym i od czasu do czasu przekładać na druga stronę.</br>" + 
					" </br>" + 
					"Dobrze wysuszone przechowujemy w szklanych słojach lub szczelnych pojemnikach. Niedosuszone warzywa mogą niestety spleśnieć dlatego dobrym rozwiązaniem są też płócienne woreczki, powieszone w suchym miejscu. Nie chronią one jednak przed molami spożywczymi.</br>" + 
					" </br>" + 
					"Suszone warzywa i owoce traktujemy jako przysmak, ponieważ zawierają dużo cukru, za to są pozbawione wody. W żołądku pęcznieją, jeśli królik po suchym posiłku nie zje dostatecznej ilości siana bądź zieleniny, może dostać zaparcia. Duża zawartość cukru powoduje obniżenie ph w jelitach, w tak sprzyjających warunkach środowiskowych bakterie pasożytnicze mnożą się bardzo szybko. Częste są też zadławienia suszonymi warzywami.</br>" + 
					"</br>" + 
					"Suszonymi warzywami można napełnić kule smakule."));
			
			otherNourishmentService.create(new OtherNourishment(8L, "Gałęzie", "Gałązki to prawdziwe dobrodziejstwo dla naszych uszaków. Pod korą znajdują się związki, które działają jak pasta do zębów, czyszczą i pielęgnują królicze zęby oraz masują dziąsła. Żując gałązki i korę, króliki równomiernie ścierają swoje stale rosnące zęby. Królikom sprawia ogromna radość obgryzanie kory, przycinanie gałązek, rzucanie nimi, przestawianie, układanie i oczywiście zjadanie</br>" + 
					"listków.</br>" + 
					"Uszaki potrafią się nimi zająć przez długie godziny. Jeśli mamy taką możliwość to codziennie dostarczajmy królikom świeżych gałęzi, wszystkie można podawać wraz z liśćmi i kwiatami. Ulubione gałązki naszych uszaków to jabłoń, grusza, malina, leszczyna, wierzba, porzeczka i brzoza.</br>" + 
					" </br>" + 
					"Gałęzie mogą być pokryte zielonym, czasami żółtym czy szarym nalotem. Są to glony, mchy i porosty. Występują głównie na drzewach, które stoją w zacienionych bądź wilgotnych miejscach, pojawiają się także po długich opadach deszczu, najbardziej są widoczne na starych drzewach i krzewach. Nie są szkodliwe dla królików, można takie gałązki spokojnie podawać. Niektóre króliki zabierają się w pierwszej kolejności za porosty, a później obgryzają inne części gałązki.</br>" + 
					" </br>" + 
					"Nie wszystkie drzewa i krzewy nadają się dla królika, najbardziej trujący z polskich drzew jest cis pospolity, trochę mniej : tuja, bukszpan, cyprysy i akacja (robinia akacjowa), bez, kruszyna pospolita, czeremcha. Kasztan zawiera związki eskuline i escyne, które mogą podrażnić układ pokarmowy, a nawet być przyczyną zatrucia. Dąb ze względu na duże stężenie garbników powinien być podawany rzadko, w celach leczniczych np. przy biegunce. Na temat orzecha włoskiego są podzielone zdania, posiada również duże stężenie garbników, lepiej nie podawać wcale lub rzadko, w małych ilościach. Ma działanie przeciwrobacze.</br>" + 
					"</br>" + 
					"Na temat gałązek drzew owocowych i samych owoców krąży wiele sprzecznych informacji, są uważane za szkodliwe, ponieważ podobno zawierają glikozydy cyjanogenne (amigdaline). Ta teorie obaliła pani dr. Jacqueline Kupper z Universytetu Farmakologii weterynaryjnej i Toksykologii w Zürichu, cytat:</br>" + 
					"\"Tylko nasiona i pestki zawierają cyjanki, gałązki drzew pestkowych mogą być podawane szynszylom, świnkom i królikom, pod warunkiem, że nie są spryskane. Pestek nie powinno się podawać, ponieważ gryzonie są wstanie je przegryźć\""));
			
			otherNourishmentService.create(new OtherNourishment(9L, "Granulaty", "Po fali kolorowych mieszanek, które zostały z czasem uznane za tuczące i niezdrowe, producenci karm dla zwierząt, aby odzyskać klientów wypuścili na rynek \"zdrowszy\" produkt – granulat. Granulat to sprasowane składniki w formie walca, najczęściej są w kolorze zielonym. Jest dużo rodzajów granulatu krajowej produkcji i zagranicznej, grubsze i cieńsze, o różnych odcieniach zielonego, ze zbożem i najnowszy trend - bez zbożowe. Karma ma zapobiec wybieraniu przez królików poszczególnych składników (jak odbywało się to w przypadku mieszanek), a tym samym marnowaniu ich. Dodam, że królik to zwierzątko, które w naturze ma selekcjonowanie. Nie zjada wszystkiego jak kosiarka tylko wybiera najsmaczniejsze, najbogatsze w witaminy, minerały czy białko rośliny. Wybieranie najlepszych i potrzebnych składników zapobiega niedoborom i służy instynktownemu samo leczeniu. Podając dwa razy dziennie taki sam pokarm o tej samej zawartości witamin i minerałów zmuszamy niejako królika, \"potrzebujesz czy nie, musisz zjeść\"."));
			
			otherNourishmentService.create(new OtherNourishment(9L, "Dlaczego granulat jest szkodliwy dla królików", "- naturalny pokarm królika zawiera 70-90% wody, granulat tylko około 9%-12%, większość królików nie jest wstanie uzupełnić brakujących w diecie płynów, stąd zagęszczenie moczu i odkładanie się złogów (piasek, kamienie) w pęcherzu i nerkach, częsty problemy u królików karmionych granulatem,</br>" + 
					"- granulat pęcznieje w zetknięciu z wilgocią, powiększa swoją objętość nawet do 5 razy, może zablokować układ pokarmowy lub uszkodzić jelita królika,</br>" + 
					"- granulki odciągają wodę, napęczniała granulka leży \"na sucho\", może się wręcz przykleić do ścianek żołądka i jelit, w ten sposób zaburza cały proces trawienny, króliki nie gryzą dokładnie granulatu tylko rozdrabniają i połykają także te większe kawałki, </br>" + 
					"- dostarcza zbyt dużo witamin i minerałów, te odkładają się w organach wewnętrznych i są przyczyna różnych chorób,</br>" + 
					"- jest tuczący, nie musi to być widoczne na zewnątrz, najczęściej otłuszczona jest wątroba i serce,</br>" + 
					"- za szybko syci, dlatego króliki rzadziej sięgają po pożywienie, to sprawia, że zęby są niedostatecznie ścierane, a pożywienie zalega w układzie pokarmowym. Króliki mają bardzo słabo umięśniony żołądek, aby treść pokarmowa mogła się przesuwać musi dojść dokładka z góry, jedno pożywienie popycha drugie, żołądek nigdy nie jest pusty. U sytego królika treść pokarmowa nie przesuwa się, gdyż przez dłuższy czas królik nie ma ochoty na jedzenie, zalęgająca treść pokarmowa rozkłada się, tworzą się gazy, których królik nie jest w stanie wydalić, nagromadzone gazy to bardzo bolesna przypadłość i nie rzadko jest przyczyna śmierci,</br>" + 
					"- pożywienie i trawienie mają ścisły związek ze ścieraniem zębów. Im rzadziej królik sięga po pokarm tym mniej ściera zęby, z tego wniosek: jedzenie musi być małokaloryczne, wysoko włókniste, dostępne cały czas,</br>" + 
					"- granulat jest zbyt twardy, królik musi użyć siły, aby go rozdrobnić, jeśli robi to regularnie będą się tworzyć odgniotki na dziąsłach, a zęby zaczną się chwiać, obok rozchwianych zębów tworzą się kieszonki, do których dostaje się pokarm, gnijące resztki są przyczyna zapalenia, stąd już blisko do ropnia i przerostu korzeni zębów. Gryzienie granulatu wymaga innych ruchów szczęki niż np. przy jedzeniu siana czy warzyw, nie wspomaga ścieraniu zębów, rozdrabnianie pożywienia odbywa się za krótko,</br>" + 
					"- granulat jest przyczyną śmierci wielu królików, które się nim po prostu zadławiły,</br>" + 
					"- granulki są drobno zmielone, przez to włókno roślinne ma zmienioną strukturę, takie włókno nie służy ani ścieraniu zębów, ani nie wspomaga trawienia, wręcz przeciwnie jest przyczyną zatwardzeń, być może dlatego do niektórych karm dodaje się sól gorzką,</br>" + 
					"- dobre bakterie bytujące w układzie pokarmowym wymagają odpowiedniego ph, skrobia zawarta w zbożach i wytłokach obniża środowisko bakteryjne, to sprawia, że bakterie chorobotwórcze szybko zaczynają się rozmnażać jednocześnie zmniejsza się ilość bakterii jelitowych. Następstwem są biegunki i wzdęcia. Bogata w cukry dieta ma wpływ na rozwój kokcydiozy i grzybicy układu pokarmowego oraz przebarwień na zębach. Wielu opiekunów pisze o nietolerancji warzyw przez królika, jest to związane ze szkodami jakie wyrządził granulat. Po odstawieniu karmy, zniszczony układ pokarmowy może się regenerować nawet do dwóch lat,</br>" + 
					"- behawioryści łącza agresje królików z karmieniem ich kalorycznym pokarmem, chodzi o nadmiar energii dostarczana z pożywieniem, która w jakiś sposób musi zostać rozładowana, króliczy organizm jest przystosowany do ubogiego w składniki odżywcze pożywienia,</br>" + 
					"- składniki użyte do zrobienia karm nie są nawet zbliżone do naturalnego pożywienia królika, to tanie produkty, których nie można już użyć w przemyśle spożywczym dla ludzi, odpady pakowane w ładne opakowania i sprzedawane jako zbilansowana, pełnowartościowa karma."));
			
			otherNourishmentService.create(new OtherNourishment(9L, "Co wchodzi w skład granulatów", "Siano, zioła.</br>" + 
					"Są mielone, podgrzewane i prasowane, w tym procesie giną najcenniejsze składniki, które później są sztucznie uzupełniane. Do sklejenia granulek używa się melasy lub zboża, zielony kolor daje im dodatek lucerny lub barwnika. Nie mamy pewności jakie zioła wchodzą w skład granulatu i w jakiej ilości. Jako ziołowe dodatki dla zwierząt wykorzystywane są również odpady poprodukcyjne z przemysłu zielarskiego, spożywczego lub kosmetycznego.</br>" + 
					"</br>" + 
					"</br>" + 
					"Warzywa i owoce.</br>" + 
					"Rzadko na opakowaniu jest podane jakie warzywa są użyte i w jakiej ilości. W większości są to tanie odpady z branży warzywno-owocowej, a więc wytłoki powstałe po wyciśnięciu warzyw i owoców (na soki, koncentraty), części owoców i warzyw, od sortowane, zepsute warzywa i owoce, obierki, skórki i pestki. Wytłoki zawierają bardzo dużo skrobi i cukru rożnego rodzaju, ale prawie żadnych witamin. Połknięte pęcznieją w żołądku i szybko nasycają królika. Częste ich podawanie może doprowadzić do otyłości, podwyższenia cukru, grzybicy w układzie pokarmowym, długie ich leżakowanie w żołądku sprzyja gromadzeniu się sierści i powstawaniu bezoarów oraz wzdęć.</br>" + 
					"</br>" + 
					"</br>" + 
					"Produkty pochodzenia roślinnego</br>" + 
					"To odpadki i resztki z  przemysłu spożywczego, produkty uboczne: </br>" + 
					"melasa, wysłodki- odpad z produkcji cukru</br>" + 
					"słód- odpad z produkcji piwa otręby, śruty, mąka, mączki,  plewy, resztki słomy, łupiny,</br>" + 
					"- odpad z produkcji maki, ekstrakty ze słonecznika, wytłoki, łupiny, śruty, mąka sojowa,</br>" + 
					"- resztki z produkcji oleju, ekstrakty z pestek winogron, wytłoki, skórki,</br>" + 
					"- odpady z produkcji  soku, win, przetwórstwa owoców i warzyw.</br>" + 
					"Produkty te maja prawie zerową wartość odżywczą, za to masę cukru i ciężkostrawnego tłuszczu. Czegoś takiego nasze zwierzaki nie potrzebują, nasz ukochany królik to nie pojemnik na odpadki. </br>" + 
					"</br>" + 
					"</br>" + 
					"Zboża i kukurydza.</br>" + 
					"Także (plewy, resztki kolb, śruty, otręby, maczki, mąka). W dalszym ciągu królik jest traktowany jak gryzoń tymczasem jego układ pokarmowy nie jest przystosowany do zjadania dużych ilości zboża. Ziarna zawierają dużo skrobi, ta szybko nasyca zwierzęta, jest powodem ociężałości królików, otyłości, otłuszczenie wątroby i serca. Syty uszak zjada o wiele mniej siana i zieleniny dlatego zęby nie są w dostatecznym stopniu ścierane. Gryzienie twardego zboża podrażnia dziąsła, powstają odgniecenia, częste podrażnienia mogą być przyczyną ropni.</br>" + 
					"Wielocukry trafiają do jelita grubego i służą bakteriom chorobotwórczym (Coli, Clostridium) i drożdżom za pożywkę. Tysiące królików cierpi z tego powodu na wzdęcia i zatory.</br>" + 
					"</br>" + 
					"</br>" + 
					"Lucerna.</br>" + 
					"Nadaje granulkom ładny zielony kolor i podwyższa procentowa ilość włókna. Jest wysokobiałkowa i wiąże wapń, który może się odkładać w pęcherzu i nerkach pod postacią piasku lub kamieni.</br>" + 
					"</br>" + 
					"</br>" + 
					"Orzechy i nasiona.</br>" + 
					"Zawierają bardzo dużo tłuszczu. W nadmiarze prowadzą do otyłości, do zmniejszenia apetytu na zdrowe jedzenie, powodują również różne choroby układu pokarmowego. Zazwyczaj nie ma informacji jakie nasiona i orzechy wchodzą w skład i w jakiej ilości. Można je podawać tylko jako przysmak raz na jakiś czas.</br>" + 
					"</br>" + 
					"</br>" + 
					"Nasiona strączkowe</br>" + 
					"Fasola, groch, groszek, łubin, bob, soja i resztki z nasion, suche strąki - tanie produkty, które mają za zadanie nasycić zwierzaka, łodygi i strąki dostarczają włókna. Surowe są trujące dla zwierząt, przetworzone - ciężkostrawne i wzdymające. Soja używana w żywieniu zwierząt jest genetycznie modyfikowana, u laboratoryjnych szczurków po podawaniu małych ilości zaobserwowano zmiany wyników krwi, zmiany na wątrobie i narządach płciowych.</br>" + 
					"</br>" + 
					"</br>" + 
					"Melasa, słód, cukier i  miód.</br>" + 
					"To bardzo niezdrowe dodatki chętnie używane przez producentów dla uatrakcyjnienia smaku granulatu. Niszczą zęby, obniżają ph układu pokarmowego ułatwiając zasiedlanie się bakteriom, grzybom i drożdżakom. Powodują otyłość i cukrzyce.</br>" + 
					"</br>" + 
					"</br>" + 
					"Produkty piekarnicze.</br>" + 
					"To odpady z piekarń tzw. \"zmiotki z podłogi\", oprócz środków spulchniających, ulepszaczy, jajek, mleka i maki zawierają także cukier.</br>" + 
					"</br>" + 
					"</br>" + 
					"Produkty pochodzenia zwierzęcego</br>" + 
					"Jajka, mączka kostna, mleko, jogurty itd. absolutnie nie powinny być podawane królikom, królik jest weganem, jego układ pokarmowy nie jest przystosowany do jedzenia takiego pożywienia.</br>" + 
					"</br>" + 
					"</br>" + 
					"Konserwanty i dodatki</br>" + 
					"Są zarówno dla ludzi jak i dla zwierząt szkodliwe. Niektóre z nich są rakotwórcze inne działają negatywnie na układ pokarmowy, uszkadzają nerki lub są przyczyna alergii. Przedłużają termin ważności, chronią przed pleśnieniem, bakteriami, brzydkim zapachem. Producenci karm dla zwierząt w krajach EU nie mają obowiązku podawania dodatków (konserwantów, substancji zagęszczających, barwników, wzmacniaczy smaku, aromatów, aminokwasów, antybiotyków, gazów ochronnych) na opakowaniu.</br>" + 
					"Barwniki - po zmieleniu wszystkich składników granulatu powstaje szaro-bura, nieapetyczna papka, aby zasugerować klientowi, że karma jest zdrowa i zrobiona z ziół i siana farbuje się ją na ładny zielony kolor. Z powodzeniem jak się przekonałam, na wielu forach króliczych i świnkowych opiekunowie są pewni, że granulat to sprasowane zioła.</br>" + 
					"Aromat - ma zachęcić zwierzaki do jedzenia, atrakcyjność zapachowa pobudza apetyt i zwiększa ilość pobieranej karmy, co na dłuższą metę doprowadza do otyłości.</br>" + 
					"Wzmacniacze smaku - zachęcają królika do jedzenia, wzmacniaj apetyt, zwiększają ilość pobieranej karmy. Opiekun cieszy się, że uszak ze smakiem rzuca się na jedzenie, następnym razem kupi taki sam granulat. Zarówno aromat jak i dodatki smakowe uzależniają. Stąd częste teksty \"mój królik nie chce jeść żadnej innej karmy\". Aby zwierzęta mogły strawić produkty do których ich układ pokarmowy nie jest stworzony dodaje się enzymy.</br>" + 
					"Emulgatory - pozwalają na łączenie składników, które normalnie nie dają się ze sobą połączyć np. olej i woda.</br>" + 
					"</br>" + 
					"</br>" + 
					"Syntetyczne witaminy i minerały.</br>" + 
					"Podczas obróbki i podgrzewania składników granulatu giną naturalne składniki odżywcze. Dlatego są uzupełniane sztucznymi i to w przesadnej ilości. Błędne jest przekonanie, że nadwyżka wydalana jest z moczem, odkłada się w rożnych organach i po latach daje o sobie znać kamieniami w układzie moczowym, wapnicą, osteoporozą, uszkodzoną wątrobą lub hiperwitaminozą. Część witamin króliki potrafią same wytworzyć (B, C , D i K) inne pobierane są wraz z pożywieniem np. Witamina E, witamina A nie występuje w naturalnym pożywieniu królików tylko Karoten (marchew, papryka, brokuły, szpinak, dynia). Mimo wszystko powyższe witaminy dodawane są do granulatu w ilości 6-10 krotni wyższej niż królik potrzebuje.</br>" + 
					"</br>" + 
					"</br>" + 
					"Leki</br>" + 
					"Najczęściej są to probiotyki podawane by zwierzęta mogły strawić ciężkostrawny i obcy dla ich układu trawiennego pokarm, bez natychmiastowego uszczerbku na zdrowiu. Dodawane są też kokcydiotyki, antybiotyki (zapobiegają rozmnażaniu się bakterii) i środki przeczyszczające. Lekarstwa powinny być zawsze podawane po uzgodnieniu z lekarzem. Podawanie ich profilaktycznie upośledza układ immunologiczny, pokarmowy i uodparnia bakterie na dany lek.</br>" + 
					"</br>" + 
					" </br>" + 
					"Szkodliwość karmienia granulatem rozciąga się w czasie, wychodzi mniej więcej w 3-4 roku życia i na ogół nie jest wiązane z żywieniem \"przecież mój królik cały czas to jadł i nic mu nie było\". Zdrowy królik nie potrzebuje żadnych sztucznie wytwarzanych pokarmów. Siano, zielenina, warzywa i gałązki pokrywają wszystkie potrzeby królika. Utrzymują go w zdrowiu, dbają o zęby i układ pokarmowy, zapobiegają otyłości. Podając zerwane zioła mamy pewność, że jest to np. babka, a nie niewiadomego pochodzenia produkt o wątpliwej zawartości okraszony sztucznymi witaminami."));
			
			otherNourishmentService.create(new OtherNourishment(10L, "Woda", "Królik musi mieć ciągły dostęp do świeżej wody. Wodę możemy wlać do specjalnie przeznaczonego do tego celu poidełka lub do zwykłej miski, najlepiej ceramicznej. Poidełko ma jedną zasadnicza wadę, mianowicie sprawia pewne trudności królikowi w jego korzystaniu, zaś miseczka pomimo łatwości dostępu, może być często wywracana przez królika, a co za tym idzie, woda znajdująca się w środku będzie lądować na podłodze, dlatego ważne jest, aby miska była na tyle ciężka, żeby króliczek nie mógł jej zbyt łatwo wywrócić. Kolejną wadą miseczki jest to że</br>" + 
					"na jej powierzchni mogą kumulować się nieczystości z zewnątrz. Pomimo wad zastosowania miseczki, ja zdecydowanie bardziej polecam właśnie ten sposób podawania picia naszym pupilkom.</br>" + 
					" </br>" + 
					"Poidełko oprócz sprawiania trudności przy korzystaniu z niego przez królika, ma również inne zasadnicze wady, np.:</br>" + 
					"- poidełka nie można dobrze i dokładnie umyć, stąd namnażają się w nim bakterie,</br>" + 
					"- czasami, bez naszej wiedzy ustnik zatyka się, przez co króliczek nie ma dostępu do wody.</br>" + 
					"</br>" + 
					"Jeżeli zdecydujemy się na poidełko, to aby uniknąć bakterii, poprzez złe wymycie należy do środka wrzucić kilkanaście ziarenek ryżu i energicznie potrząsać, aby zetrzeć osad ze środka. Dziubek (ustnik) należy myć wacikami do uszu, ze szczególna ostrożnością, aby kawałki waty nie pozostawały w środku.</br>" + 
					"</br>" + 
					"Bez względu na to czy wybierzemy poidełko czy ceramiczną miseczkę, bezwzględnie musimy pamiętać o tym, że przynajmniej raz dziennie powinniśmy wymieniać wodę na świeżą, a w okresie upałów, takie zmiany powinny być zdecydowanie częstsze.</br>" + 
					"</br>" + 
					"Należy pamiętać że woda nie powinna być prosto z kranu, ale wcześniej należy ją przygotować. Można również używać wód mineralnych, najlepiej nisko mineralizowanych z małą zawartością wapnia, z tym że taka woda powinna być często zmieniana na inną, ponieważ zawarte w niej minerały, powinny być zróżnicowane, im bardziej zróżnicujemy rodzaje wód mineralnych, a co za tym idzie minerałów, tym bardziej zminimalizujemy ewentualne choroby, związane z nadmiarem niektórych pierwiastków. Szczególnie polecam wody: Żywiec zdrój źródlana i wodę dla niemowląt.</br>" + 
					"</br>" + 
					"Z wodą możemy rozpuszczać różnego rodzaju leki, jak i witaminy których uszak nie chce przyjmować w tradycyjny sposób, ale tylko w szczególnych przypadkach. Alternatywą dla wody może być podawanie herbatki koperkowej lub rumiankowej."));
			
			otherNourishmentService.create(new OtherNourishment(10L, "Miseczka czy poidełko", "Badania przeprowadzono na Uniwersytecie w  Zürichu.</br>" + 
					"</br>" + 
					"Króliki chętniej piją z otwartych naczyń niż z poidełek. Mogą szybciej i więcej się napić, wskazują nowe badania na Uniwersytecie w Zürichu. Aby zwierzaki cieszyły się doskonałym zdrowiem muszą być oprócz tego żywione sianem i świeżą zielenina.</br>" + 
					"</br>" + 
					"Poidełko czy miseczka? To pytanie w czym najlepiej podać wodę pupilowi zadaje sobie wielu opiekunów. Bardzo popularne jest poidełko, które przymocowuje się do prętów klatki. W poidełku woda pozostaje czysta i w przeciwieństwie do miseczek nie zostanie zabrudzona czy wylana. Które z pojemników wybiorą króliki i jak przez odpowiedni wybór naczynia i pożywienia osiągnąć optymalny pobór wody zbadała w swojej pracy doktorskiej Pani Anja Tschudin. Wybór pojemnika jest szczególnie ważny dla zwierząt, które miały już kiedyś kamienie w układzie moczowym, co u królików czasami występuje, lub inną chorobę związaną z układem moczowym."));
			
			otherNourishmentService.create(new OtherNourishment(10L, "Miseczki lepsze", "Wszystkie króliki biorące udział w doświadczeniu P. Anja Tschudin wybierały pojemniki otwarte mając do wyboru miseczki i poidła.</br>" + 
					"</br>" + 
					"Zwierzęta mogły w krótszym czasie wypić więcej wody. Gdy pożywienie składało się tylko z siana bądź z granulatu zrobionego z siana króliki wypijały o wiele więcej wody, niż gdy dostawały do jedzenia ziarna. \"Siano jest zalecane dla królików, ponieważ w przeciwieństwie do zbóż odpowiada naturalnemu pożywieniu uszaków, który wspomaga niezbędne ścieranie zębów i gwarantuje odpowiedni pobór wapnia\" - wyjaśnia Anja Tschudin i dodaje \"do tego siano prowadzi do większego zapotrzebowania na wodę i co za tym idzie do zwiększonego wydalania moczu. Rozcieńczony mocz może zapobiec powstaniu kamieni moczowych\".</br>" + 
					"</br>" + 
					"Dostarczanie wody było jeszcze lepsze gdy do siana podawana była zielenina np. natka pietruszki, ponieważ poprzez pożywienie pobierana była dodatkowa ilość płynu. Dla królików popularna marchewka i owoce są ze względu na zawartość cukrów mniej polecane."));
			
			otherNourishmentService.create(new OtherNourishment(10L, "Wystarczająca ilość wody, siano i świeża zielenina", "Gdy króliki w doświadczeniu mogły bez ograniczenia pić wodę nie było widać znaczących różnic w ilości wypijanej wody w poszczególnych rodzajach pojemników. Jednak kał w fazie picia z poidełek był zdecydowanie bardziej suchy. To znaczy, że organizm królika aktywował mechanizm oszczędzania wody. Jeśli pobieranie wody było ograniczone do 12 bądź 6 godzin dziennie króliki pobierały mniej wody, ale o wiele więcej pijąc z misek niż z poidełek. \"Napełniona miseczka wody oraz pożywienie składające się z siana i zielonego, świeżego pożywienia zapewnia optymalne zaopatrzenie królika w płyny\" radzi P. Tschudin. To odnosi się także do świnek morskich i innych małych gryzoni jak koszatniczki."));
		};
	}
}
