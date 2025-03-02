/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv2;

/**
 *
 * @author gustawz
 */
public class Atv2 {

    public static void main(String[] args) {
        Reserva reserva1 = new Reserva("Carlos", 5, 100.0);
        reserva1.exibirDetalhes();
    }

    static class Reserva {
        private String hospede;
        private int numDias;
        private double valorDiaria;

        public Reserva(String hospede, int numDias, double valorDiaria) {
            this.hospede = hospede;
            this.numDias = numDias;
            this.valorDiaria = valorDiaria;
        }

        public double calcularTotal() {
            return numDias * valorDiaria;
        }

        public void exibirDetalhes() {
            System.out.println("Hóspede: " + hospede);
            System.out.println("Total a pagar: R$" + calcularTotal());
        }
    }
  }

