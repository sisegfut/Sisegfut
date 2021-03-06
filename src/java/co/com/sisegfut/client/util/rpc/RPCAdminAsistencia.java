/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.sisegfut.client.util.rpc;

import co.com.sisegfut.client.datos.dominio.Asistencia;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import java.util.List;

/**
 *
 * @author fhurtado
 */
public interface RPCAdminAsistencia extends RPCMaestro<Asistencia>{
    
    
     public void guardarGridAsistencia(Long IdControlAsistencia,List<String[]> asistencias);
     
     public PagingLoadResult<Asistencia> getAsistenciaxId(Long IdControlAsistencia);
     
     public PagingLoadResult<Asistencia> getDeportistasxCategoria(Long idCategoria);
     
     
}
