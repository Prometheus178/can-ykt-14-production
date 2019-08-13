function hide() {
    var numberOfRoom = document.getElementById('numberOfRoomsSearch');
    numberOfRoom.style.display = 'none';
}

function show() {
    var numberOfRoom = document.getElementById('numberOfRoomsSearch');
    numberOfRoom.style.display = 'inline-block';
}

function apartmentSelectHandler(select) {
    if (select.value == 'APARTMENT') {
        show();
    } else {
        hide();
    }
}

function hideCommercial() {
    var commercial = document.getElementById('commercialSearch');
    commercial.style.display = 'none';
}

function showCommercial() {
    var commercial = document.getElementById('commercialSearch');
    commercial.style.display = 'inline-block';
}

function livingSelected(select) {
    if (select.value == 'GARAGE' ||'ROOM' ||'HOUSE' ||'DACHA'||'STEAD'||'APARTMENT') {
        hideCommercial();
    } else {
        showCommercial();
    }
}



