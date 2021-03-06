/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.sisegfut.client.datos.dominio;

import com.extjs.gxt.ui.client.data.BeanModelTag;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author fhurtado
 */
@Entity
@Table(name = "asistencia")
public class Asistencia implements BeanModelTag, Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "gen_asistencia")
    @SequenceGenerator(name = "gen_asistencia", sequenceName = "asistencia_id_seq")
    private Long Id;
     
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_deportista", nullable = false)
    private Deportista idDeportista;
    
     @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_control_asistencia", nullable = false)
    private ControlAsistencia id_control_asistencia;
    
    @Column(name = "estado", nullable = false, length = 80)
    private String estado;
    
    
    public Asistencia() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Deportista getIdDeportista() {
        return idDeportista;
    }

    public void setIdDeportista(Deportista idDeportista) {
        this.idDeportista = idDeportista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ControlAsistencia getId_control_asistencia() {
        return id_control_asistencia;
    }

    public void setId_control_asistencia(ControlAsistencia id_control_asistencia) {
        this.id_control_asistencia = id_control_asistencia;
    }
    
   
    
    
    
    
    
    
}
