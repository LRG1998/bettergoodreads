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
            Search
        </h2>
        <div id = "user">
            <a href="./profile/">
            <img src="./images/default.png" alt="User Icon" id = "usericon">
            </a>
            <p id = "username">%Username%</p><br>
            <a href="#" id = "edit">Edit Info</a>
        </div>                
    </div>

    <div id = "topbar">
        <a id = "barnav" href="../about/">About</a>
        <a id = "barnav" href="#">Hover test</a>
        <input type="text" placeholder="Search...">
        <a href="search/"><button id="SearchButton">Ask the librarian</button></a>
    </div>
    <div id = 'resultfield'>
        Results
    </div>
</body>
<footer>
    <p>
        &copy 2023
    </p>
</footer>