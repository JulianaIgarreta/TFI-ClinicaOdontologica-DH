window.addEventListener('load', function() {

    (function(){
        const url='/pacientes';
        const settings = {
            method: 'GET',
            headers: {
                        "Access-Control-Allow-Origin": "*",
            }
        }
        fetch(url, settings)
        .then(response => response.json())
        .then(data => {
            for(paciente of data){
                var table = document.getElementById("pacientesTable");
                var pacienteRow = table.insertRow();
                let tr_id = 'tr_' + paciente.id;
                pacienteRow.id = tr_id;

                let deleteButton = '<button' +
                                        'id=' + '\"' + 'btn_delete_' + paciente.id + '\"' +
                                        'type = "button" onclick="deleteBy('+paciente.id+')" class="boton_listar">'+
                                        '&times'+
                                        '</button>';
                let updateButton = '<button' +
                                            'id=' + '\"' + 'btn_id_' + paciente.id + '\"' +
                                            'type = "button" onclick="findBy('+paciente.id+')" class="btn">' +
                                            paciente.id +
                                            '</button>';

                pacienteRow.innerHTML = '<td>' + updateButton + '</td>' +
                                   '<td class=\"td_first_name\">' + paciente.nombre.toUpperCase() + '</td>' +
                                   '<td class=\"td_last_name\">' + paciente.apellido.toUpperCase() +'</td>'+
                                   '<td class=\"td_last_name\">' + paciente.domicilio.toUpperCase() +'</td>'+
                                   '<td class=\"td_last_name\">' + paciente.dni.toUpperCase() +'</td>'+
                                   '<td class=\"td_last_name\">' + paciente.fecha +'</td>'+
                                    '<td>' + deleteButton + '</td>'

            };
        })
    })

    (function() {
            let pathname = window.location.pathname;
            if(pathname == "/listadoPacientes.html"){
             document.querySelector(".boton-home a:last").addClass("active");
            }
       });

})
