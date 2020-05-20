package formas_geometricas;

/**
 *
 * @author WESLLEY SOARES RIBEIRO RA:00094437
 */
public abstract class formas {
    private static int qtd_formas;
    private double altura;
    private double largura;
    private String und_medida;
    private int qtd_lados;

    public formas(double recebe_altura, double recebe_largura, String recebe_und_medida, int recebe_qtd_lados){
        this.setAltura(recebe_altura);
        this.setLargura(recebe_largura);
        this.setUnd_medida(recebe_und_medida);
        this.setQtd_lados(recebe_qtd_lados);
        formas.qtd_formas++;
    }
    
    
    

    public static int getQtd_formas() {
        return qtd_formas;
    }
    public static void setQtd_formas(int aQtd_formas) {
        qtd_formas = aQtd_formas;
    }



    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }


    public int getQtd_lados() {
        return qtd_lados;
    }
    public void setQtd_lados(int qtd_lados) {
        this.qtd_lados = qtd_lados;
    }


    public String getUnd_medida() {
        return und_medida;
    }
    public void setUnd_medida(String und_medida) {
        this.und_medida = und_medida;
    }
    
    
    
    
}
