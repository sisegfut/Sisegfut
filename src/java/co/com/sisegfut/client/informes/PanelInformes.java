/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sisegfut.client.informes;

import co.com.sisegfut.client.util.Resources;
import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.layout.FillLayout;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.MarginData;

/**
 *
 * @author fhurtado
 */
public class PanelInformes extends Window {

    private InformeDeportista informeDeportista;
    private InformeTest informeTest;
    private InformeDeportistaPosicion informeDeportistaPosicion;
    private InformeDeportistasEstrato informeDeportistasEstrato;
    private InformeGolesDepTorneo informeGolesDepTorneo;
    private InformeTipoDeportista informeTipoDeportista;
    TabItem tabInfoCategoria = new TabItem("Informe por categoría");
    TabItem tabInfoDeportistaPosicion = new TabItem("Informe deportistas posición");
    TabItem tabInfoDeportistasEstrato = new TabItem("Informe deportistas estrato");
    TabItem tabInfoTest = new TabItem("Informe tests");
    TabItem tabInfoGolesTorneo = new TabItem("Informe goles torneo");
    TabItem tabInfoTipoDeportista = new TabItem("Informe tipo deportista");

    public PanelInformes() {

        setSize(520, 200);
        setPlain(true);
        setModal(true);
        setBlinkModal(true);
        setHeading("Informes");
        setLayout(new FillLayout());
        setResizable(false);
        setAutoHeight(true);
        
        TabPanel panel = new TabPanel();
        panel.setBorders(false);
        panel.setAutoHeight(true);
        panel.setLayoutData(new FitLayout());
        panel.setTabScroll(true);
        panel.setTabPosition(TabPanel.TabPosition.TOP);

        informeDeportista = new InformeDeportista();
        informeTest = new InformeTest();
        informeDeportistaPosicion = new InformeDeportistaPosicion();
        informeDeportistasEstrato = new InformeDeportistasEstrato();
        informeGolesDepTorneo = new InformeGolesDepTorneo();
        informeTipoDeportista = new InformeTipoDeportista();
                       
//        tabInfoDeportistaPosicion.setLayout(new FitLayout());
        tabInfoDeportistaPosicion.addStyleName("pad-text");
        tabInfoDeportistaPosicion.setIcon(Resources.ICONS.iconoPDF());
        tabInfoDeportistaPosicion.add(informeDeportistaPosicion);
        panel.add(tabInfoDeportistaPosicion);
        
        //                 informeGolesDepTorneo.setLayout(new FitLayout());
        tabInfoTipoDeportista.addStyleName("pad-text");
        tabInfoTipoDeportista.setIcon(Resources.ICONS.iconoPDF());
        tabInfoTipoDeportista.add(informeTipoDeportista);
        panel.add(tabInfoTipoDeportista); 
        
//                 informeGolesDepTorneo.setLayout(new FitLayout());
        tabInfoGolesTorneo.addStyleName("pad-text");
        tabInfoGolesTorneo.setIcon(Resources.ICONS.iconoPDF());
        tabInfoGolesTorneo.add(informeGolesDepTorneo);
        panel.add(tabInfoGolesTorneo); 
        
//         tabInfoDeportistasEstrato.setLayout(new FitLayout());
        tabInfoDeportistasEstrato.addStyleName("pad-text");
        tabInfoDeportistasEstrato.setIcon(Resources.ICONS.iconoPDF());
        tabInfoDeportistasEstrato.add(informeDeportistasEstrato);
        panel.add(tabInfoDeportistasEstrato);

//        tabInfoCategoria.setLayout(new FillLayout());
        tabInfoCategoria.setIcon(Resources.ICONS.iconoPDF());
        tabInfoCategoria.addStyleName("pad-text");
        tabInfoCategoria.setAutoHeight(true);
        tabInfoCategoria.add(informeDeportista);
        panel.add(tabInfoCategoria);

//        tabInfoTest.setLayout(new FitLayout());
        tabInfoTest.addStyleName("pad-text");
        tabInfoTest.setIcon(Resources.ICONS.iconoPDF());
        tabInfoTest.setAutoHeight(true);
        tabInfoTest.add(informeTest);
        panel.add(tabInfoTest);
        add(panel, new MarginData(0));

        setFocusWidget(this.getButtonBar().getItem(0));

    }
}
