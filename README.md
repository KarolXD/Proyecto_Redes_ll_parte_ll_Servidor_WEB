>  # Creación de un antivirus, Parte l


* El Readme de este repositorio tendrá una descripción del software que se debe instalar
para ejecutar el proyecto y los pasos detallados. 





# Clonando el repositorio
Para empezar con la clonación del repositorio,
Usando el IDE Pycharm version 202

Para clonar el proyecto, se deben hacer los siguientes pasos.

*  **Paso #1**

Abrir el controlador de versiones, para este ejemplo, lo haremos con el controlador de versiones 'GitKraken'

*  **Paso #2**
Dirigirse a el apartado 'Clonar', y a seleccionar el repositorio que se desea clonar, Y Seleccionar donde se desea guardar la clonacion del repositorio.
Como vemos acontinuación

![](https://github.com/KarolXD/Proyecto_Virus-Redes-ll-Parte-1/blob/main/Redes2/Fotos/Clonacion1.PNG)

*  **Paso #2**
Dirigirse a la carpeta donde se clonó el repositorio, para comprobar si efectivamente la clonación fue exitosa

![](https://github.com/KarolXD/Proyecto_Virus-Redes-ll-Parte-1/blob/main/Redes2/Fotos/Clonacion2.PNG)

# Restauración de la Base de datos

* **Paso #1**

Instalar gestor de base de datos, para este demo se utilizó Sql Server

* **Paso #2** 

Configuración de Credenciales
Para este demo, usamos un login en SqlServer

![](https://github.com/KarolXD/Proyecto_Virus-Redes-ll-Parte-1/blob/main/Redes2/Fotos/LoginSQL.PNG)


* **Paso #3**
Pasos para crear el restore en el motor de la Base de datos:
Presionamos el motor de BD, click derecho: Y vamos a la siguiente ruta: Tasks/Restore/Database

Como podemos ver acontinuación:

![](https://github.com/KarolXD/Proyecto_Virus-Redes-ll-Parte-1/blob/main/Redes2/Fotos/Restore1BD.PNG)

**Nota**: En el repositorio, en la carpeta scripts, se encuentra el .bak para hacer el restore, asi como los demas scripts, de las tablas que lleva la Base de datos, así como
los procedimientos almacenados

* **Paso #4**
Configurar el Restore:

Agregando una ruta, de donde se encuentra el .bak, asi como selecccionando la BD destino, donde se restaurará
Como podemos ver acontinuación

![](https://github.com/KarolXD/Proyecto_Virus-Redes-ll-Parte-1/blob/main/Redes2/Fotos/Restore2BD.PNG)



# Título del Proyecto
Creacion de un antivirus

# Empezando

Estas instrucciones le proporcionarán una copia del proyecto en funcionamiento en su máquina local para fines de desarrollo y prueba. Consulte la implementación para obtener notas sobre cómo implementar el proyecto en un sistema en vivo.

# Prerrequisitos
En este apartado detalleremos que cosas se necesitan para instalar el software y cómo instalarlas

Necesito:
* Gestor de Base de datos

* IDE de desarrollo: Pycharm o Notepad++

* Python

* Controlador de Versiones

* Controlador de tareas




# Instalando
En este apartado, se brindan una serie de ejemplos paso a paso que le indican cómo ejecutar un entorno de desarrollo


* **IDE Pycharm**

Para descargar el IDE usado en este proyecto, se debe dirigir a el siguiente enlace : https://www.jetbrains.com/pycharm/download/
Y simplemente presiona sobre el botón 'Download'

Nota: Para este proyecto, utilizamos el Pycharm Community

* **Python**

Para descargar Python, vamos al siguiente enlace: https://www.python.org/downloads/


*  **Gestor de Base de datos**

Para  descargar el gestor de base de datos, se dirigen a el siguiente enlace: https://docs.microsoft.com/en-us/sql/ssms/download-sql-server-management-studio-ssms?view=sql-server-ver15



* **Controlador de Versiones**

Para el controlador de versiones, usamos Github y GitKraken

Github: Alojamiento de repositorio
Gitkraken: Usado para cambio de versiones en el repositorio


* **Controlador de Tareas**
Para el control de tareas, se utilizó Trello, enlace para registrarse: https://trello.com/

# Construido con

* **Python:** Se utilizó como Lenguaje de Programación

* **Sql Server:** Se utilizó como Gestor de Base de datos

* **Git:** Se utilizó como controlador de versiones y tareas

* **IDE: Pycharm** Se usó como entorno de desarrollo

*  **Gui Tkinder** Se usó para la creación de la GUI (Interfaz grafica de usuario)

# Versionado

* Version python 3.7

* Version Pycharm: 202

* Version SqlServer Management Studio  2019

* Version Gitkaten 7.4.0


# Autores

* Jahanel Rivera Barboza

* Karolina Montenegro Guzmán

* Arturo Campos Bogantes

# Licencia
Este proyecto no está licenciado bajo alguna  Licencia

# Expresiones de gratitud

En los siguientes enlaces, fueron donde tomamos  feedback para la contrucción del presente proyecto
*https://people.sugarlabs.org/ignacio/Python/python+3.pdf

https://decodigo.com/python-borar-archivo

https://www.youtube.com/watch?v=QDdQtuRCh_g

https://micro.recursospython.com/recursos/como-copiar-o-mover-un-archivo.html

https://python-para-impacientes.blogspot.com/2014/02/operaciones-con-fechas-y-horas.html
etc.

