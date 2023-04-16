<script>
    import Books from '../books.svelte'
    import { onMount } from "svelte";
    let loggedin = false;

onMount(() => {
    // @ts-ignore
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
    // @ts-ignore
    if(userinput.value != ""){
    // @ts-ignore
    username = userinput.value;
    document.getElementById("username").innerText = username;
    loggedin = true;
    document.getElementById("login").hidden = true;
    document.getElementById("user").hidden = false;
    userinput.style.border="none";
    // @ts-ignore
    userinput.value = "";
    // @ts-ignore
    userpass.value = "";
    } else{
        userinput.style.border="red 1px solid"
    }
};

</script>
<main>
    <Books />
</main>
<head>
	<meta charset="utf-8" />
    <link rel="icon" href="%sveltekit.assets%/favicon.png" />
    <link rel = "stylesheet" href="style/app.css">
    <meta name="viewport" content="width=device-width" />
</head>
<body data-sveltekit-preload-data="hover">
    
    <div id="header">
        <a id="title" href="./">
            <img src = "./images/logo.png" alt="logo" id="logo">
        </a>
        <h2>
            Home
        </h2>
        <div id = "login">
            <p>Username: <input id = "userinput" type="text" placeholder="Enter username"></p>
            <p>Password: <input id="pass" type = "password"></p>
            <button type="submit"on:click={()=>login()}>Log in</button>
        </div>
        <div id = "user">
            <a href="./profile/">
            <img src="./images/default.png" alt="User Icon" id = "usericon">
            </a>
            <p id = "username">%Username%</p>
            <a href="#" id = "edit">Edit Info</a>
            <button type="submit" on:click={()=>logout()}>Log off</button>
        </div>                
    </div>
    <div id = "topbar">
        <a id = "barnav" href="../about/">About</a>
        <input type="text" placeholder="Search...">
        <a href="search/"><button id="SearchButton">Ask the librarian</button></a>
    </div>
    <div id= "content">
    <a id="recommended" href="#">
        <img src="images/Carrie.jpg">
        <p id = "title">
            Carrie
        </p>
        <p id = "author">
            Stephen King
        </p>
    </a>
    <a id="recommended" href = "#">
        <img src="images/Digital_Fortress.jpg">
        <p id = "title">
            Digital Fortress
        </p>
        <p id = "author">
            Dan Brown
        </p>
    </a>
    <a id="recommended" href="#">
        <img src="images/Jam.jpg">
        <p id = "title">
            Jam
        </p>
        <p id = "author">
            Yahtzee Croshaw
        </p>
    </a>
</div>
    </body>
    <footer>
        <p>
            &copy 2023
        </p>
    </footer>
