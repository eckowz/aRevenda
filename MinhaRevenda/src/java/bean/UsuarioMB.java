package bean;

import java.io.Serializable;
import model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;



@Named
@ApplicationScoped
public class UsuarioMB implements Serializable{

    //CRUD
    private List<Usuario> listaUsuarios;
    private Usuario usuarioSelecionado;

    public UsuarioMB() {
        usuarioSelecionado = new Usuario();
        listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios.add(new Usuario("admin", "admin"));
        listaUsuarios.add(new Usuario("Fulano", "123", false));
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
        return ("/admin/index?faces-redirect=true");
    }

    public void removerUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

}