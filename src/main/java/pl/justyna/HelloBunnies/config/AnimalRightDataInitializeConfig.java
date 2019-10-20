package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.AnimalRight;
import pl.justyna.HelloBunnies.service.AnimalRightService;

@Configuration
public class AnimalRightDataInitializeConfig {
	@Autowired
	private AnimalRightService animalRightService;

	@Bean
	public InitializingBean insertAnimalRightInitialData() {
		return () -> {

			animalRightService.create(new AnimalRight("Światowa Deklaracja Praw Zwierząt", "</br>"
					+ "Uchwalona 21.09.1977 r. w Londynie przez Międzynarodową Federację Praw Zwierzęcia,</br>"
					+ " zał. 2.04.1977 w Genewie. Deklaracja przedłożona została UNESCO wraz z podpisami</br>"
					+ " dwu i pół miliona osób, członków europejskich towarzystw opieki i ochrony zwierząt:</br>"
					+ "</br>" + "\"Z uwagi na to, że każde zwierzę ma pewne prawa,</br>"
					+ "że nieznajomość i lekceważenie tych praw sprowadziły człowieka i prowadzą go nadal</br>"
					+ "na drogę przestępstw przeciwko naturze i zwierzętom;</br>"
					+ "że uznanie przez gatunek ludzki prawa innych gatunków zwierzęcych do egzystencji stanowi</br>"
					+ "podstawę współistnienia wszystkich istot żywych;</br>"
					+ "że człowiek popełnia zbrodnię ludobójstwa;</br>"
					+ "że poszanowanie zwierząt przez człowieka wiąże się z poszanowaniem ludzi między sobą</br>"
					+ "i że już od najmłodszych lat należy człowieka uczyć obserwować, rozumieć, szanować</br>"
					+ "i kochać zwierzęta;</br>" + "</br>" + "Niniejszym obwieszcza się:</br>" + "</br>" + "Art.1.</br>"
					+ "</br>"
					+ "Wszystkie zwierzęta rodzą się równe wobec życia i mają te same prawa do egzystencji.</br>"
					+ "</br>" + "Art.2.</br>" + "</br>" + "a) każde zwierzę ma prawo do szacunku</br>"
					+ "b) człowiek, jako gatunek zwierzęcy, nie może rościć sobie prawa do tępienia innych</br>"
					+ "zwierząt lub do ich wyzyskiwania. Ma natomiast obowiązek wykorzystania całej swej</br>"
					+ "wiedzy w służbie zwierząt,</br>"
					+ "c) każde zwierzę ma prawo oczekiwać od człowieka poszanowania, opieki i ochrony.</br>" + " </br>"
					+ "Art.3.</br>" + "</br>"
					+ "a) żadne zwierzę nie może być przedmiotem maltretowania i aktów okrucieństwa</br>"
					+ "b) jeśli okaże się, że zwierzę musi być zabite, należy je uśmiercić szybko, nie narażając</br>"
					+ " je na ból i trwogę.</br>" + " </br>" + "Art.4.</br>" + "</br>"
					+ "Każde zwierzę, które należy do gatunku dzikiego, ma prawo do życia na wolności w swym</br>"
					+ "naturalnym otoczeniu, ziemskim, powietrznym lub wodnym oraz prawo do rozmnażania się.</br>"
					+ "Każde pozbawienie wolności, choćby w celach edukacyjnych, jest z tym prawem sprzeczne.</br>"
					+ "</br>" + "Art.5.</br>" + "</br>"
					+ "a) każde zwierzę należące do gatunku, które żyje zazwyczaj w środowisku ludzkim,</br>"
					+ "ma prawo żyć i rosnąć zgodnie z rytmem i warunkami życia i wolności właściwymi dla swego gatunku,</br>"
					+ "b) każde zakłócenie tego rytmu i tych warunków przez człowieka w celach merkantylnych jest</br>"
					+ " z tym prawem sprzeczne.</br>" + "</br>" + "Art.6.</br>" + "</br>"
					+ "a) każde zwierzę, które człowiek wybrał na swego towarzysza, ma prawo żyć tak długo,</br>"
					+ "jak długo pozwala na to jego gatunkowa natura,</br>"
					+ "b) porzucenie zwierzęcia jest aktem okrutnym i nikczemnym.</br>" + "</br>" + "Art.7.</br>"
					+ "</br>"
					+ "Każde zwierzę pracujące ma prawo do pewnych ograniczeń czasu i intensywności tej pracy,</br>"
					+ " do odpowiedniego wyżywienia i odpoczynku.</br>" + " </br>" + "Art.8.</br>" + "</br>"
					+ "a) doświadczenia na zwierzętach, które wiążą się z cierpieniem fizycznym i psychicznym</br>"
					+ "niezgodne są z literą prawa zwierząt, zarówno w wypadku doświadczeń medycznych, naukowych,</br>"
					+ "handlowych, jak i wszystkich innych,</br>"
					+ "b) należy rozwijać i stosować w tym celu zastępcze metody techniczne.</br>" + "</br>"
					+ "Art.9.</br>" + "</br>"
					+ "Jeśli człowiek hoduje zwierzę w celach żywnościowych, należy je karmić, hodować,</br>"
					+ "przewozić i zabijać, nie narażając go na niepokój i ból.</br>" + "</br>" + "Art.10.</br>"
					+ "</br>" + "a) żadne zwierzę nie może służyć rozrywce człowieka,</br>"
					+ "b) wystawianie zwierząt na pokaz oraz widowiska z udziałem zwierząt narażają na szwank</br>"
					+ "godność zwierzęcia.</br>" + "</br>" + "Art.11.</br>" + "</br>"
					+ "Każdy akt prowadzący do zabicia zwierzęcia bez koniecznej przyczyny jest mordem,</br>"
					+ "czyli zbrodnią przeciwko życiu.</br>" + "</br>" + "Art.12.</br>" + "</br>"
					+ "a) każdy akt prowadzący do uśmiercenia dużej ilości zwierząt dzikich jest masowym morderstwem,</br>"
					+ " czyli zbrodnią przeciwko gatunkowi,</br>"
					+ "b) zanieczyszczenie i niszczenie środowiska naturalnego sieje śmierć.</br>" + "</br>"
					+ "Art.13.</br>" + "</br>" + "a) zwierzę martwe należy traktować z poszanowaniem,</br>"
					+ "b) sceny przemocy, której ofiarą padają zwierzęta, nie powinny mieć wstępu na ekrany kin</br>"
					+ " i telewizji, chyba, że mają inny cel poza samym tylko pokazywaniem, jak gwałci się prawa zwierząt.</br>"
					+ "</br>" + "Art.14.</br>" + "</br>"
					+ "a) stowarzyszenia ochrony i opieki zwierząt powinny mieć reprezentantów na szczeblu rządowym,</br>"
					+ "b) prawa zwierząt powinny być rozpowszechniane na równi z prawami człowieka.\"</br>" + ""));

		};

	}
}
