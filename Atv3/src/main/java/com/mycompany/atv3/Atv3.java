/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author gustawz
 */
package com.mycompany.atv3;

public class Atv3 {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Fazer exercícios de POO");
        tarefa1.exibirStatus();
        tarefa1.concluirTarefa();
        tarefa1.exibirStatus();
    }

    static class Tarefa {
        private String nome;
        private String descricao;
        private boolean concluida;

        public Tarefa(String nome, String descricao) {
            this.nome = nome;
            this.descricao = descricao;
            this.concluida = false;
        }

        public void concluirTarefa() {
            this.concluida = true;
        }

        public void exibirStatus() {
            String status = concluida ? "Concluída" : "Pendente";
            System.out.println("Tarefa: " + nome + " - Status: " + status);
        }
    }
}
