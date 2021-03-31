/*
let div = document.querySelector("#app");
let btn = document.querySelector("#btn");

btn.onclick = function(){

    div.innerHTML="";

    let spanNone = document.createElement('span');

    let txtNome="";

    let github_user = document.querySelector('input[name=github_user]').value;
    axios.get(`https://api.github.com/users/${github_user}`)
        .then(function(response){
            if(response.data !== null){
                txtNome = document.createTextNode(response.data.name);

                let img = document.createElement('img');
                img.setAttribute('src', response.data.avatar_url);
                img.setAttribute('alt', response.data.nome);
                img.setAttribute('width', '45px');
                img.setAttribute('height', '45px');

                div.appendChild(img);
            }else{
                txtNome = document.createTextNode("O usuário não foi encontrado!")
            }
            spanNone.appendChild(txtNome);
            div.appendChild(spanNone);
        })
        .catch(function(error){

        })
}

*/

const options = {
    method: 'POST',
    mode: 'cors',
    cache: 'default'
}

let bton = document.querySelector("#bton");

bton.onclick = function(){
    axios.post('http://localhost:8080/artista', options, {
        nomeArtista: 'Gilberto Gil',
        generoMusical: 'MPB'
      })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });
}



  








