package com.mycompany.atv1;

public class Atv1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "joao@email.com", "99999-9999");
        cliente1.realizarCompra(150.75);
        cliente1.exibirDados();
    }

    static class Cliente { // Tornando a classe interna estática
        private String nome;
        private String email;
        private String telefone;
        private double totalCompras;

        public Cliente(String nome, String email, String telefone) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
            this.totalCompras = 0;
        }

        public void realizarCompra(double valor) {
            totalCompras += valor;
        }

        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("E-mail: " + email);
            System.out.println("Telefone: " + telefone);
            System.out.println("Total de compras: " + totalCompras);
        }
    }
}
