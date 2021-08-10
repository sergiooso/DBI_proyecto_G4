package edu.unah.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import edu.unah.model.Consulta;
import edu.unah.model.Consultorio;
import edu.unah.model.Empleado;
import edu.unah.model.Expediente;
import edu.unah.model.Factura;
import edu.unah.model.Odontologo;
import edu.unah.model.Paciente;
import edu.unah.model.RecetaMedica;
import edu.unah.model.Sucursal;
import edu.unah.model.Tratamiento;
import edu.unah.service.ServiceConsulta;
import edu.unah.service.ServiceConsultorio;
import edu.unah.service.ServiceEmpleado;
import edu.unah.service.ServiceExpediente;
import edu.unah.service.ServiceFactura;
import edu.unah.service.ServiceOdontologo;
import edu.unah.service.ServicePaciente;
import edu.unah.service.ServiceRecetaMedica;
import edu.unah.service.ServiceSucursal;
import edu.unah.service.ServiceTratamiento;

@Controller
public class Controlador {
	@Autowired
	ServicePaciente servicePaciente;
	@Autowired
	ServiceSucursal serviceSucursal;
	@Autowired
	ServiceEmpleado servicEmpleado;
	@Autowired
	ServiceOdontologo serviceOdontologo;
	@Autowired
	ServiceConsulta serviceConsulta;
	@Autowired 
	ServiceExpediente serviceExpediente;
	@Autowired
	ServiceRecetaMedica serviceRecetaMedica;
	@Autowired
	ServiceTratamiento serviceTratamiento;
	@Autowired
	ServiceFactura serviceFactura;
	@Autowired
	ServiceConsultorio serviceConsultorio;
	
	
	//======================
	//Index
	//======================
	@RequestMapping("/Index")
	public String index() {
		return "Index";
	}
	@RequestMapping("/Roles")
	public String roles() {
		return "roles";
	}
	
	@RequestMapping("/LoginDoctor")
	public String logdoctor() {
		return "logindoctor";
	}
	
	@RequestMapping("/LoginPaciente")
	public String logPacien() {
		return "loginpaciente";
	}
	
	@RequestMapping("/LoginLobby")
	public String logdLobby() {
		return "loginlooby";
	}
	@RequestMapping("/nuevoExpediente")
	public String Expediente() {
		return "Nuevo-Expediente";
	}
	//=======================
	//Paciente
	//=======================
	@RequestMapping("/Pacientes")
	public String Paciente() {
		return "Registro-Paciente";
	}
	
	
	
	@RequestMapping(value="/crearPaciente", method=RequestMethod.POST)
	public String paciente(@RequestParam(name="idPac")int IdPaciente,
							 @RequestParam(name="priNombrePac")String PriNombre,
							 @RequestParam(name="segNombrePac")String SegNombre,
							 @RequestParam(name="priApellidoPac")String PriApellido,
							 @RequestParam(name="segApellidoPac")String SegApellido,
							 @RequestParam(name="telefonoPac") String Telefono,
							 @RequestParam(name="emailPac") String Correo,
							 @RequestParam(name="direccionPac")String Direccion,
							 @RequestParam(name="DepartamentoPac") String Departamento,
							 @RequestParam(name="fechaNacPac") @DateTimeFormat(iso = ISO.DATE) Date FechaNac,
							 @RequestParam(name="contraseniaPac") String Contrasenia
				) {
		Paciente newPaciente = new Paciente(IdPaciente, PriNombre,SegNombre,PriApellido,SegApellido,Telefono,Correo,Direccion,Departamento,FechaNac,Contrasenia);
		this.servicePaciente.crearPaciente(newPaciente);
		return "Registro-Paciente";
		
	}
							 
	
	//=======================
	//Sucursal
	//====================
	
	
	@RequestMapping(value="/crearSucursal",method=RequestMethod.GET)
	public Sucursal crearSucursal(@RequestParam(name="idSucursal")int IdSucursal,
								  @RequestParam(name="direccion")String Direccion,
								  @RequestParam(name="avenida")String Avenida,
								  @RequestParam(name="calle")String Calle,
								  @RequestParam(name="ciudad")String Ciudad,
								  @RequestParam(name="telefono")String Telefono){
		
		Sucursal tmpSucursal= new Sucursal(IdSucursal,Direccion,Avenida,Calle,Ciudad,Telefono);
		this.serviceSucursal.crearSucursal(tmpSucursal);
		return tmpSucursal;
	}
	
	
	
	//========================
	//EMPLEADO
	//=================
	
	@RequestMapping(value="/crearEmpleado",method=RequestMethod.GET)
	public Empleado crearEmpleado(@RequestParam(name="dni")int DniEmpleado, 
								  @RequestParam(name="priNombre")String PriNombre,
								  @RequestParam(name="segNombre")String SegNombre,
								  @RequestParam(name="priApellido")String PriApellido,
								  @RequestParam(name="segApellido")String SegApellido,
								  @RequestParam(name="telefono")String Telefono,
								  @RequestParam(name="cargo")String Cargo,
								  @RequestParam(name="sexo")String Sexo,
								  @RequestParam(name="contrasenia")String Contrasenia,
								  @RequestParam(name="idSucursal")int IdSucursal
								  ){
		Sucursal sucursal = this.serviceSucursal.buscarSucursal(IdSucursal);
		Empleado tmpEmpleado= new Empleado(DniEmpleado,PriNombre,SegNombre,PriApellido,SegApellido,Telefono,Cargo,Sexo,Contrasenia,sucursal);
		this.servicEmpleado.crearEmpleado(tmpEmpleado);
		return tmpEmpleado;
	}
	
	@RequestMapping(value="/ListarEmpleado", method=RequestMethod.GET)
	public List<Empleado> crearEmpleado(){
		return this.servicEmpleado.obtenerTodosEmpleados();
	}
	
	//=====================
	//ODONTOLOGO
	//=====================
	
	@RequestMapping("/RegistroDoctor")
	public String Odontologo() {
		return "Registro-Doctor";
	}
	
	
	@RequestMapping(value="/crearOdontologo",method=RequestMethod.POST)
	public String crearOdontologo(@RequestParam(name="idOdontologo")int IdOdontologo,
									  @RequestParam(name="especialidad")String Especialidad,
									  @RequestParam(name="priNombreDoc")String PriNombre,
									  @RequestParam(name="segNombreDoc")String SegNombre,
									  @RequestParam(name="priApellidoDoc")String PriApellido,
									  @RequestParam(name="segApellidoDoc")String SegApellido,
									  @RequestParam(name="contrasenia")String Contrasenia,
									  @RequestParam(name="idSucursal")int IdSucursal
									  ) {
		Sucursal Osucursal = this.serviceSucursal.buscarSucursal(IdSucursal);
		Odontologo tmpOdonto= new Odontologo(IdOdontologo,Especialidad,PriNombre,SegNombre,PriApellido,SegApellido,Contrasenia,Osucursal);
		this.serviceOdontologo.crearOdontologo(tmpOdonto);
		return "Registro-Doctor";
		
	}
	@RequestMapping(value="/ListarOdontologo", method=RequestMethod.GET)
	public List<Odontologo> crearOdontologo(){
		return this.serviceOdontologo.obtenerOdontologos();
	}
	
	
	
	//=======================
	//CONSULTA
	//=======================
	@RequestMapping("/RegistroConsulta")
	public String Consulta() {
		return "Registro-Consulta";
	}
	
	
	@RequestMapping(value="/CrearConsulta", method=RequestMethod.POST)
	public String crearConsulta(
								  @RequestParam(name="fecha")@DateTimeFormat(iso = ISO.DATE) Date Fecha,
								  @RequestParam(name="idPaciente")int IdPaciente,
								  @RequestParam(name="idOdontologo")int IdOdontologo) {
		Paciente paciente= this.servicePaciente.buscarPaciente(IdPaciente);
		Odontologo odonto= this.serviceOdontologo.buscarOdontologo(IdOdontologo);
		Consulta tmpConsulta = new Consulta(Fecha,paciente,odonto);
		this.serviceConsulta.crearConsulta(tmpConsulta);
		return "Registro-Consulta";
		
	}
	
	@RequestMapping(value="/ListarConsulta", method=RequestMethod.GET)
	public List<Consulta> crearConsulta(){
		return this.serviceConsulta.obtenerSucursal();
	}
	
	//=======================
	//EXPEDIENTE
	//=======================
	
	
	

	
	@RequestMapping(value="/CrearExpediente", method=RequestMethod.POST)
	public String crearExpediente(
									  @RequestParam(name="descripcion") String Descripcion,
									  @RequestParam(name="fecha_Inicio") @DateTimeFormat(iso = ISO.DATE) Date Fecha_Inicio,
									  @RequestParam(name="idPaciente") int IdPaciente,
									  @RequestParam(name="idOdontologo") int IdOdontologo) {
		Paciente paciente = this.servicePaciente.buscarPaciente(IdPaciente);
		Odontologo odonto = this.serviceOdontologo.buscarOdontologo(IdOdontologo);
		Expediente tmpExpediente = new Expediente( Descripcion, Fecha_Inicio, paciente, odonto);
		this.serviceExpediente.crearExpediente(tmpExpediente);
		return "Nuevo-Expediente";
	}
	
	@RequestMapping(value="/ListarExpediente", method=RequestMethod.GET)
	public String listarExpediente(Model model){
		List<Expediente> expediente  = this.serviceExpediente.obtenerExpedientes();
		
		model.addAttribute("expediente", expediente);
		
		return "expedientes";
	}
	
	//=======================
	//RECETA MEDICA
	//=======================
	
	@RequestMapping("/nuevaReceta")
	public String NuevaReceta() {
		return "Nueva-Receta";
	}
	
	
	@RequestMapping(value="/CrearReceta", method=RequestMethod.POST)
	public String crearRecetaMedica(
										  @RequestParam(name="descripcion") String Descripcion,
										  @RequestParam(name="Fecha_Actual")@DateTimeFormat(iso = ISO.DATE) Date Fecha_Actual,
										  @RequestParam(name="idPaciente") int IdPaciente,
										  @RequestParam(name="idOdontologo") int IdOdontologo) {
		Paciente paciente = this.servicePaciente.buscarPaciente(IdPaciente);
		Odontologo odonto = this.serviceOdontologo.buscarOdontologo(IdOdontologo);
		RecetaMedica tmpReceta = new RecetaMedica( Descripcion, Fecha_Actual, paciente, odonto);
		this.serviceRecetaMedica.crearReceta(tmpReceta);
		return "Nueva-Receta";
		
	}
		
	@RequestMapping(value="/ListarReceta", method=RequestMethod.GET)
	public List<RecetaMedica> ListaReceta(){
		return this.serviceRecetaMedica.obtenerTodasRecetas();
	}
	
	//=======================
	//TRATAMIENTO
	//=======================
	
	@RequestMapping(value="/CrearTratamiento", method=RequestMethod.GET)
	public Tratamiento crearTratamiento(@RequestParam(name="IdTratamiento") int IdTratamiento,
										@RequestParam(name="Nombre") String Nombre,
										@RequestParam(name="Precio") float Precio,
										@RequestParam(name="Fecha_Inicio") LocalDate Fecha_Inicio,
										@RequestParam(name="IdOdontologo") int IdOdontologo) {
		Odontologo odonto = this.serviceOdontologo.buscarOdontologo(IdOdontologo);
		Tratamiento tmpTratamiento = new Tratamiento(IdTratamiento, Nombre, Precio, Fecha_Inicio, odonto);
		this.serviceTratamiento.crearTratamiento(tmpTratamiento);
		return tmpTratamiento;
	}
	
	@RequestMapping(value="/ListarTratamientos", method=RequestMethod.GET)
	public List<Tratamiento> crearTratamiento(){
		return this.serviceTratamiento.obtenerTodasTratamiento();
	}

	//=======================
	//FACTURA
	//=======================
	
	@RequestMapping(value="/CrearFactura", method=RequestMethod.GET)
	public Factura crearFactura(
								@RequestParam(name="Descripcion") String Descripcion,
								@RequestParam(name="Total_Pagar") float Total_Pagar,
								@RequestParam(name="Direccion") String Direccion,
								@RequestParam(name="Fecha_Actual") LocalDate Fecha_Actual,
								@RequestParam(name="Subtotal") float Subtotal,
								@RequestParam(name="IdPaciente") int IdPaciente,
								@RequestParam(name="IdTratamiento") int IdTratamiento) {
		Paciente paciente = this.servicePaciente.buscarPaciente(IdPaciente);
		Tratamiento tratamiento = this.serviceTratamiento.buscarTratamiento(IdTratamiento);
		Factura tmpFactura = new Factura( Descripcion, Total_Pagar, Direccion, Fecha_Actual, Subtotal, paciente, tratamiento);
		this.serviceFactura.crearFactura(tmpFactura);
		return tmpFactura;
	}
	
	@RequestMapping(value="/ListarFactura", method=RequestMethod.GET)
	public List<Factura> crearFactura(){
		return this.serviceFactura.obtenerTodasFacturas();
	}

	//=======================
	//CONSULTORIO
	//=======================	
	
	@RequestMapping(value="/CrearConsultorio", method=RequestMethod.GET)
	public Consultorio crearConsultorio(@RequestParam(name="NumConsultorio") int NumConsultorio,
										@RequestParam(name="IdSucursal") int IdSucursal,
										@RequestParam(name="NombreConsultorio") String NombreConsultorio,
										@RequestParam(name="Ubicacion") String Ubicacion) {
		Sucursal sucursal = this.serviceSucursal.buscarSucursal(IdSucursal);
		Consultorio tmpConsultorio = new Consultorio(NumConsultorio, NombreConsultorio, Ubicacion,sucursal);
		this.serviceConsultorio.crearConsultorio(tmpConsultorio);
		return tmpConsultorio;
	}
	
	@RequestMapping(value="/ListarConsultorio", method=RequestMethod.GET)
	public List<Consultorio> crearConsultorio(){
		return this.serviceConsultorio.obtenerTodasConsultorio();
	}
	
	
	
}
