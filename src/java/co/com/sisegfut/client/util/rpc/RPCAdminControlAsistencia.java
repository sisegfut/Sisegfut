/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sisegfut.client.util.rpc;

import co.com.sisegfut.client.datos.dominio.ControlAsistencia;
import co.com.sisegfut.client.datos.dominio.dto.DTOControlAsistencia;
import co.com.sisegfut.client.datos.dominio.dto.DTOReporteAsistenciaXMes;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fhurtado
 */
public interface RPCAdminControlAsistencia extends RPCMaestro<ControlAsistencia> {

    public PagingLoadResult<DTOControlAsistencia> obtenerCtlAsistenciaFiltro(Date fechaInicial, Date fechaFinal, Long idCategoria, String actividad);
    
    public List<DTOReporteAsistenciaXMes> obtenerReporteAsistenciaxMes(Integer mes,Integer anio, Long idCategoria);

       /**
     * Valida si la asistencia que se desea guardar ya existe en esa categoria y en ese mismo día
     * @param fecha
     * @param idCategoria
     * @param actividad
     * @return 
     */
    public Boolean validarControlAsistenciaDiaCat(Date fecha, Long idCategoria, String actividad);
}
