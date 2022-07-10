window.addEventListener('load', function() {

    const formulario = document.querySelector('#add_new_paciente')

    formulario.addEventListener('submit', function() {

        const formData = {
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            domicilio: document.querySelector('#domicilio').value,
            dni: document.querySelector('#dni').value,
            fecha: document.querySelector('#fecha').value
        };

    const url = '/pacientes';
    const settings = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',

        },
        body: JSON.stringify(formData)
    }

    fetch(url, settings)
        .then(response => response.json())
        .then(data => {
            let successAlert = '<div class="alert alert-success alert-dismissible">' +
                '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                '<strong></strong> Paciente Agregado </div>'

            document.querySelector('#response').innerHTML = successAlert;
            document.querySelector('#response').style.display = "block";
            resetUploadForm();


        })
        .catch(error => {
            let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                '<strong></strong> Error intente nuevamente </div>'

            this.document.querySelector('#response').innerHTML = errorAlert;
            this.document.querySelector('#response').style.display = "block";
            resetUploadForm();
        })
    })
    function resetUploadForm() {
        document.querySelector('#nombre').value = "";
        document.querySelector('#apellido').value = "";
        document.querySelector('#domicilio').value = "";
        document.querySelector('#dni').value = "";
        document.querySelector('#fecha').value = "";
    }

    (function() {
        let pathname = window.location.pathname;
        if (pathname === "/") {
            document.querySelector(".boton-home a:first").addClass("active");
        }else if(pathname == "/altaPacientes.html"){
         document.querySelector(".boton-home a:last").addClass("active");
        }
    })

})