package edu.unah.controller;

import java.sql.Date;
import java.time.LocalDate;
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
import edu.unah.model.Receta_Medica;
import edu.unah.model.Sucursal;
import edu.unah.model.Tratamiento;
import edu.unah.service.ServiceConsulta;
import edu.unah.service.ServiceConsultorio;
import edu.unah.service.ServiceEmpleado;
import edu.unah.service.ServiceExpediente;
import edu.unah.service.ServiceFactura;
import edu.unah.service.ServiceOdontologo;
import edu.unah.service.ServicePaciente;
import edu.unah.service.ServiceReceta_Medica;
import edu.unah.service.ServiceSucursal;
import edu.unah.service.ServiceTratamiento;

@Controller
public class Controlador {
			
	@Autowired
	ServicePaciente servicePaciente;
	@Autowired
	ServiceExpediente serviceExpediente;
	@Autowired
	ServiceOdontologo serviceOdontologo;
	@Autowired 
	ServiceConsulta serviceConsulta;
	@Autowired
	ServiceReceta_Medica serviceReceta_Medica;
	@Autowired 
	ServiceTratamiento serviceTratamiento;
	@Autowired 
	ServiceFactura serviceFactura;
	@Autowired
	ServiceSucursal serviceSucursal;
	@Autowired
	ServiceEmpleado serviceEmpleado;
	@Autowired
	ServiceConsultorio serviceConsultorio;
			
//====================================================================
//  Paciente
//====================================================================
			
	/*@GetMapping("/paciente/Registrar")
	public String registrarPaciente() {
	return "registrarPaciente";
	}
			
	@GetMapping("/paciente/detalle{id}")
	public String registrarPaciente(@PathVariable("id") int id, Model model) {
	Paciente paciente = this.servicePaciente.buscarPaciente(id);
	model.addAttribute("paciente", paciente);
		return "detallePaciente";
	}*/
			
	@RequestMapping(value = "/paciente/crearPaciente", method=RequestMethod.POST)
	public Paciente crearPaciente(@RequestParam(name = "Id_Paciente") int Id_Paciente,
								@RequestParam(name = "Pri_Nombre") String Pri_Nombre,
								@RequestParam(name = "Seg_Nombre") String Seg_Nombre,
								@RequestParam(name = "Pri_Apellido") String Pri_Apellido,
								@RequestParam(name = "Seg_Apellido") String Seg_Apellido,
								@RequestParam(name = "Telefono") String Telefono,
								@RequestParam(name = "Correo") String Correo,
								@RequestParam(name = "Direccion") String Direccion,
								@RequestParam(name = "Fecha_Nac") @DateTimeFormat(iso = ISO.DATE) LocalDate Fecha_Nac,
								@RequestParam(name = "Contrasenia") String Contrasenia) {
	    Paciente tmpPaciente = new Paciente (Id_Paciente, Pri_Nombre, Seg_Nombre, Pri_Apellido, Seg_Apellido, Telefono, Correo, Direccion,Fecha_Nac,Contrasenia);
		this.servicePaciente.crearPaciente(tmpPaciente);
		return tmpPaciente;
	}
			
	@RequestMapping(value ="/paciente/listaPaciente",method=RequestMethod.GET)
	public String listadoPaciente(Model model) {
		List<Paciente> paciente = this.servicePaciente.obtenerPacientes();
		model.addAttribute("paciente", paciente);
			return "listadoPaciente";
	}
			
	@RequestMapping(value ="/mecanico/buscarMecanico",method=RequestMethod.GET)
	public Paciente buscarPaciente(@RequestParam(name = "Id_Paciente") int Id_Paciente) {
		return this.servicePaciente.buscarPaciente(Id_Paciente);
	}
			
	//====================================================================
	//  Expediente
	//====================================================================
	@RequestMapping (value = "/expediente/crearExpediente", method=RequestMethod.GET)
	public Expediente crearExpediente(@RequestParam (name="Id_Expediente") int Id_Expediente,
									  @RequestParam (name="Descripcion") String Descripcion,
									  @RequestParam (name="Fecha_Inicio") @DateTimeFormat(iso = ISO.DATE) LocalDate Fecha_Inicio,
									  @RequestParam (name="Id_Paciente") int Id_Paciente,
									  @RequestParam (name="Id_Odontologo") int Id_Odontologo) {
		Paciente Paciente = this.servicePaciente.buscarPaciente(Id_Paciente);
		Odontologo Odontologo = this.serviceOdontologo.buscarOdontologo(Id_Odontologo);
				
		Expediente tmpExpediente = new Expediente(Id_Expediente, Descripcion, Fecha_Inicio, Paciente, Odontologo);
		this.serviceExpediente.crearExpediente(tmpExpediente);
		return tmpExpediente;
	}
			
	@RequestMapping(value="/expediente/listarExpediente", method=RequestMethod.GET)
	public List <Expediente> listarExpediente(){
		return this.serviceExpediente.obtenerExpedientes();
	}

	//====================================================================
	//  Odontologo
	//====================================================================
	@RequestMapping(value="/odontologo/crearOdontologo", method=RequestMethod.GET)
	public Odontologo crearOdontologo(@RequestParam(name = "Id_Odontologo") int Id_Odontologo,
									  @RequestParam(name = "Especialidad") String Especialidad,
									  @RequestParam(name = "Pri_Nombre") String Pri_Nombre,
									  @RequestParam(name = "Seg_Nombre") String Seg_Nombre,
									  @RequestParam(name = "Pri_Apellido") String Pri_Apellido,
									  @RequestParam(name = "Seg_Apellido") String Seg_Apellido,
									  @RequestParam(name = "Contrasenia") String Contrasenia,
									  @RequestParam(name = "Id_Sucursal") int Id_Sucursal) {
		
		Sucursal sucursal = this.serviceSucursal.buscarSucursal(Id_Sucursal);
		Odontologo tmpOdontologo = new Odontologo(Id_Odontologo, Especialidad, Pri_Nombre, Seg_Nombre, Pri_Apellido, Seg_Apellido, Contrasenia, sucursal);
		this.serviceOdontologo.crearOdontologo(tmpOdontologo);
		return tmpOdontologo;
	}
	
	@RequestMapping(value = "/odontologo/listarOdontologo", method=RequestMethod.GET)
	public List<Odontologo> listarOdontologo(){
		return this.serviceOdontologo.obtenerOdontologos();
	}
	//====================================================================
	//  Consulta
	//====================================================================
	@RequestMapping (value = "/consulta/crearConsulta", method=RequestMethod.GET)
	public Consulta crearConsulta(@RequestParam (name="Num_Consulta") int Id_Consulta,
									  @RequestParam (name="Fecha") @DateTimeFormat(iso = ISO.DATE) Date Fecha,
									  @RequestParam (name="Id_Paciente") int Id_Paciente,
									  @RequestParam (name="Id_Odontologo") int Id_Odontologo) {
		Paciente Paciente = this.servicePaciente.buscarPaciente(Id_Paciente);
		Odontologo Odontologo = this.serviceOdontologo.buscarOdontologo(Id_Odontologo);
				
		Consulta tmpConsulta = new Consulta(Id_Consulta,Fecha,Paciente, Odontologo);
		this.serviceConsulta.crearConsulta(tmpConsulta);
		return tmpConsulta;
	}
	
	@RequestMapping(value = "/consulta/listarConsulta",method=RequestMethod.GET)
	public List<Consulta> listarAuto(){
		return this.serviceConsulta.obtenerTodasConsultas();
	}
	//====================================================================
	//  Receta_Medica
	//====================================================================
	@RequestMapping (value = "/receta/crearReceta_Medica", method=RequestMethod.GET)
	public Receta_Medica crearReceta_Medica(@RequestParam (name="Id_Receta") int Id_Receta,
											@RequestParam (name="Descripcion") String Descripcion,
									  		@RequestParam (name="Fecha_Actual") @DateTimeFormat(iso = ISO.DATE) Date Fecha_Actual,
									  		@RequestParam (name="Id_Paciente") int Id_Paciente,
									  		@RequestParam (name="Id_Odontologo") int Id_Odontologo) {
		Paciente Paciente = this.servicePaciente.buscarPaciente(Id_Paciente);
		Odontologo Odontologo = this.serviceOdontologo.buscarOdontologo(Id_Odontologo);
				
		Receta_Medica tmpReceta = new Receta_Medica(Id_Receta,Descripcion, Fecha_Actual,Paciente, Odontologo);
		this.serviceReceta_Medica.crearReceta(tmpReceta);
		return tmpReceta;
	}
	
	@RequestMapping(value = "/receta/listarReceta",method=RequestMethod.GET)
	public List<Receta_Medica> listarReceta(){
		return this.serviceReceta_Medica.obtenerRecetas();
	}
	
	//====================================================================
	//  Tratamiento
	//====================================================================
	@RequestMapping (value = "/tratamiento/crearTratamiento", method=RequestMethod.GET)
	public Tratamiento crearTratamiento(@RequestParam (name="Id_Tratamiento") int Id_Tratamiento,
											@RequestParam (name="Nombre") String Nombre,
									  		@RequestParam (name="Precio") float Precio,
											@RequestParam (name="Fecha_Inicio") @DateTimeFormat(iso = ISO.DATE) Date Fecha_Inicio,
									  		@RequestParam (name="Id_Odontologo") int Id_Odontologo) {
		Odontologo Odontologo = this.serviceOdontologo.buscarOdontologo(Id_Odontologo);
				
		Tratamiento tmpTratamiento = new Tratamiento(Id_Tratamiento, Nombre, Precio, Fecha_Inicio,Odontologo);
		this.serviceTratamiento.crearTratamiento(tmpTratamiento);
		return tmpTratamiento;
	}	
	
	@RequestMapping(value = "/tratamiento/listarTratamiento",method=RequestMethod.GET)
	public List<Tratamiento> listarTratamiento(){
		return this.serviceTratamiento.obtenerTratamiento();
	}
	
	//====================================================================
	//  Factura
	//====================================================================
	@RequestMapping (value = "/factura/crearFactura", method=RequestMethod.GET)
	public Factura crearFactura(@RequestParam (name="Id_Factura") int Id_Factura,
								@RequestParam (name="Descripcion") String Descripcion,
								@RequestParam (name="Total_Pagar") float Total_Pagar,
								@RequestParam (name="Direccion") String Direccion,
								@RequestParam (name="Fecha_Actual") @DateTimeFormat(iso = ISO.DATE) Date Fecha_Actual,
								@RequestParam (name="Subtotal") float Subtotal,
								@RequestParam (name="Id_Paciente") int Id_Paciente,
								@RequestParam (name="Id_Tratamiento") int Id_Tratamiento){
		Paciente paciente = this.servicePaciente.buscarPaciente(Id_Paciente);
		Tratamiento tratamiento = this.serviceTratamiento.buscarTratamiento(Id_Tratamiento);
				
		Factura tmpFactura = new Factura(Id_Factura, Descripcion, Total_Pagar, Direccion, Fecha_Actual, Subtotal, paciente, tratamiento);
		this.serviceFactura.crearConsulta(tmpFactura);
		return tmpFactura;
	}	
	
	@RequestMapping(value = "/factura/listarFactura",method=RequestMethod.GET)
	public List<Factura> listarFactura(){
		return this.serviceFactura.obtenerFacturas();
	}
	
	//====================================================================
	//  Sucursal
	//====================================================================
	@RequestMapping (value = "/sucursal/crearSucursal", method=RequestMethod.GET)
	public Sucursal crearSucursal(@RequestParam (name="Id_Sucursal") int Id_Sucursal,
								  @RequestParam (name="Direccion") String Direccion,
								  @RequestParam (name="Avenida") String Avenida,
								  @RequestParam (name="Calle") String Calle,
								  @RequestParam (name="Ciudad") String Ciudad,
								  @RequestParam (name="Telefono") String Telefono){
		Sucursal tmpSucursal = new Sucursal(Id_Sucursal, Direccion, Avenida, Calle, Ciudad, Telefono);
		this.serviceSucursal.crearSucursal(tmpSucursal);
		return tmpSucursal;
	}	
		
	@RequestMapping(value = "/sucursal/listarSucursal",method=RequestMethod.GET)
	public List<Sucursal> listarSucursal(){
		return this.serviceSucursal.obtenerSucursal();
	}
	
	//====================================================================
	//  Empleado
	//====================================================================
	@RequestMapping (value = "/empleado/crearEmpleado", method=RequestMethod.GET)
	public Empleado crearEmpleado (@RequestParam (name="Dni_Empleado") int Dni_Empleado,
								   @RequestParam(name = "Pri_Nombre") String Pri_Nombre,
								   @RequestParam(name = "Seg_Nombre") String Seg_Nombre,
								   @RequestParam(name = "Pri_Apellido") String Pri_Apellido,
								   @RequestParam(name = "Seg_Apellido") String Seg_Apellido,
								   @RequestParam (name="Telefono") String Telefono,
								   @RequestParam (name="Sexo") String Sexo,
								   @RequestParam (name="Cargo") String Cargo,
								   @RequestParam (name="Contrasenia") String Contrasenia,
								   @RequestParam(name = "Id_Sucursal") int Id_Sucursal){
		Sucursal sucursal = this.serviceSucursal.buscarSucursal(Id_Sucursal);
		Empleado tmpEmpleado = new Empleado(Dni_Empleado, Pri_Nombre,Seg_Nombre, Pri_Apellido, Seg_Apellido,Telefono,Sexo,Cargo, Contrasenia, sucursal);
		this.serviceEmpleado.crearEmpleado(tmpEmpleado);
		return tmpEmpleado;
	}
	
	@RequestMapping(value = "/empleado/listarEmpleado",method=RequestMethod.GET)
	public List<Empleado> listarEmpleado(){
		return this.serviceEmpleado.obtenerTodosEmpleados();
	}
	//====================================================================
	//  Consultorio
	//====================================================================
	@RequestMapping (value = "/consultorio/crearConsultorio", method=RequestMethod.GET)
	public Consultorio crearConsultorio (@RequestParam (name = "Num_Consultorio") int Num_Consultorio,
								   		 @RequestParam (name = "Id_Sucursal") int Id_Sucursal,
								   		 @RequestParam (name = "Nombre_Consultorio") String Nombre_Consultorio,
								   		 @RequestParam (name = "Ubicacion") String Ubicacion){
		Sucursal sucursal = this.serviceSucursal.buscarSucursal(Id_Sucursal);
		Consultorio tmpConsultorio = new Consultorio(Num_Consultorio,sucursal, Nombre_Consultorio, Ubicacion);
		this.serviceConsultorio.crearConsultorio(tmpConsultorio);
		return tmpConsultorio;	
	}
		
	@RequestMapping(value = "/consultorio/listarConsultorio",method=RequestMethod.GET)
	public List<Consultorio> listarConsultorio(){
		return this.serviceConsultorio.obtenerConsultorio();
	}
	
}
