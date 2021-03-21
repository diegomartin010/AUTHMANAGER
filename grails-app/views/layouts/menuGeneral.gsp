  <div>
    <div class="dropdown">
      <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
        MENU
      </button>
      <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1" id='idmenu'>
      </ul>   
    </div>
  </div>

    <script>
      $('document').ready(function(){
        $.get( "/query/getMenu?sec=SUP", function( data ) {
          var X
          var x
          $.each(data.result, function(i, elem) {
            if(elem.contexto != x){
              $( "#idmenu" ).append('<li><hr class="dropdown-divider"></li>');
            }
            $( "#idmenu" ).append(
              `
               <li><a class="dropdown-item" href="`+elem.url+`">`+elem.nombre+" / "+elem.contexto+`</a></li>

              `
            );
            x = elem.contexto
          
          });

        });

});
</script>