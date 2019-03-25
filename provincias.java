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
public enum provincias {
    SAN_JOSE(1),
    ALAJUELA(2),
    CARTAGO(3),
    HEREDIA(4),
    GUANACASTE(5),
    PUNTARENAS(6),
    LIMON(7);
    
    public int idProvincia;

    private provincias(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    
}
