package gerenciador.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import gerenciador.infra.Banco;
import gerenciador.model.Usuario;

public class Login implements Acao {

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        System.out.println("Logando " + login);

        Banco banco = new Banco();
        Usuario usuario = banco.existeUsuario(login,senha);

        if(usuario !=null) {
        	HttpSession session = request.getSession();
        	session.setAttribute("usuarioLogado", usuario);
            System.out.println("Usuario existe");
            return "redirect:controllerServlet?acao=listaEmpresas";
        } else {
            return "redirect:controllerServlet?acao=loginForm";

        }

    }

}