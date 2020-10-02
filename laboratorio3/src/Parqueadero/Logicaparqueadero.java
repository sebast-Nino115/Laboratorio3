
package Parqueadero;

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
//ingresar nueva moto
public motos Registrarmoto(motos Nuevamoto){
    
    if(ocupacionmotos< vacantesmotos){
        Listadomotos.add(Nuevamoto);
        ocupacionmotos++;
        return Nuevamoto;
    }else{
        return null;
    }
}
//sacar una moto
public motos Eliminarmoto(motos Borrarmoto){
    if(!Listadomotos.isEmpty()){
        int indice=Listadomotos.indexOf(Borrarmoto);
        Listadomotos.remove(indice);
        ocupacionmotos--;
        return Borrarmoto;
    }else{
        return null;
    }
}
//ingresar nueva Bicicleta
public bicicletas Registrarbicicleta(bicicletas Nuevabicicleta){
    
    if(ocupacionbicicletas< vacantesbicicletas){
        Listadobicicletas.add(Nuevabicicleta);
        ocupacionbicicletas++;
        return Nuevabicicleta;
    }else{
        return null;
    }
}
//sacar una moto
public bicicletas Eliminarbicicletas(bicicletas Borrarbicicleta){
    if(!Listadomotos.isEmpty()){
        int indice=Listadobicicletas.indexOf(Borrarbicicleta);
        Listadobicicletas.remove(indice);
        ocupacionbicicletas--;
        return Borrarbicicleta;
    }else{
        return null;
    }
}
}
