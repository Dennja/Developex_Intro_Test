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
3- Check presence of every error under the form fields (Except 'Confirm password')
ER: Error messages appears under 'Email address,First name,Last name,Password,Phone,Organization name' field.

### Test Case 3 "registration page 'Email address' field"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the 'Email address' field with numbers,symbols,letters only (in 3 registrations process, separately)
3- Fill the remaining fields with valid data.
4- Click on the 'Submit' button.
ER: Error message is appear under the 'Email address' field.

### Test Case 4 "registration page 'First name' field"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the 'First name' field with lower register letters,symbols,numbers,40 letters (in 4 registrations process, separately)
3- Fill the remaining fields with valid data.
4- Click on the 'Submit' button.
ER: Error message is appear under the 'First name' field.

### Test Case 5 "registration page 'Last name' field"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the 'Last name' field with lower register letters,symbols,numbers,20 letters (in 4 registrations process, separately)
3- Fill the remaining fields with valid data.
4- Click on the 'Submit' button.
ER: Error message is appear under the 'Last name' field.

### Test Case 6 "registration page 'Password' strength recognition"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the 'Password' and 'Password confirmation' fields with data (separately).
2.1) > 10 characters, numbers and special characters
2.2) < 6 characters
2.3) > 6 < 10 characters and numbers
2.4) 11 letters in lower register
2.5) 11 numbers
3- Check the message that is appear under the 'Password' field.
ER:
2.1) recognized as 'Strong' password
2.2) recognized as 'Weak' password
2.3) recognized as 'Normal' password
2.4) recognized as 'Weak' password
2.5) recognized as 'Weak' password

### Test Case 7 "registration page 'Phone' field"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the 'Phone' field with 11 numbers,10 numbers,letters,symbols (in 4 registrations process, separately)
3- Fill the remaining fields with valid data.
4- Click on the 'Submit' button.
ER: Error message is appear under the 'Phone' field.

### Test Case 8 "registration page 'Organisation' field"
Steps:
1- Go to https://reverent-aryabhata-11cf33.netlify.com/ page.
2- Fill the 'Organisation' field with symbols, numbers (in 2 registrations process, separately)
3- Fill the remaining fields with valid data.
4- Click on the 'Submit' button.
ER: Error message is appear under the 'Organization' field.


## Test report

### TestCase 1
AR: Registration is successful
passed
### TestCase 2
AR: Error messages appears under 'Email address,First name,Last name,Password,Phone,Organization name' field.
passed
### TestCase 3
AR: Error message is not appears under the 'Email address' field.
passed
### TestCase 4
AR: Error message is not appears under the 'First name' field.
passed
### TestCase 5
AR: Error message is not appears under the 'Last name' field.
passed
### TestCase 6
AR: Any password (Except empty) recognized as 'weak'
passed
### TestCase 7
AR: Error message is not appears under the 'Phone' field.
passed
### TestCase 8
AR: Error message is not appears under the 'Organisation' field.
passed