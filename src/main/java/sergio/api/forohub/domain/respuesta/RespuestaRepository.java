package sergio.api.forohub.domain.respuesta;

import sergio.api.forohub.domain.topico.Topico;
import sergio.api.forohub.domain.usuario.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {

    boolean existsByTopicoAndSolucion(Topico topico, boolean solucion);

    boolean existsByTopicoAndMensajeAndAutorRespuesta(Topico topico, String mensaje, Usuario autorRespuesta);

    Page<Respuesta> findAllByTopico(Topico topico, Pageable paginacion);

    void removeAllByTopico(Topico referenceById);
}
