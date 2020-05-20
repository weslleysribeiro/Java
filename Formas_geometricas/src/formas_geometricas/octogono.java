package formas_geometricas;

/**
 *
 * @author WESLLEY SOARES RIBEIRO RA:00094437
 */
public class octogono extends formas implements traço{
    private static int qtd_octogono;
    private float esp_traço;
    
    public octogono(double recebe_altura, double recebe_largura, String recebe_und_medida, int recebe_qtd_lados, float recebe_esp_traço) {
        super(recebe_altura, recebe_largura, recebe_und_medida, recebe_qtd_lados);
        this.setEsp_traço(recebe_esp_traço);
        octogono.qtd_octogono++;
    }
    
    @Override
    public void cor_traço(String recebe_cor) {
        System.out.println("A cor desejada para o traço foi: " + recebe_cor+"\n");
    }
    
    
    public static int getQtd_octogono() {
        return qtd_octogono;
    }
    public static void setQtd_octogono(int aQtd_octogono) {
        qtd_octogono = aQtd_octogono;
    }


    public float getEsp_traço() {
        return esp_traço;
    }
    public void setEsp_traço(float esp_traço) {
        this.esp_traço = esp_traço;
    }

    
}