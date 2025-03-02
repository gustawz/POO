/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author gustawz
 */
package com.mycompany.atv4;

public class Atv4 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();
    }

    static class ContaBancaria {
        private double saldo;

        public ContaBancaria() {
            this.saldo = 0;
        }

        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual: R$" + saldo);
        }
    }
}
