package Ej8;
//TODO: Tester de Fecha xd

public class Fecha {

    /* Atributos de Instancia */
    private int dia,mes,anio;

    /* Constructor */
    public Fecha(int d, int m, int a){}

    /* Comandos */
    public void establecerDia(int d){
        dia = d;
    }
    public void establecerMes(int m){
        mes = m;
    }
    public void establecerAnio(int a){
        anio = a;
    }

    /* Consultas */
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }
    public boolean esBisiesto(){
        if(anio % 4 == 0)return true;
        else return false;
    }
    public boolean esAnterior(Fecha f){
        if(f == null)return false;
        if(this.anio < f.obtenerAnio() && this.mes < f.obtenerMes() && this.dia < f.obtenerDia()){
            return true;          
        }else return false;
    }
    public boolean mismoAnio(Fecha f){
        if(f == null)return false;
        if(this.anio == f.obtenerAnio())return true;
        else return false;
    }
    public boolean equals(Fecha f){
        if(f == null)return false;
        if(this == f)return true;
        else return false;
    }
    public String toString(){
        return "Fecha: "+this.dia+"/"+this.mes+"/"+this.anio;
    }
}
