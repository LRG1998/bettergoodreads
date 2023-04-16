import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5173/')

WebUI.setText(findTestObject('Object Repository/Page_/input_Home_userinput'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Home_pass'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Page_/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/p_John Doe'), 0)

WebUI.click(findTestObject('Object Repository/Page_/button_Log off'))

WebUI.closeBrowser()

/* 

Sample text from console when run:

2023-04-15 19:55:12.112 INFO  c.k.katalon.core.main.TestCaseExecutor   - --------------------
2023-04-15 19:55:12.119 INFO  c.k.katalon.core.main.TestCaseExecutor   - START Test Cases/Login Test
2023-04-15 19:55:13.240 DEBUG testcase.Login Test                      - 1: openBrowser("")
2023-04-15 19:55:13.945 INFO  c.k.k.core.webui.driver.DriverFactory    - Starting 'Firefox' driver
Apr 15, 2023 7:55:13 PM org.openqa.selenium.remote.DesiredCapabilities firefox
INFO: Using `new FirefoxOptions()` is preferred to `DesiredCapabilities.firefox()`
2023-04-15 19:55:14.167 INFO  c.k.k.core.webui.driver.DriverFactory    - Action delay is set to 0 milliseconds
1681606515430	geckodriver	INFO	Listening on 127.0.0.1:35443
1681606516410	mozrunner::runner	INFO	Running command: "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe" "--marionette" "-no-remote" "-profile" "C:\\Users\\shock\\AppData\\Local\\Temp\\rust_mozprofileqnhgtP"
console.warn: services.settings: Ignoring preference override of remote settings server
console.warn: services.settings: Allow by setting MOZ_REMOTE_SETTINGS_DEVTOOLS=1 in the environment
1681606517071	Marionette	INFO	Marionette enabled
Dynamically enable window occlusion 0
1681606517079	Marionette	INFO	Listening on port 47707
Read port: 47707
1681606517383	RemoteAgent	WARN	TLS certificate errors will be ignored for this session
1681606517387	RemoteAgent	INFO	Proxy settings initialised: {"proxyType":"direct"}
console.warn: SearchSettings: "get: No settings file exists, new profile?" (new NotFoundError("Could not open the file at C:\\Users\\shock\\AppData\\Local\\Temp\\rust_mozprofileqnhgtP\\search.json.mozlz4", (void 0)))
Apr 15, 2023 7:55:20 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
2023-04-15 19:55:20.483 INFO  c.k.k.core.webui.driver.DriverFactory    - sessionId = c1117127-6788-4f22-9c86-f6cf9cd64aea
2023-04-15 19:55:20.564 INFO  c.k.k.core.webui.driver.DriverFactory    - browser = Firefox 111.0
2023-04-15 19:55:20.565 INFO  c.k.k.core.webui.driver.DriverFactory    - platform = Windows 10
2023-04-15 19:55:20.566 INFO  c.k.k.core.webui.driver.DriverFactory    - seleniumVersion = 3.141.59
2023-04-15 19:55:20.571 INFO  c.k.k.core.webui.driver.DriverFactory    - proxyInformation = ProxyInformation { proxyOption=NO_PROXY, proxyServerType=HTTP, username=, password=********, proxyServerAddress=, proxyServerPort=0, executionList="", isApplyToDesiredCapabilities=true }
2023-04-15 19:55:20.669 DEBUG testcase.Login Test                      - 2: navigateToUrl("http://localhost:5173/")
2023-04-15 19:55:23.690 DEBUG testcase.Login Test                      - 3: setText(findTestObject("Object Repository/Page_/input_Home_userinput"), "John Doe")
console.warn: LoginRecipes: "Falling back to a synchronous message for: http://localhost:5173."
2023-04-15 19:55:24.999 DEBUG testcase.Login Test                      - 4: setEncryptedText(findTestObject("Object Repository/Page_/input_Home_pass"), "4nvbrPglk7k=")
2023-04-15 19:55:25.752 DEBUG testcase.Login Test                      - 5: click(findTestObject("Object Repository/Page_/button_Log in"))
2023-04-15 19:55:26.518 DEBUG testcase.Login Test                      - 6: verifyElementPresent(findTestObject("Object Repository/Page_/p_John Doe"), 0)
2023-04-15 19:55:26.673 WARN  c.kms.katalon.core.helper.KeywordHelper  - Timeout '0' is invalid. Using default page load timeout: '30'
2023-04-15 19:55:26.951 DEBUG testcase.Login Test                      - 7: click(findTestObject("Object Repository/Page_/button_Log off"))
2023-04-15 19:55:27.584 DEBUG testcase.Login Test                      - 8: closeBrowser()
1681606527626	Marionette	INFO	Stopped listening on port 47707
Dynamically enable window occlusion 1
WARNING: A blocker encountered an error while we were waiting.
          Blocker:  Waiting for ping task
          Phase: TelemetryController: Waiting for pending ping activity
          State: (none)
WARNING: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
WARNING: addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:727:15
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:523:26
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:458:15
setupShutdown@resource://gre/modules/osfile/osfile_async_front.jsm:1548:28
@resource://gre/modules/osfile/osfile_async_front.jsm:1568:16
@resource://gre/modules/osfile.jsm:12:30
@resource://gre/modules/TelemetryStorage.sys.mjs:10:28
_checkPendingPings@resource://gre/modules/TelemetrySend.sys.mjs:863:17
setup@resource://gre/modules/TelemetrySend.sys.mjs:803:18
setup@resource://gre/modules/TelemetrySend.sys.mjs:241:30
setupTelemetry/this._delayedInitTask<@resource://gre/modules/TelemetryControllerParent.sys.mjs:828:36
observe@resource://gre/modules/AsyncShutdown.sys.mjs:576:16

console.error: "TelemetryScheduler.shutdown - Already shut down"
WARNING: A blocker encountered an error while we were waiting.
          Blocker:  Waiting for ping task
          Phase: TelemetryController: Waiting for pending ping activity
          State: (none)
WARNING: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
WARNING: addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:727:15
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:523:26
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:458:15
setupShutdown@resource://gre/modules/osfile/osfile_async_front.jsm:1548:28
@resource://gre/modules/osfile/osfile_async_front.jsm:1568:16
@resource://gre/modules/osfile.jsm:12:30
@resource://gre/modules/TelemetryStorage.sys.mjs:10:28
_checkPendingPings@resource://gre/modules/TelemetrySend.sys.mjs:863:17
setup@resource://gre/modules/TelemetrySend.sys.mjs:803:18
setup@resource://gre/modules/TelemetrySend.sys.mjs:241:30
setupTelemetry/this._delayedInitTask<@resource://gre/modules/TelemetryControllerParent.sys.mjs:828:36
observe@resource://gre/modules/AsyncShutdown.sys.mjs:576:16

WARNING: A blocker encountered an error while we were waiting.
          Blocker:  Waiting for ping task
          Phase: TelemetryController: Waiting for pending ping activity
          State: (none)
WARNING: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
WARNING: addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:727:15
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:523:26
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:458:15
setupShutdown@resource://gre/modules/osfile/osfile_async_front.jsm:1548:28
@resource://gre/modules/osfile/osfile_async_front.jsm:1568:16
@resource://gre/modules/osfile.jsm:12:30
@resource://gre/modules/TelemetryStorage.sys.mjs:10:28
_checkPendingPings@resource://gre/modules/TelemetrySend.sys.mjs:863:17
setup@resource://gre/modules/TelemetrySend.sys.mjs:803:18
setup@resource://gre/modules/TelemetrySend.sys.mjs:241:30
setupTelemetry/this._delayedInitTask<@resource://gre/modules/TelemetryControllerParent.sys.mjs:828:36
observe@resource://gre/modules/AsyncShutdown.sys.mjs:576:16

WARNING: A blocker encountered an error while we were waiting.
          Blocker:  TelemetryController: shutting down
          Phase: profile-before-change-telemetry
          State: Error getting state: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange" at addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:727:15
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:523:26
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:458:15
setupShutdown@resource://gre/modules/osfile/osfile_async_front.jsm:1548:28
@resource://gre/modules/osfile/osfile_async_front.jsm:1568:16
@resource://gre/modules/osfile.jsm:12:30
@resource://gre/modules/TelemetryStorage.sys.mjs:10:28
_checkPendingPings@resource://gre/modules/TelemetrySend.sys.mjs:863:17
setup@resource://gre/modules/TelemetrySend.sys.mjs:803:18
setup@resource://gre/modules/TelemetrySend.sys.mjs:241:30
setupTelemetry/this._delayedInitTask<@resource://gre/modules/TelemetryControllerParent.sys.mjs:828:36
observe@resource://gre/modules/AsyncShutdown.sys.mjs:576:16

WARNING: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
WARNING: addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:727:15
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:523:26
addBlocker@resource://gre/modules/AsyncShutdown.sys.mjs:458:15
setupShutdown@resource://gre/modules/osfile/osfile_async_front.jsm:1548:28
@resource://gre/modules/osfile/osfile_async_front.jsm:1568:16
@resource://gre/modules/osfile.jsm:12:30
@resource://gre/modules/TelemetryStorage.sys.mjs:10:28
_checkPendingPings@resource://gre/modules/TelemetrySend.sys.mjs:863:17
setup@resource://gre/modules/TelemetrySend.sys.mjs:803:18
setup@resource://gre/modules/TelemetrySend.sys.mjs:241:30
setupTelemetry/this._delayedInitTask<@resource://gre/modules/TelemetryControllerParent.sys.mjs:828:36
observe@resource://gre/modules/AsyncShutdown.sys.mjs:576:16

JavaScript error: resource://gre/modules/AsyncShutdown.sys.mjs, line 727: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
JavaScript error: resource://gre/modules/AsyncShutdown.sys.mjs, line 727: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
JavaScript error: resource://gre/modules/AsyncShutdown.sys.mjs, line 727: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
JavaScript error: resource://gre/modules/AsyncShutdown.sys.mjs, line 727: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
JavaScript error: resource://gre/modules/AsyncShutdown.sys.mjs, line 727: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
JavaScript error: resource://gre/modules/AsyncShutdown.sys.mjs, line 727: Error: Phase "profile-before-change" is finished, it is too late to register completion condition "OS.File: flush I/O queued before profileBeforeChange"
2023-04-15 19:55:28.934 INFO  c.k.katalon.core.main.TestCaseExecutor   - END Test Cases/Login Test

/*
