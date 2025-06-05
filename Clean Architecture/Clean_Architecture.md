# Respuestas sobre Clean Architecture

## 1. ¿Qué problema busca resolver Clean Architecture en el desarrollo de software?
**Respuesta:**  
Clean Architecture aborda problemas como:  
- **Acoplamiento fuerte** con frameworks o bases de datos, lo que dificulta cambios tecnológicos.  
- **Dificultad para probar** la lógica de negocio debido a dependencias externas.  
- **Código poco mantenible** cuando las capas no están claramente separadas.  

Su objetivo es crear sistemas **modulares, testables y libres de dependencias tecnológicas** en el núcleo del negocio.

---

## 2. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?
**Respuesta:**  
| Capa                  | Responsabilidad                                                                 |  
|-----------------------|---------------------------------------------------------------------------------|  
| **Dominio**           | Contiene entidades y reglas de negocio puras (ej: `User`, `Order`). Independiente de tecnologías. |  
| **Aplicación**        | Coordina casos de uso (ej: `RegisterUserUseCase`). Orquesta flujos entre dominio e infraestructura. |  
| **Infraestructura**   | Implementa detalles técnicos (ej: bases de datos, APIs externas). Adapta tecnologías a las interfaces del dominio. |  
| **Presentación**      | Maneja la interacción con usuarios (ej: controladores REST, interfaces gráficas). |  

---

## 3. ¿Qué relación tiene Clean Architecture con el principio de Inversión de Dependencias (DIP) en SOLID?
**Respuesta:**  
Clean Architecture aplica **DIP** al:  
- Hacer que las capas externas (Infraestructura) dependan de interfaces definidas en capas internas (Dominio/Aplicación).  
- Ejemplo: Un `UserRepository` en Infraestructura implementa la interfaz `IUserRepository` definida en Dominio.  

Esto evita que cambios en la base de datos afecten la lógica de negocio.

---

## 4. ¿Por qué es importante desacoplar la lógica de negocio de la infraestructura en una aplicación?
**Respuesta:**  
- **Flexibilidad**: Permite cambiar tecnologías (ej: de MySQL a MongoDB) sin modificar el dominio.  
- **Testabilidad**: Las pruebas unitarias no requieren bases de datos o frameworks reales.  
- **Mantenibilidad**: El núcleo del negocio permanece estable ante cambios externos.  

---

## 5. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad de un sistema?
**Respuesta:**  
- **Escalabilidad**: Al separar capas, se pueden escalar componentes independientemente (ej: microservicios).  
- **Mantenibilidad**: Las reglas de negocio están aisladas, lo que reduce el riesgo de errores al modificar código.  

Ejemplo: Migrar de REST a GraphQL solo afecta la capa de Presentación.

---

## 6. ¿Qué diferencia hay entre la capa de dominio y la capa de aplicación en Clean Architecture?
**Respuesta:**  
- **Dominio**: Define **qué** es el negocio (entidades, reglas). Ej: `class User { name: string }`.  
- **Aplicación**: Define **cómo** se ejecutan los flujos (casos de uso). Ej: `RegisterUserUseCase` que valida datos y guarda en repositorio.  

---

## 7. ¿Por qué los controladores (controllers) y la base de datos deben estar en la capa de infraestructura?
**Respuesta:**  
- **Controladores**: Son detalles de implementación (ej: Spring MVC, Express.js) que pueden cambiar sin afectar la lógica.  
- **Base de datos**: Es un detalle técnico (ej: SQL vs NoSQL). La interfaz del repositorio está en Dominio, pero la implementación en Infraestructura.  

---

## 8. ¿Qué ventajas tiene usar una interfaz en la capa de dominio para definir repositorios en lugar de usar directamente JpaRepository?
**Respuesta:**  
- **Independencia**: El dominio no depende de Spring Data.  
- **Flexibilidad**: Puedes cambiar JPA por otra tecnología (ej: MongoDB) sin tocar el dominio.  
- **Testeo**: Mockeas la interfaz en pruebas, sin necesidad de una base de datos real.

---  

## 9. ¿Cómo interactúan los casos de uso (UseCases) con las entidades de dominio en Clean Architecture?
**Respuesta:**
- Los casos de uso (Capa de Aplicación) coordinan la ejecución de reglas de negocio sobre las entidades de dominio.
---

## 10.  ¿Cómo se puede aplicar Clean Architecture en una aplicación de microservicios con Spring Boot?
**Respuesta:**
-   Dividir la aplicación en microservicios con Clean Architecture en cada uno.
-   Cada microservicio tiene sus propias capas (Dominio, Aplicación, Infraestructura).
-   Usar interfaces en la capa de Dominio para desacoplar la infraestructura.
-   Comunicar microservicios mediante eventos o API REST sin exponer la lógica de negocio.
-   Usar contenedores (Docker, Kubernetes) para desplegar cada microservicio independientemente.