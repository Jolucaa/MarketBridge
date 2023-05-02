const connectionService = function connectionService(URL, responseOK, responseFail) {
    fetch(URL)
        .then(response => response.json())
        .then(data => {
            responseOK(JSON.stringify(data));
        }).catch((error) => {
        responseFail('There was an ERROR: ', error);
    }).finally((URL) => {
        console.log(URL + "finally");
    })
}