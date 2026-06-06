# Sistema de Control Escolar - TEC

Este proyecto es una aplicación de escritorio desarrollada en Java que permite gestionar la información académica de una institución educativa, incluyendo la administración de alumnos, maestros, materias, carreras y sus respectivas calificaciones.

## Características principales
- **Gestión de registros:** Módulos independientes para Alumnos, Maestros, Materias, Carreras y Calificaciones.
- **Seguridad:** Sistema de autenticación (Login) para acceder a las funciones del sistema.
- **Reportes en PDF:** Generación dinámica de reportes detallados para todas las tablas del sistema utilizando la librería iText.
- **Interfaz Intuitiva:** Menú principal con navegación sencilla entre módulos.

## Tecnologías utilizadas
- **Lenguaje:** Java (JDK 23)
- **Interfaz:** Swing (NetBeans IDE)
- **Base de Datos:** MySQL (Servidor local)
- **Reportes:** iText 5.5.9
- **Conector:** MySQL Connector/J

## Estructura del repositorio
- `/src`: Código fuente completo del proyecto.
- `/database`: Script `.sql` necesario para crear la base de datos y cargar los datos de prueba.
- `/docs`: Manual de usuario en formato PDF.

## Instrucciones de instalación
1. **Base de Datos:**
   - Abre MySQL Workbench.
   - Ejecuta el script ubicado en `database/control_escolar.sql` para crear la base de datos con los datos de prueba.
2. **Configuración del proyecto:**
   - Abre el proyecto en NetBeans IDE.
   - Localiza la clase `ConexionBD.java` dentro del paquete `Conexion`.
   - Asegúrate de que las credenciales (usuario y contraseña) coincidan con las de tu servidor MySQL local.
3. **Ejecución:**
   - Compila y ejecuta el archivo principal `SistemaLogin.java`.

## Video de demostración
Puedes ver el funcionamiento del sistema en el siguiente enlace:
[https://drive.google.com/file/d/1Q69JnSchzuaCnslHGVEb3COB0fUkEdui/view?usp=sharing]

---
*Desarrollado para la materia de Programación II - [Equipo 5]*