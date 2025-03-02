package Exercicio04;

public class Distribuidora {
    public static void main(String[] args) {
        // Definição dos valores de faturamento por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Cálculo do faturamento total
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Verifica se o faturamento total é maior que zero para evitar divisão por zero
        if (faturamentoTotal > 0) {
            // Cálculo e exibição dos percentuais de representação
            System.out.println("Percentual de representação por estado:");
            System.out.printf("SP: %.2f%%\n", (faturamentoSP / faturamentoTotal) * 100);
            System.out.printf("RJ: %.2f%%\n", (faturamentoRJ / faturamentoTotal) * 100);
            System.out.printf("MG: %.2f%%\n", (faturamentoMG / faturamentoTotal) * 100);
            System.out.printf("ES: %.2f%%\n", (faturamentoES / faturamentoTotal) * 100);
            System.out.printf("Outros: %.2f%%\n", (faturamentoOutros / faturamentoTotal) * 100);
        } else {
            System.out.println("O faturamento total não pode ser zero.");
        }
    }
}
