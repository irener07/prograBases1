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
public enum serviciosOpcionales {
    WIFI(1,15.00),
    ASISTENCIA(2,3.99),
    GPS(3,13.99),
    ASIENTONIÑO(4,6.99),
    COBERTURADAÑOS(5,12.99);
    
    public int idServicioOpcional;
    public double precio;

    private serviciosOpcionales(int idServicioOpcional,double precio) {
        this.precio = precio;
        this.idServicioOpcional= idServicioOpcional;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIdServicioOpcional() {
        return idServicioOpcional;
    }

    public void setIdServicioOpcional(int idServicioOpcional) {
        this.idServicioOpcional = idServicioOpcional;
    }
    

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
