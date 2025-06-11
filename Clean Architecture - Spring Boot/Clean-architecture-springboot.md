# Preguntas y respuestas sobre Clean Architecture en un microservicio con Spring Boot

## 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

El propósito principal de Clean Architecture es organizar el código de una manera que separe claramente las responsabilidades, promoviendo la independencia de marcos de trabajo, bases de datos, interfaces de usuario y otros detalles externos. Busca que la lógica de negocio esté en el centro del sistema y que no dependa de detalles técnicos, permitiendo un sistema flexible, escalable, testeable y mantenible.

## 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

* Facilita el mantenimiento y la escalabilidad del microservicio.
* Promueve una alta cohesión y bajo acoplamiento.
* Permite realizar pruebas unitarias de manera sencilla.
* Separa la lógica de negocio de los detalles técnicos, como la persistencia o el framework.
* Mejora la comprensión del sistema al tener responsabilidades bien definidas por capa.

## 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

Cada microservicio debe seguir esta estructura:

### Dominio (Enterprise Business Rules)
- Contiene entidades y objetos de valor con reglas de negocio puras.
- NO depende de frameworks, bases de datos ni tecnologías externas.

### Aplicación (Application Business Rules)
- Contiene casos de uso o servicios de aplicación.
- Orquesta la lógica de negocio sin acoplarse a infraestructura o frameworks.
- Usa puertos e interfaces en vez de dependencias directas.

### Infraestructura (Adapters & Frameworks)
- Implementación de repositorios, servicios externos (bases de datos, APIs, colas).
- Adaptadores concretos de la lógica de negocio.
- Configuración de Spring Boot, ORM, persistencia.

### Presentación (Delivery Mechanisms)
- Controladores REST (Spring WebFlux o Spring MVC).
- Gestión de autenticación/autorización.
- Serialización y validación de datos.

## 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

Porque la infraestructura cambia con más frecuencia que la lógica de negocio. Al desacoplarlas, se puede cambiar la base de datos, el proveedor cloud o el mecanismo de mensajería sin afectar la parte central del sistema. Esto reduce el impacto de los cambios y mejora la flexibilidad y mantenibilidad.

## 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

La capa de aplicación (Use Cases) orquesta las operaciones del sistema según las necesidades del negocio. Debería contener:

* Coordinación de las entidades del dominio.
* Validaciones específicas de casos de uso.
* Control de transacciones.
* Llamadas a servicios externos a través de puertos definidos (interfaces).

## 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

* **UseCase:** Representa una acción o flujo específico de negocio. Es parte de la capa de aplicación.
* **Service:** En contextos tradicionales, puede contener lógica de negocio, pero en Clean Architecture los "services" suelen estar en capas de infraestructura o ser utilizados como helpers. El UseCase es quien debe contener la lógica de negocio específica.

## 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?

Para lograr independencia de tecnología. JpaRepository es parte de Spring Data JPA (infraestructura), y al acoplarse a él directamente se pierde la posibilidad de cambiar el mecanismo de persistencia sin afectar el resto del sistema. Definir interfaces permite abstraer la persistencia y desacoplarla de la lógica de negocio.

## 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

Un UseCase se implementa como una clase en la capa de aplicación que:

* Define una interfaz (opcional) y su implementación.
* Recibe los puertos necesarios (interfaces de repositorios, servicios) por inyección de dependencias.
* Expone un método público que representa el flujo del caso de uso.

**Ventajas:**

* Testeo unitario sencillo.
* Independencia de detalles externos.
* Reutilización de lógica de negocio.
* Modularidad y claridad.

## 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

* Dificultad para testear componentes de forma aislada.
* Acoplamiento a frameworks y tecnologías específicas.
* Duplicación de lógica en distintas partes del sistema.
* Problemas al escalar o cambiar tecnologías.
* Mayor complejidad al realizar mantenimiento o introducir nuevas funcionalidades.

## 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

* Al separar responsabilidades, permite que los equipos trabajen en diferentes capas sin interferencias.
* Facilita el cambio o evolución de tecnologías.
* Hace que los servicios sean más robustos y testables.
* Permite reutilizar lógica de negocio en diferentes canales (API REST, eventos, etc.).
* Favorece una arquitectura modular que escala mejor con el tiempo.
