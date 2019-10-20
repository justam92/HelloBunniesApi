package pl.justyna.HelloBunnies.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.justyna.HelloBunnies.model.Nourishment;
import pl.justyna.HelloBunnies.service.NourishmentService;

@Configuration
public class NourishmentDataInitializeConfig {

	@Autowired
	private NourishmentService nourishmentService;

	@Bean
	public InitializingBean insertNourishmentInitialData() {
		return () -> {

			nourishmentService.create(new Nourishment(2L, "Bazylia", "10,7/61", "86/369", null, null, null));

			nourishmentService.create(new Nourishment(2L, "Golliwoog", null, "180", null, null, null));

			nourishmentService.create(new Nourishment(2L, "Gwiazdnica pospolita", "89", "80", "54", null, null));

			nourishmentService.create(new Nourishment(2L, "Komosa biała", "35/152", "100/1090", "35/381", null, null));

			nourishmentService.create(new Nourishment(2L, "Koperek", "50/116,8", "230/1343", "66", null, null));

			nourishmentService
					.create(new Nourishment(2L, "Lucerna (alfala)", "8/---", "450/950", "62/250", null, null));

			nourishmentService.create(new Nourishment(2L, "Macierzanka", "9/50", "300/1800", "35/200", null, null));

			nourishmentService.create(new Nourishment(2L, "Majeranek", "10/50", "350/2000", "50/300", null, null));

			nourishmentService.create(new Nourishment(2L, "Malwa", "178", "200", "95", null, null));

			nourishmentService.create(new Nourishment(2L, "Melisa", "45/126", "150/1056", "50/352", null, null));

			nourishmentService.create(new Nourishment(2L, "Mięta", "45", "150", "50", null, null));

			nourishmentService
					.create(new Nourishment(2L, "Mniszek lekarski", "30/82,2", "170/1164", "70/479", null, null));

			nourishmentService.create(new Nourishment(2L, "Ogórecznik", "35", "93", "53", null, null));

			nourishmentService.create(new Nourishment(2L, "Oregano", "10/60", "264/1576", "54", null, null));

			nourishmentService
					.create(new Nourishment(2L, "Pietruszka (nać)", "160/472,8", "250/1847", "130/960", null, null));

			nourishmentService.create(new Nourishment(2L, "Podagrecznik pospolity", "201", "230", "88", null, null));

			nourishmentService.create(new Nourishment(2L, "Podbiał pospolity", "104", "320", "51", null, null));

			nourishmentService.create(new Nourishment(2L, "Pokrzywa", "377,4", "1078", "647", null, null));

			nourishmentService.create(new Nourishment(2L, "Rozmaryn", "10/61", "221/1280", "12/70", null, null));

			nourishmentService.create(new Nourishment(2L, "Rukiew wodna", "185", "230", "79", null, null));

			nourishmentService.create(new Nourishment(2L, "Rzeżucha", "bardzo dużo", "214", null, null, null));

			nourishmentService.create(new Nourishment(2L, "Stokrotka", "87", "190", null, null, null));

			nourishmentService.create(new Nourishment(2L, "Szałwia", "5", "270", "15", null, null));

			nourishmentService
					.create(new Nourishment(2L, "Szczaw zwyczajny", "50/243,4", "50/609", "70/852", null, null));

			nourishmentService.create(new Nourishment(2L, "Trawa", "114", "80", "72", null, null));

			nourishmentService
					.create(new Nourishment(2L, "Trybula ogrodowa", "36/65", "400/1819", "50/227", null, null));

			nourishmentService
					.create(new Nourishment(3L, "Bakłażan", "5", "12", "20", "rzadko", "dojarzałe owoce, bez ogonka"));

			nourishmentService.create(
					new Nourishment(3L, "Brokuły", "110", "100", "80", "codziennie", "liście, różyczki i łodyga"));

			nourishmentService
					.create(new Nourishment(3L, "Brukiew", "21,2", "49", "21", "codziennie", "korzeń i liście"));

			nourishmentService.create(
					new Nourishment(3L, "Brukselka", "94", "22", "72", "codziennie", "łodyga, liście i główki"));

			nourishmentService
					.create(new Nourishment(3L, "Buraki", "5,1", "25", "38", "w małych ilościach", "korzeń i liście"));

			nourishmentService.create(new Nourishment(3L, "Liście buraka", "30", "97", "36", null, "liście"));

			nourishmentService.create(
					new Nourishment(3L, "Cukinia", "16", "23", "32", null, "owoc razem ze skórką, liście i kwiaty"));

			nourishmentService
					.create(new Nourishment(3L, "Cykoria", "10", "20", "23", "codziennie", "liście i nasiona"));

			nourishmentService
					.create(new Nourishment(3L, "Cykoria ctalogna", null, null, null, "codziennie", "liście"));

			nourishmentService.create(
					new Nourishment(3L, "Dynia", "18", "25", "30", "codziennie", "liście, owoc, nasiona i kwiaty"));

			nourishmentService.create(new Nourishment(3L, "Endywia", "10", "50", "60", "codziennie", "liście"));

			nourishmentService
					.create(new Nourishment(3L, "Fenkuł", "93", "100", "51", "codziennie", "liście, bulwa i nasiona"));

			nourishmentService.create(new Nourishment(3L, "Groszek zielony", "16,3", "28", "122", null,
					"razem ze strąkiem, liśćmi i kwiatami"));

			nourishmentService
					.create(new Nourishment(3L, "Jarmuż", "110", "210", "80", "codziennie", "liście i łodyga"));

			nourishmentService.create(
					new Nourishment(3L, "Kabaczek", "12,3", "22", "19", null, "owoc razem ze skórką, liście i kwiaty"));

			nourishmentService.create(new Nourishment(3L, "Kalafior", "49", "20", "28", "w małych ilościach",
					"różyczki, liście, łodyga"));

			nourishmentService
					.create(new Nourishment(3L, "Kalarepa", "64", "70", "50", "codziennie", "liście i korzeń"));

			nourishmentService.create(new Nourishment(3L, "Kapusta", "82", "169", "139",
					"rzadko, może powodować wzdęcia, uwaga: wzdęcie może skończyć się śmiercią", "liście, głąb"));

			nourishmentService
					.create(new Nourishment(3L, "Kapusta pekińska", "35", "80", "30", "codziennie", "liście"));

			nourishmentService.create(
					new Nourishment(3L, "Koper", "50", "230", "66", "codziennie", "listki, łodygi, kwiaty i nasiona"));

			nourishmentService
					.create(new Nourishment(3L, "Karczoch", "8", "50", "130", "1-2 w tygodniu", "tylko główka"));

			nourishmentService.create(
					new Nourishment(3L, "Kukurydza", "12", "5", "120", "w małych ilościach", "liście, łodyga, kolby"));

			nourishmentService.create(
					new Nourishment(3L, "Mangold", "35", "100", "40", "w małych ilościach", "liście z łodygami"));

			nourishmentService.create(
					new Nourishment(3L, "Marchew", "7", "40", "30", "codziennie", "korzeń, liście, kwiaty i nasiona"));

			nourishmentService.create(new Nourishment(3L, "Ogórek", "10", "20", "24",
					"codziennie - może powodować miękkie bobki", "owoc, kwiat, nasiona i liście"));

			nourishmentService.create(new Nourishment(3L, "Papryka czerwona", "150", "15", "35", "codziennie", null));

			nourishmentService.create(new Nourishment(3L, "Papryka żółta", "394", "51", "26", "codziennie",
					"bez ogonka, zawiera solaninę"));

			nourishmentService.create(new Nourishment(3L, "Papryka zielona", "192", "10", "25", "codziennie",
					"bez ogonka, zawiera solaninę"));

			nourishmentService
					.create(new Nourishment(3L, "Pasternak", "17", "50", "70", "codziennie", "korzeń i liście"));

			nourishmentService.create(new Nourishment(3L, "Pietruszka (korzeń)", "41", "60", "60", "codziennie",
					"korzeń, natka, kwiat (nasiona nie dla ciężarnych samic)"));

			nourishmentService.create(new Nourishment(3L, "Pomidor (bez zielonych części)", "22", "13", "25", null,
					"owoc bez ogonka, cały krzaczek jest trujący"));

			nourishmentService
					.create(new Nourishment(3L, "Roszponka", "30", "30", "49", "rzadko", "listki, nasiona i kwiat"));

			nourishmentService.create(new Nourishment(3L, "Rukola", "30", "160", "52", "rzadko", "liście"));

			nourishmentService.create(new Nourishment(3L, "Rzepa", "38", "50", "30", "codziennie", "korzeń i liście"));

			nourishmentService.create(new Nourishment(3L, "Rzeżucha", "60,2", "195", "60", "w małych ilościach",
					"nasiona, cała roślina"));

			nourishmentService.create(
					new Nourishment(3L, "Rzodkiewka (korzeń)", "26", "bardzo dużo", "19", "rzadko", "korzeń, nasiona"));

			nourishmentService
					.create(new Nourishment(3L, "Sałata głowiasta", "14", "35", "30", "rzadko", "liście i nasiona"));

			nourishmentService
					.create(new Nourishment(3L, "Salata lodowa", "3,9", "19", "20", "rzadko", "liście i nasiona"));

			nourishmentService
					.create(new Nourishment(3L, "Sałata rzymska", "24", "36", "45", "codziennie", "liście i nasiona"));

			nourishmentService.create(new Nourishment(3L, "Seler korzeniowy", "9", "70", "90", "codziennie", null));

			nourishmentService.create(
					new Nourishment(3L, "Seler listkowy", "100", "587", "402", "codziennie", "korzeń i liście"));

			nourishmentService.create(new Nourishment(3L, "Seler naciowy", "20", "41", "90", "codziennie", "całość"));

			nourishmentService
					.create(new Nourishment(3L, "Szczaw", "50", "80", "23", "w małych ilościach", "liście i nasiona"));

			nourishmentService
					.create(new Nourishment(3L, "Szparagi", "21", "20", "52", "rzadko", "odmiana zielona i biała"));

			nourishmentService
					.create(new Nourishment(3L, "Szpinak", "50", "125", "55", "w małych ilościach", "liście"));

			nourishmentService.create(
					new Nourishment(3L, "Topinambur", "4", "10", "78", null, "całą roślinę z kwiatami i korzeniem"));

			nourishmentService
					.create(new Nourishment(4L, "Ananas", "20", "16", "9", "wspomaga wydalanie sierści", null));

			nourishmentService.create(new Nourishment(4L, "Agrest", null, null, null, null, "owoce, gałązki i liście"));

			nourishmentService.create(
					new Nourishment(4L, "Arbuz", "6", "10", "9", "w lecie 2-3 razy w tygodniu", "owoc z pestkami"));

			nourishmentService.create(new Nourishment(4L, "Aronia", null, null, null, null, "owoce, gałązki i liście"));

			nourishmentService.create(new Nourishment(4L, "Banan", "11", "8", "20",
					"w małych ilościach, bardzo kaloryczny", "bez skórki"));

			nourishmentService.create(new Nourishment(4L, "Brzoskwinia", "6,6", "8", "24", null, "owoc bez pestki"));

			nourishmentService.create(new Nourishment(4L, "Czereśnie", "7", "20", "16", "może wywoływać biegunki",
					"owoc bez pestki i ogonka"));

			nourishmentService.create(new Nourishment(4L, "Dzika róża", "257", "258", "61", null,
					"całe owoce, liście i gałązki, także suszone"));

			nourishmentService.create(
					new Nourishment(4L, "Figa", "2,5", "50", "32", "rzadko, duża zawartość cukru", "świeże i suszone"));

			nourishmentService.create(new Nourishment(4L, "Grejpfrut", "32,2", "15", "14",
					"rzadko, w małych ilościach, może wywołać biegunkę", null));

			nourishmentService.create(new Nourishment(4L, "Gruszka", "4,5", "9", "15",
					"duża zawartość cukrów, działa wspomagając w leczeniu chorób układu moczowego", null));

			nourishmentService.create(new Nourishment(4L, "Jabłko", "10", "7", "10",
					"małe ilości nawet codziennie, pomocne przy biegunce, problemach z trawieniem", null));

			nourishmentService.create(new Nourishment(4L, "Jagody", "22", "10", "14",
					"świeże i suszone, 1-2 razy w tygodniu", "można podawać całą roślinę"));

			nourishmentService.create(new Nourishment(4L, "Jeżyny", "17", "44", "30", "1-2 razy w tygodniu",
					"owoce i liście, kolce nie stanowią problemu"));

			nourishmentService.create(new Nourishment(4L, "Kaki", "80", "34", "32",
					"wspomaga wydalanie sierści, wzmacnia odporność", null));

			nourishmentService.create(new Nourishment(4L, "Malina", "25", "40", "33",
					"świeża i suszona, poprawia apetyt", "można podawać całą roślinę"));

			nourishmentService.create(
					new Nourishment(4L, "Mandarynka", "30", "35", "18", "wzmacnia odporność", "bez skórki i pestek"));

			nourishmentService.create(new Nourishment(4L, "Mango", "36,5", "10", "13", null, "bez pestek, ze skórką"));

			nourishmentService.create(new Nourishment(4L, "Melon", "30", "10", "22", null, "bez pestek, ze skórką"));

			nourishmentService.create(
					new Nourishment(4L, "Miechunka peruwiańska", null, null, null, null, "sam owoc, bez osłonki"));

			nourishmentService.create(new Nourishment(4L, "Morele", "9", "17", "21", null, "bez pestki"));

			nourishmentService.create(new Nourishment(4L, "Nektarynki", "9", "4", "24", null, "bez pestki"));

			nourishmentService
					.create(new Nourishment(4L, "Papaja", "61,8", "20", "5", "wspomaga wydalanie sierści", null));

			nourishmentService.create(new Nourishment(4L, "Pigwa", null, null, null, null,
					"dobrze dojrzałe owoce - rzadko; gałązki, kwiaty i liście - codziennie"));

			nourishmentService.create(new Nourishment(4L, "Pomarańcza", "50", "40", "22",
					"w małych ilościach, rzadko, wzmacnia odporność", null));

			nourishmentService.create(new Nourishment(4L, "Porzeczka czarna", "182,6", "39", "58", null,
					"owoce - rzadko; liście i gałązki - codziennie"));

			nourishmentService.create(new Nourishment(4L, "Porzeczka czerwona", "45,8", "36", "33", null,
					"owoce - rzadko; liście i gałązki - codziennie"));

			nourishmentService.create(new Nourishment(4L, "Porzeczka biała", "40", "30", "28", null,
					"owoce - rzadko; liście i gałązki - codziennie"));

			nourishmentService
					.create(new Nourishment(4L, "Poziomka", "62", "30", "27", null, "cały krzaczek wraz z owocami"));

			nourishmentService.create(new Nourishment(4L, "Rokitnik", null, null, null, "dużo witaminy C", null));

			nourishmentService.create(
					new Nourishment(4L, "Śliwka (wszystkie rodzaje)", "9,5", "14", "20", null, "bez pestki, rzadko"));

			nourishmentService.create(
					new Nourishment(4L, "Truskawka", "60", "30", "25", null, "świeże i suszone, razem z liśćmi"));

			nourishmentService.create(new Nourishment(4L, "Winogrono (ciemne i zielone) i rodzynki", "4", "4-19", "21",
					"Rodzynki jako przysmak", "można podawać z pestkami"));

			nourishmentService.create(new Nourishment(4L, "Wiśnie", "12", "20", "20",
					"w połączeniu z wodą mogą powodować biegunki", null));

			nourishmentService.create(
					new Nourishment(4L, "Żurawina", "13,5", "8", "12", "pomocna w chorobach układu moczowego", null));

		};
	}
}
