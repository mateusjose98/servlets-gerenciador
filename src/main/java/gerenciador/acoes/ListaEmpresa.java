package gerenciador.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.infra.Banco;
import gerenciador.model.Empresa;

public class ListaEmpresa implements Acao{

	 public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Empresa> lista = banco.listar();

        request.setAttribute("empresas", lista);

        return "forward:listaDeEmpresas.jsp";
    }
}
 