<script>
    import '../../style/app.css'
</script>

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
            User Profile
        </h2>
            <a id = "user" href="#">
                <img src="./images/default.png" alt="User Icon" id = "usericon">
                <p id = "username">%Username%</p><br>
                <a href="#" id = "edit">Edit Info</a>
            </a>
    </div>
    <div id = "topbar">
        <a href="../about/">About</a>
        <a href="#">Hover test</a>
        <input type="text" placeholder="Search...">
        <button id="SearchButton">Ask the librarian</button>
    </div>

</body>