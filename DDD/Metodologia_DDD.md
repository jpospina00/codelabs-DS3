
# Preguntas y Respuestas sobre Domain-Driven Design (DDD)

## 1. ¿Qué es Domain-Driven Design (DDD) y cuál es su objetivo principal?
**DDD** es una metodología de diseño de software centrada en el dominio del negocio. Su objetivo principal es construir soluciones que reflejen con precisión los procesos y reglas empresariales, mediante una colaboración constante entre desarrolladores y expertos del dominio.

## 2. ¿Cuál es la diferencia entre una Entidad y un Objeto de Valor en DDD?
- **Entidad**: Tiene una identidad única y persiste a lo largo del tiempo, incluso si sus atributos cambian. Ejemplo: un Pedido con un ID único.
- **Objeto de Valor**: Es inmutable y no posee identidad propia; se usa para describir atributos de las entidades. Ejemplo: una Dirección (ciudad, calle, código postal).

## 3. ¿Qué es un Bounded Context y por qué es importante en DDD?
Un **Bounded Context** define un límite explícito dentro del cual un modelo de dominio tiene significado específico y coherente. Es importante porque:
- Separa las responsabilidades y evita ambigüedades de significado.
- Facilita la escalabilidad y el mantenimiento al dividir el sistema en partes manejables.

## 4. ¿Cuál es el propósito del Lenguaje Ubicuo (Ubiquitous Language) en DDD?
El **Lenguaje Ubicuo** busca crear un lenguaje común entre desarrolladores y expertos del negocio. Esto mejora la comunicación, reduce malentendidos y asegura que el código represente fielmente el dominio.

## 5. ¿Qué es un Agregado (Aggregate) y cómo garantiza la consistencia en el dominio?
Un **Agregado** es un conjunto de entidades y objetos de valor con una raíz (raíz del agregado) que actúa como punto de entrada. Garantiza:
- **Encapsulamiento** de reglas de negocio.
- **Consistencia interna** mediante restricciones que se aplican dentro de sus límites.

## 6. ¿Cómo se relacionan los Repositorios en DDD con la infraestructura de persistencia?
Los **Repositorios** actúan como una interfaz entre la lógica de negocio y la infraestructura de almacenamiento. Permiten:
- Obtener y almacenar agregados sin exponer detalles técnicos.
- Desacoplar el dominio de las tecnologías de persistencia (como bases de datos).

## 7. ¿Qué son los Eventos de Dominio y cómo mejoran la comunicación entre Bounded Contexts?
Los **Eventos de Dominio** representan hechos significativos dentro del negocio (ej. `PedidoConfirmado`). Mejoran la comunicación entre contextos al:
- Facilitar la integración basada en eventos (event-driven).
- Permitir una arquitectura más desacoplada y reactiva.

## 8. ¿Cómo se diferencian los Servicios de Aplicación y los Servicios de Dominio en DDD?
- **Servicios de Aplicación**: Orquestan la lógica del dominio; se ubican fuera del modelo de dominio. Ejemplo: Procesar una solicitud de pedido.
- **Servicios de Dominio**: Contienen reglas de negocio que no pertenecen a una sola entidad. Ejemplo: Calcular la fecha estimada de entrega de un pedido.

## 9. ¿Cómo DDD facilita el diseño de software en sistemas complejos y escalables?
DDD ayuda a gestionar la complejidad mediante:
- Separación clara de responsabilidades (Bounded Contexts).
- Modelos ricos y coherentes.
- Lenguaje común que mejora la comunicación.
- Modularidad que facilita la evolución del sistema y el trabajo en equipos distribuidos.

## 10. ¿Cómo se puede combinar DDD con Clean Architecture en una aplicación de microservicios?
Se combinan de la siguiente manera:
- **DDD** aporta el enfoque centrado en el dominio (modelo rico, agregados, eventos).
- **Clean Architecture** organiza el código por capas (entidades, casos de uso, interfaces).
- En microservicios:
  - Cada **Bounded Context** puede ser un microservicio.
  - Se comunican mediante **eventos** o APIs.
  - Se mantienen independientes, coherentes y escalables.
