package formas_geometricas;

/**
 *
 * @author WESLLEY SOARES RIBEIRO RA:00094437
 */
public class circulo extends formas implements traço{
    private static int qtd_circulo;
    private float esp_traço;
    
    public circulo(double recebe_altura, double recebe_largura, String recebe_und_medida, int recebe_qtd_lados, float recebe_esp_traço) {
        super(recebe_altura, recebe_largura, recebe_und_medida, recebe_qtd_lados);
        this.setEsp_traço(recebe_esp_traço);
        circulo.qtd_circulo++;
    }

    @Override
    public void cor_traço(String recebe_cor) {
        System.out.println("A cor desejada para o traço foi: " + recebe_cor+"\n");
    }
    
    

    public static int getQtd_circulo() {
        return qtd_circulo;
    }
    public static void setQtd_circulo(int aQtd_circulo) {
        qtd_circulo = aQtd_circulo;
    }


    public float getEsp_traço() {
        return esp_traço;
    }
    public void setEsp_traço(float esp_traço) {
        this.esp_traço = esp_traço;
    }
  
    
}
