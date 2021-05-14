
package RegraNegocio;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class GerenciaClientesTest_Ex1 {

    
       @Test
       public void testPesquisaCliente() {

       // criando alguns clientes
       Cliente cliente01 = new Cliente(1, "Fulano Beltrano", 31, "fulanobeltrano@gmail.com", 1, true);
       Cliente cliente02 = new Cliente(2, "Ciclano Silva", 34, "ciclanosilva@gmail.com", 2, true);
       Cliente cliente03 = new Cliente(3, "Leandro Viersberg", 39, "leandroviersberg@gmail.com", 3, true);

      // inserindo os clientes criados na lista de clientes do banco
      List<Cliente> clientesDoBanco = new ArrayList<>();
      clientesDoBanco.add(cliente01);
      clientesDoBanco.add(cliente02);
      clientesDoBanco.add(cliente03);

      GerenciaClientes gerClientes = new GerenciaClientes(clientesDoBanco);

      Cliente cliente = gerClientes.pesquisaCliente(1);

      assertThat(cliente.getId(), is(1));
      assertThat(cliente.getEmail(), is("fulanobeltrano@gmail.com"));

   }	

}