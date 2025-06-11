# Preguntas sobre Proyecto Spring Boot con PostgreSQL

## 1. ¿Cuál es el propósito de Spring Boot y por qué es útil en el desarrollo de aplicaciones Java?
Spring Boot simplifica el desarrollo de aplicaciones Java proporcionando una configuración predeterminada, un servidor embebido y una estructura predefinida. Esto permite crear y ejecutar aplicaciones con menor esfuerzo de configuración manual.

## 2. ¿Cómo se configura una base de datos PostgreSQL en un proyecto Spring Boot usando application.properties?
Se configura en `src/main/resources/application.properties` agregando:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/mi_basedatos
spring.datasource.username=mi_usuario
spring.datasource.password=mi_contraseña
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
Reemplazando `mi_basedatos`, `mi_usuario` y `mi_contraseña` con los valores reales.

## 3. ¿Qué hace la anotación @Entity en la clase Pais y por qué es necesaria?
La anotación `@Entity` indica que la clase `Pais` es una entidad JPA, es decir, se mapea a una tabla de base de datos. Es necesaria para que Spring Data JPA la reconozca como tal y permita persistirla.

## 4. ¿Cuál es la función de JpaRepository y por qué se usa en la capa de persistencia?
`JpaRepository` proporciona una interfaz con métodos CRUD ya implementados. Al extenderla, `PaisRepository` hereda estos métodos, evitando la necesidad de escribir código repetitivo.

## 5. ¿Cómo se implementa la inyección de dependencias en el servicio PaisService y por qué es importante?
Se implementa pasando `PaisRepository` como parámetro en el constructor de `PaisService`, y usando `@Service` para que Spring gestione su ciclo de vida. Esto favorece el desacoplamiento y facilita las pruebas.

## 6. ¿Cuál es la diferencia entre @RestController y @Service en Spring Boot?
- `@RestController`: define una clase como controlador REST que maneja solicitudes HTTP.
- `@Service`: indica una clase de lógica de negocio, que Spring gestiona como un componente de servicio.

## 7. ¿Cómo se define un endpoint en un controlador REST para buscar un país por su nombre?
En `PaisController.java` se define así:
```java
@GetMapping("/nombre/{nombre}")
public ResponseEntity<Pais> obtenerPaisPorNombre(@PathVariable String nombre) {
    return paisService.obtenerPorNombre(nombre)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
}
```

## 8. ¿Por qué es útil Docker para ejecutar PostgreSQL en lugar de instalarlo manualmente?
Docker facilita el despliegue de servicios como PostgreSQL sin necesidad de instalaciones locales complejas, permitiendo aislar entornos y facilitar pruebas.

## 9. ¿Cómo se ejecuta y prueba la API REST en IntelliJ IDEA?
Se abre y ejecuta la clase `DemoApplication.java` como una aplicación Java. Esto inicia el servidor Spring Boot y expone los endpoints definidos en `PaisController`.

## 10. ¿Cómo se maneja la eliminación de un país en el API y qué código de respuesta devuelve el servidor?
En `PaisController`:
```java
@DeleteMapping("/{id}")
public ResponseEntity<Void> eliminarPais(@PathVariable Long id) {
    paisService.eliminarPais(id);
    return ResponseEntity.noContent().build();
}
```
El servidor devuelve el código de estado HTTP `204 No Content`.