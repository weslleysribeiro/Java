package formas_geometricas;

/**
 *
 * @author WESLLEY SOARES RIBEIRO RA:00094437
 */
public class linha implements traço{
    private static int qtd_linha;
    private double tamanho;
    private String und_medida;
    private float esp_traço;

    public linha(double recebe_tamanho, String recebe_und_medida, float recebe_esp_traço){
        this.setTamanho(recebe_tamanho);
        this.setUnd_medida(recebe_und_medida);
        this.setEsp_traço(recebe_esp_traço);
        linha.qtd_linha++;
    }
    
    @Override
    public void cor_traço(String recebe_cor) {
        System.out.println("A cor desejada para o traço foi: " + recebe_cor+"\n");
    }
    
    

    public static int getQtd_linha() {
        return qtd_linha;
    }
    public static void setQtd_linha(int aQtd_linha) {
        qtd_linha = aQtd_linha;
    }


    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }


    public float getEsp_traço() {
        return esp_traço;
    }
    public void setEsp_traço(float esp_traço) {
        this.esp_traço = esp_traço;
    }

  
    public String getUnd_medida() {
        return und_medida;
    }
    public void setUnd_medida(String und_medida) {
        this.und_medida = und_medida;
    }


}
