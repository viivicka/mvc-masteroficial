package br.fatecrl.mc.models;

public class Feiravi {

        private String fruta;

        private String cor;


        private Double preco1;


        private Double preco2;


        public String getFruta() {
            return fruta;
        }

        public void setFruta(String fruta) {
            this.fruta = fruta;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public Double getPreco1() {
            return preco1;
        }

        public void setPreco1(Double preco1) {
            this.preco1 = preco1;
        }

        public Double getPreco2() {
            return preco2;
        }

        public void setPreco2(Double preco2) {
            this.preco2 = preco2;
        }

        public Feiravi(String fruta, String cor, Double preco1, Double preco2) {
            this.fruta = fruta;
            this.cor = cor;
            this.preco1 = preco1;
            this.preco2 = preco2;
        }
    }




