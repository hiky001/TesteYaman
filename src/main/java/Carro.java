public class Carro {

    private double velocidadeAtual;
    private double velocidadeMaxima;
    private boolean ligado;



    public Double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double VelocidadeAtual) {
        this.velocidadeAtual = VelocidadeAtual;
    }

    public Double getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double VelocidadeMaxima){
        this.velocidadeMaxima = VelocidadeMaxima;
    }

    public Boolean getLigado(){
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }




    //liga o carro
    public Boolean ligaEDesliga() {
        if (!this.ligado){
            this.ligado = true;
            System.out.println("O carro foi ligado");
        } else {
            this.ligado = false;
            System.out.println("O carro foi desigado");
        }
        return this.ligado;
    }
    //acelera uma certa quantidade
    public void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        if (velocidadeNova < this.velocidadeMaxima){
            this.velocidadeAtual = velocidadeNova;

        }else {
            System.out.println("O carro não suporta essa velocidade");
        }
    }
    //devolve a marcha do carro
    public Integer pegaMarcha() {
        if (this.velocidadeAtual < 0.0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0.00 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }
}