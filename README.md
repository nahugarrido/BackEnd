# Portfolio Argentina Programa (Backend)

<p align="center">
<img src="https://cdn.programadoresbrasil.com.br/wp-content/uploads/2021/05/Spring-BOOT-Interview-questions-1.jpg" style="max-width: 100%; display: inline-block;" />
</p>

## Utiles:
 
WEB: https://nahuelgarrido.com.ar/
 
API: https://backendnahuelgarrido.herokuapp.com/
 
REPOSITORIO: https://github.com/nahugarrido/BackEnd
 
## Descripción: 
 
Desarrollo de una  API REST  utilizando tecnologías como  Java con Spring Boot, hibernate, JPA y JWT.
bajo el modelo MVC para la lógica y MySQL para persistencia de datos.
 
## Diagrama Entidad - Relación (DER)
 
Este es el DER con las relaciones de la base de datos.

<p align="center">
<img src="https://i.ibb.co/NmcDVYp/diagrama-der-relaciones.png" style="max-width: 100%; display: inline-block;" />
</p>

 
Este es el DER que termine utilizando, ya que tuve un problema al hacer el CRUD con las relaciones.
 
<p align="center">
<img src="https://i.ibb.co/0DPf8DH/diagrama-der.png" style="max-width: 100%; display: inline-block;" />
</p>
 
## Almacenamiento de imágenes:
 
Para el almacenamiento de imágenes se utilizó la siguiente librería
 
https://github.com/msg2santoshsagar/alife-file-to-base64
 
Para poder almacenar las imágenes en MySQL se debe cambiar el tipo de dato del campo img a "LONGTEXT" y dejar el campo de tamaño vacio.
 
# Peticiones base de datos:
 
Tablas con todas las peticiones que se pueden realizar
 
## Contacto
 
| **Métodos** | **Rutas**              | **Acciones**                                       |
|:-----------:|------------------------|----------------------------------------------------|
| GET         | /contactos/traer       | Retornar una lista con todos los contactos.        |
| GET         | /contactos/traer/{id}  | Retornar un contacto específico.                   |
| PUT         | /contactos/editar/{id} | Editar información de un contacto en específico.   |
| POST        | /contactos/crear       | Crear un nuevo contacto.                           |
| DELETE      | /contactos/borrar/{id} | Borrar un contacto específico.                     |
 
## Educación
 
| **Métodos** | **Rutas**                | **Acciones**                                       |
|:-----------:|--------------------------|----------------------------------------------------|
| GET         | /educaciones/traer       | Retornar una lista con todas las educaciones.      |
| GET         | /educaciones/traer/{id}  | Retornar una educación específica.                 |
| PUT         | /educaciones/editar/{id} | Editar información de una educación en especifica. |
| POST        | /educaciones/crear       | Crear una nueva educación.                         |
| DELETE      | /educaciones/borrar/{id} | Borrar una educación específica.                   |
 
## Experiencia
 
| **Métodos** | **Rutas**                 | **Acciones**                                         |
|:-----------:|---------------------------|------------------------------------------------------|
| GET         | /experiencias/traer       | Retornar una lista con todas las experiencias.       |
| GET         | /experiencias/traer/{id}  | Retornar una experiencia específica.                 |
| PUT         | /experiencias/editar/{id} | Editar información de una experiencia en especifico. |
| POST        | /experiencias/crear       | Crear una nueva experiencia.                         |
| DELETE      | /experiencias/borrar/{id} | Borrar una experiencia específica.                   |
 
## Habilidades
 
| **Métodos** | **Rutas**                | **Acciones**                                        |
|:-----------:|--------------------------|-----------------------------------------------------|
| GET         | /habilidades/traer       | Retornar una lista con todas las habilidades.       |
| GET         | /habilidades/traer/{id}  | Retornar una habilidad específica.                  |
| PUT         | /habilidades/editar/{id} | Editar información de una habilidad en especifico.  |
| POST        | /habilidades/crear       | Crear una nueva habilidad.                          |
| DELETE      | /habilidades/borrar/{id} | Borrar una habilidad en especifico.                 |
 
## Persona
 
| **Métodos** | **Rutas**             | **Acciones**                                      |
|:-----------:|-----------------------|---------------------------------------------------|
| GET         | /personas/traer       | Retornar una lista con todas las personas.        |
| GET         | /personas/traer/{id}  | Retornar una persona específica.                  |
| PUT         | /personas/editar/{id} | Editar información de una persona en específico.  |
| POST        | /personas/crear       | Crear una nueva persona.                          |
| DELETE      | /personas/borrar/{id} | Borrar una persona específica                     |
 
## Proyecto
 
| **Métodos** | **Rutas**              | **Acciones**                                       |
|:-----------:|------------------------|----------------------------------------------------|
| GET         | /proyectos/traer       | Retornar una lista con todos los proyectos.        |
| GET         | /proyectos/traer/{id}  | Retornar un proyecto específico.                   |
| PUT         | /proyectos/editar/{id} | Editar información de un proyecto en específico.   |
| POST        | /proyectos/crear       | Crear un nuevo proyecto.                           |
| DELETE      | /proyectos/borrar/{id} | Borrar un proyecto específico.                     |

## Security
 
| **Métodos** | **Rutas**              | **Acciones**                                       |
|:-----------:|------------------------|----------------------------------------------------|
| POST        | /nuevo                 | Crear un nuevo usuario.                            |
| POST        | /login                 | Ingresar con un usuario valido.                    |

