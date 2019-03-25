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
public enum tipoTransmision {
    MANUAL(1),
    AUTOMATICO(2),
    HIBRIDO(3);
    
    public int idTipoTransmision;

    private tipoTransmision(int idTipoTransmision) {
        this.idTipoTransmision = idTipoTransmision;
    }

    public int getIdTipoTransmision() {
        return idTipoTransmision;
    }

    public void setIdTipoTransmision(int idTipoTransmision) {
        this.idTipoTransmision = idTipoTransmision;
    }
    
}
