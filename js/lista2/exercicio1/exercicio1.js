document.addEventListener("DOMContentLoaded", function(){
    var enviar = document.getElementById("enviar");

    enviar.addEventListener("click", function(){
        var valor_inicial = document.getElementById("valor_inicial").value;
        var valor_final = document.getElementById("valor_final").value;

        for(var i = valor_inicial; i <= valor_final; i++)
        {
            if(i % 2 != 0)
            {
                console.log(i);
            }    
        }    
    })
})