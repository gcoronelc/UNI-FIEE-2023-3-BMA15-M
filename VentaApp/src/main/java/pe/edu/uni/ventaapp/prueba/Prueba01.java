package pe.edu.uni.ventaapp.prueba;

import pe.edu.uni.ventaapp.dto.ItemDto;
import pe.edu.uni.ventaapp.service.ComprobanteAbstract;
import pe.edu.uni.ventaapp.service.FacturaService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		// Datos
		double total = 118.0;
		// Proceso
		ComprobanteAbstract bean = new FacturaService();
		ItemDto[] repo = bean.procesar(total);
		// Reporte
		for (ItemDto dto : repo) {
			System.out.println(dto.getConcepto() + " - " + dto.getValor());
		}
	}

}
