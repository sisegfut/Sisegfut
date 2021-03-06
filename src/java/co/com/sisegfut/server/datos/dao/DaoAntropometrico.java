/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.sisegfut.server.datos.dao;

import co.com.sisegfut.client.datos.dominio.Antropometrico;
import co.com.sisegfut.client.datos.dominio.dto.DTOAntropometrico;
import java.util.List;
/**
 *
 * @author Malejandro
 */
public interface DaoAntropometrico extends DaoGenerico<Antropometrico>{
    
    public List<Antropometrico> AntropometricoxDeportista(Long idDep)throws Exception;
    
    public List<Antropometrico> AntropometricoxCategoria(Long idCategoria)throws Exception;
    
    public List<Antropometrico> ultimaMedAntropoRealizadaXDeportista(Long idCategoria)throws Exception;
}
