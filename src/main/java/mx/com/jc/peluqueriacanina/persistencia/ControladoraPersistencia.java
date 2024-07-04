package mx.com.jc.peluqueriacanina.persistencia;

import mx.com.jc.peluqueriacanina.logica.Duenio;
import mx.com.jc.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        duenioJpa.create(duenio);
        mascotaJpa.create(mascota);
    }

}
