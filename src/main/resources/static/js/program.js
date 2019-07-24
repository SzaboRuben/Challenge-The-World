window.onload = function () {
  fetchProgram();
};

function fetchProgram() {
  var address = (new URL(document.location)).searchParams.get('address');
  console.log(address);
  var url = '/programs/' + address;

  fetch(url)
    .then(function (response) {
      return response.json();
    })
    .then(function (jsonData) {
        showProgram(jsonData);
    });
  return false;
}


function showProgram(jsonData) {
  console.log(jsonData);


  var container = document.querySelector('#program');

     container.innerHTML =
                                  `<div>
                                      <div>
                                      <button type="button" class="btn btn-info">REQUEST INFO</button>
                                      <button type="button" class="btn btn-primary">APPLY NOW!</button>
                                      </div>
                                      <div> LOCATION </div>
                                        <div id="location">  </div>
                                      <div> ACTIVITY TYPE(S) </div>
                                        <div id="activityType">  </div>
                                      <div> PRICE </div>
                                        <div id="price">  </div>
                                      <div> DATES </div>
                                          <div>FROM: <span id="startDate">  <span> TO: <span id="endDate">  <span></div>
                                  </div>

                                  <div>

                                  </div>`



     ;
     var location = document.getElementById('location');
     var activityType = document.getElementById('activityType');
     var price = document.getElementById('price');
     var startDate = document.getElementById('startDate');
     var endDate = document.getElementById('endDate');


     location.innerHTML = jsonData.location;
     activityType.innerHTML = jsonData.activityType;
     price.innerHTML = jsonData.price;
     startDate.innerHTML = jsonData.startDate;
     endDate.innerHTML = jsonData.endDate;

}