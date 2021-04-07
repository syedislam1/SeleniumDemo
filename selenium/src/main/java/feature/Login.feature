Feature: Login PAge
Scenario: Compose  Email Demo 
	Given user is on Gmail Login Page 
	Then Login with valid gmail account 
	And Click on Compose mail 
	Then Verify that on clicking Compose button a frame to compose a mail gets displayed 
	Then Verify that the user can type Subject line in the Subject textbox 
	Then Verify that the user can type the email in the email-body section 
	Then click on send 
#	Then Verify that sent mails can be found in Sent Mail sections of the sender