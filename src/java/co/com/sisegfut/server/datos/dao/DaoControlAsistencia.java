/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.sisegfut.server.datos.dao;

import co.com.sisegfut.client.datos.dominio.ControlAsistencia;
import co.com.sisegfut.client.datos.dominio.dto.DTOReporteAsistenciaXMes;
import java.util.Date;
import java.util.List;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author fhurtado
 */
public interface DaoControlAsistencia extends DaoGenerico<ControlAsistencia>{
    
    public List<ControlAsistencia> obtenerPlanillaAsistenciaFiltro(Date fechaInicial,Date fechaFinal, Long idCategoria, String actividad) throws DataAccessException;
    
    public List<DTOReporteAsistenciaXMes> obtenerReporteAsistenciaxMes(Integer mes,Integer anio, Long idCategoria) throws DataAccessException;
    
}

 