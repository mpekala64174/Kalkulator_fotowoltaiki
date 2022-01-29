package com.company;

import javax.swing.*;   //Biblioteki konieczne do zaimplementowania, by obsłużyć GUI
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Marcel_Pekala
 * @version 1.0
 * @since 01.01.2022
 */
public class GUI implements ActionListener{ //klasa GUI implementująca interfejs ActionListener, zawierająca wykorzystywane elementy graficzne do interakcji z uzytkownikiem i inne wartości
    /**
     * @param podane_rachunki Podana wartość rachunków
     * @param podaj_rachunki Pole do wprowadzenia rachunków
     */
    JLabel podane_rachunki;
    JTextField podaj_rachunki;
    /**
     * @param podane_nachylenie Podana wartość nachylenia
     * @param podaj_nachylenie_1 Przycisk do wyboru nachylenia
     * @param podaj_nachylenie_2 Przycisk do wyboru nachylenia
     * @param podaj_nachylenie_3 Przycisk do wyboru nachylenia
     * @param podaj_nachylenie_4 Przycisk do wyboru nachylenia
     */
    JLabel podane_nachylenie;
    JButton podaj_nachylenie_1;
    JButton podaj_nachylenie_2;
    JButton podaj_nachylenie_3;
    JButton podaj_nachylenie_4;
    /**
     * @param podany_kierunek Podana wartość kierunku
     * @param podaj_kierunek_1 Przycisk do wyboru kierunku
     * @param podaj_kierunek_2 Przycisk do wyboru kierunku
     * @param podaj_kierunek_3 Przycisk do wyboru kierunku
     * @param podaj_kierunek_4 Przycisk do wyboru kierunku
     */
    JLabel podany_kierunek;
    JButton podaj_kierunek_1;
    JButton podaj_kierunek_2;
    JButton podaj_kierunek_3;
    JButton podaj_kierunek_4;
    /**
     * @param podane_zacienienie Podana wartość zacienienia
     * @param podaj_zacienienie_1 Przycisk do wyboru zacienienia
     * @param podaj_zacienienie_2 Przycisk do wyboru zacienienia
     * @param podaj_zacienienie_3 Przycisk do wyboru zacienienia
     */
    JLabel podane_zacienienie;
    JButton podaj_zacienienie_1;
    JButton podaj_zacienienie_2;
    JButton podaj_zacienienie_3;
    /**
     * @param moc_instalacji Obliczona moc instalacji
     * @param rozmiar_instalacji Obliczony rozmiar instalacji
     * @param zatwierdz Przycisk do zatwierdzania
     */
    JLabel moc_instalacji;
    JLabel rozmiar_instalacji;
    JButton zatwierdz;
    /**
     * @param zmienna_kierunek wartosc do obliczen
     * @param zmienna_nachylenie wartosc do obliczen
     * @param zmienna_zacienienie wartosc do obliczen
     * */
    float zmienna_kierunek=1.0f;
    float zmienna_nachylenie=1.0f;
    float zmienna_zacienienie=1.0f;

    /**
     * @param koszt_instalacji Obliczony koszt instalacji
     */
    JLabel koszt_instalacji;


    public GUI(){ //konstruktor bezparametrowy GUI
        JFrame ramka = new JFrame(); //okienko
        JPanel panel = new JPanel(); //kontener na elementy graficzne
        panel.setBorder(BorderFactory.createEmptyBorder(10,20,20,10)); //granice konteneru
        panel.setLayout(new GridLayout(0,1)); //układ typu Grid

        JLabel rachunki= new JLabel("Wysokość rachunków za prąd w zł/miesięcznie"); //przygotowanie opisów i pól do wprowadzania danych
        rachunki.setForeground(Color.BLUE);
        podaj_rachunki = new JTextField("1",50);

        zatwierdz = new JButton("Zatwierdź rachunki za prad");

        JLabel nachylenie= new JLabel("Stopień nachylenia dachu");
        nachylenie.setForeground(Color.BLUE);
        podaj_nachylenie_1 = new JButton("0-5 stopni");
        podaj_nachylenie_1.addActionListener(this);
        podaj_nachylenie_2 = new JButton("5-25 stopni");
        podaj_nachylenie_2.addActionListener(this);
        podaj_nachylenie_3 = new JButton("25-35 stopni");
        podaj_nachylenie_3.addActionListener(this);
        podaj_nachylenie_4 = new JButton("35-90 stopni");
        podaj_nachylenie_4.addActionListener(this);

        JLabel kierunek= new JLabel("Kierunek zwrotu dachu");
        kierunek.setForeground(Color.BLUE);
        podaj_kierunek_1 = new JButton("Północ");
        podaj_kierunek_1.addActionListener(this);
        podaj_kierunek_2 = new JButton("Południe");
        podaj_kierunek_2.addActionListener(this);
        podaj_kierunek_3 = new JButton("Wschód");
        podaj_kierunek_3.addActionListener(this);
        podaj_kierunek_4 = new JButton("Zachód");
        podaj_kierunek_4.addActionListener(this);

        JLabel zacienienie= new JLabel("Stopień zacienienia");
        zacienienie.setForeground(Color.BLUE);
        podaj_zacienienie_1= new JButton("Brak zacienienia");
        podaj_zacienienie_1.addActionListener(this);
        podaj_zacienienie_2= new JButton("Małe zacienienie");
        podaj_zacienienie_2.addActionListener(this);
        podaj_zacienienie_3= new JButton("Znaczące zacienienie");
        podaj_zacienienie_3.addActionListener(this);

        JLabel przerwa= new JLabel("    ");

        panel.add(rachunki); //dodawanie komponentów do kontenera
        panel.add(podaj_rachunki);

        panel.add(zatwierdz);
        zatwierdz.addActionListener(this);

        podane_rachunki =new JLabel("  ");
        panel.add(podane_rachunki);
        moc_instalacji = new JLabel("  ");
        panel.add(moc_instalacji);
        rozmiar_instalacji= new JLabel("  ");
        panel.add(rozmiar_instalacji);

        panel.add(nachylenie);
        panel.add(podaj_nachylenie_1);
        panel.add(podaj_nachylenie_2);
        panel.add(podaj_nachylenie_3);
        panel.add(podaj_nachylenie_4);

        panel.add(kierunek);
        panel.add(podaj_kierunek_1);
        panel.add(podaj_kierunek_2);
        panel.add(podaj_kierunek_3);
        panel.add(podaj_kierunek_4);

        panel.add(zacienienie);
        panel.add(podaj_zacienienie_1);
        panel.add(podaj_zacienienie_2);
        panel.add(podaj_zacienienie_3);

        panel.add(przerwa);

        podane_nachylenie = new JLabel("Domyślne nachylenie: 25-35 stopni");
        panel.add(podane_nachylenie);

        podany_kierunek = new JLabel("Domyślny kierunek: południe");
        panel.add(podany_kierunek);

        podane_zacienienie = new JLabel("Domyślne zacienienie: brak zacienienia");
        panel.add(podane_zacienienie);

        koszt_instalacji = new JLabel("  ");
        panel.add(koszt_instalacji);
        koszt_instalacji.setFont (koszt_instalacji.getFont ().deriveFont (24.0f));
        koszt_instalacji.setForeground(Color.GREEN);

        podaj_nachylenie_1.addActionListener(new ActionListener() { //obsługa zdarzeń dla każdego komponentu
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_nachylenie_1){
                    podane_nachylenie.setText("Podane nachylenie: "+podaj_nachylenie_1.getText());
                    zmienna_nachylenie= 1.2F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_nachylenie_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_nachylenie_2){
                    podane_nachylenie.setText("Podane nachylenie: "+podaj_nachylenie_2.getText());
                    zmienna_nachylenie= 1.05F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_nachylenie_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_nachylenie_3){
                    podane_nachylenie.setText("Podane nachylenie: "+podaj_nachylenie_3.getText());
                    zmienna_nachylenie= 1.0F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_nachylenie_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_nachylenie_4){
                    podane_nachylenie.setText("Podane nachylenie: "+podaj_nachylenie_4.getText());
                    zmienna_nachylenie= 1.1F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_zacienienie_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_zacienienie_1){
                    podane_zacienienie.setText("Podane zacienienie: "+podaj_zacienienie_1.getText());
                    zmienna_zacienienie=1.0F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_zacienienie_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_zacienienie_2){
                    podane_zacienienie.setText("Podane zacienienie: "+podaj_zacienienie_2.getText());
                    zmienna_zacienienie=1.025F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }

            }
        });
        podaj_zacienienie_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_zacienienie_3){
                    podane_zacienienie.setText("Podane zacienienie: "+podaj_zacienienie_3.getText());
                    zmienna_zacienienie=1.05F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_kierunek_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_kierunek_1){
                    podany_kierunek.setText("Podany kierunek: "+podaj_kierunek_1.getText());
                    zmienna_kierunek= 1.1F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_kierunek_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_kierunek_2){
                    podany_kierunek.setText("Podany kierunek: "+podaj_kierunek_2.getText());
                    zmienna_kierunek= 1.0F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });
        podaj_kierunek_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_kierunek_3){
                    podany_kierunek.setText("Podany kierunek: "+podaj_kierunek_3.getText());
                    zmienna_kierunek= 1.075F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }

            }
        });
        podaj_kierunek_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==podaj_kierunek_4){
                    podany_kierunek.setText("Podany kierunek: "+podaj_kierunek_4.getText());
                    zmienna_kierunek= 1.075F;
                    float koszt=(Float.parseFloat(podaj_rachunki.getText())*102f*zmienna_kierunek*zmienna_nachylenie*zmienna_zacienienie);
                    koszt_instalacji.setText("Koszt instalacji fotowoltaicznej: "+koszt+" zł");
                }
            }
        });


        ramka.add(panel, BorderLayout.CENTER); //dodanie konteneru do okna
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //dodanie metody zamknięcia, przerwania działania programu
        ramka.setTitle("Kalkulator Fotowoltaiki"); //wyświetlana nazwa programu
        ramka.pack(); //dopasowanie okienka tak, aby cała jej zawartość miała lub przekraczała preferowane rozmiary.
        ramka.setVisible(true); //wyswietlanie okienka
    }

    public static void main(String[] args) {
        new GUI(); //stworzenie obiektu GUI i rozpoczęcie pracy programu dzięki konstruktorowi
    }

    @Override
    public void actionPerformed(ActionEvent e) { // dodatkowa obsługa zdarzeń
        if(e.getSource()==zatwierdz){
            podane_rachunki.setText("Podana wartość rachunków: "+podaj_rachunki.getText()+" zł");

            float moc=(Float.parseFloat(podaj_rachunki.getText())*0.02f);
            moc_instalacji.setText("Moc potrzebnej instalacji fotowoltaicznej: "+moc+" KWp"); //1zl to 0.02kW mocy fotowoltaiki

            float powierzchnia=(Float.parseFloat(podaj_rachunki.getText())*0.13f); //1zl to 0.13m2 powierzchni paneli
            rozmiar_instalacji.setText("Powierzchnia potrzebnych paneli fotowoltaicznych: "+powierzchnia +" m2");
        }
    }

}