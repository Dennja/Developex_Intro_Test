# Developex Test Task

## Test Plan
###Test Case 1 "registration page all valid data"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the form with valid data.
3- Click on the 'Submit' button.
ER: Registration is successful.

### Test Case 2 "registration page 'All fields are required to fill' test"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Click on the 'Submit' button.
3- Check presence of every error under the form fields (Exept 'Confirm password')
ER: Error messages appears under 'Email address,First name,Last name,Password,Phone,Organization name' field.

### Test Case 3
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the 'Emaill adress' field with numbers,symbols,letters only (in 3 registrations process, separately)
3- Fill the remaining fields with valid data.
4- Click on the 'Submit' button.
ER: Error message is appear under the 'Emaill adress' field.



## Test report
### TestCase 1
AR: passed
### TestCase 2
AR: