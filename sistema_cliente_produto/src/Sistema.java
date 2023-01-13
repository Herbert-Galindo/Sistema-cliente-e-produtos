public class Sistema {

    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.adicionarItem("Playstation 5", 4200, 1);
        compra1.adicionarItem("Notebook", 3200, 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderneta", 10, 10);
        compra2.adicionarItem("Impressora", 1600, 2);

        Cliente cliente = new Cliente("Herbert dos Santos Galindo");
        cliente.adicionarCompra(compra1); //metodo para controle da classe
        cliente.compras.add(compra2); //lista exposta

        System.out.println(cliente.nome);
        System.out.println("O valor total é: R$" + cliente.obterValorTotal());

    }
}
