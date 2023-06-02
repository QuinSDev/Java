package alquilerbarco.alquiler;

import java.util.HashMap;
import java.util.Map;

public class Puerto {

    private static final int SECCIONES = 5;
    private static final int SECCION_ANCHO = 30;
    private static final String LINEA_HORIZONTAL = "-".repeat(SECCION_ANCHO);
    private static final String BARRA = "|||";
    private static final String DISPONIBLE = "DISPONIBLE";
    private static final String OCUPADO = "OCUPADO";

    private HashMap<String, String> listaPuertos = new HashMap<>();

    public Puerto() {
        listaPuertos.put("A1", DISPONIBLE);
        listaPuertos.put("A2", DISPONIBLE);
        listaPuertos.put("A3", DISPONIBLE);
        listaPuertos.put("A4", DISPONIBLE);
        listaPuertos.put("B1", DISPONIBLE);
        listaPuertos.put("B2", DISPONIBLE);
        listaPuertos.put("B3", DISPONIBLE);
        listaPuertos.put("B4", DISPONIBLE);
    }

    public void validarPuerto(String posicion) {

        boolean deso = false;
        boolean Esta = false;
        String key = "";
        String value = "";

        for (Map.Entry<String, String> entry : listaPuertos.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
            if (key.equalsIgnoreCase(posicion)) {
                Esta = true;
                if (value.contains(DISPONIBLE)) {
                    deso = true;
                    
                    break;
                    
                }
            }
        }

        if (Esta) {
            if (deso) {
                listaPuertos.put(key, OCUPADO);
                System.out.println("Posición asignada");
            } else {
                System.out.println("Posicion Ocupado");
            }
        } else {
            System.out.println("No existe esa posicion");
        }

    }

    public void dibujarPuerto() {
        nombrePuerto();
        dibujarLineaHorizontal();
        dibujarLineaHorizontal();
        dibujarBarra();
        dibujarSecciones();
        dibujarBarra();
        dibujarBarra();
        System.out.println();
    }
    
    private void nombrePuerto() {
        
        String nombre = "PUERTO";
        
        int paddingN = (63 - nombre.length()) / 2;
        
        System.out.println("\n");
        System.out.format("%" + (paddingN+1) + "s%s%" + paddingN + "s", "", nombre, "");
        System.out.println("\n");
        
    }

    private void dibujarLineaHorizontal() {
        System.out.println(LINEA_HORIZONTAL + BARRA + LINEA_HORIZONTAL);
    }

    private void dibujarBarra() {
        System.out.println(String.format("%30s", " ".repeat(SECCION_ANCHO)) 
                + BARRA);
    }

    private void dibujarSecciones() {
        int seccion = listaPuertos.size() / 2;
        for (int i = 1; i < seccion; i++) {
            String seccion1 = "A" + i;
            String estado1 = listaPuertos.get(seccion1);
            String seccion2 = "B" + i;
            String estado2 = listaPuertos.get(seccion2);
            dibujarSeccion(seccion1, estado1, seccion2, estado2);
            dibujarBarra();
            dibujarLineaHorizontal();
            dibujarLineaHorizontal();
            dibujarBarra();
        }
    }

    private void dibujarSeccion(String seccion1, String estado1, 
            String seccion2, String estado2) {
        int padding1 = (SECCION_ANCHO - (seccion1.length() + 
                (estado1 != null ? estado1.length() : 0) + 1)) / 2;
        int padding2 = (SECCION_ANCHO - (seccion2.length() + 
                (estado1 != null ? estado1.length() : 0) + 1)) / 2;
        String seccionEstado1 = seccion1 + " " + estado1;
        String seccionEstado2 = seccion2 + " " + estado2;

        if (seccionEstado1.contains(OCUPADO)) {
            String seccionFormateada1 = String.format("%" + padding1 + "s%s%" 
                    + padding1 + "s", "", seccionEstado1, "");
            String seccionFormateada2 = String.format("%" + (padding2 - 2) 
                    + "s%s%" + padding2 + "s", "", seccionEstado2, "");
            System.out.println(seccionFormateada1 + BARRA + seccionFormateada2);
        } else {
            String seccionFormateada1 = String.format("%" + (padding1 + 1) 
                    + "s%s%" + padding1 + "s", "", seccionEstado1, "");
            String seccionFormateada2 = String.format("%" + padding2 + "s%s%" 
                    + padding2 + "s", "", seccionEstado2, "");
            System.out.println(seccionFormateada1 + BARRA + seccionFormateada2);
        }

    }

}
