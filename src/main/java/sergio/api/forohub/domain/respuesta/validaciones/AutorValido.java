package sergio.api.forohub.domain.respuesta.validaciones;

import sergio.api.forohub.domain.respuesta.DatosCrearRespuesta;
import sergio.api.forohub.domain.usuario.UsuarioRepository;
import sergio.api.forohub.infra.errores.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValido implements ValidadorRespuesta {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idAutor() == null || !usuarioRepository.existsById(datos.idAutor())) {
            throw new ValidacionDeIntegridad("Autor no encontrado");
        }
    }
}
