<meta name="layout" content="workflow"/>
<parameter name="contents" value="Nuevo Template"></parameter>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Nombre</label>
  <input type="text" class="form-control" id="nombre" placeholder="NombreTemplate">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Contexto</label>
  <input type="text" class="form-control" id="contexto" placeholder="Contexto">
</div>
 <a href="#" class="btn btn-success" onclick = "crearTemplate()">Guardar Template</a>

<!--<label for="basic-url" class="form-label">Grupo</label>
<select class="form-select" size="3" aria-label="size 3 select example">
  <option selected>Open this select menu</option>
  <option value="1">One</option>
  <option value="2">Two</option>
  <option value="3">Three</option>
</select>-->

</body>
<script>
  function crearTemplate(){
      $.get( "/transactional/templateCreate", {
        name: $("#nombre").val(),
        contexto: $("#contexto").val()
      },function( data ) {})
  }
</script>
