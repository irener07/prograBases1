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
public enum marca {
    TOYOTA(1),
    SUZUKI(2),
    MITSUBISHI(3),
    BMW(4),
    FORD(5),
    VOLKSWAGEN(6),
    AUDI(7),
    NISSAN(8),
    JEEP(9),
    VOLVO(10);
    
    public int idMarca;

    private marca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
    
    
    
    
}
