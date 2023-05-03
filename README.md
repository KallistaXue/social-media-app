# Social Media Application
## Introduction 
This is a social media app where users can connect, share, and engage with the world. 
Functions includes:
- Register user account and create user profile
- Log in to user account
- Post (create/update/display/delete)
- Comment
- Like

## API (Application Programming Interface)
API documentation for the social media app, including resources and endpoints design 

### Resources 
- Users
- Posts
- Comments
- Likes

### Endpoints

#### Users

##### 1. Create a user
POST  {{base_url}}/users/user-register

###### Query Parameters
| Name          | Type   | Description                      | Required |
|---------------|--------|----------------------------------|----------|
| username      | string | The unique username of the user. | Yes      |
| first name    | string | The first name of the user.      | Yes      |
| last name     | string | The last name of the user.       | Yes      |
| email         | string | The email address of the user.   | Yes      |
| password      | string | The password of the user.        | Yes      |
| date of birth | string | format: month-date-year.         | No       |

##### 2. Log in to user account
POST  {{base_url}}/users/user-login

###### Query Parameters
| Name          | Type   | Description                      | Required |
|---------------|--------|----------------------------------|----------|
| username      | string | The username of the user.        | Yes      |
| password      | string | The password of the user.        | Yes      |

##### 3. Get user information (eg. display user information on a profile page)
GET  {{base_url}}/users/user-info/{user_id}

###### Path Variables
| Name    | Type | Description          | Required |
|---------|------|----------------------|----------|
| user_id | int  | The ID of the user.  | Yes      |

##### 4. Update user information (can apply partial updates)
PATCH  {{base_url}}/users/user-update/{user_id}

###### Path Variables
| Name    | Type | Description          | Required |
|---------|------|----------------------|----------|
| user_id | int  | The ID of the user.  | Yes      |

###### Query Parameters
| Name          | Type   | Description                      | Required |
|---------------|--------|----------------------------------|----------|
| username      | string | The unique username of the user. | No       |
| first name    | string | The first name of the user.      | No       |
| last name     | string | The last name of the user.       | No       |
| email         | string | The email address of the user.   | No       |
| password      | string | The password of the user.        | No       |
| date of birth | string | format: month-date-year.         | No       |

##### 5. Delete a user
DELETE  {{base_url}}/users/user-delete/{user_id}

###### Path Variables
| Name    | Type | Description          | Required |
|---------|------|----------------------|----------|
| user_id | int  | The ID of the user.  | Yes      |