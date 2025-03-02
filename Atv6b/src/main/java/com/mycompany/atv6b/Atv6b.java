/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author gustawz
 */
package com.mycompany.atv6b;

public class Atv6b {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4, 6);
        retangulo.exibirDetalhes();
    }

    static class Retangulo {
        private double largura;
        private double altura;

        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }

        public double calcularArea() {
            return largura * altura;
        }

        public double calcularPerimetro() {
            return 2 * (largura + altura);
        }

        public void exibirDetalhes() {
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
        }
    }
}
