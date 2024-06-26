package pe.edu.upeu.syscenterlife.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Venta;
import pe.edu.upeu.syscenterlife.repositorio.VentaRepository;

@Service
public class VentaService {
    @Autowired
    VentaRepository repository;
    
    // Crear
    public Venta guardarEntidad(Venta venta){
        return repository.save(venta);
    }
    
    // Leer todos los elementos
    public List<Venta> listarEntidad(){
        return repository.findAll();
    }
    
    // Actualizar
    public Venta actualizarEntidad(Venta venta){
        return repository.save(venta);
    }
    
    // Eliminar
    public void eliminarEntidad(Long id){
        repository.deleteById(id);
    }
    
    // Buscar por ID
    public Venta buscarEntidad(Long id){
        return repository.findById(id).orElse(null);
    }
}
