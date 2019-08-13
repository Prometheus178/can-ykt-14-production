function hideRentTypePost() {
    var rentType = document.getElementById('rentTypePost');
    rentType.style.display = 'none';
}

function showRentTypePost() {
    var rentType = document.getElementById('rentTypePost');
    rentType.style.display = 'inline-block';
}
function rentTypeSelectHandlerPost(select) {
    if (select.value == 'RENT') {
        showRentTypePost();
    } else {
        hideRentTypePost();
    }
}

function showLivingPost() {

    var numberOfRooms = document.getElementById('numberOfRoomsPost');
    numberOfRooms.style.display = 'inline-block';
    var buildingType = document.getElementById('buildingTypePost');
    buildingType.style.display = 'inline-block';
    var repairs = document.getElementById('repairsPost');
    repairs.style.display = 'inline-block';
    var additionLivingPost = document.getElementById('additionLivingPost');
    additionLivingPost.style.display = 'inline-block';
}

function hideLivingPost() {

    var numberOfRooms = document.getElementById('numberOfRoomsPost');
    numberOfRooms.style.display = 'none';
    var buildingType = document.getElementById('buildingTypePost');
    buildingType.style.display = 'none';
    var repairs = document.getElementById('repairsPost');
    repairs.style.display = 'none';
    var additionLivingPost = document.getElementById('additionLivingPost');
    additionLivingPost.style.display = 'none';
}

function realEstateLivingTypeSelectHandlerPost(select) {
    if (select.value != 'COMMERCIAL'){
        showLivingPost();
    }else {
        hideLivingPost();
    }
}

