package mx.com.jc.peluqueriacanina.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.jc.peluqueriacanina.logica.Duenio;
import mx.com.jc.peluqueriacanina.logica.Mascota;
import mx.com.jc.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }

    public void BorrarMascota(int num_cliente) {
        try {
            mascotaJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
