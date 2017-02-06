@echo off

rem La siguiente sentencia ejecutará el programa Argumentos.jar
java -jar .\dist\Argumentos.jar /arg0 --arg1 -A2

rem La siguiente sentencia guardará el código de retorno del programa.
set returncode=%ERRORLEVEL%

echo El cogido de retorno es: %returncode%

rem La siguiente sentencia sirve para hacer que el script espere hasta que el usuario introduce enter
set /p DUMMY=Presiona ENTER para salir del script...