/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author gustawz
 */
package com.mycompany.atv5;

public class Atv5 {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Honda Civic", 120.0);
        carro.exibirDetalhes(7);
    }

    static class Veiculo {
        private String modelo;
        private double valorDiario;

        public Veiculo(String modelo, double valorDiario) {
            this.modelo = modelo;
            this.valorDiario = valorDiario;
        }

        public double calcularTotal(int numDias) {
            return numDias * valorDiario;
        }

        public void exibirDetalhes(int numDias) {
            System.out.println("Modelo: " + modelo);
            System.out.println("Total do aluguel: R$" + calcularTotal(numDias));
        }
    }
}
