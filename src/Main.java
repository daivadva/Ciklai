import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //       for (int i =0; i <10; i++){
//        }

//        int number = 124;
//        int [] numbers = new int[3];
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        numbers[0] = 26;
//        numbers[1] = 14;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//
//        //masyvai yra dieju tipu: primityvus (kur virsuje) ir objektiniai. primityvus yra kaip mazos dezutes.
//                    //      0,1,2 - indeksai
//        int [] numbers3 = {3,6,10}; //is karto nurodomos masyvo reiksmes
//        System.out.println(numbers3[2]);
//
//        System.out.println(numbers3.length); // masyvo elementu skaicius
//
//        for (int i = 0; i < 3; i++) {
////            System.out.println(numbers3[0]);
////            System.out.println(numbers3[1]);
////            System.out.println(numbers3[2]);
//
//            System.out.println(numbers3[i]);
//
//        }
//
//        for (int i = 0; i < numbers3.length; i++) { //nenurodant masyvo indeksu skaiciaus. SABLONISKAS NUSTATYMAS
//            System.out.println(numbers3[i]);
//        }

        //ar  nustatytas skaicius porinis:
        // 14 / 5 = java grazins 2, nes intai   14.0/5 = 2.8
        // 14 % 5 = 4 likutine reiksme palieka: 14-5=9; 9-5=4 t.y. grazina liekana
        // 50 % 2==0; true
        // 51 % 2 ==0; false :             taip suzinom porinius skaicius


//        //Reverse
//        for (int i = 10; i < 0; i--) {
//        }
//
//        String [] arr = {}


//
//        System.out.println("............................................");
        //UZDUOTYS

        //1 Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        for (int i = 0; i < 10; i++) {
            System.out.println("Labas");
        }
        System.out.println("...............................");
//
//        //2 Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(".......................................");
//
        //3 Sukurkite masyvą su dešimties augalų pavadinimų.
        String[] plants = {"Berzas", "Egle", "Klevas", "Alyva", "Tulpe", "Narcizas", "Pusis", "Azuolis", "Zibute", "Jazminas"};
//
//        //4 Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.
//
        for (int i = 0; i < 10; i++) {
            System.out.println(plants[i]);
        }

        System.out.println(".......................");

//        //5 Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).
        String[] plants2 = {"Berzas", "Egle", "Klevas", "Alyva", "Tulpe", "Narcizas", "Pusis", "Azuolis", "Zibute", "Jazminas"};
        for (int i = plants2.length - 1; i >= 0; i--) {
            System.out.println(plants2[i]);

            System.out.println("............................");

//
//        //6 Atspausdinkite kas antrą skaičių nuo 10 iki 50 (pornius);

            for (int j = 10; j <= 50; j++) {
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }
            System.out.println("....................................");
//
//        // 7 Atspausdinkite kas antrą skaičių nuo 10 iki 50. (pornius) Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)
            for (int j = 10; j < 50; j++) {
                if (j % 10 == 0) {
                    continue;
                }
                if (j % 2 == 0) {
                    System.out.println(j);
                }
            }

            System.out.println("............................");
//
//        //8 Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę;
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (j % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);

            System.out.println("...............................");

            //9 Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)

            String[] plants9 = {"Berzas", "Egle", "Klevas", "Alyva", "Tulpe", "Rododendras", "Pusis", "Azuolis", "Zibute", "Jazminas"};

            int count9 = 0;
            int count91 = 0;
            for (int j = 0; j < plants9.length; j++) {
                System.out.println(plants9[j].length());
                if (plants9[j].length() < 5) {
                    count9++;
                }
                if (plants9[j].length() > 7) {
                    count91++;
                }
            }

            System.out.println("Less than 5 letters: " + count9);
            System.out.println("More than 7 letters: " + count91);

            System.out.println("............................");


//        //10 Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių ilgio)
            int count10 = 0;
            for (int j = 0; j < plants9.length; j++) {
                if (plants9[j].length() > 5 && plants9[j].length() < 10) {
                    count10++;
                }
            }
            System.out.println(count10);

            System.out.println("...........................");
//
//        //2.1 Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.
///
            int min = 0;
            int max = 300;
            int count11 = 0;

            for (int j = 0; j < 300; j++) {
                int rndNum = min + (int) Math.round(Math.random() * (max - min));
                if (rndNum <= 275) {
                    System.out.print(" " + rndNum + " ");
                }
                if (rndNum > 275) {
                    System.out.print("[" + rndNum + "]" + " ");
                }
                if (rndNum > 150) {
                    count11++;
                }
            }
            System.out.println(); // kai darai print pries tai, toliau darant println programa vis tiek sukisa viska i viena eilute, reikia tiesiog prinln viena padaryti tusciais skliaustais
            System.out.println("Less than 150: " + count11);

            System.out.println(".................................");

            //2.2 Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos. Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.

            // 1 sprendimo variantas:

            String numbers = "";
            for (int j = 1; j <= 3000; j++) {
                if (j % 77 == 0) {
                    numbers = numbers + j + ",";
                }
            }
            System.out.println(numbers.substring(0, numbers.length() - 1));

//        // 2 sprendimo variantas:
            numbers = "";
            for (int j = 77; j < 3000; j += 77) {
                numbers = numbers + j + ",";
            }
            System.out.println(numbers.substring(0, numbers.length() - 1));

            System.out.println("........................");

////        // 2.3
        int maxrows = 25;

        for (int a = 0; a < maxrows; a++) {//a=0; a=1; isorinis ciklas rodo jud4ejima vertikaliai zemyn
            for (int j = 0; j <25 ; j++) {  //vidinis ciklas rodo atvaizdavima x asimi.
                    System.out.print("* ");
            }
            System.out.println(); // iskaido koda, kad spausdintu i atskiras eilutes.
        }

        System.out.println();
        System.out.println(".....................");


            // 2.5. Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius. Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas. Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
            //Iškritus herbui;
            //Tris kartus iškritus herbui;
            //Tris kartus iš eilės iškritus herbui;


            //2.5.A
        int min5 = 0;
        int max5 = 1;
        int count2 = 0;
        while (true) {
            int rndNum5 = min5 + (int) Math.round(Math.random() * (max5 - min5));
            if (rndNum5 == 0) {
                System.out.println("H");
                break;
            }
            if (rndNum5 == 1) {
                System.out.println("S");
            }
        }
        System.out.println(".....................");

//        //2.5.B
        while (true) {
            int rndNum6 = min5 + (int) Math.round(Math.random() * (max5 - min5));
            if (rndNum6 == 1) {
                System.out.println("S");
                continue;
            }
            if (rndNum6 == 0) {
                System.out.println("H");
                count2++;
                if (count2 == 3) {
                    break;
                }
            }
        }
        System.out.println("..........................");

////        // 2.5.C
//
        int count3 = 0;
        while (true) {
            int rndNum5 = min5 + (int) Math.round(Math.random() * (max5 - min5));
            if (rndNum5 == 1) {
                System.out.println("S");
                count3=0;
            }
            if (rndNum5 == 0) {
                System.out.println("H");
                count3++;
                if (count3 == 3) {
                    break;
                }
            }
        }

            // 6 Kazys ir Petras žaidžia šaškėm. Petras surenka taškų kiekį nuo 10 iki 20, Kazys surenka taškų kiekį nuo 5 iki 25. Vienoje eilutėje išvesti žaidėjų vardus su taškų kiekiu ir “Partiją laimėjo: ​laimėtojo vardas​”. Taškų kiekį generuokite funkcija ​Math.random()​. Žaidimą laimi tas, kas greičiau surenka 222 taškus. Partijas kartoti tol, kol kažkuris žaidėjas pirmas surenka 222 arba daugiau taškų.
            int min6 = 10;
            int max6 = 20;
            int taskaiPetras = min6 + (int) Math.round(Math.random() * (max6 - min6));
            int min2 = 5;
            int max2 = 25;
            int taskaiKazys = min2 + (int) Math.round(Math.random() * (max2 - min2));
            if (taskaiPetras > taskaiKazys) {
                System.out.println("Partija laimejo: Petras. Taskai: " + taskaiPetras);
            }
            if (taskaiPetras < taskaiKazys) {
                System.out.println("Partija laimejo: Kazys. Taskai: " + taskaiKazys);
            }

            int sumPetras = 0;
            int sumKazys = 0;
            while (true) {
                int taskaiPetras2 = min6 + (int) Math.round(Math.random() * (max6 - min6));
                int taskaiKazys2 = min2 + (int) Math.round(Math.random() * (max2 - min2));
                if (taskaiPetras2 >= 0) {
                    sumPetras = sumPetras + taskaiPetras2;
                }
                if (taskaiKazys2 >= 0) {
                    sumKazys = sumKazys + taskaiKazys2;
                }
                if (sumPetras >= 222 || sumKazys >= 222) {
                    break;
                }
            }
            System.out.println("Petro taskai:" + sumPetras + " " + "Kazio taskai: " + sumKazys);


        }

    }
}
