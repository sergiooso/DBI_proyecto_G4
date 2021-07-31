package edu.unah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.model.Paciente;
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
			
			@GetMapping("/paciente/Registrar")
			public String registrarPaciente() {
				return "registrarPaciente";
			}
			
			@GetMapping("/paciente/detalle{id}")
			public String registrarPaciente(@PathVariable("id") int id, Model model) {
				Paciente paciente = this.servicePaciente.buscarPaciente(id);
				model.addAttribute("paciente", paciente);
				return "detallePaciente";
			}
			
			/*@RequestMapping(value = "/paciente/cearPaciente", method=RequestMethod.POST)
			public String crearPaciente(@RequestParam(name = "id") int Id_Paciente))*/
			
}
