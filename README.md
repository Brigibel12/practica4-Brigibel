# practica4-Brigibel
Repositorio para la práctica 4 

## Pasos y comandos
1. Crear maquina virtual
2. Ubicarse en descargas y conectarse con el siguiente comando:
$ ssh -i "clave_def.pem" ubuntu@ec2-3-88-193-179.compute-1.amazonaws.com
3. Instalación básica:
$ wget https://raw.githubusercontent.com/Brigibel12/practica4-Brigibel/main/basico-ubuntu.sh && chmod +x basico-ubuntu.sh && bash basico-ubuntu.sh

# Para activar modos de Apache 
$ cd /etc/apache2/sites-available/
$ sudo a2enmod proxy proxy_html proxy_http

# Para la integración de SSL/TLS
$ sudo a2enmod ssl
$ sudo service apache2 stop
$ sudo certbot certonly -m bymm0001@ce.pucmm.edu.do -d app1.brigibel12.me
$ sudo certbot certonly -m bymm0001@ce.pucmm.edu.do -d app2.brigibel12.me

#Para iniciar el Site
$ sudo a2ensite seguro.conf
$ sudo systemctl restart apache2