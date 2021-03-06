/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package co.com.sisegfut.client.util.rpc;

import co.com.sisegfut.client.datos.dominio.CambiosCompe;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;
import java.util.List;

/**
 *
 * @author fhurtado
 */
public interface RPCAdminCambiosCompeAsync extends RPCMaestroAsync<CambiosCompe>{
    
    public void getCambiosXCompetenciaGrid(Long idCompetencia, AsyncCallback<PagingLoadResult<CambiosCompe>> callback);
    
    public void getCambiosXCompetenciaCombo(Long idCompetencia, AsyncCallback<List<CambiosCompe>> callback);
    
    public void validarMinutoCambioCompetencia(Long idCompetencia, Integer Minuto, AsyncCallback<Boolean> callback);
    
}
