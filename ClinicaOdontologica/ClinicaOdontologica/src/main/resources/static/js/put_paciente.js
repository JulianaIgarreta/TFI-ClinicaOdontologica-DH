window.addEventListener('load', function() {

    const formulario = document.querySelector('#update_pacientes_form');
    formulario.addEventListener('submit', function (event){

          const formData = {
                    id: document.querySelector('#paciente_id').value,
                    nombre: document.querySelector('#nombre').value,
                    apellido: document.querySelector('#apellido').value,
                    domicilio: document.querySelector('#domicilio').value,
                    dni: document.querySelector('#dni').value,
                    fecha: document.querySelector('#fecha').value
          };

          const url='/pacientes';
            const settings ={
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
          }
          fetch(url, settings)
          .then(response => response.json())
    })
})

    function findBy(id){
            const url='/pacientes' + "/" + id;
            const settings={
                method:'GET'
            }
            fetch(url,settings)
            .then(response => response.json())
            .then(data => {
                let paciente = data;
                document.querySelector('#paciente_id').value = paciente.id;
                document.querySelector('#nombre').value = paciente.nombre
                document.querySelector('#apellido').value = paciente.apellido

                document.querySelector('#div_paciente_updating').style.display = "block";

            }).catch(error => {
                 alert("Error: " + error);
            })

    }


