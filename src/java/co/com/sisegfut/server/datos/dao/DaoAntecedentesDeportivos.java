/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.sisegfut.server.datos.dao;

import co.com.sisegfut.client.datos.dominio.AntecedentesDeportivos;
import java.util.List;

/**
 *
 * @author Andres Hurtado
 */
public interface DaoAntecedentesDeportivos extends DaoGenerico<AntecedentesDeportivos>{
    
    public List<AntecedentesDeportivos> AnteDepxDeportista(Long idDep)throws Exception;
}
