  <!DOCTYPE html>
  <html>
  <body>
        <div id = "grupos">
          PERFILES:
          <br>
          </div>
        </body>
  </html>


    <script>
      $('document').ready(function(){
        $.get( "/query/getGrupos", function( data ) {
          $.each(data.result, function(i, elem) {
              $( "#grupos" ).append('<button type="button" class="btn btn-light">('+elem.contexto+") "+elem.nombre+'</button>&nbsp;');
          });

        });

});
</script>