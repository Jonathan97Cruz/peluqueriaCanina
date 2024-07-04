package mx.com.jc.peluqueriacanina.logica;

import mx.com.jc.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {

    // Llama a ControladoraPersistencia y crea un objeto de este para poder llamar a cada uno de los métodos
    // y estos a la vez llama a los metodos del JPA
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String razaMasco, String colorMasc, String observacionesMasc, String duenioMasc,
            String celDuenioMasc, String alergicoMasc, String atencionMasc) {
        Duenio duenio = new Duenio();
        Mascota mascota = new Mascota();

        duenio.setNombre(duenioMasc);
        duenio.setCelDuenio(celDuenioMasc);

        mascota.setNombre(nombreMasco);
        mascota.setRaza(razaMasco);
        mascota.setColor(colorMasc);
        mascota.setObservaciones(observacionesMasc);
        mascota.setAlergico(alergicoMasc);
        mascota.setAtencion_especial(atencionMasc);
        mascota.setDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
        
    }

}
