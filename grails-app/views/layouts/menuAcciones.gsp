<!DOCTYPE html>
<html>
<body>
  <div class="list-group" id = 'menuAcciones'>
  </div>
</body>
</html>


<script>
$('document').ready(function(){
        $.get( "/query/getMenu?sec=INF", function( data ) {
          var X
          var x
          $.each(data.result, function(i, elem) {
            if(elem.contexto != x){
              $( "#menuAcciones" ).append('<a href="#" class="list-group-item list-group-item-action active">'+elem.contexto+'</a>');
            }
            $( "#menuAcciones" ).append('<a href="'+elem.url+'" class="list-group-item list-group-item-action">'+elem.nombre+'</a>');
            x = elem.contexto
          
          });

        });

});
</script>