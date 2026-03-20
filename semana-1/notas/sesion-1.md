# Sesión 1 — 20/03/2026

## Tema trabajado
Configuración del entorno de desarrollo: Git, GitHub y Visual Studio Code.

## Lo que hice hoy
- Instalé Visual Studio Code con integración Git.
- Instalé Git y configuré mi identidad (nombre y correo).
- Creé el repositorio cs-learning-journal en GitHub.
- Cloné el repositorio a mi computadora local.
- Creé la estructura de carpetas del proyecto de aprendizaje.

## Conceptos aprendidos

**Git:** sistema de control de versiones que vive en mi computadora
y rastrea cambios en archivos mediante fotografías llamadas commits.

**GitHub:** servicio remoto que almacena los commits y los hace
accesibles desde internet. Son dos cosas distintas — Git es local,
GitHub es remoto.

**Repositorio:** la carpeta que Git monitorea, con todo su historial
de cambios.

**Commit:** una fotografía del estado de los archivos en un momento
dado. Cada commit tiene un mensaje descriptivo y una marca de tiempo.

**Push:** subir los commits locales al repositorio remoto en GitHub.

**Clone:** descargar un repositorio remoto a la computadora local,
creando la copia que Git va a monitorear.

**PATH:** variable del sistema operativo que contiene la lista de
carpetas donde Windows busca programas cuando escribes un comando
en la terminal.

**Staging area:** zona de preparación donde se reúnen los archivos
que van a incluirse en el próximo commit. Se usa git add para
mover archivos aquí.

**PowerShell vs CMD:** la terminal de VS Code usa PowerShell por
defecto, que tiene sintaxis diferente al símbolo del sistema clásico.
Por ejemplo, mkdir acepta múltiples argumentos diferente en cada uno.

## Comandos aprendidos hoy

| Comando | Qué hace |
|---------|----------|
| `git clone URL` | Descarga un repositorio remoto a la computadora |
| `git status` | Muestra el estado actual del repositorio |
| `git add .` | Agrega todos los cambios al staging area |
| `git commit -m "mensaje"` | Crea un commit con mensaje descriptivo |
| `git push origin main` | Sube los commits locales a GitHub |
| `git config --global` | Configura opciones globales de Git |
| `code .` | Abre VS Code en la carpeta actual |
| `New-Item` | Crea archivos o carpetas en PowerShell |

## Errores cometidos hoy y cómo se resolvieron

**Error 1:** pegué múltiples comandos juntos en una sola línea.
Resultado: "fatal: Too many arguments".
Solución: los comandos se ejecutan uno por uno, presionando Enter
después de cada uno.

**Error 2:** escribí la URL del repositorio duplicada al hacer clone.
Resultado: "fatal: repository not found".
Solución: escribir la URL manualmente sin copiar y pegar parcialmente.

**Error 3:** usé sintaxis de CMD en PowerShell con mkdir.
Resultado: "No se encuentra ningún parámetro de posición".
Solución: usar New-Item que es el comando nativo de PowerShell.

## Pendiente para la próxima sesión
- Día 1, Semana 1: ¿Qué es un algoritmo formalmente?
- Leer Capítulo 1 de Computer Science Distilled.