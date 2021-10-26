$(document).ready(function () {
    $("#createProduct").submit(function (event) {
        event.preventDefault();
        var name = $("#name").val();
        var price = $("#price").val();
        var description = $("#description").val();
        var product = {
            name: name,
            price: price,
            description: description
        };
        $.ajax({
            url: "/products",
            type: "POST",
            data: JSON.stringify(product),
            headers: {
                "Accept": "application/json",
                "Content-type": "application/json"
            },
            success: function (result) {
                $("#modalCreateProduct").hide();
                alert("id = " +  result.id + " name = " + result.name);
            }
        });
    })
});