$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/fileInfo.feature");
formatter.feature({
  "line": 1,
  "name": "To get the file information",
  "description": "",
  "id": "to-get-the-file-information",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To display file names",
  "description": "",
  "id": "to-get-the-file-information;to-display-file-names",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test01"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Directory contains list of files",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I retrieve files names information",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.directoryContainsListOfFiles()"
});
formatter.result({
  "duration": 169673242,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iRetrieveFilesNamesInformation()"
});
formatter.result({
  "duration": 1873065,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "To display file Mimetypes",
  "description": "",
  "id": "to-get-the-file-information;to-display-file-mimetypes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Test01"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Directory contains list of files",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I retrieve files mime information",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.directoryContainsListOfFiles()"
});
formatter.result({
  "duration": 201386,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iRetrieveFilesMimeInformation()"
});
formatter.result({
  "duration": 33818425,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To display file extensions",
  "description": "",
  "id": "to-get-the-file-information;to-display-file-extensions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Test01"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Directory contains list of files",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I retrieve files extensions information",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.directoryContainsListOfFiles()"
});
formatter.result({
  "duration": 43094,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iRetrieveFilesExtensionsInformation()"
});
formatter.result({
  "duration": 573439,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To display file size",
  "description": "",
  "id": "to-get-the-file-information;to-display-file-size",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Test01"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "Directory contains list of files",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I retrieve files size information",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.directoryContainsListOfFiles()"
});
formatter.result({
  "duration": 53760,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iRetrieveFilesSizeInformation()"
});
formatter.result({
  "duration": 4606290,
  "status": "passed"
});
formatter.uri("features/vehicleregistrationcheck.feature");
formatter.feature({
  "line": 1,
  "name": "Vehicle Registration check",
  "description": "As a User\r\nI can check my vehicle registration details on gov.uk website.",
  "id": "vehicle-registration-check",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Check the vehicle registration details",
  "description": "",
  "id": "vehicle-registration-check;check-the-vehicle-registration-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Test01"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "govuk website and I launch it",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on start button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be on the \"Check if a vehicle is taxed and has an MOT\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I enter registration number and I click on continue button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be on the \"Check if a vehicle is taxed and has an MOT\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I validate Vehicle details and I click on continue button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should be on the \"Check if a vehicle is taxed and has an MOT\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I validate Vehicle details",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.govukWebsiteAndILaunchIt()"
});
formatter.result({
  "duration": 9441657649,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iClickOnStartButton()"
});
formatter.result({
  "duration": 123821121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check if a vehicle is taxed and has an MOT",
      "offset": 20
    }
  ],
  "location": "Stepdefs.iShouldBeOnThePage(String)"
});
formatter.result({
  "duration": 4188583,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iEnterRegistrationNumberAndIClickOnContinueButton()"
});
formatter.result({
  "duration": 8106315429,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check if a vehicle is taxed and has an MOT",
      "offset": 20
    }
  ],
  "location": "Stepdefs.iShouldBeOnThePage(String)"
});
formatter.result({
  "duration": 99413,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iValidateVehicleDetailsAndIClickOnContinueButton()"
});
formatter.result({
  "duration": 232487908,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check if a vehicle is taxed and has an MOT",
      "offset": 20
    }
  ],
  "location": "Stepdefs.iShouldBeOnThePage(String)"
});
formatter.result({
  "duration": 903679,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iValidateVehicleDetails()"
});
formatter.result({
  "duration": 520491929,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.iCloseTheBrowser()"
});
formatter.result({
  "duration": 4455601104,
  "status": "passed"
});
});