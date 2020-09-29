
package Parqueadero;

import Parqueadero.bicicletas;
import Parqueadero.carros;
import Parqueadero.motos;
 import java.util.ArrayList;

public class Logicaparqueadero {
public int vacantescarros;
public int ocupacioncarros;
public int vacantesmotos;
public int ocupacionmotos;
public int vacantesbicicletas;
public int ocupacionbicicletas;



public ArrayList<carros> Listadocarros;
public ArrayList<motos> Listadomotos;
public ArrayList<bicicletas> Listadobicicletas;


public Double preciocarro;
public Double preciomoto;
public Double preciobicicleta;
//constructor
public Logicaparqueadero(Double precioscarro, Double preciosmoto, Double preciosbicicleta, int tamcarro, int tammoto, int tambici){
 vacantescarros=tamcarro;
 ocupacioncarros=0;
 vacantesmotos=tammoto;
 ocupacionmotos=0;
 vacantesbicicletas=tambici;
 ocupacionbicicletas=0;

 preciocarro=precioscarro;
 preciomoto=preciosmoto;
 preciobicicleta=preciosbicicleta;

 Listadocarros= new ArrayList<carros>();
 Listadomotos= new ArrayList<motos>();
 Listadobicicletas = new ArrayList<bicicletas>();
}
//ingresar nuevo carro
public carros Registrarcarro(carros Nuevocarro){
    if(ocupacioncarros< vacantescarros){
        Listadocarros.add(Nuevocarro);
        ocupacioncarros++;
        return Nuevocarro;
    }else{
        return null;
    }
}
//sacar un carro
public carros Eliminarcarro(carros Borrarcarro){
    if(!Listadocarros.isEmpty()){
        int indice=Listadocarros.indexOf(Borrarcarro);
        Listadocarros.remove(indice);
        ocupacioncarros--;
        return Borrarcarro;
    }else{
        return null;
    }
}
}




