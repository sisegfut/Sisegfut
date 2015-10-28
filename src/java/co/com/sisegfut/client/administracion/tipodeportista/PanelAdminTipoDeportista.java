/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sisegfut.client.administracion.tipodeportista;

import co.com.sisegfut.client.administracion.eps.*;
import co.com.sisegfut.client.aaI18N.Main;
import co.com.sisegfut.client.util.Resources;
import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.IconButtonEvent;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Dialog;
import com.extjs.gxt.ui.client.widget.TabItem;
import com.extjs.gxt.ui.client.widget.TabPanel;
import com.extjs.gxt.ui.client.widget.Window;
import com.extjs.gxt.ui.client.widget.button.ToolButton;
import com.extjs.gxt.ui.client.widget.layout.FillLayout;
import com.extjs.gxt.ui.client.widget.layout.MarginData;
import com.google.gwt.core.client.GWT;

/**
 *
 * @author anfeh_000
 */
public class PanelAdminTipoDeportista extends Window {

    private PanelCrearTipoDeportista crear;
    private PanelModificarTipoDeportista modificar;
    private PanelInactivarTipoDeportista inactivar;
    private PanelReactivarTipoDeportista reactivar;

    TabItem tabCrear = new TabItem("Crear");
    TabItem tabModificar = new TabItem("Modificar");
    TabItem tabInactivar = new TabItem("Inactivar");
    TabItem tabReactivar = new TabItem("Reactivar");
    
    private Main myConstants = (Main) GWT.create(Main.class);

    public PanelAdminTipoDeportista() {

        setSize(350, 145);
        setPlain(true);
        setModal(true);
        setBlinkModal(true);
        setHeading("Administrar Tipo Deportista");
        setLayout(new FillLayout());
        setResizable(false);
//        setAutoHeight(true);
//        setAutoWidth(true);

        crear = new PanelCrearTipoDeportista();
        modificar = new PanelModificarTipoDeportista();
        inactivar = new PanelInactivarTipoDeportista();
        reactivar = new PanelReactivarTipoDeportista();

        TabPanel panel = new TabPanel();
        panel.setBorders(false);
        panel.setAutoHeight(true);
        setAutoHeight(true);
        tabCrear.add(crear);
        tabCrear.setIcon(Resources.ICONS.iconoCrear());
        tabCrear.addStyleName("pad-text");
        tabCrear.setAutoHeight(true);

        tabModificar.add(modificar);
        tabModificar.setIcon(Resources.ICONS.iconoModificar());
        tabModificar.addStyleName("pad-text");
        tabModificar.setAutoHeight(true);

        tabInactivar.add(inactivar);
        tabInactivar.setIcon(Resources.ICONS.iconoEliminar());
        tabInactivar.addStyleName("pad-text");
        tabInactivar.setAutoHeight(true);

        tabReactivar.add(reactivar);
        tabReactivar.setIcon(Resources.ICONS.iconoRefrescar());
        tabReactivar.addStyleName("pad-text");
        tabReactivar.setAutoHeight(true);

//        tabModificar.addListener(Events.Select, new Listener<ComponentEvent>() {  
//      public void handleEvent(ComponentEvent be) {  
//        setSize(350, 165);
//      }  
//    });  
//        tabCrear.addListener(Events.Select, new Listener<ComponentEvent>() {  
//      public void handleEvent(ComponentEvent be) {  
//        setSize(350, 145);
//      }  
//    });
//        tabInactivar.addListener(Events.Select, new Listener<ComponentEvent>() {  
//      public void handleEvent(ComponentEvent be) {  
//        setSize(350, 145);
//      }  
//    });
//        tabReactivar.addListener(Events.Select, new Listener<ComponentEvent>() {  
//      public void handleEvent(ComponentEvent be) {  
//        setSize(350, 145);
//      }  
//    });
        //Agrego boton al panel principal que permite desplegar la ayuda.
        getHeader().addTool(new ToolButton("x-tool-help", new SelectionListener<IconButtonEvent>() {
            @Override
            public void componentSelected(IconButtonEvent ce) {
                abrirVentana(myConstants.ayudaPanelEps());
            }
        }));

        panel.add(tabCrear);

        panel.add(tabModificar);

        panel.add(tabInactivar);

        panel.add(tabReactivar);

        add(panel, new MarginData(0));

        setFocusWidget(this.getButtonBar().getItem(0));

    }

    /**
     * Abre ventana de ayuda.
     */
    private void abrirVentana(String texto) {
        final Dialog simple = new Dialog();
        simple.setHeading("Ayuda");
        simple.setButtons(Dialog.OK);
        simple.setBodyStyleName("pad-text");
        simple.addText(texto);
        simple.getItem(0).getFocusSupport().setIgnore(true);
        simple.setScrollMode(Style.Scroll.AUTO);
        simple.setHideOnButtonClick(true);
        simple.setWidth(550);
        //simple.setSize(550, 255);

        simple.show();
    }

}