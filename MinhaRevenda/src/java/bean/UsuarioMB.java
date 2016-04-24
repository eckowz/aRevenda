package bean;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import model.Usuario;

@Named
@ApplicationScoped
public class UsuarioMB {

    //CRUD
    private List<Usuario> listaUsuarios;
    private Usuario usuarioSelecionado, usuario;

    public UsuarioMB() {
        usuarioSelecionado = new Usuario();
        listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios.add(new Usuario("admin", "admin"));
        listaUsuarios.add(new Usuario("Fulano", "123", false));
        
        usuario = new Usuario();
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String novoUsuario() {
        usuarioSelecionado = new Usuario();
        return ("/admin/formCadastroUsuario?faces-redirect=true");
    }

    public String addUsuarios() {
        listaUsuarios.add(usuarioSelecionado);
        return ("/admin/formUsuario?faces-redirect=true");
    }

    public String editarUsuario(Usuario u) {
        usuarioSelecionado = u;
        return ("/admin/formEdicaoUsuario?faces-redirect=true");
    }

    public String atualizarUsuario() {
        return ("/admin/formUsuario?faces-redirect=true");
    }

    public void removerUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String verificaLogin() {
        if (listaUsuarios.contains(usuario)) {
            return ("/admin/formUsuario.xhtml");
        } else {
            FacesContext contexto = FacesContext.getCurrentInstance();
            FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Login inválido!", "Usuário ou senha estão errados!");
            contexto.addMessage("idMensagem", mensagem);
            return ("login");
        }
    }
}
