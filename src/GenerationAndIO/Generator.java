package GenerationAndIO;

import Person.*;

import java.util.ArrayList;

import static RandomUtils.RandomRange.*;

public class Generator {

    public static String[] name = { "Jan", "Andrzej", "Piotr", "Krzysztof", "Stanisław", "Tomasz", "Paweł", "Józef",
            "Marcin", "Marek", "Michał", "Grzegorz", "Jerzy", "Tadeusz", "Adam", "Łukasz", "Zbigniew", "Ryszard",
            "Dariusz", "Henryk", "Mariusz", "Kazimierz", "Wojciech", "Robert", "Mateusz", "Marian", "Rafał", "Jacek",
            "Janusz", "Mirosław", "Maciej", "Sławomir", "Jarosław", "Kamil", "Wiesław", "Roman", "Władysław", "Jakub",
            "Artur", "Zdzisław", "Edward", "Mieczysław", "Damian", "Dawid", "Przemysław", "Sebastian", "Czesław",
            "Leszek", "Daniel", "Waldemar" };
    public static String[] surname = { "Nowak", "Kowalski", "Wiśniewski", "Dąbrowski", "Lewandowski", "Wójcik",
            "Kamiński", "Kowalczyk", "Zieliński", "Szymański", "Woźniak", "Kozłowski", "Jankowski", "Wojciechowski",
            "Kwiatkowski", "Kaczmarek", "Mazur", "Krawczyk", "Piotrowski", "Grabowski", "Nowakowski", "Pawłowski",
            "Michalski", "Nowicki", "Adamczyk", "Dudek", "Zając", "Wieczorek", "Jabłoński", "Król", "Majewski",
            "Olszewski", "Jaworski", "Wróbel", "Malinowski", "Pawlak", "Witkowski", "Walczak", "Stępień", "Górski",
            "Rutkowski", "Michalak", "Sikora", "Ostrowski", "Baran", "Duda", "Szewczyk", "Tomaszewski", "Pietrzak",
            "Marciniak", "Wróblewski", "Zalewski", "Jakubowski", "Jasiński", "Zawadzki", "Sadowski", "Bąk",
            "Chmielewski", "Włodarczyk", "Borkowski", "Czarnecki", "Sawicki", "Sokołowski", "Urbański", "Kubiak",
            "Maciejewski", "Szczepański", "Kucharski", "Wilk", "Kalinowski", "Lis", "Mazurek", "Wysocki", "Adamski",
            "Kaźmierczak", "Wasilewski", "Sobczak", "Czerwiński", "Andrzejewski", "Cieślak", "Głowacki", "Zakrzewski",
            "Kołodziej", "Sikorski", "Krajewski", "Gajewski", "Szymczak", "Szulc", "Baranowski", "Laskowski",
            "Brzeziński", "Makowski", "Ziółkowski", "Przybylski" };
    public static String[] nationality = { "Polska", "Ukraina", "Anglia", "Francja", "Niemcy", "Hiszpania" };

    private static VitalSigns randomVitalSigns() {

        int[] bloodPressure = { randomRange(0, 110), randomRange(0, 150) };
        return new VitalSigns(bloodPressure, randomRange(0, 100), randomRange(0, 200), randomRange(33, 42));
    }

    public static Patient randomPatient() {

        VitalSigns vitalSigns = randomVitalSigns();
        return new Patient(name[randomRange(name.length)], surname[randomRange(surname.length)], randomRange(1, 110),
                randomBoolean(), nationality[randomRange(nationality.length)], "", "", vitalSigns, new ArrayList<>());
    }

    public static Doctor randomDoctor() {

        // FieldOfMedicine field = null; // to do

        // return new JakisDoktor(randomRange(5,10),randomRange(16,23),field);
        return null;
    }

    public static HospitalWorker randomHospitalWorker() {
        return randomDoctor();
    }

    // public static Patient randomNurse()
}
