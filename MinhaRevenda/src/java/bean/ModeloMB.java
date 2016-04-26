package bean;

import java.io.Serializable;
import model.Modelo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ModeloMB implements Serializable {

    //CRUD
    private List<Modelo> listaModelos;
    private Modelo modeloSelecionado;
    MarcaMB marcaMB = new MarcaMB();

    public ModeloMB() {
        modeloSelecionado = new Modelo();
        listaModelos = new ArrayList<Modelo>();
        listaModelos.add(new Modelo(8400156, "ATV 100", marcaMB.buscarMarca(60)));
        listaModelos.add(new Modelo(8400148, "ATV 50", marcaMB.buscarMarca(60)));
        listaModelos.add(new Modelo(8400075, "JAGUAR JT 100", marcaMB.buscarMarca(60)));
        listaModelos.add(new Modelo(8400083, "JAGUAR JT 50", marcaMB.buscarMarca(60)));
        listaModelos.add(new Modelo(8400164, "RT 50", marcaMB.buscarMarca(60)));
        listaModelos.add(new Modelo(8010021, "CITY 50", marcaMB.buscarMarca(61)));
        listaModelos.add(new Modelo(8010030, "CITY 90", marcaMB.buscarMarca(61)));
        listaModelos.add(new Modelo(8010048, "DAKAR 30.0 190cc", marcaMB.buscarMarca(61)));
        listaModelos.add(new Modelo(8010056, "DAKAR 50", marcaMB.buscarMarca(61)));
        listaModelos.add(new Modelo(8010072, "ELEFANT 16.5 125cc", marcaMB.buscarMarca(61)));
        listaModelos.add(new Modelo(8010064, "ELEFANT 27.5 190cc", marcaMB.buscarMarca(61)));
        listaModelos.add(new Modelo(8010080, "ELEFANTRE 16.5 ES 125cc", marcaMB.buscarMarca(61)));

    }

    public Modelo getModeloSelecionado() {
        return modeloSelecionado;
    }

    public void setModeloSelecionado(Modelo modeloSelecionado) {
        this.modeloSelecionado = modeloSelecionado;
    }

    public List<Modelo> getListaModelos() {
        return listaModelos;
    }

    public void setListaModelos(List<Modelo> listaModelos) {
        this.listaModelos = listaModelos;
    }

    public String novoModelo() {
        modeloSelecionado = new Modelo();
        return ("/admin/formCadastroModelo?faces-redirect=true");
    }

    public String addModelos() {
        listaModelos.add(modeloSelecionado);
        return ("/admin/formModelo?faces-redirect=true");
    }

    public String editarModelo(Modelo u) {
        modeloSelecionado = u;
        return ("/admin/formEdicaoModelo?faces-redirect=true");
    }

    public String atualizarModelo() {
        return ("/admin/formModelo?faces-redirect=true");
    }

    public void removerModelo(Modelo modelo) {
        listaModelos.remove(modelo);
    }

}
