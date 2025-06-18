package org.juros;

public class CalculadoraJuros {
    public double jurosSimples(double valorInicial, double taxa, double periodo){
        if(valorInicial <= 0){
            throw new IllegalArgumentException("Valor inicial deve ser maior do que 0!");
        }
        double taxaDecimal = taxa / 100;
        double juros = valorInicial * taxaDecimal * periodo;
        double montante = valorInicial + juros;

        return montante;
    }

    public double jurosCompostos(double valorInicial, double taxa, double periodo){
        if(valorInicial <= 0){
            throw new IllegalArgumentException("Valor inicial deve ser maior do que 0!");
        }

        double taxaDecimal = taxa / 100;
        double montante = valorInicial * Math.pow((1 + taxaDecimal), periodo);

        return montante;
    }
}