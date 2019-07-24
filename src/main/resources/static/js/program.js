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
                                      <div class="d-flex justify-content-start"> LOCATION </div>
                                        <div  class="d-flex justify-content-around" id="location">  </div>
                                      <div class="d-flex justify-content-start"> ACTIVITY TYPE(S) </div>
                                        <div  class="d-flex justify-content-around" id="activityType">  </div>
                                      <div class="d-flex justify-content-start"> PRICE </div>
                                        <div  class="d-flex justify-content-around"  id="price">  </div>
                                      <div class="d-flex justify-content-start"> DATES </div>
                                          <div class="d-flex justify-content-around">STARTS: <span id="startDate"> </span> </div>
                                          <div class="d-flex justify-content-around">ENDS: <span id="endDate">  </span></div>
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
     price.innerHTML = jsonData.price + " HUF";
     startDate.innerHTML = jsonData.startDate;
     endDate.innerHTML = jsonData.endDate;

}