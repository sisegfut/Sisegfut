/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.sisegfut.client.util.rpc;


import co.com.sisegfut.client.datos.dominio.Antropometrico;
import co.com.sisegfut.client.datos.dominio.dto.DTOAntropometrico;
import com.extjs.gxt.ui.client.data.PagingLoadResult;

/**
 *
 * @author Andres Hurtado
 */
public interface RPCAdminAntropometrico extends RPCMaestro<Antropometrico>{
    
    public PagingLoadResult<DTOAntropometrico> getAntropometrico(Long idDeportista);
    
}
