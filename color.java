/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograbases1;

/**
 *
 * @author win8
 */
public enum color {
    ROJO(1),
    VERDE(2),
    AZUL(3),
    NEGRO(4),
    GRIS(5),
    BLANCO(6),
    AMARILLO(7),
    DORADO(8),
    CAFE(9),
    MORADO(10);
    
    public int idColor;

    private color(int idColor) {
        this.idColor = idColor;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }
    
}
