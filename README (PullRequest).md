# Los_Idos_SegundoSemestre


## Comandos útiles de Git:
-------------------------------------------------------------------------------------------------------------------------
## Ayuda Memoria - Comandos Esenciales.

### ***📁 NAVEGACIÓN BÁSICA ENTRE DOCUMENTOS***

**Ver carpetas y archivos**

    ls
    ls -la

**Crear carpeta**
 
    mkdir nombre_carpeta

**Entrar en carpeta**

    cd nombre_carpeta

 **Volver atrás**

    cd ..

 **Ver dónde estoy**

    pwd

 ### ***📄 MANEJO DE ARCHIVOS***


 **Crear archivo vacío**

    touch archivo.txt

 **Ver contenido**

    cat archivo.txt

 **Eliminar archivo**

    rm archivo.txt

 **Eliminar CARPETA _(¡CUIDADO!)_**

    rm -rf nombre_carpeta

 ### ***🐙 GIT - COMANDOS BÁSICOS***

🔄 Flujo Diario

 **Actualizar desde main _(¡SIEMPRE!)_**

    git pull origin main

 **Ver en qué rama estoy**

    git branch -a

 **Cambiar a mi rama**

    git checkout mi_rama

**Crear una rama nueva**

    git checkout -b rama_JuanPerez

**Opcional: eliminar rama**

    git branch -d rama_JuanPerez

    git push origin --delete rama_JuanPerez

 **Subir mis cambios**

    git add .

    git commit -m "mensaje claro"

    git push origin mi_rama


 ### ***📋 Ver Información***


    git status       *->Ver estado actual*

    git log --oneline  *->Ver historial*

 ## ***🎯 REGLAS DE ORO***

✅ **NUNCA** hacer push a main

✅ **SIEMPRE** hacer **pull origin main** antes de trabajar y antes de hacer Pull Request

✅ **CADA UNO** en su propia rama

✅ **SÓLO** merge a main por **Pull Request** en GitHub


-------------------------------------------------------------------------------------------------------------------------

 ## METODOLOGÍA DE TRABAJO COMPLETA 
 

 ### 🚀 CONFIGURACIÓN INICIAL
 

1. Clonar el repositorio

       git clone https://github.com/HotCode2025/los_Idos_SegundoSemestre.git los_Idos_SegundoSemestre

2. Entrar a la carpeta

       cd Los_Idos_SegundoSemestre

3. Crear tu rama personal

       git checkout -b rama_JuanPerez

4. Verificar ramas disponibles

       git branch -a

5. Cambiar a tu rama (si no estás en ella)

       git checkout rama_JuanPerez

### 📋 BUENAS PRÁCTICAS PARA COMMITS

 **Ejemplos de mensajes claros para features, fixes, documentación, refactorización:**
 
    git commit -m "feat: implementar sistema de autenticación para login"

    git commit -m "fix: corregir error en página de bienvenida"

    git commit -m "docs: actualizar documentación del API-Reference"

    git commit -m "refactor: optimizar función de búsqueda"


### 🔍 COMANDOS ADICIONALES ÚTILES


**- Ver estado de los archivos**

    git status


**- Ver cambios específicos**

    git diff


**- Ver historial de commits**

    git log --oneline --graph


**- Si necesitas descartar cambios locales**

    git checkout -- nombre_archivo.py


**Si te equivocaste de rama al hacer commit**

    git checkout rama_correcta

    git cherry-pick commit_hash


### ⚠️ **REGLAS DE ORO PARA EL EQUIPO**

NUNCA hacer push directamente a main

SIEMPRE hacer pull origin main antes de empezar a trabajar y antes de subir cambios

CADA PERSONA trabaja en su rama personal

SOLO merge a main via Pull Request aprobado

COMUNICAR cuando se van a subir cambios


 *GESTIÓN DE PULL REQUESTS*
 
**Cuando termines una funcionalidad completa:**

*Ir a GitHub → Pull Requests → New Pull Request*

Comparar: rama_JuanPerez → main

Solicitar review de 1 compañero

Esperar aprobación antes de merge


 ## **FLUJO PARA LLEVAR LA RAMA A MAIN**
 

**--Paso 1: PREPARAR tu rama local**


*Asegurate de tener todo actualizado*


    git checkout rama_JuanPerez

    git pull origin main  # ¡CRUCIAL!

    git push origin rama_JuanPerez  # subir últimos cambios



**--Paso 2: IR A GITHUB y crear Pull Request**


Abrir el repositorio en GitHub

Ir a la pestaña "Pull Requests"

Click en "New Pull Request"

Configurar:

  base: main (hacia dónde va)
  
  compare: rama_JuanPerez (tu rama)
  

**--Paso 3: REVISIÓN y APPROVAL**

Agregar reviewers (1 compañero mínimo)

Esperar que revisen y aprueben

Resolver comentarios si los hay


**--Paso 4: MERGE a main**


Una vez aprobado, click en "Merge pull request"

NO usar "Squash and merge" a menos que el equipo lo decida

SÍ usar "Create a merge commit"


**--Paso 5: LIMPIEZA posterior**


*Actualizar tu local main*

    git checkout main

    git pull origin main


*Eliminar tu rama local (opcional)*

    git branch -d rama_JuanPerez


*Eliminar rama remota (opcional)*

    git push origin --delete rama_JuanPerez


## 🚨 ¿POR QUÉ NO git push origin main?


### **¡NUNCA HAGAN ESTO!**

    git push origin main   ❌ **PROHIBIDO**



 Razones:
  
 1. Omite el proceso de revisión
 
 2. Puede romper el código de otros
 
 3. No deja historial de quién aprobó
 
 4. Elimina la trazabilidad



    
## 📊 COMANDOS PARA VER ESTADO ANTES DEL PR (Pull Request)


**Ver diferencias con main**

    git diff main..rama_JuanPerez



**Ver commits que se van a mergear**

    git log main..rama_JuanPerez



**Ver estado del working directory**

    git status



### 🎯 **EJEMPLO PRÁCTICO DE PULL REQUEST**



**1. Preparar mi rama**

    git checkout rama_JuanPerez

    git pull origin main



*Resolver conflictos si los hay*



    git add .

    git commit -m "merge: actualizar con main"

    git push origin rama_JuanPerez



**2. Crear PR en GitHub (desde la web)**



**3. Esperar approval de 1 compañero**



**4. Después del merge en GitHub:**

    git checkout main

    git pull origin main  *->traer los cambios mergeados*
