package ar.edu.unahur.obj2.uml;

import ar.edu.unahur.obj2.uml.model.Bicicleta;
import ar.edu.unahur.obj2.uml.model.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    private Usuario usuario;
    private Bicicleta bicicleta;

    @BeforeEach
    void setUp() {
        usuario = new Usuario("Juan");
        bicicleta = new Bicicleta(26);
    }

    @Test
    void elUsuarioTieneNombre() {
        assertEquals("Juan", usuario.getNombre());
    }

    @Test
    void elUsuarioIniciaSinAlquileres() {
        assertTrue(usuario.getAlquileres().isEmpty());
    }

    @Test
    void alquilarVehiculoDisponibleAgregaAlquiler() {
        usuario.alquilarVehiculo(LocalDate.of(2026, 4, 22), LocalDate.of(2026, 4, 25), bicicleta);

        assertEquals(1, usuario.getAlquileres().size());
    }

    @Test
    void alquilarVehiculoDisponibleLoMarcaComoAlquilado() {
        usuario.alquilarVehiculo(LocalDate.of(2026, 4, 22), LocalDate.of(2026, 4, 25), bicicleta);

        assertTrue(bicicleta.getEstaAlquilado());
    }

    @Test
    void alquilarVehiculoYaAlquiladoLanzaExcepcion() {
        usuario.alquilarVehiculo(LocalDate.of(2026, 4, 22), LocalDate.of(2026, 4, 25), bicicleta);

        assertThrows(IllegalStateException.class, () ->
            usuario.alquilarVehiculo(LocalDate.of(2026, 4, 26), LocalDate.of(2026, 4, 28), bicicleta)
        );
    }

    @Test
    void alquilarVehiculoYaAlquiladoNoAgregaNuevoAlquiler() {
        usuario.alquilarVehiculo(LocalDate.of(2026, 4, 22), LocalDate.of(2026, 4, 25), bicicleta);

        assertThrows(IllegalStateException.class, () ->
            usuario.alquilarVehiculo(LocalDate.of(2026, 4, 26), LocalDate.of(2026, 4, 28), bicicleta)
        );

        assertEquals(1, usuario.getAlquileres().size());
    }
}
