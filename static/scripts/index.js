    import { onMount } from "svelte";
let loggedin = false;

onMount(() => {
    let username = "";
    if(loggedin == false) {
        document.getElementById("login").hidden = false;
        document.getElementById("user").hidden = true;
    }
    else{
        document.getElementById("login").hidden = true;
        document.getElementById("user").hidden = false;
    }
    
});
function logout(){
    loggedin = false;
    document.getElementById("login").hidden = false;
    document.getElementById("user").hidden = true;
};
function login(username){
    let userinput = document.getElementById("userinput")
    let userpass = document.getElementById("pass")
    if(userinput.value != ""){
    username = userinput.value;
    document.getElementById("username").innerText = username;
    loggedin = true;
    document.getElementById("login").hidden = true;
    document.getElementById("user").hidden = false;
    userinput.style.border="none";
    userinput.value = "";
    userpass.value = "";
    } else{
        userinput.style.border="red 1px solid"
    }
};
