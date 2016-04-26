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
import model.Marca;

/**
 *
 * @author gserafini
 */
@Named
@ApplicationScoped
public class MarcaMB implements Serializable {

    private List<Marca> listaMarcas;
    private Marca marcaSelecionada;

    public MarcaMB() {
        marcaSelecionada = new Marca();
        listaMarcas = new ArrayList<Marca>();
        listaMarcas.add(new Marca(60, "ADLY"));
        listaMarcas.add(new Marca(61, "AGRALE"));
        listaMarcas.add(new Marca(131, "AMAZONAS"));
        listaMarcas.add(new Marca(62, "APRILIA"));
        listaMarcas.add(new Marca(63, "ATALA"));
        listaMarcas.add(new Marca(64, "BAJAJ"));
        listaMarcas.add(new Marca(162, "Benelli"));
        listaMarcas.add(new Marca(65, "BETA"));
        listaMarcas.add(new Marca(66, "BIMOTA"));
        listaMarcas.add(new Marca(67, "BMW"));
        listaMarcas.add(new Marca(68, "BRANDY"));
        listaMarcas.add(new Marca(130, "BRAVA"));
        listaMarcas.add(new Marca(150, "BRP"));
        listaMarcas.add(new Marca(117, "BUELL"));
        listaMarcas.add(new Marca(155, "BUENO"));
        listaMarcas.add(new Marca(69, "byCristo"));
        listaMarcas.add(new Marca(70, "CAGIVA"));
        listaMarcas.add(new Marca(71, "CALOI"));
        listaMarcas.add(new Marca(72, "DAELIM"));
        listaMarcas.add(new Marca(145, "DAFRA"));
        listaMarcas.add(new Marca(137, "DAYANG"));
        listaMarcas.add(new Marca(142, "DAYUN"));
        listaMarcas.add(new Marca(73, "DERBI"));
        listaMarcas.add(new Marca(74, "DUCATI"));
        listaMarcas.add(new Marca(75, "EMME"));
        listaMarcas.add(new Marca(132, "FOX"));
        listaMarcas.add(new Marca(128, "FYM"));
        listaMarcas.add(new Marca(143, "GARINNI"));
        listaMarcas.add(new Marca(76, "GAS GAS"));
        listaMarcas.add(new Marca(133, "GREEN"));
        listaMarcas.add(new Marca(138, "HAOBAO"));
        listaMarcas.add(new Marca(77, "HARLEY-DAVIDSON"));
        listaMarcas.add(new Marca(78, "HARTFORD"));
        listaMarcas.add(new Marca(79, "HERO"));
        listaMarcas.add(new Marca(80, "HONDA"));
        listaMarcas.add(new Marca(81, "HUSABERG"));
        listaMarcas.add(new Marca(82, "HUSQVARNA"));
        listaMarcas.add(new Marca(158, "IROS"));
        listaMarcas.add(new Marca(141, "JIAPENG VOLCANO"));
        listaMarcas.add(new Marca(174, "JOHNNYPAG"));
        listaMarcas.add(new Marca(151, "JONNY"));
        listaMarcas.add(new Marca(129, "KAHENA"));
        listaMarcas.add(new Marca(118, "KASINSKI"));
        listaMarcas.add(new Marca(85, "KAWASAKI"));
        listaMarcas.add(new Marca(86, "KIMCO"));
        listaMarcas.add(new Marca(87, "KTM"));
        listaMarcas.add(new Marca(159, "LANDUM"));
        listaMarcas.add(new Marca(89, "LAVRALE"));
        listaMarcas.add(new Marca(139, "LERIVO"));
        listaMarcas.add(new Marca(178, "LIFAN"));
        listaMarcas.add(new Marca(148, "Lon-V"));
        listaMarcas.add(new Marca(175, "MAGRÃO TRICICLOS"));
        listaMarcas.add(new Marca(146, "Malaguti"));
        listaMarcas.add(new Marca(126, "MIZA"));
        listaMarcas.add(new Marca(90, "MOTO GUZZI"));
        listaMarcas.add(new Marca(200, "MOTORINO"));
        listaMarcas.add(new Marca(160, "MRX"));
        listaMarcas.add(new Marca(91, "MV AGUSTA"));
        listaMarcas.add(new Marca(92, "MVK"));
        listaMarcas.add(new Marca(93, "ORCA"));
        listaMarcas.add(new Marca(164, "PEGASSI"));
        listaMarcas.add(new Marca(94, "PEUGEOT"));
        listaMarcas.add(new Marca(95, "PIAGGIO"));
        listaMarcas.add(new Marca(173, "REGAL RAPTOR"));
        listaMarcas.add(new Marca(198, "RIGUETE"));
        listaMarcas.add(new Marca(192, "Royal Enfield"));
        listaMarcas.add(new Marca(96, "SANYANG"));
        listaMarcas.add(new Marca(134, "SHINERAY"));
        listaMarcas.add(new Marca(97, "SIAMOTO"));
        listaMarcas.add(new Marca(98, "SUNDOWN"));
        listaMarcas.add(new Marca(99, "SUZUKI"));
        listaMarcas.add(new Marca(176, "TARGOS"));
        listaMarcas.add(new Marca(187, "TIGER"));
        listaMarcas.add(new Marca(119, "TRAXX"));
        listaMarcas.add(new Marca(100, "TRIUMPH"));
        listaMarcas.add(new Marca(180, "VENTO"));
        listaMarcas.add(new Marca(135, "WUYANG"));
        listaMarcas.add(new Marca(101, "YAMAHA"));
        listaMarcas.add(new Marca(102, "AGRALE"));
        listaMarcas.add(new Marca(103, "CHEVROLET"));
        listaMarcas.add(new Marca(121, "CICCOBUS"));
        listaMarcas.add(new Marca(197, "DAF"));
        listaMarcas.add(new Marca(179, "EFFA-JMC"));
        listaMarcas.add(new Marca(104, "FIAT"));
        listaMarcas.add(new Marca(105, "FORD"));
        listaMarcas.add(new Marca(191, "FOTON"));
        listaMarcas.add(new Marca(106, "GMC"));
        listaMarcas.add(new Marca(181, "HYUNDAI"));
        listaMarcas.add(new Marca(122, "IVECO"));
        listaMarcas.add(new Marca(184, "MAN"));
        listaMarcas.add(new Marca(108, "MARCOPOLO"));
        listaMarcas.add(new Marca(196, "MASCARELLO"));
        listaMarcas.add(new Marca(194, "MAXIBUS"));
        listaMarcas.add(new Marca(109, "MERCEDES-BENZ"));
        listaMarcas.add(new Marca(110, "NAVISTAR"));
        listaMarcas.add(new Marca(111, "NEOBUS"));
        listaMarcas.add(new Marca(112, "PUMA-ALFA"));
        listaMarcas.add(new Marca(113, "SAAB-SCANIA"));
        listaMarcas.add(new Marca(114, "SCANIA"));
        listaMarcas.add(new Marca(193, "SHACMAN"));
        listaMarcas.add(new Marca(166, "SINOTRUK"));
        listaMarcas.add(new Marca(115, "VOLKSWAGEN"));
        listaMarcas.add(new Marca(116, "VOLVO"));
        listaMarcas.add(new Marca(144, "WALKBUS"));
        listaMarcas.add(new Marca(1, "Acura"));
        listaMarcas.add(new Marca(2, "Agrale"));
        listaMarcas.add(new Marca(3, "Alfa Romeo"));
        listaMarcas.add(new Marca(4, "AM Gen"));
        listaMarcas.add(new Marca(5, "Asia Motors"));
        listaMarcas.add(new Marca(189, "ASTON MARTIN"));
        listaMarcas.add(new Marca(6, "Audi"));
        listaMarcas.add(new Marca(7, "BMW"));
        listaMarcas.add(new Marca(8, "BRM"));
        listaMarcas.add(new Marca(9, "Buggy"));
        listaMarcas.add(new Marca(123, "Bugre"));
        listaMarcas.add(new Marca(10, "Cadillac"));
        listaMarcas.add(new Marca(11, "CBT Jipe"));
        listaMarcas.add(new Marca(136, "CHANA"));
        listaMarcas.add(new Marca(182, "CHANGAN"));
        listaMarcas.add(new Marca(161, "CHERY"));
        listaMarcas.add(new Marca(12, "Chrysler"));
        listaMarcas.add(new Marca(13, "Citroën"));
        listaMarcas.add(new Marca(14, "Cross Lander"));
        listaMarcas.add(new Marca(15, "Daewoo"));
        listaMarcas.add(new Marca(16, "Daihatsu"));
        listaMarcas.add(new Marca(17, "Dodge"));
        listaMarcas.add(new Marca(147, "EFFA"));
        listaMarcas.add(new Marca(18, "Engesa"));
        listaMarcas.add(new Marca(19, "Envemo"));
        listaMarcas.add(new Marca(20, "Ferrari"));
        listaMarcas.add(new Marca(21, "Fiat"));
        listaMarcas.add(new Marca(149, "Fibravan"));
        listaMarcas.add(new Marca(22, "Ford"));
        listaMarcas.add(new Marca(190, "FOTON"));
        listaMarcas.add(new Marca(170, "Fyber"));
        listaMarcas.add(new Marca(199, "GEELY"));
        listaMarcas.add(new Marca(23, "GM - Chevrolet"));
        listaMarcas.add(new Marca(153, "GREAT WALL"));
        listaMarcas.add(new Marca(24, "Gurgel"));
        listaMarcas.add(new Marca(152, "HAFEI"));
        listaMarcas.add(new Marca(25, "Honda"));
        listaMarcas.add(new Marca(26, "Hyundai"));
        listaMarcas.add(new Marca(27, "Isuzu"));
        listaMarcas.add(new Marca(177, "JAC"));
        listaMarcas.add(new Marca(28, "Jaguar"));
        listaMarcas.add(new Marca(29, "Jeep"));
        listaMarcas.add(new Marca(154, "JINBEI"));
        listaMarcas.add(new Marca(30, "JPX"));
        listaMarcas.add(new Marca(31, "Kia Motors"));
        listaMarcas.add(new Marca(32, "Lada"));
        listaMarcas.add(new Marca(171, "LAMBORGHINI"));
        listaMarcas.add(new Marca(33, "Land Rover"));
        listaMarcas.add(new Marca(34, "Lexus"));
        listaMarcas.add(new Marca(168, "LIFAN"));
        listaMarcas.add(new Marca(127, "LOBINI"));
        listaMarcas.add(new Marca(35, "Lotus"));
        listaMarcas.add(new Marca(140, "Mahindra"));
        listaMarcas.add(new Marca(36, "Maserati"));
        listaMarcas.add(new Marca(37, "Matra"));
        listaMarcas.add(new Marca(38, "Mazda"));
        listaMarcas.add(new Marca(39, "Mercedes-Benz"));
        listaMarcas.add(new Marca(40, "Mercury"));
        listaMarcas.add(new Marca(167, "MG"));
        listaMarcas.add(new Marca(156, "MINI"));
        listaMarcas.add(new Marca(41, "Mitsubishi"));
        listaMarcas.add(new Marca(42, "Miura"));
        listaMarcas.add(new Marca(43, "Nissan"));
        listaMarcas.add(new Marca(44, "Peugeot"));
    }

    public Marca getMarcaSelecionada() {
        return marcaSelecionada;
    }

    public void setMarcaSelecionado(Marca marcaSelecionada) {
        this.marcaSelecionada = marcaSelecionada;
    }

    public List<Marca> getListaMarcas() {
        return listaMarcas;
    }

    public void setListaMarcas(List<Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }

    public String novaMarca() {
        marcaSelecionada = new Marca();
        return ("/admin/formCadastroMarca?faces-redirect=true");
    }

    public String addMarcas() {
        listaMarcas.add(marcaSelecionada);
        return ("/admin/formMarca?faces-redirect=true");
    }

    public String editarMarca(Marca m) {
        marcaSelecionada = m;
        return ("/admin/formEdicaoMarca?faces-redirect=true");
    }

    public String atualizarMarca() {
        return ("/admin/formMarca?faces-redirect=true");
    }

    public void removerMarca(Marca marca) {
        listaMarcas.remove(marca);
    }

    public Marca buscarMarca(int codMarca) {
        for (Marca marca : listaMarcas) {
            if (marca.getCodigo() == (codMarca)) {
                return marca;
            }
        }
        return null;
    }

    
}
