package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JLabel podane_rachunki;
    JTextField podaj_rachunki;

    JLabel podane_nachylenie;
    JButton podaj_nachylenie_1;
    JButton podaj_nachylenie_2;
    JButton podaj_nachylenie_3;
    JButton podaj_nachylenie_4;

    JLabel podany_kierunek;
    JButton podaj_kierunek_1;
    JButton podaj_kierunek_2;
    JButton podaj_kierunek_3;
    JButton podaj_kierunek_4;

    JLabel podane_zacienienie;
    JButton podaj_zacienienie_1;
    JButton podaj_zacienienie_2;
    JButton podaj_zacienienie_3;

    JLabel moc_instalacji;
    JLabel rozmiar_instalacji;
    JButton zatwierdz;

    float zmienna_kierunek=1f;
    float zmienna_nachylenie=1.0f;
    float zmienna_zacienienie=1.0f;

    JLabel koszt_instalacji;


    public GUI(){
        JFrame ramka = new JFrame();
        ramka.getContentPane().setBackground(Color.GREEN);

        JLabel rachunki= new JLabel("Wysokość rachunków za prąd w zł/miesięcznie");
        rachunki.setForeground(Color.BLUE);
        podaj_rachunki = new JTextField("1",50);

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

        zatwierdz = new JButton("Zatwierdź rachunki za prad");

        JLabel przerwa= new JLabel("    ");

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(10,20,20,10));
        panel.setLayout(new GridLayout(0,1));

        panel.add(rachunki);
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

        ramka.add(panel, BorderLayout.CENTER);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setTitle("Kalkulator Fotowoltaiki");
        ramka.pack();
        ramka.setVisible(true);


    }


    public static void main(String[] args) {
        new GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}