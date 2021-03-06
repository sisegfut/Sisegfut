/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sisegfut.client.util.rpc;

import co.com.sisegfut.client.datos.dominio.CambiosCompe;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import java.util.List;

/**
 *
 * @author fhurtado
 */
public interface RPCAdminCambiosCompe extends RPCMaestro<CambiosCompe> {

    public PagingLoadResult<CambiosCompe> getCambiosXCompetenciaGrid(Long idCompetencia);
    
    public List<CambiosCompe> getCambiosXCompetenciaCombo(Long idCompetencia);
    
    public Boolean validarMinutoCambioCompetencia(Long idCompetencia, Integer Minuto);

}
