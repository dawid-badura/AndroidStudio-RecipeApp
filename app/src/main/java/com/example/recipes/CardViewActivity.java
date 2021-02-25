package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import maes.tech.intentanim.CustomIntent;

public class CardViewActivity extends AppCompatActivity {
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        //Tworzenie listy do której dodajemy nasze przepisy z tytułami i zdjeciami

        recipes = new ArrayList<>();

        recipes.add(new Recipes("RACUCHY","3 szklanki mąki pszennej\n" +
                "szczypta soli (1/4 łyżeczki)\n" +
                "1 i 1/2 szklanki ciepłej wody\n" +
                "50 g świeżych drożdży (w temperaturze pokojowej)\n" +
                "3 łyżki cukru\n" +
                "2 łyżki oliwy lub oleju","PRZYGOTOWANIE","Do dużej miski przesiać mąkę i wymieszać z solą. Ciepłą wodę wlać do kubka, dodać drożdże i dokładnie wymieszać. Zrobić wgłębienie w mące, wsypać cukier, wlać oliwę lub olej, a następnie dodając stopniowo wodę z drożdżami, mieszać składniki drewnianą łyżką. Można też dodać aromat waniliowy lub cytrynowy.\n" +
                "Ciasto wyrobić drewnianą łyżką, aż będzie gładkie (około 4 - 5 minut mieszania). Zostawić do wyrośnięcia w ciepłym miejscu, na około 1 godzinę. W tym czasie można przygotować smażone jabłka na nadzienie. Jabłka obrać i pokroić na ćwiartki, usuwając gniazda nasienne. Każdą ćwiartkę pokroić w poprzek na około 0,5 cm kawałki. Włożyć na patelnię i smażyć bez tłuszczu na średnim ogniu, mieszając od czasu do czasu, aż jabłka będą miękkie i miejscami lekko zrumienione. Ostudzić.\n" +
                "Stolnicę oprószyć cienką warstwą mąki. Naoliwioną łyżką nabierać porcje ciasta, formować kulki i układać na stolnicy zachowując odstępy. Ciasto będzie rzadkie, lejące się. Jeśli robimy racuchy z jabłkami, w środek ciasta wkładamy 1 pełną łyżeczkę jabłek.\n" +
                "Pozostawić do podrośnięcia na około 15 minut. Po tym czasie można już zacząć smażyć racuchy (zaczynając od tych, które uformowane były wcześniej i zdążyły już nieco podrosnąć).\n" +
                "Na głębokiej patelni z cienką powłoką, lub w woku (grube, żeliwne patelnie nie nadają się do głębokiego smażenia), wlać olej na wysokość około 3 - 4 cm. Gdy będzie gorący, wkładać do niego porcje ciasta, uważając aby temperatura oleju nagle się nie obniżyła. Ogień ma być średni, racuchy mają cały czas skwierczeć, ale nie rumienić się bardzo szybko. Każdego racucha smażyć po około 1 - 2 minucie z każdej strony na złoty kolor. Podczas smażenia racuchy będą rosły. Smażyć kolejne partie racuchów, wlewając i rozgrzewając dodatkowy olej w razie potrzeby.\n" +
                "Po upieczeniu racuchy odkładać na papierowe ręczniki. Posypać cukrem pudrem i podawać gdy są jeszcze ciepłe. Można mrozić i odgrzewać. Najlepsze na ciepło.",R.drawable.racuchy));

        recipes.add(new Recipes("NALEŚNIKI","120 g mąki pszennej\n" +
                "2 łyżki kakao\n" +
                "1 łyżka cukru\n" +
                "1 łyżka cukru wanilinowego\n" +
                "2 jajka\n" +
                "300 ml mleka\n" +
                "30 g roztopionego masła\n +" +
                "350 g serka waniliowego (homogenizowanego)","PRZYGOTOWANIE","Do miski wsypać mąkę, dodać kakao, cukier wanilinowy i cukier, wymieszać. Wlać mleko, dodać jajka i zmiksować na jednolite ciasto. Dodać roztopione, lekko ciepłe masło i ponownie zmiksować. Odstawić na min. 10 minut.\n" +
                "Nabierać łyżką wazową porcję ciasta i rozprowadzić je po nagrzanej patelni naleśnikowej. Smażyć naleśniki z dwóch stron przez ok. 2 minuty z każdej strony. Usmażyć ok. 8 naleśników.\n"+"Przestudzone ale ciepłe naleśniki smarować serkiem homogenizowanym i zwijać roladki.",R.drawable.nalesniki));

        recipes.add(new Recipes("GOFRY","1 i 1/2 szklanki mąki pszennej\n" +
                "1 i 1/2 łyżeczki proszku do pieczenia\n" +
                "szczypta soli\n" +
                "2 łyżeczki cukru pudru lub kryształu\n" +
                "1 łyżka cukru wanilinowego\n" +
                "2 jaja\n" +
                "1/2 szklanki oleju roślinnego (np. słonecznikowego) lub roztopionego masła\n" +
                "1 i 1/3 szklanki mleka","PRZYGOTOWANIE","Mąkę wsypać do miski, dodać proszek do pieczenia, sól, cukier, cukier wanilinowy. Wszystko wymieszać a następnie dodać jajka, olej roślinny oraz mleko. Zmiksować mikserem na gładką masę, tylko do połączenia się składników. Ciasto można odstawić aby odpoczęło (na około 15 minut), ale nie jest to konieczne.\n" +
                "Rozgrzać gofrownicę. Gofry piec przez około 3 - 3,5 minuty lub przez czas podany w instrukcji gofrownicy. Nakładamy ciasto chochlą i wypukłą stroną łyżki rozprowadzamy ciasto dokładnie po całej powierzchni.\n" +
                "Gofry po upieczeniu odkładać na metalową kratkę. Posypać cukrem pudrem i polać syropem klonowym. Lub podawać z ulubionymi dodatkami np. marmoladą, dżemem, owocami i bitą śmietaną",R.drawable.gofry));

        recipes.add(new Recipes("MUFFINKI CZEKOLADOWE","1 duży banan\n" +
                "140 g jogurtu naturalnego\n" +
                "4 łyżki miodu\n" +
                "1 jajko\n" +
                "1 i 1/2 szklanki mielonych migdałów\n" +
                "2 łyżki mąki ryżowej\n" +
                "1 łyżeczka sody oczyszczonej\n" +
                "2 łyżki kakao\n" +
                "4 łyżki wiórków kokosowych\n" +
                "4 łyżki posiekanych orzechów \n" +
                "50 g ciemnej czekolady","PRZYGOTOWANIE","Piekarnik nagrzać do 175 stopni C. Standardową formę na muffiny wypełnić 9 papilotkami.\n" +
                "W jednej misce dokładnie rozgnieść widelcem banana z jogurtem naturalnym. Następnie dodać miód oraz jajko, wszystko wymieszać widelcem.\n" +
                "W drugiej misce wymieszać mielone migdały, mąkę ryżową, sodę, kakao, wiórki kokosowe i orzechy.\n" +
                "Do suchych składników dodać mokre i powoli mieszać widelcem lub łyżką tylko do połączenia się składników, nie dłużej. Nałożyć ciasto do 9 papilotek, posypać posiekaną czekoladą i piec przez ok. 25 minuty. Wyjąć z piekarnika i ostudzić. Muffinki nie wyrastają ponad poziom papilotki, środek może się troszkę zapaść.",R.drawable.muffinki));

        recipes.add(new Recipes("FAWORKI","400 g mąki pszennej\n" +
                "szczypta soli\n" +
                "1 łyżeczka proszku do pieczenia\n" +
                "1 jajko\n" +
                "5 żółtek\n" +
                "1 łyżka cukru pudru\n" +
                "6 łyżek gęstej kwaśnej śmietany\n" +
                "1 łyżka spirytusu lub octu","PRZYGOTOWANIE","Mąkę przesiać do miski, dodać sól i proszek do pieczenia, wymieszać. W drugiej misce ubić jajko i żółtka z łyżką cukru pudru na puszystą i gęstą pianę (ubijać przez ok. 8 minut, początkowo najlepiej na parze aby żółtka się ogrzały).\n" +
                "Dodać do mąki, następnie dodać śmietanę i spirytus, zmiksować lub wymieszać łyżką. Połączyć składniki i zagnieść gładkie ciasto. Uformować kulę, zawinąć w folię spożywczą i odstawić na około 30 - 45 minut w temperaturze pokojowej (po tym czasie ciasto będzie łatwiejsze do wałkowania).\n" +
                "Ciasto zagniatać przez ok. 7 minut, następnie rozwałkować na placek, złożyć na pół i znów rozwałkować, ponownie składać i rozwałkowywać jeszcze 2-3 razy, w międzyczasie można też tłuc ciasto wałkiem. W ten sposób uelastyczniamy ciasto i wtłaczamy w nie powietrze.\n" +
                "Ciasto podzielić na 4 części i kolejno rozwałkowywać na jak najcieńsze placki (im cieńsze tym lepiej). Resztę ciasta trzymać zawinięte w folię spożywczą.\n" +
                "Nożem lub radełkiem wycinać paski (ścięte na końcach prostokąty), mniejsze niż średnica garnka. W środku każdego paska zrobić nacięcie, przez które przełożyć (przewlec) jeden koniec ciasta. Złapać za końce i delikatnie potrząsnąć aby faworek miał ładny kształt. Odkładać na bok i trzymać pod ściereczką podczas wycinania kolejnych faworków.\n" +
                "Rozgrzać olej do 180 stopni C w szerokim garnku i wkładać do niego po kilka faworków jednocześnie (szybko urosną i pokryją się pęcherzami powietrza). Smażyć na złoty kolor, po około 30 - 60 sekund z każdej strony.\n" +
                "Faworki układać na ręcznikach papierowych. Po ostudzeniu posypać cukrem pudrem. Można podawać z marmoladą lub konfiturą.",R.drawable.faworki));

        recipes.add(new Recipes("PĄCZKI TRADYCYJNE","25 g świeżych drożdży\n" +
                "125 ml (1/2 szklanki) ciepłego mleka\n" +
                "1 łyżeczka cukru\n" +
                "2 żółtka\n" +
                "1 jajko\n" +
                "4 łyżki cukru wanilinowego\n" +
                "300 g (2 szklanki) mąki pszennej\n" +
                "1/3 łyżeczki soli\n" +
                "35 g masła\n" +
                "olej do smażenia","PRZYGOTOWANIE","Przygotować rozczyn: drożdże skruszyć do dużego kubka, dodać 2 łyżki mąki, 1 łyżeczkę cukru i 1/4 szklanki ciepłego mleka. Wymieszać i zostawić do wyrośnięcia na 15 - 20 minut.\n" +
                "Jajko i żółtka utrzeć z cukrem wanilinowym. Mąkę przesiać do dużej miski i wymieszać z solą. Do mąki dodać wyrośnięty rozczyn, resztę ciepłego mleka i ubite jajka.\n" +
                "Powoli wymieszać, następnie wyrabiać przez 15 minut. Dodać stopione masło i wyrabiać jeszcze przez kolejne 5 minut. Przykryte ściereczką ciasto odstawić do wyrośnięcia w ciepłe miejsce.\n" +
                "Gdy ciasto podwoi swoją objętość (po około 1 i 1/2 godzinie) wyłożyć je na stolnicę oprószoną mąką i chwilę powygniatać pozbywając się pęcherzy powietrza, rozwałkować na gruby placek (w razie potrzeby można podsypać mąką), taki aby wyciąć z niego 10 kółek. Z ciasta za pomocą ostrej szklanki wyciąć krążki i odłożyć do wyrośnięcia na około 45 minut.\n" +
                "Smażyć partiami (po 4 sztuki) w rozgrzanym oleju, aż będą ładnie zrumienione (nie mogą rumienić się zbyt szybko), w połowie smażenia przewrócić. Wyjąć na ręcznik papierowy.\n" +
                "Polać lukrem zmieszanym ze skórką pomarańczową lub tylko posypać cukrem pudrem zmieszanym z cukrem wanilinowym.",R.drawable.paczki));

        recipes.add(new Recipes("LODY TRUSKAWKOWE","1 duże opakowanie jogurtu greckiego (330 g)\n" +
                "100 ml słodzonego mleka skondensowanego z puszki\n" +
                "250 g truskawek","PRZYGOTOWANIE","Jogurt grecki włożyć do miski, dodać mleko skondensowane oraz zmiksowane na mus truskawki, dokładnie wymieszać. Przełożyć do maszyny do lodów lub wstawić do zamrażarki na kilka godzin, w międzyczasie - co około pół godziny - masę dokładnie wymieszać (w ten sposób pozbywamy się kryształków lodu).\n" +
                "Używając schłodzonej sorbetiery lody otrzymamy w zasadzie natychmiast i to bez żadnej pracy, gdyż wcześniej schładzamy misę sorbetiery (min. 24 godziny) i wkładamy do niej masę tylko na kilka(naście) minut mieszania - po tym czasie lody są już gotowe.",R.drawable.lody));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        backToMain();
    }

    public void backToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        CustomIntent.customType(this,"");
    }

}
