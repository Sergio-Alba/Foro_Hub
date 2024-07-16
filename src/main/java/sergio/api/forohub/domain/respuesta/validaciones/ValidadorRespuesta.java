package sergio.api.forohub.domain.respuesta.validaciones;

import sergio.api.forohub.domain.respuesta.DatosCrearRespuesta;

public interface ValidadorRespuesta {
    public void validar(DatosCrearRespuesta datos);
}
