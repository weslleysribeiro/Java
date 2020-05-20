package formas_geometricas;

/**
 *
 * @author WESLLEY SOARES RIBEIRO RA:00094437
 */
public class quadrado extends formas{
    private static int qtd_quadrado;
    private String cor;

    public quadrado(double recebe_altura, double recebe_largura, String recebe_und_medida, int recebe_qtd_lados, String recebe_cor) {
        super(recebe_altura, recebe_largura, recebe_und_medida, recebe_qtd_lados);
        this.setCor(recebe_cor);
        quadrado.qtd_quadrado++;
    }

    
    
    public static int getQtd_quadrado() {
        return qtd_quadrado;
    }
    public static void setQtd_quadrado(int aQtd_quadrado) {
        qtd_quadrado = aQtd_quadrado;
    }


    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
