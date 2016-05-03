/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import model.Venda;

/**
 *
 * @author gserafini
 */
@Named
@ApplicationScoped
public class VendaMB implements Serializable{
    
    private List<Venda> listaVendas;
    private Venda vendaSelecionada;
    VeiculoMB veiculoMB = new VeiculoMB();
    UsuarioMB usuarioMB = new UsuarioMB();
    
    public VendaMB() {
        vendaSelecionada = new Venda();
        listaVendas = new ArrayList<Venda>();
        
    }
            
    public Venda getVendaSelecionada() {
        return vendaSelecionada;
    }

    public void setVendaSelecionado(Venda vendaSelecionada) {
        this.vendaSelecionada = vendaSelecionada;
    }

    public List<Venda> getListaVendas() {
        return listaVendas;
    }

    public void setListaVendas(List<Venda> listaVendas) {
        this.listaVendas = listaVendas;
    }

    public String novoVenda() {
        vendaSelecionada = new Venda();
        return ("/comum/formCadastroVenda?faces-redirect=true");
    }

    public String addVendas() {
        listaVendas.add(vendaSelecionada);
        return ("/comum/formVenda?faces-redirect=true");
    }

    public void removerVenda(Venda venda) {
        listaVendas.remove(venda);
    }

        public Venda buscarVenda(int codVenda) {
        for (Venda venda : listaVendas) {
            if (venda.getCodigo() == (codVenda)) {
                return venda;
            }
        }
        return null;
    }    
}
