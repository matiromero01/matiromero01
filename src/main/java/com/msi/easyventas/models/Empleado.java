package com.msi.easyventas.models;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", length = 10)
    private long id;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 30, nullable = false)
    private String apellido;
    @Column(length = 50, nullable = false)
    private String domicilio;
    @Column(nullable = false)
    private boolean estado;
    @Column(nullable = false)
    private int genero;
    @Column(nullable = false)
    private int documento;
    @Column(nullable = false)
    private String contraseña;

    @ManyToOne()
    @JoinColumn(name = "id_ciudad", nullable = false)
    private Ciudad ciudad;

    @ManyToOne()
    @JoinColumn(name = "id_tipo_doc", nullable = false)
    private TipoDoc tipoDoc;

    @ManyToOne()
    @JoinColumn(name = "id_rol_empleado", nullable = false)
    private RolEmpleado rolEmpleado;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String password) {
        this.contraseña = password;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public TipoDoc getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDoc tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public RolEmpleado getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(RolEmpleado rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado(String nombre, String apellido, String domicilio, boolean estado, int genero, int documento, String contraseña, Ciudad ciudad, TipoDoc tipoDoc, RolEmpleado rolEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.estado = estado;
        this.genero = genero;
        this.documento = documento;
        this.contraseña = contraseña;
        this.ciudad = ciudad;
        this.tipoDoc = tipoDoc;
        this.rolEmpleado = rolEmpleado;
    }

    public Empleado() {
    }
}
