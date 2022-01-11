package calculadoradivisas;


public class Operaciones {
    private double valor;
    private int divisa, divisaDos, divisaTres;
    private double resultado;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisaDos() {
        return divisaDos;
    }

    public void setDivisaDos(int divisaDos) {
        this.divisaDos = divisaDos;
    }

    public int getDivisaTres() {
        return divisaTres;
    }

    public void setDivisaTres(int divisaTres) {
        this.divisaTres = divisaTres;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Operaciones() {
    }
    
    public double convertir(){
        if(divisa==0 && divisaDos==1){
        resultado = valor * 1.14;
        }else if(divisa ==0 && divisaTres==2){
        resultado = valor * 23.13;
        }else if(divisa ==0 && divisaDos==0){
        resultado = valor;
        }
        if(divisaDos ==1 && divisa==0){
        resultado = valor * 0.88;
        }else if(divisaDos ==1 && divisaTres==2){
        resultado = valor * 20.37;
        }else if(divisaDos ==1 && divisaDos==1){
        resultado = valor;
        }
        if(divisaTres ==2 && divisa==0){
        resultado = valor * 0.043;
        }else if(divisaTres ==2 && divisaDos==1){
        resultado = valor * 0.049;
        }else if(divisaTres ==2 && divisaTres==2){
        resultado = valor;
    }
        return resultado;

}
}
