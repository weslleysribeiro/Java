package formas_geometricas;

/**
 *
 * @author WESLLEY SOARES RIBEIRO RA:00094437
 */
public class Formas_geometricas {
    public static void main(String[] args) {
        
        quadrado q1 = new quadrado(2.50 , 2.50 , "metros", 4, "azul");
        circulo c1 = new circulo(65, 65, "centimetros", 0, 1);
        octogono o1 = new octogono(1.25 , 1.25 , "metros", 8, 10);
        linha l1 = new linha(65.8 , "centimetros", 2);
        
        
        System.out.println("Quadrado - Quantidade: "+quadrado.getQtd_quadrado());
        System.out.println("Tam: "+q1.getAltura()+" x "+q1.getLargura()+ " " +q1.getUnd_medida());
        System.out.println("Quantidade de lados: "+q1.getQtd_lados()+" - Cor: "+q1.getCor()+"\n");
        
        System.out.println("Circulo - Quantidade: "+circulo.getQtd_circulo());
        System.out.println("Tam: "+c1.getAltura()+" x "+c1.getLargura()+" "+c1.getUnd_medida());
        System.out.println("Quantidade de lados: "+c1.getQtd_lados()+ " - Espessura Traço: "+c1.getEsp_traço()+" centimetros");
        
        c1.cor_traço("Vermelho");        
        
        System.out.println("Octogono - Quantidade: "+octogono.getQtd_octogono());
        System.out.println("Tam: "+o1.getAltura()+" x "+o1.getLargura()+" " +o1.getUnd_medida());
        System.out.println("Quantidade de lados: "+o1.getQtd_lados()+ " - Espessura Traço: "+o1.getEsp_traço()+" centimetros");

        o1.cor_traço("Verde");
        
        System.out.println("Linha - Quantidade: "+linha.getQtd_linha());
        System.out.println("Tam: "+l1.getTamanho()+" "+l1.getUnd_medida()+" - Espessura Traço: "+l1.getEsp_traço()+" centimetros");

        l1.cor_traço("Amarelo");
        
        
    }
    
}
