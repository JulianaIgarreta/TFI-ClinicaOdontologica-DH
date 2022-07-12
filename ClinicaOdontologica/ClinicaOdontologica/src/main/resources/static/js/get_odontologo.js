window.addEventListener('load', function() {

    (function(){
        const url='/odontologos';
        const settings = {
            method: 'GET',
            headers: {
                        "Access-Control-Allow-Origin": "*",
            }
        }
        fetch(url, settings)
        .then(response => response.json())
        .then(data => {
            for(odontologo of data){
                var table = document.getElementById("odontologosTable");
                var odontologoRow = table.insertRow();
                let tr_id = 'tr_' + odontologo.id;
                odontologoRow.id = tr_id;

                let deleteButton = '<button' +
                                        'id=' + '\"' + 'btn_delete_' + odontologo.id + '\"' +
                                        'type = "button" onclick="deleteBy('+odontologo.id+')" class="btn">'+
                                        '&times'+
                                        '</button>';
                let updateButton = '<button' +
                                            'id=' + '\"' + 'btn_id_' + odontologo.id + '\"' +
                                            'type = "button" onclick="findBy('+odontologo.id+')" class="btn">' +
                                            odontologo.id+
                                            '</button>';

                odontologoRow.innerHTML = '<td>' + updateButton + '</td>' +
                                   '<td class=\"td_first_name\">' + odontologo.nombre.toUpperCase() + '</td>' +
                                   '<td class=\"td_last_name\">' + odontologo.apellido.toUpperCase() +'</td>'+
                                   '<td class=\"td_matricula\">' + odontologo.matricula +'</td>'+
                                    '<td>' + deleteButton + '</td>'

            };
        })
    })

    (function() {
            let pathname = window.location.pathname;
            if(pathname == "/listadoOdontologos.html"){
             document.querySelector(".boton-home a:last").addClass("active");
            }
       });

})
