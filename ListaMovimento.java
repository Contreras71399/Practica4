
package Pokemon_Abstraccion;

import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList <>();
    
    public ListaMovimento() {
    //movimientos de tipo electrico
        movimientos.add(new Movimento(nombre:"Amplificador", puntosDeAtaque:80, Tipo.Electrico, pp:30));
        movimientos.add(new Movimento(nombre:"ElectroCañon", puntosDeAtaque:120, Tipo.Electrico, pp:30))
    
        //movimientos de tipo tierra
        movimientos.add(new Movimento(nombre:"Amplificador", puntosDeAtaque:80, Tipo.Electrico, pp:30));
        movimientos.add(new Movimento(nombre:"Amplificador", puntosDeAtaque:80, Tipo.Electrico, pp:30));
        
        //movimientos de tipo acero
        movimientos.add(new Movimento(nombre:"Amplificador", puntosDeAtaque:80, Tipo.Electrico, pp:30));
        movimientos.add(new Movimento(nombre:"Amplificador", puntosDeAtaque:80, Tipo.Electrico, pp:30));
        
        //movimientos de tipo normal
        movimientos.add(new Movimento(nombre:"Amplificador", puntosDeAtaque:80, Tipo.Electrico, pp:30));
    }
    
    
}
