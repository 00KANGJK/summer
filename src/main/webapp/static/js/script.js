var map;

function initMap() {
    var hgu = { lat: 36.1022 ,lng: 129.3898 };
    map = new google.maps.Map( document.getElementById('map'), {
        zoom: 15,
        center: hgu
    });

    new google.maps.Marker({
        position: hgu,
        map: map,
        label: "한동대"
    });
}