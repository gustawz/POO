/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author gustawz
 */
package com.mycompany.atv6a;

public class Atv6a {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.exibirDetalhes();
    }

    static class Circulo {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        public double calcularArea() {
            return Math.PI * raio * raio;
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * raio;
        }

        public void exibirDetalhes() {
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
        }
    }
}

