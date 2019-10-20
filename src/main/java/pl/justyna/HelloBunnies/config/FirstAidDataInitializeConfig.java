package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.FirstAid;
import pl.justyna.HelloBunnies.service.FirstAidService;

@Configuration
public class FirstAidDataInitializeConfig {

	@Autowired
	private FirstAidService firstAidService;

	@Bean
	public InitializingBean insertFirstAidInitialData() {
		return () -> {
			
			firstAidService.create(new FirstAid("Pierwsza pomoc", "</br>"
					+ "Zwykle wypadki jak na złość zdarzają się w weekendy lub w święta. Dlatego opisze jak udzielić pierwszej pomocy zanim skontaktujemy się z weterynarzem. Dobrze mieć pod ręką adres i nr telefonu dyżurującego lekarza weterynarii lub kliniki. Pierwsze i najważniejsze to zachowujemy spokój. Pamiętajmy o nawadnianiu chorych zwierząt, nie możemy w żadnym wypadku dopuścić do odwodnienia. Króliki, które nie maja apetytu dokarmiamy rozmoczonym granulatem z pomocą strzykawki ( bez igły).</br>"
					+ "</br>" + " "));

			firstAidService.create(new FirstAid("Zawarte tu rady nie zastąpią wizyty u weterynarza !!!", "</br>"
					+ "Drobne rany, rany po ugryzieniu - smarujemy środkiem odkażającym np. riwanolem, wodą utlenioną lub jeśli nic takiego nie mamy - czystą, przegotowaną wodą. Nigdy nie smarujemy maściami ponieważ maść skleja futerko i weterynarz będzie miał duże trudności żeby ją usunąć.</br>"
					+ "</br>"
					+ "Przy większych ranach - krwawiących, musimy założyć bandaż lub opaskę uciskową zanim pojedziemy do weterynarza.</br>"
					+ "</br>"
					+ "Złamania - nigdy nie nastawiamy ani nie bandażujemy królikowi łapy, narazimy go na jeszcze większy ból. Wkładamy królika do transporterka żeby się nie poruszał i nie urażał sobie łapy i jedziemy do weterynarza.</br>"
					+ "</br>"
					+ "Trucizna - jeśli podejrzewamy, że królik zjadł coś trującego, bierzemy próbkę np. rośliny ze sobą, wtedy lekarz będzie mógł szybciej zareagować i podać właściwy lek.</br>"
					+ "</br>"
					+ "Ugryzienia przez owady - do  miejsca ugryzienia przykładamy zimny okład, jeśli królik wykazuje reakcje alergiczna musimy natychmiast udać się do weterynarza.</br>"
					+ "</br>"
					+ "Kleszcza - możemy sami usunąć chwytając go tuż przy nasadzie, jak najbliżej skóry, jednym szarpnięciem usuwamy pasożyta. Można się posłużyć pesetą lub specjalnymi haczykami do wyciągania kleszczy. Ranke dezynfekujemy.</br>"
					+ "</br>"
					+ "Lekkie rozwolnienie - ograniczamy dietę do sianka, do picia podajemy ciepłą herbatkę rumiankową, nagietkową, koperkową lub z czarnych jagód. Podajemy też suszone jagody i lakcid lub inny probiotyk. Pół kapsułki rano i pół wieczorem. Często zmieniamy ściółkę w klatce, a brudną pupę myjemy ciepłą wodą i dokładnie osuszamy. Jeśli rozwolnienie nie mija w ciągu 48 godz. lub stan królika się pogarsza idziemy do weterynarza. Weźmy ze sobą próbkę kału.</br>"
					+ "</br>"
					+ "Lekkie wzdęcie - zostawiamy w klatce tylko siano, do picia podajemy herbatkę koperkową, kminkową lub miętową. Podajemy dwa razy dziennie po pół kapsułki espumisan na wzdęcia. </br>"
					+ "</br>"
					+ "Lekkie zatwardzenie - odstawiamy granulat, do jedzenia tylko siano, suszone zioła, herbatka koperkowa, rumiankowa, miętowa, trzy razy dziennie 1 ml oleju parafinowego lub lnianego w ostateczności spożywczego.</br>"
					+ "Siemię lniane nawilża masę zalegającą w jelitach i pomaga w jej przesuwaniu. Gotujemy łyżeczkę siemienia w pół szklanki wody aż woda stanie się śliska i lekko ciągnąca, odstawiamy do wystygnięcia. Przecedzamy. Lekko ciepły kleik podajemy strzykawką (bez igły) do pyszczka, kilka razy dziennie. Ruch pomaga w przesuwaniu się treści pokarmowej, jeśli uszak odmawia biegania pomasujmy mu delikatnie brzuszek.</br>"
					+ "</br>"
					+ "Katar, przeziębienie - doraźnie może pomóc inhalacja takimi ziołami jak majeranek, tymianek i rumianek. Gorący wywar stawiamy blisko klatki, garnek i klatkę przykrywamy kocem na około 10 minut. Później dokładnie wycieramy uszaka. Możemy użyć też olejków dla niemowląt, skropić materiał i położyć w pobliżu klatki lub wkropić kilka kropelek do gorącej wody. Zapchany nosek czyścimy pompką/gruszką dla niemowląt.</br>"
					+ "</br>"
					+ "Oczy - łzawienie, zaczerwienienie, ropa - sprawdzamy czy przyczyna nie jest np. ciało obce, oczko przemywamy delikatnie solą fizjologiczną, świetlikiem lub zwykłą czarną herbatą. Królika pokazujemy weterynarzowi.</br>"
					+ "</br>"
					+ "Padaczka - usuwamy wszystkie niebezpieczne i twarde przedmioty, przygaszamy światło, wyłączamy tv i radio, cicho mówimy do królika, nie bierzemy na ręce!!!</br>"
					+ "</br>"
					+ "Udar cieplny - tu każda sekunda się liczy, chorego zwierzaka przenosimy w cień, podajemy wodę o temp. pokojowej! Ręcznikiem zamoczonym w chłodnej (nie lodowatej) wodzie przetrzeć najpierw głowę i uszy później łapy królika. Można podać pół łyżeczki kawy(nie w proszku), tak jak robimy normalnie kawę dla siebie. I szybko do weterynarza.</br>"
					+ "</br>"
					+ "Nieprzytomny królik - układamy zwierzaka na boku, głowę odchylamy do tylu aby umożliwić mu oddychanie.</br>"
					+ "</br>" + "Świąd - można ulżyć królikowi smarując swędzące miejsce fenistilem. </br>" + "</br>"
					+ "Zapalenie skóry podeszw, odgniotki - myjemy delikatnie skoki czystą, chłodną wodą, wycieramy i smarujemy maścią np. nagietkową, bepathen, tranową, sudocremem. Żwirek w kuwecie przykrywamy warstwa słomy lub siana, aby nie podrażniać chorych miejsc.</br>"
					+ "</br>"
					+ "Zakrztuszenie - układamy królika głową do dołu, jego plecy przylegają do naszego brzucha, prawą ręka szukamy miejsca gdzie kończą się żeberka a zaczyna brzuszek, naciskamy palcem wskazującym i środkowym 1-3 razy. </br>"
					+ "Jeśli zwierzak normalnie oddycha i przeżuwa to znaczy, że wszystko w porządku, jeśli nie - czynność powtarzamy.</br>"
					+ "</br>"
					+ "Mierzenie temperatury - Ważnym aspektem przy podejrzeniu choroby, lub początku infekcji jest kontrola ciepłoty królika. Odpowiednia temperatura ciała królika to 38-39,5 st.C. W przypadku podwyższonej temperatury należy zgłosić się do weterynarza, który przepisze odpowiednie leki, nigdy nie podawajmy na własną ręke leków stosowanych przez ludzi!</br>"
					+ "W przypadku temperatury zbyt niskiej ważne jest dogrzewanie królika, przy pomocy termoforu. Musimy pamiętać, że spadek temperatury u królika powoduje również, że leki działają dużo słabiej, lub nie działają wcale, dlatego istotne jest, aby temperatura została unormowana przed podawaniem leków.</br>"
					+ "Temperaturę mierzymy termometrem elektronicznym, i wkładamy go w odbyt nie głębiej niż 2 cm, głębsze włożenie może spowodować uszkodzenie narządów wewnętrznych. (głębokość zależna jest również od wielkości króliczka, ale nigdy nie wiecej niż 2 cm).</br>"
					+ "</br>"
					+ "Leki przeciwbólowe - Nigdy nie podawajmy na własną rękę, róbmy to zawsze po konsultacji z lekarzem, ale nie zapominajmy że w przypadku ch.oroby, której towarzyszy ból, środki przeciwbólowe są ważnym czynnikiem, który pomaga króliczkowi walczyć o siebie i w konsekwencji wyzdrowieć."));

	
		};
	}
}
