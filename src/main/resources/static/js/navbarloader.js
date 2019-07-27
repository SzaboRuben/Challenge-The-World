loadNavBarAsPerRole();


var defaultNavBar = defaultNavBar();

function loadNavBarAsPerRole() {

 fetch("/role")
    .then(function (response) {
        return response.json();
    })
    .then(function (json) {

        var UserDetails = geUserDetails();

            if(json.role === 'VISITOR'){
                    navBarForVisitor();
            }else if(json.role === 'ROLE_USER'){
                    navBarForUser(UserDetails);
            }else if(json.role === 'ROLE_ADMIN'){
                    navBarForAdmin(UserDetails);
                    }
        });

}

function geUserDetails() {
$.getJSON("/user", json => {
        return json;
 });
}


function navBarForVisitor(){
        var navbar = document.querySelector('#navbar');
        navbar.innerHTML = defaultNavBar();
}

function defaultNavBar(){
    return `
                <span class="navbar-brand">Challenge The World</span>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.html">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link disabled" href="#">Gallery</a>
                        </li>
                        <li class="nav-item dropdown"   >
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Admin
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Users</a>
                                <a class="dropdown-item" href="#">Programs</a>
                                <a class="dropdown-item" href="#">Applications</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Something else here</a>
                            </div>
                        </li>
                    </ul>
                    <table>
                        <tbody>
                        <tr>
                            <td><input class="form-control form-control-lg" type="text" id="username" name="username"
                                       placeholder="e-mail or username" autofocus/></td>
                            <td><input class="form-control form-control-lg" type="password" id="password" name="password"
                                       placeholder="password"/></td>
                            <td>
                                <button type="submit" class="btn btn-outline-warning btn-lg" id="login">Log In </button>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <a href="login.html">Create New Account</a>
                            </td>
                            <td></td>
                            <td></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                `;

}