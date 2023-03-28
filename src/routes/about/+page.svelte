<script>
    import '../../style/app.css'
</script>


<head>
	<meta charset="utf-8" />
    <link rel="icon" href="%sveltekit.assets%/favicon.png" />
    <link rel = "stylesheet" href="style/app.css">
    <meta name="viewport" content="width=device-width" />
</head>

<body data-sveltekit-preload-data = "hover">
    <div id="header">
        <a id="title" href="../">
            <img src = "./images/logo.png" alt="logo" id="logo">
        </a>
        <h2>
            About
        </h2>
        <a id = "user" href="../profile">
            <img src="./images/default.png" alt="User Icon" id = "usericon">
            <p id = "username">%Username%</p><br>
            <a href="#" id = "edit">Edit Info</a>
        </a>
    </div>
    <div id = "topbar">
        <a href="../about/" id = "active">About</a>
        <a href="#">Hover test</a>
        <input type="text" placeholder="Search...">
        <button id="SearchButton">Ask the librarian</button>
    </div>
    <div id = "body">
        <p>
            The Librarian is an alternative to goodreads which was built on the idea of providing a better alternative to that platform. <br>
            The page as of writing is still under construction.
        </p>
    </div>
</body>