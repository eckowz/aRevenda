package bean;

import java.io.Serializable;
import model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class VeiculoMB implements Serializable {

    //CRUD
    private List<Veiculo> listaVeiculos;
    private Veiculo veiculoSelecionado;
    MarcaMB marcaMB = new MarcaMB();
    ModeloMB modeloMB = new ModeloMB();

    public VeiculoMB() {
        veiculoSelecionado = new Veiculo();
        listaVeiculos = new ArrayList<Veiculo>();
        listaVeiculos.add(new Veiculo(1, marcaMB.buscarMarca(60), modeloMB.buscarModelo(8400156),  "MGJ1544JDFKWS3215"));

    }

    public Veiculo getVeiculoSelecionado() {
        return veiculoSelecionado;
    }

    public void setVeiculoSelecionado(Veiculo veiculoSelecionado) {
        this.veiculoSelecionado = veiculoSelecionado;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public String novoVeiculo() {
        veiculoSelecionado = new Veiculo();
        return ("/admin/formCadastroVeiculo?faces-redirect=true");
    }

    public String addVeiculos() {
        listaVeiculos.add(veiculoSelecionado);
        return ("/admin/formVeiculo?faces-redirect=true");
    }

    public String editarVeiculo(Veiculo u) {
        veiculoSelecionado = u;
        return ("/admin/formEdicaoVeiculo?faces-redirect=true");
    }

    public String atualizarVeiculo() {
        return ("/admin/formVeiculo?faces-redirect=true");
    }

    public void removerVeiculo(Veiculo veiculo) {
        listaVeiculos.remove(veiculo);
    }

}
