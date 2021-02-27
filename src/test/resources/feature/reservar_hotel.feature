#language: es
#karelysvargasm@gmail.com

Característica:  Yo como jefe de ventas de la agencia de viajes DX Hotels
  deseo realizar una búsqueda de los hoteles con la tarifa más económica
  para agendar el mas economico para cada uno de los destinos ofrecidos.

  Escenario: Realizar la busqueda de un hotel en DX Hotels
    Dado que carolina esta en la pagina de "DXHotels"
    Cuando realice la busqueda del hotel "Las Vegas" con fecha de ingreso 02/27/2021 y fecha de salida 02/28/2021
    Y  seleccione el hotel con la tarifa mas ecocomica
    Entonces la tarifa a  pagar por el hotel serian $280.00