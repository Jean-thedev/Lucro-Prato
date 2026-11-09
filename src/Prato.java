public class Prato {
    private String nome;
    private double precoVenda;
    private double custoingredientes;

    public Prato(String nome, double precoVenda, double custoingredientes) {
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.custoingredientes = custoingredientes;
    }

    public double calcularLucro(){
        return precoVenda-custoingredientes;
    }

    public double calcularMargem(){
        double lucro = calcularLucro();

        return (lucro/precoVenda)*100;
    }

    public void apresentarDadosPrato(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço de Venda: R$"+this.precoVenda);
        System.out.println("Custo dos Ingredientes: R$"+this.custoingredientes);
        System.out.println("Lucro: R$"+calcularLucro());
        System.out.println("Margem Percentual: "+calcularMargem());
    }
    






}
