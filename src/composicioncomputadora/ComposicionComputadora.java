/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicioncomputadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Usuario
 */
public class ComposicionComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Computadora computadora1 = new Computadora(0, 0, new Monitor(" Samsung ", " LS27F350FHLXZX ", 27),
                new Mouse(" Windows ", " ET-MP900DWEG ", " Blouetooth "), new Teclado(" Motospeed ", " CK61 ", 97 , 10),
                new CPU(" Armadas ", " Gold G5400 ", 3) );

        System.out.println(computadora1.getMonitor() );
        System.out.println(computadora1.getMouse() );
        System.out.println(computadora1.getTeclado() );
        System.out.println(computadora1.getCpu() );

    }
}
