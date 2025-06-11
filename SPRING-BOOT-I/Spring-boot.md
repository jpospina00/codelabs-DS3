# Respuestas a Preguntas de Repaso - Spring Boot

1. **¿Qué es Spring Boot y para qué sirve?**  
   Framework de Java para desarrollo rápido de aplicaciones empresariales con configuración automática y servidor embebido.

2. **¿Qué hace @SpringBootApplication?**  
   Anotación compuesta que incluye:  
   - `@Configuration`  
   - `@EnableAutoConfiguration`  
   - `@ComponentScan`

3. **¿Cómo iniciar aplicación Spring Boot?**  
   Ejecutando el método main con:  
   `SpringApplication.run(ClasePrincipal.class, args);`

4. **¿Función de @RestController?**  
   Definir un controlador que maneja peticiones HTTP y devuelve respuestas REST.

5. **¿Cómo definir URL en controlador?**  
   Con anotaciones:  
   `@GetMapping("/ruta")`  
   `@PostMapping("/ruta")`

6. **¿Puerto por defecto?**  
   `8080`

7. **¿Cómo cambiar puerto?**  
   En application.properties:  
   `server.port=9090`

8. **¿Comando Maven para ejecutar?**  
   `mvn spring-boot:run`

9. **¿Cómo probar endpoint?**  
   Acceder en navegador a:  
   `http://localhost:puerto/ruta`

10. **¿Para qué sirve application.properties?**  
    Archivo de configuración para:  
    - Puertos  
    - Bases de datos  
    - Variables de entorno  
    - Configuraciones personalizadas