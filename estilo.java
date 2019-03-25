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
public enum estilo {
    COMPACTO(1),
    PICKUP(2),
    INTERMEDIO(3),
    SUV(4),
    MINI_VAN(5),
    CONVERTIBLE(6),
    ECONOMICO(7);
    
    public int idEstilo;

    private estilo(int idEstilo) {
        this.idEstilo = idEstilo;
    }

    public int getIdEstilo() {
        return idEstilo;
    }

    public void setIdEstilo(int idEstilo) {
        this.idEstilo = idEstilo;
    }
    
}
