#language:es

Característica: Agregar libro al carrito
  yo como usuario quiero agregar un libro al carrito de la pagina de libreria nacional

  Escenario: Libro agregado exitosamente
    Dado que el usuario encuentre la pagina de libreria nacional
    Cuando el usuario busque el libro para agregarlo al carrito de compra
    Entonces se valida que el libro fue agregado con exito
