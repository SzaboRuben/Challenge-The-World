window.onload = function () {
  fetchPrograms();
};


function fetchPrograms() {
    fetch("/programs")
    .then(function (response) {
        return response.json();
    })
    .then(function (jsonData) {
        listPrograms(jsonData);
    });
}

function listPrograms(jsonData) {
    var container = document.querySelector('#list-programs');
    container.innerHTML = "";
    for (var i = 0; i < jsonData.length; i++) {
        container.innerHTML +=
        `<div class="col-md-4">
            <div class="card mb-4 box-shadow">
                <div class="card-body">
                <p class="card-text surf medium">${jsonData[i].activityType} <img src='images/icons/${jsonData[i].activityType}.png'></p>
                <p class="card-text">${jsonData[i].location}</p>
                <div>
                    <a href='product.html?address=${jsonData[i].address}'>
                    <div class="btn-group">
                    <button type="button" class="btn btn-lm btn-outline-secondary">Details</button>
                    </div>
                </div>
                <small class="text-muted">${jsonData[i].price}<span> Ft</span></small>
            </div>
        </div>`;
    }
}