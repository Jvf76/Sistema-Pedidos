package br.com.sistemapedidos.domain.atendente;
import br.com.sistemapedidos.domain.cliente.Cliente;
import java.util.ArrayList;

public class AtendenteVirtual {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void listaClientesAtendidos(){
        for (Cliente cliente : clientes){
            System.out.println(cliente.dadosCliente());
        }
    }
    public void adicionarClienteAtendidos(Cliente cliente){
        clientes.add(cliente);
    }
}
