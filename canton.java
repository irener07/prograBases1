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
public enum canton {
    ESCAZU(1),
    MORAVIA(2),
    PEREZ_ZELEDON(3),
    GRECIA(4),
    PARAISO(5),
    HEREDIA(6),
    BELEN(7),
    LIBERIA(8),
    QUEPOS(9),
    LIMON(10);
    
    public int idCanton;

    private canton(int idCanton) {
        this.idCanton = idCanton;
    }
    
}
