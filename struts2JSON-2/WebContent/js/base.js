function sendJSONData() {

//	var dataObj = {
//		"data" : [ {
//			"active" : "true",
//			"color" : "orange",
//			"date" : "2008-01-01",
//			"id" : "1",
//			"name" : "Chris"
//		} ],
//		"data" : [ {
//			"active" : "true",
//			"color" : "orange",
//			"date" : "2008-01-01",
//			"id" : "1",
//			"name" : "Chris"
//		} ],
//		"data" : [ {
//			"active" : "true",
//			"color" : "orange",
//			"date" : "2008-01-01",
//			"id" : "1",
//			"name" : "Chris"
//		} ],
//		"data" : [ {
//			"active" : "true",
//			"color" : "orange",
//			"date" : "2008-01-01",
//			"id" : "1",
//			"name" : "Chris"
//		} ]
//	};
	var dataObj = {"data":"5"};
	
	
	var target = new Object();
	target.campaignId = "5";
	target.staffGroup = [{"id":"1","name":"HN-CL"},{"id":"2","name":"HCM-CL"},{"id":"3","name":"DN-CL"}];
	target.criteriaList = [{"id":"4","name":"CORE"},{"id":"5","name":"COMBO_OPTION"}];
	target.detail = {"1":[{"id":"4","quantity":"100"},{"id":"5","quantity":"1000"}],"2":[{"id":"4","quantity":"400"},{"id":"5","quantity":"5000"}],"3":[{"id":"4","quantity":"100"},{"id":"5","quantity":"7000"}]};

	var data1 = JSON.stringify(dataObj);
	var data2 = JSON.stringify(target);
	console.log(data2);
	$.ajax({
		url : "writeJSON.action",
		data : data2,
		dataType : 'json',
		contentType : 'application/json',
		type : 'POST',
		async : true,
		success : function(res) {
//			console.log(res.data.length);
//			for(var i=0; i<res.data.length;i++){
//				console.log(" "+res.data[i].name+"-"+res.data[i].id+"-"+res.data[i].active+"-"+res.data[i].date);
//			}
		}
	});

	console.log("Quit Method ");
}


function getJSONData() {
	console.log("Read JSON Data");
//	$.getJSON("readJSON.action", function(res) {
//		console.log(res.data.length);
//		for(var i=0; i<res.data.length;i++){
//			console.log(" "+res.data[i].name+"-"+res.data[i].id+"-"+res.data[i].active+"-"+res.data[i].date);
//		}
//	});
	console.log("Method Over");

}